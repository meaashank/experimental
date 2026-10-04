package com.android.launcher3.folder;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.android.launcher3.Alarm;
import com.android.launcher3.AppInfo;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.CellLayout;
import com.android.launcher3.CheckLongPressHelper;
import com.android.launcher3.DeviceProfile;
import com.android.launcher3.DropTarget;
import com.android.launcher3.FolderInfo;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.OnAlarmListener;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.SimpleOnStylusPressListener;
import com.android.launcher3.StylusEventHelper;
import com.android.launcher3.Workspace;
import com.android.launcher3.anim.Interpolators;
import com.android.launcher3.badge.BadgeRenderer;
import com.android.launcher3.badge.FolderBadgeInfo;
import com.android.launcher3.dragndrop.BaseItemDragListener;
import com.android.launcher3.dragndrop.DragLayer;
import com.android.launcher3.dragndrop.DragView;
import com.android.launcher3.touch.ItemClickHandler;
import com.android.launcher3.widget.PendingAddShortcutInfo;
import com.app.hider.master.promax.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FolderIcon extends FrameLayout implements FolderInfo.FolderListener {
    private static final Property<FolderIcon, Float> BADGE_SCALE_PROPERTY = new AnonymousClass1(Float.TYPE, "badgeScale");
    static final int DROP_IN_ANIMATION_DURATION = 400;
    private static final int ON_OPEN_DELAY = 800;
    public static final boolean SPRING_LOADING_ENABLED = true;
    static boolean sStaticValuesDirty = true;
    boolean mAnimating;
    PreviewBackground mBackground;
    private boolean mBackgroundIsVisible;
    private FolderBadgeInfo mBadgeInfo;
    private BadgeRenderer mBadgeRenderer;
    private float mBadgeScale;
    private List<BubbleTextView> mCurrentPreviewItems;
    Folder mFolder;
    BubbleTextView mFolderName;
    private FolderInfo mInfo;
    Launcher mLauncher;
    private CheckLongPressHelper mLongPressHelper;
    OnAlarmListener mOnOpenListener;
    private Alarm mOpenAlarm;
    private PreviewItemManager mPreviewItemManager;
    ClippedFolderIconLayoutRule mPreviewLayoutRule;
    FolderIconPreviewVerifier mPreviewVerifier;
    private float mSlop;
    private StylusEventHelper mStylusEventHelper;
    private Rect mTempBounds;
    private Point mTempSpaceForBadgeOffset;
    private PreviewItemDrawingParams mTmpParams;

    /* JADX INFO: renamed from: com.android.launcher3.folder.FolderIcon$1, reason: invalid class name */
    public class AnonymousClass1 extends Property<FolderIcon, Float> {
        public AnonymousClass1(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(FolderIcon folderIcon) {
            return Float.valueOf(folderIcon.mBadgeScale);
        }

        @Override // android.util.Property
        public void set(FolderIcon folderIcon, Float f10) {
            folderIcon.mBadgeScale = f10.floatValue();
            folderIcon.invalidate();
        }
    }

    public FolderIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mBackground = new PreviewBackground();
        this.mBackgroundIsVisible = true;
        this.mTmpParams = new PreviewItemDrawingParams(0.0f, 0.0f, 0.0f, 0.0f);
        this.mCurrentPreviewItems = new ArrayList();
        this.mAnimating = false;
        this.mTempBounds = new Rect();
        this.mOpenAlarm = new Alarm();
        this.mBadgeInfo = new FolderBadgeInfo(null);
        this.mTempSpaceForBadgeOffset = new Point();
        this.mOnOpenListener = new OnAlarmListener() { // from class: com.android.launcher3.folder.FolderIcon.2
            @Override // com.android.launcher3.OnAlarmListener
            public void onAlarm(Alarm alarm) {
                FolderIcon.this.mFolder.beginExternalDrag();
                FolderIcon.this.mFolder.animateOpen();
            }
        };
        init();
    }

    public static FolderIcon fromXml(int i10, Launcher launcher, ViewGroup viewGroup, FolderInfo folderInfo) {
        DeviceProfile deviceProfile = launcher.getDeviceProfile();
        FolderIcon folderIcon = (FolderIcon) LayoutInflater.from(viewGroup.getContext()).inflate(i10, viewGroup, false);
        folderIcon.setClipToPadding(false);
        BubbleTextView bubbleTextView = (BubbleTextView) folderIcon.findViewById(R.id.folder_icon_name);
        folderIcon.mFolderName = bubbleTextView;
        bubbleTextView.setText(folderInfo.title);
        folderIcon.mFolderName.setCompoundDrawablePadding(0);
        ((FrameLayout.LayoutParams) folderIcon.mFolderName.getLayoutParams()).topMargin = deviceProfile.iconSizePx + deviceProfile.iconDrawablePaddingPx;
        folderIcon.setTag(folderInfo);
        folderIcon.setOnClickListener(ItemClickHandler.INSTANCE);
        folderIcon.mInfo = folderInfo;
        folderIcon.mLauncher = launcher;
        folderIcon.mBadgeRenderer = launcher.getDeviceProfile().mBadgeRenderer;
        folderIcon.setContentDescription(launcher.getString(R.string.folder_name_format, folderInfo.title));
        Folder folderFromXml = Folder.fromXml(launcher);
        folderFromXml.setDragController(launcher.getDragController());
        folderFromXml.setFolderIcon(folderIcon);
        folderFromXml.bind(folderInfo);
        folderIcon.setFolder(folderFromXml);
        folderIcon.setAccessibilityDelegate(launcher.getAccessibilityDelegate());
        folderInfo.addListener(folderIcon);
        folderIcon.setOnFocusChangeListener(launcher.mFocusHandler);
        return folderIcon;
    }

    private float getLocalCenterForIndex(int i10, int i11, int[] iArr) {
        PreviewItemDrawingParams previewItemDrawingParamsComputePreviewItemDrawingParams = this.mPreviewItemManager.computePreviewItemDrawingParams(Math.min(4, i10), i11, this.mTmpParams);
        this.mTmpParams = previewItemDrawingParamsComputePreviewItemDrawingParams;
        float f10 = previewItemDrawingParamsComputePreviewItemDrawingParams.transX;
        PreviewBackground previewBackground = this.mBackground;
        previewItemDrawingParamsComputePreviewItemDrawingParams.transX = f10 + previewBackground.basePreviewOffsetX;
        previewItemDrawingParamsComputePreviewItemDrawingParams.transY += previewBackground.basePreviewOffsetY;
        float intrinsicIconSize = this.mPreviewItemManager.getIntrinsicIconSize();
        PreviewItemDrawingParams previewItemDrawingParams = this.mTmpParams;
        float f11 = previewItemDrawingParams.transX;
        float f12 = (previewItemDrawingParams.scale * intrinsicIconSize) / 2.0f;
        float f13 = f11 + f12;
        float f14 = f12 + previewItemDrawingParams.transY;
        iArr[0] = Math.round(f13);
        iArr[1] = Math.round(f14);
        return this.mTmpParams.scale;
    }

    private void init() {
        this.mLongPressHelper = new CheckLongPressHelper(this);
        this.mStylusEventHelper = new StylusEventHelper(new SimpleOnStylusPressListener(this), this);
        this.mPreviewLayoutRule = new ClippedFolderIconLayoutRule();
        this.mSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.mPreviewItemManager = new PreviewItemManager(this);
    }

    private void onDrop(final ShortcutInfo shortcutInfo, DragView dragView, Rect rect, float f10, int i10, boolean z10) {
        Rect rect2;
        float descendantRectRelativeToSelf;
        boolean z11;
        final int i11;
        int i12 = i10;
        shortcutInfo.cellX = -1;
        shortcutInfo.cellY = -1;
        if (dragView == null) {
            addItem(shortcutInfo);
            return;
        }
        DragLayer dragLayer = this.mLauncher.getDragLayer();
        Rect rect3 = new Rect();
        dragLayer.getViewRectRelativeToSelf(dragView, rect3);
        if (rect == null) {
            rect2 = new Rect();
            Workspace workspace = this.mLauncher.getWorkspace();
            workspace.setFinalTransitionTransform();
            float scaleX = getScaleX();
            float scaleY = getScaleY();
            setScaleX(1.0f);
            setScaleY(1.0f);
            descendantRectRelativeToSelf = dragLayer.getDescendantRectRelativeToSelf(this, rect2);
            setScaleX(scaleX);
            setScaleY(scaleY);
            workspace.resetTransitionTransform();
        } else {
            rect2 = rect;
            descendantRectRelativeToSelf = f10;
        }
        int iMin = Math.min(4, i12 + 1);
        if (z10 || i12 >= 4) {
            ArrayList arrayList = new ArrayList(this.mCurrentPreviewItems);
            addItem(shortcutInfo, false);
            this.mCurrentPreviewItems.clear();
            this.mCurrentPreviewItems.addAll(getPreviewItems());
            if (arrayList.equals(this.mCurrentPreviewItems)) {
                removeItem(shortcutInfo, false);
                z11 = false;
            } else {
                for (int i13 = 0; i13 < this.mCurrentPreviewItems.size(); i13++) {
                    if (this.mCurrentPreviewItems.get(i13).getTag().equals(shortcutInfo)) {
                        i12 = i13;
                    }
                }
                this.mPreviewItemManager.hidePreviewItem(i12, true);
                this.mPreviewItemManager.onDrop(arrayList, this.mCurrentPreviewItems, shortcutInfo);
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (!z11) {
            addItem(shortcutInfo);
        }
        int[] iArr = new int[2];
        float localCenterForIndex = getLocalCenterForIndex(i12, iMin, iArr);
        iArr[0] = Math.round(iArr[0] * descendantRectRelativeToSelf);
        iArr[1] = Math.round(iArr[1] * descendantRectRelativeToSelf);
        rect2.offset(iArr[0] - (dragView.getMeasuredWidth() / 2), iArr[1] - (dragView.getMeasuredHeight() / 2));
        float f11 = localCenterForIndex * descendantRectRelativeToSelf;
        int i14 = i12;
        dragLayer.animateView(dragView, rect3, rect2, i12 < 4 ? 0.5f : 0.0f, 1.0f, 1.0f, f11, f11, 400, Interpolators.DEACCEL_2, Interpolators.ACCEL_2, null, 0, null);
        this.mFolder.hideItem(shortcutInfo);
        if (z11) {
            i11 = i14;
        } else {
            i11 = i14;
            this.mPreviewItemManager.hidePreviewItem(i11, true);
        }
        postDelayed(new Runnable() { // from class: com.android.launcher3.folder.FolderIcon.3
            @Override // java.lang.Runnable
            public void run() {
                FolderIcon.this.mPreviewItemManager.hidePreviewItem(i11, false);
                FolderIcon.this.mFolder.showItem(shortcutInfo);
                FolderIcon.this.invalidate();
            }
        }, 400L);
    }

    private void setFolder(Folder folder) {
        this.mFolder = folder;
        this.mPreviewVerifier = new FolderIconPreviewVerifier(this.mLauncher.getDeviceProfile().inv);
        updatePreviewItems(false);
    }

    private void updateBadgeScale(boolean z10, boolean z11) {
        float f10 = z11 ? 1.0f : 0.0f;
        if ((z10 ^ z11) && isShown()) {
            createBadgeScaleAnimator(f10).start();
        } else {
            this.mBadgeScale = f10;
            invalidate();
        }
    }

    private void updatePreviewItems(boolean z10) {
        this.mPreviewItemManager.updatePreviewItems(z10);
        this.mCurrentPreviewItems.clear();
        this.mCurrentPreviewItems.addAll(getPreviewItems());
    }

    private boolean willAcceptItem(ItemInfo itemInfo) {
        int i10 = itemInfo.itemType;
        return ((i10 != 0 && i10 != 1 && i10 != 6) || itemInfo == this.mInfo || this.mFolder.isOpen()) ? false : true;
    }

    public boolean acceptDrop(ItemInfo itemInfo) {
        return !this.mFolder.isDestroyed() && willAcceptItem(itemInfo);
    }

    public void addItem(ShortcutInfo shortcutInfo) {
        addItem(shortcutInfo, true);
    }

    @Override // android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.mLongPressHelper.cancelLongPress();
    }

    public void clearLeaveBehindIfExists() {
        ((CellLayout.LayoutParams) getLayoutParams()).canReorder = true;
        if (this.mInfo.container == -101) {
            ((CellLayout) getParent().getParent()).clearFolderLeaveBehind();
        }
    }

    public Animator createBadgeScaleAnimator(float... fArr) {
        return ObjectAnimator.ofFloat(this, BADGE_SCALE_PROPERTY, fArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int iSave;
        super.dispatchDraw(canvas);
        if (this.mBackgroundIsVisible) {
            this.mPreviewItemManager.recomputePreviewDrawingParams();
            if (!this.mBackground.drawingDelegated()) {
                this.mBackground.drawBackground(canvas);
            }
            Folder folder = this.mFolder;
            if (folder == null) {
                return;
            }
            if (folder.getItemCount() != 0 || this.mAnimating) {
                if (canvas.isHardwareAccelerated()) {
                    canvas2 = canvas;
                    iSave = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
                } else {
                    canvas2 = canvas;
                    iSave = canvas2.save();
                    canvas2.clipPath(this.mBackground.getClipPath());
                }
                this.mPreviewItemManager.draw(canvas2);
                if (canvas2.isHardwareAccelerated()) {
                    this.mBackground.clipCanvasHardware(canvas2);
                }
                canvas2.restoreToCount(iSave);
                if (!this.mBackground.drawingDelegated()) {
                    this.mBackground.drawBackgroundStroke(canvas2);
                }
                drawBadge(canvas2);
            }
        }
    }

    public void drawBadge(Canvas canvas) {
        FolderBadgeInfo folderBadgeInfo = this.mBadgeInfo;
        if ((folderBadgeInfo == null || !folderBadgeInfo.hasBadge()) && this.mBadgeScale <= 0.0f) {
            return;
        }
        int offsetX = this.mBackground.getOffsetX();
        int offsetY = this.mBackground.getOffsetY();
        int i10 = (int) (r3.previewSize * this.mBackground.mScale);
        this.mTempBounds.set(offsetX, offsetY, offsetX + i10, i10 + offsetY);
        float fMax = Math.max(0.0f, this.mBadgeScale - this.mBackground.getScaleProgress());
        Point point = this.mTempSpaceForBadgeOffset;
        int width = getWidth();
        Rect rect = this.mTempBounds;
        point.set(width - rect.right, rect.top);
        this.mBadgeRenderer.draw(canvas, this.mBackground.getBadgeColor(), this.mTempBounds, fMax, this.mTempSpaceForBadgeOffset);
    }

    public void drawLeaveBehindIfExists() {
        CellLayout.LayoutParams layoutParams = (CellLayout.LayoutParams) getLayoutParams();
        layoutParams.canReorder = false;
        if (this.mInfo.container == -101) {
            ((CellLayout) getParent().getParent()).setFolderLeaveBehindCell(layoutParams.cellX, layoutParams.cellY);
        }
    }

    public Folder getFolder() {
        return this.mFolder;
    }

    public PreviewBackground getFolderBackground() {
        return this.mBackground;
    }

    public ClippedFolderIconLayoutRule getLayoutRule() {
        return this.mPreviewLayoutRule;
    }

    public PreviewItemManager getPreviewItemManager() {
        return this.mPreviewItemManager;
    }

    public List<BubbleTextView> getPreviewItems() {
        return getPreviewItemsOnPage(0);
    }

    public List<BubbleTextView> getPreviewItemsOnPage(int i10) {
        this.mPreviewVerifier.setFolderInfo(this.mFolder.getInfo());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.mFolder.getItemsOnPage(i10);
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.mPreviewVerifier.isItemInPreview(i10, i11)) {
                arrayList.add((BubbleTextView) arrayList2.get(i11));
            }
            if (arrayList.size() == 4) {
                break;
            }
        }
        return arrayList;
    }

    public boolean getTextVisible() {
        return this.mFolderName.getVisibility() == 0;
    }

    public boolean hasBadge() {
        FolderBadgeInfo folderBadgeInfo = this.mBadgeInfo;
        return folderBadgeInfo != null && folderBadgeInfo.hasBadge();
    }

    @Override // com.android.launcher3.FolderInfo.FolderListener
    public void onAdd(ShortcutInfo shortcutInfo, int i10) {
        boolean zHasBadge = this.mBadgeInfo.hasBadge();
        this.mBadgeInfo.addBadgeInfo(this.mLauncher.getBadgeInfoForItem(shortcutInfo));
        updateBadgeScale(zHasBadge, this.mBadgeInfo.hasBadge());
        invalidate();
        requestLayout();
    }

    public void onDragEnter(ItemInfo itemInfo) {
        if (this.mFolder.isDestroyed() || !willAcceptItem(itemInfo)) {
            return;
        }
        CellLayout.LayoutParams layoutParams = (CellLayout.LayoutParams) getLayoutParams();
        this.mBackground.animateToAccept((CellLayout) getParent().getParent(), layoutParams.cellX, layoutParams.cellY);
        this.mOpenAlarm.setOnAlarmListener(this.mOnOpenListener);
        if ((itemInfo instanceof AppInfo) || (itemInfo instanceof ShortcutInfo) || (itemInfo instanceof PendingAddShortcutInfo)) {
            this.mOpenAlarm.setAlarm(800L);
        }
    }

    public void onDragExit() {
        this.mBackground.animateToRest();
        this.mOpenAlarm.cancelAlarm();
    }

    public void onFolderClose(int i10) {
        this.mPreviewItemManager.onFolderClose(i10);
    }

    @Override // com.android.launcher3.FolderInfo.FolderListener
    public void onItemsChanged(boolean z10) {
        updatePreviewItems(z10);
        invalidate();
        requestLayout();
    }

    @Override // com.android.launcher3.FolderInfo.FolderListener
    public void onRemove(ShortcutInfo shortcutInfo) {
        boolean zHasBadge = this.mBadgeInfo.hasBadge();
        this.mBadgeInfo.subtractBadgeInfo(this.mLauncher.getBadgeInfoForItem(shortcutInfo));
        updateBadgeScale(zHasBadge, this.mBadgeInfo.hasBadge());
        invalidate();
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        sStaticValuesDirty = true;
        return super.onSaveInstanceState();
    }

    @Override // com.android.launcher3.FolderInfo.FolderListener
    public void onTitleChanged(CharSequence charSequence) {
        this.mFolderName.setText(charSequence);
        setContentDescription(getContext().getString(R.string.folder_name_format, charSequence));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r1 != 3) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            boolean r0 = super.onTouchEvent(r4)
            com.android.launcher3.StylusEventHelper r1 = r3.mStylusEventHelper
            boolean r1 = r1.onMotionEvent(r4)
            r2 = 1
            if (r1 == 0) goto L13
            com.android.launcher3.CheckLongPressHelper r4 = r3.mLongPressHelper
            r4.cancelLongPress()
            return r2
        L13:
            int r1 = r4.getAction()
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L38
            r2 = 2
            if (r1 == r2) goto L22
            r4 = 3
            if (r1 == r4) goto L38
            goto L37
        L22:
            float r1 = r4.getX()
            float r4 = r4.getY()
            float r2 = r3.mSlop
            boolean r4 = com.android.launcher3.Utilities.pointInView(r3, r1, r4, r2)
            if (r4 != 0) goto L37
            com.android.launcher3.CheckLongPressHelper r4 = r3.mLongPressHelper
            r4.cancelLongPress()
        L37:
            return r0
        L38:
            com.android.launcher3.CheckLongPressHelper r4 = r3.mLongPressHelper
            r4.cancelLongPress()
            return r0
        L3e:
            com.android.launcher3.CheckLongPressHelper r4 = r3.mLongPressHelper
            r4.postCheckForLongPress()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.folder.FolderIcon.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void performCreateAnimation(ShortcutInfo shortcutInfo, View view, ShortcutInfo shortcutInfo2, DragView dragView, Rect rect, float f10) {
        prepareCreateAnimation(view);
        addItem(shortcutInfo);
        this.mPreviewItemManager.createFirstItemAnimation(false, null).start();
        onDrop(shortcutInfo2, dragView, rect, f10, 1, false);
    }

    public void performDestroyAnimation(Runnable runnable) {
        this.mPreviewItemManager.createFirstItemAnimation(true, runnable).start();
    }

    @Override // com.android.launcher3.FolderInfo.FolderListener
    public void prepareAutoUpdate() {
    }

    public Drawable prepareCreateAnimation(View view) {
        return this.mPreviewItemManager.prepareCreateAnimation(view);
    }

    public void removeItem(ShortcutInfo shortcutInfo, boolean z10) {
        this.mInfo.remove(shortcutInfo, z10);
    }

    public void removeListeners() {
        this.mInfo.removeListener(this);
        this.mInfo.removeListener(this.mFolder);
    }

    public void setBackgroundVisible(boolean z10) {
        this.mBackgroundIsVisible = z10;
        invalidate();
    }

    public void setBadgeInfo(FolderBadgeInfo folderBadgeInfo) {
        updateBadgeScale(this.mBadgeInfo.hasBadge(), folderBadgeInfo.hasBadge());
        this.mBadgeInfo = folderBadgeInfo;
    }

    public void setFolderBackground(PreviewBackground previewBackground) {
        this.mBackground = previewBackground;
        previewBackground.setInvalidateDelegate(this);
    }

    public void setTextVisible(boolean z10) {
        if (z10) {
            this.mFolderName.setVisibility(0);
        } else {
            this.mFolderName.setVisibility(4);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return this.mPreviewItemManager.verifyDrawable(drawable) || super.verifyDrawable(drawable);
    }

    public void addItem(ShortcutInfo shortcutInfo, boolean z10) {
        this.mInfo.add(shortcutInfo, z10);
    }

    public FolderIcon(Context context) {
        super(context);
        this.mBackground = new PreviewBackground();
        this.mBackgroundIsVisible = true;
        this.mTmpParams = new PreviewItemDrawingParams(0.0f, 0.0f, 0.0f, 0.0f);
        this.mCurrentPreviewItems = new ArrayList();
        this.mAnimating = false;
        this.mTempBounds = new Rect();
        this.mOpenAlarm = new Alarm();
        this.mBadgeInfo = new FolderBadgeInfo(null);
        this.mTempSpaceForBadgeOffset = new Point();
        this.mOnOpenListener = new OnAlarmListener() { // from class: com.android.launcher3.folder.FolderIcon.2
            @Override // com.android.launcher3.OnAlarmListener
            public void onAlarm(Alarm alarm) {
                FolderIcon.this.mFolder.beginExternalDrag();
                FolderIcon.this.mFolder.animateOpen();
            }
        };
        init();
    }

    public void onDrop(DropTarget.DragObject dragObject, boolean z10) {
        ShortcutInfo shortcutInfoMakeShortcut;
        ShortcutInfo shortcutInfo;
        ItemInfo itemInfo = dragObject.dragInfo;
        if (itemInfo instanceof AppInfo) {
            shortcutInfoMakeShortcut = ((AppInfo) itemInfo).makeShortcut();
        } else {
            if (dragObject.dragSource instanceof BaseItemDragListener) {
                shortcutInfo = new ShortcutInfo((ShortcutInfo) itemInfo);
                this.mFolder.notifyDrop();
                onDrop(shortcutInfo, dragObject.dragView, null, 1.0f, this.mInfo.contents.size(), z10);
            }
            shortcutInfoMakeShortcut = (ShortcutInfo) itemInfo;
        }
        shortcutInfo = shortcutInfoMakeShortcut;
        this.mFolder.notifyDrop();
        onDrop(shortcutInfo, dragObject.dragView, null, 1.0f, this.mInfo.contents.size(), z10);
    }
}

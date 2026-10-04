package com.android.launcher3;

import G0.C1162y;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.TextView;
import com.android.launcher3.IconCache;
import com.android.launcher3.Launcher;
import com.android.launcher3.badge.BadgeInfo;
import com.android.launcher3.badge.BadgeRenderer;
import com.android.launcher3.extension.BubbleTextViewExtension;
import com.android.launcher3.extension.ExtensionFactory;
import com.android.launcher3.folder.FolderIcon;
import com.android.launcher3.graphics.DrawableFactory;
import com.android.launcher3.graphics.IconPalette;
import com.android.launcher3.graphics.PreloadIconDrawable;
import com.android.launcher3.model.PackageItemInfo;
import com.prism.commons.utils.l0;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes2.dex */
public class BubbleTextView extends TextView implements IconCache.ItemInfoUpdateReceiver, Launcher.OnResumeCallback {
    private static final int DISPLAY_ALL_APPS = 1;
    private static final int DISPLAY_FOLDER = 2;
    private static final int DISPLAY_WORKSPACE = 0;
    private final BaseDraggingActivity mActivity;
    private int mBadgeColor;
    private BadgeInfo mBadgeInfo;
    private BadgeRenderer mBadgeRenderer;
    private float mBadgeScale;
    private final boolean mCenterVertically;

    @ViewDebug.ExportedProperty(category = "launcher")
    private boolean mDisableRelayout;
    private boolean mForceHideBadge;
    private Drawable mIcon;
    private IconCache.IconLoadRequest mIconLoadRequest;
    private final int mIconSize;

    @ViewDebug.ExportedProperty(category = "launcher")
    private boolean mIgnorePressedStateChange;

    @ViewDebug.ExportedProperty(category = "launcher")
    private boolean mIsIconVisible;
    private final boolean mLayoutHorizontal;
    private final CheckLongPressHelper mLongPressHelper;
    private final float mSlop;

    @ViewDebug.ExportedProperty(category = "launcher")
    private boolean mStayPressed;
    private final StylusEventHelper mStylusEventHelper;
    private Rect mTempIconBounds;
    private Point mTempSpaceForBadgeOffset;

    @ViewDebug.ExportedProperty(category = "launcher")
    private float mTextAlpha;

    @ViewDebug.ExportedProperty(category = "launcher")
    private int mTextColor;
    private static final BubbleTextViewExtension extension = ExtensionFactory.createBubbleTextViewBadgeExtension();
    private static final int[] STATE_PRESSED = {android.R.attr.state_pressed};
    private static final Property<BubbleTextView, Float> BADGE_SCALE_PROPERTY = new AnonymousClass1(Float.TYPE, "badgeScale");
    public static final Property<BubbleTextView, Float> TEXT_ALPHA_PROPERTY = new AnonymousClass2(Float.class, "textAlpha");
    private static final String TAG = l0.b("BubbleTextView");

    /* JADX INFO: renamed from: com.android.launcher3.BubbleTextView$1, reason: invalid class name */
    public class AnonymousClass1 extends Property<BubbleTextView, Float> {
        public AnonymousClass1(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(BubbleTextView bubbleTextView) {
            return Float.valueOf(bubbleTextView.mBadgeScale);
        }

        @Override // android.util.Property
        public void set(BubbleTextView bubbleTextView, Float f10) {
            bubbleTextView.mBadgeScale = f10.floatValue();
            bubbleTextView.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.android.launcher3.BubbleTextView$2, reason: invalid class name */
    public class AnonymousClass2 extends Property<BubbleTextView, Float> {
        public AnonymousClass2(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(BubbleTextView bubbleTextView) {
            return Float.valueOf(bubbleTextView.mTextAlpha);
        }

        @Override // android.util.Property
        public void set(BubbleTextView bubbleTextView, Float f10) {
            bubbleTextView.setTextAlpha(f10.floatValue());
        }
    }

    public BubbleTextView(Context context) {
        this(context, null, 0);
    }

    private void applyIconAndLabel(ItemInfoWithIcon itemInfoWithIcon) {
        FastBitmapDrawable fastBitmapDrawableNewIcon = DrawableFactory.get(getContext()).newIcon(itemInfoWithIcon);
        this.mBadgeColor = IconPalette.getMutedColor(itemInfoWithIcon.iconColor, 0.54f);
        setIcon(fastBitmapDrawableNewIcon);
        setText(itemInfoWithIcon.title);
        if (itemInfoWithIcon.contentDescription != null) {
            setContentDescription(itemInfoWithIcon.isDisabled() ? getContext().getString(com.app.hider.master.promax.R.string.disabled_app_label, itemInfoWithIcon.contentDescription) : itemInfoWithIcon.contentDescription);
        }
    }

    private void drawBadgeExtesion(Canvas canvas) {
        BubbleTextViewExtension bubbleTextViewExtension = extension;
        if (bubbleTextViewExtension != null) {
            getIconBounds(this.mTempIconBounds);
            this.mTempSpaceForBadgeOffset.set((getWidth() - this.mIconSize) / 2, getPaddingTop());
            canvas.translate(getScrollX(), getScrollY());
            bubbleTextViewExtension.onDrawBadge(this, canvas, this.mTempIconBounds, this.mTempSpaceForBadgeOffset);
            canvas.translate(-r1, -r2);
        }
    }

    private int getModifiedColor() {
        if (this.mTextAlpha == 0.0f) {
            return 0;
        }
        return C1162y.D(this.mTextColor, Math.round(Color.alpha(r0) * this.mTextAlpha));
    }

    private boolean hasBadge() {
        return this.mBadgeInfo != null;
    }

    private void setIcon(Drawable drawable) {
        if (this.mIsIconVisible) {
            applyCompoundDrawables(drawable);
        }
        this.mIcon = drawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextAlpha(float f10) {
        this.mTextAlpha = f10;
        super.setTextColor(getModifiedColor());
    }

    public void applyBadgeState(ItemInfo itemInfo, boolean z10) {
        if (this.mIcon instanceof FastBitmapDrawable) {
            boolean z11 = this.mBadgeInfo != null;
            BadgeInfo badgeInfoForItem = this.mActivity.getBadgeInfoForItem(itemInfo);
            this.mBadgeInfo = badgeInfoForItem;
            boolean z12 = badgeInfoForItem != null;
            float f10 = z12 ? 1.0f : 0.0f;
            this.mBadgeRenderer = this.mActivity.getDeviceProfile().mBadgeRenderer;
            if (z11 || z12) {
                if (z10 && (z11 ^ z12) && isShown()) {
                    ObjectAnimator.ofFloat(this, BADGE_SCALE_PROPERTY, f10).start();
                } else {
                    this.mBadgeScale = f10;
                    invalidate();
                }
            }
            if (itemInfo.contentDescription != null) {
                if (!hasBadge()) {
                    setContentDescription(itemInfo.contentDescription);
                } else {
                    int notificationDisplayCount = this.mBadgeInfo.getNotificationDisplayCount();
                    setContentDescription(getContext().getResources().getQuantityString(com.app.hider.master.promax.R.plurals.badged_app_label, notificationDisplayCount, itemInfo.contentDescription, Integer.valueOf(notificationDisplayCount)));
                }
            }
        }
    }

    public void applyCompoundDrawables(Drawable drawable) {
        this.mDisableRelayout = this.mIcon != null;
        int i10 = this.mIconSize;
        drawable.setBounds(0, 0, i10, i10);
        if (this.mLayoutHorizontal) {
            setCompoundDrawablesRelative(drawable, null, null, null);
        } else {
            setCompoundDrawables(null, drawable, null, null);
        }
        this.mDisableRelayout = false;
    }

    public void applyFromApplicationInfo(AppInfo appInfo) {
        applyIconAndLabel(appInfo);
        super.setTag(appInfo);
        verifyHighRes();
        if (appInfo instanceof PromiseAppInfo) {
            applyProgressLevel(((PromiseAppInfo) appInfo).level);
        }
        applyBadgeState(appInfo, false);
        BubbleTextViewExtension bubbleTextViewExtension = extension;
        if (bubbleTextViewExtension != null) {
            bubbleTextViewExtension.afterApplyFromAppInfo(this);
        }
    }

    public void applyFromPackageItemInfo(PackageItemInfo packageItemInfo) {
        applyIconAndLabel(packageItemInfo);
        super.setTag(packageItemInfo);
        verifyHighRes();
    }

    public void applyFromShortcutInfo(ShortcutInfo shortcutInfo) {
        applyFromShortcutInfo(shortcutInfo, false);
    }

    public PreloadIconDrawable applyProgressLevel(int i10) {
        if (!(getTag() instanceof ItemInfoWithIcon)) {
            return null;
        }
        ItemInfoWithIcon itemInfoWithIcon = (ItemInfoWithIcon) getTag();
        if (i10 >= 100) {
            CharSequence charSequence = itemInfoWithIcon.contentDescription;
            if (charSequence == null) {
                charSequence = "";
            }
            setContentDescription(charSequence);
        } else if (i10 > 0) {
            setContentDescription(getContext().getString(com.app.hider.master.promax.R.string.app_downloading_title, itemInfoWithIcon.title, NumberFormat.getPercentInstance().format(((double) i10) * 0.01d)));
        } else {
            setContentDescription(getContext().getString(com.app.hider.master.promax.R.string.app_waiting_download_title, itemInfoWithIcon.title));
        }
        Drawable drawable = this.mIcon;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof PreloadIconDrawable) {
            PreloadIconDrawable preloadIconDrawable = (PreloadIconDrawable) drawable;
            preloadIconDrawable.setLevel(i10);
            return preloadIconDrawable;
        }
        PreloadIconDrawable preloadIconDrawableNewPendingIcon = DrawableFactory.get(getContext()).newPendingIcon(itemInfoWithIcon, getContext());
        preloadIconDrawableNewPendingIcon.setLevel(i10);
        setIcon(preloadIconDrawableNewPendingIcon);
        return preloadIconDrawableNewPendingIcon;
    }

    public void applyPromiseState(boolean z10) {
        if (getTag() instanceof ShortcutInfo) {
            ShortcutInfo shortcutInfo = (ShortcutInfo) getTag();
            PreloadIconDrawable preloadIconDrawableApplyProgressLevel = applyProgressLevel(shortcutInfo.hasPromiseIconUi() ? shortcutInfo.hasStatusFlag(4) ? shortcutInfo.getInstallProgress() : 0 : 100);
            if (preloadIconDrawableApplyProgressLevel == null || !z10) {
                return;
            }
            preloadIconDrawableApplyProgressLevel.maybePerformFinishedAnimation();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.mLongPressHelper.cancelLongPress();
    }

    public void clearPressedBackground() {
        setPressed(false);
        setStayPressed(false);
    }

    public ObjectAnimator createTextAlphaAnimator(boolean z10) {
        return ObjectAnimator.ofFloat(this, TEXT_ALPHA_PROPERTY, (shouldTextBeVisible() && z10) ? 1.0f : 0.0f);
    }

    public void drawBadgeIfNecessary(Canvas canvas) {
        Canvas canvas2;
        if (this.mForceHideBadge || (!hasBadge() && this.mBadgeScale <= 0.0f)) {
            canvas2 = canvas;
        } else {
            getIconBounds(this.mTempIconBounds);
            this.mTempSpaceForBadgeOffset.set((getWidth() - this.mIconSize) / 2, getPaddingTop());
            canvas.translate(getScrollX(), getScrollY());
            canvas2 = canvas;
            this.mBadgeRenderer.draw(canvas2, this.mBadgeColor, this.mTempIconBounds, this.mBadgeScale, this.mTempSpaceForBadgeOffset);
            canvas2.translate(-r0, -r1);
        }
        drawBadgeExtesion(canvas2);
    }

    public void drawWithoutBadge(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void forceHideBadge(boolean z10) {
        if (this.mForceHideBadge == z10) {
            return;
        }
        this.mForceHideBadge = z10;
        if (z10) {
            invalidate();
        } else if (hasBadge()) {
            ObjectAnimator.ofFloat(this, BADGE_SCALE_PROPERTY, 0.0f, 1.0f).start();
        }
    }

    public Drawable getIcon() {
        return this.mIcon;
    }

    public void getIconBounds(Rect rect) {
        int paddingTop = getPaddingTop();
        int width = getWidth();
        int i10 = this.mIconSize;
        int i11 = (width - i10) / 2;
        rect.set(i11, paddingTop, i11 + i10, i10 + paddingTop);
    }

    public int getIconSize() {
        return this.mIconSize;
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.mStayPressed) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, STATE_PRESSED);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawBadgeIfNecessary(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        setEllipsize(z10 ? TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.END);
        super.onFocusChanged(z10, i10, rect);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        this.mIgnorePressedStateChange = true;
        boolean zOnKeyUp = super.onKeyUp(i10, keyEvent);
        this.mIgnorePressedStateChange = false;
        refreshDrawableState();
        return zOnKeyUp;
    }

    @Override // com.android.launcher3.Launcher.OnResumeCallback
    public void onLauncherResume() {
        setStayPressed(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.mCenterVertically) {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            setPadding(getPaddingLeft(), (View.MeasureSpec.getSize(i11) - ((getCompoundDrawablePadding() + this.mIconSize) + ((int) Math.ceil(fontMetrics.bottom - fontMetrics.top)))) / 2, getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r1 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
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
            com.android.launcher3.CheckLongPressHelper r0 = r3.mLongPressHelper
            r0.cancelLongPress()
            r0 = r2
        L13:
            int r1 = r4.getAction()
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L38
            r2 = 2
            if (r1 == r2) goto L22
            r4 = 3
            if (r1 == r4) goto L38
            goto L4b
        L22:
            float r1 = r4.getX()
            float r4 = r4.getY()
            float r2 = r3.mSlop
            boolean r4 = com.android.launcher3.Utilities.pointInView(r3, r1, r4, r2)
            if (r4 != 0) goto L4b
            com.android.launcher3.CheckLongPressHelper r4 = r3.mLongPressHelper
            r4.cancelLongPress()
            return r0
        L38:
            com.android.launcher3.CheckLongPressHelper r4 = r3.mLongPressHelper
            r4.cancelLongPress()
            return r0
        L3e:
            com.android.launcher3.StylusEventHelper r4 = r3.mStylusEventHelper
            boolean r4 = r4.inStylusButtonPressed()
            if (r4 != 0) goto L4b
            com.android.launcher3.CheckLongPressHelper r4 = r3.mLongPressHelper
            r4.postCheckForLongPress()
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.BubbleTextView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.android.launcher3.IconCache.ItemInfoUpdateReceiver
    public void reapplyItemInfo(ItemInfoWithIcon itemInfoWithIcon) {
        if (getTag() == itemInfoWithIcon) {
            this.mIconLoadRequest = null;
            this.mDisableRelayout = true;
            itemInfoWithIcon.iconBitmap.prepareToDraw();
            if (itemInfoWithIcon instanceof AppInfo) {
                applyFromApplicationInfo((AppInfo) itemInfoWithIcon);
            } else if (itemInfoWithIcon instanceof ShortcutInfo) {
                applyFromShortcutInfo((ShortcutInfo) itemInfoWithIcon);
                this.mActivity.invalidateParent(itemInfoWithIcon);
            } else if (itemInfoWithIcon instanceof PackageItemInfo) {
                applyFromPackageItemInfo((PackageItemInfo) itemInfoWithIcon);
            }
            this.mDisableRelayout = false;
        }
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        if (this.mIgnorePressedStateChange) {
            return;
        }
        super.refreshDrawableState();
    }

    @Override // android.view.View
    public void requestLayout() {
        if (this.mDisableRelayout) {
            return;
        }
        super.requestLayout();
    }

    public void reset() {
        this.mBadgeInfo = null;
        this.mBadgeColor = 0;
        this.mBadgeScale = 0.0f;
        this.mForceHideBadge = false;
    }

    public void setIconVisible(boolean z10) {
        this.mIsIconVisible = z10;
        applyCompoundDrawables(z10 ? this.mIcon : new ColorDrawable(0));
    }

    public void setLongPressTimeout(int i10) {
        this.mLongPressHelper.setLongPressTimeout(i10);
    }

    public void setStayPressed(boolean z10) {
        this.mStayPressed = z10;
        refreshDrawableState();
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        if (obj != null) {
            LauncherModel.checkItemInfo((ItemInfo) obj);
        }
        super.setTag(obj);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        this.mTextColor = i10;
        super.setTextColor(getModifiedColor());
    }

    public void setTextVisibility(boolean z10) {
        setTextAlpha(z10 ? 1.0f : 0.0f);
    }

    public boolean shouldTextBeVisible() {
        Object tag = getParent() instanceof FolderIcon ? ((View) getParent()).getTag() : getTag();
        ItemInfo itemInfo = tag instanceof ItemInfo ? (ItemInfo) tag : null;
        return itemInfo == null || itemInfo.container != -101;
    }

    public void verifyHighRes() {
        IconCache.IconLoadRequest iconLoadRequest = this.mIconLoadRequest;
        if (iconLoadRequest != null) {
            iconLoadRequest.cancel();
            this.mIconLoadRequest = null;
        }
        if (getTag() instanceof ItemInfoWithIcon) {
            ItemInfoWithIcon itemInfoWithIcon = (ItemInfoWithIcon) getTag();
            if (itemInfoWithIcon.usingLowResIcon) {
                this.mIconLoadRequest = LauncherAppState.getInstance(getContext()).getIconCache().updateIconInBackground(this, itemInfoWithIcon);
            }
        }
    }

    public BubbleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void applyFromShortcutInfo(ShortcutInfo shortcutInfo, boolean z10) {
        applyIconAndLabel(shortcutInfo);
        setTag(shortcutInfo);
        if (z10 || shortcutInfo.hasPromiseIconUi()) {
            applyPromiseState(z10);
        }
        applyBadgeState(shortcutInfo, false);
    }

    public BubbleTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mIsIconVisible = true;
        this.mTextAlpha = 1.0f;
        this.mTempSpaceForBadgeOffset = new Point();
        this.mTempIconBounds = new Rect();
        this.mDisableRelayout = false;
        BaseDraggingActivity baseDraggingActivityFromContext = BaseDraggingActivity.fromContext(context);
        this.mActivity = baseDraggingActivityFromContext;
        DeviceProfile deviceProfile = baseDraggingActivityFromContext.getDeviceProfile();
        this.mSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BubbleTextView, i10, 0);
        this.mLayoutHorizontal = typedArrayObtainStyledAttributes.getBoolean(3, false);
        int integer = typedArrayObtainStyledAttributes.getInteger(1, 0);
        int i11 = deviceProfile.iconSizePx;
        if (integer == 0) {
            setTextSize(0, deviceProfile.iconTextSizePx);
            setCompoundDrawablePadding(deviceProfile.iconDrawablePaddingPx);
        } else if (integer == 1) {
            setTextSize(0, deviceProfile.allAppsIconTextSizePx);
            setCompoundDrawablePadding(deviceProfile.allAppsIconDrawablePaddingPx);
            i11 = deviceProfile.allAppsIconSizePx;
        } else if (integer == 2) {
            setTextSize(0, deviceProfile.folderChildTextSizePx);
            setCompoundDrawablePadding(deviceProfile.folderChildDrawablePaddingPx);
            i11 = deviceProfile.folderChildIconSizePx;
        }
        this.mCenterVertically = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.mIconSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, i11);
        typedArrayObtainStyledAttributes.recycle();
        this.mLongPressHelper = new CheckLongPressHelper(this);
        this.mStylusEventHelper = new StylusEventHelper(new SimpleOnStylusPressListener(this), this);
        setEllipsize(TextUtils.TruncateAt.END);
        setAccessibilityDelegate(baseDraggingActivityFromContext.getAccessibilityDelegate());
        setTextAlpha(1.0f);
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        this.mTextColor = colorStateList.getDefaultColor();
        if (Float.compare(this.mTextAlpha, 1.0f) == 0) {
            super.setTextColor(colorStateList);
        } else {
            super.setTextColor(getModifiedColor());
        }
    }
}

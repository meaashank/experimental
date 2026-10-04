package com.android.launcher3.folder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.CellLayout;
import com.android.launcher3.DeviceProfile;
import com.android.launcher3.InvariantDeviceProfile;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.PagedView;
import com.android.launcher3.ShortcutAndWidgetContainer;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.Utilities;
import com.android.launcher3.Workspace;
import com.android.launcher3.anim.Interpolators;
import com.android.launcher3.keyboard.ViewGroupFocusHelper;
import com.android.launcher3.pageindicators.PageIndicatorDots;
import com.android.launcher3.touch.ItemClickHandler;
import com.app.hider.master.promax.R;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class FolderPagedView extends PagedView<PageIndicatorDots> {
    private static final int REORDER_ANIMATION_DURATION = 230;
    private static final float SCROLL_HINT_FRACTION = 0.07f;
    private static final int START_VIEW_REORDER_DELAY = 30;
    private static final String TAG = "FolderPagedView";
    private static final float VIEW_REORDER_DELAY_FACTOR = 0.9f;
    private static final int[] sTmpArray = new int[2];
    private int mAllocatedContentSize;
    private final ViewGroupFocusHelper mFocusIndicatorHelper;
    private Folder mFolder;

    @ViewDebug.ExportedProperty(category = "launcher")
    private int mGridCountX;

    @ViewDebug.ExportedProperty(category = "launcher")
    private int mGridCountY;
    private final LayoutInflater mInflater;
    public final boolean mIsRtl;

    @ViewDebug.ExportedProperty(category = "launcher")
    private final int mMaxCountX;

    @ViewDebug.ExportedProperty(category = "launcher")
    private final int mMaxCountY;

    @ViewDebug.ExportedProperty(category = "launcher")
    private final int mMaxItemsPerPage;
    final ArrayMap<View, Runnable> mPendingAnimations;

    public FolderPagedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPendingAnimations = new ArrayMap<>();
        InvariantDeviceProfile idp = LauncherAppState.getIDP(context);
        int i10 = idp.numFolderColumns;
        this.mMaxCountX = i10;
        int i11 = idp.numFolderRows;
        this.mMaxCountY = i11;
        this.mMaxItemsPerPage = i10 * i11;
        this.mInflater = LayoutInflater.from(context);
        this.mIsRtl = Utilities.isRtl(getResources());
        setImportantForAccessibility(1);
        this.mFocusIndicatorHelper = new ViewGroupFocusHelper(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void calculateGridSize(int r3, int r4, int r5, int r6, int r7, int r8, int[] r9) {
        /*
            r0 = 0
            r1 = 1
            if (r3 < r8) goto L8
            r4 = r6
            r5 = r7
            r8 = r1
            goto L9
        L8:
            r8 = r0
        L9:
            if (r8 != 0) goto L4f
            int r8 = r4 * r5
            if (r8 >= r3) goto L27
            if (r4 <= r5) goto L13
            if (r5 != r7) goto L1a
        L13:
            if (r4 >= r6) goto L1a
            int r8 = r4 + 1
            r2 = r8
        L18:
            r8 = r5
            goto L22
        L1a:
            if (r5 >= r7) goto L20
            int r8 = r5 + 1
            r2 = r4
            goto L22
        L20:
            r2 = r4
            goto L18
        L22:
            if (r8 != 0) goto L44
            int r8 = r8 + 1
            goto L44
        L27:
            int r8 = r5 + (-1)
            int r2 = r8 * r4
            if (r2 < r3) goto L35
            if (r5 < r4) goto L35
            int r8 = java.lang.Math.max(r0, r8)
            r2 = r4
            goto L44
        L35:
            int r8 = r4 + (-1)
            int r2 = r8 * r5
            if (r2 < r3) goto L42
            int r8 = java.lang.Math.max(r0, r8)
            r2 = r8
        L40:
            r8 = r5
            goto L44
        L42:
            r2 = r4
            goto L40
        L44:
            if (r2 != r4) goto L4a
            if (r8 != r5) goto L4a
            r4 = r1
            goto L4b
        L4a:
            r4 = r0
        L4b:
            r5 = r8
            r8 = r4
            r4 = r2
            goto L9
        L4f:
            r9[r0] = r4
            r9[r1] = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.folder.FolderPagedView.calculateGridSize(int, int, int, int, int, int, int[]):void");
    }

    private CellLayout createAndAddNewPage() {
        DeviceProfile deviceProfile = Launcher.getLauncher(getContext()).getDeviceProfile();
        CellLayout cellLayout = (CellLayout) this.mInflater.inflate(R.layout.folder_page, (ViewGroup) this, false);
        cellLayout.setCellDimensions(deviceProfile.folderCellWidthPx, deviceProfile.folderCellHeightPx);
        cellLayout.getShortcutsAndWidgets().setMotionEventSplittingEnabled(false);
        cellLayout.setInvertIfRtl(true);
        cellLayout.setGridSize(this.mGridCountX, this.mGridCountY);
        addView(cellLayout, -1, generateDefaultLayoutParams());
        return cellLayout;
    }

    public void addViewForRank(View view, ShortcutInfo shortcutInfo, int i10) {
        int i11 = this.mMaxItemsPerPage;
        int i12 = i10 % i11;
        int i13 = i10 / i11;
        shortcutInfo.rank = i10;
        int i14 = this.mGridCountX;
        shortcutInfo.cellX = i12 % i14;
        shortcutInfo.cellY = i12 / i14;
        CellLayout.LayoutParams layoutParams = (CellLayout.LayoutParams) view.getLayoutParams();
        layoutParams.cellX = shortcutInfo.cellX;
        layoutParams.cellY = shortcutInfo.cellY;
        getPageAt(i13).addViewToCellLayout(view, -1, this.mFolder.mLauncher.getViewIdForItem(shortcutInfo), layoutParams, true);
    }

    public int allocateRankForNewItem() {
        int itemCount = getItemCount();
        allocateSpaceForRank(itemCount);
        setCurrentPage(itemCount / this.mMaxItemsPerPage);
        return itemCount;
    }

    public void allocateSpaceForRank(int i10) {
        ArrayList<View> arrayList = new ArrayList<>(this.mFolder.getItemsInReadingOrder());
        arrayList.add(i10, null);
        arrangeChildren(arrayList, arrayList.size(), false);
    }

    public void arrangeChildren(ArrayList<View> arrayList, int i10) {
        arrangeChildren(arrayList, i10, true);
    }

    public void bindItems(ArrayList<ShortcutInfo> arrayList) {
        ArrayList<View> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            ShortcutInfo shortcutInfo = arrayList.get(i10);
            i10++;
            arrayList2.add(createNewView(shortcutInfo));
        }
        arrangeChildren(arrayList2, arrayList2.size(), false);
    }

    public void clearScrollHint() {
        if (getScrollX() != getScrollForPage(getNextPage())) {
            snapToPage(getNextPage());
        }
    }

    public void completePendingPageChanges() {
        if (this.mPendingAnimations.isEmpty()) {
            return;
        }
        for (Map.Entry entry : new ArrayMap(this.mPendingAnimations).entrySet()) {
            ((View) entry.getKey()).animate().cancel();
            ((Runnable) entry.getValue()).run();
        }
    }

    public View createAndAddViewForRank(ShortcutInfo shortcutInfo, int i10) {
        View viewCreateNewView = createNewView(shortcutInfo);
        allocateSpaceForRank(i10);
        addViewForRank(viewCreateNewView, shortcutInfo, i10);
        return viewCreateNewView;
    }

    @SuppressLint({"InflateParams"})
    public View createNewView(ShortcutInfo shortcutInfo) {
        BubbleTextView bubbleTextView = (BubbleTextView) this.mInflater.inflate(R.layout.folder_application, (ViewGroup) null, false);
        bubbleTextView.applyFromShortcutInfo(shortcutInfo);
        bubbleTextView.setHapticFeedbackEnabled(false);
        bubbleTextView.setOnClickListener(ItemClickHandler.INSTANCE);
        bubbleTextView.setOnLongClickListener(this.mFolder);
        bubbleTextView.setOnFocusChangeListener(this.mFocusIndicatorHelper);
        bubbleTextView.setLayoutParams(new CellLayout.LayoutParams(shortcutInfo.cellX, shortcutInfo.cellY, shortcutInfo.spanX, shortcutInfo.spanY));
        return bubbleTextView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.mFocusIndicatorHelper.draw(canvas);
        super.dispatchDraw(canvas);
    }

    public int findNearestArea(int i10, int i11) {
        int nextPage = getNextPage();
        CellLayout pageAt = getPageAt(nextPage);
        int[] iArr = sTmpArray;
        pageAt.findNearestArea(i10, i11, 1, 1, iArr);
        if (this.mFolder.isLayoutRtl()) {
            iArr[0] = (pageAt.getCountX() - iArr[0]) - 1;
        }
        return Math.min(this.mAllocatedContentSize - 1, (iArr[1] * this.mGridCountX) + (nextPage * this.mMaxItemsPerPage) + iArr[0]);
    }

    public String getAccessibilityDescription() {
        return getContext().getString(R.string.folder_opened, Integer.valueOf(this.mGridCountX), Integer.valueOf(this.mGridCountY));
    }

    public int getAllocatedContentSize() {
        return this.mAllocatedContentSize;
    }

    @Override // com.android.launcher3.PagedView
    public int getChildGap() {
        return getPaddingRight() + getPaddingLeft();
    }

    public CellLayout getCurrentCellLayout() {
        return getPageAt(getNextPage());
    }

    public int getDesiredHeight() {
        if (getPageCount() <= 0) {
            return 0;
        }
        return getPaddingBottom() + getPaddingTop() + getPageAt(0).getDesiredHeight();
    }

    public int getDesiredWidth() {
        if (getPageCount() <= 0) {
            return 0;
        }
        return getPaddingRight() + getPaddingLeft() + getPageAt(0).getDesiredWidth();
    }

    public View getFirstItem() {
        if (getChildCount() < 1) {
            return null;
        }
        ShortcutAndWidgetContainer shortcutsAndWidgets = getCurrentCellLayout().getShortcutsAndWidgets();
        return this.mGridCountX > 0 ? shortcutsAndWidgets.getChildAt(0, 0) : shortcutsAndWidgets.getChildAt(0);
    }

    public int getItemCount() {
        int childCount = getChildCount() - 1;
        if (childCount < 0) {
            return 0;
        }
        return (childCount * this.mMaxItemsPerPage) + getPageAt(childCount).getShortcutsAndWidgets().getChildCount();
    }

    public View getLastItem() {
        if (getChildCount() < 1) {
            return null;
        }
        ShortcutAndWidgetContainer shortcutsAndWidgets = getCurrentCellLayout().getShortcutsAndWidgets();
        int childCount = shortcutsAndWidgets.getChildCount() - 1;
        int i10 = this.mGridCountX;
        return i10 > 0 ? shortcutsAndWidgets.getChildAt(childCount % i10, childCount / i10) : shortcutsAndWidgets.getChildAt(childCount);
    }

    public int itemsPerPage() {
        return this.mMaxItemsPerPage;
    }

    public View iterateOverItems(Workspace.ItemOperator itemOperator) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            CellLayout pageAt = getPageAt(i10);
            for (int i11 = 0; i11 < pageAt.getCountY(); i11++) {
                for (int i12 = 0; i12 < pageAt.getCountX(); i12++) {
                    View childAt = pageAt.getChildAt(i12, i11);
                    if (childAt != null && itemOperator.evaluate((ItemInfo) childAt.getTag(), childAt)) {
                        return childAt;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.android.launcher3.PagedView
    public void notifyPageSwitchListener(int i10) {
        super.notifyPageSwitchListener(i10);
        Folder folder = this.mFolder;
        if (folder != null) {
            folder.updateTextViewFocus();
        }
    }

    @Override // com.android.launcher3.PagedView
    public void onPageBeginTransition() {
        verifyVisibleHighResIcons(getCurrentPage() - 1);
        verifyVisibleHighResIcons(getCurrentPage() + 1);
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        ((PageIndicatorDots) this.mPageIndicator).setScroll(i10, this.mMaxScrollX);
    }

    public boolean rankOnCurrentPage(int i10) {
        return i10 / this.mMaxItemsPerPage == getNextPage();
    }

    public void realTimeReorder(int i10, int i11) {
        int i12;
        int i13;
        final int i14 = i10;
        completePendingPageChanges();
        int nextPage = getNextPage();
        int i15 = this.mMaxItemsPerPage;
        int i16 = i11 / i15;
        int i17 = i11 % i15;
        if (i16 != nextPage) {
            Log.e(TAG, "Cannot animate when the target cell is invisible");
        }
        int i18 = this.mMaxItemsPerPage;
        int i19 = i14 % i18;
        int i20 = i14 / i18;
        if (i11 == i14) {
            return;
        }
        int i21 = -1;
        if (i11 > i14) {
            if (i20 < nextPage) {
                i21 = nextPage * i18;
                i19 = 0;
            } else {
                i14 = -1;
            }
            i13 = 1;
        } else {
            if (i20 > nextPage) {
                i12 = ((nextPage + 1) * i18) - 1;
                i19 = i18 - 1;
            } else {
                i14 = -1;
                i12 = -1;
            }
            i21 = i12;
            i13 = -1;
        }
        while (i14 != i21) {
            int i22 = i14 + i13;
            int i23 = this.mMaxItemsPerPage;
            int i24 = i22 / i23;
            int i25 = i22 % i23;
            int i26 = this.mGridCountX;
            int i27 = i25 % i26;
            int i28 = i25 / i26;
            CellLayout pageAt = getPageAt(i24);
            final View childAt = pageAt.getChildAt(i27, i28);
            if (childAt != null) {
                if (nextPage != i24) {
                    pageAt.removeView(childAt);
                    addViewForRank(childAt, (ShortcutInfo) childAt.getTag(), i14);
                } else {
                    final float translationX = childAt.getTranslationX();
                    Runnable runnable = new Runnable() { // from class: com.android.launcher3.folder.FolderPagedView.1
                        @Override // java.lang.Runnable
                        public void run() {
                            FolderPagedView.this.mPendingAnimations.remove(childAt);
                            childAt.setTranslationX(translationX);
                            ((CellLayout) childAt.getParent().getParent()).removeView(childAt);
                            FolderPagedView folderPagedView = FolderPagedView.this;
                            View view = childAt;
                            folderPagedView.addViewForRank(view, (ShortcutInfo) view.getTag(), i14);
                        }
                    };
                    childAt.animate().translationXBy((i13 > 0) ^ this.mIsRtl ? -childAt.getWidth() : childAt.getWidth()).setDuration(230L).setStartDelay(0L).withEndAction(runnable);
                    this.mPendingAnimations.put(childAt, runnable);
                }
            }
            i14 = i22;
        }
        if ((i17 - i19) * i13 <= 0) {
            return;
        }
        CellLayout pageAt2 = getPageAt(nextPage);
        float f10 = 30.0f;
        int i29 = 0;
        while (i19 != i17) {
            int i30 = i19 + i13;
            int i31 = this.mGridCountX;
            View childAt2 = pageAt2.getChildAt(i30 % i31, i30 / i31);
            if (childAt2 != null) {
                ((ItemInfo) childAt2.getTag()).rank -= i13;
            }
            int i32 = this.mGridCountX;
            int i33 = i29;
            if (pageAt2.animateChildToPosition(childAt2, i19 % i32, i19 / i32, REORDER_ANIMATION_DURATION, i29, true, true)) {
                int i34 = (int) (i33 + f10);
                f10 *= VIEW_REORDER_DELAY_FACTOR;
                i29 = i34;
            } else {
                i29 = i33;
            }
            i19 = i30;
        }
    }

    public void removeItem(View view) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            getPageAt(childCount).removeView(view);
        }
    }

    public void setFixedSize(int i10, int i11) {
        int paddingRight = i10 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i11 - (getPaddingBottom() + getPaddingTop());
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            ((CellLayout) getChildAt(childCount)).setFixedSize(paddingRight, paddingBottom);
        }
    }

    public void setFocusOnFirstChild() {
        View childAt = getCurrentCellLayout().getChildAt(0, 0);
        if (childAt != null) {
            childAt.requestFocus();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T extends android.view.View & com.android.launcher3.pageindicators.PageIndicator, android.view.View] */
    public void setFolder(Folder folder) {
        this.mFolder = folder;
        this.mPageIndicator = folder.findViewById(R.id.folder_page_indicator);
        initParentViews(folder);
    }

    public void setupContentDimensions(int i10) {
        this.mAllocatedContentSize = i10;
        int i11 = this.mGridCountX;
        int i12 = this.mGridCountY;
        int i13 = this.mMaxCountX;
        int i14 = this.mMaxCountY;
        int i15 = this.mMaxItemsPerPage;
        int[] iArr = sTmpArray;
        calculateGridSize(i10, i11, i12, i13, i14, i15, iArr);
        this.mGridCountX = iArr[0];
        this.mGridCountY = iArr[1];
        for (int pageCount = getPageCount() - 1; pageCount >= 0; pageCount--) {
            getPageAt(pageCount).setGridSize(this.mGridCountX, this.mGridCountY);
        }
    }

    public void showScrollHint(int i10) {
        int scrollForPage = (getScrollForPage(getNextPage()) + ((int) (((i10 == 0) ^ this.mIsRtl ? -0.07f : SCROLL_HINT_FRACTION) * getWidth()))) - getScrollX();
        if (scrollForPage != 0) {
            this.mScroller.setInterpolator(Interpolators.DEACCEL);
            this.mScroller.startScroll(getScrollX(), 0, scrollForPage, 0, 500);
            invalidate();
        }
    }

    public void verifyVisibleHighResIcons(int i10) {
        CellLayout pageAt = getPageAt(i10);
        if (pageAt != null) {
            ShortcutAndWidgetContainer shortcutsAndWidgets = pageAt.getShortcutsAndWidgets();
            for (int childCount = shortcutsAndWidgets.getChildCount() - 1; childCount >= 0; childCount--) {
                BubbleTextView bubbleTextView = (BubbleTextView) shortcutsAndWidgets.getChildAt(childCount);
                bubbleTextView.verifyHighRes();
                Drawable drawable = bubbleTextView.getCompoundDrawables()[1];
                if (drawable != null) {
                    drawable.setCallback(bubbleTextView);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    @android.annotation.SuppressLint({"RtlHardcoded"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void arrangeChildren(java.util.ArrayList<android.view.View> r26, int r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.folder.FolderPagedView.arrangeChildren(java.util.ArrayList, int, boolean):void");
    }

    @Override // com.android.launcher3.PagedView
    public CellLayout getPageAt(int i10) {
        return (CellLayout) getChildAt(i10);
    }
}

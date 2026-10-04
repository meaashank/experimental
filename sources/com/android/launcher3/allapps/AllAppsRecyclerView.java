package com.android.launcher3.allapps;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.launcher3.BaseRecyclerView;
import com.android.launcher3.DeviceProfile;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.allapps.AlphabeticalAppsList;
import com.android.launcher3.graphics.DrawableFactory;
import com.android.launcher3.logging.UserEventDispatcher;
import com.android.launcher3.userevent.nano.LauncherLogProto;
import com.android.launcher3.views.RecyclerViewFastScroller;
import com.app.hider.master.promax.R;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AllAppsRecyclerView extends BaseRecyclerView implements UserEventDispatcher.LogContainerProvider {
    private AlphabeticalAppsList mApps;
    private SparseIntArray mCachedScrollPositions;
    private AllAppsBackgroundDrawable mEmptySearchBackground;
    private int mEmptySearchBackgroundTopOffset;
    private AllAppsFastScrollHelper mFastScrollHelper;
    private final int mNumAppsPerRow;
    private SparseIntArray mViewHeights;

    public AllAppsRecyclerView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.mViewHeights = new SparseIntArray();
        this.mCachedScrollPositions = new SparseIntArray();
        this.mEmptySearchBackgroundTopOffset = getResources().getDimensionPixelSize(R.dimen.all_apps_empty_search_bg_top_offset);
        this.mNumAppsPerRow = LauncherAppState.getIDP(context).numColumns;
    }

    private void updateEmptySearchBackgroundBounds() {
        if (this.mEmptySearchBackground == null) {
            return;
        }
        int measuredWidth = (getMeasuredWidth() - this.mEmptySearchBackground.getIntrinsicWidth()) / 2;
        int i10 = this.mEmptySearchBackgroundTopOffset;
        AllAppsBackgroundDrawable allAppsBackgroundDrawable = this.mEmptySearchBackground;
        allAppsBackgroundDrawable.setBounds(measuredWidth, i10, allAppsBackgroundDrawable.getIntrinsicWidth() + measuredWidth, this.mEmptySearchBackground.getIntrinsicHeight() + i10);
    }

    private void updatePoolSize() {
        DeviceProfile deviceProfile = Launcher.getLauncher(getContext()).getDeviceProfile();
        RecyclerView.t recycledViewPool = getRecycledViewPool();
        int iCeil = (int) Math.ceil(deviceProfile.availableHeightPx / deviceProfile.allAppsIconSizePx);
        recycledViewPool.l(4, 1);
        recycledViewPool.l(16, 1);
        recycledViewPool.l(8, 1);
        recycledViewPool.l(2, iCeil * this.mNumAppsPerRow);
        this.mViewHeights.clear();
        this.mViewHeights.put(2, deviceProfile.allAppsCellHeightPx);
    }

    @Override // com.android.launcher3.logging.UserEventDispatcher.LogContainerProvider
    public void fillInLogContainerData(View view, ItemInfo itemInfo, LauncherLogProto.Target target, LauncherLogProto.Target target2) {
        if (this.mApps.hasFilter()) {
            target2.containerType = 8;
        } else {
            target2.containerType = 4;
        }
    }

    public AlphabeticalAppsList getApps() {
        return this.mApps;
    }

    @Override // com.android.launcher3.BaseRecyclerView
    public int getAvailableScrollHeight() {
        return getPaddingBottom() + ((getCurrentScrollY(getAdapter().getItemCount(), 0) + getPaddingTop()) - getHeight());
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return 0.0f;
    }

    @Override // com.android.launcher3.BaseRecyclerView
    public int getCurrentScrollY() {
        View childAt;
        int childPosition;
        if (this.mApps.getAdapterItems().isEmpty() || this.mNumAppsPerRow == 0 || getChildCount() == 0 || (childPosition = getChildPosition((childAt = getChildAt(0)))) == -1) {
            return -1;
        }
        return getCurrentScrollY(childPosition, getLayoutManager().getDecoratedTop(childAt)) + getPaddingTop();
    }

    @Override // com.android.launcher3.BaseRecyclerView
    public int getScrollBarTop() {
        return getResources().getDimensionPixelOffset(R.dimen.all_apps_header_top_padding);
    }

    @Override // com.android.launcher3.BaseRecyclerView
    public RecyclerViewFastScroller getScrollbar() {
        return this.mScrollbar;
    }

    @Override // android.view.View
    public int getTopPaddingOffset() {
        return -getPaddingTop();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public boolean isPaddingOffsetRequired() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onDraw(Canvas canvas) {
        AllAppsBackgroundDrawable allAppsBackgroundDrawable = this.mEmptySearchBackground;
        if (allAppsBackgroundDrawable != null && allAppsBackgroundDrawable.getAlpha() > 0) {
            this.mEmptySearchBackground.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // com.android.launcher3.BaseRecyclerView
    public void onFastScrollCompleted() {
        this.mFastScrollHelper.onFastScrollCompleted();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AllAppsBackgroundDrawable allAppsBackgroundDrawable;
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (!zOnInterceptTouchEvent && motionEvent.getAction() == 0 && (allAppsBackgroundDrawable = this.mEmptySearchBackground) != null && allAppsBackgroundDrawable.getAlpha() > 0) {
            this.mEmptySearchBackground.setHotspot(motionEvent.getX(), motionEvent.getY());
        }
        return zOnInterceptTouchEvent;
    }

    public void onSearchResultsChanged() {
        scrollToTop();
        if (!this.mApps.hasNoFilteredResults()) {
            AllAppsBackgroundDrawable allAppsBackgroundDrawable = this.mEmptySearchBackground;
            if (allAppsBackgroundDrawable != null) {
                allAppsBackgroundDrawable.setBgAlpha(0.0f);
                return;
            }
            return;
        }
        if (this.mEmptySearchBackground == null) {
            AllAppsBackgroundDrawable allAppsBackground = DrawableFactory.get(getContext()).getAllAppsBackground(getContext());
            this.mEmptySearchBackground = allAppsBackground;
            allAppsBackground.setAlpha(0);
            this.mEmptySearchBackground.setCallback(this);
            updateEmptySearchBackgroundBounds();
        }
        this.mEmptySearchBackground.animateBgAlpha(1.0f, 150);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        updateEmptySearchBackgroundBounds();
        updatePoolSize();
    }

    @Override // com.android.launcher3.BaseRecyclerView
    public void onUpdateScrollbar(int i10) {
        AlphabeticalAppsList alphabeticalAppsList = this.mApps;
        if (alphabeticalAppsList == null) {
            return;
        }
        if (alphabeticalAppsList.getAdapterItems().isEmpty() || this.mNumAppsPerRow == 0) {
            this.mScrollbar.setThumbOffsetY(-1);
            return;
        }
        int currentScrollY = getCurrentScrollY();
        if (currentScrollY < 0) {
            this.mScrollbar.setThumbOffsetY(-1);
            return;
        }
        int availableScrollBarHeight = getAvailableScrollBarHeight();
        int availableScrollHeight = getAvailableScrollHeight();
        if (availableScrollHeight <= 0) {
            this.mScrollbar.setThumbOffsetY(-1);
            return;
        }
        if (!this.mScrollbar.isThumbDetached()) {
            synchronizeScrollBarThumbOffsetToViewScroll(currentScrollY, availableScrollHeight);
            return;
        }
        if (this.mScrollbar.isDraggingThumb()) {
            return;
        }
        int i11 = (int) ((currentScrollY / availableScrollHeight) * availableScrollBarHeight);
        int thumbOffsetY = this.mScrollbar.getThumbOffsetY();
        int i12 = i11 - thumbOffsetY;
        if (i12 * i10 <= 0.0f) {
            this.mScrollbar.setThumbOffsetY(thumbOffsetY);
            return;
        }
        int iMax = Math.max(0, Math.min(availableScrollBarHeight, (i10 < 0 ? Math.max((int) ((i10 * thumbOffsetY) / i11), i12) : Math.min((int) (((availableScrollBarHeight - thumbOffsetY) * i10) / (availableScrollBarHeight - i11)), i12)) + thumbOffsetY));
        this.mScrollbar.setThumbOffsetY(iMax);
        if (i11 == iMax) {
            this.mScrollbar.reattachThumbToScroll();
        }
    }

    @Override // com.android.launcher3.BaseRecyclerView
    public String scrollToPositionAtProgress(float f10) {
        if (this.mApps.getNumAppRows() == 0) {
            return "";
        }
        stopScroll();
        List<AlphabeticalAppsList.FastScrollSectionInfo> fastScrollerSections = this.mApps.getFastScrollerSections();
        AlphabeticalAppsList.FastScrollSectionInfo fastScrollSectionInfo = fastScrollerSections.get(0);
        int i10 = 1;
        while (i10 < fastScrollerSections.size()) {
            AlphabeticalAppsList.FastScrollSectionInfo fastScrollSectionInfo2 = fastScrollerSections.get(i10);
            if (fastScrollSectionInfo2.touchFraction > f10) {
                break;
            }
            i10++;
            fastScrollSectionInfo = fastScrollSectionInfo2;
        }
        this.mFastScrollHelper.smoothScrollToSection(getCurrentScrollY(), getAvailableScrollHeight(), fastScrollSectionInfo);
        return fastScrollSectionInfo.sectionName;
    }

    public void scrollToTop() {
        RecyclerViewFastScroller recyclerViewFastScroller = this.mScrollbar;
        if (recyclerViewFastScroller != null) {
            recyclerViewFastScroller.reattachThumbToScroll();
        }
        scrollToPosition(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        super.setAdapter(adapter);
        adapter.registerAdapterDataObserver(new RecyclerView.i() { // from class: com.android.launcher3.allapps.AllAppsRecyclerView.1
            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onChanged() {
                AllAppsRecyclerView.this.mCachedScrollPositions.clear();
            }
        });
        this.mFastScrollHelper.onSetAdapter((AllAppsGridAdapter) adapter);
    }

    public void setApps(AlphabeticalAppsList alphabeticalAppsList, boolean z10) {
        this.mApps = alphabeticalAppsList;
        this.mFastScrollHelper = new AllAppsFastScrollHelper(this, alphabeticalAppsList);
    }

    @Override // com.android.launcher3.BaseRecyclerView
    public boolean supportsFastScrolling() {
        return !this.mApps.hasFilter();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.mEmptySearchBackground || super.verifyDrawable(drawable);
    }

    public AllAppsRecyclerView(Context context) {
        this(context, null);
    }

    public int getCurrentScrollY(int i10, int i11) {
        List<AlphabeticalAppsList.AdapterItem> adapterItems = this.mApps.getAdapterItems();
        AlphabeticalAppsList.AdapterItem adapterItem = i10 < adapterItems.size() ? adapterItems.get(i10) : null;
        int i12 = this.mCachedScrollPositions.get(i10, -1);
        if (i12 < 0) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                AlphabeticalAppsList.AdapterItem adapterItem2 = adapterItems.get(i14);
                if (AllAppsGridAdapter.isViewType(adapterItem2.viewType, 2)) {
                    if (adapterItem != null && adapterItem.viewType == adapterItem2.viewType && adapterItem.rowIndex == adapterItem2.rowIndex) {
                        break;
                    }
                    if (adapterItem2.rowAppIndex == 0) {
                        i13 += this.mViewHeights.get(adapterItem2.viewType, 0);
                    }
                } else {
                    int measuredHeight = this.mViewHeights.get(adapterItem2.viewType);
                    if (measuredHeight == 0) {
                        RecyclerView.C cFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i14);
                        if (cFindViewHolderForAdapterPosition == null) {
                            RecyclerView.C cCreateViewHolder = getAdapter().createViewHolder(this, adapterItem2.viewType);
                            getAdapter().onBindViewHolder(cCreateViewHolder, i14);
                            cCreateViewHolder.itemView.measure(0, 0);
                            measuredHeight = cCreateViewHolder.itemView.getMeasuredHeight();
                            getRecycledViewPool().j(cCreateViewHolder);
                        } else {
                            measuredHeight = cFindViewHolderForAdapterPosition.itemView.getMeasuredHeight();
                        }
                    }
                    i13 += measuredHeight;
                }
            }
            this.mCachedScrollPositions.put(i10, i13);
            i12 = i13;
        }
        return i12 - i11;
    }

    public AllAppsRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public AllAppsRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }
}

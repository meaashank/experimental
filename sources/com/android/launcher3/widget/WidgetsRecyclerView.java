package com.android.launcher3.widget;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.launcher3.BaseRecyclerView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public class WidgetsRecyclerView extends BaseRecyclerView implements RecyclerView.q {
    private WidgetsListAdapter mAdapter;
    private final Point mFastScrollerOffset;
    private final int mScrollbarTop;
    private boolean mTouchDownOnScroller;

    public WidgetsRecyclerView(Context context) {
        this(context, null);
    }

    private boolean isModelNotReady() {
        return this.mAdapter.getItemCount() == 0;
    }

    @Override // com.android.launcher3.BaseRecyclerView
    public int getAvailableScrollHeight() {
        return ((this.mAdapter.getItemCount() * getChildAt(0).getMeasuredHeight()) - getScrollbarTrackHeight()) - this.mScrollbarTop;
    }

    @Override // com.android.launcher3.BaseRecyclerView
    public int getCurrentScrollY() {
        if (isModelNotReady() || getChildCount() == 0) {
            return -1;
        }
        View childAt = getChildAt(0);
        int measuredHeight = childAt.getMeasuredHeight() * getChildPosition(childAt);
        return (getPaddingTop() + measuredHeight) - getLayoutManager().getDecoratedTop(childAt);
    }

    @Override // com.android.launcher3.BaseRecyclerView
    public int getScrollBarTop() {
        return this.mScrollbarTop;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setLayoutManager(new LinearLayoutManager(getContext()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.mTouchDownOnScroller = this.mScrollbar.isHitInParent(motionEvent.getX(), motionEvent.getY(), this.mFastScrollerOffset);
        }
        if (this.mTouchDownOnScroller) {
            return this.mScrollbar.handleTouchEvent(motionEvent, this.mFastScrollerOffset);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onRequestDisallowInterceptTouchEvent(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.mTouchDownOnScroller) {
            this.mScrollbar.handleTouchEvent(motionEvent, this.mFastScrollerOffset);
        }
    }

    @Override // com.android.launcher3.BaseRecyclerView
    public void onUpdateScrollbar(int i10) {
        if (isModelNotReady()) {
            return;
        }
        int currentScrollY = getCurrentScrollY();
        if (currentScrollY < 0) {
            this.mScrollbar.setThumbOffsetY(-1);
        } else {
            synchronizeScrollBarThumbOffsetToViewScroll(currentScrollY, getAvailableScrollHeight());
        }
    }

    @Override // com.android.launcher3.BaseRecyclerView
    public String scrollToPositionAtProgress(float f10) {
        if (isModelNotReady()) {
            return "";
        }
        stopScroll();
        float itemCount = this.mAdapter.getItemCount() * f10;
        ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(0, (int) (-(getAvailableScrollHeight() * f10)));
        if (f10 == 1.0f) {
            itemCount -= 1.0f;
        }
        return this.mAdapter.getSectionName((int) itemCount);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        super.setAdapter(adapter);
        this.mAdapter = (WidgetsListAdapter) adapter;
    }

    public WidgetsRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WidgetsRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mFastScrollerOffset = new Point();
        this.mScrollbarTop = getResources().getDimensionPixelSize(R.dimen.dynamic_grid_edge_margin);
        addOnItemTouchListener(this);
    }

    public WidgetsRecyclerView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10);
    }
}

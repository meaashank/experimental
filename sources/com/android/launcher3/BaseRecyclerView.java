package com.android.launcher3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.launcher3.views.RecyclerViewFastScroller;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseRecyclerView extends RecyclerView {
    protected RecyclerViewFastScroller mScrollbar;

    public BaseRecyclerView(Context context) {
        this(context, null);
    }

    public void bindFastScrollbar() {
        ViewGroup viewGroup = (ViewGroup) getParent().getParent();
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) viewGroup.findViewById(com.app.hider.master.promax.R.id.fast_scroller);
        this.mScrollbar = recyclerViewFastScroller;
        recyclerViewFastScroller.setRecyclerView(this, (TextView) viewGroup.findViewById(com.app.hider.master.promax.R.id.fast_scroller_popup));
        onUpdateScrollbar(0);
    }

    public int getAvailableScrollBarHeight() {
        return getScrollbarTrackHeight() - this.mScrollbar.getThumbHeight();
    }

    public abstract int getAvailableScrollHeight();

    public abstract int getCurrentScrollY();

    public int getScrollBarTop() {
        return getPaddingTop();
    }

    public RecyclerViewFastScroller getScrollbar() {
        return this.mScrollbar;
    }

    public int getScrollbarTrackHeight() {
        return (this.mScrollbar.getHeight() - getScrollBarTop()) - getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        bindFastScrollbar();
    }

    public void onFastScrollCompleted() {
    }

    public abstract void onUpdateScrollbar(int i10);

    public abstract String scrollToPositionAtProgress(float f10);

    public boolean shouldContainerScroll(MotionEvent motionEvent, View view) {
        int[] iArr = {(int) motionEvent.getX(), (int) motionEvent.getY()};
        Utilities.mapCoordInSelfToDescendant(this.mScrollbar, view, iArr);
        return !this.mScrollbar.shouldBlockIntercept(iArr[0], iArr[1]) && getCurrentScrollY() == 0;
    }

    public boolean supportsFastScrolling() {
        return true;
    }

    public void synchronizeScrollBarThumbOffsetToViewScroll(int i10, int i11) {
        if (i11 <= 0) {
            this.mScrollbar.setThumbOffsetY(-1);
        } else {
            this.mScrollbar.setThumbOffsetY((int) ((i10 / i11) * getAvailableScrollBarHeight()));
        }
    }

    public BaseRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public BaseRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}

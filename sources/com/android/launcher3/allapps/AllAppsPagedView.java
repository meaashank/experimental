package com.android.launcher3.allapps;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.launcher3.PagedView;

/* JADX INFO: loaded from: classes2.dex */
public class AllAppsPagedView extends PagedView<PersonalWorkSlidingTabStrip> {
    static final float MAX_SWIPE_ANGLE = 1.0471976f;
    static final float START_DAMPING_TOUCH_SLOP_ANGLE = 0.5235988f;
    static final float TOUCH_SLOP_DAMPING_FACTOR = 4.0f;

    public AllAppsPagedView(Context context) {
        this(context, null);
    }

    @Override // com.android.launcher3.PagedView
    public void determineScrollingStart(MotionEvent motionEvent) {
        float fAbs = Math.abs(motionEvent.getX() - getDownMotionX());
        float fAbs2 = Math.abs(motionEvent.getY() - getDownMotionY());
        if (Float.compare(fAbs, 0.0f) == 0) {
            return;
        }
        float fAtan = (float) Math.atan(fAbs2 / fAbs);
        float f10 = this.mTouchSlop;
        if (fAbs > f10 || fAbs2 > f10) {
            cancelCurrentPageLongPress();
        }
        if (fAtan > MAX_SWIPE_ANGLE) {
            return;
        }
        if (fAtan > START_DAMPING_TOUCH_SLOP_ANGLE) {
            super.determineScrollingStart(motionEvent, (((float) Math.sqrt((fAtan - START_DAMPING_TOUCH_SLOP_ANGLE) / START_DAMPING_TOUCH_SLOP_ANGLE)) * 4.0f) + 1.0f);
        } else {
            super.determineScrollingStart(motionEvent);
        }
    }

    @Override // com.android.launcher3.PagedView
    public String getCurrentPageDescription() {
        return "";
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        ((PersonalWorkSlidingTabStrip) this.mPageIndicator).setScroll(i10, this.mMaxScrollX);
    }

    public AllAppsPagedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AllAppsPagedView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}

package com.android.launcher3.allapps;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.android.launcher3.allapps.AllAppsContainerView;
import com.android.launcher3.anim.Interpolators;
import com.android.launcher3.anim.PropertySetter;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public class FloatingHeaderView extends LinearLayout implements ValueAnimator.AnimatorUpdateListener {
    private boolean mAllowTouchForwarding;
    private final ValueAnimator mAnimator;
    private final Rect mClip;
    private AllAppsRecyclerView mCurrentRV;
    private boolean mForwardToRecyclerView;
    private boolean mHeaderCollapsed;
    private AllAppsRecyclerView mMainRV;
    private boolean mMainRVActive;
    protected int mMaxTranslation;
    private final RecyclerView.r mOnScrollListener;
    private ViewGroup mParent;
    private int mSnappedScrolledY;
    protected ViewGroup mTabLayout;
    protected boolean mTabsHidden;
    private final Point mTempOffset;
    private int mTranslationY;
    private AllAppsRecyclerView mWorkRV;

    public FloatingHeaderView(@NonNull Context context) {
        this(context, null);
    }

    private void calcOffset(Point point) {
        point.x = (getLeft() - this.mCurrentRV.getLeft()) - this.mParent.getLeft();
        point.y = (getTop() - this.mCurrentRV.getTop()) - this.mParent.getTop();
    }

    private boolean canSnapAt(int i10) {
        return Math.abs(i10) <= this.mMaxTranslation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moved(int i10) {
        boolean z10 = this.mHeaderCollapsed;
        if (z10) {
            if (i10 > this.mSnappedScrolledY) {
                this.mHeaderCollapsed = false;
            } else if (canSnapAt(i10)) {
                this.mSnappedScrolledY = i10;
            }
            this.mTranslationY = i10;
            return;
        }
        if (z10) {
            return;
        }
        int i11 = i10 - this.mSnappedScrolledY;
        int i12 = this.mMaxTranslation;
        int i13 = i11 - i12;
        this.mTranslationY = i13;
        if (i13 >= 0) {
            this.mTranslationY = 0;
            this.mSnappedScrolledY = i10 - i12;
        } else if (i13 <= (-i12)) {
            this.mHeaderCollapsed = true;
            this.mSnappedScrolledY = -i12;
        }
    }

    private AllAppsRecyclerView setupRV(AllAppsRecyclerView allAppsRecyclerView, AllAppsRecyclerView allAppsRecyclerView2) {
        if (allAppsRecyclerView != allAppsRecyclerView2 && allAppsRecyclerView2 != null) {
            allAppsRecyclerView2.addOnScrollListener(this.mOnScrollListener);
        }
        return allAppsRecyclerView2;
    }

    public void allowTouchForwarding(boolean z10) {
        this.mAllowTouchForwarding = z10;
    }

    public void apply() {
        int iMax = Math.max(this.mTranslationY, -this.mMaxTranslation);
        this.mTranslationY = iMax;
        this.mTabLayout.setTranslationY(iMax);
        Rect rect = this.mClip;
        rect.top = this.mMaxTranslation + this.mTranslationY;
        this.mMainRV.setClipBounds(rect);
        AllAppsRecyclerView allAppsRecyclerView = this.mWorkRV;
        if (allAppsRecyclerView != null) {
            allAppsRecyclerView.setClipBounds(this.mClip);
        }
    }

    public void applyScroll(int i10, int i11) {
    }

    public int getMaxTranslation() {
        int i10 = this.mMaxTranslation;
        return (i10 == 0 && this.mTabsHidden) ? getResources().getDimensionPixelSize(R.dimen.all_apps_search_bar_bottom_padding) : (i10 <= 0 || !this.mTabsHidden) ? i10 : getPaddingTop() + i10;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public boolean hasVisibleContent() {
        return false;
    }

    public boolean isExpanded() {
        return !this.mHeaderCollapsed;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.mTranslationY = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        apply();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mTabLayout = (ViewGroup) findViewById(R.id.tabs);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mAllowTouchForwarding) {
            this.mForwardToRecyclerView = false;
            return super.onInterceptTouchEvent(motionEvent);
        }
        calcOffset(this.mTempOffset);
        Point point = this.mTempOffset;
        motionEvent.offsetLocation(point.x, point.y);
        this.mForwardToRecyclerView = this.mCurrentRV.onInterceptTouchEvent(motionEvent);
        Point point2 = this.mTempOffset;
        motionEvent.offsetLocation(-point2.x, -point2.y);
        return this.mForwardToRecyclerView || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mForwardToRecyclerView) {
            return super.onTouchEvent(motionEvent);
        }
        calcOffset(this.mTempOffset);
        Point point = this.mTempOffset;
        motionEvent.offsetLocation(point.x, point.y);
        try {
            return this.mCurrentRV.onTouchEvent(motionEvent);
        } finally {
            Point point2 = this.mTempOffset;
            motionEvent.offsetLocation(-point2.x, -point2.y);
        }
    }

    public void reset(boolean z10) {
        if (this.mAnimator.isStarted()) {
            this.mAnimator.cancel();
        }
        if (z10) {
            this.mAnimator.setIntValues(this.mTranslationY, 0);
            this.mAnimator.addUpdateListener(this);
            this.mAnimator.setDuration(150L);
            this.mAnimator.start();
        } else {
            this.mTranslationY = 0;
            apply();
        }
        this.mHeaderCollapsed = false;
        this.mSnappedScrolledY = -this.mMaxTranslation;
        this.mCurrentRV.scrollToTop();
    }

    public void setContentVisibility(boolean z10, boolean z11, PropertySetter propertySetter) {
        propertySetter.setViewAlpha(this, z11 ? 1.0f : 0.0f, Interpolators.LINEAR);
        allowTouchForwarding(z11);
    }

    public void setMainActive(boolean z10) {
        this.mCurrentRV = z10 ? this.mMainRV : this.mWorkRV;
        this.mMainRVActive = z10;
    }

    public void setup(AllAppsContainerView.AdapterHolder[] adapterHolderArr, boolean z10) {
        this.mTabsHidden = z10;
        this.mTabLayout.setVisibility(z10 ? 8 : 0);
        this.mMainRV = setupRV(this.mMainRV, adapterHolderArr[0].recyclerView);
        boolean z11 = true;
        this.mWorkRV = setupRV(this.mWorkRV, adapterHolderArr[1].recyclerView);
        this.mParent = (ViewGroup) this.mMainRV.getParent();
        if (!this.mMainRVActive && this.mWorkRV != null) {
            z11 = false;
        }
        setMainActive(z11);
        reset(false);
    }

    public FloatingHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mClip = new Rect(0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.mAnimator = ValueAnimator.ofInt(0, 0);
        this.mTempOffset = new Point();
        this.mOnScrollListener = new RecyclerView.r() { // from class: com.android.launcher3.allapps.FloatingHeaderView.1
            @Override // androidx.recyclerview.widget.RecyclerView.r
            public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.r
            public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
                if (recyclerView != FloatingHeaderView.this.mCurrentRV) {
                    return;
                }
                if (FloatingHeaderView.this.mAnimator.isStarted()) {
                    FloatingHeaderView.this.mAnimator.cancel();
                }
                FloatingHeaderView.this.moved(-FloatingHeaderView.this.mCurrentRV.getCurrentScrollY());
                FloatingHeaderView.this.apply();
            }
        };
        this.mMainRVActive = true;
    }
}

package com.android.launcher3;

import android.animation.LayoutTransition;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.ScrollView;
import androidx.compose.animation.W;
import com.android.launcher3.anim.Interpolators;
import com.android.launcher3.compat.AccessibilityManagerCompat;
import com.android.launcher3.pageindicators.PageIndicator;
import com.android.launcher3.touch.OverScroll;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PagedView<T extends View & PageIndicator> extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final int FLING_THRESHOLD_VELOCITY = 500;
    protected static final int INVALID_PAGE = -1;
    protected static final int INVALID_POINTER = -1;
    public static final int INVALID_RESTORE_PAGE = -1001;
    private static final float MAX_SCROLL_PROGRESS = 1.0f;
    private static final int MIN_FLING_VELOCITY = 250;
    private static final int MIN_SNAP_VELOCITY = 1500;
    private static final int OVERSCROLL_PAGE_SNAP_ANIMATION_DURATION = 270;
    public static final int PAGE_SNAP_ANIMATION_DURATION = 750;
    private static final float RETURN_TO_ORIGINAL_PAGE_THRESHOLD = 0.33f;
    private static final float SIGNIFICANT_MOVE_THRESHOLD = 0.4f;
    public static final int SLOW_PAGE_SNAP_ANIMATION_DURATION = 950;
    private static final String TAG = "PagedView";
    protected static final int TOUCH_STATE_NEXT_PAGE = 3;
    protected static final int TOUCH_STATE_PREV_PAGE = 2;
    protected static final int TOUCH_STATE_REST = 0;
    protected static final int TOUCH_STATE_SCROLLING = 1;
    protected int mActivePointerId;
    protected boolean mAllowOverScroll;

    @ViewDebug.ExportedProperty(category = "launcher")
    protected int mCurrentPage;
    private Interpolator mDefaultInterpolator;
    private float mDownMotionX;
    private float mDownMotionY;
    protected boolean mFirstLayout;
    protected int mFlingThresholdVelocity;
    private boolean mFreeScroll;
    protected final Rect mInsets;
    protected boolean mIsLayoutValid;
    protected boolean mIsPageInTransition;
    protected boolean mIsRtl;
    private float mLastMotionX;
    private float mLastMotionXRemainder;
    protected int mMaxScrollX;
    private int mMaximumVelocity;
    protected int mMinFlingVelocity;
    protected int mMinSnapVelocity;

    @ViewDebug.ExportedProperty(category = "launcher")
    protected int mNextPage;
    protected int mOverScrollX;
    protected T mPageIndicator;
    int mPageIndicatorViewId;
    protected int[] mPageScrolls;
    protected int mPageSpacing;
    protected LauncherScroller mScroller;
    private boolean mSettleOnPageInFreeScroll;
    private int[] mTmpIntPair;
    private float mTotalMotionX;
    protected int mTouchSlop;
    protected int mTouchState;
    protected int mUnboundedScrollX;
    private VelocityTracker mVelocityTracker;
    protected boolean mWasInOverscroll;
    protected static final ComputePageScrollsLogic SIMPLE_SCROLL_LOGIC = new E();
    private static final Matrix sTmpInvMatrix = new Matrix();
    private static final float[] sTmpPoint = new float[2];
    private static final Rect sTmpRect = new Rect();

    public interface ComputePageScrollsLogic {
        boolean shouldIncludeView(View view);
    }

    public PagedView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ boolean a(View view) {
        return view.getVisibility() != 8;
    }

    private void abortScrollerAnimation(boolean z10) {
        this.mScroller.abortAnimation();
        if (z10) {
            this.mNextPage = -1;
            pageEndTransition();
        }
    }

    private void acquireVelocityTrackerAndAddMovement(MotionEvent motionEvent) {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
    }

    private void dispatchPageCountChanged() {
        T t10 = this.mPageIndicator;
        if (t10 != null) {
            t10.setMarkersCount(getChildCount());
        }
        invalidate();
    }

    private float distanceInfluenceForSnapDuration(float f10) {
        return (float) Math.sin((float) (((double) (f10 - 0.5f)) * 0.4712389167638204d));
    }

    private void forceFinishScroller(boolean z10) {
        this.mScroller.forceFinished(true);
        if (z10) {
            this.mNextPage = -1;
            pageEndTransition();
        }
    }

    private boolean isTouchPointInViewportWithBuffer(int i10, int i11) {
        Rect rect = sTmpRect;
        rect.set((-getMeasuredWidth()) / 2, 0, (getMeasuredWidth() * 3) / 2, getMeasuredHeight());
        return rect.contains(i10, i11);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.mActivePointerId) {
            int i10 = action == 0 ? 1 : 0;
            float x10 = motionEvent.getX(i10);
            this.mDownMotionX = x10;
            this.mLastMotionX = x10;
            this.mLastMotionXRemainder = 0.0f;
            this.mActivePointerId = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void releaseVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void resetTouchState() {
        releaseVelocityTracker();
        this.mTouchState = 0;
        this.mActivePointerId = -1;
    }

    private void sendScrollAccessibilityEvent() {
        if (!AccessibilityManagerCompat.isObservedEventType(getContext(), 4096) || this.mCurrentPage == getNextPage()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(4096);
        accessibilityEventObtain.setScrollable(true);
        accessibilityEventObtain.setScrollX(getScrollX());
        accessibilityEventObtain.setScrollY(getScrollY());
        accessibilityEventObtain.setMaxScrollX(this.mMaxScrollX);
        accessibilityEventObtain.setMaxScrollY(0);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void setEnableFreeScroll(boolean z10) {
        boolean z11 = this.mFreeScroll;
        this.mFreeScroll = z10;
        if (z10) {
            setCurrentPage(getNextPage());
        } else if (z11) {
            snapToPage(getNextPage());
        }
        setEnableOverscroll(!z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMaxScrollX() {
        this.mMaxScrollX = computeMaxScrollX();
    }

    private void updatePageIndicator() {
        T t10 = this.mPageIndicator;
        if (t10 != null) {
            t10.setActiveMarker(getNextPage());
        }
    }

    private int validateNewPage(int i10) {
        return Utilities.boundToRange(i10, 0, getPageCount() - 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int i12 = this.mCurrentPage;
        if (i12 >= 0 && i12 < getPageCount()) {
            getPageAt(this.mCurrentPage).addFocusables(arrayList, i10, i11);
        }
        if (i10 == 17) {
            int i13 = this.mCurrentPage;
            if (i13 > 0) {
                getPageAt(i13 - 1).addFocusables(arrayList, i10, i11);
                return;
            }
            return;
        }
        if (i10 != 66 || this.mCurrentPage >= getPageCount() - 1) {
            return;
        }
        getPageAt(this.mCurrentPage + 1).addFocusables(arrayList, i10, i11);
    }

    public void announcePageForAccessibility() {
        if (AccessibilityManagerCompat.isAccessibilityEnabled(getContext())) {
            announceForAccessibility(getCurrentPageDescription());
        }
    }

    public void callViewScroll(int i10, int i11) {
        super.scrollTo(i10, i11);
    }

    public boolean canAnnouncePageDescription() {
        return true;
    }

    public void cancelCurrentPageLongPress() {
        View pageAt = getPageAt(this.mCurrentPage);
        if (pageAt != null) {
            pageAt.cancelLongPress();
        }
    }

    public int computeMaxScrollX() {
        int childCount = getChildCount();
        if (childCount > 0) {
            return getScrollForPage(this.mIsRtl ? 0 : childCount - 1);
        }
        return 0;
    }

    @Override // android.view.View
    public void computeScroll() {
        computeScrollHelper();
    }

    public boolean computeScrollHelper() {
        return computeScrollHelper(true);
    }

    public void dampedOverScroll(float f10) {
        if (Float.compare(f10, 0.0f) == 0) {
            return;
        }
        int iDampedScroll = OverScroll.dampedScroll(f10, getMeasuredWidth());
        if (f10 < 0.0f) {
            this.mOverScrollX = iDampedScroll;
            super.scrollTo(iDampedScroll, getScrollY());
        } else {
            int i10 = this.mMaxScrollX + iDampedScroll;
            this.mOverScrollX = i10;
            super.scrollTo(i10, getScrollY());
        }
        invalidate();
    }

    public void determineScrollingStart(MotionEvent motionEvent) {
        determineScrollingStart(motionEvent, 1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchUnhandledMove(View view, int i10) {
        if (super.dispatchUnhandledMove(view, i10)) {
            return true;
        }
        if (this.mIsRtl) {
            if (i10 == 17) {
                i10 = 66;
            } else if (i10 == 66) {
                i10 = 17;
            }
        }
        if (i10 == 17) {
            if (getCurrentPage() <= 0) {
                return false;
            }
            snapToPage(getCurrentPage() - 1);
            return true;
        }
        if (i10 != 66 || getCurrentPage() >= getPageCount() - 1) {
            return false;
        }
        snapToPage(getCurrentPage() + 1);
        return true;
    }

    public void enableFreeScroll(boolean z10) {
        setEnableFreeScroll(true);
        this.mSettleOnPageInFreeScroll = z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void focusableViewAvailable(View view) {
        View pageAt = getPageAt(this.mCurrentPage);
        for (View view2 = view; view2 != pageAt; view2 = (View) view2.getParent()) {
            if (view2 == this || !(view2.getParent() instanceof View)) {
                return;
            }
        }
        super.focusableViewAvailable(view);
    }

    @Override // android.view.View
    public void forceLayout() {
        this.mIsLayoutValid = false;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ScrollView.class.getName();
    }

    public int getChildGap() {
        return 0;
    }

    public int getChildOffset(int i10) {
        if (i10 < 0 || i10 > getChildCount() - 1) {
            return 0;
        }
        return getPageAt(i10).getLeft();
    }

    public int getCurrentPage() {
        return this.mCurrentPage;
    }

    public String getCurrentPageDescription() {
        return getContext().getString(com.app.hider.master.promax.R.string.default_scroll_format, Integer.valueOf(getNextPage() + 1), Integer.valueOf(getChildCount()));
    }

    public float getDownMotionX() {
        return this.mDownMotionX;
    }

    public float getDownMotionY() {
        return this.mDownMotionY;
    }

    public int getExpectedHeight() {
        return getMeasuredHeight();
    }

    public int getExpectedWidth() {
        return getMeasuredWidth();
    }

    public int getLayoutTransitionOffsetForPage(int i10) {
        int[] iArr = this.mPageScrolls;
        if (iArr == null || i10 >= iArr.length || i10 < 0) {
            return 0;
        }
        return (int) (getChildAt(i10).getX() - (this.mPageScrolls[i10] + (this.mIsRtl ? getPaddingRight() : getPaddingLeft())));
    }

    public int getNextPage() {
        int i10 = this.mNextPage;
        return i10 != -1 ? i10 : this.mCurrentPage;
    }

    public int getNormalChildHeight() {
        int expectedHeight = (getExpectedHeight() - getPaddingTop()) - getPaddingBottom();
        Rect rect = this.mInsets;
        return (expectedHeight - rect.top) - rect.bottom;
    }

    public int getNormalChildWidth() {
        int expectedWidth = (getExpectedWidth() - getPaddingLeft()) - getPaddingRight();
        Rect rect = this.mInsets;
        return (expectedWidth - rect.left) - rect.right;
    }

    public View getPageAt(int i10) {
        return getChildAt(i10);
    }

    public int getPageCount() {
        return getChildCount();
    }

    public T getPageIndicator() {
        return this.mPageIndicator;
    }

    public int getPageNearestToCenterOfScreen() {
        return getPageNearestToCenterOfScreen(getScrollX());
    }

    public boolean getPageScrolls(int[] iArr, boolean z10, ComputePageScrollsLogic computePageScrollsLogic) {
        int childCount = getChildCount();
        boolean z11 = this.mIsRtl;
        boolean z12 = false;
        if (z11) {
            childCount = -1;
        }
        int i10 = z11 ? -1 : 1;
        int measuredHeight = getMeasuredHeight() + getPaddingTop();
        Rect rect = this.mInsets;
        int paddingBottom = (((measuredHeight + rect.top) - rect.bottom) - getPaddingBottom()) / 2;
        int paddingLeft = getPaddingLeft() + this.mInsets.left;
        int childGap = paddingLeft;
        for (int i11 = z11 ? childCount - 1 : 0; i11 != childCount; i11 += i10) {
            View pageAt = getPageAt(i11);
            if (computePageScrollsLogic.shouldIncludeView(pageAt)) {
                int measuredHeight2 = paddingBottom - (pageAt.getMeasuredHeight() / 2);
                int measuredWidth = pageAt.getMeasuredWidth();
                if (z10) {
                    pageAt.layout(childGap, measuredHeight2, pageAt.getMeasuredWidth() + childGap, pageAt.getMeasuredHeight() + measuredHeight2);
                }
                int i12 = childGap - paddingLeft;
                if (iArr[i11] != i12) {
                    iArr[i11] = i12;
                    z12 = true;
                }
                childGap += getChildGap() + measuredWidth + this.mPageSpacing;
            }
        }
        return z12;
    }

    public int getPageSnapDuration() {
        if (isInOverScroll()) {
            return OVERSCROLL_PAGE_SNAP_ANIMATION_DURATION;
        }
        return 750;
    }

    public int getScrollForPage(int i10) {
        int[] iArr = this.mPageScrolls;
        if (iArr == null || i10 >= iArr.length || i10 < 0) {
            return 0;
        }
        return iArr[i10];
    }

    public float getScrollProgress(int i10, View view, int i11) {
        int scrollForPage = i10 - (getScrollForPage(i11) + (getMeasuredWidth() / 2));
        int childCount = getChildCount();
        int i12 = i11 + 1;
        if ((scrollForPage < 0 && !this.mIsRtl) || (scrollForPage > 0 && this.mIsRtl)) {
            i12 = i11 - 1;
        }
        return Math.max(Math.min(scrollForPage / (((i12 < 0 || i12 > childCount + (-1)) ? view.getMeasuredWidth() + this.mPageSpacing : Math.abs(getScrollForPage(i12) - getScrollForPage(i11))) * 1.0f), 1.0f), -1.0f);
    }

    public int getUnboundedScrollX() {
        return this.mUnboundedScrollX;
    }

    public int[] getVisibleChildrenRange() {
        float f10 = 0.0f;
        float measuredWidth = getMeasuredWidth() + 0.0f;
        float scaleX = getScaleX();
        if (scaleX < 1.0f && scaleX > 0.0f) {
            float measuredWidth2 = getMeasuredWidth() / 2;
            f10 = measuredWidth2 - ((measuredWidth2 - 0.0f) / scaleX);
            measuredWidth = W.a(measuredWidth, measuredWidth2, scaleX, measuredWidth2);
        }
        int childCount = getChildCount();
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < childCount; i12++) {
            float translationX = (getPageAt(i12).getTranslationX() + r8.getLeft()) - getScrollX();
            if (translationX <= measuredWidth && translationX + r8.getMeasuredWidth() >= f10) {
                if (i10 == -1) {
                    i10 = i12;
                }
                i11 = i12;
            }
        }
        int[] iArr = this.mTmpIntPair;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    public int indexToPage(int i10) {
        return i10;
    }

    public void init() {
        this.mScroller = new LauncherScroller(getContext(), null);
        setDefaultInterpolator(Interpolators.SCROLL);
        this.mCurrentPage = 0;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        float f10 = getResources().getDisplayMetrics().density;
        this.mFlingThresholdVelocity = (int) (500.0f * f10);
        this.mMinFlingVelocity = (int) (250.0f * f10);
        this.mMinSnapVelocity = (int) (f10 * 1500.0f);
        if (Utilities.ATLEAST_OREO) {
            setDefaultFocusHighlightEnabled(false);
        }
    }

    public void initParentViews(View view) {
        int i10 = this.mPageIndicatorViewId;
        if (i10 > -1) {
            T t10 = (T) view.findViewById(i10);
            this.mPageIndicator = t10;
            t10.setMarkersCount(getChildCount());
        }
    }

    public boolean isHandlingTouch() {
        return this.mTouchState != 0;
    }

    public boolean isInOverScroll() {
        int i10 = this.mOverScrollX;
        return i10 > this.mMaxScrollX || i10 < 0;
    }

    public boolean isPageInTransition() {
        return this.mIsPageInTransition;
    }

    public boolean isPageOrderFlipped() {
        return false;
    }

    public void notifyPageSwitchListener(int i10) {
        updatePageIndicator();
    }

    public int offsetForPageScrolls() {
        return 0;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float axisValue;
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8) {
            if ((motionEvent.getMetaState() & 1) != 0) {
                axisValue = motionEvent.getAxisValue(9);
                f10 = 0.0f;
            } else {
                f10 = -motionEvent.getAxisValue(9);
                axisValue = motionEvent.getAxisValue(10);
            }
            if (axisValue != 0.0f || f10 != 0.0f) {
                if (!this.mIsRtl ? !(axisValue > 0.0f || f10 > 0.0f) : !(axisValue < 0.0f || f10 < 0.0f)) {
                    scrollRight();
                } else {
                    scrollLeft();
                }
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setScrollable(getPageCount() > 1);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setScrollable(getPageCount() > 1);
        if (getCurrentPage() < getPageCount() - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        if (getCurrentPage() > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        accessibilityNodeInfo.setLongClickable(false);
        accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r5.acquireVelocityTrackerAndAddMovement(r6)
            int r0 = r5.getChildCount()
            if (r0 > 0) goto Le
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        Le:
            int r0 = r6.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L1c
            int r3 = r5.mTouchState
            if (r3 != r2) goto L1c
            goto La8
        L1c:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 3
            r4 = 0
            if (r0 == 0) goto L42
            if (r0 == r2) goto L3e
            if (r0 == r1) goto L35
            if (r0 == r3) goto L3e
            r1 = 6
            if (r0 == r1) goto L2d
            goto La4
        L2d:
            r5.onSecondaryPointerUp(r6)
            r5.releaseVelocityTracker()
            goto La4
        L35:
            int r0 = r5.mActivePointerId
            r1 = -1
            if (r0 == r1) goto La4
            r5.determineScrollingStart(r6)
            goto La4
        L3e:
            r5.resetTouchState()
            goto La4
        L42:
            float r0 = r6.getX()
            float r1 = r6.getY()
            r5.mDownMotionX = r0
            r5.mDownMotionY = r1
            r5.mLastMotionX = r0
            r0 = 0
            r5.mLastMotionXRemainder = r0
            r5.mTotalMotionX = r0
            int r6 = r6.getPointerId(r4)
            r5.mActivePointerId = r6
            com.android.launcher3.LauncherScroller r6 = r5.mScroller
            int r6 = r6.getFinalX()
            com.android.launcher3.LauncherScroller r0 = r5.mScroller
            int r0 = r0.getCurrX()
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            com.android.launcher3.LauncherScroller r0 = r5.mScroller
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L8c
            int r0 = r5.mTouchSlop
            int r0 = r0 / r3
            if (r6 >= r0) goto L7a
            goto L8c
        L7a:
            float r6 = r5.mDownMotionX
            int r6 = (int) r6
            float r0 = r5.mDownMotionY
            int r0 = (int) r0
            boolean r6 = r5.isTouchPointInViewportWithBuffer(r6, r0)
            if (r6 == 0) goto L89
            r5.mTouchState = r2
            goto La4
        L89:
            r5.mTouchState = r4
            goto La4
        L8c:
            r5.mTouchState = r4
            com.android.launcher3.LauncherScroller r6 = r5.mScroller
            boolean r6 = r6.isFinished()
            if (r6 != 0) goto La4
            boolean r6 = r5.mFreeScroll
            if (r6 != 0) goto La4
            int r6 = r5.getNextPage()
            r5.setCurrentPage(r6)
            r5.pageEndTransition()
        La4:
            int r6 = r5.mTouchState
            if (r6 == 0) goto La9
        La8:
            return r2
        La9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.PagedView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int i14;
        this.mIsLayoutValid = true;
        int childCount = getChildCount();
        int[] iArr = this.mPageScrolls;
        if (iArr == null || childCount != iArr.length) {
            this.mPageScrolls = new int[childCount];
            z11 = true;
        } else {
            z11 = false;
        }
        if (childCount == 0) {
            return;
        }
        boolean z12 = getPageScrolls(this.mPageScrolls, true, SIMPLE_SCROLL_LOGIC) ? true : z11;
        LayoutTransition layoutTransition = getLayoutTransition();
        if (layoutTransition == null || !layoutTransition.isRunning()) {
            updateMaxScrollX();
        } else {
            layoutTransition.addTransitionListener(new LayoutTransition.TransitionListener() { // from class: com.android.launcher3.PagedView.1
                @Override // android.animation.LayoutTransition.TransitionListener
                public void endTransition(LayoutTransition layoutTransition2, ViewGroup viewGroup, View view, int i15) {
                    if (layoutTransition2.isRunning()) {
                        return;
                    }
                    layoutTransition2.removeTransitionListener(this);
                    PagedView.this.updateMaxScrollX();
                }

                @Override // android.animation.LayoutTransition.TransitionListener
                public void startTransition(LayoutTransition layoutTransition2, ViewGroup viewGroup, View view, int i15) {
                }
            });
        }
        if (this.mFirstLayout && (i14 = this.mCurrentPage) >= 0 && i14 < childCount) {
            updateCurrentPageScroll();
            this.mFirstLayout = false;
        }
        if (this.mScroller.isFinished() && z12) {
            restoreScrollOnLayout();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (getChildCount() == 0) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode == 0 || mode2 == 0) {
            super.onMeasure(i10, i11);
            return;
        }
        if (size <= 0 || size2 <= 0) {
            super.onMeasure(i10, i11);
            return;
        }
        Rect rect = this.mInsets;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - rect.left) - rect.right, 1073741824);
        Rect rect2 = this.mInsets;
        measureChildren(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec((size2 - rect2.top) - rect2.bottom, 1073741824));
        setMeasuredDimension(size, size2);
    }

    public void onPageBeginTransition() {
    }

    public void onPageEndTransition() {
        this.mWasInOverscroll = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11 = this.mNextPage;
        if (i11 == -1) {
            i11 = this.mCurrentPage;
        }
        View pageAt = getPageAt(i11);
        if (pageAt != null) {
            return pageAt.requestFocus(i10, rect);
        }
        return false;
    }

    public void onScrollInteractionBegin() {
    }

    public void onScrollInteractionEnd() {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int scrollForPage;
        int i10;
        super.onTouchEvent(motionEvent);
        if (getChildCount() <= 0) {
            return super.onTouchEvent(motionEvent);
        }
        acquireVelocityTrackerAndAddMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (!this.mScroller.isFinished()) {
                abortScrollerAnimation(false);
            }
            float x10 = motionEvent.getX();
            this.mLastMotionX = x10;
            this.mDownMotionX = x10;
            this.mDownMotionY = motionEvent.getY();
            this.mLastMotionXRemainder = 0.0f;
            this.mTotalMotionX = 0.0f;
            this.mActivePointerId = motionEvent.getPointerId(0);
            if (this.mTouchState == 1) {
                onScrollInteractionBegin();
                pageBeginTransition();
            }
        } else {
            if (action == 1) {
                int i11 = this.mTouchState;
                if (i11 == 1) {
                    int i12 = this.mActivePointerId;
                    float x11 = motionEvent.getX(motionEvent.findPointerIndex(i12));
                    VelocityTracker velocityTracker = this.mVelocityTracker;
                    velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                    int xVelocity = (int) velocityTracker.getXVelocity(i12);
                    int i13 = (int) (x11 - this.mDownMotionX);
                    float measuredWidth = getPageAt(this.mCurrentPage).getMeasuredWidth();
                    boolean z10 = ((float) Math.abs(i13)) > 0.4f * measuredWidth;
                    float fAbs = Math.abs((this.mLastMotionX + this.mLastMotionXRemainder) - x11) + this.mTotalMotionX;
                    this.mTotalMotionX = fAbs;
                    boolean z11 = fAbs > ((float) this.mTouchSlop) && shouldFlingForVelocity(xVelocity);
                    if (this.mFreeScroll) {
                        if (!this.mScroller.isFinished()) {
                            abortScrollerAnimation(true);
                        }
                        float scaleX = getScaleX();
                        this.mScroller.setInterpolator(this.mDefaultInterpolator);
                        this.mScroller.fling((int) (getScrollX() * scaleX), getScrollY(), (int) ((-xVelocity) * scaleX), 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
                        int finalX = (int) (this.mScroller.getFinalX() / scaleX);
                        this.mNextPage = getPageNearestToCenterOfScreen(finalX);
                        int scrollForPage2 = getScrollForPage(!this.mIsRtl ? 0 : getPageCount() - 1);
                        int scrollForPage3 = getScrollForPage(!this.mIsRtl ? getPageCount() - 1 : 0);
                        if (this.mSettleOnPageInFreeScroll && finalX > 0 && finalX < (scrollForPage = this.mMaxScrollX)) {
                            if (finalX < scrollForPage2 / 2) {
                                scrollForPage = 0;
                            } else if (finalX <= (scrollForPage3 + scrollForPage) / 2) {
                                scrollForPage = getScrollForPage(this.mNextPage);
                            }
                            this.mScroller.setFinalX((int) (getScaleX() * scrollForPage));
                            int duration = 270 - this.mScroller.getDuration();
                            if (duration > 0) {
                                this.mScroller.extendDuration(duration);
                            }
                        }
                        invalidate();
                    } else {
                        boolean z12 = ((float) Math.abs(i13)) > measuredWidth * RETURN_TO_ORIGINAL_PAGE_THRESHOLD && Math.signum((float) xVelocity) != Math.signum((float) i13) && z11;
                        boolean z13 = this.mIsRtl;
                        boolean z14 = !z13 ? i13 >= 0 : i13 <= 0;
                        boolean z15 = !z13 ? xVelocity >= 0 : xVelocity <= 0;
                        if (((z10 && !z14 && !z11) || (z11 && !z15)) && (i10 = this.mCurrentPage) > 0) {
                            if (!z12) {
                                i10--;
                            }
                            snapToPageWithVelocity(i10, xVelocity);
                        } else if (!((z10 && z14 && !z11) || (z11 && z15)) || this.mCurrentPage >= getChildCount() - 1) {
                            snapToDestination();
                        } else {
                            int i14 = this.mCurrentPage;
                            if (!z12) {
                                i14++;
                            }
                            snapToPageWithVelocity(i14, xVelocity);
                        }
                    }
                    onScrollInteractionEnd(xVelocity, false);
                } else if (i11 == 2) {
                    int iMax = Math.max(0, this.mCurrentPage - 1);
                    if (iMax != this.mCurrentPage) {
                        snapToPage(iMax);
                    } else {
                        snapToDestination();
                    }
                } else if (i11 == 3) {
                    int iMin = Math.min(getChildCount() - 1, this.mCurrentPage + 1);
                    if (iMin != this.mCurrentPage) {
                        snapToPage(iMin);
                    } else {
                        snapToDestination();
                    }
                }
                resetTouchState();
                return true;
            }
            if (action != 2) {
                if (action == 3) {
                    if (this.mTouchState == 1) {
                        snapToDestination();
                        onScrollInteractionEnd(0.0f, true);
                    }
                    resetTouchState();
                    return true;
                }
                if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                    releaseVelocityTracker();
                    return true;
                }
            } else {
                if (this.mTouchState != 1) {
                    determineScrollingStart(motionEvent);
                    return true;
                }
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                if (iFindPointerIndex != -1) {
                    float x12 = motionEvent.getX(iFindPointerIndex);
                    float f10 = (this.mLastMotionX + this.mLastMotionXRemainder) - x12;
                    this.mTotalMotionX = Math.abs(f10) + this.mTotalMotionX;
                    if (Math.abs(f10) < 1.0f) {
                        awakenScrollBars();
                        return true;
                    }
                    int i15 = (int) f10;
                    scrollBy(i15, 0);
                    this.mLastMotionX = x12;
                    this.mLastMotionXRemainder = f10 - i15;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        dispatchPageCountChanged();
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mCurrentPage = validateNewPage(this.mCurrentPage);
        dispatchPageCountChanged();
    }

    public void overScroll(float f10) {
        dampedOverScroll(f10);
    }

    public void pageBeginTransition() {
        if (this.mIsPageInTransition) {
            return;
        }
        this.mIsPageInTransition = true;
        onPageBeginTransition();
    }

    public void pageEndTransition() {
        if (this.mIsPageInTransition) {
            this.mIsPageInTransition = false;
            onPageEndTransition();
        }
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        return i10 != 4096 ? i10 == 8192 && scrollLeft() : scrollRight();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        int iIndexToPage = indexToPage(indexOfChild(view));
        if (iIndexToPage < 0 || iIndexToPage == getCurrentPage() || isInTouchMode()) {
            return;
        }
        snapToPage(iIndexToPage);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        int iIndexToPage = indexToPage(indexOfChild(view));
        if (iIndexToPage == this.mCurrentPage && this.mScroller.isFinished()) {
            return false;
        }
        if (z10) {
            setCurrentPage(iIndexToPage);
            return true;
        }
        snapToPage(iIndexToPage);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            getPageAt(this.mCurrentPage).cancelLongPress();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mIsLayoutValid = false;
        super.requestLayout();
    }

    public void restoreScrollOnLayout() {
        setCurrentPage(getNextPage());
    }

    public void scrollAndForceFinish(int i10) {
        scrollTo(i10, 0);
        this.mScroller.setFinalX(i10);
        forceFinishScroller(true);
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        scrollTo(getUnboundedScrollX() + i10, getScrollY() + i11);
    }

    public boolean scrollLeft() {
        if (getNextPage() <= 0) {
            return false;
        }
        snapToPage(getNextPage() - 1);
        return true;
    }

    public boolean scrollRight() {
        if (getNextPage() >= getChildCount() - 1) {
            return false;
        }
        snapToPage(getNextPage() + 1);
        return true;
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (this.mFreeScroll) {
            if (!this.mScroller.isFinished() && (i10 > this.mMaxScrollX || i10 < 0)) {
                forceFinishScroller(false);
            }
            i10 = Utilities.boundToRange(i10, 0, this.mMaxScrollX);
        }
        this.mUnboundedScrollX = i10;
        boolean z10 = this.mIsRtl;
        boolean z11 = !z10 ? i10 >= 0 : i10 <= this.mMaxScrollX;
        boolean z12 = !z10 ? i10 <= this.mMaxScrollX : i10 >= 0;
        if (z11) {
            super.scrollTo(z10 ? this.mMaxScrollX : 0, i11);
            if (this.mAllowOverScroll) {
                this.mWasInOverscroll = true;
                if (this.mIsRtl) {
                    overScroll(i10 - this.mMaxScrollX);
                    return;
                } else {
                    overScroll(i10);
                    return;
                }
            }
            return;
        }
        if (!z12) {
            if (this.mWasInOverscroll) {
                overScroll(0.0f);
                this.mWasInOverscroll = false;
            }
            this.mOverScrollX = i10;
            super.scrollTo(i10, i11);
            return;
        }
        super.scrollTo(z10 ? 0 : this.mMaxScrollX, i11);
        if (this.mAllowOverScroll) {
            this.mWasInOverscroll = true;
            if (this.mIsRtl) {
                overScroll(i10);
            } else {
                overScroll(i10 - this.mMaxScrollX);
            }
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int i10) {
        if (i10 != 4096) {
            super.sendAccessibilityEvent(i10);
        }
    }

    public void setCurrentPage(int i10) {
        if (!this.mScroller.isFinished()) {
            abortScrollerAnimation(true);
        }
        if (getChildCount() == 0) {
            return;
        }
        int i11 = this.mCurrentPage;
        this.mCurrentPage = validateNewPage(i10);
        updateCurrentPageScroll();
        notifyPageSwitchListener(i11);
        invalidate();
    }

    public void setDefaultInterpolator(Interpolator interpolator) {
        this.mDefaultInterpolator = interpolator;
        this.mScroller.setInterpolator(interpolator);
    }

    public void setEnableOverscroll(boolean z10) {
        this.mAllowOverScroll = z10;
    }

    public void setPageSpacing(int i10) {
        this.mPageSpacing = i10;
        requestLayout();
    }

    public boolean shouldFlingForVelocity(int i10) {
        return Math.abs(i10) > this.mFlingThresholdVelocity;
    }

    public void snapToDestination() {
        snapToPage(getPageNearestToCenterOfScreen(), getPageSnapDuration());
    }

    public boolean snapToPage(int i10) {
        return snapToPage(i10, 750);
    }

    public boolean snapToPageImmediately(int i10) {
        return snapToPage(i10, 750, true, null);
    }

    public boolean snapToPageWithVelocity(int i10, int i11) {
        int iValidateNewPage = validateNewPage(i10);
        int measuredWidth = getMeasuredWidth() / 2;
        int scrollForPage = getScrollForPage(iValidateNewPage) - getUnboundedScrollX();
        if (Math.abs(i11) < this.mMinFlingVelocity) {
            return snapToPage(iValidateNewPage, 750);
        }
        float fMin = Math.min(1.0f, (Math.abs(scrollForPage) * 1.0f) / (measuredWidth * 2));
        float f10 = measuredWidth;
        return snapToPage(iValidateNewPage, scrollForPage, Math.round(Math.abs(((distanceInfluenceForSnapDuration(fMin) * f10) + f10) / Math.max(this.mMinSnapVelocity, Math.abs(i11))) * 1000.0f) * 4);
    }

    public void updateCurrentPageScroll() {
        int i10 = this.mCurrentPage;
        scrollAndForceFinish((i10 < 0 || i10 >= getPageCount()) ? 0 : getScrollForPage(this.mCurrentPage));
    }

    public PagedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getPageNearestToCenterOfScreen(int i10) {
        int measuredWidth = (getMeasuredWidth() / 2) + i10;
        int childCount = getChildCount();
        int i11 = Integer.MAX_VALUE;
        int i12 = -1;
        for (int i13 = 0; i13 < childCount; i13++) {
            int iAbs = Math.abs((getChildOffset(i13) + (getPageAt(i13).getMeasuredWidth() / 2)) - measuredWidth);
            if (iAbs < i11) {
                i12 = i13;
                i11 = iAbs;
            }
        }
        return i12;
    }

    public boolean computeScrollHelper(boolean z10) {
        if (this.mScroller.computeScrollOffset()) {
            if (getUnboundedScrollX() != this.mScroller.getCurrX() || getScrollY() != this.mScroller.getCurrY() || this.mOverScrollX != this.mScroller.getCurrX()) {
                scrollTo(this.mScroller.getCurrX(), this.mScroller.getCurrY());
            }
            if (!z10) {
                return true;
            }
            invalidate();
            return true;
        }
        if (this.mNextPage == -1 || !z10) {
            return false;
        }
        sendScrollAccessibilityEvent();
        int i10 = this.mCurrentPage;
        this.mCurrentPage = validateNewPage(this.mNextPage);
        this.mNextPage = -1;
        notifyPageSwitchListener(i10);
        if (this.mTouchState == 0) {
            pageEndTransition();
        }
        if (!canAnnouncePageDescription()) {
            return false;
        }
        announcePageForAccessibility();
        return false;
    }

    public void determineScrollingStart(MotionEvent motionEvent, float f10) {
        int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
        if (iFindPointerIndex == -1) {
            return;
        }
        float x10 = motionEvent.getX(iFindPointerIndex);
        if (isTouchPointInViewportWithBuffer((int) x10, (int) motionEvent.getY(iFindPointerIndex)) && ((int) Math.abs(x10 - this.mLastMotionX)) > Math.round(f10 * this.mTouchSlop)) {
            this.mTouchState = 1;
            this.mTotalMotionX = Math.abs(this.mLastMotionX - x10) + this.mTotalMotionX;
            this.mLastMotionX = x10;
            this.mLastMotionXRemainder = 0.0f;
            onScrollInteractionBegin();
            pageBeginTransition();
            requestDisallowInterceptTouchEvent(true);
        }
    }

    public void onScrollInteractionEnd(float f10, boolean z10) {
        onScrollInteractionEnd();
    }

    public boolean snapToPage(int i10, int i11) {
        return snapToPage(i10, i11, false, null);
    }

    public PagedView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mFreeScroll = false;
        this.mSettleOnPageInFreeScroll = false;
        this.mFirstLayout = true;
        this.mNextPage = -1;
        this.mPageSpacing = 0;
        this.mTouchState = 0;
        this.mAllowOverScroll = true;
        this.mActivePointerId = -1;
        this.mIsPageInTransition = false;
        this.mWasInOverscroll = false;
        this.mInsets = new Rect();
        this.mTmpIntPair = new int[2];
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PagedView, i10, 0);
        this.mPageIndicatorViewId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        setHapticFeedbackEnabled(false);
        this.mIsRtl = Utilities.isRtl(getResources());
        init();
    }

    public boolean snapToPage(int i10, int i11, TimeInterpolator timeInterpolator) {
        return snapToPage(i10, i11, false, timeInterpolator);
    }

    public boolean snapToPage(int i10, int i11, boolean z10, TimeInterpolator timeInterpolator) {
        int iValidateNewPage = validateNewPage(i10);
        return snapToPage(iValidateNewPage, getScrollForPage(iValidateNewPage) - getUnboundedScrollX(), i11, z10, timeInterpolator);
    }

    public boolean snapToPage(int i10, int i11, int i12) {
        return snapToPage(i10, i11, i12, false, null);
    }

    public boolean snapToPage(int i10, int i11, int i12, boolean z10, TimeInterpolator timeInterpolator) {
        int i13;
        if (this.mFirstLayout) {
            setCurrentPage(i10);
            return false;
        }
        int iAbs = (int) (Settings.System.getFloat(getContext().getContentResolver(), "window_animation_scale", 1.0f) * i12);
        this.mNextPage = validateNewPage(i10);
        awakenScrollBars(iAbs);
        if (z10) {
            i13 = 0;
        } else {
            if (iAbs == 0) {
                iAbs = Math.abs(i11);
            }
            i13 = iAbs;
        }
        if (i13 != 0) {
            pageBeginTransition();
        }
        if (!this.mScroller.isFinished()) {
            abortScrollerAnimation(false);
        }
        if (timeInterpolator != null) {
            this.mScroller.setInterpolator(timeInterpolator);
        } else {
            this.mScroller.setInterpolator(this.mDefaultInterpolator);
        }
        this.mScroller.startScroll(getUnboundedScrollX(), 0, i11, 0, i13);
        updatePageIndicator();
        if (z10) {
            computeScroll();
            pageEndTransition();
        }
        invalidate();
        return Math.abs(i11) > 0;
    }
}

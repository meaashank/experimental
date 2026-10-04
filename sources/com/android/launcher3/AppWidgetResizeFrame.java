package com.android.launcher3;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.launcher3.CellLayout;
import com.android.launcher3.accessibility.DragViewStateAnnouncer;
import com.android.launcher3.dragndrop.DragLayer;
import com.android.launcher3.util.FocusLogic;
import com.android.launcher3.views.BaseDragLayer;
import com.android.launcher3.widget.LauncherAppWidgetHostView;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;

/* JADX INFO: loaded from: classes2.dex */
public class AppWidgetResizeFrame extends AbstractFloatingView implements View.OnKeyListener {
    private static final float DIMMED_HANDLE_ALPHA = 0.0f;
    private static final int HANDLE_COUNT = 4;
    private static final int INDEX_BOTTOM = 3;
    private static final int INDEX_LEFT = 0;
    private static final int INDEX_RIGHT = 2;
    private static final int INDEX_TOP = 1;
    private static final float RESIZE_THRESHOLD = 0.66f;
    private static final int SNAP_DURATION = 150;
    private static Point[] sCellSize;
    private static final Rect sTmpRect = new Rect();
    private final int mBackgroundPadding;
    private final IntRange mBaselineX;
    private final IntRange mBaselineY;
    private boolean mBottomBorderActive;
    private int mBottomTouchRegionAdjustment;
    private CellLayout mCellLayout;
    private int mDeltaX;
    private int mDeltaXAddOn;
    private final IntRange mDeltaXRange;
    private int mDeltaY;
    private int mDeltaYAddOn;
    private final IntRange mDeltaYRange;
    private final int[] mDirectionVector;
    private final View[] mDragHandles;
    private DragLayer mDragLayer;
    private final int[] mLastDirectionVector;
    private final Launcher mLauncher;
    private boolean mLeftBorderActive;
    private int mMinHSpan;
    private int mMinVSpan;
    private int mResizeMode;
    private boolean mRightBorderActive;
    private int mRunningHInc;
    private int mRunningVInc;
    private final DragViewStateAnnouncer mStateAnnouncer;
    private final IntRange mTempRange1;
    private final IntRange mTempRange2;
    private boolean mTopBorderActive;
    private int mTopTouchRegionAdjustment;
    private final int mTouchTargetWidth;
    private Rect mWidgetPadding;
    private LauncherAppWidgetHostView mWidgetView;
    private int mXDown;
    private int mYDown;

    public static class IntRange {
        public int end;
        public int start;

        private IntRange() {
        }

        public void applyDelta(boolean z10, boolean z11, int i10, IntRange intRange) {
            intRange.start = z10 ? this.start + i10 : this.start;
            int i11 = this.end;
            if (z11) {
                i11 += i10;
            }
            intRange.end = i11;
        }

        public int applyDeltaAndBound(boolean z10, boolean z11, int i10, int i11, int i12, IntRange intRange) {
            int size;
            int size2;
            applyDelta(z10, z11, i10, intRange);
            if (intRange.start < 0) {
                intRange.start = 0;
            }
            if (intRange.end > i12) {
                intRange.end = i12;
            }
            if (intRange.size() < i11) {
                if (z10) {
                    intRange.start = intRange.end - i11;
                } else if (z11) {
                    intRange.end = intRange.start + i11;
                }
            }
            if (z11) {
                size = intRange.size();
                size2 = size();
            } else {
                size = size();
                size2 = intRange.size();
            }
            return size - size2;
        }

        public int clamp(int i10) {
            return Utilities.boundToRange(i10, this.start, this.end);
        }

        public void set(int i10, int i11) {
            this.start = i10;
            this.end = i11;
        }

        public int size() {
            return this.end - this.start;
        }

        public IntRange(C3077a c3077a) {
        }
    }

    public AppWidgetResizeFrame(Context context) {
        this(context, null);
    }

    private void getSnappedRectRelativeToDragLayer(Rect rect) {
        float scaleToFit = this.mWidgetView.getScaleToFit();
        this.mDragLayer.getViewRectRelativeToSelf(this.mWidgetView, rect);
        int i10 = this.mBackgroundPadding * 2;
        int iWidth = rect.width();
        Rect rect2 = this.mWidgetPadding;
        int i11 = i10 + ((int) (((iWidth - rect2.left) - rect2.right) * scaleToFit));
        int i12 = this.mBackgroundPadding * 2;
        int iHeight = rect.height();
        int i13 = this.mWidgetPadding.top;
        int i14 = i12 + ((int) (((iHeight - i13) - r4.bottom) * scaleToFit));
        int i15 = rect.left;
        int i16 = this.mBackgroundPadding;
        int i17 = (int) ((r4.left * scaleToFit) + (i15 - i16));
        int i18 = (int) ((scaleToFit * i13) + (rect.top - i16));
        rect.left = i17;
        rect.top = i18;
        rect.right = i17 + i11;
        rect.bottom = i18 + i14;
    }

    private static int getSpanIncrement(float f10) {
        if (Math.abs(f10) > RESIZE_THRESHOLD) {
            return Math.round(f10);
        }
        return 0;
    }

    public static Rect getWidgetSizeRanges(Context context, int i10, int i11, Rect rect) {
        if (sCellSize == null) {
            InvariantDeviceProfile idp = LauncherAppState.getIDP(context);
            Point[] pointArr = new Point[2];
            sCellSize = pointArr;
            pointArr[0] = idp.landscapeProfile.getCellSize();
            sCellSize[1] = idp.portraitProfile.getCellSize();
        }
        if (rect == null) {
            rect = new Rect();
        }
        float f10 = context.getResources().getDisplayMetrics().density;
        Point[] pointArr2 = sCellSize;
        Point point = pointArr2[0];
        int i12 = (int) ((point.x * i10) / f10);
        Point point2 = pointArr2[1];
        rect.set((int) ((i10 * point2.x) / f10), (int) ((point.y * i11) / f10), i12, (int) ((i11 * point2.y) / f10));
        return rect;
    }

    private boolean handleTouchDown(MotionEvent motionEvent) {
        Rect rect = new Rect();
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        getHitRect(rect);
        if (!rect.contains(x10, y10) || !beginResizeIfPointInRegion(x10 - getLeft(), y10 - getTop())) {
            return false;
        }
        this.mXDown = x10;
        this.mYDown = y10;
        return true;
    }

    private void onTouchUp() {
        int cellWidth = this.mCellLayout.getCellWidth();
        int cellHeight = this.mCellLayout.getCellHeight();
        this.mDeltaXAddOn = this.mRunningHInc * cellWidth;
        this.mDeltaYAddOn = this.mRunningVInc * cellHeight;
        this.mDeltaX = 0;
        this.mDeltaY = 0;
        post(new Runnable() { // from class: com.android.launcher3.AppWidgetResizeFrame.1
            @Override // java.lang.Runnable
            public void run() {
                AppWidgetResizeFrame.this.snapToWidget(true);
            }
        });
    }

    private void resizeWidgetIfNeeded(boolean z10) {
        float cellWidth = this.mCellLayout.getCellWidth();
        float cellHeight = this.mCellLayout.getCellHeight();
        int spanIncrement = getSpanIncrement(((this.mDeltaX + this.mDeltaXAddOn) / cellWidth) - this.mRunningHInc);
        int spanIncrement2 = getSpanIncrement(((this.mDeltaY + this.mDeltaYAddOn) / cellHeight) - this.mRunningVInc);
        if (!z10 && spanIncrement == 0 && spanIncrement2 == 0) {
            return;
        }
        int[] iArr = this.mDirectionVector;
        iArr[0] = 0;
        iArr[1] = 0;
        CellLayout.LayoutParams layoutParams = (CellLayout.LayoutParams) this.mWidgetView.getLayoutParams();
        int i10 = layoutParams.cellHSpan;
        int i11 = layoutParams.cellVSpan;
        boolean z11 = layoutParams.useTmpCoords;
        int i12 = z11 ? layoutParams.tmpCellX : layoutParams.cellX;
        int i13 = z11 ? layoutParams.tmpCellY : layoutParams.cellY;
        this.mTempRange1.set(i12, i10 + i12);
        int iApplyDeltaAndBound = this.mTempRange1.applyDeltaAndBound(this.mLeftBorderActive, this.mRightBorderActive, spanIncrement, this.mMinHSpan, this.mCellLayout.getCountX(), this.mTempRange2);
        IntRange intRange = this.mTempRange2;
        int i14 = intRange.start;
        int size = intRange.size();
        if (iApplyDeltaAndBound != 0) {
            this.mDirectionVector[0] = this.mLeftBorderActive ? -1 : 1;
        }
        this.mTempRange1.set(i13, i11 + i13);
        int iApplyDeltaAndBound2 = this.mTempRange1.applyDeltaAndBound(this.mTopBorderActive, this.mBottomBorderActive, spanIncrement2, this.mMinVSpan, this.mCellLayout.getCountY(), this.mTempRange2);
        IntRange intRange2 = this.mTempRange2;
        int i15 = intRange2.start;
        int size2 = intRange2.size();
        if (iApplyDeltaAndBound2 != 0) {
            this.mDirectionVector[1] = this.mTopBorderActive ? -1 : 1;
        }
        if (!z10 && iApplyDeltaAndBound2 == 0 && iApplyDeltaAndBound == 0) {
            return;
        }
        if (z10) {
            int[] iArr2 = this.mDirectionVector;
            int[] iArr3 = this.mLastDirectionVector;
            iArr2[0] = iArr3[0];
            iArr2[1] = iArr3[1];
        } else {
            int[] iArr4 = this.mLastDirectionVector;
            int[] iArr5 = this.mDirectionVector;
            iArr4[0] = iArr5[0];
            iArr4[1] = iArr5[1];
        }
        if (this.mCellLayout.createAreaForResize(i14, i15, size, size2, this.mWidgetView, this.mDirectionVector, z10)) {
            DragViewStateAnnouncer dragViewStateAnnouncer = this.mStateAnnouncer;
            if (dragViewStateAnnouncer != null && (layoutParams.cellHSpan != size || layoutParams.cellVSpan != size2)) {
                dragViewStateAnnouncer.announce(this.mLauncher.getString(com.app.hider.master.promax.R.string.widget_resized, Integer.valueOf(size), Integer.valueOf(size2)));
            }
            layoutParams.tmpCellX = i14;
            layoutParams.tmpCellY = i15;
            layoutParams.cellHSpan = size;
            layoutParams.cellVSpan = size2;
            this.mRunningVInc += iApplyDeltaAndBound2;
            this.mRunningHInc += iApplyDeltaAndBound;
            if (!z10) {
                updateWidgetSizeRanges(this.mWidgetView, this.mLauncher, size, size2);
            }
        }
        this.mWidgetView.requestLayout();
    }

    private void setupForWidget(LauncherAppWidgetHostView launcherAppWidgetHostView, CellLayout cellLayout, DragLayer dragLayer) {
        this.mCellLayout = cellLayout;
        this.mWidgetView = launcherAppWidgetHostView;
        LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo = (LauncherAppWidgetProviderInfo) launcherAppWidgetHostView.getAppWidgetInfo();
        this.mResizeMode = ((AppWidgetProviderInfo) launcherAppWidgetProviderInfo).resizeMode;
        this.mDragLayer = dragLayer;
        this.mMinHSpan = launcherAppWidgetProviderInfo.minSpanX;
        this.mMinVSpan = launcherAppWidgetProviderInfo.minSpanY;
        this.mWidgetPadding = AppWidgetHostView.getDefaultPaddingForWidget(getContext(), launcherAppWidgetHostView.getAppWidgetInfo().provider, null);
        int i10 = this.mResizeMode;
        if (i10 == 1) {
            this.mDragHandles[1].setVisibility(8);
            this.mDragHandles[3].setVisibility(8);
        } else if (i10 == 2) {
            this.mDragHandles[0].setVisibility(8);
            this.mDragHandles[2].setVisibility(8);
        }
        this.mCellLayout.markCellsAsUnoccupiedForView(this.mWidgetView);
        setOnKeyListener(this);
    }

    public static void showForWidget(LauncherAppWidgetHostView launcherAppWidgetHostView, CellLayout cellLayout) {
        Launcher launcher = Launcher.getLauncher(cellLayout.getContext());
        AbstractFloatingView.closeAllOpenViews(launcher, true);
        DragLayer dragLayer = launcher.getDragLayer();
        AppWidgetResizeFrame appWidgetResizeFrame = (AppWidgetResizeFrame) launcher.getLayoutInflater().inflate(com.app.hider.master.promax.R.layout.app_widget_resize_frame, (ViewGroup) dragLayer, false);
        appWidgetResizeFrame.setupForWidget(launcherAppWidgetHostView, cellLayout, dragLayer);
        ((BaseDragLayer.LayoutParams) appWidgetResizeFrame.getLayoutParams()).customPosition = true;
        dragLayer.addView(appWidgetResizeFrame);
        appWidgetResizeFrame.mIsOpen = true;
        appWidgetResizeFrame.snapToWidget(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void snapToWidget(boolean z10) {
        Rect rect = sTmpRect;
        getSnappedRectRelativeToDragLayer(rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i10 = rect.left;
        int i11 = rect.top;
        if (i11 < 0) {
            this.mTopTouchRegionAdjustment = -i11;
        } else {
            this.mTopTouchRegionAdjustment = 0;
        }
        int i12 = i11 + iHeight;
        if (i12 > this.mDragLayer.getHeight()) {
            this.mBottomTouchRegionAdjustment = -(i12 - this.mDragLayer.getHeight());
        } else {
            this.mBottomTouchRegionAdjustment = 0;
        }
        BaseDragLayer.LayoutParams layoutParams = (BaseDragLayer.LayoutParams) getLayoutParams();
        if (z10) {
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = LauncherAnimUtils.ofPropertyValuesHolder(layoutParams, this, PropertyValuesHolder.ofInt(InMobiNetworkValues.WIDTH, ((FrameLayout.LayoutParams) layoutParams).width, iWidth), PropertyValuesHolder.ofInt(InMobiNetworkValues.HEIGHT, ((FrameLayout.LayoutParams) layoutParams).height, iHeight), PropertyValuesHolder.ofInt("x", layoutParams.f136991x, i10), PropertyValuesHolder.ofInt("y", layoutParams.f136992y, i11));
            objectAnimatorOfPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.launcher3.AppWidgetResizeFrame.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AppWidgetResizeFrame.this.requestLayout();
                }
            });
            AnimatorSet animatorSetCreateAnimatorSet = LauncherAnimUtils.createAnimatorSet();
            animatorSetCreateAnimatorSet.play(objectAnimatorOfPropertyValuesHolder);
            for (int i13 = 0; i13 < 4; i13++) {
                animatorSetCreateAnimatorSet.play(LauncherAnimUtils.ofFloat(this.mDragHandles[i13], LinearLayout.ALPHA, 1.0f));
            }
            animatorSetCreateAnimatorSet.setDuration(150L);
            animatorSetCreateAnimatorSet.start();
        } else {
            ((FrameLayout.LayoutParams) layoutParams).width = iWidth;
            ((FrameLayout.LayoutParams) layoutParams).height = iHeight;
            layoutParams.f136991x = i10;
            layoutParams.f136992y = i11;
            for (int i14 = 0; i14 < 4; i14++) {
                this.mDragHandles[i14].setAlpha(1.0f);
            }
            requestLayout();
        }
        setFocusableInTouchMode(true);
        requestFocus();
    }

    public static void updateWidgetSizeRanges(AppWidgetHostView appWidgetHostView, Launcher launcher, int i10, int i11) {
        Rect rect = sTmpRect;
        getWidgetSizeRanges(launcher, i10, i11, rect);
        appWidgetHostView.updateAppWidgetSize(null, rect.left, rect.top, rect.right, rect.bottom);
    }

    public boolean beginResizeIfPointInRegion(int i10, int i11) {
        int i12 = this.mResizeMode;
        boolean z10 = (i12 & 1) != 0;
        boolean z11 = (i12 & 2) != 0;
        this.mLeftBorderActive = i10 < this.mTouchTargetWidth && z10;
        int width = getWidth();
        int i13 = this.mTouchTargetWidth;
        this.mRightBorderActive = i10 > width - i13 && z10;
        this.mTopBorderActive = i11 < i13 + this.mTopTouchRegionAdjustment && z11;
        boolean z12 = i11 > (getHeight() - this.mTouchTargetWidth) + this.mBottomTouchRegionAdjustment && z11;
        this.mBottomBorderActive = z12;
        boolean z13 = this.mLeftBorderActive;
        boolean z14 = z13 || this.mRightBorderActive || this.mTopBorderActive || z12;
        if (z14) {
            this.mDragHandles[0].setAlpha(z13 ? 1.0f : 0.0f);
            this.mDragHandles[2].setAlpha(this.mRightBorderActive ? 1.0f : 0.0f);
            this.mDragHandles[1].setAlpha(this.mTopBorderActive ? 1.0f : 0.0f);
            this.mDragHandles[3].setAlpha(this.mBottomBorderActive ? 1.0f : 0.0f);
        }
        if (this.mLeftBorderActive) {
            this.mDeltaXRange.set(-getLeft(), getWidth() - (this.mTouchTargetWidth * 2));
        } else if (this.mRightBorderActive) {
            this.mDeltaXRange.set((this.mTouchTargetWidth * 2) - getWidth(), this.mDragLayer.getWidth() - getRight());
        } else {
            this.mDeltaXRange.set(0, 0);
        }
        this.mBaselineX.set(getLeft(), getRight());
        if (this.mTopBorderActive) {
            this.mDeltaYRange.set(-getTop(), getHeight() - (this.mTouchTargetWidth * 2));
        } else if (this.mBottomBorderActive) {
            this.mDeltaYRange.set((this.mTouchTargetWidth * 2) - getHeight(), this.mDragLayer.getHeight() - getBottom());
        } else {
            this.mDeltaYRange.set(0, 0);
        }
        this.mBaselineY.set(getTop(), getBottom());
        return z14;
    }

    @Override // com.android.launcher3.AbstractFloatingView
    public void handleClose(boolean z10) {
        this.mDragLayer.removeView(this);
    }

    @Override // com.android.launcher3.AbstractFloatingView
    public boolean isOfType(int i10) {
        return (i10 & 8) != 0;
    }

    @Override // com.android.launcher3.AbstractFloatingView
    public void logActionCommand(int i10) {
    }

    @Override // com.android.launcher3.util.TouchController
    public boolean onControllerInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && handleTouchDown(motionEvent)) {
            return true;
        }
        close(false);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    @Override // com.android.launcher3.AbstractFloatingView, com.android.launcher3.util.TouchController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onControllerTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            float r1 = r5.getX()
            int r1 = (int) r1
            float r2 = r5.getY()
            int r2 = (int) r2
            if (r0 == 0) goto L36
            r5 = 1
            if (r0 == r5) goto L24
            r3 = 2
            if (r0 == r3) goto L1a
            r3 = 3
            if (r0 == r3) goto L24
            goto L35
        L1a:
            int r0 = r4.mXDown
            int r1 = r1 - r0
            int r0 = r4.mYDown
            int r2 = r2 - r0
            r4.visualizeResizeForDelta(r1, r2)
            goto L35
        L24:
            int r0 = r4.mXDown
            int r1 = r1 - r0
            int r0 = r4.mYDown
            int r2 = r2 - r0
            r4.visualizeResizeForDelta(r1, r2)
            r4.onTouchUp()
            r0 = 0
            r4.mYDown = r0
            r4.mXDown = r0
        L35:
            return r5
        L36:
            boolean r5 = r4.handleTouchDown(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.AppWidgetResizeFrame.onControllerTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resizeWidgetIfNeeded(true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ViewGroup viewGroup = (ViewGroup) getChildAt(0);
        for (int i10 = 0; i10 < 4; i10++) {
            this.mDragHandles[i10] = viewGroup.getChildAt(i10);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (!FocusLogic.shouldConsume(i10)) {
            return false;
        }
        close(false);
        this.mWidgetView.requestFocus();
        return true;
    }

    public void visualizeResizeForDelta(int i10, int i11) {
        this.mDeltaX = this.mDeltaXRange.clamp(i10);
        this.mDeltaY = this.mDeltaYRange.clamp(i11);
        BaseDragLayer.LayoutParams layoutParams = (BaseDragLayer.LayoutParams) getLayoutParams();
        int iClamp = this.mDeltaXRange.clamp(i10);
        this.mDeltaX = iClamp;
        this.mBaselineX.applyDelta(this.mLeftBorderActive, this.mRightBorderActive, iClamp, this.mTempRange1);
        IntRange intRange = this.mTempRange1;
        layoutParams.f136991x = intRange.start;
        ((FrameLayout.LayoutParams) layoutParams).width = intRange.size();
        int iClamp2 = this.mDeltaYRange.clamp(i11);
        this.mDeltaY = iClamp2;
        this.mBaselineY.applyDelta(this.mTopBorderActive, this.mBottomBorderActive, iClamp2, this.mTempRange1);
        IntRange intRange2 = this.mTempRange1;
        layoutParams.f136992y = intRange2.start;
        ((FrameLayout.LayoutParams) layoutParams).height = intRange2.size();
        resizeWidgetIfNeeded(false);
        Rect rect = sTmpRect;
        getSnappedRectRelativeToDragLayer(rect);
        if (this.mLeftBorderActive) {
            ((FrameLayout.LayoutParams) layoutParams).width = (rect.width() + rect.left) - layoutParams.f136991x;
        }
        if (this.mTopBorderActive) {
            ((FrameLayout.LayoutParams) layoutParams).height = (rect.height() + rect.top) - layoutParams.f136992y;
        }
        if (this.mRightBorderActive) {
            layoutParams.f136991x = rect.left;
        }
        if (this.mBottomBorderActive) {
            layoutParams.f136992y = rect.top;
        }
        requestLayout();
    }

    public AppWidgetResizeFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppWidgetResizeFrame(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mDragHandles = new View[4];
        this.mDirectionVector = new int[2];
        this.mLastDirectionVector = new int[2];
        this.mTempRange1 = new IntRange();
        this.mTempRange2 = new IntRange();
        this.mDeltaXRange = new IntRange();
        this.mBaselineX = new IntRange();
        this.mDeltaYRange = new IntRange();
        this.mBaselineY = new IntRange();
        this.mTopTouchRegionAdjustment = 0;
        this.mBottomTouchRegionAdjustment = 0;
        this.mLauncher = Launcher.getLauncher(context);
        this.mStateAnnouncer = DragViewStateAnnouncer.createFor(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.app.hider.master.promax.R.dimen.resize_frame_background_padding);
        this.mBackgroundPadding = dimensionPixelSize;
        this.mTouchTargetWidth = dimensionPixelSize * 2;
    }
}

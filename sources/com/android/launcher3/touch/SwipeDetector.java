package com.android.launcher3.touch;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import e.f0;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeDetector {
    private static final float ANIMATION_DURATION = 1200.0f;
    private static final boolean DBG = false;
    public static final int DIRECTION_BOTH = 3;
    public static final int DIRECTION_NEGATIVE = 2;
    public static final int DIRECTION_POSITIVE = 1;
    public static final float RELEASE_VELOCITY_PX_MS = 1.0f;
    public static final float SCROLL_VELOCITY_DAMPENING_RC = 15.915494f;
    private static final String TAG = "SwipeDetector";
    protected int mActivePointerId;
    private long mCurrentMillis;
    private Direction mDir;
    private float mDisplacement;
    private final PointF mDownPos;
    private boolean mIgnoreSlopWhenSettling;
    private float mLastDisplacement;
    private final PointF mLastPos;
    private final Listener mListener;
    private int mScrollConditions;
    private ScrollState mState;
    private float mSubtractDisplacement;
    private final float mTouchSlop;
    private float mVelocity;
    public static final Direction VERTICAL = new AnonymousClass1();
    public static final Direction HORIZONTAL = new AnonymousClass2();

    /* JADX INFO: renamed from: com.android.launcher3.touch.SwipeDetector$1, reason: invalid class name */
    public class AnonymousClass1 extends Direction {
        @Override // com.android.launcher3.touch.SwipeDetector.Direction
        public float getActiveTouchSlop(MotionEvent motionEvent, int i10, PointF pointF) {
            return Math.abs(motionEvent.getX(i10) - pointF.x);
        }

        @Override // com.android.launcher3.touch.SwipeDetector.Direction
        public float getDisplacement(MotionEvent motionEvent, int i10, PointF pointF) {
            return motionEvent.getY(i10) - pointF.y;
        }
    }

    /* JADX INFO: renamed from: com.android.launcher3.touch.SwipeDetector$2, reason: invalid class name */
    public class AnonymousClass2 extends Direction {
        @Override // com.android.launcher3.touch.SwipeDetector.Direction
        public float getActiveTouchSlop(MotionEvent motionEvent, int i10, PointF pointF) {
            return Math.abs(motionEvent.getY(i10) - pointF.y);
        }

        @Override // com.android.launcher3.touch.SwipeDetector.Direction
        public float getDisplacement(MotionEvent motionEvent, int i10, PointF pointF) {
            return motionEvent.getX(i10) - pointF.x;
        }
    }

    public static abstract class Direction {
        public abstract float getActiveTouchSlop(MotionEvent motionEvent, int i10, PointF pointF);

        public abstract float getDisplacement(MotionEvent motionEvent, int i10, PointF pointF);
    }

    public interface Listener {
        boolean onDrag(float f10, float f11);

        void onDragEnd(float f10, boolean z10);

        void onDragStart(boolean z10);
    }

    public enum ScrollState {
        IDLE,
        DRAGGING,
        SETTLING
    }

    public SwipeDetector(@NonNull Context context, @NonNull Listener listener, @NonNull Direction direction) {
        this(ViewConfiguration.get(context).getScaledTouchSlop(), listener, direction);
    }

    public static long calculateDuration(float f10, float f11) {
        float fMax = Math.max(2.0f, Math.abs(f10 * 0.5f));
        return (long) Math.max(100.0f, (ANIMATION_DURATION / fMax) * Math.max(0.2f, f11));
    }

    private static float computeDampeningFactor(float f10) {
        return f10 / (15.915494f + f10);
    }

    private void initializeDragging() {
        if (this.mState == ScrollState.SETTLING && this.mIgnoreSlopWhenSettling) {
            this.mSubtractDisplacement = 0.0f;
        }
        if (this.mDisplacement > 0.0f) {
            this.mSubtractDisplacement = this.mTouchSlop;
        } else {
            this.mSubtractDisplacement = -this.mTouchSlop;
        }
    }

    public static float interpolate(float f10, float f11, float f12) {
        return (f12 * f11) + ((1.0f - f12) * f10);
    }

    private void reportDragEnd() {
        Listener listener = this.mListener;
        float f10 = this.mVelocity;
        listener.onDragEnd(f10, Math.abs(f10) > 1.0f);
    }

    private boolean reportDragStart(boolean z10) {
        this.mListener.onDragStart(!z10);
        return true;
    }

    private boolean reportDragging() {
        float f10 = this.mDisplacement;
        if (f10 != this.mLastDisplacement) {
            this.mLastDisplacement = f10;
            this.mListener.onDrag(f10 - this.mSubtractDisplacement, this.mVelocity);
        }
        return true;
    }

    private void setState(ScrollState scrollState) {
        if (scrollState == ScrollState.DRAGGING) {
            initializeDragging();
            ScrollState scrollState2 = this.mState;
            if (scrollState2 == ScrollState.IDLE) {
                reportDragStart(false);
            } else if (scrollState2 == ScrollState.SETTLING) {
                reportDragStart(true);
            }
        }
        if (scrollState == ScrollState.SETTLING) {
            reportDragEnd();
        }
        this.mState = scrollState;
    }

    private boolean shouldScrollStart(MotionEvent motionEvent, int i10) {
        if (Math.max(this.mDir.getActiveTouchSlop(motionEvent, i10, this.mDownPos), this.mTouchSlop) > Math.abs(this.mDisplacement)) {
            return false;
        }
        int i11 = this.mScrollConditions;
        return ((i11 & 2) > 0 && this.mDisplacement > 0.0f) || ((i11 & 1) > 0 && this.mDisplacement < 0.0f);
    }

    public float computeVelocity(float f10, long j10) {
        long j11 = this.mCurrentMillis;
        this.mCurrentMillis = j10;
        float f11 = j10 - j11;
        float f12 = f11 > 0.0f ? f10 / f11 : 0.0f;
        if (Math.abs(this.mVelocity) < 0.001f) {
            this.mVelocity = f12;
        } else {
            this.mVelocity = interpolate(this.mVelocity, f12, computeDampeningFactor(f11));
        }
        return this.mVelocity;
    }

    public void finishedScrolling() {
        setState(ScrollState.IDLE);
    }

    public int getScrollDirections() {
        return this.mScrollConditions;
    }

    public boolean isDraggingOrSettling() {
        ScrollState scrollState = this.mState;
        return scrollState == ScrollState.DRAGGING || scrollState == ScrollState.SETTLING;
    }

    public boolean isDraggingState() {
        return this.mState == ScrollState.DRAGGING;
    }

    public boolean isIdleState() {
        return this.mState == ScrollState.IDLE;
    }

    public boolean isSettlingState() {
        return this.mState == ScrollState.SETTLING;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.touch.SwipeDetector.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDetectableScrollConditions(int i10, boolean z10) {
        this.mScrollConditions = i10;
        this.mIgnoreSlopWhenSettling = z10;
    }

    public void updateDirection(Direction direction) {
        this.mDir = direction;
    }

    public boolean wasInitialTouchPositive() {
        return this.mSubtractDisplacement < 0.0f;
    }

    @f0
    public SwipeDetector(float f10, @NonNull Listener listener, @NonNull Direction direction) {
        this.mActivePointerId = -1;
        this.mState = ScrollState.IDLE;
        this.mDownPos = new PointF();
        this.mLastPos = new PointF();
        this.mTouchSlop = f10;
        this.mListener = listener;
        this.mDir = direction;
    }
}

package com.prism.hider.negativescreen;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.launcher3.Insettable;

/* JADX INFO: loaded from: classes6.dex */
public class MinusOneScreenView extends FrameLayout implements Insettable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f167787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f167788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f167789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public State f167790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f167791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f167792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ValueAnimator f167793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f167794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f167795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public VelocityTracker f167796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f167797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f167798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f167799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f167800n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f167801o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f167802p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f167803q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f167804r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f167805s;

    public enum State {
        CLOSED,
        DRAGGING,
        SETTLING,
        OPEN
    }

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f167806a;

        public a(boolean z10) {
            this.f167806a = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (MinusOneScreenView.this.f167793g == animator) {
                MinusOneScreenView minusOneScreenView = MinusOneScreenView.this;
                minusOneScreenView.f167793g = null;
                minusOneScreenView.i(this.f167806a);
            }
        }
    }

    public interface b {
        void a(boolean z10);

        void b(float f10);
    }

    public MinusOneScreenView(Context context) {
        this(context, null);
    }

    private void s(float f10) {
        this.f167791e = Float.isNaN(f10) ? 0.0f : Math.max(0.0f, Math.min(1.0f, f10));
        setTranslationX((1.0f - this.f167791e) * (-o()) * getWidth());
        setVisibility(this.f167790d == State.CLOSED ? 4 : 0);
        b bVar = this.f167792f;
        if (bVar != null) {
            bVar.b(this.f167791e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f167805s) {
            return this.f167790d == State.OPEN && super.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            p();
            State state = this.f167790d;
            if (state == State.CLOSED || this.f167794h) {
                return false;
            }
            this.f167804r = this.f167791e >= 0.5f;
            this.f167803q = state == State.SETTLING;
            f();
            this.f167797k = motionEvent.getPointerId(0);
            float translationX = getTranslationX() + motionEvent.getX(0);
            this.f167800n = translationX;
            this.f167798l = translationX;
            this.f167799m = motionEvent.getY();
            this.f167796j = VelocityTracker.obtain();
        }
        if (this.f167797k == -1) {
            return false;
        }
        if (this.f167796j != null) {
            float translationX2 = getTranslationX();
            motionEvent.offsetLocation(translationX2, 0.0f);
            this.f167796j.addMovement(motionEvent);
            motionEvent.offsetLocation(-translationX2, 0.0f);
        }
        if (actionMasked == 6 && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.f167797k) {
            int i10 = motionEvent.getActionIndex() == 0 ? 1 : 0;
            this.f167797k = motionEvent.getPointerId(i10);
            float translationX3 = getTranslationX() + motionEvent.getX(i10);
            this.f167800n = translationX3;
            this.f167798l = translationX3;
            this.f167799m = motionEvent.getY(i10);
            this.f167796j.clear();
        }
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return zDispatchTouchEvent;
        }
        p();
        return zDispatchTouchEvent;
    }

    public void e() {
        if (this.f167805s) {
            f();
            p();
            this.f167794h = true;
            float f10 = this.f167791e;
            this.f167795i = f10;
            this.f167790d = State.DRAGGING;
            s(f10);
        }
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f167793g;
        if (valueAnimator != null) {
            this.f167793g = null;
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
            valueAnimator.removeAllListeners();
        }
    }

    public void g(boolean z10) {
        this.f167794h = false;
        p();
        if (z10) {
            v(false, 0.0f);
        } else {
            f();
            i(false);
        }
    }

    public void h(float f10, boolean z10) {
        if (this.f167794h) {
            this.f167794h = false;
            if (z10) {
                v(this.f167795i >= 0.5f, 0.0f);
            } else {
                u(f10);
            }
        }
    }

    public final void i(boolean z10) {
        this.f167790d = z10 ? State.OPEN : State.CLOSED;
        s(z10 ? 1.0f : 0.0f);
        b bVar = this.f167792f;
        if (bVar != null) {
            bVar.a(z10);
        }
    }

    public float j() {
        return this.f167791e;
    }

    public State k() {
        return this.f167790d;
    }

    public boolean l() {
        return this.f167790d != State.CLOSED;
    }

    public final /* synthetic */ void m(ValueAnimator valueAnimator) {
        s(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void n(boolean z10) {
        this.f167794h = false;
        p();
        if (z10) {
            v(true, 0.0f);
        } else {
            f();
            i(true);
        }
    }

    public final int o() {
        return getLayoutDirection() == 1 ? -1 : 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        g(false);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f167805s) {
            return motionEvent.getActionMasked() == 0 ? this.f167803q : motionEvent.getActionMasked() == 2 && x(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        s(this.f167791e);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        s(this.f167791e);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f167805s) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1) {
                if (this.f167801o) {
                    this.f167796j.computeCurrentVelocity(1000, this.f167789c);
                    u(this.f167796j.getXVelocity(this.f167797k));
                    return true;
                }
                if (this.f167803q) {
                    v(this.f167804r, 0.0f);
                    return true;
                }
                performClick();
                return true;
            }
            if (actionMasked != 2) {
                if (actionMasked == 3 && (this.f167801o || this.f167803q)) {
                    v(this.f167804r, 0.0f);
                    return true;
                }
            } else if (x(motionEvent) && (iFindPointerIndex = motionEvent.findPointerIndex(this.f167797k)) >= 0 && getWidth() > 0) {
                float translationX = getTranslationX() + motionEvent.getX(iFindPointerIndex);
                s((((translationX - this.f167800n) * o()) / getWidth()) + this.f167791e);
                this.f167800n = translationX;
            }
        } else if (this.f167790d != State.OPEN) {
            return false;
        }
        return true;
    }

    public final void p() {
        this.f167797k = -1;
        this.f167801o = false;
        this.f167802p = false;
        this.f167803q = false;
        VelocityTracker velocityTracker = this.f167796j;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f167796j = null;
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void q(float f10) {
        if (this.f167794h) {
            s(this.f167795i + f10);
        }
    }

    public void r(b bVar) {
        this.f167792f = bVar;
    }

    @Override // com.android.launcher3.Insettable
    public void setInsets(Rect rect) {
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void t(boolean z10) {
        this.f167805s = z10;
    }

    public final void u(float f10) {
        float fO = o() * f10;
        boolean z10 = false;
        if (Math.abs(fO) < this.f167788b ? this.f167791e >= 0.5f : fO > 0.0f) {
            z10 = true;
        }
        v(z10, f10);
    }

    public final void v(boolean z10, float f10) {
        f();
        float f11 = z10 ? 1.0f : 0.0f;
        if (Math.abs(f11 - this.f167791e) == 0.0f || getWidth() == 0) {
            i(z10);
            return;
        }
        this.f167790d = State.SETTLING;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f167791e, f11);
        this.f167793g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(Math.max(100L, Math.min(300L, Math.abs(f10) >= ((float) this.f167788b) ? Math.round(((r2 * 1000.0f) * getWidth()) / Math.abs(f10)) : Math.round((r2 * 140.0f) + 160.0f))));
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ga.w
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f202336a.m(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a(z10));
        valueAnimatorOfFloat.start();
    }

    public final float w(MotionEvent motionEvent, int i10) {
        return getTranslationX() + motionEvent.getX(i10);
    }

    public final boolean x(MotionEvent motionEvent) {
        int iFindPointerIndex = motionEvent.findPointerIndex(this.f167797k);
        if (iFindPointerIndex < 0 || this.f167802p) {
            return this.f167801o;
        }
        float translationX = (getTranslationX() + motionEvent.getX(iFindPointerIndex)) - this.f167798l;
        float y10 = motionEvent.getY(iFindPointerIndex) - this.f167799m;
        if (!this.f167801o && Math.abs(y10) > this.f167787a && Math.abs(y10) > Math.abs(translationX)) {
            this.f167802p = true;
        } else if (!this.f167801o && Math.abs(translationX) > this.f167787a && Math.abs(translationX) > Math.abs(y10)) {
            this.f167801o = true;
            this.f167790d = State.DRAGGING;
            this.f167800n = (Math.signum(translationX) * this.f167787a) + this.f167798l;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return this.f167801o;
    }

    public MinusOneScreenView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MinusOneScreenView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f167790d = State.CLOSED;
        this.f167797k = -1;
        this.f167805s = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f167787a = viewConfiguration.getScaledTouchSlop();
        this.f167788b = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f167789c = viewConfiguration.getScaledMaximumFlingVelocity();
        setVisibility(4);
        setFocusableInTouchMode(true);
    }
}

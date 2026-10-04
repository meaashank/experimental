package Ia;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes7.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f52975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f52976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f52977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f52978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f52979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public VelocityTracker f52980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f52981g;

    public a(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f52979e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f52978d = viewConfiguration.getScaledTouchSlop();
    }

    @Override // Ia.d
    public void a(e eVar) {
        this.f52975a = eVar;
    }

    @Override // Ia.d
    public boolean b(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int action = motionEvent.getAction();
        if (action == 0) {
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f52980f = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.f52976b = e(motionEvent);
            this.f52977c = f(motionEvent);
            this.f52981g = false;
            return true;
        }
        if (action == 1) {
            if (this.f52981g && this.f52980f != null) {
                this.f52976b = e(motionEvent);
                this.f52977c = f(motionEvent);
                this.f52980f.addMovement(motionEvent);
                this.f52980f.computeCurrentVelocity(1000);
                float xVelocity = this.f52980f.getXVelocity();
                float yVelocity = this.f52980f.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f52979e) {
                    this.f52975a.l(this.f52976b, this.f52977c, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker2 = this.f52980f;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f52980f = null;
            }
        } else if (action == 2) {
            float fE = e(motionEvent);
            float f10 = f(motionEvent);
            float f11 = fE - this.f52976b;
            float f12 = f10 - this.f52977c;
            if (!this.f52981g) {
                this.f52981g = Math.sqrt((double) ((f12 * f12) + (f11 * f11))) >= ((double) this.f52978d);
            }
            if (this.f52981g) {
                this.f52975a.onDrag(f11, f12);
                this.f52976b = fE;
                this.f52977c = f10;
                VelocityTracker velocityTracker3 = this.f52980f;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                    return true;
                }
            }
        } else if (action == 3 && (velocityTracker = this.f52980f) != null) {
            velocityTracker.recycle();
            this.f52980f = null;
            return true;
        }
        return true;
    }

    @Override // Ia.d
    public boolean c() {
        return this.f52981g;
    }

    @Override // Ia.d
    public boolean d() {
        return false;
    }

    public float e(MotionEvent motionEvent) {
        return motionEvent.getX();
    }

    public float f(MotionEvent motionEvent) {
        return motionEvent.getY();
    }
}

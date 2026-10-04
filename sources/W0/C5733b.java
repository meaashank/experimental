package w0;

import androidx.constraintlayout.motion.widget.q;
import s0.s;
import s0.t;

/* JADX INFO: renamed from: w0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5733b extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f240046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s0.q f240047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f240048c;

    public C5733b() {
        t tVar = new t();
        this.f240046a = tVar;
        this.f240048c = tVar;
    }

    @Override // androidx.constraintlayout.motion.widget.q
    public float a() {
        return this.f240048c.a();
    }

    public void b(float currentPos, float destination, float currentVelocity, float maxTime, float maxAcceleration, float maxVelocity) {
        t tVar = this.f240046a;
        this.f240048c = tVar;
        tVar.e(currentPos, destination, currentVelocity, maxTime, maxAcceleration, maxVelocity);
    }

    public String c(String desc, float time) {
        return this.f240048c.c(desc, time);
    }

    public float d(float x10) {
        return this.f240048c.b(x10);
    }

    public boolean e() {
        return this.f240048c.e0();
    }

    public void f(float currentPos, float destination, float currentVelocity, float mass, float stiffness, float damping, float stopThreshold, int boundaryMode) {
        if (this.f240047b == null) {
            this.f240047b = new s0.q();
        }
        s0.q qVar = this.f240047b;
        this.f240048c = qVar;
        qVar.g(currentPos, destination, currentVelocity, mass, stiffness, damping, stopThreshold, boundaryMode);
    }

    @Override // androidx.constraintlayout.motion.widget.q, android.animation.TimeInterpolator
    public float getInterpolation(float v10) {
        return this.f240048c.getInterpolation(v10);
    }
}

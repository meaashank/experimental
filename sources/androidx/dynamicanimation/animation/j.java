package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.animation.b;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends b<j> {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final float f113223J = Float.MAX_VALUE;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public k f113224G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f113225H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f113226I;

    public j(h hVar) {
        super(hVar);
        this.f113224G = null;
        this.f113225H = Float.MAX_VALUE;
        this.f113226I = false;
    }

    public boolean A() {
        return this.f113224G.f113238b > 0.0d;
    }

    public k B() {
        return this.f113224G;
    }

    public final void C() {
        k kVar = this.f113224G;
        if (kVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d10 = (float) kVar.f113245i;
        if (d10 > this.f113205g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d10 < this.f113206h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public j D(k kVar) {
        this.f113224G = kVar;
        return this;
    }

    public void E() {
        if (!A()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f113204f) {
            this.f113226I = true;
        }
    }

    @Override // androidx.dynamicanimation.animation.b
    public float f(float f10, float f11) {
        return this.f113224G.a(f10, f11);
    }

    @Override // androidx.dynamicanimation.animation.b
    public boolean j(float f10, float f11) {
        return this.f113224G.b(f10, f11);
    }

    @Override // androidx.dynamicanimation.animation.b
    public void v(float f10) {
    }

    @Override // androidx.dynamicanimation.animation.b
    public void w() {
        C();
        this.f113224G.j(i());
        super.w();
    }

    @Override // androidx.dynamicanimation.animation.b
    public boolean y(long j10) {
        if (this.f113226I) {
            float f10 = this.f113225H;
            if (f10 != Float.MAX_VALUE) {
                this.f113224G.f113245i = f10;
                this.f113225H = Float.MAX_VALUE;
            }
            this.f113200b = (float) this.f113224G.f113245i;
            this.f113199a = 0.0f;
            this.f113226I = false;
            return true;
        }
        if (this.f113225H != Float.MAX_VALUE) {
            k kVar = this.f113224G;
            double d10 = kVar.f113245i;
            long j11 = j10 / 2;
            b.p pVarK = kVar.k(this.f113200b, this.f113199a, j11);
            k kVar2 = this.f113224G;
            kVar2.f113245i = this.f113225H;
            this.f113225H = Float.MAX_VALUE;
            b.p pVarK2 = kVar2.k(pVarK.f113213a, pVarK.f113214b, j11);
            this.f113200b = pVarK2.f113213a;
            this.f113199a = pVarK2.f113214b;
        } else {
            b.p pVarK3 = this.f113224G.k(this.f113200b, this.f113199a, j10);
            this.f113200b = pVarK3.f113213a;
            this.f113199a = pVarK3.f113214b;
        }
        float fMax = Math.max(this.f113200b, this.f113206h);
        this.f113200b = fMax;
        float fMin = Math.min(fMax, this.f113205g);
        this.f113200b = fMin;
        if (!this.f113224G.b(fMin, this.f113199a)) {
            return false;
        }
        this.f113200b = (float) this.f113224G.f113245i;
        this.f113199a = 0.0f;
        return true;
    }

    public void z(float f10) {
        if (this.f113204f) {
            this.f113225H = f10;
            return;
        }
        if (this.f113224G == null) {
            this.f113224G = new k(f10);
        }
        this.f113224G.f113245i = f10;
        w();
    }

    public <K> j(K k10, g<K> gVar) {
        super(k10, gVar);
        this.f113224G = null;
        this.f113225H = Float.MAX_VALUE;
        this.f113226I = false;
    }

    public <K> j(K k10, g<K> gVar, float f10) {
        super(k10, gVar);
        this.f113224G = null;
        this.f113225H = Float.MAX_VALUE;
        this.f113226I = false;
        this.f113224G = new k(f10);
    }
}

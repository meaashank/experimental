package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.b;
import e.InterfaceC4348w;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends b<c> {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final a f113215G;

    public static final class a implements i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final float f113216d = -4.2f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final float f113217e = 62.5f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f113219b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f113218a = -4.2f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b.p f113220c = new b.p();

        @Override // androidx.dynamicanimation.animation.i
        public float a(float f10, float f11) {
            return f11 * this.f113218a;
        }

        @Override // androidx.dynamicanimation.animation.i
        public boolean b(float f10, float f11) {
            return Math.abs(f11) < this.f113219b;
        }

        public float c() {
            return this.f113218a / (-4.2f);
        }

        public void d(float f10) {
            this.f113218a = f10 * (-4.2f);
        }

        public void e(float f10) {
            this.f113219b = f10 * 62.5f;
        }

        public b.p f(float f10, float f11, long j10) {
            float f12 = j10;
            this.f113220c.f113214b = (float) (Math.exp((f12 / 1000.0f) * this.f113218a) * ((double) f11));
            b.p pVar = this.f113220c;
            float f13 = this.f113218a;
            pVar.f113213a = (float) ((Math.exp((f13 * f12) / 1000.0f) * ((double) (f11 / f13))) + ((double) (f10 - (f11 / f13))));
            b.p pVar2 = this.f113220c;
            if (b(pVar2.f113213a, pVar2.f113214b)) {
                this.f113220c.f113214b = 0.0f;
            }
            return this.f113220c;
        }
    }

    public c(h hVar) {
        super(hVar);
        a aVar = new a();
        this.f113215G = aVar;
        aVar.e(i());
    }

    public c A(@InterfaceC4348w(from = 0.0d, fromInclusive = false) float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.f113215G.d(f10);
        return this;
    }

    public c B(float f10) {
        this.f113205g = f10;
        return this;
    }

    public c C(float f10) {
        this.f113206h = f10;
        return this;
    }

    public c D(float f10) {
        this.f113199a = f10;
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    public float f(float f10, float f11) {
        return f11 * this.f113215G.f113218a;
    }

    @Override // androidx.dynamicanimation.animation.b
    public boolean j(float f10, float f11) {
        return f10 >= this.f113205g || f10 <= this.f113206h || this.f113215G.b(f10, f11);
    }

    @Override // androidx.dynamicanimation.animation.b
    public b p(float f10) {
        this.f113205g = f10;
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    public b q(float f10) {
        this.f113206h = f10;
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    public b u(float f10) {
        this.f113199a = f10;
        return this;
    }

    @Override // androidx.dynamicanimation.animation.b
    public void v(float f10) {
        this.f113215G.e(f10);
    }

    @Override // androidx.dynamicanimation.animation.b
    public boolean y(long j10) {
        b.p pVarF = this.f113215G.f(this.f113200b, this.f113199a, j10);
        float f10 = pVarF.f113213a;
        this.f113200b = f10;
        float f11 = pVarF.f113214b;
        this.f113199a = f11;
        float f12 = this.f113206h;
        if (f10 < f12) {
            this.f113200b = f12;
            return true;
        }
        float f13 = this.f113205g;
        if (f10 <= f13) {
            return j(f10, f11);
        }
        this.f113200b = f13;
        return true;
    }

    public float z() {
        return this.f113215G.c();
    }

    public <K> c(K k10, g<K> gVar) {
        super(k10, gVar);
        a aVar = new a();
        this.f113215G = aVar;
        aVar.e(i());
    }
}

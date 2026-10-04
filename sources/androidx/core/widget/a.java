package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.C2507z0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f112095A = 315;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f112096B = 1575;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final float f112097C = Float.MAX_VALUE;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final float f112098D = 0.2f;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final float f112099E = 1.0f;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f112100F = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f112101G = 500;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f112102H = 500;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f112103r = 0.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float f112104s = Float.MAX_VALUE;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f112105t = 0.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f112106u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f112107v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f112108w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f112109x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f112110y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f112111z = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f112114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f112115d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f112118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f112119h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f112123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f112124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f112125n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f112126o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f112127p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f112128q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0288a f112112a = new C0288a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Interpolator f112113b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f112116e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f112117f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f112120i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f112121j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f112122k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    public static class C0288a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f112129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f112130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f112131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f112132d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f112138j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f112139k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f112133e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f112137i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f112134f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f112135g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f112136h = 0;

        public void a() {
            if (this.f112134f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f112134f;
            this.f112134f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f112135g = (int) (this.f112131c * f10);
            this.f112136h = (int) (f10 * this.f112132d);
        }

        public int b() {
            return this.f112135g;
        }

        public int c() {
            return this.f112136h;
        }

        public int d() {
            float f10 = this.f112131c;
            return (int) (f10 / Math.abs(f10));
        }

        public final float e(long j10) {
            if (j10 < this.f112133e) {
                return 0.0f;
            }
            long j11 = this.f112137i;
            if (j11 < 0 || j10 < j11) {
                return a.e((j10 - r0) / this.f112129a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f112138j;
            return (a.e((j10 - j11) / this.f112139k, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }

        public int f() {
            float f10 = this.f112132d;
            return (int) (f10 / Math.abs(f10));
        }

        public final float g(float f10) {
            return (f10 * 4.0f) + ((-4.0f) * f10 * f10);
        }

        public boolean h() {
            return this.f112137i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f112137i + ((long) this.f112139k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f112139k = a.f((int) (jCurrentAnimationTimeMillis - this.f112133e), 0, this.f112130b);
            this.f112138j = e(jCurrentAnimationTimeMillis);
            this.f112137i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f112130b = i10;
        }

        public void k(int i10) {
            this.f112129a = i10;
        }

        public void l(float f10, float f11) {
            this.f112131c = f10;
            this.f112132d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f112133e = jCurrentAnimationTimeMillis;
            this.f112137i = -1L;
            this.f112134f = jCurrentAnimationTimeMillis;
            this.f112138j = 0.5f;
            this.f112135g = 0;
            this.f112136h = 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f112126o) {
                if (aVar.f112124m) {
                    aVar.f112124m = false;
                    aVar.f112112a.m();
                }
                C0288a c0288a = a.this.f112112a;
                if (c0288a.h() || !a.this.x()) {
                    a.this.f112126o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f112125n) {
                    aVar2.f112125n = false;
                    aVar2.c();
                }
                c0288a.a();
                a.this.l(c0288a.b(), c0288a.c());
                C2507z0.u1(a.this.f112114c, this);
            }
        }
    }

    public a(@NonNull View view) {
        this.f112114c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        r(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        s(f12, f12);
        n(1);
        q(Float.MAX_VALUE, Float.MAX_VALUE);
        v(0.2f, 0.2f);
        w(1.0f, 1.0f);
        m(f112100F);
        u(500);
        t(500);
    }

    public static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    public static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    public void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f112114c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f112116e[i10], f11, this.f112117f[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f112120i[i10];
        float f14 = this.f112121j[i10];
        float f15 = this.f112122k[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    public final float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f112118g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f112126o && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    public final float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fE = e(f10 * f11, 0.0f, f12);
        float fG = g(f11 - f13, fE) - g(f13, fE);
        if (fG < 0.0f) {
            interpolation = -this.f112113b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f112113b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public boolean i() {
        return this.f112127p;
    }

    public boolean j() {
        return this.f112128q;
    }

    public final void k() {
        if (this.f112124m) {
            this.f112126o = false;
        } else {
            this.f112112a.i();
        }
    }

    public abstract void l(int i10, int i11);

    @NonNull
    public a m(int i10) {
        this.f112119h = i10;
        return this;
    }

    @NonNull
    public a n(int i10) {
        this.f112118g = i10;
        return this;
    }

    public a o(boolean z10) {
        if (this.f112127p && !z10) {
            k();
        }
        this.f112127p = z10;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f112127p
            r1 = 0
            if (r0 != 0) goto L6
            goto L61
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.k()
            goto L58
        L1a:
            r5.f112125n = r2
            r5.f112123l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f112114c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f112114c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f112112a
            r7.l(r0, r6)
            boolean r6 = r5.f112126o
            if (r6 != 0) goto L58
            boolean r6 = r5.x()
            if (r6 == 0) goto L58
            r5.y()
        L58:
            boolean r6 = r5.f112128q
            if (r6 == 0) goto L61
            boolean r6 = r5.f112126o
            if (r6 == 0) goto L61
            return r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(boolean z10) {
        this.f112128q = z10;
        return this;
    }

    @NonNull
    public a q(float f10, float f11) {
        float[] fArr = this.f112117f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    @NonNull
    public a r(float f10, float f11) {
        float[] fArr = this.f112122k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    @NonNull
    public a s(float f10, float f11) {
        float[] fArr = this.f112121j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    @NonNull
    public a t(int i10) {
        this.f112112a.j(i10);
        return this;
    }

    @NonNull
    public a u(int i10) {
        this.f112112a.k(i10);
        return this;
    }

    @NonNull
    public a v(float f10, float f11) {
        float[] fArr = this.f112116e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    @NonNull
    public a w(float f10, float f11) {
        float[] fArr = this.f112120i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public boolean x() {
        C0288a c0288a = this.f112112a;
        int iF = c0288a.f();
        c0288a.d();
        return iF != 0 && b(iF);
    }

    public final void y() {
        int i10;
        if (this.f112115d == null) {
            this.f112115d = new b();
        }
        this.f112126o = true;
        this.f112124m = true;
        if (this.f112123l || (i10 = this.f112119h) <= 0) {
            this.f112115d.run();
        } else {
            C2507z0.v1(this.f112114c, this.f112115d, i10);
        }
        this.f112123l = true;
    }
}

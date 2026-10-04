package Ea;

import Fa.b;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f33339n = 60000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f33340o = 1080;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f33341a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f33344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f33345e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f33350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f33351k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f33352l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f33353m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f33342b = 60000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33343c = f33340o;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f33346f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f33347g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f33348h = -1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f33349i = false;

    public a(b bVar) {
        this.f33341a = bVar;
    }

    public final long a(long j10) {
        if (j10 < 0) {
            return 0L;
        }
        long j11 = this.f33344d;
        return j10 > j11 ? j11 : j10;
    }

    public final void b(float f10, float f11) {
        if (!this.f33349i) {
            this.f33341a.c();
            return;
        }
        long jA = a(e(f10 - this.f33350j) + this.f33345e);
        this.f33349i = false;
        this.f33341a.f(jA);
    }

    public final void c(float f10, float f11) {
        if (!this.f33349i) {
            if (Math.abs(f10 - this.f33347g) <= 10.0f) {
                return;
            }
            this.f33341a.a();
            this.f33344d = this.f33341a.getDuration();
            this.f33345e = this.f33341a.getCurrentPosition();
            this.f33349i = true;
            float f12 = this.f33347g;
            this.f33350j = f12;
            float f13 = this.f33348h;
            this.f33351k = f13;
            this.f33352l = f12;
            this.f33353m = f13;
        }
        long jE = e(f10 - this.f33352l);
        long jE2 = e(f10 - this.f33350j);
        long jA = a(this.f33345e + jE2);
        this.f33352l = f10;
        this.f33353m = f11;
        this.f33341a.e(jA, jE, jE2);
    }

    public final void d(float f10, float f11) {
        this.f33346f = System.currentTimeMillis();
        this.f33347g = f10;
        this.f33348h = f11;
    }

    public final long e(float f10) {
        return (long) ((f10 / this.f33343c) * this.f33342b);
    }

    public void f(long j10) {
        this.f33342b = j10;
    }

    public void g(int i10) {
        this.f33343c = i10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            d(rawX, rawY);
        } else if (action == 1) {
            b(rawX, rawY);
        } else if (action == 2) {
            c(rawX, rawY);
        }
        return true;
    }
}

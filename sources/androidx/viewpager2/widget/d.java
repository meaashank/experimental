package androidx.viewpager2.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import e.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewPager2 f119958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f119959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f119960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VelocityTracker f119961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f119962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f119963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f119964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f119965h;

    public d(ViewPager2 viewPager2, g gVar, RecyclerView recyclerView) {
        this.f119958a = viewPager2;
        this.f119959b = gVar;
        this.f119960c = recyclerView;
    }

    public final void a(long j10, int i10, float f10, float f11) {
        MotionEvent motionEventObtain = MotionEvent.obtain(this.f119965h, j10, i10, f10, f11, 0);
        this.f119961d.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    @e0
    public boolean b() {
        if (this.f119959b.g()) {
            return false;
        }
        this.f119964g = 0;
        this.f119963f = 0;
        this.f119965h = SystemClock.uptimeMillis();
        c();
        this.f119959b.k();
        if (!this.f119959b.i()) {
            this.f119960c.stopScroll();
        }
        a(this.f119965h, 0, 0.0f, 0.0f);
        return true;
    }

    public final void c() {
        VelocityTracker velocityTracker = this.f119961d;
        if (velocityTracker != null) {
            velocityTracker.clear();
        } else {
            this.f119961d = VelocityTracker.obtain();
            this.f119962e = ViewConfiguration.get(this.f119958a.getContext()).getScaledMaximumFlingVelocity();
        }
    }

    @e0
    public boolean d() {
        g gVar = this.f119959b;
        if (!gVar.f119987m) {
            return false;
        }
        gVar.m();
        VelocityTracker velocityTracker = this.f119961d;
        velocityTracker.computeCurrentVelocity(1000, this.f119962e);
        if (this.f119960c.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            return true;
        }
        this.f119958a.I();
        return true;
    }

    @e0
    public boolean e(float f10) {
        if (!this.f119959b.f119987m) {
            return false;
        }
        float f11 = this.f119963f - f10;
        this.f119963f = f11;
        int iRound = Math.round(f11 - this.f119964g);
        this.f119964g += iRound;
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z10 = this.f119958a.f119921g.getOrientation() == 0;
        int i10 = z10 ? iRound : 0;
        int i11 = z10 ? 0 : iRound;
        float f12 = z10 ? this.f119963f : 0.0f;
        float f13 = z10 ? 0.0f : this.f119963f;
        this.f119960c.scrollBy(i10, i11);
        a(jUptimeMillis, 2, f12, f13);
        return true;
    }

    public boolean f() {
        return this.f119959b.f119987m;
    }
}

package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OverScroller f112158a;

    public p(Context context, Interpolator interpolator) {
        this.f112158a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Deprecated
    public static p c(Context context) {
        return new p(context, null);
    }

    @Deprecated
    public static p d(Context context, Interpolator interpolator) {
        return new p(context, interpolator);
    }

    @Deprecated
    public void a() {
        this.f112158a.abortAnimation();
    }

    @Deprecated
    public boolean b() {
        return this.f112158a.computeScrollOffset();
    }

    @Deprecated
    public void e(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f112158a.fling(i10, i11, i12, i13, i14, i15, i16, i17);
    }

    @Deprecated
    public void f(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f112158a.fling(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19);
    }

    @Deprecated
    public float g() {
        return this.f112158a.getCurrVelocity();
    }

    @Deprecated
    public int h() {
        return this.f112158a.getCurrX();
    }

    @Deprecated
    public int i() {
        return this.f112158a.getCurrY();
    }

    @Deprecated
    public int j() {
        return this.f112158a.getFinalX();
    }

    @Deprecated
    public int k() {
        return this.f112158a.getFinalY();
    }

    @Deprecated
    public boolean l() {
        return this.f112158a.isFinished();
    }

    @Deprecated
    public boolean m() {
        return this.f112158a.isOverScrolled();
    }

    @Deprecated
    public void n(int i10, int i11, int i12) {
        this.f112158a.notifyHorizontalEdgeReached(i10, i11, i12);
    }

    @Deprecated
    public void o(int i10, int i11, int i12) {
        this.f112158a.notifyVerticalEdgeReached(i10, i11, i12);
    }

    @Deprecated
    public boolean p(int i10, int i11, int i12, int i13, int i14, int i15) {
        return this.f112158a.springBack(i10, i11, i12, i13, i14, i15);
    }

    @Deprecated
    public void q(int i10, int i11, int i12, int i13) {
        this.f112158a.startScroll(i10, i11, i12, i13);
    }

    @Deprecated
    public void r(int i10, int i11, int i12, int i13, int i14) {
        this.f112158a.startScroll(i10, i11, i12, i13, i14);
    }
}

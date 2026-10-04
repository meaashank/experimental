package P;

import androidx.compose.runtime.T1;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nMutableRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n1#1,102:1\n40#1,5:103\n*S KotlinDebug\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n51#1:103,5\n*E\n"})
@r(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f65498e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f65499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f65500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f65501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f65502d;

    public e(float f10, float f11, float f12, float f13) {
        this.f65499a = f10;
        this.f65500b = f11;
        this.f65501c = f12;
        this.f65502d = f13;
    }

    public final boolean a(long j10) {
        return g.p(j10) >= this.f65499a && g.p(j10) < this.f65501c && g.r(j10) >= this.f65500b && g.r(j10) < this.f65502d;
    }

    public final float b() {
        return this.f65502d;
    }

    public final float c() {
        return this.f65502d - this.f65500b;
    }

    public final float d() {
        return this.f65499a;
    }

    public final float e() {
        return this.f65501c;
    }

    public final long f() {
        return o.a(this.f65501c - this.f65499a, this.f65502d - this.f65500b);
    }

    public final float g() {
        return this.f65500b;
    }

    public final float h() {
        return this.f65501c - this.f65499a;
    }

    @T1
    public final void i(float f10, float f11, float f12, float f13) {
        this.f65499a = Math.max(f10, this.f65499a);
        this.f65500b = Math.max(f11, this.f65500b);
        this.f65501c = Math.min(f12, this.f65501c);
        this.f65502d = Math.min(f13, this.f65502d);
    }

    public final boolean j() {
        return this.f65499a >= this.f65501c || this.f65500b >= this.f65502d;
    }

    public final void k(float f10, float f11, float f12, float f13) {
        this.f65499a = f10;
        this.f65500b = f11;
        this.f65501c = f12;
        this.f65502d = f13;
    }

    public final void l(float f10) {
        this.f65502d = f10;
    }

    public final void m(float f10) {
        this.f65499a = f10;
    }

    public final void n(float f10) {
        this.f65501c = f10;
    }

    public final void o(float f10) {
        this.f65500b = f10;
    }

    @NotNull
    public String toString() {
        return "MutableRect(" + c.a(this.f65499a, 1) + U6.j.f68738d + c.a(this.f65500b, 1) + U6.j.f68738d + c.a(this.f65501c, 1) + U6.j.f68738d + c.a(this.f65502d, 1) + ')';
    }
}

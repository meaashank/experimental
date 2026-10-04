package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.InterfaceC1924k0;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f102145n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f102146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f102147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f102148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f102149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f102150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f102151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f102152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f102153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f102154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f102155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public List<C2140g> f102156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f102157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public C2139f f102158m;

    public /* synthetic */ A(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, C4969v c4969v) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15);
    }

    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ void E() {
    }

    public static /* synthetic */ A c(A a10, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, C2139f c2139f, int i10, long j15, int i11, Object obj) {
        long j16;
        long j17 = (i11 & 1) != 0 ? a10.f102146a : j10;
        long j18 = (i11 & 2) != 0 ? a10.f102147b : j11;
        long j19 = (i11 & 4) != 0 ? a10.f102148c : j12;
        boolean z12 = (i11 & 8) != 0 ? a10.f102149d : z10;
        long j20 = (i11 & 16) != 0 ? a10.f102151f : j13;
        long j21 = (i11 & 32) != 0 ? a10.f102152g : j14;
        boolean z13 = (i11 & 64) != 0 ? a10.f102153h : z11;
        int i12 = (i11 & 256) != 0 ? a10.f102154i : i10;
        if ((i11 & 512) != 0) {
            j16 = a10.f102155j;
            j17 = j17;
        } else {
            j16 = j15;
        }
        return a10.b(j17, j18, j19, z12, j20, j21, z13, c2139f, i12, j16);
    }

    public static /* synthetic */ A g(A a10, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, long j15, int i11, Object obj) {
        long j16;
        long j17;
        long j18 = (i11 & 1) != 0 ? a10.f102146a : j10;
        long j19 = (i11 & 2) != 0 ? a10.f102147b : j11;
        long j20 = (i11 & 4) != 0 ? a10.f102148c : j12;
        boolean z12 = (i11 & 8) != 0 ? a10.f102149d : z10;
        long j21 = (i11 & 16) != 0 ? a10.f102151f : j13;
        long j22 = (i11 & 32) != 0 ? a10.f102152g : j14;
        boolean z13 = (i11 & 64) != 0 ? a10.f102153h : z11;
        int i12 = (i11 & 128) != 0 ? a10.f102154i : i10;
        if ((i11 & 256) != 0) {
            j16 = a10.f102155j;
            j17 = j18;
        } else {
            j16 = j15;
            j17 = j18;
        }
        return a10.f(j17, j19, j20, z12, j21, j22, z13, i12, j16);
    }

    public static A i(A a10, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List list, long j15, int i11, Object obj) {
        return a10.l((i11 & 1) != 0 ? a10.f102146a : j10, (i11 & 2) != 0 ? a10.f102147b : j11, (i11 & 4) != 0 ? a10.f102148c : j12, (i11 & 8) != 0 ? a10.f102149d : z10, a10.f102150e, (i11 & 16) != 0 ? a10.f102151f : j13, (i11 & 32) != 0 ? a10.f102152g : j14, (i11 & 64) != 0 ? a10.f102153h : z11, (i11 & 128) != 0 ? a10.f102154i : i10, list, (i11 & 512) != 0 ? a10.f102155j : j15);
    }

    public static /* synthetic */ A k(A a10, long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, long j15, int i11, Object obj) {
        long j16;
        long j17;
        long j18 = (i11 & 1) != 0 ? a10.f102146a : j10;
        long j19 = (i11 & 2) != 0 ? a10.f102147b : j11;
        long j20 = (i11 & 4) != 0 ? a10.f102148c : j12;
        boolean z12 = (i11 & 8) != 0 ? a10.f102149d : z10;
        float f11 = (i11 & 16) != 0 ? a10.f102150e : f10;
        long j21 = (i11 & 32) != 0 ? a10.f102151f : j13;
        long j22 = (i11 & 64) != 0 ? a10.f102152g : j14;
        boolean z13 = (i11 & 128) != 0 ? a10.f102153h : z11;
        int i12 = (i11 & 256) != 0 ? a10.f102154i : i10;
        if ((i11 & 512) != 0) {
            j16 = a10.f102155j;
            j17 = j18;
        } else {
            j16 = j15;
            j17 = j18;
        }
        return a10.j(j17, j19, j20, z12, f11, j21, j22, z13, i12, j16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ A m(A a10, long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, List list, long j15, int i11, Object obj) {
        long j16;
        List list2;
        long j17 = (i11 & 1) != 0 ? a10.f102146a : j10;
        long j18 = (i11 & 2) != 0 ? a10.f102147b : j11;
        long j19 = (i11 & 4) != 0 ? a10.f102148c : j12;
        boolean z12 = (i11 & 8) != 0 ? a10.f102149d : z10;
        float f11 = (i11 & 16) != 0 ? a10.f102150e : f10;
        long j20 = (i11 & 32) != 0 ? a10.f102151f : j13;
        long j21 = (i11 & 64) != 0 ? a10.f102152g : j14;
        boolean z13 = (i11 & 128) != 0 ? a10.f102153h : z11;
        int i12 = (i11 & 256) != 0 ? a10.f102154i : i10;
        long j22 = j17;
        List listP = (i11 & 512) != 0 ? a10.p() : list;
        if ((i11 & 1024) != 0) {
            list2 = listP;
            j16 = a10.f102155j;
        } else {
            j16 = j15;
            list2 = listP;
        }
        return a10.l(j22, j18, j19, z12, f11, j20, j21, z13, i12, list2, j16);
    }

    @InterfaceC4982o(message = "use isConsumed and consume() pair of methods instead")
    public static /* synthetic */ void o() {
    }

    @androidx.compose.ui.i
    public static /* synthetic */ void q() {
    }

    public final int A() {
        return this.f102154i;
    }

    public final long B() {
        return this.f102147b;
    }

    public final boolean D() {
        C2139f c2139f = this.f102158m;
        return c2139f.f102284b || c2139f.f102283a;
    }

    public final void F(long j10) {
        this.f102157l = j10;
    }

    public final void a() {
        C2139f c2139f = this.f102158m;
        c2139f.f102284b = true;
        c2139f.f102283a = true;
    }

    @InterfaceC4982o(message = "Partial consumption has been deprecated. Use copy() instead without `consumed` parameter to create a shallow copy or a constructor to create a new PointerInputChange", replaceWith = @InterfaceC4852c0(expression = "copy(id, currentTime, currentPosition, currentPressed, previousTime, previousPosition, previousPressed, type, scrollDelta)", imports = {}))
    @NotNull
    public final A b(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, @NotNull C2139f c2139f, int i10, long j15) {
        A a10 = new A(j10, j11, j12, z10, this.f102150e, j13, j14, z11, c2139f.f102284b || c2139f.f102283a, i10, p(), j15, this.f102157l);
        this.f102158m = c2139f;
        return a10;
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Use another copy() method with scrollDelta parameter instead", replaceWith = @InterfaceC4852c0(expression = "copy(id,currentTime, currentPosition, currentPressed, previousTime,previousPosition, previousPressed, consumed, type, this.scrollDelta)", imports = {}))
    public final A d(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, C2139f c2139f, int i10) {
        A a10 = new A(j10, j11, j12, z10, this.f102150e, j13, j14, z11, c2139f.f102284b || c2139f.f102283a, i10, p(), this.f102155j, this.f102157l);
        this.f102158m = c2139f;
        return a10;
    }

    @NotNull
    public final A f(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, long j15) {
        return l(j10, j11, j12, z10, this.f102150e, j13, j14, z11, i10, p(), j15);
    }

    @androidx.compose.ui.i
    @NotNull
    public final A h(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, @NotNull List<C2140g> list, long j15) {
        return l(j10, j11, j12, z10, this.f102150e, j13, j14, z11, i10, list, j15);
    }

    @NotNull
    public final A j(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, long j15) {
        A a10 = new A(j10, j11, j12, z10, f10, j13, j14, z11, false, i10, p(), j15, this.f102157l);
        a10.f102158m = this.f102158m;
        return a10;
    }

    @androidx.compose.ui.i
    @NotNull
    public final A l(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, @NotNull List<C2140g> list, long j15) {
        A a10 = new A(j10, j11, j12, z10, f10, j13, j14, z11, false, i10, list, j15, this.f102157l);
        a10.f102158m = this.f102158m;
        return a10;
    }

    @NotNull
    public final C2139f n() {
        return this.f102158m;
    }

    @androidx.compose.ui.i
    @NotNull
    public final List<C2140g> p() {
        List<C2140g> list = this.f102156k;
        return list == null ? EmptyList.f217510a : list;
    }

    public final long r() {
        return this.f102146a;
    }

    public final long s() {
        return this.f102157l;
    }

    public final long t() {
        return this.f102148c;
    }

    @NotNull
    public String toString() {
        return "PointerInputChange(id=" + ((Object) z.g(this.f102146a)) + ", uptimeMillis=" + this.f102147b + ", position=" + ((Object) P.g.y(this.f102148c)) + ", pressed=" + this.f102149d + ", pressure=" + this.f102150e + ", previousUptimeMillis=" + this.f102151f + ", previousPosition=" + ((Object) P.g.y(this.f102152g)) + ", previousPressed=" + this.f102153h + ", isConsumed=" + D() + ", type=" + ((Object) O.k(this.f102154i)) + ", historical=" + p() + ",scrollDelta=" + ((Object) P.g.y(this.f102155j)) + ')';
    }

    public final boolean u() {
        return this.f102149d;
    }

    public final float v() {
        return this.f102150e;
    }

    public final long w() {
        return this.f102152g;
    }

    public final boolean x() {
        return this.f102153h;
    }

    public final long y() {
        return this.f102151f;
    }

    public final long z() {
        return this.f102155j;
    }

    public A(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List<C2140g> list, long j15, long j16) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15);
        this.f102156k = list;
        this.f102157l = j16;
    }

    public /* synthetic */ A(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, long j16, C4969v c4969v) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, (List<C2140g>) list, j15, j16);
    }

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Use another constructor with `scrollDelta` and without `ConsumedData` instead", replaceWith = @InterfaceC4852c0(expression = "this(id, uptimeMillis, position, pressed, previousUptimeMillis, previousPosition, previousPressed, consumed.downChange || consumed.positionChange, type, Offset.Zero)", imports = {}))
    public /* synthetic */ A(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, C2139f c2139f, int i10, C4969v c4969v) {
        this(j10, j11, j12, z10, j13, j14, z11, c2139f, i10);
    }

    public A(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this(j10, j11, j12, z10, 1.0f, j13, j14, z11, z12, i10, j15);
    }

    public /* synthetic */ A(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, C4969v c4969v) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, i10, j15);
    }

    public A(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.f102146a = j10;
        this.f102147b = j11;
        this.f102148c = j12;
        this.f102149d = z10;
        this.f102150e = f10;
        this.f102151f = j13;
        this.f102152g = j14;
        this.f102153h = z11;
        this.f102154i = i10;
        this.f102155j = j15;
        P.g.f65503b.getClass();
        this.f102157l = P.g.f65504c;
        this.f102158m = new C2139f(z12, z12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public A(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, C4969v c4969v) {
        int i12;
        long j16;
        if ((i11 & 512) != 0) {
            O.f102192b.getClass();
            i12 = O.f102194d;
        } else {
            i12 = i10;
        }
        if ((i11 & 1024) != 0) {
            P.g.f65503b.getClass();
            j16 = P.g.f65504c;
        } else {
            j16 = j15;
        }
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i12, j16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public A(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, C4969v c4969v) {
        int i12;
        long j16;
        if ((i11 & 256) != 0) {
            O.f102192b.getClass();
            i12 = O.f102194d;
        } else {
            i12 = i10;
        }
        if ((i11 & 512) != 0) {
            P.g.f65503b.getClass();
            j16 = P.g.f65504c;
        } else {
            j16 = j15;
        }
        this(j10, j11, j12, z10, j13, j14, z11, z12, i12, j16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public A(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, C2139f c2139f, int i10, int i11, C4969v c4969v) {
        int i12;
        if ((i11 & 256) != 0) {
            O.f102192b.getClass();
            i12 = O.f102194d;
        } else {
            i12 = i10;
        }
        this(j10, j11, j12, z10, j13, j14, z11, c2139f, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public A(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, C2139f c2139f, int i10) {
        boolean z12 = c2139f.f102284b || c2139f.f102283a;
        P.g.f65503b.getClass();
        this(j10, j11, j12, z10, 1.0f, j13, j14, z11, z12, i10, P.g.f65504c);
    }
}

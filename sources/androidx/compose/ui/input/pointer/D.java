package androidx.compose.ui.input.pointer;

import androidx.collection.C1550p;
import androidx.compose.animation.C1635o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class D {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f102170l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f102171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f102172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f102173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f102174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f102175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f102176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f102177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f102178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final List<C2140g> f102179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f102180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f102181k;

    public /* synthetic */ D(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15, C4969v c4969v) {
        this(j10, j11, j12, j13, z10, f10, i10, z11, list, j14, j15);
    }

    public static D m(D d10, long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15, int i11, Object obj) {
        long j16 = (i11 & 1) != 0 ? d10.f102171a : j10;
        long j17 = (i11 & 2) != 0 ? d10.f102172b : j11;
        long j18 = (i11 & 4) != 0 ? d10.f102173c : j12;
        long j19 = (i11 & 8) != 0 ? d10.f102174d : j13;
        boolean z12 = (i11 & 16) != 0 ? d10.f102175e : z10;
        float f11 = (i11 & 32) != 0 ? d10.f102176f : f10;
        int i12 = (i11 & 64) != 0 ? d10.f102177g : i10;
        boolean z13 = (i11 & 128) != 0 ? d10.f102178h : z11;
        List list2 = (i11 & 256) != 0 ? d10.f102179i : list;
        long j20 = j16;
        long j21 = (i11 & 512) != 0 ? d10.f102180j : j14;
        long j22 = (i11 & 1024) != 0 ? d10.f102181k : j15;
        d10.getClass();
        return new D(j20, j17, j18, j19, z12, f11, i12, z13, list2, j21, j22);
    }

    public final long a() {
        return this.f102171a;
    }

    public final long b() {
        return this.f102180j;
    }

    public final long c() {
        return this.f102181k;
    }

    public final long d() {
        return this.f102172b;
    }

    public final long e() {
        return this.f102173c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return z.d(this.f102171a, d10.f102171a) && this.f102172b == d10.f102172b && P.g.l(this.f102173c, d10.f102173c) && P.g.l(this.f102174d, d10.f102174d) && this.f102175e == d10.f102175e && Float.compare(this.f102176f, d10.f102176f) == 0 && this.f102177g == d10.f102177g && this.f102178h == d10.f102178h && kotlin.jvm.internal.G.g(this.f102179i, d10.f102179i) && P.g.l(this.f102180j, d10.f102180j) && P.g.l(this.f102181k, d10.f102181k);
    }

    public final long f() {
        return this.f102174d;
    }

    public final boolean g() {
        return this.f102175e;
    }

    public final float h() {
        return this.f102176f;
    }

    public int hashCode() {
        return C1550p.a(this.f102181k) + ((C1550p.a(this.f102180j) + androidx.compose.foundation.layout.T.a(this.f102179i, (C1635o.a(this.f102178h) + ((androidx.compose.animation.B.a(this.f102176f, (C1635o.a(this.f102175e) + ((C1550p.a(this.f102174d) + ((C1550p.a(this.f102173c) + ((C1550p.a(this.f102172b) + (C1550p.a(this.f102171a) * 31)) * 31)) * 31)) * 31)) * 31, 31) + this.f102177g) * 31)) * 31, 31)) * 31);
    }

    public final int i() {
        return this.f102177g;
    }

    public final boolean j() {
        return this.f102178h;
    }

    @NotNull
    public final List<C2140g> k() {
        return this.f102179i;
    }

    @NotNull
    public final D l(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, @NotNull List<C2140g> list, long j14, long j15) {
        return new D(j10, j11, j12, j13, z10, f10, i10, z11, list, j14, j15);
    }

    public final boolean n() {
        return this.f102178h;
    }

    public final boolean o() {
        return this.f102175e;
    }

    @NotNull
    public final List<C2140g> p() {
        return this.f102179i;
    }

    public final long q() {
        return this.f102171a;
    }

    public final long r() {
        return this.f102181k;
    }

    public final long s() {
        return this.f102174d;
    }

    public final long t() {
        return this.f102173c;
    }

    @NotNull
    public String toString() {
        return "PointerInputEventData(id=" + ((Object) z.g(this.f102171a)) + ", uptime=" + this.f102172b + ", positionOnScreen=" + ((Object) P.g.y(this.f102173c)) + ", position=" + ((Object) P.g.y(this.f102174d)) + ", down=" + this.f102175e + ", pressure=" + this.f102176f + ", type=" + ((Object) O.k(this.f102177g)) + ", activeHover=" + this.f102178h + ", historical=" + this.f102179i + ", scrollDelta=" + ((Object) P.g.y(this.f102180j)) + ", originalEventPosition=" + ((Object) P.g.y(this.f102181k)) + ')';
    }

    public final float u() {
        return this.f102176f;
    }

    public final long v() {
        return this.f102180j;
    }

    public final int w() {
        return this.f102177g;
    }

    public final long x() {
        return this.f102172b;
    }

    public D(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List<C2140g> list, long j14, long j15) {
        this.f102171a = j10;
        this.f102172b = j11;
        this.f102173c = j12;
        this.f102174d = j13;
        this.f102175e = z10;
        this.f102176f = f10;
        this.f102177g = i10;
        this.f102178h = z11;
        this.f102179i = list;
        this.f102180j = j14;
        this.f102181k = j15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public D(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15, int i11, C4969v c4969v) {
        long j16;
        long j17;
        boolean z12 = (i11 & 128) != 0 ? false : z11;
        List arrayList = (i11 & 256) != 0 ? new ArrayList() : list;
        if ((i11 & 512) != 0) {
            P.g.f65503b.getClass();
            j16 = P.g.f65504c;
        } else {
            j16 = j14;
        }
        if ((i11 & 1024) != 0) {
            P.g.f65503b.getClass();
            j17 = P.g.f65504c;
        } else {
            j17 = j15;
        }
        this(j10, j11, j12, j13, z10, f10, i10, z12, arrayList, j16, j17);
    }
}

package md;

import java.util.NoSuchElementException;
import kotlin.B0;
import kotlin.H0;
import kotlin.InterfaceC4887e0;
import kotlin.N0;
import kotlin.jvm.internal.G;
import kotlin.random.Random;
import kotlin.t0;
import kotlin.x0;
import md.v;
import md.y;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: md.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C5224C {
    @InterfaceC4887e0(version = "1.7")
    public static final int A(@NotNull v vVar) {
        G.p(vVar, "<this>");
        if (!vVar.isEmpty()) {
            return vVar.f221163a;
        }
        throw new NoSuchElementException("Progression " + vVar + " is empty.");
    }

    @InterfaceC4887e0(version = "1.7")
    public static final long B(@NotNull y yVar) {
        G.p(yVar, "<this>");
        if (!yVar.isEmpty()) {
            return yVar.f221173a;
        }
        throw new NoSuchElementException("Progression " + yVar + " is empty.");
    }

    @InterfaceC4887e0(version = "1.7")
    @Nullable
    public static final x0 C(@NotNull v vVar) {
        G.p(vVar, "<this>");
        if (vVar.isEmpty()) {
            return null;
        }
        return new x0(vVar.f221163a);
    }

    @InterfaceC4887e0(version = "1.7")
    @Nullable
    public static final B0 D(@NotNull y yVar) {
        G.p(yVar, "<this>");
        if (yVar.isEmpty()) {
            return null;
        }
        return new B0(yVar.f221173a);
    }

    @InterfaceC4887e0(version = "1.7")
    public static final int E(@NotNull v vVar) {
        G.p(vVar, "<this>");
        if (!vVar.isEmpty()) {
            return vVar.f221164b;
        }
        throw new NoSuchElementException("Progression " + vVar + " is empty.");
    }

    @InterfaceC4887e0(version = "1.7")
    public static final long F(@NotNull y yVar) {
        G.p(yVar, "<this>");
        if (!yVar.isEmpty()) {
            return yVar.f221174b;
        }
        throw new NoSuchElementException("Progression " + yVar + " is empty.");
    }

    @InterfaceC4887e0(version = "1.7")
    @Nullable
    public static final x0 G(@NotNull v vVar) {
        G.p(vVar, "<this>");
        if (vVar.isEmpty()) {
            return null;
        }
        return new x0(vVar.f221164b);
    }

    @InterfaceC4887e0(version = "1.7")
    @Nullable
    public static final B0 H(@NotNull y yVar) {
        G.p(yVar, "<this>");
        if (yVar.isEmpty()) {
            return null;
        }
        return new B0(yVar.f221174b);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final int I(x xVar) {
        G.p(xVar, "<this>");
        return J(xVar, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.5")
    public static final int J(@NotNull x xVar, @NotNull Random random) {
        G.p(xVar, "<this>");
        G.p(random, "random");
        try {
            return kotlin.random.e.h(random, xVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final long K(C5222A c5222a) {
        G.p(c5222a, "<this>");
        return L(c5222a, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.5")
    public static final long L(@NotNull C5222A c5222a, @NotNull Random random) {
        G.p(c5222a, "<this>");
        G.p(random, "random");
        try {
            return kotlin.random.e.l(random, c5222a);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final x0 M(x xVar) {
        G.p(xVar, "<this>");
        return N(xVar, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.5")
    @Nullable
    public static final x0 N(@NotNull x xVar, @NotNull Random random) {
        G.p(xVar, "<this>");
        G.p(random, "random");
        if (xVar.isEmpty()) {
            return null;
        }
        return new x0(kotlin.random.e.h(random, xVar));
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final B0 O(C5222A c5222a) {
        G.p(c5222a, "<this>");
        return P(c5222a, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.5")
    @Nullable
    public static final B0 P(@NotNull C5222A c5222a, @NotNull Random random) {
        G.p(c5222a, "<this>");
        G.p(random, "random");
        if (c5222a.isEmpty()) {
            return null;
        }
        return new B0(kotlin.random.e.l(random, c5222a));
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static final v Q(@NotNull v vVar) {
        G.p(vVar, "<this>");
        v.a aVar = v.f221162d;
        int i10 = vVar.f221164b;
        int i11 = vVar.f221163a;
        int i12 = -vVar.f221165c;
        aVar.getClass();
        return new v(i10, i11, i12);
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static final y R(@NotNull y yVar) {
        G.p(yVar, "<this>");
        y.a aVar = y.f221172d;
        long j10 = yVar.f221174b;
        long j11 = yVar.f221173a;
        long j12 = -yVar.f221175c;
        aVar.getClass();
        return new y(j10, j11, j12);
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static final v S(@NotNull v vVar, int i10) {
        G.p(vVar, "<this>");
        t.a(i10 > 0, Integer.valueOf(i10));
        v.a aVar = v.f221162d;
        int i11 = vVar.f221163a;
        int i12 = vVar.f221164b;
        if (vVar.f221165c <= 0) {
            i10 = -i10;
        }
        aVar.getClass();
        return new v(i11, i12, i10);
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static final y T(@NotNull y yVar, long j10) {
        G.p(yVar, "<this>");
        t.a(j10 > 0, Long.valueOf(j10));
        y.a aVar = y.f221172d;
        long j11 = yVar.f221173a;
        long j12 = yVar.f221174b;
        if (yVar.f221175c <= 0) {
            j10 = -j10;
        }
        long j13 = j10;
        aVar.getClass();
        return new y(j11, j12, j13);
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static final x U(short s10, short s11) {
        int i10 = s11 & H0.f217455d;
        if (G.t(i10, 0) > 0) {
            return new x(s10 & H0.f217455d, i10 - 1, 1);
        }
        x.f221170e.getClass();
        return x.f221171f;
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static x V(int i10, int i11) {
        if (Integer.compare(i11 ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE) > 0) {
            return new x(i10, i11 - 1, 1);
        }
        x.f221170e.getClass();
        return x.f221171f;
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static final x W(byte b10, byte b11) {
        int i10 = b11 & 255;
        if (G.t(i10, 0) > 0) {
            return new x(b10 & 255, i10 - 1, 1);
        }
        x.f221170e.getClass();
        return x.f221171f;
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static C5222A X(long j10, long j11) {
        if (Long.compare(j11 ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE) > 0) {
            return new C5222A(j10, j11 - (((long) 1) & ZipKt.f225990j));
        }
        C5222A.f221118e.getClass();
        return C5222A.f221119f;
    }

    @InterfaceC4887e0(version = "1.5")
    public static final short a(short s10, short s11) {
        return G.t(s10 & H0.f217455d, 65535 & s11) < 0 ? s11 : s10;
    }

    @InterfaceC4887e0(version = "1.5")
    public static final int b(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0 ? i11 : i10;
    }

    @InterfaceC4887e0(version = "1.5")
    public static final byte c(byte b10, byte b11) {
        return G.t(b10 & 255, b11 & 255) < 0 ? b11 : b10;
    }

    @InterfaceC4887e0(version = "1.5")
    public static final long d(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 ? j11 : j10;
    }

    @InterfaceC4887e0(version = "1.5")
    public static final short e(short s10, short s11) {
        return G.t(s10 & H0.f217455d, 65535 & s11) > 0 ? s11 : s10;
    }

    @InterfaceC4887e0(version = "1.5")
    public static final int f(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) > 0 ? i11 : i10;
    }

    @InterfaceC4887e0(version = "1.5")
    public static final byte g(byte b10, byte b11) {
        return G.t(b10 & 255, b11 & 255) > 0 ? b11 : b10;
    }

    @InterfaceC4887e0(version = "1.5")
    public static final long h(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) > 0 ? j11 : j10;
    }

    @InterfaceC4887e0(version = "1.5")
    public static final long i(long j10, @NotNull g<B0> range) {
        G.p(range, "range");
        if (range instanceof f) {
            return ((B0) u.P(new B0(j10), (f) range)).f217440a;
        }
        if (!range.isEmpty()) {
            return Long.compare(j10 ^ Long.MIN_VALUE, ((B0) range.b()).f217440a ^ Long.MIN_VALUE) < 0 ? ((B0) range.b()).f217440a : Long.compare(j10 ^ Long.MIN_VALUE, ((B0) range.h()).f217440a ^ Long.MIN_VALUE) > 0 ? ((B0) range.h()).f217440a : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @InterfaceC4887e0(version = "1.5")
    public static final short j(short s10, short s11, short s12) {
        int i10 = s11 & H0.f217455d;
        int i11 = s12 & H0.f217455d;
        if (G.t(i10, i11) <= 0) {
            int i12 = 65535 & s10;
            return G.t(i12, i10) < 0 ? s11 : G.t(i12, i11) > 0 ? s12 : s10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) H0.e0(s12)) + " is less than minimum " + ((Object) H0.e0(s11)) + '.');
    }

    @InterfaceC4887e0(version = "1.5")
    public static final int k(int i10, int i11, int i12) {
        if (Integer.compare(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) <= 0) {
            return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0 ? i11 : Integer.compare(i10 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) > 0 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) x0.g0(i12)) + " is less than minimum " + ((Object) x0.g0(i11)) + '.');
    }

    @InterfaceC4887e0(version = "1.5")
    public static final byte l(byte b10, byte b11, byte b12) {
        int i10 = b11 & 255;
        int i11 = b12 & 255;
        if (G.t(i10, i11) <= 0) {
            int i12 = b10 & 255;
            return G.t(i12, i10) < 0 ? b11 : G.t(i12, i11) > 0 ? b12 : b10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) t0.e0(b12)) + " is less than minimum " + ((Object) t0.e0(b11)) + '.');
    }

    @InterfaceC4887e0(version = "1.5")
    public static final long m(long j10, long j11, long j12) {
        if (Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) <= 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 ? j11 : Long.compare(j10 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) > 0 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) N0.t(j12, 10)) + " is less than minimum " + ((Object) N0.t(j11, 10)) + '.');
    }

    @InterfaceC4887e0(version = "1.5")
    public static final int n(int i10, @NotNull g<x0> range) {
        G.p(range, "range");
        if (range instanceof f) {
            return ((x0) u.P(new x0(i10), (f) range)).f218498a;
        }
        if (!range.isEmpty()) {
            return Integer.compare(i10 ^ Integer.MIN_VALUE, ((x0) range.b()).f218498a ^ Integer.MIN_VALUE) < 0 ? ((x0) range.b()).f218498a : Integer.compare(i10 ^ Integer.MIN_VALUE, ((x0) range.h()).f218498a ^ Integer.MIN_VALUE) > 0 ? ((x0) range.h()).f218498a : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @InterfaceC4887e0(version = "1.5")
    public static final boolean o(@NotNull x contains, byte b10) {
        G.p(contains, "$this$contains");
        return contains.v(b10 & 255);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final boolean p(C5222A contains, B0 b02) {
        G.p(contains, "$this$contains");
        return b02 != null && contains.v(b02.f217440a);
    }

    @InterfaceC4887e0(version = "1.5")
    public static final boolean q(@NotNull C5222A contains, int i10) {
        G.p(contains, "$this$contains");
        return contains.v(((long) i10) & ZipKt.f225990j);
    }

    @InterfaceC4887e0(version = "1.5")
    public static final boolean r(@NotNull C5222A contains, byte b10) {
        G.p(contains, "$this$contains");
        return contains.v(((long) b10) & 255);
    }

    @InterfaceC4887e0(version = "1.5")
    public static final boolean s(@NotNull x contains, short s10) {
        G.p(contains, "$this$contains");
        return contains.v(s10 & H0.f217455d);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final boolean t(x contains, x0 x0Var) {
        G.p(contains, "$this$contains");
        return x0Var != null && contains.v(x0Var.f218498a);
    }

    @InterfaceC4887e0(version = "1.5")
    public static final boolean u(@NotNull x contains, long j10) {
        G.p(contains, "$this$contains");
        return (j10 >>> 32) == 0 && contains.v((int) j10);
    }

    @InterfaceC4887e0(version = "1.5")
    public static final boolean v(@NotNull C5222A contains, short s10) {
        G.p(contains, "$this$contains");
        return contains.v(((long) s10) & Nd.g.f65032t);
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static final v w(short s10, short s11) {
        v.a aVar = v.f221162d;
        int i10 = s10 & H0.f217455d;
        int i11 = s11 & H0.f217455d;
        aVar.getClass();
        return new v(i10, i11, -1);
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static final v x(int i10, int i11) {
        v.f221162d.getClass();
        return new v(i10, i11, -1);
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static final v y(byte b10, byte b11) {
        v.f221162d.getClass();
        return new v(b10 & 255, b11 & 255, -1);
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static final y z(long j10, long j11) {
        y.f221172d.getClass();
        return new y(j10, j11, -1L);
    }
}

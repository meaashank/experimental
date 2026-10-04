package md;

import java.util.NoSuchElementException;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC4984p;
import kotlin.InterfaceC5043v;
import kotlin.O0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.random.Random;
import md.C5225a;
import md.j;
import md.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1573:1\n1#2:1574\n*E\n"})
public class u extends t {
    public static final byte A(byte b10, byte b11) {
        return b10 > b11 ? b11 : b10;
    }

    @InterfaceC4887e0(version = "1.7")
    public static final long A0(@NotNull m mVar) {
        G.p(mVar, "<this>");
        if (!mVar.isEmpty()) {
            return mVar.f221149a;
        }
        throw new NoSuchElementException("Progression " + mVar + " is empty.");
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {InterfaceC5043v.class})
    @dd.j(name = "shortRangeContains")
    public static final boolean A1(@NotNull r<Short> rVar, int i10) {
        G.p(rVar, "<this>");
        Short shR1 = R1(i10);
        if (shR1 != null) {
            return rVar.contains(shR1);
        }
        return false;
    }

    public static final double B(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    @InterfaceC4887e0(version = "1.7")
    @Nullable
    public static final Character B0(@NotNull C5225a c5225a) {
        G.p(c5225a, "<this>");
        if (c5225a.isEmpty()) {
            return null;
        }
        return Character.valueOf(c5225a.f221121a);
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {InterfaceC5043v.class})
    @dd.j(name = "shortRangeContains")
    public static final boolean B1(@NotNull r<Short> rVar, long j10) {
        G.p(rVar, "<this>");
        Short shS1 = S1(j10);
        if (shS1 != null) {
            return rVar.contains(shS1);
        }
        return false;
    }

    public static float C(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    @InterfaceC4887e0(version = "1.7")
    @Nullable
    public static final Integer C0(@NotNull j jVar) {
        G.p(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.f221139a);
    }

    @NotNull
    public static final C5225a C1(@NotNull C5225a c5225a, int i10) {
        G.p(c5225a, "<this>");
        t.a(i10 > 0, Integer.valueOf(i10));
        C5225a.C0838a c0838a = C5225a.f221120d;
        char c10 = c5225a.f221121a;
        char c11 = c5225a.f221122b;
        if (c5225a.f221123c <= 0) {
            i10 = -i10;
        }
        c0838a.getClass();
        return new C5225a(c10, c11, i10);
    }

    public static int D(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    @InterfaceC4887e0(version = "1.7")
    @Nullable
    public static final Long D0(@NotNull m mVar) {
        G.p(mVar, "<this>");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.f221149a);
    }

    @NotNull
    public static j D1(@NotNull j jVar, int i10) {
        G.p(jVar, "<this>");
        t.a(i10 > 0, Integer.valueOf(i10));
        j.a aVar = j.f221138d;
        int i11 = jVar.f221139a;
        int i12 = jVar.f221140b;
        if (jVar.f221141c <= 0) {
            i10 = -i10;
        }
        aVar.getClass();
        return new j(i11, i12, i10);
    }

    public static long E(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    @InterfaceC4982o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC4984p(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @dd.j(name = "floatRangeContains")
    public static final /* synthetic */ boolean E0(g gVar, byte b10) {
        G.p(gVar, "<this>");
        return gVar.contains(Float.valueOf(b10));
    }

    @NotNull
    public static final m E1(@NotNull m mVar, long j10) {
        G.p(mVar, "<this>");
        t.a(j10 > 0, Long.valueOf(j10));
        m.a aVar = m.f221148d;
        long j11 = mVar.f221149a;
        long j12 = mVar.f221150b;
        if (mVar.f221151c <= 0) {
            j10 = -j10;
        }
        long j13 = j10;
        aVar.getClass();
        return new m(j11, j12, j13);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T F(@NotNull T t10, @NotNull T maximumValue) {
        G.p(t10, "<this>");
        G.p(maximumValue, "maximumValue");
        return t10.compareTo(maximumValue) > 0 ? maximumValue : t10;
    }

    @dd.j(name = "floatRangeContains")
    public static final boolean F0(@NotNull g<Float> gVar, double d10) {
        G.p(gVar, "<this>");
        return gVar.contains(Float.valueOf((float) d10));
    }

    @Nullable
    public static final Byte F1(double d10) {
        if (-128.0d > d10 || d10 > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) d10);
    }

    public static final short G(short s10, short s11) {
        return s10 > s11 ? s11 : s10;
    }

    @InterfaceC4982o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC4984p(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @dd.j(name = "floatRangeContains")
    public static final /* synthetic */ boolean G0(g gVar, int i10) {
        G.p(gVar, "<this>");
        return gVar.contains(Float.valueOf(i10));
    }

    @Nullable
    public static final Byte G1(float f10) {
        if (-128.0f > f10 || f10 > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) f10);
    }

    public static final byte H(byte b10, byte b11, byte b12) {
        if (b11 <= b12) {
            return b10 < b11 ? b11 : b10 > b12 ? b12 : b10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b12) + " is less than minimum " + ((int) b11) + '.');
    }

    @InterfaceC4982o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC4984p(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @dd.j(name = "floatRangeContains")
    public static final /* synthetic */ boolean H0(g gVar, long j10) {
        G.p(gVar, "<this>");
        return gVar.contains(Float.valueOf(j10));
    }

    @Nullable
    public static final Byte H1(int i10) {
        if (-128 > i10 || i10 >= 128) {
            return null;
        }
        return Byte.valueOf((byte) i10);
    }

    public static double I(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    @InterfaceC4982o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC4984p(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @dd.j(name = "floatRangeContains")
    public static final /* synthetic */ boolean I0(g gVar, short s10) {
        G.p(gVar, "<this>");
        return gVar.contains(Float.valueOf(s10));
    }

    @Nullable
    public static final Byte I1(long j10) {
        if (-128 > j10 || j10 >= 128) {
            return null;
        }
        return Byte.valueOf((byte) j10);
    }

    public static float J(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    @dd.j(name = "intRangeContains")
    public static final boolean J0(@NotNull g<Integer> gVar, byte b10) {
        G.p(gVar, "<this>");
        return gVar.contains(Integer.valueOf(b10));
    }

    @Nullable
    public static final Byte J1(short s10) {
        if (-128 > s10 || s10 >= 128) {
            return null;
        }
        return Byte.valueOf((byte) s10);
    }

    public static int K(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    @InterfaceC4982o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC4984p(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @dd.j(name = "intRangeContains")
    public static final /* synthetic */ boolean K0(g gVar, double d10) {
        G.p(gVar, "<this>");
        Integer numK1 = K1(d10);
        if (numK1 != null) {
            return gVar.contains(numK1);
        }
        return false;
    }

    @Nullable
    public static final Integer K1(double d10) {
        if (-2.147483648E9d > d10 || d10 > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d10);
    }

    public static int L(int i10, @NotNull g<Integer> range) {
        G.p(range, "range");
        if (range instanceof f) {
            return ((Number) P(Integer.valueOf(i10), (f) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i10 < ((Number) range.b()).intValue() ? ((Number) range.b()).intValue() : i10 > ((Number) range.h()).intValue() ? ((Number) range.h()).intValue() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @InterfaceC4982o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC4984p(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @dd.j(name = "intRangeContains")
    public static final /* synthetic */ boolean L0(g gVar, float f10) {
        G.p(gVar, "<this>");
        Integer numL1 = L1(f10);
        if (numL1 != null) {
            return gVar.contains(numL1);
        }
        return false;
    }

    @Nullable
    public static final Integer L1(float f10) {
        if (-2.1474836E9f > f10 || f10 > 2.1474836E9f) {
            return null;
        }
        return Integer.valueOf((int) f10);
    }

    public static long M(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        StringBuilder sbA = androidx.compose.runtime.snapshots.z.a("Cannot coerce value to an empty range: maximum ", j12, " is less than minimum ");
        sbA.append(j11);
        sbA.append('.');
        throw new IllegalArgumentException(sbA.toString());
    }

    @dd.j(name = "intRangeContains")
    public static final boolean M0(@NotNull g<Integer> gVar, long j10) {
        G.p(gVar, "<this>");
        Integer numM1 = M1(j10);
        if (numM1 != null) {
            return gVar.contains(numM1);
        }
        return false;
    }

    @Nullable
    public static final Integer M1(long j10) {
        if (-2147483648L > j10 || j10 >= 2147483648L) {
            return null;
        }
        return Integer.valueOf((int) j10);
    }

    public static long N(long j10, @NotNull g<Long> range) {
        G.p(range, "range");
        if (range instanceof f) {
            return ((Number) P(Long.valueOf(j10), (f) range)).longValue();
        }
        if (!range.isEmpty()) {
            return j10 < ((Number) range.b()).longValue() ? ((Number) range.b()).longValue() : j10 > ((Number) range.h()).longValue() ? ((Number) range.h()).longValue() : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @dd.j(name = "intRangeContains")
    public static final boolean N0(@NotNull g<Integer> gVar, short s10) {
        G.p(gVar, "<this>");
        return gVar.contains(Integer.valueOf(s10));
    }

    @Nullable
    public static final Long N1(double d10) {
        if (-9.223372036854776E18d > d10 || d10 > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d10);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T O(@NotNull T t10, @Nullable T t11, @Nullable T t12) {
        G.p(t10, "<this>");
        if (t11 == null || t12 == null) {
            if (t11 != null && t10.compareTo(t11) < 0) {
                return t11;
            }
            if (t12 != null && t10.compareTo(t12) > 0) {
                return t12;
            }
        } else {
            if (t11.compareTo(t12) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t12 + " is less than minimum " + t11 + '.');
            }
            if (t10.compareTo(t11) < 0) {
                return t11;
            }
            if (t10.compareTo(t12) > 0) {
                return t12;
            }
        }
        return t10;
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {InterfaceC5043v.class})
    @dd.j(name = "intRangeContains")
    public static final boolean O0(@NotNull r<Integer> rVar, byte b10) {
        G.p(rVar, "<this>");
        return rVar.contains(Integer.valueOf(b10));
    }

    @Nullable
    public static final Long O1(float f10) {
        if (-9.223372E18f > f10 || f10 > 9.223372E18f) {
            return null;
        }
        return Long.valueOf((long) f10);
    }

    @InterfaceC4887e0(version = "1.1")
    @NotNull
    public static <T extends Comparable<? super T>> T P(@NotNull T t10, @NotNull f<T> range) {
        G.p(t10, "<this>");
        G.p(range, "range");
        if (!range.isEmpty()) {
            return (!range.g(t10, range.b()) || range.g(range.b(), t10)) ? (!range.g(range.h(), t10) || range.g(t10, range.h())) ? t10 : range.h() : range.b();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {InterfaceC5043v.class})
    @dd.j(name = "intRangeContains")
    public static final boolean P0(@NotNull r<Integer> rVar, long j10) {
        G.p(rVar, "<this>");
        Integer numM1 = M1(j10);
        if (numM1 != null) {
            return rVar.contains(numM1);
        }
        return false;
    }

    @Nullable
    public static final Short P1(double d10) {
        if (-32768.0d > d10 || d10 > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) d10);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T Q(@NotNull T t10, @NotNull g<T> range) {
        G.p(t10, "<this>");
        G.p(range, "range");
        if (range instanceof f) {
            return (T) P(t10, (f) range);
        }
        if (!range.isEmpty()) {
            return t10.compareTo(range.b()) < 0 ? (T) range.b() : t10.compareTo(range.h()) > 0 ? (T) range.h() : t10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {InterfaceC5043v.class})
    @dd.j(name = "intRangeContains")
    public static final boolean Q0(@NotNull r<Integer> rVar, short s10) {
        G.p(rVar, "<this>");
        return rVar.contains(Integer.valueOf(s10));
    }

    @Nullable
    public static final Short Q1(float f10) {
        if (-32768.0f > f10 || f10 > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) f10);
    }

    public static final short R(short s10, short s11, short s12) {
        if (s11 <= s12) {
            return s10 < s11 ? s11 : s10 > s12 ? s12 : s10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s12) + " is less than minimum " + ((int) s11) + '.');
    }

    @InterfaceC4887e0(version = "1.7")
    public static final char R0(@NotNull C5225a c5225a) {
        G.p(c5225a, "<this>");
        if (!c5225a.isEmpty()) {
            return c5225a.f221122b;
        }
        throw new NoSuchElementException("Progression " + c5225a + " is empty.");
    }

    @Nullable
    public static final Short R1(int i10) {
        if (-32768 > i10 || i10 >= 32768) {
            return null;
        }
        return Short.valueOf((short) i10);
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final boolean S(C5227c c5227c, Character ch) {
        G.p(c5227c, "<this>");
        return ch != null && c5227c.w(ch.charValue());
    }

    @InterfaceC4887e0(version = "1.7")
    public static final int S0(@NotNull j jVar) {
        G.p(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.f221140b;
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    @Nullable
    public static final Short S1(long j10) {
        if (-32768 > j10 || j10 >= 32768) {
            return null;
        }
        return Short.valueOf((short) j10);
    }

    @Xc.f
    public static final boolean T(l lVar, byte b10) {
        G.p(lVar, "<this>");
        return J0(lVar, b10);
    }

    @InterfaceC4887e0(version = "1.7")
    public static final long T0(@NotNull m mVar) {
        G.p(mVar, "<this>");
        if (!mVar.isEmpty()) {
            return mVar.f221150b;
        }
        throw new NoSuchElementException("Progression " + mVar + " is empty.");
    }

    @NotNull
    public static final C5227c T1(char c10, char c11) {
        if (G.t(c11, 0) > 0) {
            return new C5227c(c10, (char) (c11 - 1), 1);
        }
        C5227c.f221128e.getClass();
        return C5227c.f221129f;
    }

    @Xc.f
    public static final boolean U(l lVar, long j10) {
        G.p(lVar, "<this>");
        return M0(lVar, j10);
    }

    @InterfaceC4887e0(version = "1.7")
    @Nullable
    public static final Character U0(@NotNull C5225a c5225a) {
        G.p(c5225a, "<this>");
        if (c5225a.isEmpty()) {
            return null;
        }
        return Character.valueOf(c5225a.f221122b);
    }

    @NotNull
    public static final l U1(byte b10, byte b11) {
        return new l(b10, b11 - 1, 1);
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final boolean V(l lVar, Integer num) {
        G.p(lVar, "<this>");
        return num != null && lVar.w(num.intValue());
    }

    @InterfaceC4887e0(version = "1.7")
    @Nullable
    public static final Integer V0(@NotNull j jVar) {
        G.p(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.f221140b);
    }

    @NotNull
    public static final l V1(byte b10, int i10) {
        if (i10 > Integer.MIN_VALUE) {
            return new l(b10, i10 - 1, 1);
        }
        l.f221146e.getClass();
        return l.f221147f;
    }

    @Xc.f
    public static final boolean W(l lVar, short s10) {
        G.p(lVar, "<this>");
        return N0(lVar, s10);
    }

    @InterfaceC4887e0(version = "1.7")
    @Nullable
    public static final Long W0(@NotNull m mVar) {
        G.p(mVar, "<this>");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.f221150b);
    }

    @NotNull
    public static final l W1(byte b10, short s10) {
        return new l(b10, s10 - 1, 1);
    }

    @Xc.f
    public static final boolean X(o oVar, byte b10) {
        G.p(oVar, "<this>");
        return X0(oVar, b10);
    }

    @dd.j(name = "longRangeContains")
    public static final boolean X0(@NotNull g<Long> gVar, byte b10) {
        G.p(gVar, "<this>");
        return gVar.contains(Long.valueOf(b10));
    }

    @NotNull
    public static final l X1(int i10, byte b10) {
        return new l(i10, b10 - 1, 1);
    }

    @Xc.f
    public static final boolean Y(o oVar, int i10) {
        G.p(oVar, "<this>");
        return a1(oVar, i10);
    }

    @InterfaceC4982o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC4984p(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @dd.j(name = "longRangeContains")
    public static final /* synthetic */ boolean Y0(g gVar, double d10) {
        G.p(gVar, "<this>");
        Long lN1 = N1(d10);
        if (lN1 != null) {
            return gVar.contains(lN1);
        }
        return false;
    }

    @NotNull
    public static l Y1(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new l(i10, i11 - 1, 1);
        }
        l.f221146e.getClass();
        return l.f221147f;
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final boolean Z(o oVar, Long l10) {
        G.p(oVar, "<this>");
        return l10 != null && oVar.w(l10.longValue());
    }

    @InterfaceC4982o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC4984p(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @dd.j(name = "longRangeContains")
    public static final /* synthetic */ boolean Z0(g gVar, float f10) {
        G.p(gVar, "<this>");
        Long lO1 = O1(f10);
        if (lO1 != null) {
            return gVar.contains(lO1);
        }
        return false;
    }

    @NotNull
    public static final l Z1(int i10, short s10) {
        return new l(i10, s10 - 1, 1);
    }

    @Xc.f
    public static final boolean a0(o oVar, short s10) {
        G.p(oVar, "<this>");
        return b1(oVar, s10);
    }

    @dd.j(name = "longRangeContains")
    public static final boolean a1(@NotNull g<Long> gVar, int i10) {
        G.p(gVar, "<this>");
        return gVar.contains(Long.valueOf(i10));
    }

    @NotNull
    public static final l a2(short s10, byte b10) {
        return new l(s10, b10 - 1, 1);
    }

    @InterfaceC4982o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC4984p(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @dd.j(name = "doubleRangeContains")
    public static final /* synthetic */ boolean b0(g gVar, byte b10) {
        G.p(gVar, "<this>");
        return gVar.contains(Double.valueOf(b10));
    }

    @dd.j(name = "longRangeContains")
    public static final boolean b1(@NotNull g<Long> gVar, short s10) {
        G.p(gVar, "<this>");
        return gVar.contains(Long.valueOf(s10));
    }

    @NotNull
    public static final l b2(short s10, int i10) {
        if (i10 > Integer.MIN_VALUE) {
            return new l(s10, i10 - 1, 1);
        }
        l.f221146e.getClass();
        return l.f221147f;
    }

    @dd.j(name = "doubleRangeContains")
    public static final boolean c0(@NotNull g<Double> gVar, float f10) {
        G.p(gVar, "<this>");
        return gVar.contains(Double.valueOf(f10));
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {InterfaceC5043v.class})
    @dd.j(name = "longRangeContains")
    public static final boolean c1(@NotNull r<Long> rVar, byte b10) {
        G.p(rVar, "<this>");
        return rVar.contains(Long.valueOf(b10));
    }

    @NotNull
    public static final l c2(short s10, short s11) {
        return new l(s10, s11 - 1, 1);
    }

    @InterfaceC4982o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC4984p(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @dd.j(name = "doubleRangeContains")
    public static final /* synthetic */ boolean d0(g gVar, int i10) {
        G.p(gVar, "<this>");
        return gVar.contains(Double.valueOf(i10));
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {InterfaceC5043v.class})
    @dd.j(name = "longRangeContains")
    public static final boolean d1(@NotNull r<Long> rVar, int i10) {
        G.p(rVar, "<this>");
        return rVar.contains(Long.valueOf(i10));
    }

    @NotNull
    public static final o d2(byte b10, long j10) {
        if (j10 > Long.MIN_VALUE) {
            return new o(b10, j10 - 1);
        }
        o.f221156e.getClass();
        return o.f221157f;
    }

    @InterfaceC4982o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC4984p(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @dd.j(name = "doubleRangeContains")
    public static final /* synthetic */ boolean e0(g gVar, long j10) {
        G.p(gVar, "<this>");
        return gVar.contains(Double.valueOf(j10));
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {InterfaceC5043v.class})
    @dd.j(name = "longRangeContains")
    public static final boolean e1(@NotNull r<Long> rVar, short s10) {
        G.p(rVar, "<this>");
        return rVar.contains(Long.valueOf(s10));
    }

    @NotNull
    public static final o e2(int i10, long j10) {
        if (j10 > Long.MIN_VALUE) {
            return new o(i10, j10 - 1);
        }
        o.f221156e.getClass();
        return o.f221157f;
    }

    @InterfaceC4982o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC4984p(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @dd.j(name = "doubleRangeContains")
    public static final /* synthetic */ boolean f0(g gVar, short s10) {
        G.p(gVar, "<this>");
        return gVar.contains(Double.valueOf(s10));
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final char f1(C5227c c5227c) {
        G.p(c5227c, "<this>");
        return g1(c5227c, Random.f218007a);
    }

    @NotNull
    public static final o f2(long j10, byte b10) {
        return new o(j10, ((long) b10) - 1);
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {InterfaceC5043v.class})
    @dd.j(name = "doubleRangeContains")
    public static final boolean g0(@NotNull r<Double> rVar, float f10) {
        G.p(rVar, "<this>");
        return rVar.contains(Double.valueOf(f10));
    }

    @InterfaceC4887e0(version = "1.3")
    public static final char g1(@NotNull C5227c c5227c, @NotNull Random random) {
        G.p(c5227c, "<this>");
        G.p(random, "random");
        try {
            return (char) random.r(c5227c.f221121a, c5227c.f221122b + 1);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @NotNull
    public static final o g2(long j10, int i10) {
        return new o(j10, ((long) i10) - 1);
    }

    @NotNull
    public static final C5225a h0(char c10, char c11) {
        C5225a.f221120d.getClass();
        return new C5225a(c10, c11, -1);
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final int h1(l lVar) {
        G.p(lVar, "<this>");
        return i1(lVar, Random.f218007a);
    }

    @NotNull
    public static final o h2(long j10, long j11) {
        if (j11 > Long.MIN_VALUE) {
            return new o(j10, j11 - 1);
        }
        o.f221156e.getClass();
        return o.f221157f;
    }

    @NotNull
    public static final j i0(byte b10, byte b11) {
        j.f221138d.getClass();
        return new j(b10, b11, -1);
    }

    @InterfaceC4887e0(version = "1.3")
    public static final int i1(@NotNull l lVar, @NotNull Random random) {
        G.p(lVar, "<this>");
        G.p(random, "random");
        try {
            return kotlin.random.d.h(random, lVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @NotNull
    public static final o i2(long j10, short s10) {
        return new o(j10, ((long) s10) - 1);
    }

    @NotNull
    public static final j j0(byte b10, int i10) {
        j.f221138d.getClass();
        return new j(b10, i10, -1);
    }

    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final long j1(o oVar) {
        G.p(oVar, "<this>");
        return k1(oVar, Random.f218007a);
    }

    @NotNull
    public static final o j2(short s10, long j10) {
        if (j10 > Long.MIN_VALUE) {
            return new o(s10, j10 - 1);
        }
        o.f221156e.getClass();
        return o.f221157f;
    }

    @NotNull
    public static final j k0(byte b10, short s10) {
        j.f221138d.getClass();
        return new j(b10, s10, -1);
    }

    @InterfaceC4887e0(version = "1.3")
    public static final long k1(@NotNull o oVar, @NotNull Random random) {
        G.p(oVar, "<this>");
        G.p(random, "random");
        try {
            return kotlin.random.d.i(random, oVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @InterfaceC4982o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC4984p(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @dd.j(name = "byteRangeContains")
    public static final /* synthetic */ boolean l(g gVar, double d10) {
        G.p(gVar, "<this>");
        Byte bF1 = F1(d10);
        if (bF1 != null) {
            return gVar.contains(bF1);
        }
        return false;
    }

    @NotNull
    public static final j l0(int i10, byte b10) {
        j.f221138d.getClass();
        return new j(i10, b10, -1);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Character l1(C5227c c5227c) {
        G.p(c5227c, "<this>");
        return m1(c5227c, Random.f218007a);
    }

    @InterfaceC4982o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC4984p(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @dd.j(name = "byteRangeContains")
    public static final /* synthetic */ boolean m(g gVar, float f10) {
        G.p(gVar, "<this>");
        Byte bG1 = G1(f10);
        if (bG1 != null) {
            return gVar.contains(bG1);
        }
        return false;
    }

    @NotNull
    public static j m0(int i10, int i11) {
        j.f221138d.getClass();
        return new j(i10, i11, -1);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Character m1(@NotNull C5227c c5227c, @NotNull Random random) {
        G.p(c5227c, "<this>");
        G.p(random, "random");
        if (c5227c.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.r(c5227c.f221121a, c5227c.f221122b + 1));
    }

    @dd.j(name = "byteRangeContains")
    public static final boolean n(@NotNull g<Byte> gVar, int i10) {
        G.p(gVar, "<this>");
        Byte bH1 = H1(i10);
        if (bH1 != null) {
            return gVar.contains(bH1);
        }
        return false;
    }

    @NotNull
    public static final j n0(int i10, short s10) {
        j.f221138d.getClass();
        return new j(i10, s10, -1);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Integer n1(l lVar) {
        G.p(lVar, "<this>");
        return o1(lVar, Random.f218007a);
    }

    @dd.j(name = "byteRangeContains")
    public static final boolean o(@NotNull g<Byte> gVar, long j10) {
        G.p(gVar, "<this>");
        Byte bI1 = I1(j10);
        if (bI1 != null) {
            return gVar.contains(bI1);
        }
        return false;
    }

    @NotNull
    public static final j o0(short s10, byte b10) {
        j.f221138d.getClass();
        return new j(s10, b10, -1);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Integer o1(@NotNull l lVar, @NotNull Random random) {
        G.p(lVar, "<this>");
        G.p(random, "random");
        if (lVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(kotlin.random.d.h(random, lVar));
    }

    @dd.j(name = "byteRangeContains")
    public static final boolean p(@NotNull g<Byte> gVar, short s10) {
        G.p(gVar, "<this>");
        Byte bJ1 = J1(s10);
        if (bJ1 != null) {
            return gVar.contains(bJ1);
        }
        return false;
    }

    @NotNull
    public static final j p0(short s10, int i10) {
        j.f221138d.getClass();
        return new j(s10, i10, -1);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final Long p1(o oVar) {
        G.p(oVar, "<this>");
        return q1(oVar, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {InterfaceC5043v.class})
    @dd.j(name = "byteRangeContains")
    public static final boolean q(@NotNull r<Byte> rVar, int i10) {
        G.p(rVar, "<this>");
        Byte bH1 = H1(i10);
        if (bH1 != null) {
            return rVar.contains(bH1);
        }
        return false;
    }

    @NotNull
    public static final j q0(short s10, short s11) {
        j.f221138d.getClass();
        return new j(s10, s11, -1);
    }

    @InterfaceC4887e0(version = "1.4")
    @Nullable
    public static final Long q1(@NotNull o oVar, @NotNull Random random) {
        G.p(oVar, "<this>");
        G.p(random, "random");
        if (oVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(kotlin.random.d.i(random, oVar));
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {InterfaceC5043v.class})
    @dd.j(name = "byteRangeContains")
    public static final boolean r(@NotNull r<Byte> rVar, long j10) {
        G.p(rVar, "<this>");
        Byte bI1 = I1(j10);
        if (bI1 != null) {
            return rVar.contains(bI1);
        }
        return false;
    }

    @NotNull
    public static final m r0(byte b10, long j10) {
        m.f221148d.getClass();
        return new m(b10, j10, -1L);
    }

    @NotNull
    public static final C5225a r1(@NotNull C5225a c5225a) {
        G.p(c5225a, "<this>");
        C5225a.C0838a c0838a = C5225a.f221120d;
        char c10 = c5225a.f221122b;
        char c11 = c5225a.f221121a;
        int i10 = -c5225a.f221123c;
        c0838a.getClass();
        return new C5225a(c10, c11, i10);
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {InterfaceC5043v.class})
    @dd.j(name = "byteRangeContains")
    public static final boolean s(@NotNull r<Byte> rVar, short s10) {
        G.p(rVar, "<this>");
        Byte bJ1 = J1(s10);
        if (bJ1 != null) {
            return rVar.contains(bJ1);
        }
        return false;
    }

    @NotNull
    public static final m s0(int i10, long j10) {
        m.f221148d.getClass();
        return new m(i10, j10, -1L);
    }

    @NotNull
    public static j s1(@NotNull j jVar) {
        G.p(jVar, "<this>");
        j.a aVar = j.f221138d;
        int i10 = jVar.f221140b;
        int i11 = jVar.f221139a;
        int i12 = -jVar.f221141c;
        aVar.getClass();
        return new j(i10, i11, i12);
    }

    public static final byte t(byte b10, byte b11) {
        return b10 < b11 ? b11 : b10;
    }

    @NotNull
    public static final m t0(long j10, byte b10) {
        m.f221148d.getClass();
        return new m(j10, b10, -1L);
    }

    @NotNull
    public static final m t1(@NotNull m mVar) {
        G.p(mVar, "<this>");
        m.a aVar = m.f221148d;
        long j10 = mVar.f221150b;
        long j11 = mVar.f221149a;
        long j12 = -mVar.f221151c;
        aVar.getClass();
        return new m(j10, j11, j12);
    }

    public static final double u(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    @NotNull
    public static final m u0(long j10, int i10) {
        m.f221148d.getClass();
        return new m(j10, i10, -1L);
    }

    @dd.j(name = "shortRangeContains")
    public static final boolean u1(@NotNull g<Short> gVar, byte b10) {
        G.p(gVar, "<this>");
        return gVar.contains(Short.valueOf(b10));
    }

    public static float v(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    @NotNull
    public static final m v0(long j10, long j11) {
        m.f221148d.getClass();
        return new m(j10, j11, -1L);
    }

    @InterfaceC4982o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC4984p(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @dd.j(name = "shortRangeContains")
    public static final /* synthetic */ boolean v1(g gVar, double d10) {
        G.p(gVar, "<this>");
        Short shP1 = P1(d10);
        if (shP1 != null) {
            return gVar.contains(shP1);
        }
        return false;
    }

    public static int w(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    @NotNull
    public static final m w0(long j10, short s10) {
        m.f221148d.getClass();
        return new m(j10, s10, -1L);
    }

    @InterfaceC4982o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC4984p(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @dd.j(name = "shortRangeContains")
    public static final /* synthetic */ boolean w1(g gVar, float f10) {
        G.p(gVar, "<this>");
        Short shQ1 = Q1(f10);
        if (shQ1 != null) {
            return gVar.contains(shQ1);
        }
        return false;
    }

    public static long x(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    @NotNull
    public static final m x0(short s10, long j10) {
        m.f221148d.getClass();
        return new m(s10, j10, -1L);
    }

    @dd.j(name = "shortRangeContains")
    public static final boolean x1(@NotNull g<Short> gVar, int i10) {
        G.p(gVar, "<this>");
        Short shR1 = R1(i10);
        if (shR1 != null) {
            return gVar.contains(shR1);
        }
        return false;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T y(@NotNull T t10, @NotNull T minimumValue) {
        G.p(t10, "<this>");
        G.p(minimumValue, "minimumValue");
        return t10.compareTo(minimumValue) < 0 ? minimumValue : t10;
    }

    @InterfaceC4887e0(version = "1.7")
    public static final char y0(@NotNull C5225a c5225a) {
        G.p(c5225a, "<this>");
        if (!c5225a.isEmpty()) {
            return c5225a.f221121a;
        }
        throw new NoSuchElementException("Progression " + c5225a + " is empty.");
    }

    @dd.j(name = "shortRangeContains")
    public static final boolean y1(@NotNull g<Short> gVar, long j10) {
        G.p(gVar, "<this>");
        Short shS1 = S1(j10);
        if (shS1 != null) {
            return gVar.contains(shS1);
        }
        return false;
    }

    public static final short z(short s10, short s11) {
        return s10 < s11 ? s11 : s10;
    }

    @InterfaceC4887e0(version = "1.7")
    public static final int z0(@NotNull j jVar) {
        G.p(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.f221139a;
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    @InterfaceC4887e0(version = "1.9")
    @O0(markerClass = {InterfaceC5043v.class})
    @dd.j(name = "shortRangeContains")
    public static final boolean z1(@NotNull r<Short> rVar, byte b10) {
        G.p(rVar, "<this>");
        return rVar.contains(Short.valueOf(b10));
    }
}

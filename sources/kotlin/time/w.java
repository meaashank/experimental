package kotlin.time;

import androidx.collection.C1545m0;
import androidx.compose.ui.graphics.J2;
import com.prism.gaia.helper.utils.l;
import ed.InterfaceC4376a;
import java.io.IOException;
import kotlin.InterfaceC4887e0;
import kotlin.KotlinNothingValueException;
import kotlin.O0;
import kotlin.jvm.internal.V;
import kotlin.time.x;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlin/time/InstantKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Instant.kt\nkotlin/time/UnboundLocalDateTime\n*L\n1#1,871:1\n1#2:872\n491#3,28:873\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlin/time/InstantKt\n*L\n700#1:873,28\n*E\n"})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f218444a = -3217862419201L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f218445b = 3093527980800L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f218446c = -31557014167219200L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f218447d = 31556889864403199L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f218448e = 146097;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f218449f = 719528;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f218450g = 3600;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f218451h = 60;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f218452i = 24;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f218453j = 86400;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f218454k = 1000000000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f218455l = 1000000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f218456m = 1000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final int[] f218457n = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final int[] f218458o = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final int[] f218459p = {3, 6};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final int[] f218460q = {1, 2, 4, 5, 7, 8};

    public static final int A(CharSequence charSequence, int i10) {
        return (charSequence.charAt(i10 + 1) - '0') + ((charSequence.charAt(i10) - '0') * 10);
    }

    public static final long B(long j10, long j11, InterfaceC4376a interfaceC4376a) {
        long j12 = j10 + j11;
        if ((j10 ^ j12) >= 0 || (j10 ^ j11) < 0) {
            return j12;
        }
        interfaceC4376a.invoke();
        throw new KotlinNothingValueException();
    }

    public static final long C(long j10, long j11, InterfaceC4376a interfaceC4376a) {
        if (j11 == 1) {
            return j10;
        }
        if (j10 == 1) {
            return j11;
        }
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        long j12 = j10 * j11;
        if (j12 / j11 == j10 && ((j10 != Long.MIN_VALUE || j11 != -1) && (j11 != Long.MIN_VALUE || j10 != -1))) {
            return j12;
        }
        interfaceC4376a.invoke();
        throw new KotlinNothingValueException();
    }

    public static final String D(CharSequence charSequence, int i10) {
        if (charSequence.length() <= i10) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i10).toString() + "...";
    }

    public static final String j(Instant instant) throws IOException {
        int i10;
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        H hA = H.f218385h.a(instant);
        int i11 = hA.f218386a;
        int i12 = 0;
        if (Math.abs(i11) < 1000) {
            StringBuilder sb3 = new StringBuilder();
            if (i11 >= 0) {
                sb3.append(i11 + 10000);
                kotlin.jvm.internal.G.o(sb3.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb3.append(i11 - 10000);
                kotlin.jvm.internal.G.o(sb3.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (i11 >= 10000) {
                sb2.append(SignatureVisitor.EXTENDS);
            }
            sb2.append(i11);
        }
        sb2.append(SignatureVisitor.SUPER);
        k(sb2, sb2, hA.f218387b);
        sb2.append(SignatureVisitor.SUPER);
        k(sb2, sb2, hA.f218388c);
        sb2.append(androidx.compose.ui.graphics.vector.f.f101686r);
        k(sb2, sb2, hA.f218389d);
        sb2.append(':');
        k(sb2, sb2, hA.f218390e);
        sb2.append(':');
        k(sb2, sb2, hA.f218391f);
        if (hA.f218392g != 0) {
            sb2.append('.');
            while (true) {
                i10 = hA.f218392g;
                iArr = f218457n;
                int i13 = i12 + 1;
                if (i10 % iArr[i13] != 0) {
                    break;
                }
                i12 = i13;
            }
            int i14 = i12 - (i12 % 3);
            String strValueOf = String.valueOf((i10 / iArr[i14]) + iArr[9 - i14]);
            kotlin.jvm.internal.G.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strValueOf.substring(1);
            kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
            sb2.append(strSubstring);
        }
        sb2.append(androidx.compose.ui.graphics.vector.f.f101670b);
        return sb2.toString();
    }

    public static final void k(Appendable appendable, StringBuilder sb2, int i10) throws IOException {
        if (i10 < 10) {
            appendable.append('0');
        }
        sb2.append(i10);
    }

    public static final boolean l(Instant instant) {
        kotlin.jvm.internal.G.p(instant, "<this>");
        return instant.compareTo(Instant.f218393c.e()) >= 0;
    }

    @InterfaceC4887e0(version = "2.3")
    @O0(markerClass = {n.class})
    @Xc.f
    public static /* synthetic */ void m(Instant instant) {
    }

    public static final boolean n(Instant instant) {
        kotlin.jvm.internal.G.p(instant, "<this>");
        return instant.compareTo(Instant.f218393c.f()) <= 0;
    }

    @InterfaceC4887e0(version = "2.3")
    @O0(markerClass = {n.class})
    @Xc.f
    public static /* synthetic */ void o(Instant instant) {
    }

    public static final boolean p(int i10) {
        if ((i10 & 3) == 0) {
            return i10 % 100 != 0 || i10 % 400 == 0;
        }
        return false;
    }

    public static final int q(int i10, boolean z10) {
        return i10 != 2 ? (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) ? 30 : 31 : z10 ? 29 : 28;
    }

    public static final x r(CharSequence charSequence) {
        int i10;
        int i11;
        int iA;
        char cCharAt;
        char cCharAt2;
        if (charSequence.length() == 0) {
            return new x.a("An empty string is not a valid Instant", charSequence);
        }
        char cCharAt3 = charSequence.charAt(0);
        if (cCharAt3 == '+' || cCharAt3 == '-') {
            i10 = 1;
        } else {
            i10 = 0;
            cCharAt3 = ' ';
        }
        int iCharAt = 0;
        int i12 = i10;
        while (i12 < charSequence.length() && '0' <= (cCharAt2 = charSequence.charAt(i12)) && cCharAt2 < ':') {
            iCharAt = (iCharAt * 10) + (charSequence.charAt(i12) - '0');
            i12++;
        }
        int i13 = i12 - i10;
        if (i13 > 10) {
            return z(charSequence, "Expected at most 10 digits for the year number, got " + i13 + " digits");
        }
        if (i13 == 10 && kotlin.jvm.internal.G.t(charSequence.charAt(i10), 50) >= 0) {
            return z(charSequence, "Expected at most 9 digits for the year number or year 1000000000, got " + i13 + " digits");
        }
        if (i13 < 4) {
            return z(charSequence, "The year number must be padded to 4 digits, got " + i13 + " digits");
        }
        if (cCharAt3 == '+' && i13 == 4) {
            return z(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (cCharAt3 == ' ' && i13 != 4) {
            return z(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        if (cCharAt3 == '-') {
            iCharAt = -iCharAt;
        }
        int i14 = i12 + 16;
        if (charSequence.length() < i14) {
            return z(charSequence, "The input string is too short");
        }
        x.a aVarS = s(charSequence, "'-'", i12, new q());
        if (aVarS != null) {
            return aVarS;
        }
        x.a aVarS2 = s(charSequence, "'-'", i12 + 3, new r());
        if (aVarS2 != null) {
            return aVarS2;
        }
        x.a aVarS3 = s(charSequence, "'T' or 't'", i12 + 6, new s());
        if (aVarS3 != null) {
            return aVarS3;
        }
        x.a aVarS4 = s(charSequence, "':'", i12 + 9, new t());
        if (aVarS4 != null) {
            return aVarS4;
        }
        x.a aVarS5 = s(charSequence, "':'", i12 + 12, new u());
        if (aVarS5 != null) {
            return aVarS5;
        }
        for (int i15 : f218458o) {
            x.a aVarS6 = s(charSequence, "an ASCII digit", i12 + i15, new v());
            if (aVarS6 != null) {
                return aVarS6;
            }
        }
        int iA2 = A(charSequence, i12 + 1);
        int iA3 = A(charSequence, i12 + 4);
        int iA4 = A(charSequence, i12 + 7);
        int iA5 = A(charSequence, i12 + 10);
        int iA6 = A(charSequence, i12 + 13);
        int i16 = i12 + 15;
        if (charSequence.charAt(i16) == '.') {
            i16 = i14;
            int iCharAt2 = 0;
            while (i16 < charSequence.length() && '0' <= (cCharAt = charSequence.charAt(i16)) && cCharAt < ':') {
                iCharAt2 = (iCharAt2 * 10) + (charSequence.charAt(i16) - '0');
                i16++;
            }
            int i17 = i16 - i14;
            if (1 > i17 || i17 >= 10) {
                return z(charSequence, "1..9 digits are supported for the fraction of the second, got " + i17 + " digits");
            }
            i11 = iCharAt2 * f218457n[9 - i17];
        } else {
            i11 = 0;
        }
        if (i16 >= charSequence.length()) {
            return z(charSequence, "The UTC offset at the end of the string is missing");
        }
        char cCharAt4 = charSequence.charAt(i16);
        if (cCharAt4 == '+' || cCharAt4 == '-') {
            int length = charSequence.length() - i16;
            if (length > 9) {
                return z(charSequence, "The UTC offset string \"" + D(charSequence.subSequence(i16, charSequence.length()).toString(), 16) + "\" is too long");
            }
            if (length % 3 != 0) {
                return z(charSequence, "Invalid UTC offset string \"" + charSequence.subSequence(i16, charSequence.length()).toString() + '\"');
            }
            int[] iArr = f218459p;
            int length2 = iArr.length;
            int i18 = 0;
            while (i18 < length2) {
                int i19 = i16 + iArr[i18];
                int i20 = length2;
                if (i19 >= charSequence.length()) {
                    break;
                }
                int i21 = i18;
                if (charSequence.charAt(i19) != ':') {
                    StringBuilder sbA = android.support.v4.media.a.a("Expected ':' at index ", i19, ", got '");
                    sbA.append(charSequence.charAt(i19));
                    sbA.append('\'');
                    return z(charSequence, sbA.toString());
                }
                i18 = i21 + 1;
                length2 = i20;
            }
            int[] iArr2 = f218460q;
            int length3 = iArr2.length;
            int i22 = 0;
            while (i22 < length3) {
                int i23 = iArr2[i22] + i16;
                int[] iArr3 = iArr2;
                if (i23 >= charSequence.length()) {
                    break;
                }
                char cCharAt5 = charSequence.charAt(i23);
                int i24 = length3;
                if ('0' > cCharAt5 || cCharAt5 >= ':') {
                    StringBuilder sbA2 = android.support.v4.media.a.a("Expected an ASCII digit at index ", i23, ", got '");
                    sbA2.append(charSequence.charAt(i23));
                    sbA2.append('\'');
                    return z(charSequence, sbA2.toString());
                }
                i22++;
                iArr2 = iArr3;
                length3 = i24;
            }
            int iA7 = A(charSequence, i16 + 1);
            int iA8 = length > 3 ? A(charSequence, i16 + 4) : 0;
            int iA9 = length > 6 ? A(charSequence, i16 + 7) : 0;
            if (iA8 > 59) {
                return z(charSequence, "Expected offset-minute-of-hour in 0..59, got " + iA8);
            }
            if (iA9 > 59) {
                return z(charSequence, "Expected offset-second-of-minute in 0..59, got " + iA9);
            }
            if (iA7 > 17 && (iA7 != 18 || iA8 != 0 || iA9 != 0)) {
                return z(charSequence, "Expected an offset in -18:00..+18:00, got " + charSequence.subSequence(i16, charSequence.length()).toString());
            }
            iA = (cCharAt4 == '-' ? -1 : 1) * J2.a(iA8, 60, iA7 * 3600, iA9);
        } else {
            if (cCharAt4 != 'Z' && cCharAt4 != 'z') {
                return z(charSequence, "Expected the UTC offset at position " + i16 + ", got '" + cCharAt4 + '\'');
            }
            int i25 = i16 + 1;
            if (charSequence.length() != i25) {
                return z(charSequence, "Extra text after the instant at position " + i25);
            }
            iA = 0;
        }
        if (1 > iA2 || iA2 >= 13) {
            return z(charSequence, "Expected a month number in 1..12, got " + iA2);
        }
        if (1 > iA3 || iA3 > q(iA2, p(iCharAt))) {
            StringBuilder sbA3 = C1545m0.a("Expected a valid day-of-month for month ", iA2, " of year ", iCharAt, ", got ");
            sbA3.append(iA3);
            return z(charSequence, sbA3.toString());
        }
        if (iA4 > 23) {
            return z(charSequence, "Expected hour in 0..23, got " + iA4);
        }
        if (iA5 > 59) {
            return z(charSequence, "Expected minute-of-hour in 0..59, got " + iA5);
        }
        if (iA6 > 59) {
            return z(charSequence, "Expected second-of-minute in 0..59, got " + iA6);
        }
        long j10 = iCharAt;
        long j11 = ((long) l.b.f165186t) * j10;
        long j12 = (j10 >= 0 ? ((j10 + ((long) 399)) / ((long) 400)) + (((j10 + ((long) 3)) / ((long) 4)) - ((j10 + ((long) 99)) / ((long) 100))) + j11 : j11 - ((j10 / ((long) (-400))) + ((j10 / ((long) (-4))) - (j10 / ((long) (-100)))))) + ((long) (((iA2 * 367) - 362) / 12)) + ((long) (iA3 - 1));
        if (iA2 > 2) {
            j12 = !p(iCharAt) ? j12 - 2 : (-1) + j12;
        }
        return new x.b((((j12 - ((long) f218449f)) * ((long) 86400)) + ((long) J2.a(iA5, 60, iA4 * 3600, iA6))) - ((long) iA), i11);
    }

    public static final x.a s(CharSequence charSequence, String str, int i10, ed.l<? super Character, Boolean> lVar) {
        char cCharAt = charSequence.charAt(i10);
        if (lVar.invoke(Character.valueOf(cCharAt)).booleanValue()) {
            return null;
        }
        return z(charSequence, "Expected " + str + ", but got '" + cCharAt + "' at position " + i10);
    }

    public static final boolean t(char c10) {
        return c10 == '-';
    }

    public static final boolean u(char c10) {
        return '0' <= c10 && c10 < ':';
    }

    public static final boolean v(char c10) {
        return c10 == '-';
    }

    public static final boolean w(char c10) {
        return c10 == 'T' || c10 == 't';
    }

    public static final boolean x(char c10) {
        return c10 == ':';
    }

    public static final boolean y(char c10) {
        return c10 == ':';
    }

    public static final x.a z(CharSequence charSequence, String str) {
        StringBuilder sbA = android.support.v4.media.f.a(str, " when parsing an Instant from \"");
        sbA.append(D(charSequence, 64));
        sbA.append('\"');
        return new x.a(sbA.toString(), charSequence);
    }
}

package okio;

import androidx.compose.foundation.text.C1758e;
import com.google.common.base.Ascii;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@dd.j(name = "Utf8")
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte f225962a = 63;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char f225963b = 65533;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f225964c = 65533;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f225965d = 55232;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f225966e = 56320;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f225967f = 3968;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f225968g = -123008;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f225969h = 3678080;

    public static final boolean a(int i10) {
        if (i10 < 0 || i10 >= 32) {
            return 127 <= i10 && i10 < 160;
        }
        return true;
    }

    public static final boolean b(byte b10) {
        return (b10 & t1.b.f239010o7) == 128;
    }

    public static final int c(@NotNull byte[] bArr, int i10, int i11, @NotNull ed.l<? super Integer, L0> yield) {
        Integer numValueOf = Integer.valueOf(f225964c);
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(yield, "yield");
        int i12 = i10 + 1;
        if (i11 <= i12) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i12];
        if ((b11 & t1.b.f239010o7) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        int i13 = (b11 ^ 3968) ^ (b10 << 6);
        if (i13 < 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        yield.invoke(Integer.valueOf(i13));
        return 2;
    }

    public static final int d(@NotNull byte[] bArr, int i10, int i11, @NotNull ed.l<? super Integer, L0> yield) {
        Integer numValueOf = Integer.valueOf(f225964c);
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(yield, "yield");
        int i12 = i10 + 2;
        if (i11 <= i12) {
            yield.invoke(numValueOf);
            int i13 = i10 + 1;
            return (i11 <= i13 || (bArr[i13] & t1.b.f239010o7) != 128) ? 1 : 2;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if ((b11 & t1.b.f239010o7) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b12 = bArr[i12];
        if ((b12 & t1.b.f239010o7) != 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        int i14 = ((b12 ^ (-123008)) ^ (b11 << 6)) ^ (b10 << 12);
        if (i14 < 2048) {
            yield.invoke(numValueOf);
            return 3;
        }
        if (55296 > i14 || i14 >= 57344) {
            yield.invoke(Integer.valueOf(i14));
            return 3;
        }
        yield.invoke(numValueOf);
        return 3;
    }

    public static final int e(@NotNull byte[] bArr, int i10, int i11, @NotNull ed.l<? super Integer, L0> yield) {
        Integer numValueOf = Integer.valueOf(f225964c);
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(yield, "yield");
        int i12 = i10 + 3;
        if (i11 <= i12) {
            yield.invoke(numValueOf);
            int i13 = i10 + 1;
            if (i11 <= i13 || (bArr[i13] & t1.b.f239010o7) != 128) {
                return 1;
            }
            int i14 = i10 + 2;
            return (i11 <= i14 || (bArr[i14] & t1.b.f239010o7) != 128) ? 2 : 3;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if ((b11 & t1.b.f239010o7) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b12 = bArr[i10 + 2];
        if ((b12 & t1.b.f239010o7) != 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        byte b13 = bArr[i12];
        if ((b13 & t1.b.f239010o7) != 128) {
            yield.invoke(numValueOf);
            return 3;
        }
        int i15 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12)) ^ (b10 << Ascii.DC2);
        if (i15 > 1114111) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (55296 <= i15 && i15 < 57344) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (i15 < 65536) {
            yield.invoke(numValueOf);
            return 4;
        }
        yield.invoke(Integer.valueOf(i15));
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(@org.jetbrains.annotations.NotNull byte[] r12, int r13, int r14, @org.jetbrains.annotations.NotNull ed.l<? super java.lang.Character, kotlin.L0> r15) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.h0.f(byte[], int, int, ed.l):void");
    }

    public static final void g(@NotNull String str, int i10, int i11, @NotNull ed.l<? super Byte, L0> yield) {
        int i12;
        char cCharAt;
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(yield, "yield");
        while (i10 < i11) {
            char cCharAt2 = str.charAt(i10);
            if (kotlin.jvm.internal.G.t(cCharAt2, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) cCharAt2));
                i10++;
                while (i10 < i11 && kotlin.jvm.internal.G.t(str.charAt(i10), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) str.charAt(i10)));
                    i10++;
                }
            } else {
                if (kotlin.jvm.internal.G.t(cCharAt2, 2048) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> 6) | 192)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (55296 > cCharAt2 || cCharAt2 >= 57344) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | 224)));
                    yield.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (kotlin.jvm.internal.G.t(cCharAt2, 56319) > 0 || i11 <= (i12 = i10 + 1) || 56320 > (cCharAt = str.charAt(i12)) || cCharAt >= 57344) {
                    yield.invoke(Byte.valueOf(f225962a));
                } else {
                    int iCharAt = (str.charAt(i12) + (cCharAt2 << '\n')) - 56613888;
                    yield.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                    i10 += 2;
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(@org.jetbrains.annotations.NotNull byte[] r11, int r12, int r13, @org.jetbrains.annotations.NotNull ed.l<? super java.lang.Integer, kotlin.L0> r14) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.h0.h(byte[], int, int, ed.l):void");
    }

    @dd.k
    @dd.j(name = X3.i.f76775k)
    public static final long i(@NotNull String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return l(str, 0, 0, 3, null);
    }

    @dd.k
    @dd.j(name = X3.i.f76775k)
    public static final long j(@NotNull String str, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return l(str, i10, 0, 2, null);
    }

    @dd.k
    @dd.j(name = X3.i.f76775k)
    public static final long k(@NotNull String str, int i10, int i11) {
        int i12;
        kotlin.jvm.internal.G.p(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("beginIndex < 0: ", i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(C1758e.a("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        if (i11 > str.length()) {
            StringBuilder sbA = android.support.v4.media.a.a("endIndex > string.length: ", i11, " > ");
            sbA.append(str.length());
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        long j10 = 0;
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                j10++;
            } else {
                if (cCharAt < 2048) {
                    i12 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i12 = 3;
                } else {
                    int i13 = i10 + 1;
                    char cCharAt2 = i13 < i11 ? str.charAt(i13) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j10++;
                        i10 = i13;
                    } else {
                        j10 += (long) 4;
                        i10 += 2;
                    }
                }
                j10 += (long) i12;
            }
            i10++;
        }
        return j10;
    }

    public static /* synthetic */ long l(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return k(str, i10, i11);
    }
}

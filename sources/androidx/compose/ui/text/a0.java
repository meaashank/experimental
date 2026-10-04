package androidx.compose.ui.text;

import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,129:1\n100#2:130\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n*L\n127#1:130\n*E\n"})
public final class a0 {
    public static final long a(int i10) {
        return b(i10, i10);
    }

    public static final long b(int i10, int i11) {
        long jD = d(i10, i11);
        Z.c(jD);
        return jD;
    }

    public static final long c(long j10, int i10, int i11) {
        int iK = md.u.K(Z.n(j10), i10, i11);
        int i12 = (int) (ZipKt.f225990j & j10);
        int iK2 = md.u.K(i12, i10, i11);
        return (iK == ((int) (j10 >> 32)) && iK2 == i12) ? j10 : b(iK, iK2);
    }

    public static final long d(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
        }
        if (i11 >= 0) {
            return (((long) i11) & ZipKt.f225990j) | (((long) i10) << 32);
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
    }

    @NotNull
    public static final String e(@NotNull CharSequence charSequence, long j10) {
        return charSequence.subSequence(Z.l(j10), Z.k(j10)).toString();
    }
}

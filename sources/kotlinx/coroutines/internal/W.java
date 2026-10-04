package kotlinx.coroutines.internal;

import androidx.compose.foundation.layout.C1713x0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class W {
    public static final int a(@NotNull String str, int i10, int i11, int i12) {
        return (int) b(str, i10, i11, i12);
    }

    public static final long b(@NotNull String str, long j10, long j11, long j12) {
        String strB = V.b(str);
        if (strB == null) {
            return j10;
        }
        Long lT1 = kotlin.text.E.t1(strB);
        if (lT1 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strB + '\'').toString());
        }
        long jLongValue = lT1.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        StringBuilder sb2 = new StringBuilder("System property '");
        sb2.append(str);
        sb2.append("' should be in range ");
        sb2.append(j11);
        C1713x0.a(sb2, "..", j12, ", but is '");
        sb2.append(jLongValue);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }

    @NotNull
    public static final String c(@NotNull String str, @NotNull String str2) {
        String strB = V.b(str);
        return strB == null ? str2 : strB;
    }

    public static final boolean d(@NotNull String str, boolean z10) {
        String strB = V.b(str);
        return strB != null ? Boolean.parseBoolean(strB) : z10;
    }

    public static int e(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return a(str, i10, i11, i12);
    }

    public static long f(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return b(str, j10, j13, j12);
    }
}

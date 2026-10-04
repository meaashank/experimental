package kotlinx.coroutines.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class U {
    public static final int a() {
        return V.a();
    }

    public static final int b(@NotNull String str, int i10, int i11, int i12) {
        return W.a(str, i10, i11, i12);
    }

    public static final long c(@NotNull String str, long j10, long j11, long j12) {
        return W.b(str, j10, j11, j12);
    }

    @Nullable
    public static final String d(@NotNull String str) {
        return V.b(str);
    }

    @NotNull
    public static final String e(@NotNull String str, @NotNull String str2) {
        String strB = V.b(str);
        return strB == null ? str2 : strB;
    }

    public static final boolean f(@NotNull String str, boolean z10) {
        return W.d(str, z10);
    }
}

package b0;

import okio.internal.ZipKt;

/* JADX INFO: renamed from: b0.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2732J {
    public static final long a(int i10, int i11) {
        return (((long) i11) & ZipKt.f225990j) | (((long) i10) << 32);
    }

    public static final int b(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int c(long j10) {
        return (int) (j10 & ZipKt.f225990j);
    }
}

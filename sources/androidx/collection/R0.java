package androidx.collection;

import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes.dex */
public final class R0 {
    public static final long a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & ZipKt.f225990j) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final long b(int i10, int i11) {
        return (((long) i11) & ZipKt.f225990j) | (((long) i10) << 32);
    }
}

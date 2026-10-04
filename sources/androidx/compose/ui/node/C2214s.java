package androidx.compose.ui.node;

import okio.internal.ZipKt;

/* JADX INFO: renamed from: androidx.compose.ui.node.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2214s {
    public static final long a(float f10, boolean z10) {
        return ((z10 ? 1L : 0L) & ZipKt.f225990j) | (((long) Float.floatToIntBits(f10)) << 32);
    }
}

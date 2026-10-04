package androidx.compose.ui.layout;

/* JADX INFO: renamed from: androidx.compose.ui.layout.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2173j {
    public static final float e(long j10, long j11) {
        return P.n.m(j11) / P.n.m(j10);
    }

    public static final float f(long j10, long j11) {
        return Math.max(h(j10, j11), e(j10, j11));
    }

    public static final float g(long j10, long j11) {
        return Math.min(h(j10, j11), e(j10, j11));
    }

    public static final float h(long j10, long j11) {
        return P.n.t(j11) / P.n.t(j10);
    }
}

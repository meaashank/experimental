package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlinx.coroutines.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5099m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f220410b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f220411c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f220412d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f220413e = 1000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f220414f = 9223372036854L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f220415g = 4611686018427387903L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final kotlinx.coroutines.internal.Q f220409a = new kotlinx.coroutines.internal.Q("REMOVED_TASK");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final kotlinx.coroutines.internal.Q f220416h = new kotlinx.coroutines.internal.Q("CLOSED_EMPTY");

    public static final long c(long j10) {
        return j10 / 1000000;
    }

    public static final long d(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j10 * 1000000;
    }
}

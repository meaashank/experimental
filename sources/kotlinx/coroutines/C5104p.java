package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlinx.coroutines.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5104p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f220425a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f220426b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f220427c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f220428d = 29;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f220429e = 536870911;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f220430f = 536870911;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final kotlinx.coroutines.internal.Q f220431g = new kotlinx.coroutines.internal.Q("RESUME_TOKEN");

    public static final int a(int i10, int i11) {
        return (i10 << 29) + i11;
    }

    public static final int b(int i10) {
        return i10 >> 29;
    }

    public static final int c(int i10) {
        return i10 & 536870911;
    }
}

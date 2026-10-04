package androidx.compose.ui.graphics;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class K2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final int[] f100748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f100749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f100750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f100751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f100752e;

    public K2(@NotNull int[] iArr, int i10, int i11, int i12, int i13) {
        this.f100748a = iArr;
        this.f100749b = i10;
        this.f100750c = i11;
        this.f100751d = i12;
        this.f100752e = i13;
    }

    public final long a(@e.D(from = 0) int i10, @e.D(from = 0) int i11) {
        return M0.b(this.f100748a[J2.a(i11, this.f100752e, this.f100751d, i10)]);
    }

    @NotNull
    public final int[] b() {
        return this.f100748a;
    }

    public final int c() {
        return this.f100751d;
    }

    public final int d() {
        return this.f100750c;
    }

    public final int e() {
        return this.f100752e;
    }

    public final int f() {
        return this.f100749b;
    }
}

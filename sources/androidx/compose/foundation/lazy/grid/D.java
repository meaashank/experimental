package androidx.compose.foundation.lazy.grid;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f91203c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final int[] f91204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final int[] f91205b;

    public D(@NotNull int[] iArr, @NotNull int[] iArr2) {
        this.f91204a = iArr;
        this.f91205b = iArr2;
    }

    @NotNull
    public final int[] a() {
        return this.f91205b;
    }

    @NotNull
    public final int[] b() {
        return this.f91204a;
    }
}

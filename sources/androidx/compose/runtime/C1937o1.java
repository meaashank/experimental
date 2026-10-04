package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.runtime.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1937o1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f99954c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public InterfaceC1934n1 f99955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C1889c f99956b;

    public C1937o1(@NotNull InterfaceC1934n1 interfaceC1934n1, @Nullable C1889c c1889c) {
        this.f99955a = interfaceC1934n1;
        this.f99956b = c1889c;
    }

    @Nullable
    public final C1889c a() {
        return this.f99956b;
    }

    @NotNull
    public final InterfaceC1934n1 b() {
        return this.f99955a;
    }

    public final void c(@Nullable C1889c c1889c) {
        this.f99956b = c1889c;
    }

    public final void d(@NotNull InterfaceC1934n1 interfaceC1934n1) {
        this.f99955a = interfaceC1934n1;
    }
}

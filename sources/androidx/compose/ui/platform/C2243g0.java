package androidx.compose.ui.platform;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.platform.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C2243g0 implements InterfaceC2285u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f103852b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.text.input.Y f103853a;

    public C2243g0(@NotNull androidx.compose.ui.text.input.Y y10) {
        this.f103853a = y10;
    }

    @NotNull
    public final androidx.compose.ui.text.input.Y a() {
        return this.f103853a;
    }

    @Override // androidx.compose.ui.platform.InterfaceC2285u1
    public void hide() {
        this.f103853a.b();
    }

    @Override // androidx.compose.ui.platform.InterfaceC2285u1
    public void show() {
        this.f103853a.c();
    }
}

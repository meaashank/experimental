package androidx.compose.ui.graphics;

import androidx.compose.runtime.InterfaceC1934n1;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Y1 implements InterfaceC1934n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final X1 f100921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final GraphicsLayer f100922b;

    public Y1(@NotNull X1 x12) {
        this.f100921a = x12;
        this.f100922b = x12.a();
    }

    @NotNull
    public final GraphicsLayer a() {
        return this.f100922b;
    }

    @Override // androidx.compose.runtime.InterfaceC1934n1
    public void b() {
    }

    @Override // androidx.compose.runtime.InterfaceC1934n1
    public void c() {
        this.f100921a.b(this.f100922b);
    }

    @Override // androidx.compose.runtime.InterfaceC1934n1
    public void d() {
        this.f100921a.b(this.f100922b);
    }
}

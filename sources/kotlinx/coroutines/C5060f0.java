package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5060f0 implements InterfaceC5098m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5058e0 f219305a;

    public C5060f0(@NotNull InterfaceC5058e0 interfaceC5058e0) {
        this.f219305a = interfaceC5058e0;
    }

    @Override // kotlinx.coroutines.InterfaceC5098m
    public void a(@Nullable Throwable th) {
        this.f219305a.dispose();
    }

    @NotNull
    public String toString() {
        return "DisposeOnCancel[" + this.f219305a + ']';
    }
}

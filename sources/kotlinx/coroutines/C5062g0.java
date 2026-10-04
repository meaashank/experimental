package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5062g0 extends F0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final InterfaceC5058e0 f220258e;

    public C5062g0(@NotNull InterfaceC5058e0 interfaceC5058e0) {
        this.f220258e = interfaceC5058e0;
    }

    @Override // kotlinx.coroutines.InterfaceC5118w0
    public void a(@Nullable Throwable th) {
        this.f220258e.dispose();
    }
}

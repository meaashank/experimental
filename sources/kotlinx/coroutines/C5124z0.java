package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5124z0 extends F0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final InterfaceC5118w0 f220810e;

    public C5124z0(@NotNull InterfaceC5118w0 interfaceC5118w0) {
        this.f220810e = interfaceC5118w0;
    }

    @Override // kotlinx.coroutines.InterfaceC5118w0
    public void a(@Nullable Throwable th) {
        this.f220810e.a(th);
    }
}

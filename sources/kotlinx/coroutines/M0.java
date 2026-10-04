package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC5120x0
public final class M0 implements InterfaceC5058e0, InterfaceC5111t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final M0 f218772a = new M0();

    @Override // kotlinx.coroutines.InterfaceC5111t
    public boolean b(@NotNull Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC5058e0
    public void dispose() {
    }

    @Override // kotlinx.coroutines.InterfaceC5111t
    @Nullable
    public A0 getParent() {
        return null;
    }

    @NotNull
    public String toString() {
        return "NonDisposableHandle";
    }
}

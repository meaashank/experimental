package kotlinx.coroutines;

import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5094k implements InterfaceC5098m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Future<?> f220405a;

    public C5094k(@NotNull Future<?> future) {
        this.f220405a = future;
    }

    @Override // kotlinx.coroutines.InterfaceC5098m
    public void a(@Nullable Throwable th) {
        if (th != null) {
            this.f220405a.cancel(false);
        }
    }

    @NotNull
    public String toString() {
        return "CancelFutureOnCancel[" + this.f220405a + ']';
    }
}

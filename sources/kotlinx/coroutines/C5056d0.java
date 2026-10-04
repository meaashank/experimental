package kotlinx.coroutines;

import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlinx.coroutines.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5056d0 implements InterfaceC5058e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Future<?> f219208a;

    public C5056d0(@NotNull Future<?> future) {
        this.f219208a = future;
    }

    @Override // kotlinx.coroutines.InterfaceC5058e0
    public void dispose() {
        this.f219208a.cancel(false);
    }

    @NotNull
    public String toString() {
        return "DisposableFutureHandle[" + this.f219208a + ']';
    }
}

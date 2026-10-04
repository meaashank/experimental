package kotlinx.coroutines;

import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5096l extends F0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Future<?> f220407e;

    public C5096l(@NotNull Future<?> future) {
        this.f220407e = future;
    }

    @Override // kotlinx.coroutines.InterfaceC5118w0
    public void a(@Nullable Throwable th) {
        if (th != null) {
            this.f220407e.cancel(false);
        }
    }
}

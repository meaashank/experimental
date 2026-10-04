package xd;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C5054c0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.InterfaceC5107q0;
import kotlinx.coroutines.InterfaceC5120x0;
import kotlinx.coroutines.internal.V;
import kotlinx.coroutines.internal.W;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends ExecutorCoroutineDispatcher implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f240604d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final CoroutineDispatcher f240605e;

    static {
        n nVar = n.f240638c;
        int iA = V.a();
        f240605e = nVar.R2(W.e(C5054c0.f218834a, 64 < iA ? iA : 64, 0, 0, 12, null));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void F2(@NotNull kotlin.coroutines.i iVar, @NotNull Runnable runnable) {
        f240605e.F2(iVar, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @InterfaceC5120x0
    public void H2(@NotNull kotlin.coroutines.i iVar, @NotNull Runnable runnable) {
        f240605e.H2(iVar, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @InterfaceC5107q0
    @NotNull
    public CoroutineDispatcher R2(int i10) {
        return n.f240638c.R2(i10);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        F2(EmptyCoroutineContext.f217673a, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @NotNull
    public Executor Z2() {
        return this;
    }
}

package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C5071e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5103o0 extends ExecutorCoroutineDispatcher implements U {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Executor f220424d;

    public C5103o0(@NotNull Executor executor) {
        this.f220424d = executor;
        C5071e.d(executor);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void F2(@NotNull kotlin.coroutines.i iVar, @NotNull Runnable runnable) {
        Runnable runnableI;
        try {
            Executor executor = this.f220424d;
            AbstractC5051b abstractC5051b = C5053c.f218833a;
            if (abstractC5051b == null || (runnableI = abstractC5051b.i(runnable)) == null) {
                runnableI = runnable;
            }
            executor.execute(runnableI);
        } catch (RejectedExecutionException e10) {
            AbstractC5051b abstractC5051b2 = C5053c.f218833a;
            if (abstractC5051b2 != null) {
                abstractC5051b2.f();
            }
            d3(iVar, e10);
            C5052b0.c().F2(iVar, runnable);
        }
    }

    @Override // kotlinx.coroutines.U
    public void T0(long j10, @NotNull InterfaceC5100n<? super kotlin.L0> interfaceC5100n) {
        long j11;
        Executor executor = this.f220424d;
        ScheduledFuture<?> scheduledFutureK3 = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            scheduledFutureK3 = k3(scheduledExecutorService, new S0(this, interfaceC5100n), interfaceC5100n.getContext(), j11);
        } else {
            j11 = j10;
        }
        if (scheduledFutureK3 != null) {
            E0.a(interfaceC5100n, scheduledFutureK3);
        } else {
            P.f218782i.T0(j11, interfaceC5100n);
        }
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    @NotNull
    public Executor Z2() {
        return this.f220424d;
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executor = this.f220424d;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final void d3(kotlin.coroutines.i iVar, RejectedExecutionException rejectedExecutionException) {
        JobKt__JobKt.f(iVar, C5101n0.a("The task was rejected", rejectedExecutionException));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C5103o0) && ((C5103o0) obj).f220424d == this.f220424d;
    }

    @Override // kotlinx.coroutines.U
    @NotNull
    public InterfaceC5058e0 h1(long j10, @NotNull Runnable runnable, @NotNull kotlin.coroutines.i iVar) {
        long j11;
        Runnable runnable2;
        Executor executor = this.f220424d;
        ScheduledFuture<?> scheduledFutureK3 = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            runnable2 = runnable;
            scheduledFutureK3 = k3(scheduledExecutorService, runnable2, iVar, j11);
        } else {
            j11 = j10;
            runnable2 = runnable;
        }
        return scheduledFutureK3 != null ? new C5056d0(scheduledFutureK3) : P.f218782i.u4(j11, runnable2);
    }

    public int hashCode() {
        return System.identityHashCode(this.f220424d);
    }

    public final ScheduledFuture<?> k3(ScheduledExecutorService scheduledExecutorService, Runnable runnable, kotlin.coroutines.i iVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            d3(iVar, e10);
            return null;
        }
    }

    @Override // kotlinx.coroutines.U
    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object p2(long j10, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        return U.a.a(this, j10, eVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return this.f220424d.toString();
    }
}

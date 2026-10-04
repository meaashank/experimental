package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import s0.x;

/* JADX INFO: renamed from: kotlinx.coroutines.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5105p0 {
    @InterfaceC5107q0
    public static /* synthetic */ void a() {
    }

    @NotNull
    public static final Executor b(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Executor executorZ2;
        ExecutorCoroutineDispatcher executorCoroutineDispatcher = coroutineDispatcher instanceof ExecutorCoroutineDispatcher ? (ExecutorCoroutineDispatcher) coroutineDispatcher : null;
        return (executorCoroutineDispatcher == null || (executorZ2 = executorCoroutineDispatcher.Z2()) == null) ? new ExecutorC5050a0(coroutineDispatcher) : executorZ2;
    }

    @dd.j(name = x.h.f238400c)
    @NotNull
    public static final CoroutineDispatcher c(@NotNull Executor executor) {
        CoroutineDispatcher coroutineDispatcher;
        ExecutorC5050a0 executorC5050a0 = executor instanceof ExecutorC5050a0 ? (ExecutorC5050a0) executor : null;
        return (executorC5050a0 == null || (coroutineDispatcher = executorC5050a0.f218812a) == null) ? new C5103o0(executor) : coroutineDispatcher;
    }

    @dd.j(name = x.h.f238400c)
    @NotNull
    public static final ExecutorCoroutineDispatcher d(@NotNull ExecutorService executorService) {
        return new C5103o0(executorService);
    }
}

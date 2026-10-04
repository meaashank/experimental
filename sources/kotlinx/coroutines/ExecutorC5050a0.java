package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlinx.coroutines.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ExecutorC5050a0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public final CoroutineDispatcher f218812a;

    public ExecutorC5050a0(@NotNull CoroutineDispatcher coroutineDispatcher) {
        this.f218812a = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        CoroutineDispatcher coroutineDispatcher = this.f218812a;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f217673a;
        if (coroutineDispatcher.J2(emptyCoroutineContext)) {
            this.f218812a.F2(emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    @NotNull
    public String toString() {
        return this.f218812a.toString();
    }
}

package kotlinx.coroutines.scheduling;

import dd.j;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    @j(name = "isSchedulerWorker")
    public static final boolean a(@NotNull Thread thread) {
        return thread instanceof CoroutineScheduler.c;
    }

    @j(name = "mayNotBlock")
    public static final boolean b(@NotNull Thread thread) {
        return (thread instanceof CoroutineScheduler.c) && ((CoroutineScheduler.c) thread).f220671c == CoroutineScheduler.WorkerState.CPU_ACQUIRED;
    }
}

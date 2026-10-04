package kotlinx.coroutines;

import ed.InterfaceC4376a;
import kotlin.InterfaceC4850b0;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlinx.coroutines.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5097l0 {
    @NotNull
    public static final AbstractC5066i0 a() {
        return new C5061g(Thread.currentThread());
    }

    @InterfaceC4850b0
    @W
    @InterfaceC5120x0
    public static final boolean b(@NotNull Thread thread) {
        if (thread instanceof CoroutineScheduler.c) {
            return ((CoroutineScheduler.c) thread).s();
        }
        return false;
    }

    public static final void c(@NotNull InterfaceC4376a<kotlin.L0> interfaceC4376a) {
        interfaceC4376a.invoke();
    }

    @InterfaceC5120x0
    public static final long d() {
        AbstractC5066i0 abstractC5066i0A = b1.f218831a.a();
        if (abstractC5066i0A != null) {
            return abstractC5066i0A.Y3();
        }
        return Long.MAX_VALUE;
    }

    @InterfaceC4850b0
    @W
    @InterfaceC5120x0
    public static final long e() {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof CoroutineScheduler.c) {
            return ((CoroutineScheduler.c) threadCurrentThread).w();
        }
        throw new IllegalStateException("Expected CoroutineScheduler.Worker, but got " + threadCurrentThread);
    }
}

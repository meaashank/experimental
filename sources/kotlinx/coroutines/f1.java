package kotlinx.coroutines;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nThreadPoolDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadPoolDispatcher.kt\nkotlinx/coroutines/ThreadPoolDispatcherKt__ThreadPoolDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
public final /* synthetic */ class f1 {
    @W
    @NotNull
    public static final ExecutorCoroutineDispatcher b(final int i10, @NotNull final String str) {
        if (i10 < 1) {
            throw new IllegalArgumentException(androidx.collection.N0.a("Expected at least one thread, but ", i10, " specified").toString());
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        return new C5103o0(Executors.newScheduledThreadPool(i10, new ThreadFactory() { // from class: kotlinx.coroutines.e1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return f1.c(i10, str, atomicInteger, runnable);
            }
        }));
    }

    public static final Thread c(int i10, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i10 != 1) {
            str = str + SignatureVisitor.SUPER + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}

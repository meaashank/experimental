package kotlinx.coroutines.internal;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nCoroutineExceptionHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/CoroutineExceptionHandlerImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public final class C5076j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Collection<kotlinx.coroutines.H> f220343a = SequencesKt___SequencesKt.I3(SequencesKt__SequencesKt.j(ServiceLoader.load(kotlinx.coroutines.H.class, kotlinx.coroutines.H.class.getClassLoader()).iterator()));

    public static final void a(@NotNull kotlinx.coroutines.H h10) {
        if (!f220343a.contains(h10)) {
            throw new IllegalStateException("Exception handler was not found via a ServiceLoader");
        }
    }

    @NotNull
    public static final Collection<kotlinx.coroutines.H> b() {
        return f220343a;
    }

    public static final void c(@NotNull Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}

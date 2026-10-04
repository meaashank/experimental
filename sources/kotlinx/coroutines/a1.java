package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nThreadContextElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n262#1:285\n1#2:286\n*S KotlinDebug\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n*L\n283#1:285\n*E\n"})
public final class a1 {
    @NotNull
    public static final <T> Z0<T> a(@NotNull ThreadLocal<T> threadLocal, T t10) {
        return new kotlinx.coroutines.internal.X(t10, threadLocal);
    }

    public static Z0 b(ThreadLocal threadLocal, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = threadLocal.get();
        }
        return new kotlinx.coroutines.internal.X(obj, threadLocal);
    }

    @Nullable
    public static final Object c(@NotNull ThreadLocal<?> threadLocal, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        if (eVar.getContext().get(new kotlinx.coroutines.internal.Y(threadLocal)) != null) {
            return kotlin.L0.f217464a;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + eVar.getContext()).toString());
    }

    public static final Object d(ThreadLocal<?> threadLocal, kotlin.coroutines.e<? super kotlin.L0> eVar) {
        throw null;
    }

    @Nullable
    public static final Object e(@NotNull ThreadLocal<?> threadLocal, @NotNull kotlin.coroutines.e<? super Boolean> eVar) {
        return Boolean.valueOf(eVar.getContext().get(new kotlinx.coroutines.internal.Y(threadLocal)) != null);
    }

    public static final Object f(ThreadLocal<?> threadLocal, kotlin.coroutines.e<? super Boolean> eVar) {
        throw null;
    }
}

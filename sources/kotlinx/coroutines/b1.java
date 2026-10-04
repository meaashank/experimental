package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/ThreadLocalEventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,540:1\n1#2:541\n*E\n"})
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b1 f218831a = new b1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ThreadLocal<AbstractC5066i0> f218832b = new ThreadLocal<>();

    @Nullable
    public final AbstractC5066i0 a() {
        return f218832b.get();
    }

    @NotNull
    public final AbstractC5066i0 b() {
        ThreadLocal<AbstractC5066i0> threadLocal = f218832b;
        AbstractC5066i0 abstractC5066i0 = threadLocal.get();
        if (abstractC5066i0 != null) {
            return abstractC5066i0;
        }
        AbstractC5066i0 abstractC5066i0A = C5097l0.a();
        threadLocal.set(abstractC5066i0A);
        return abstractC5066i0A;
    }

    public final void c() {
        f218832b.set(null);
    }

    public final void d(@NotNull AbstractC5066i0 abstractC5066i0) {
        f218832b.set(abstractC5066i0);
    }
}

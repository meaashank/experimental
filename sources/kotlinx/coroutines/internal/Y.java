package kotlinx.coroutines.internal;

import kotlin.InterfaceC4850b0;
import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC4850b0
public final class Y implements i.c<X<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ThreadLocal<?> f220323a;

    public Y(@NotNull ThreadLocal<?> threadLocal) {
        this.f220323a = threadLocal;
    }

    public static Y c(Y y10, ThreadLocal threadLocal, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            threadLocal = y10.f220323a;
        }
        y10.getClass();
        return new Y(threadLocal);
    }

    public final ThreadLocal<?> a() {
        return this.f220323a;
    }

    @NotNull
    public final Y b(@NotNull ThreadLocal<?> threadLocal) {
        return new Y(threadLocal);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y) && kotlin.jvm.internal.G.g(this.f220323a, ((Y) obj).f220323a);
    }

    public int hashCode() {
        return this.f220323a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f220323a + ')';
    }
}

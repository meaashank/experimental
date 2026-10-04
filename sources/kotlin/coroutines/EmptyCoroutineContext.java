package kotlin.coroutines;

import ed.p;
import java.io.Serializable;
import kotlin.InterfaceC4887e0;
import kotlin.coroutines.i;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.3")
public final class EmptyCoroutineContext implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final EmptyCoroutineContext f217673a = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return f217673a;
    }

    @Override // kotlin.coroutines.i
    public <R> R fold(R r10, @NotNull p<? super R, ? super i.b, ? extends R> operation) {
        G.p(operation, "operation");
        return r10;
    }

    @Override // kotlin.coroutines.i
    @Nullable
    public <E extends i.b> E get(@NotNull i.c<E> key) {
        G.p(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.i
    @NotNull
    public i minusKey(@NotNull i.c<?> key) {
        G.p(key, "key");
        return this;
    }

    @Override // kotlin.coroutines.i
    @NotNull
    public i plus(@NotNull i context) {
        G.p(context, "context");
        return context;
    }

    @NotNull
    public String toString() {
        return "EmptyCoroutineContext";
    }
}

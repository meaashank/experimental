package kotlinx.coroutines.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.i;
import kotlinx.coroutines.Z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class X<T> implements Z0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f220320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ThreadLocal<T> f220321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final i.c<?> f220322c;

    public X(T t10, @NotNull ThreadLocal<T> threadLocal) {
        this.f220320a = t10;
        this.f220321b = threadLocal;
        this.f220322c = new Y(threadLocal);
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    public <R> R fold(R r10, @NotNull ed.p<? super R, ? super i.b, ? extends R> pVar) {
        return (R) i.b.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @Nullable
    public <E extends i.b> E get(@NotNull i.c<E> cVar) {
        if (kotlin.jvm.internal.G.g(this.f220322c, cVar)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.i.b
    @NotNull
    public i.c<?> getKey() {
        return this.f220322c;
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @NotNull
    public kotlin.coroutines.i minusKey(@NotNull i.c<?> cVar) {
        return kotlin.jvm.internal.G.g(this.f220322c, cVar) ? EmptyCoroutineContext.f217673a : this;
    }

    @Override // kotlin.coroutines.i
    @NotNull
    public kotlin.coroutines.i plus(@NotNull kotlin.coroutines.i iVar) {
        return i.b.a.d(this, iVar);
    }

    @NotNull
    public String toString() {
        return "ThreadLocal(value=" + this.f220320a + ", threadLocal = " + this.f220321b + ')';
    }

    @Override // kotlinx.coroutines.Z0
    public void u(@NotNull kotlin.coroutines.i iVar, T t10) {
        this.f220321b.set(t10);
    }

    @Override // kotlinx.coroutines.Z0
    public T z2(@NotNull kotlin.coroutines.i iVar) {
        T t10 = this.f220321b.get();
        this.f220321b.set(this.f220320a);
        return t10;
    }
}

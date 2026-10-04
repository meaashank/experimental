package kotlinx.coroutines.flow.internal;

import ed.p;
import kotlin.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements kotlin.coroutines.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public final Throwable f220217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.i f220218b;

    public f(@NotNull Throwable th, @NotNull kotlin.coroutines.i iVar) {
        this.f220217a = th;
        this.f220218b = iVar;
    }

    @Override // kotlin.coroutines.i
    public <R> R fold(R r10, @NotNull p<? super R, ? super i.b, ? extends R> pVar) {
        return (R) this.f220218b.fold(r10, pVar);
    }

    @Override // kotlin.coroutines.i
    @Nullable
    public <E extends i.b> E get(@NotNull i.c<E> cVar) {
        return (E) this.f220218b.get(cVar);
    }

    @Override // kotlin.coroutines.i
    @NotNull
    public kotlin.coroutines.i minusKey(@NotNull i.c<?> cVar) {
        return this.f220218b.minusKey(cVar);
    }

    @Override // kotlin.coroutines.i
    @NotNull
    public kotlin.coroutines.i plus(@NotNull kotlin.coroutines.i iVar) {
        return this.f220218b.plus(iVar);
    }
}

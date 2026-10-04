package kotlin.coroutines;

import ed.p;
import kotlin.InterfaceC4887e0;
import kotlin.coroutines.i;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.3")
public abstract class a implements i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i.c<?> f217674a;

    public a(@NotNull i.c<?> key) {
        G.p(key, "key");
        this.f217674a = key;
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    public /* bridge */ <R> R fold(R r10, @NotNull p<? super R, ? super i.b, ? extends R> pVar) {
        return (R) i.b.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @Nullable
    public /* bridge */ <E extends i.b> E get(@NotNull i.c<E> cVar) {
        return (E) i.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.i.b
    @NotNull
    public i.c<?> getKey() {
        return this.f217674a;
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @NotNull
    public /* bridge */ i minusKey(@NotNull i.c<?> cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.i
    @NotNull
    public /* bridge */ i plus(@NotNull i iVar) {
        return i.b.a.d(this, iVar);
    }
}

package kotlinx.coroutines.flow;

import java.util.List;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class k<T> implements n<T>, a<T>, kotlinx.coroutines.flow.internal.i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final A0 f220228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n<T> f220229b;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@NotNull n<? extends T> nVar, @Nullable A0 a02) {
        this.f220228a = a02;
        this.f220229b = nVar;
    }

    @Override // kotlinx.coroutines.flow.n
    @NotNull
    public List<T> a() {
        return this.f220229b.a();
    }

    @Override // kotlinx.coroutines.flow.internal.i
    @NotNull
    public e<T> b(@NotNull kotlin.coroutines.i iVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        return o.e(this, iVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.n, kotlinx.coroutines.flow.e
    @Nullable
    public Object collect(@NotNull f<? super T> fVar, @NotNull kotlin.coroutines.e<?> eVar) {
        return this.f220229b.collect(fVar, eVar);
    }
}

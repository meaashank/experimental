package kotlinx.coroutines.flow;

import java.util.List;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class l<T> implements u<T>, a<T>, kotlinx.coroutines.flow.internal.i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final A0 f220230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u<T> f220231b;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull u<? extends T> uVar, @Nullable A0 a02) {
        this.f220230a = a02;
        this.f220231b = uVar;
    }

    @Override // kotlinx.coroutines.flow.n
    @NotNull
    public List<T> a() {
        return this.f220231b.a();
    }

    @Override // kotlinx.coroutines.flow.internal.i
    @NotNull
    public e<T> b(@NotNull kotlin.coroutines.i iVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        return v.d(this, iVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.n, kotlinx.coroutines.flow.e
    @Nullable
    public Object collect(@NotNull f<? super T> fVar, @NotNull kotlin.coroutines.e<?> eVar) {
        return this.f220231b.collect(fVar, eVar);
    }

    @Override // kotlinx.coroutines.flow.u
    public T getValue() {
        return this.f220231b.getValue();
    }
}

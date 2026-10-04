package kotlinx.coroutines.flow.internal;

import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.InterfaceC5120x0;
import kotlinx.coroutines.channels.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC5120x0
public final class m<T> implements kotlinx.coroutines.flow.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final s<T> f220225a;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull s<? super T> sVar) {
        this.f220225a = sVar;
    }

    @Override // kotlinx.coroutines.flow.f
    @Nullable
    public Object emit(T t10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objI = this.f220225a.I(t10, eVar);
        return objI == CoroutineSingletons.COROUTINE_SUSPENDED ? objI : L0.f217464a;
    }
}

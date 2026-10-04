package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class m<T> extends AbstractFlow<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.p<f<? super T>, kotlin.coroutines.e<? super L0>, Object> f220232a;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull ed.p<? super f<? super T>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar) {
        this.f220232a = pVar;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    @Nullable
    public Object c(@NotNull f<? super T> fVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objInvoke = this.f220232a.invoke(fVar, eVar);
        return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : L0.f217464a;
    }
}

package kotlinx.coroutines.flow.internal;

import kotlin.L0;
import kotlin.coroutines.f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.G;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    @NotNull
    public final kotlinx.coroutines.flow.e<S> f220099d;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowOperator(@NotNull kotlinx.coroutines.flow.e<? extends S> eVar, @NotNull kotlin.coroutines.i iVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        super(iVar, i10, bufferOverflow);
        this.f220099d = eVar;
    }

    public static <S, T> Object o(ChannelFlowOperator<S, T> channelFlowOperator, kotlinx.coroutines.flow.f<? super T> fVar, kotlin.coroutines.e<? super L0> eVar) {
        if (channelFlowOperator.f220075b == -3) {
            kotlin.coroutines.i context = eVar.getContext();
            kotlin.coroutines.i iVarD = CoroutineContextKt.d(context, channelFlowOperator.f220074a);
            if (G.g(iVarD, context)) {
                Object objR = channelFlowOperator.r(fVar, eVar);
                return objR == CoroutineSingletons.COROUTINE_SUSPENDED ? objR : L0.f217464a;
            }
            f.b bVar = kotlin.coroutines.f.f217679y3;
            if (G.g(iVarD.get(bVar), context.get(bVar))) {
                Object objQ = channelFlowOperator.q(fVar, iVarD, eVar);
                return objQ == CoroutineSingletons.COROUTINE_SUSPENDED ? objQ : L0.f217464a;
            }
        }
        Object objD = ChannelFlow.d(channelFlowOperator, fVar, eVar);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : L0.f217464a;
    }

    public static <S, T> Object p(ChannelFlowOperator<S, T> channelFlowOperator, q<? super T> qVar, kotlin.coroutines.e<? super L0> eVar) {
        Object objR = channelFlowOperator.r(new m(qVar), eVar);
        return objR == CoroutineSingletons.COROUTINE_SUSPENDED ? objR : L0.f217464a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.e
    @Nullable
    public Object collect(@NotNull kotlinx.coroutines.flow.f<? super T> fVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        return o(this, fVar, eVar);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    public Object e(@NotNull q<? super T> qVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        return p(this, qVar, eVar);
    }

    public final Object q(kotlinx.coroutines.flow.f<? super T> fVar, kotlin.coroutines.i iVar, kotlin.coroutines.e<? super L0> eVar) {
        return d.d(iVar, d.e(fVar, eVar.getContext()), null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), eVar, 4, null);
    }

    @Nullable
    public abstract Object r(@NotNull kotlinx.coroutines.flow.f<? super T> fVar, @NotNull kotlin.coroutines.e<? super L0> eVar);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public String toString() {
        return this.f220099d + " -> " + super.toString();
    }
}

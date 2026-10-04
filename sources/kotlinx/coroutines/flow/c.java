package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C4969v;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class c<T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ed.p<kotlinx.coroutines.channels.q<? super T>, kotlin.coroutines.e<? super L0>, Object> f220070d;

    public /* synthetic */ c(ed.p pVar, kotlin.coroutines.i iVar, int i10, BufferOverflow bufferOverflow, int i11, C4969v c4969v) {
        this(pVar, (i11 & 2) != 0 ? EmptyCoroutineContext.f217673a : iVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    public static <T> Object n(c<T> cVar, kotlinx.coroutines.channels.q<? super T> qVar, kotlin.coroutines.e<? super L0> eVar) {
        Object objInvoke = cVar.f220070d.invoke(qVar, eVar);
        return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : L0.f217464a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    public Object e(@NotNull kotlinx.coroutines.channels.q<? super T> qVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        return n(this, qVar, eVar);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public ChannelFlow<T> f(@NotNull kotlin.coroutines.i iVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        return new c(this.f220070d, iVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public String toString() {
        return "block[" + this.f220070d + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull ed.p<? super kotlinx.coroutines.channels.q<? super T>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar, @NotNull kotlin.coroutines.i iVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        super(iVar, i10, bufferOverflow);
        this.f220070d = pVar;
    }
}

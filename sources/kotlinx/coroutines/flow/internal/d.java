package kotlinx.coroutines.flow.internal;

import ed.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.V;
import kotlin.jvm.internal.Y;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,241:1\n91#2,5:242\n*S KotlinDebug\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n*L\n222#1:242,5\n*E\n"})
public final class d {
    @NotNull
    public static final <T> ChannelFlow<T> b(@NotNull kotlinx.coroutines.flow.e<? extends T> eVar) {
        ChannelFlow<T> channelFlow = eVar instanceof ChannelFlow ? (ChannelFlow) eVar : null;
        return channelFlow == null ? new e(eVar, null, 0, null, 14, null) : channelFlow;
    }

    @Nullable
    public static final <T, V> Object c(@NotNull kotlin.coroutines.i iVar, V v10, @NotNull Object obj, @NotNull p<? super V, ? super kotlin.coroutines.e<? super T>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super T> eVar) {
        Object objInvoke;
        Object objC = ThreadContextKt.c(iVar, obj);
        try {
            n nVar = new n(eVar, iVar);
            if (pVar instanceof BaseContinuationImpl) {
                Y.q(pVar, 2);
                objInvoke = pVar.invoke(v10, nVar);
            } else {
                objInvoke = IntrinsicsKt__IntrinsicsJvmKt.j(pVar, v10, nVar);
            }
            ThreadContextKt.a(iVar, objC);
            if (objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                Vc.f.c(eVar);
            }
            return objInvoke;
        } catch (Throwable th) {
            ThreadContextKt.a(iVar, objC);
            throw th;
        }
    }

    public static /* synthetic */ Object d(kotlin.coroutines.i iVar, Object obj, Object obj2, p pVar, kotlin.coroutines.e eVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = ThreadContextKt.b(iVar);
        }
        return c(iVar, obj, obj2, pVar, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.f<T> e(kotlinx.coroutines.flow.f<? super T> fVar, kotlin.coroutines.i iVar) {
        return fVar instanceof m ? true : fVar instanceof k ? fVar : new UndispatchedContextCollector(fVar, iVar);
    }
}

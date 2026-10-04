package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.V;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,128:1\n24#2,4:129\n24#2,4:134\n16#3:133\n16#3:138\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n*L\n122#1:129,4\n124#1:134,4\n122#1:133\n124#1:138\n*E\n"})
public final class o extends SharedFlowImpl<Integer> implements u<Integer> {
    public o(int i10) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        i(Integer.valueOf(i10));
    }

    @Override // kotlinx.coroutines.flow.u
    @NotNull
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(O().intValue());
        }
        return numValueOf;
    }

    public final boolean d0(int i10) {
        boolean zI;
        synchronized (this) {
            zI = i(Integer.valueOf(O().intValue() + i10));
        }
        return zI;
    }
}

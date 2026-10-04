package kotlinx.coroutines.flow;

import kotlin.jvm.internal.V;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.Q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,741:1\n1#2:742\n*E\n"})
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final Q f220233a = new Q("NO_VALUE");

    @NotNull
    public static final <T> i<T> a(int i10, int i11, @NotNull BufferOverflow bufferOverflow) {
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("replay cannot be negative, but was ", i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("extraBufferCapacity cannot be negative, but was ", i11).toString());
        }
        if (i10 <= 0 && i11 <= 0 && bufferOverflow != BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
        }
        int i12 = i11 + i10;
        if (i12 < 0) {
            i12 = Integer.MAX_VALUE;
        }
        return new SharedFlowImpl(i10, i12, bufferOverflow);
    }

    public static /* synthetic */ i b(int i10, int i11, BufferOverflow bufferOverflow, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return a(i10, i11, bufferOverflow);
    }

    @NotNull
    public static final <T> e<T> e(@NotNull n<? extends T> nVar, @NotNull kotlin.coroutines.i iVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        return ((i10 == 0 || i10 == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? nVar : new kotlinx.coroutines.flow.internal.e(nVar, iVar, i10, bufferOverflow);
    }

    public static final Object f(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    public static final void g(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}

package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,741:1\n1#2:742\n*E\n"})
public final class p extends kotlinx.coroutines.flow.internal.c<SharedFlowImpl<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    public long f220234a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @Nullable
    public kotlin.coroutines.e<? super L0> f220235b;

    @Override // kotlinx.coroutines.flow.internal.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@NotNull SharedFlowImpl<?> sharedFlowImpl) {
        if (this.f220234a >= 0) {
            return false;
        }
        this.f220234a = sharedFlowImpl.b0();
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public kotlin.coroutines.e<L0>[] b(@NotNull SharedFlowImpl<?> sharedFlowImpl) {
        long j10 = this.f220234a;
        this.f220234a = -1L;
        this.f220235b = null;
        return sharedFlowImpl.a0(j10);
    }
}

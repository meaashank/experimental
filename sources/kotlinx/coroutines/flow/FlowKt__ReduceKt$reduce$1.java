package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {18}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
public final class FlowKt__ReduceKt$reduce$1<S, T extends S> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f219739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f219740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f219741c;

    public FlowKt__ReduceKt$reduce$1(kotlin.coroutines.e<? super FlowKt__ReduceKt$reduce$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f219740b = obj;
        this.f219741c |= Integer.MIN_VALUE;
        return FlowKt__ReduceKt.i(null, null, this);
    }
}

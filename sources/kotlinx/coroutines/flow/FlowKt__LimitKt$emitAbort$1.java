package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {70}, m = "emitAbort$FlowKt__LimitKt", n = {"ownershipMarker"}, s = {"L$0"})
public final class FlowKt__LimitKt$emitAbort$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f219604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f219605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f219606c;

    public FlowKt__LimitKt$emitAbort$1(kotlin.coroutines.e<? super FlowKt__LimitKt$emitAbort$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f219605b = obj;
        this.f219606c |= Integer.MIN_VALUE;
        return FlowKt__LimitKt.f(null, null, null, this);
    }
}

package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {25}, m = "count", n = {"i"}, s = {"L$0"})
public final class FlowKt__CountKt$count$3<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f219424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f219425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f219426c;

    public FlowKt__CountKt$count$3(kotlin.coroutines.e<? super FlowKt__CountKt$count$3> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f219425b = obj;
        this.f219426c |= Integer.MIN_VALUE;
        return FlowKt__CountKt.a(null, null, this);
    }
}

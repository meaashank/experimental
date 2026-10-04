package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {Opcodes.IF_ICMPGT}, m = "lastOrNull", n = {R9.c.f67796d}, s = {"L$0"})
public final class FlowKt__ReduceKt$lastOrNull$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f219736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f219737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f219738c;

    public FlowKt__ReduceKt$lastOrNull$1(kotlin.coroutines.e<? super FlowKt__ReduceKt$lastOrNull$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f219737b = obj;
        this.f219738c |= Integer.MIN_VALUE;
        return FlowKt__ReduceKt.h(null, this);
    }
}

package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {Opcodes.PUTSTATIC}, m = "first", n = {R9.c.f67796d, "collector$iv"}, s = {"L$0", "L$1"})
public final class FlowKt__ReduceKt$first$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f219700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f219701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f219702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f219703d;

    public FlowKt__ReduceKt$first$1(kotlin.coroutines.e<? super FlowKt__ReduceKt$first$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f219702c = obj;
        this.f219703d |= Integer.MIN_VALUE;
        return FlowKt__ReduceKt.b(null, this);
    }
}

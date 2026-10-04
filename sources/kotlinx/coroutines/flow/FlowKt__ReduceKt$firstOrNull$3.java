package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {Opcodes.PUTSTATIC}, m = "firstOrNull", n = {R9.c.f67796d, "collector$iv"}, s = {"L$0", "L$1"})
public final class FlowKt__ReduceKt$firstOrNull$3<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f219720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f219721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f219722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f219723d;

    public FlowKt__ReduceKt$firstOrNull$3(kotlin.coroutines.e<? super FlowKt__ReduceKt$firstOrNull$3> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f219722c = obj;
        this.f219723d |= Integer.MIN_VALUE;
        return FlowKt__ReduceKt.c(null, null, this);
    }
}

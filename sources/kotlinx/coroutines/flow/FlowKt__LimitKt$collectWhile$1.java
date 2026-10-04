package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$1\n*L\n1#1,138:1\n*E\n"})
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {Opcodes.I2L}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
public final class FlowKt__LimitKt$collectWhile$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f219582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f219583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f219584c;

    public FlowKt__LimitKt$collectWhile$1(kotlin.coroutines.e<? super FlowKt__LimitKt$collectWhile$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f219583b = obj;
        this.f219584c |= Integer.MIN_VALUE;
        return FlowKt__LimitKt.b(null, null, this);
    }
}

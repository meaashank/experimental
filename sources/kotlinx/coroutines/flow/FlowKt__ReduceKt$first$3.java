package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0, 0}, l = {Opcodes.PUTSTATIC}, m = "first", n = {"predicate", R9.c.f67796d, "collector$iv"}, s = {"L$0", "L$1", "L$2"})
public final class FlowKt__ReduceKt$first$3<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f219704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f219705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f219706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f219707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f219708e;

    public FlowKt__ReduceKt$first$3(kotlin.coroutines.e<? super FlowKt__ReduceKt$first$3> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f219707d = obj;
        this.f219708e |= Integer.MIN_VALUE;
        return FlowKt__ReduceKt.a(null, null, this);
    }
}

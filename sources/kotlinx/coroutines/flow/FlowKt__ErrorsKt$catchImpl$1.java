package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {Opcodes.DCMPG}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
public final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f219553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f219554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f219555c;

    public FlowKt__ErrorsKt$catchImpl$1(kotlin.coroutines.e<? super FlowKt__ErrorsKt$catchImpl$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f219554b = obj;
        this.f219555c |= Integer.MIN_VALUE;
        return FlowKt__ErrorsKt.b(null, null, this);
    }
}

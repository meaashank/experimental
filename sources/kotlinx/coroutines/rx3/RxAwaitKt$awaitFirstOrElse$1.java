package kotlinx.coroutines.rx3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.rx3.RxAwaitKt", f = "RxAwait.kt", i = {0}, l = {Opcodes.FRETURN}, m = "awaitFirstOrElse", n = {"defaultValue"}, s = {"L$0"})
public final class RxAwaitKt$awaitFirstOrElse$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f220545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f220546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f220547c;

    public RxAwaitKt$awaitFirstOrElse$1(kotlin.coroutines.e<? super RxAwaitKt$awaitFirstOrElse$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f220546b = obj;
        this.f220547c |= Integer.MIN_VALUE;
        return RxAwaitKt.g(null, null, this);
    }
}

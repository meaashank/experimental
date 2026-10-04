package kotlinx.coroutines.reactive;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.reactive.AwaitKt", f = "Await.kt", i = {0}, l = {Opcodes.IF_ACMPNE}, m = "awaitSingleOrElse", n = {"defaultValue"}, s = {"L$0"})
public final class AwaitKt$awaitSingleOrElse$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f220452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f220453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f220454c;

    public AwaitKt$awaitSingleOrElse$1(kotlin.coroutines.e<? super AwaitKt$awaitSingleOrElse$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f220453b = obj;
        this.f220454c |= Integer.MIN_VALUE;
        return AwaitKt.m(null, null, this);
    }
}

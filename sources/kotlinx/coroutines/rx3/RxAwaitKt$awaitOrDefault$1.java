package kotlinx.coroutines.rx3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.rx3.RxAwaitKt", f = "RxAwait.kt", i = {0}, l = {105}, m = "awaitOrDefault", n = {"default"}, s = {"L$0"})
public final class RxAwaitKt$awaitOrDefault$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f220556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f220557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f220558c;

    public RxAwaitKt$awaitOrDefault$1(kotlin.coroutines.e<? super RxAwaitKt$awaitOrDefault$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f220557b = obj;
        this.f220558c |= Integer.MIN_VALUE;
        return RxAwaitKt.l(null, null, this);
    }
}

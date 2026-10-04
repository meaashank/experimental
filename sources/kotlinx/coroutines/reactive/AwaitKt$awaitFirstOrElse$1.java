package kotlinx.coroutines.reactive;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.reactive.AwaitKt", f = "Await.kt", i = {0}, l = {52}, m = "awaitFirstOrElse", n = {"defaultValue"}, s = {"L$0"})
public final class AwaitKt$awaitFirstOrElse$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f220433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f220434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f220435c;

    public AwaitKt$awaitFirstOrElse$1(kotlin.coroutines.e<? super AwaitKt$awaitFirstOrElse$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f220434b = obj;
        this.f220435c |= Integer.MIN_VALUE;
        return AwaitKt.f(null, null, this);
    }
}

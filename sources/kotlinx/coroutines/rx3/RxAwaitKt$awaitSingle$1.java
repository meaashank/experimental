package kotlinx.coroutines.rx3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.rx3.RxAwaitKt", f = "RxAwait.kt", i = {}, l = {59}, m = "awaitSingle", n = {}, s = {})
public final class RxAwaitKt$awaitSingle$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f220559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f220560b;

    public RxAwaitKt$awaitSingle$1(kotlin.coroutines.e<? super RxAwaitKt$awaitSingle$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f220559a = obj;
        this.f220560b |= Integer.MIN_VALUE;
        return RxAwaitKt.m(null, this);
    }
}

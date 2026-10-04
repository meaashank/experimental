package kotlinx.coroutines.selects;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {0}, l = {438, 441}, m = "doSelectSuspend", n = {"this"}, s = {"L$0"})
public final class SelectImplementation$doSelectSuspend$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f220699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f220700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectImplementation<R> f220701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f220702d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectImplementation$doSelectSuspend$1(SelectImplementation<R> selectImplementation, kotlin.coroutines.e<? super SelectImplementation$doSelectSuspend$1> eVar) {
        super(eVar);
        this.f220701c = selectImplementation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f220700b = obj;
        this.f220702d |= Integer.MIN_VALUE;
        return this.f220701c.y(this);
    }
}

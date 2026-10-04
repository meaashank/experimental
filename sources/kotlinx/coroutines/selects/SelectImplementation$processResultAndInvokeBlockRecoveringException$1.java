package kotlinx.coroutines.selects;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {}, l = {712}, m = "processResultAndInvokeBlockRecoveringException", n = {}, s = {})
public final class SelectImplementation$processResultAndInvokeBlockRecoveringException$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f220703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectImplementation<R> f220704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f220705c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectImplementation$processResultAndInvokeBlockRecoveringException$1(SelectImplementation<R> selectImplementation, kotlin.coroutines.e<? super SelectImplementation$processResultAndInvokeBlockRecoveringException$1> eVar) {
        super(eVar);
        this.f220704b = selectImplementation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f220703a = obj;
        this.f220705c |= Integer.MIN_VALUE;
        return this.f220704b.G(null, null, this);
    }
}

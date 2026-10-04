package kotlinx.coroutines.reactive;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.reactive.FlowSubscription", f = "ReactiveFlow.kt", i = {0}, l = {HttpStatus.SC_RESET_CONTENT}, m = "flowProcessing", n = {"this"}, s = {"L$0"})
public final class FlowSubscription$flowProcessing$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f220471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f220472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FlowSubscription<T> f220473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f220474d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowSubscription$flowProcessing$1(FlowSubscription<T> flowSubscription, kotlin.coroutines.e<? super FlowSubscription$flowProcessing$1> eVar) {
        super(eVar);
        this.f220473c = flowSubscription;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f220472b = obj;
        this.f220474d |= Integer.MIN_VALUE;
        return this.f220473c.a2(this);
    }
}

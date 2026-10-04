package kotlinx.coroutines.rx3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.rx3.RxSchedulerKt", f = "RxScheduler.kt", i = {0}, l = {122}, m = "scheduleTask$task", n = {"ctx"}, s = {"L$0"})
public final class RxSchedulerKt$scheduleTask$task$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f220606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f220607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f220608c;

    public RxSchedulerKt$scheduleTask$task$1(kotlin.coroutines.e<? super RxSchedulerKt$scheduleTask$task$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f220607b = obj;
        this.f220608c |= Integer.MIN_VALUE;
        return RxSchedulerKt.i(null, null, null, this);
    }
}

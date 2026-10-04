package kotlinx.coroutines.rx3;

import kotlin.L0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class RxSchedulerKt$scheduleTask$toSchedule$1 extends FunctionReferenceImpl implements ed.l<kotlin.coroutines.e<? super L0>, Object>, Vc.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.disposables.d f220610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.i f220611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f220612c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxSchedulerKt$scheduleTask$toSchedule$1(io.reactivex.rxjava3.disposables.d dVar, kotlin.coroutines.i iVar, Runnable runnable) {
        super(1, G.a.class, "task", "scheduleTask$task(Lio/reactivex/rxjava3/disposables/Disposable;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.f220610a = dVar;
        this.f220611b = iVar;
        this.f220612c = runnable;
    }

    @Override // ed.l
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull kotlin.coroutines.e<? super L0> eVar) {
        return RxSchedulerKt.i(this.f220610a, this.f220611b, this.f220612c, eVar);
    }
}

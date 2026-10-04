package kotlinx.coroutines.rx3;

import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.rx3.DispatcherScheduler$scheduleDirect$1$1$1", f = "RxScheduler.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
public final class DispatcherScheduler$scheduleDirect$1$1$1 extends SuspendLambda implements ed.p<L, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f220539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ed.l<kotlin.coroutines.e<? super L0>, Object> f220540b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DispatcherScheduler$scheduleDirect$1$1$1(ed.l<? super kotlin.coroutines.e<? super L0>, ? extends Object> lVar, kotlin.coroutines.e<? super DispatcherScheduler$scheduleDirect$1$1$1> eVar) {
        super(2, eVar);
        this.f220540b = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        return new DispatcherScheduler$scheduleDirect$1$1$1(this.f220540b, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f220539a;
        if (i10 == 0) {
            C4885d0.n(obj);
            ed.l<kotlin.coroutines.e<? super L0>, Object> lVar = this.f220540b;
            this.f220539a = 1;
            if (lVar.invoke(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
        }
        return L0.f217464a;
    }

    @Override // ed.p
    @Nullable
    public final Object invoke(@NotNull L l10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((DispatcherScheduler$scheduleDirect$1$1$1) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }
}

package kotlinx.coroutines;

import ed.InterfaceC4376a;
import kotlin.C4885d0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class InterruptibleKt$runInterruptible$2<T> extends SuspendLambda implements ed.p<L, kotlin.coroutines.e<? super T>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f218737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f218738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4376a<T> f218739c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InterruptibleKt$runInterruptible$2(InterfaceC4376a<? extends T> interfaceC4376a, kotlin.coroutines.e<? super InterruptibleKt$runInterruptible$2> eVar) {
        super(2, eVar);
        this.f218739c = interfaceC4376a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<kotlin.L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.f218739c, eVar);
        interruptibleKt$runInterruptible$2.f218738b = obj;
        return interruptibleKt$runInterruptible$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.f218737a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C4885d0.n(obj);
        return InterruptibleKt.d(((L) this.f218738b).m(), this.f218739c);
    }

    @Override // ed.p
    @Nullable
    public final Object invoke(@NotNull L l10, @Nullable kotlin.coroutines.e<? super T> eVar) {
        return ((InterruptibleKt$runInterruptible$2) create(l10, eVar)).invokeSuspend(kotlin.L0.f217464a);
    }
}

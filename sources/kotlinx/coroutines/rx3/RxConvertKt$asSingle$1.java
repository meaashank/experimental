package kotlinx.coroutines.rx3;

import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.L;
import kotlinx.coroutines.S;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.rx3.RxConvertKt$asSingle$1", f = "RxConvert.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
public final class RxConvertKt$asSingle$1<T> extends SuspendLambda implements ed.p<L, kotlin.coroutines.e<? super T>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f220589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S<T> f220590b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RxConvertKt$asSingle$1(S<? extends T> s10, kotlin.coroutines.e<? super RxConvertKt$asSingle$1> eVar) {
        super(2, eVar);
        this.f220590b = s10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        return new RxConvertKt$asSingle$1(this.f220590b, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f220589a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
            return obj;
        }
        C4885d0.n(obj);
        S<T> s10 = this.f220590b;
        this.f220589a = 1;
        Object objO = s10.o(this);
        return objO == coroutineSingletons ? coroutineSingletons : objO;
    }

    @Override // ed.p
    @Nullable
    public final Object invoke(@NotNull L l10, @Nullable kotlin.coroutines.e<? super T> eVar) {
        return ((RxConvertKt$asSingle$1) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }
}

package androidx.compose.runtime;

import kotlin.C4885d0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
public final class SdkStubsFallbackFrameClock$withFrameNanos$2<R> extends SuspendLambda implements ed.p<kotlinx.coroutines.L, kotlin.coroutines.e<? super R>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f99340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ed.l<Long, R> f99341b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SdkStubsFallbackFrameClock$withFrameNanos$2(ed.l<? super Long, ? extends R> lVar, kotlin.coroutines.e<? super SdkStubsFallbackFrameClock$withFrameNanos$2> eVar) {
        super(2, eVar);
        this.f99341b = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<kotlin.L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        return new SdkStubsFallbackFrameClock$withFrameNanos$2(this.f99341b, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f99340a;
        if (i10 == 0) {
            C4885d0.n(obj);
            this.f99340a = 1;
            if (DelayKt.b(16L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
        }
        return this.f99341b.invoke(new Long(System.nanoTime()));
    }

    @Override // ed.p
    @Nullable
    public final Object invoke(@NotNull kotlinx.coroutines.L l10, @Nullable kotlin.coroutines.e<? super R> eVar) {
        return ((SdkStubsFallbackFrameClock$withFrameNanos$2) create(l10, eVar)).invokeSuspend(kotlin.L0.f217464a);
    }
}

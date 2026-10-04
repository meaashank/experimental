package androidx.compose.material;

import kotlin.C4885d0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.material.RangeSliderLogic$captureThumb$1", f = "Slider.kt", i = {}, l = {1076}, m = "invokeSuspend", n = {}, s = {})
public final class RangeSliderLogic$captureThumb$1 extends SuspendLambda implements ed.p<kotlinx.coroutines.L, kotlin.coroutines.e<? super kotlin.L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f97015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RangeSliderLogic f97016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f97017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.d f97018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeSliderLogic$captureThumb$1(RangeSliderLogic rangeSliderLogic, boolean z10, androidx.compose.foundation.interaction.d dVar, kotlin.coroutines.e<? super RangeSliderLogic$captureThumb$1> eVar) {
        super(2, eVar);
        this.f97016b = rangeSliderLogic;
        this.f97017c = z10;
        this.f97018d = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<kotlin.L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        return new RangeSliderLogic$captureThumb$1(this.f97016b, this.f97017c, this.f97018d, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f97015a;
        if (i10 == 0) {
            C4885d0.n(obj);
            androidx.compose.foundation.interaction.g gVarA = this.f97016b.a(this.f97017c);
            androidx.compose.foundation.interaction.d dVar = this.f97018d;
            this.f97015a = 1;
            if (gVarA.b(dVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
        }
        return kotlin.L0.f217464a;
    }

    @Override // ed.p
    @Nullable
    public final Object invoke(@NotNull kotlinx.coroutines.L l10, @Nullable kotlin.coroutines.e<? super kotlin.L0> eVar) {
        return ((RangeSliderLogic$captureThumb$1) create(l10, eVar)).invokeSuspend(kotlin.L0.f217464a);
    }
}

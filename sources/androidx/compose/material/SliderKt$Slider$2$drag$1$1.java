package androidx.compose.material;

import androidx.compose.runtime.X1;
import kotlin.C4885d0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.material.SliderKt$Slider$2$drag$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SliderKt$Slider$2$drag$1$1 extends SuspendLambda implements ed.q<kotlinx.coroutines.L, Float, kotlin.coroutines.e<? super kotlin.L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f97268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ float f97269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X1<ed.l<Float, kotlin.L0>> f97270c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$2$drag$1$1(X1<? extends ed.l<? super Float, kotlin.L0>> x12, kotlin.coroutines.e<? super SliderKt$Slider$2$drag$1$1> eVar) {
        super(3, eVar);
        this.f97270c = x12;
    }

    @Nullable
    public final Object e(@NotNull kotlinx.coroutines.L l10, float f10, @Nullable kotlin.coroutines.e<? super kotlin.L0> eVar) {
        SliderKt$Slider$2$drag$1$1 sliderKt$Slider$2$drag$1$1 = new SliderKt$Slider$2$drag$1$1(this.f97270c, eVar);
        sliderKt$Slider$2$drag$1$1.f97269b = f10;
        return sliderKt$Slider$2$drag$1$1.invokeSuspend(kotlin.L0.f217464a);
    }

    @Override // ed.q
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.L l10, Float f10, kotlin.coroutines.e<? super kotlin.L0> eVar) {
        return e(l10, f10.floatValue(), eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.f97268a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C4885d0.n(obj);
        this.f97270c.getValue().invoke(new Float(this.f97269b));
        return kotlin.L0.f217464a;
    }
}

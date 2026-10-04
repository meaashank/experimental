package androidx.compose.material;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class SliderKt$RangeSlider$2$3$1 extends FunctionReferenceImpl implements ed.l<Float, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ md.f<Float> f97191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f97192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f97193c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$2$3$1(md.f<Float> fVar, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
        super(1, G.a.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.f97191a = fVar;
        this.f97192b = floatRef;
        this.f97193c = floatRef2;
    }

    @NotNull
    public final Float e(float f10) {
        return Float.valueOf(SliderKt$RangeSlider$2.i(this.f97191a, this.f97192b, this.f97193c, f10));
    }

    @Override // ed.l
    public /* bridge */ /* synthetic */ Float invoke(Float f10) {
        return e(f10.floatValue());
    }
}

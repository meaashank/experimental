package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.InterfaceC1689l;
import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.C1968u;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.InterfaceC1917i;
import androidx.compose.runtime.InterfaceC1926l;
import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.X1;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import ed.InterfaceC4376a;
import java.util.List;
import k0.C4811b;
import k0.InterfaceC4814e;
import kotlin.C4885d0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C5092j;
import md.C5229e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1200:1\n77#2:1201\n77#2:1202\n481#3:1203\n480#3,4:1204\n484#3,2:1211\n488#3:1217\n1225#4,3:1208\n1228#4,3:1214\n1225#4,6:1218\n1225#4,6:1224\n1225#4,6:1230\n1225#4,6:1236\n1225#4,6:1242\n1225#4,6:1248\n480#5:1213\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$2\n*L\n182#1:1201\n187#1:1202\n198#1:1203\n198#1:1204,4\n198#1:1211,2\n198#1:1217\n198#1:1208,3\n198#1:1214,3\n199#1:1218,6\n200#1:1224,6\n202#1:1230,6\n211#1:1236,6\n213#1:1242,6\n242#1:1248,6\n198#1:1213\n*E\n"})
public final class SliderKt$Slider$2 extends Lambda implements ed.q<InterfaceC1689l, InterfaceC1946s, Integer, kotlin.L0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md.f<Float> f97257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f97258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<Float> f97259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4376a<kotlin.L0> f97260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.g f97261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f97262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w0 f97263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X1<ed.l<Float, kotlin.L0>> f97264k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$2(md.f<Float> fVar, float f10, List<Float> list, InterfaceC4376a<kotlin.L0> interfaceC4376a, androidx.compose.foundation.interaction.g gVar, boolean z10, w0 w0Var, X1<? extends ed.l<? super Float, kotlin.L0>> x12) {
        super(3);
        this.f97257d = fVar;
        this.f97258e = f10;
        this.f97259f = list;
        this.f97260g = interfaceC4376a;
        this.f97261h = gVar;
        this.f97262i = z10;
        this.f97263j = w0Var;
        this.f97264k = x12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i(md.f<Float> fVar, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f10) {
        return SliderKt.C(fVar.b().floatValue(), fVar.h().floatValue(), f10, floatRef.f217901a, floatRef2.f217901a);
    }

    public static final float j(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, md.f<Float> fVar, float f10) {
        return SliderKt.C(floatRef.f217901a, floatRef2.f217901a, f10, fVar.b().floatValue(), fVar.h().floatValue());
    }

    @InterfaceC1917i
    @InterfaceC1926l(applier = "androidx.compose.ui.UiComposable")
    public final void h(@NotNull InterfaceC1689l interfaceC1689l, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
        InterfaceC1689l interfaceC1689l2;
        int i11;
        androidx.compose.runtime.F0 f02;
        Ref.FloatRef floatRef;
        Ref.FloatRef floatRef2;
        final androidx.compose.runtime.F0 f03;
        Ref.FloatRef floatRef3;
        Ref.FloatRef floatRef4;
        SliderDraggableState sliderDraggableState;
        if ((i10 & 6) == 0) {
            interfaceC1689l2 = interfaceC1689l;
            i11 = i10 | (interfaceC1946s.x(interfaceC1689l2) ? 4 : 2);
        } else {
            interfaceC1689l2 = interfaceC1689l;
            i11 = i10;
        }
        if ((i11 & 19) == 18 && interfaceC1946s.c()) {
            interfaceC1946s.o();
            return;
        }
        if (C1968u.c0()) {
            C1968u.p0(2085116814, i11, -1, "androidx.compose.material.Slider.<anonymous> (Slider.kt:181)");
        }
        boolean z10 = interfaceC1946s.Q(CompositionLocalsKt.q()) == LayoutDirection.Rtl;
        float fO = C4811b.o(interfaceC1689l2.e());
        final Ref.FloatRef floatRef5 = new Ref.FloatRef();
        final Ref.FloatRef floatRef6 = new Ref.FloatRef();
        InterfaceC4814e interfaceC4814e = (InterfaceC4814e) interfaceC1946s.Q(CompositionLocalsKt.f103485f);
        floatRef5.f217901a = Math.max(fO - interfaceC4814e.l2(SliderKt.z()), 0.0f);
        floatRef6.f217901a = Math.min(interfaceC4814e.l2(SliderKt.f97158a), floatRef5.f217901a);
        Object objA0 = interfaceC1946s.a0();
        InterfaceC1946s.f99968a.getClass();
        Object obj = InterfaceC1946s.a.f99970b;
        if (objA0 == obj) {
            Object g10 = new androidx.compose.runtime.G(EffectsKt.m(EmptyCoroutineContext.f217673a, interfaceC1946s));
            interfaceC1946s.S(g10);
            objA0 = g10;
        }
        final kotlinx.coroutines.L l10 = ((androidx.compose.runtime.G) objA0).f99123a;
        float f10 = this.f97258e;
        md.f<Float> fVar = this.f97257d;
        Object objA02 = interfaceC1946s.a0();
        if (objA02 == obj) {
            objA02 = ActualAndroid_androidKt.b(i(fVar, floatRef6, floatRef5, f10));
            interfaceC1946s.S(objA02);
        }
        final androidx.compose.runtime.F0 f04 = (androidx.compose.runtime.F0) objA02;
        Object objA03 = interfaceC1946s.a0();
        if (objA03 == obj) {
            objA03 = ActualAndroid_androidKt.b(0.0f);
            interfaceC1946s.S(objA03);
        }
        final androidx.compose.runtime.F0 f05 = (androidx.compose.runtime.F0) objA03;
        boolean zC = interfaceC1946s.C(floatRef6.f217901a) | interfaceC1946s.C(floatRef5.f217901a) | interfaceC1946s.x(this.f97257d);
        final X1<ed.l<Float, kotlin.L0>> x12 = this.f97264k;
        final md.f<Float> fVar2 = this.f97257d;
        Object objA04 = interfaceC1946s.a0();
        if (zC || objA04 == obj) {
            f02 = f05;
            floatRef = floatRef6;
            floatRef2 = floatRef5;
            objA04 = new SliderDraggableState(new ed.l<Float, kotlin.L0>() { // from class: androidx.compose.material.SliderKt$Slider$2$draggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void e(float f11) {
                    androidx.compose.runtime.F0 f06 = f04;
                    f06.setFloatValue(f05.getFloatValue() + f06.getFloatValue() + f11);
                    f05.setFloatValue(0.0f);
                    x12.getValue().invoke(Float.valueOf(SliderKt$Slider$2.j(floatRef6, floatRef5, fVar2, md.u.J(f04.getFloatValue(), floatRef6.f217901a, floatRef5.f217901a))));
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(Float f11) {
                    e(f11.floatValue());
                    return kotlin.L0.f217464a;
                }
            });
            interfaceC1946s.S(objA04);
        } else {
            floatRef2 = floatRef5;
            floatRef = floatRef6;
            f02 = f05;
        }
        final SliderDraggableState sliderDraggableState2 = (SliderDraggableState) objA04;
        boolean zX = interfaceC1946s.x(this.f97257d) | interfaceC1946s.C(floatRef.f217901a) | interfaceC1946s.C(floatRef2.f217901a);
        md.f<Float> fVar3 = this.f97257d;
        Object objA05 = interfaceC1946s.a0();
        if (zX || objA05 == obj) {
            objA05 = new SliderKt$Slider$2$2$1(fVar3, floatRef, floatRef2);
            interfaceC1946s.S(objA05);
        }
        SliderKt.a((ed.l) ((kotlin.reflect.i) objA05), this.f97257d, new C5229e(floatRef.f217901a, floatRef2.f217901a), f04, this.f97258e, interfaceC1946s, 3072);
        boolean zC0 = interfaceC1946s.c0(this.f97259f) | interfaceC1946s.C(floatRef.f217901a) | interfaceC1946s.C(floatRef2.f217901a) | interfaceC1946s.c0(l10) | interfaceC1946s.c0(sliderDraggableState2) | interfaceC1946s.x(this.f97260g);
        final List<Float> list = this.f97259f;
        final InterfaceC4376a<kotlin.L0> interfaceC4376a = this.f97260g;
        Object objA06 = interfaceC1946s.a0();
        if (zC0 || objA06 == obj) {
            final Ref.FloatRef floatRef7 = floatRef;
            final Ref.FloatRef floatRef8 = floatRef2;
            f03 = f04;
            Object obj2 = new ed.l<Float, kotlin.L0>() { // from class: androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1, reason: invalid class name */
                @Vc.d(c = "androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1", f = "Slider.kt", i = {}, l = {DefaultImageHeaderParser.f139853j}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass1 extends SuspendLambda implements ed.p<kotlinx.coroutines.L, kotlin.coroutines.e<? super kotlin.L0>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public int f97284a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ SliderDraggableState f97285b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ float f97286c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ float f97287d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ float f97288e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ InterfaceC4376a<kotlin.L0> f97289f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(SliderDraggableState sliderDraggableState, float f10, float f11, float f12, InterfaceC4376a<kotlin.L0> interfaceC4376a, kotlin.coroutines.e<? super AnonymousClass1> eVar) {
                        super(2, eVar);
                        this.f97285b = sliderDraggableState;
                        this.f97286c = f10;
                        this.f97287d = f11;
                        this.f97288e = f12;
                        this.f97289f = interfaceC4376a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final kotlin.coroutines.e<kotlin.L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
                        return new AnonymousClass1(this.f97285b, this.f97286c, this.f97287d, this.f97288e, this.f97289f, eVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i10 = this.f97284a;
                        if (i10 == 0) {
                            C4885d0.n(obj);
                            SliderDraggableState sliderDraggableState = this.f97285b;
                            float f10 = this.f97286c;
                            float f11 = this.f97287d;
                            float f12 = this.f97288e;
                            this.f97284a = 1;
                            if (SliderKt.w(sliderDraggableState, f10, f11, f12, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C4885d0.n(obj);
                        }
                        InterfaceC4376a<kotlin.L0> interfaceC4376a = this.f97289f;
                        if (interfaceC4376a != null) {
                            interfaceC4376a.invoke();
                        }
                        return kotlin.L0.f217464a;
                    }

                    @Override // ed.p
                    @Nullable
                    public final Object invoke(@NotNull kotlinx.coroutines.L l10, @Nullable kotlin.coroutines.e<? super kotlin.L0> eVar) {
                        return ((AnonymousClass1) create(l10, eVar)).invokeSuspend(kotlin.L0.f217464a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void e(float f11) {
                    InterfaceC4376a<kotlin.L0> interfaceC4376a2;
                    float floatValue = f03.getFloatValue();
                    float fH = SliderKt.H(floatValue, list, floatRef7.f217901a, floatRef8.f217901a);
                    if (floatValue != fH) {
                        C5092j.f(l10, null, null, new AnonymousClass1(sliderDraggableState2, floatValue, fH, f11, interfaceC4376a, null), 3, null);
                    } else {
                        if (sliderDraggableState2.g() || (interfaceC4376a2 = interfaceC4376a) == null) {
                            return;
                        }
                        interfaceC4376a2.invoke();
                    }
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(Float f11) {
                    e(f11.floatValue());
                    return kotlin.L0.f217464a;
                }
            };
            floatRef3 = floatRef7;
            floatRef4 = floatRef8;
            sliderDraggableState = sliderDraggableState2;
            interfaceC1946s.S(obj2);
            objA06 = obj2;
        } else {
            floatRef4 = floatRef2;
            floatRef3 = floatRef;
            sliderDraggableState = sliderDraggableState2;
            f03 = f04;
        }
        X1 x1H = M1.h((ed.l) objA06, interfaceC1946s, 0);
        p.a aVar = androidx.compose.ui.p.f103112M2;
        androidx.compose.ui.p pVarG = SliderKt.G(aVar, sliderDraggableState, this.f97261h, fO, z10, f03, x1H, f02, this.f97262i);
        Orientation orientation = Orientation.Horizontal;
        boolean zG = sliderDraggableState.g();
        boolean z11 = this.f97262i;
        boolean z12 = z10;
        androidx.compose.foundation.interaction.g gVar = this.f97261h;
        boolean zX2 = interfaceC1946s.x(x1H);
        Object objA07 = interfaceC1946s.a0();
        if (zX2 || objA07 == obj) {
            objA07 = new SliderKt$Slider$2$drag$1$1(x1H, null);
            interfaceC1946s.S(objA07);
        }
        SliderKt.e(this.f97262i, SliderKt.y(this.f97257d.b().floatValue(), this.f97257d.h().floatValue(), md.u.J(this.f97258e, this.f97257d.b().floatValue(), this.f97257d.h().floatValue())), this.f97259f, this.f97263j, floatRef4.f217901a - floatRef3.f217901a, this.f97261h, pVarG.P0(DraggableKt.h(aVar, sliderDraggableState, orientation, z11, gVar, zG, null, (ed.q) objA07, z12, 32, null)), interfaceC1946s, 0);
        if (C1968u.c0()) {
            C1968u.o0();
        }
    }

    @Override // ed.q
    public /* bridge */ /* synthetic */ kotlin.L0 invoke(InterfaceC1689l interfaceC1689l, InterfaceC1946s interfaceC1946s, Integer num) {
        h(interfaceC1689l, interfaceC1946s, num.intValue());
        return kotlin.L0.f217464a;
    }
}

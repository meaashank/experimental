package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1575b;
import androidx.compose.animation.core.C1595l;
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
@kotlin.jvm.internal.V({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1200:1\n77#2:1201\n77#2:1202\n1225#3,6:1203\n1225#3,6:1209\n1225#3,6:1215\n1225#3,6:1221\n1225#3,3:1232\n1228#3,3:1238\n1225#3,6:1242\n1225#3,6:1248\n1225#3,6:1254\n1225#3,6:1260\n481#4:1227\n480#4,4:1228\n484#4,2:1235\n488#4:1241\n480#5:1237\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n*L\n321#1:1201\n326#1:1202\n337#1:1203,6\n338#1:1209,6\n341#1:1215,6\n348#1:1221,6\n355#1:1232,3\n355#1:1238,3\n356#1:1242,6\n380#1:1248,6\n422#1:1254,6\n430#1:1260,6\n355#1:1227\n355#1:1228,4\n355#1:1235,2\n355#1:1241\n355#1:1237\n*E\n"})
public final class SliderKt$RangeSlider$2 extends Lambda implements ed.q<InterfaceC1689l, InterfaceC1946s, Integer, kotlin.L0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md.f<Float> f97178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ md.f<Float> f97179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<Float> f97180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4376a<kotlin.L0> f97181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ X1<ed.l<md.f<Float>, kotlin.L0>> f97182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.g f97183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.g f97184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f97185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f97186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w0 f97187m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2(md.f<Float> fVar, md.f<Float> fVar2, List<Float> list, InterfaceC4376a<kotlin.L0> interfaceC4376a, X1<? extends ed.l<? super md.f<Float>, kotlin.L0>> x12, androidx.compose.foundation.interaction.g gVar, androidx.compose.foundation.interaction.g gVar2, boolean z10, int i10, w0 w0Var) {
        super(3);
        this.f97178d = fVar;
        this.f97179e = fVar2;
        this.f97180f = list;
        this.f97181g = interfaceC4376a;
        this.f97182h = x12;
        this.f97183i = gVar;
        this.f97184j = gVar2;
        this.f97185k = z10;
        this.f97186l = i10;
        this.f97187m = w0Var;
    }

    public static final float i(md.f<Float> fVar, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f10) {
        return SliderKt.C(fVar.b().floatValue(), fVar.h().floatValue(), f10, floatRef.f217901a, floatRef2.f217901a);
    }

    public static final md.f<Float> j(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, md.f<Float> fVar, md.f<Float> fVar2) {
        return SliderKt.D(floatRef.f217901a, floatRef2.f217901a, fVar2, fVar.b().floatValue(), fVar.h().floatValue());
    }

    @InterfaceC1917i
    @InterfaceC1926l(applier = "androidx.compose.ui.UiComposable")
    public final void h(@NotNull InterfaceC1689l interfaceC1689l, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
        InterfaceC1689l interfaceC1689l2;
        int i11;
        Ref.FloatRef floatRef;
        Ref.FloatRef floatRef2;
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
            C1968u.p0(652589923, i11, -1, "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:320)");
        }
        boolean z10 = interfaceC1946s.Q(CompositionLocalsKt.q()) == LayoutDirection.Rtl;
        float fO = C4811b.o(interfaceC1689l2.e());
        final Ref.FloatRef floatRef3 = new Ref.FloatRef();
        final Ref.FloatRef floatRef4 = new Ref.FloatRef();
        InterfaceC4814e interfaceC4814e = (InterfaceC4814e) interfaceC1946s.Q(CompositionLocalsKt.f103485f);
        floatRef3.f217901a = fO - interfaceC4814e.l2(SliderKt.z());
        floatRef4.f217901a = interfaceC4814e.l2(SliderKt.f97158a);
        md.f<Float> fVar = this.f97179e;
        md.f<Float> fVar2 = this.f97178d;
        Object objA0 = interfaceC1946s.a0();
        InterfaceC1946s.f99968a.getClass();
        Object obj = InterfaceC1946s.a.f99970b;
        if (objA0 == obj) {
            objA0 = ActualAndroid_androidKt.b(i(fVar2, floatRef4, floatRef3, fVar.b().floatValue()));
            interfaceC1946s.S(objA0);
        }
        final androidx.compose.runtime.F0 f02 = (androidx.compose.runtime.F0) objA0;
        md.f<Float> fVar3 = this.f97179e;
        md.f<Float> fVar4 = this.f97178d;
        Object objA02 = interfaceC1946s.a0();
        if (objA02 == obj) {
            objA02 = ActualAndroid_androidKt.b(i(fVar4, floatRef4, floatRef3, fVar3.h().floatValue()));
            interfaceC1946s.S(objA02);
        }
        final androidx.compose.runtime.F0 f03 = (androidx.compose.runtime.F0) objA02;
        boolean zX = interfaceC1946s.x(this.f97178d) | interfaceC1946s.C(floatRef4.f217901a) | interfaceC1946s.C(floatRef3.f217901a);
        md.f<Float> fVar5 = this.f97178d;
        Object objA03 = interfaceC1946s.a0();
        if (zX || objA03 == obj) {
            objA03 = new SliderKt$RangeSlider$2$2$1(fVar5, floatRef4, floatRef3);
            interfaceC1946s.S(objA03);
        }
        SliderKt.a((ed.l) ((kotlin.reflect.i) objA03), this.f97178d, new C5229e(floatRef4.f217901a, floatRef3.f217901a), f02, this.f97179e.b().floatValue(), interfaceC1946s, 3072);
        boolean zX2 = interfaceC1946s.x(this.f97178d) | interfaceC1946s.C(floatRef4.f217901a) | interfaceC1946s.C(floatRef3.f217901a);
        md.f<Float> fVar6 = this.f97178d;
        Object objA04 = interfaceC1946s.a0();
        if (zX2 || objA04 == obj) {
            objA04 = new SliderKt$RangeSlider$2$3$1(fVar6, floatRef4, floatRef3);
            interfaceC1946s.S(objA04);
        }
        SliderKt.a((ed.l) ((kotlin.reflect.i) objA04), this.f97178d, new C5229e(floatRef4.f217901a, floatRef3.f217901a), f03, this.f97179e.h().floatValue(), interfaceC1946s, 3072);
        Object objA05 = interfaceC1946s.a0();
        if (objA05 == obj) {
            Object g10 = new androidx.compose.runtime.G(EffectsKt.m(EmptyCoroutineContext.f217673a, interfaceC1946s));
            interfaceC1946s.S(g10);
            objA05 = g10;
        }
        final kotlinx.coroutines.L l10 = ((androidx.compose.runtime.G) objA05).f99123a;
        boolean zC0 = interfaceC1946s.c0(this.f97180f) | interfaceC1946s.C(floatRef4.f217901a) | interfaceC1946s.C(floatRef3.f217901a) | interfaceC1946s.x(this.f97181g) | interfaceC1946s.c0(l10) | interfaceC1946s.x(this.f97182h) | interfaceC1946s.x(this.f97178d);
        final List<Float> list = this.f97180f;
        final InterfaceC4376a<kotlin.L0> interfaceC4376a = this.f97181g;
        final X1<ed.l<md.f<Float>, kotlin.L0>> x12 = this.f97182h;
        final md.f<Float> fVar7 = this.f97178d;
        Object objA06 = interfaceC1946s.a0();
        if (zC0 || objA06 == obj) {
            objA06 = new ed.l<Boolean, kotlin.L0>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1, reason: invalid class name */
                @Vc.d(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1", f = "Slider.kt", i = {}, l = {366}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass1 extends SuspendLambda implements ed.p<kotlinx.coroutines.L, kotlin.coroutines.e<? super kotlin.L0>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public int f97205a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ float f97206b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ float f97207c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ InterfaceC4376a<kotlin.L0> f97208d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ boolean f97209e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ androidx.compose.runtime.F0 f97210f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ androidx.compose.runtime.F0 f97211g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ X1<ed.l<md.f<Float>, kotlin.L0>> f97212h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    public final /* synthetic */ Ref.FloatRef f97213i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ Ref.FloatRef f97214j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    public final /* synthetic */ md.f<Float> f97215k;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(float f10, float f11, InterfaceC4376a<kotlin.L0> interfaceC4376a, boolean z10, androidx.compose.runtime.F0 f02, androidx.compose.runtime.F0 f03, X1<? extends ed.l<? super md.f<Float>, kotlin.L0>> x12, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, md.f<Float> fVar, kotlin.coroutines.e<? super AnonymousClass1> eVar) {
                        super(2, eVar);
                        this.f97206b = f10;
                        this.f97207c = f11;
                        this.f97208d = interfaceC4376a;
                        this.f97209e = z10;
                        this.f97210f = f02;
                        this.f97211g = f03;
                        this.f97212h = x12;
                        this.f97213i = floatRef;
                        this.f97214j = floatRef2;
                        this.f97215k = fVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final kotlin.coroutines.e<kotlin.L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
                        return new AnonymousClass1(this.f97206b, this.f97207c, this.f97208d, this.f97209e, this.f97210f, this.f97211g, this.f97212h, this.f97213i, this.f97214j, this.f97215k, eVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i10 = this.f97205a;
                        if (i10 == 0) {
                            C4885d0.n(obj);
                            Animatable animatableB = C1575b.b(this.f97206b, 0.0f, 2, null);
                            Float f10 = new Float(this.f97207c);
                            androidx.compose.animation.core.G0 g02 = SliderKt.f97166i;
                            Float f11 = new Float(0.0f);
                            final boolean z10 = this.f97209e;
                            final androidx.compose.runtime.F0 f02 = this.f97210f;
                            final androidx.compose.runtime.F0 f03 = this.f97211g;
                            final X1<ed.l<md.f<Float>, kotlin.L0>> x12 = this.f97212h;
                            final Ref.FloatRef floatRef = this.f97213i;
                            final Ref.FloatRef floatRef2 = this.f97214j;
                            final md.f<Float> fVar = this.f97215k;
                            ed.l<Animatable<Float, C1595l>, kotlin.L0> lVar = new ed.l<Animatable<Float, C1595l>, kotlin.L0>() { // from class: androidx.compose.material.SliderKt.RangeSlider.2.gestureEndAction.1.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void e(@NotNull Animatable<Float, C1595l> animatable) {
                                    (z10 ? f02 : f03).setFloatValue(animatable.v().floatValue());
                                    x12.getValue().invoke(SliderKt$RangeSlider$2.j(floatRef, floatRef2, fVar, new C5229e(f02.getFloatValue(), f03.getFloatValue())));
                                }

                                @Override // ed.l
                                public /* bridge */ /* synthetic */ kotlin.L0 invoke(Animatable<Float, C1595l> animatable) {
                                    e(animatable);
                                    return kotlin.L0.f217464a;
                                }
                            };
                            this.f97205a = 1;
                            if (animatableB.h(f10, g02, f11, lVar, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C4885d0.n(obj);
                        }
                        InterfaceC4376a<kotlin.L0> interfaceC4376a = this.f97208d;
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
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void e(boolean z11) {
                    float floatValue = (z11 ? f02 : f03).getFloatValue();
                    float fH = SliderKt.H(floatValue, list, floatRef4.f217901a, floatRef3.f217901a);
                    if (floatValue != fH) {
                        C5092j.f(l10, null, null, new AnonymousClass1(floatValue, fH, interfaceC4376a, z11, f02, f03, x12, floatRef4, floatRef3, fVar7, null), 3, null);
                        return;
                    }
                    InterfaceC4376a<kotlin.L0> interfaceC4376a2 = interfaceC4376a;
                    if (interfaceC4376a2 != null) {
                        interfaceC4376a2.invoke();
                    }
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(Boolean bool) {
                    e(bool.booleanValue());
                    return kotlin.L0.f217464a;
                }
            };
            floatRef = floatRef4;
            floatRef2 = floatRef3;
            interfaceC1946s.S(objA06);
        } else {
            floatRef2 = floatRef3;
            floatRef = floatRef4;
        }
        X1 x1H = M1.h((ed.l) objA06, interfaceC1946s, 0);
        boolean zX3 = interfaceC1946s.x(this.f97178d) | interfaceC1946s.C(floatRef.f217901a) | interfaceC1946s.C(floatRef2.f217901a) | interfaceC1946s.x(this.f97179e) | interfaceC1946s.x(this.f97182h);
        final md.f<Float> fVar8 = this.f97179e;
        final X1<ed.l<md.f<Float>, kotlin.L0>> x13 = this.f97182h;
        final md.f<Float> fVar9 = this.f97178d;
        Object objA07 = interfaceC1946s.a0();
        if (zX3 || objA07 == obj) {
            final Ref.FloatRef floatRef5 = floatRef2;
            final Ref.FloatRef floatRef6 = floatRef;
            objA07 = new ed.p<Boolean, Float, kotlin.L0>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void e(boolean z11, float f10) {
                    C5229e c5229e;
                    if (z11) {
                        androidx.compose.runtime.F0 f04 = f02;
                        f04.setFloatValue(f04.getFloatValue() + f10);
                        f03.setFloatValue(SliderKt$RangeSlider$2.i(fVar9, floatRef6, floatRef5, fVar8.h().floatValue()));
                        float floatValue = f03.getFloatValue();
                        c5229e = new C5229e(md.u.J(f02.getFloatValue(), floatRef6.f217901a, floatValue), floatValue);
                    } else {
                        androidx.compose.runtime.F0 f05 = f03;
                        f05.setFloatValue(f05.getFloatValue() + f10);
                        f02.setFloatValue(SliderKt$RangeSlider$2.i(fVar9, floatRef6, floatRef5, fVar8.b().floatValue()));
                        float floatValue2 = f02.getFloatValue();
                        c5229e = new C5229e(floatValue2, md.u.J(f03.getFloatValue(), floatValue2, floatRef5.f217901a));
                    }
                    x13.getValue().invoke(SliderKt$RangeSlider$2.j(floatRef6, floatRef5, fVar9, c5229e));
                }

                @Override // ed.p
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(Boolean bool, Float f10) {
                    e(bool.booleanValue(), f10.floatValue());
                    return kotlin.L0.f217464a;
                }
            };
            interfaceC1946s.S(objA07);
        }
        X1 x1H2 = M1.h((ed.p) objA07, interfaceC1946s, 0);
        p.a aVar = androidx.compose.ui.p.f103112M2;
        androidx.compose.ui.p pVarB = SliderKt.B(aVar, this.f97183i, this.f97184j, f02, f03, this.f97185k, z10, fO, this.f97178d, x1H, x1H2);
        final float fJ = md.u.J(this.f97179e.b().floatValue(), this.f97178d.b().floatValue(), this.f97179e.h().floatValue());
        final float fJ2 = md.u.J(this.f97179e.h().floatValue(), this.f97179e.b().floatValue(), this.f97178d.h().floatValue());
        float fY = SliderKt.y(this.f97178d.b().floatValue(), this.f97178d.h().floatValue(), fJ);
        float fY2 = SliderKt.y(this.f97178d.b().floatValue(), this.f97178d.h().floatValue(), fJ2);
        int iFloor = (int) Math.floor(this.f97186l * fY2);
        int iFloor2 = (int) Math.floor((1.0f - fY) * this.f97186l);
        boolean z11 = this.f97185k;
        boolean zX4 = interfaceC1946s.x(this.f97182h) | interfaceC1946s.C(fJ2);
        final X1<ed.l<md.f<Float>, kotlin.L0>> x14 = this.f97182h;
        Object objA08 = interfaceC1946s.a0();
        if (zX4 || objA08 == obj) {
            objA08 = new ed.l<Float, kotlin.L0>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$startThumbSemantics$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void e(float f10) {
                    x14.getValue().invoke(new C5229e(f10, fJ2));
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(Float f10) {
                    e(f10.floatValue());
                    return kotlin.L0.f217464a;
                }
            };
            interfaceC1946s.S(objA08);
        }
        androidx.compose.ui.p pVarE = SliderKt.E(aVar, fJ, z11, (ed.l) objA08, this.f97181g, new C5229e(this.f97178d.b().floatValue(), fJ2), iFloor);
        boolean z12 = this.f97185k;
        boolean zX5 = interfaceC1946s.x(this.f97182h) | interfaceC1946s.C(fJ);
        final X1<ed.l<md.f<Float>, kotlin.L0>> x15 = this.f97182h;
        Object objA09 = interfaceC1946s.a0();
        if (zX5 || objA09 == obj) {
            objA09 = new ed.l<Float, kotlin.L0>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$endThumbSemantics$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void e(float f10) {
                    x15.getValue().invoke(new C5229e(fJ, f10));
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ kotlin.L0 invoke(Float f10) {
                    e(f10.floatValue());
                    return kotlin.L0.f217464a;
                }
            };
            interfaceC1946s.S(objA09);
        }
        SliderKt.c(this.f97185k, fY, fY2, this.f97180f, this.f97187m, floatRef2.f217901a - floatRef.f217901a, this.f97183i, this.f97184j, pVarB, pVarE, SliderKt.E(aVar, fJ2, z12, (ed.l) objA09, this.f97181g, new C5229e(fJ, this.f97178d.h().floatValue()), iFloor2), interfaceC1946s, 14155776, 0);
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

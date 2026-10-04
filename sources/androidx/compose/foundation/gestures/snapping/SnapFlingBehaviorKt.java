package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.C1585g;
import androidx.compose.animation.core.C1595l;
import androidx.compose.animation.core.InterfaceC1587h;
import androidx.compose.foundation.gestures.C;
import androidx.compose.foundation.gestures.w;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,507:1\n503#1,4:515\n503#1,4:519\n503#1,4:523\n77#2:508\n1225#3,6:509\n149#4:527\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n351#1:515,4\n395#1:519,4\n477#1:523,4\n258#1:508\n260#1:509,6\n463#1:527\n*E\n"})
public final class SnapFlingBehaviorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f90067a = 400;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f90068b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f90069c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f90070d = false;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(final androidx.compose.foundation.gestures.w r5, final float r6, androidx.compose.animation.core.C1591j<java.lang.Float, androidx.compose.animation.core.C1595l> r7, androidx.compose.animation.core.C<java.lang.Float> r8, final ed.l<? super java.lang.Float, kotlin.L0> r9, kotlin.coroutines.e<? super androidx.compose.foundation.gestures.snapping.a<java.lang.Float, androidx.compose.animation.core.C1595l>> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1) r0
            int r1 = r0.f90075e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90075e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f90074d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f90075e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            float r6 = r0.f90071a
            java.lang.Object r5 = r0.f90073c
            kotlin.jvm.internal.Ref$FloatRef r5 = (kotlin.jvm.internal.Ref.FloatRef) r5
            java.lang.Object r7 = r0.f90072b
            androidx.compose.animation.core.j r7 = (androidx.compose.animation.core.C1591j) r7
            kotlin.C4885d0.n(r10)
            goto L69
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.C4885d0.n(r10)
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            java.lang.Object r2 = r7.j()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L52
            r2 = r3
            goto L53
        L52:
            r2 = 0
        L53:
            r2 = r2 ^ r3
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2
            r4.<init>()
            r0.f90072b = r7
            r0.f90073c = r10
            r0.f90071a = r6
            r0.f90075e = r3
            java.lang.Object r5 = androidx.compose.animation.core.SuspendAnimationKt.j(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L68
            return r1
        L68:
            r5 = r10
        L69:
            androidx.compose.foundation.gestures.snapping.a r8 = new androidx.compose.foundation.gestures.snapping.a
            float r5 = r5.f217901a
            float r6 = r6 - r5
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.f(androidx.compose.foundation.gestures.w, float, androidx.compose.animation.core.j, androidx.compose.animation.core.C, ed.l, kotlin.coroutines.e):java.lang.Object");
    }

    public static final void g(C1585g<Float, C1595l> c1585g, w wVar, ed.l<? super Float, L0> lVar, float f10) {
        float fA = wVar.a(f10);
        lVar.invoke(Float.valueOf(fA));
        if (Math.abs(f10 - fA) > 0.5f) {
            c1585g.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(final androidx.compose.foundation.gestures.w r10, float r11, final float r12, androidx.compose.animation.core.C1591j<java.lang.Float, androidx.compose.animation.core.C1595l> r13, androidx.compose.animation.core.InterfaceC1587h<java.lang.Float> r14, final ed.l<? super java.lang.Float, kotlin.L0> r15, kotlin.coroutines.e<? super androidx.compose.foundation.gestures.snapping.a<java.lang.Float, androidx.compose.animation.core.C1595l>> r16) throws java.lang.Throwable {
        /*
            r0 = r16
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1
            if (r1 == 0) goto L16
            r1 = r0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 r1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1) r1
            int r2 = r1.f90085f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f90085f = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 r1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.f90084e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r7.f90085f
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            float r10 = r7.f90081b
            float r11 = r7.f90080a
            java.lang.Object r12 = r7.f90083d
            kotlin.jvm.internal.Ref$FloatRef r12 = (kotlin.jvm.internal.Ref.FloatRef) r12
            java.lang.Object r1 = r7.f90082c
            androidx.compose.animation.core.j r1 = (androidx.compose.animation.core.C1591j) r1
            kotlin.C4885d0.n(r0)
            r0 = r1
            goto L87
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L40:
            kotlin.C4885d0.n(r0)
            kotlin.jvm.internal.Ref$FloatRef r0 = new kotlin.jvm.internal.Ref$FloatRef
            r0.<init>()
            java.lang.Object r2 = r13.j()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r11)
            java.lang.Object r4 = r13.j()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L68
            r4 = r3
            goto L69
        L68:
            r4 = 0
        L69:
            r5 = r4 ^ 1
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$2 r6 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$2
            r6.<init>()
            r7.f90082c = r13
            r7.f90083d = r0
            r7.f90080a = r11
            r7.f90081b = r8
            r7.f90085f = r3
            r4 = r14
            r3 = r2
            r2 = r13
            java.lang.Object r10 = androidx.compose.animation.core.SuspendAnimationKt.l(r2, r3, r4, r5, r6, r7)
            if (r10 != r1) goto L84
            return r1
        L84:
            r12 = r0
            r10 = r8
            r0 = r13
        L87:
            java.lang.Object r1 = r0.j()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r2 = l(r1, r10)
            androidx.compose.foundation.gestures.snapping.a r10 = new androidx.compose.foundation.gestures.snapping.a
            float r12 = r12.f217901a
            float r11 = r11 - r12
            java.lang.Float r12 = new java.lang.Float
            r12.<init>(r11)
            r8 = 29
            r9 = 0
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            androidx.compose.animation.core.j r11 = androidx.compose.animation.core.C1593k.g(r0, r1, r2, r3, r5, r7, r8, r9)
            r10.<init>(r12, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.h(androidx.compose.foundation.gestures.w, float, float, androidx.compose.animation.core.j, androidx.compose.animation.core.h, ed.l, kotlin.coroutines.e):java.lang.Object");
    }

    public static final Object i(w wVar, float f10, float f11, b<Float, C1595l> bVar, ed.l<? super Float, L0> lVar, kotlin.coroutines.e<? super a<Float, C1595l>> eVar) {
        return bVar.a(wVar, new Float(f10), new Float(f11), lVar, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float j(int r3, float r4, float r5) {
        /*
            androidx.compose.foundation.gestures.snapping.d$a r0 = androidx.compose.foundation.gestures.snapping.d.f90093b
            r0.getClass()
            int r1 = androidx.compose.foundation.gestures.snapping.d.f90094c
            r2 = 0
            if (r3 != r1) goto L17
            float r3 = java.lang.Math.abs(r5)
            float r0 = java.lang.Math.abs(r4)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L29
            goto L1e
        L17:
            r0.getClass()
            int r1 = androidx.compose.foundation.gestures.snapping.d.f90095d
            if (r3 != r1) goto L20
        L1e:
            r4 = r5
            goto L29
        L20:
            r0.getClass()
            int r5 = androidx.compose.foundation.gestures.snapping.d.f90096e
            if (r3 != r5) goto L28
            goto L29
        L28:
            r4 = r2
        L29:
            boolean r3 = k(r4)
            if (r3 == 0) goto L30
            return r4
        L30:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.j(int, float, float):float");
    }

    public static final boolean k(float f10) {
        return (f10 == Float.POSITIVE_INFINITY || f10 == Float.NEGATIVE_INFINITY) ? false : true;
    }

    public static final float l(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return (f11 <= 0.0f ? f10 >= f11 : f10 <= f11) ? f10 : f11;
    }

    public static final <T extends Comparable<? super T>> T m(md.f<T> fVar) {
        return fVar.b();
    }

    public static final <T extends Comparable<? super T>> T n(md.f<T> fVar) {
        return fVar.h();
    }

    public static final float p() {
        return f90067a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @androidx.compose.runtime.InterfaceC1917i
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.foundation.gestures.C q(@org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.snapping.i r5, @org.jetbrains.annotations.Nullable androidx.compose.runtime.InterfaceC1946s r6, int r7) {
        /*
            boolean r0 = androidx.compose.runtime.C1968u.c0()
            if (r0 == 0) goto Lf
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:256)"
            r2 = -1921733134(0xffffffff8d74adf2, float:-7.5397684E-31)
            androidx.compose.runtime.C1968u.p0(r2, r7, r0, r1)
        Lf:
            androidx.compose.runtime.a1 r0 = androidx.compose.ui.platform.CompositionLocalsKt.i()
            java.lang.Object r0 = r6.Q(r0)
            k0.e r0 = (k0.InterfaceC4814e) r0
            r1 = 0
            androidx.compose.animation.core.C r2 = androidx.compose.animation.a0.b(r6, r1)
            r3 = r7 & 14
            r3 = r3 ^ 6
            r4 = 4
            if (r3 <= r4) goto L2b
            boolean r3 = r6.x(r5)
            if (r3 != 0) goto L2f
        L2b:
            r7 = r7 & 6
            if (r7 != r4) goto L30
        L2f:
            r1 = 1
        L30:
            boolean r7 = r6.x(r2)
            r7 = r7 | r1
            boolean r0 = r6.x(r0)
            r7 = r7 | r0
            java.lang.Object r0 = r6.a0()
            if (r7 != 0) goto L49
            androidx.compose.runtime.s$a r7 = androidx.compose.runtime.InterfaceC1946s.f99968a
            r7.getClass()
            java.lang.Object r7 = androidx.compose.runtime.InterfaceC1946s.a.f99970b
            if (r0 != r7) goto L5a
        L49:
            r7 = 1137180672(0x43c80000, float:400.0)
            r0 = 5
            r1 = 0
            r3 = 0
            androidx.compose.animation.core.x0 r7 = androidx.compose.animation.core.C1589i.r(r1, r7, r3, r0, r3)
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior
            r0.<init>(r5, r2, r7)
            r6.S(r0)
        L5a:
            androidx.compose.foundation.gestures.C r0 = (androidx.compose.foundation.gestures.C) r0
            boolean r5 = androidx.compose.runtime.C1968u.c0()
            if (r5 == 0) goto L65
            androidx.compose.runtime.C1968u.o0()
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.q(androidx.compose.foundation.gestures.snapping.i, androidx.compose.runtime.s, int):androidx.compose.foundation.gestures.C");
    }

    @NotNull
    public static final C r(@NotNull i iVar, @NotNull androidx.compose.animation.core.C<Float> c10, @NotNull InterfaceC1587h<Float> interfaceC1587h) {
        return new SnapFlingBehavior(iVar, c10, interfaceC1587h);
    }

    public static final void o(InterfaceC4376a<String> interfaceC4376a) {
    }
}

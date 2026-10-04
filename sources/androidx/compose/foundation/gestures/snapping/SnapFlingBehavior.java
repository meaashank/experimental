package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.C1595l;
import androidx.compose.animation.core.E;
import androidx.compose.animation.core.InterfaceC1587h;
import androidx.compose.foundation.L;
import androidx.compose.foundation.gestures.B;
import androidx.compose.foundation.gestures.C;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.w;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.t;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@L
@V({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n+ 2 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,507:1\n503#2,4:508\n503#2,4:512\n503#2,4:516\n503#2,4:520\n1#3:524\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior\n*L\n112#1:508,4\n203#1:512,4\n206#1:516,4\n226#1:520,4\n*E\n"})
@r(parameters = 1)
@InterfaceC4982o(message = "Please use the snapFlingBehavior function", replaceWith = @InterfaceC4852c0(expression = "androidx.compose.foundation.gestures.snapping.snapFlingBehavior", imports = {}))
public final class SnapFlingBehavior implements C {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f90042e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i f90043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final androidx.compose.animation.core.C<Float> f90044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC1587h<Float> f90045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public t f90046d = ScrollableKt.e();

    public SnapFlingBehavior(@NotNull i iVar, @NotNull androidx.compose.animation.core.C<Float> c10, @NotNull InterfaceC1587h<Float> interfaceC1587h) {
        this.f90043a = iVar;
        this.f90044b = c10;
        this.f90045c = interfaceC1587h;
    }

    @Override // androidx.compose.foundation.gestures.C, androidx.compose.foundation.gestures.q
    public Object a(w wVar, float f10, kotlin.coroutines.e eVar) {
        return B.b(this, wVar, f10, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.C
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(@org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.w r5, float r6, @org.jetbrains.annotations.NotNull ed.l<? super java.lang.Float, kotlin.L0> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Float> r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1) r0
            int r1 = r0.f90063c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90063c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f90061a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f90063c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.C4885d0.n(r8)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.C4885d0.n(r8)
            r0.f90063c = r3
            java.lang.Object r8 = r4.i(r5, r6, r7, r0)
            if (r8 != r1) goto L3b
            return r1
        L3b:
            androidx.compose.foundation.gestures.snapping.a r8 = (androidx.compose.foundation.gestures.snapping.a) r8
            T r5 = r8.f90090a
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            androidx.compose.animation.core.j<T, V extends androidx.compose.animation.core.p> r6 = r8.f90091b
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L4d
            goto L57
        L4d:
            java.lang.Object r5 = r6.j()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L57:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.b(androidx.compose.foundation.gestures.w, float, ed.l, kotlin.coroutines.e):java.lang.Object");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof SnapFlingBehavior) {
            SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
            if (G.g(snapFlingBehavior.f90045c, this.f90045c) && G.g(snapFlingBehavior.f90044b, this.f90044b) && G.g(snapFlingBehavior.f90043a, this.f90043a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f90043a.hashCode() + ((this.f90044b.hashCode() + (this.f90045c.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(androidx.compose.foundation.gestures.w r11, float r12, ed.l<? super java.lang.Float, kotlin.L0> r13, kotlin.coroutines.e<? super androidx.compose.foundation.gestures.snapping.a<java.lang.Float, androidx.compose.animation.core.C1595l>> r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1) r0
            int r1 = r0.f90050d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90050d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r0 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f90048b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f90050d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r11 = r0.f90047a
            r13 = r11
            ed.l r13 = (ed.l) r13
            kotlin.C4885d0.n(r14)
            goto L4f
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            kotlin.C4885d0.n(r14)
            androidx.compose.ui.t r14 = r10.f90046d
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1
            r9 = 0
            r5 = r10
            r8 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f90047a = r7
            r0.f90050d = r3
            java.lang.Object r14 = kotlinx.coroutines.C5092j.g(r14, r4, r0)
            if (r14 != r1) goto L4e
            return r1
        L4e:
            r13 = r7
        L4f:
            androidx.compose.foundation.gestures.snapping.a r14 = (androidx.compose.foundation.gestures.snapping.a) r14
            java.lang.Float r11 = new java.lang.Float
            r12 = 0
            r11.<init>(r12)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.i(androidx.compose.foundation.gestures.w, float, ed.l, kotlin.coroutines.e):java.lang.Object");
    }

    @NotNull
    public final t j() {
        return this.f90046d;
    }

    public final boolean k(float f10, float f11) {
        return Math.abs(E.a(this.f90044b, 0.0f, f11)) >= Math.abs(f10);
    }

    public final Object l(w wVar, float f10, float f11, ed.l<? super Float, L0> lVar, kotlin.coroutines.e<? super a<Float, C1595l>> eVar) {
        return SnapFlingBehaviorKt.i(wVar, f10, f11, k(f10, f11) ? new c(this.f90044b) : new l(this.f90045c), lVar, eVar);
    }

    public final void m(@NotNull t tVar) {
        this.f90046d = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(androidx.compose.foundation.gestures.w r18, float r19, float r20, ed.l<? super java.lang.Float, kotlin.L0> r21, kotlin.coroutines.e<? super androidx.compose.animation.core.C1591j<java.lang.Float, androidx.compose.animation.core.C1595l>> r22) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r22
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1
            if (r1 == 0) goto L18
            r1 = r0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 r1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1) r1
            int r2 = r1.f90066c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f90066c = r2
            r2 = r17
        L16:
            r7 = r1
            goto L20
        L18:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 r1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1
            r2 = r17
            r1.<init>(r2, r0)
            goto L16
        L20:
            java.lang.Object r0 = r7.f90064a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r7.f90066c
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            kotlin.C4885d0.n(r0)
            goto L6f
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            kotlin.C4885d0.n(r0)
            float r0 = java.lang.Math.abs(r19)
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L44
            goto L4c
        L44:
            float r0 = java.lang.Math.abs(r20)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L5e
        L4c:
            r15 = 28
            r16 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r8 = r19
            r9 = r20
            androidx.compose.animation.core.j r0 = androidx.compose.animation.core.C1593k.c(r8, r9, r10, r12, r14, r15, r16)
            return r0
        L5e:
            r7.f90066c = r4
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            java.lang.Object r0 = r2.l(r3, r4, r5, r6, r7)
            if (r0 != r1) goto L6f
            return r1
        L6f:
            androidx.compose.foundation.gestures.snapping.a r0 = (androidx.compose.foundation.gestures.snapping.a) r0
            androidx.compose.animation.core.j<T, V extends androidx.compose.animation.core.p> r0 = r0.f90091b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.n(androidx.compose.foundation.gestures.w, float, float, ed.l, kotlin.coroutines.e):java.lang.Object");
    }
}

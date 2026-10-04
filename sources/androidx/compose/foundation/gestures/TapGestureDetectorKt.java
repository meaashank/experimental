package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC2138e;
import androidx.compose.ui.input.pointer.K;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.M;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,376:1\n33#2,6:377\n101#2,2:383\n33#2,6:385\n103#2:391\n86#2,2:392\n33#2,6:394\n88#2:400\n86#2,2:401\n33#2,6:403\n88#2:409\n101#2,2:410\n33#2,6:412\n103#2:418\n101#2,2:419\n33#2,6:421\n103#2:427\n*S KotlinDebug\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n*L\n196#1:377,6\n197#1:383,2\n197#1:385,6\n197#1:391\n281#1:392,2\n281#1:394,6\n281#1:400\n306#1:401,2\n306#1:403,6\n306#1:409\n311#1:410,2\n311#1:412,6\n311#1:418\n321#1:419,2\n321#1:421,6\n321#1:427\n*E\n"})
public final class TapGestureDetectorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ed.q<u, P.g, kotlin.coroutines.e<? super L0>, Object> f89817a = new TapGestureDetectorKt$NoPressGesture$1(3, null);

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.InterfaceC2138e r9, boolean r10, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.PointerEventPass r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super androidx.compose.ui.input.pointer.A> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) r0
            int r1 = r0.f89823e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89823e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f89822d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f89823e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            boolean r9 = r0.f89821c
            java.lang.Object r10 = r0.f89820b
            androidx.compose.ui.input.pointer.PointerEventPass r10 = (androidx.compose.ui.input.pointer.PointerEventPass) r10
            java.lang.Object r11 = r0.f89819a
            androidx.compose.ui.input.pointer.e r11 = (androidx.compose.ui.input.pointer.InterfaceC2138e) r11
            kotlin.C4885d0.n(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L4f
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            kotlin.C4885d0.n(r12)
        L40:
            r0.f89819a = r9
            r0.f89820b = r11
            r0.f89821c = r10
            r0.f89823e = r3
            java.lang.Object r12 = r9.T1(r11, r0)
            if (r12 != r1) goto L4f
            return r1
        L4f:
            androidx.compose.ui.input.pointer.q r12 = (androidx.compose.ui.input.pointer.C2150q) r12
            java.util.List<androidx.compose.ui.input.pointer.A> r2 = r12.f102318a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L59:
            if (r6 >= r4) goto L73
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.A r7 = (androidx.compose.ui.input.pointer.A) r7
            if (r10 == 0) goto L68
            boolean r7 = androidx.compose.ui.input.pointer.r.b(r7)
            goto L6c
        L68:
            boolean r7 = androidx.compose.ui.input.pointer.r.c(r7)
        L6c:
            if (r7 != 0) goto L70
            r2 = r5
            goto L74
        L70:
            int r6 = r6 + 1
            goto L59
        L73:
            r2 = r3
        L74:
            if (r2 == 0) goto L40
            java.util.List<androidx.compose.ui.input.pointer.A> r9 = r12.f102318a
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.d(androidx.compose.ui.input.pointer.e, boolean, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.e):java.lang.Object");
    }

    public static /* synthetic */ Object f(InterfaceC2138e interfaceC2138e, boolean z10, PointerEventPass pointerEventPass, kotlin.coroutines.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return d(interfaceC2138e, z10, pointerEventPass, eVar);
    }

    public static /* synthetic */ Object g(InterfaceC2138e interfaceC2138e, boolean z10, kotlin.coroutines.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return d(interfaceC2138e, z10, PointerEventPass.Main, eVar);
    }

    public static final Object h(InterfaceC2138e interfaceC2138e, androidx.compose.ui.input.pointer.A a10, kotlin.coroutines.e<? super androidx.compose.ui.input.pointer.A> eVar) {
        return interfaceC2138e.y0(interfaceC2138e.c().e(), new TapGestureDetectorKt$awaitSecondDown$2(a10, null), eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[LOOP:0: B:19:0x004c->B:20:0x004e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(androidx.compose.ui.input.pointer.InterfaceC2138e r8, kotlin.coroutines.e<? super kotlin.L0> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) r0
            int r1 = r0.f89830c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89830c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f89829b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f89830c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.f89828a
            androidx.compose.ui.input.pointer.e r8 = (androidx.compose.ui.input.pointer.InterfaceC2138e) r8
            kotlin.C4885d0.n(r9)
            goto L42
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.C4885d0.n(r9)
        L36:
            r0.f89828a = r8
            r0.f89830c = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.ui.input.pointer.C2137d.t(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L42
            return r1
        L42:
            androidx.compose.ui.input.pointer.q r9 = (androidx.compose.ui.input.pointer.C2150q) r9
            java.util.List<androidx.compose.ui.input.pointer.A> r2 = r9.f102318a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4c:
            if (r6 >= r4) goto L5a
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.A r7 = (androidx.compose.ui.input.pointer.A) r7
            r7.a()
            int r6 = r6 + 1
            goto L4c
        L5a:
            java.util.List<androidx.compose.ui.input.pointer.A> r9 = r9.f102318a
            int r2 = r9.size()
        L60:
            if (r5 >= r2) goto L70
            java.lang.Object r4 = r9.get(r5)
            androidx.compose.ui.input.pointer.A r4 = (androidx.compose.ui.input.pointer.A) r4
            boolean r4 = r4.f102149d
            if (r4 == 0) goto L6d
            goto L36
        L6d:
            int r5 = r5 + 1
            goto L60
        L70:
            kotlin.L0 r8 = kotlin.L0.f217464a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.i(androidx.compose.ui.input.pointer.e, kotlin.coroutines.e):java.lang.Object");
    }

    @Nullable
    public static final Object j(@NotNull K k10, @NotNull ed.q<? super u, ? super P.g, ? super kotlin.coroutines.e<? super L0>, ? extends Object> qVar, @Nullable ed.l<? super P.g, L0> lVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objG = M.g(new TapGestureDetectorKt$detectTapAndPress$2(k10, qVar, lVar, new PressGestureScopeImpl(k10), null), eVar);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : L0.f217464a;
    }

    public static /* synthetic */ Object k(K k10, ed.q qVar, ed.l lVar, kotlin.coroutines.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qVar = f89817a;
        }
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return j(k10, qVar, lVar, eVar);
    }

    @Nullable
    public static final Object l(@NotNull K k10, @Nullable ed.l<? super P.g, L0> lVar, @Nullable ed.l<? super P.g, L0> lVar2, @NotNull ed.q<? super u, ? super P.g, ? super kotlin.coroutines.e<? super L0>, ? extends Object> qVar, @Nullable ed.l<? super P.g, L0> lVar3, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objG = M.g(new TapGestureDetectorKt$detectTapGestures$2(k10, qVar, lVar2, lVar, lVar3, null), eVar);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : L0.f217464a;
    }

    public static /* synthetic */ Object m(K k10, ed.l lVar, ed.l lVar2, ed.q qVar, ed.l lVar3, kotlin.coroutines.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        if ((i10 & 2) != 0) {
            lVar2 = null;
        }
        if ((i10 & 4) != 0) {
            qVar = f89817a;
        }
        if ((i10 & 8) != 0) {
            lVar3 = null;
        }
        return l(k10, lVar, lVar2, qVar, lVar3, eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a8 -> B:13:0x0032). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object n(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.InterfaceC2138e r13, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.PointerEventPass r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super androidx.compose.ui.input.pointer.A> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.n(androidx.compose.ui.input.pointer.e, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.e):java.lang.Object");
    }

    public static /* synthetic */ Object p(InterfaceC2138e interfaceC2138e, PointerEventPass pointerEventPass, kotlin.coroutines.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return n(interfaceC2138e, pointerEventPass, eVar);
    }
}

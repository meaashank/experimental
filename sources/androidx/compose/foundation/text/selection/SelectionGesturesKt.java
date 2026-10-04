package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.C2150q;
import androidx.compose.ui.input.pointer.K;
import androidx.compose.ui.input.pointer.O;
import androidx.compose.ui.input.pointer.T;
import androidx.compose.ui.platform.G1;
import java.util.List;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,444:1\n33#2,6:445\n33#2,6:451\n33#2,6:457\n33#2,6:463\n33#2,6:469\n33#2,6:475\n33#2,6:481\n86#2,2:487\n33#2,6:489\n88#2:495\n86#2,2:496\n33#2,6:498\n88#2:504\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n*L\n134#1:445,6\n165#1:451,6\n188#1:457,6\n247#1:463,6\n322#1:469,6\n358#1:475,6\n384#1:481,6\n426#1:487,2\n426#1:489,6\n426#1:495\n443#1:496,2\n443#1:498,6\n443#1:504\n*E\n"})
public final class SelectionGesturesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f94724a = 8675309;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0040 -> B:18:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(androidx.compose.ui.input.pointer.InterfaceC2138e r7, kotlin.coroutines.e<? super androidx.compose.ui.input.pointer.C2150q> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1) r0
            int r1 = r0.f94727c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94727c = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f94726b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f94727c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.f94725a
            androidx.compose.ui.input.pointer.e r7 = (androidx.compose.ui.input.pointer.InterfaceC2138e) r7
            kotlin.C4885d0.n(r8)
            goto L43
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.C4885d0.n(r8)
        L36:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.f94725a = r7
            r0.f94727c = r3
            java.lang.Object r8 = r7.T1(r8, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            androidx.compose.ui.input.pointer.q r8 = (androidx.compose.ui.input.pointer.C2150q) r8
            java.util.List<androidx.compose.ui.input.pointer.A> r2 = r8.f102318a
            int r4 = r2.size()
            r5 = 0
        L4c:
            if (r5 >= r4) goto L5e
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.A r6 = (androidx.compose.ui.input.pointer.A) r6
            boolean r6 = androidx.compose.ui.input.pointer.r.c(r6)
            if (r6 != 0) goto L5b
            goto L36
        L5b:
            int r5 = r5 + 1
            goto L4c
        L5e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.h(androidx.compose.ui.input.pointer.e, kotlin.coroutines.e):java.lang.Object");
    }

    public static final boolean i(G1 g12, androidx.compose.ui.input.pointer.A a10, androidx.compose.ui.input.pointer.A a11) {
        return P.g.m(P.g.u(a10.f102148c, a11.f102148c)) < DragGestureDetectorKt.A(g12, a10.f102154i);
    }

    public static final boolean j(@NotNull C2150q c2150q) {
        List<androidx.compose.ui.input.pointer.A> list = c2150q.f102318a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = list.get(i10).f102154i;
            O.f102192b.getClass();
            if (i11 != O.f102195e) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(androidx.compose.ui.input.pointer.InterfaceC2138e r7, final androidx.compose.foundation.text.selection.f r8, androidx.compose.foundation.text.selection.C1832c r9, androidx.compose.ui.input.pointer.C2150q r10, kotlin.coroutines.e<? super kotlin.L0> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.k(androidx.compose.ui.input.pointer.e, androidx.compose.foundation.text.selection.f, androidx.compose.foundation.text.selection.c, androidx.compose.ui.input.pointer.q, kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:45:0x00c4, B:47:0x00cc, B:49:0x00d8, B:51:0x00e4, B:42:0x00ad), top: B:58:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(androidx.compose.ui.input.pointer.InterfaceC2138e r7, final androidx.compose.foundation.text.selection.f r8, androidx.compose.foundation.text.selection.C1832c r9, androidx.compose.ui.input.pointer.C2150q r10, kotlin.coroutines.e<? super kotlin.L0> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.l(androidx.compose.ui.input.pointer.e, androidx.compose.foundation.text.selection.f, androidx.compose.foundation.text.selection.c, androidx.compose.ui.input.pointer.q, kotlin.coroutines.e):java.lang.Object");
    }

    @NotNull
    public static final androidx.compose.ui.p m(@NotNull androidx.compose.ui.p pVar, @NotNull f fVar, @NotNull androidx.compose.foundation.text.A a10) {
        return T.f(pVar, fVar, a10, new SelectionGesturesKt$selectionGestureInput$1(fVar, a10, null));
    }

    @Nullable
    public static final Object n(@NotNull K k10, @NotNull f fVar, @NotNull androidx.compose.foundation.text.A a10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objD = ForEachGestureKt.d(k10, new SelectionGesturesKt$selectionGesturePointerInputBtf2$2(new C1832c(k10.c()), fVar, a10, null), eVar);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : L0.f217464a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object o(androidx.compose.ui.input.pointer.InterfaceC2138e r8, final androidx.compose.foundation.text.A r9, androidx.compose.ui.input.pointer.C2150q r10, kotlin.coroutines.e<? super kotlin.L0> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.o(androidx.compose.ui.input.pointer.e, androidx.compose.foundation.text.A, androidx.compose.ui.input.pointer.q, kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p(androidx.compose.ui.input.pointer.InterfaceC2138e r8, final androidx.compose.foundation.text.A r9, androidx.compose.ui.input.pointer.C2150q r10, kotlin.coroutines.e<? super kotlin.L0> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.p(androidx.compose.ui.input.pointer.e, androidx.compose.foundation.text.A, androidx.compose.ui.input.pointer.q, kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
    
        if (r15 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q(androidx.compose.ui.input.pointer.InterfaceC2138e r12, final androidx.compose.foundation.text.A r13, androidx.compose.ui.input.pointer.C2150q r14, kotlin.coroutines.e<? super kotlin.L0> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.q(androidx.compose.ui.input.pointer.e, androidx.compose.foundation.text.A, androidx.compose.ui.input.pointer.q, kotlin.coroutines.e):java.lang.Object");
    }

    @NotNull
    public static final androidx.compose.ui.p r(@NotNull androidx.compose.ui.p pVar, @NotNull ed.l<? super Boolean, L0> lVar) {
        return T.e(pVar, Integer.valueOf(f94724a), new SelectionGesturesKt$updateSelectionTouchMode$1(lVar, null));
    }
}

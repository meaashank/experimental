package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC2138e;
import androidx.compose.ui.input.pointer.K;
import java.util.List;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nForEachGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,122:1\n329#2:123\n329#2:142\n101#3,2:124\n33#3,6:126\n103#3:132\n101#3,2:133\n33#3,6:135\n103#3:141\n*S KotlinDebug\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n*L\n45#1:123\n100#1:142\n71#1:124,2\n71#1:126,6\n71#1:132\n87#1:133,2\n87#1:135,6\n87#1:141\n*E\n"})
public final class ForEachGestureKt {
    public static final boolean a(@NotNull InterfaceC2138e interfaceC2138e) {
        List<androidx.compose.ui.input.pointer.A> list = interfaceC2138e.U1().f102318a;
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (list.get(i10).f102149d) {
                z10 = true;
                break;
            }
            i10++;
        }
        return !z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (a(r6) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0046 -> B:19:0x0049). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.InterfaceC2138e r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) r0
            int r1 = r0.f89661c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89661c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f89660b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f89661c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.f89659a
            androidx.compose.ui.input.pointer.e r6 = (androidx.compose.ui.input.pointer.InterfaceC2138e) r6
            kotlin.C4885d0.n(r7)
            goto L49
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.C4885d0.n(r7)
            boolean r7 = a(r6)
            if (r7 != 0) goto L62
        L3c:
            androidx.compose.ui.input.pointer.PointerEventPass r7 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r0.f89659a = r6
            r0.f89661c = r3
            java.lang.Object r7 = r6.T1(r7, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            androidx.compose.ui.input.pointer.q r7 = (androidx.compose.ui.input.pointer.C2150q) r7
            java.util.List<androidx.compose.ui.input.pointer.A> r7 = r7.f102318a
            int r2 = r7.size()
            r4 = 0
        L52:
            if (r4 >= r2) goto L62
            java.lang.Object r5 = r7.get(r4)
            androidx.compose.ui.input.pointer.A r5 = (androidx.compose.ui.input.pointer.A) r5
            boolean r5 = r5.f102149d
            if (r5 == 0) goto L5f
            goto L3c
        L5f:
            int r4 = r4 + 1
            goto L52
        L62:
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.b(androidx.compose.ui.input.pointer.e, kotlin.coroutines.e):java.lang.Object");
    }

    @Nullable
    public static final Object c(@NotNull K k10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objJ0 = k10.J0(new ForEachGestureKt$awaitAllPointersUp$2(2, null), eVar);
        return objJ0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objJ0 : L0.f217464a;
    }

    @Nullable
    public static final Object d(@NotNull K k10, @NotNull ed.p<? super InterfaceC2138e, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objJ0 = k10.J0(new ForEachGestureKt$awaitEachGesture$2(eVar.getContext(), pVar, null), eVar);
        return objJ0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objJ0 : L0.f217464a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, kotlin.coroutines.i] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.input.pointer.K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.input.pointer.K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.input.pointer.K] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.coroutines.i] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008f -> B:18:0x0050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00a9 -> B:18:0x0050). Please report as a decompilation issue!!! */
    @kotlin.InterfaceC4982o(message = "Use awaitEachGesture instead. forEachGesture() can drop events between gestures.", replaceWith = @kotlin.InterfaceC4852c0(expression = "awaitEachGesture(block)", imports = {}))
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.K r8, @org.jetbrains.annotations.NotNull ed.p<? super androidx.compose.ui.input.pointer.K, ? super kotlin.coroutines.e<? super kotlin.L0>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1) r0
            int r1 = r0.f89670e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89670e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f89669d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f89670e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L65
            if (r2 == r5) goto L55
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r8 = r0.f89668c
            kotlin.coroutines.i r8 = (kotlin.coroutines.i) r8
            java.lang.Object r9 = r0.f89667b
            ed.p r9 = (ed.p) r9
            java.lang.Object r2 = r0.f89666a
            androidx.compose.ui.input.pointer.K r2 = (androidx.compose.ui.input.pointer.K) r2
            kotlin.C4885d0.n(r10)
            goto L50
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            java.lang.Object r8 = r0.f89668c
            kotlin.coroutines.i r8 = (kotlin.coroutines.i) r8
            java.lang.Object r9 = r0.f89667b
            ed.p r9 = (ed.p) r9
            java.lang.Object r2 = r0.f89666a
            androidx.compose.ui.input.pointer.K r2 = (androidx.compose.ui.input.pointer.K) r2
            kotlin.C4885d0.n(r10)     // Catch: java.util.concurrent.CancellationException -> L53
        L50:
            r10 = r8
            r8 = r2
            goto L6c
        L53:
            r10 = move-exception
            goto L97
        L55:
            java.lang.Object r8 = r0.f89668c
            kotlin.coroutines.i r8 = (kotlin.coroutines.i) r8
            java.lang.Object r9 = r0.f89667b
            ed.p r9 = (ed.p) r9
            java.lang.Object r2 = r0.f89666a
            androidx.compose.ui.input.pointer.K r2 = (androidx.compose.ui.input.pointer.K) r2
            kotlin.C4885d0.n(r10)     // Catch: java.util.concurrent.CancellationException -> L53
            goto L83
        L65:
            kotlin.C4885d0.n(r10)
            kotlin.coroutines.i r10 = r0.getContext()
        L6c:
            boolean r2 = kotlinx.coroutines.JobKt__JobKt.C(r10)
            if (r2 == 0) goto Lad
            r0.f89666a = r8     // Catch: java.util.concurrent.CancellationException -> L92
            r0.f89667b = r9     // Catch: java.util.concurrent.CancellationException -> L92
            r0.f89668c = r10     // Catch: java.util.concurrent.CancellationException -> L92
            r0.f89670e = r5     // Catch: java.util.concurrent.CancellationException -> L92
            java.lang.Object r2 = r9.invoke(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L92
            if (r2 != r1) goto L81
            goto Lab
        L81:
            r2 = r8
            r8 = r10
        L83:
            r0.f89666a = r2     // Catch: java.util.concurrent.CancellationException -> L53
            r0.f89667b = r9     // Catch: java.util.concurrent.CancellationException -> L53
            r0.f89668c = r8     // Catch: java.util.concurrent.CancellationException -> L53
            r0.f89670e = r4     // Catch: java.util.concurrent.CancellationException -> L53
            java.lang.Object r10 = c(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L53
            if (r10 != r1) goto L50
            goto Lab
        L92:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L97:
            boolean r6 = kotlinx.coroutines.JobKt__JobKt.C(r8)
            if (r6 == 0) goto Lac
            r0.f89666a = r2
            r0.f89667b = r9
            r0.f89668c = r8
            r0.f89670e = r3
            java.lang.Object r10 = c(r2, r0)
            if (r10 != r1) goto L50
        Lab:
            return r1
        Lac:
            throw r10
        Lad:
            kotlin.L0 r8 = kotlin.L0.f217464a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.e(androidx.compose.ui.input.pointer.K, ed.p, kotlin.coroutines.e):java.lang.Object");
    }
}

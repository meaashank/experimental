package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import k0.C4811b;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableKt {
    @P
    @NotNull
    public static final <T> J<T> a(@NotNull ed.l<? super K<T>, kotlin.L0> lVar) {
        K k10 = new K();
        lVar.invoke(k10);
        return new C1849c0(k10.f96436a);
    }

    @P
    @NotNull
    public static final <T> androidx.compose.ui.p d(@NotNull androidx.compose.ui.p pVar, @NotNull AnchoredDraggableState<T> anchoredDraggableState, @NotNull Orientation orientation, boolean z10, boolean z11, @Nullable androidx.compose.foundation.interaction.g gVar, boolean z12) {
        return DraggableKt.h(pVar, anchoredDraggableState.f95175f, orientation, z10, gVar, z12, null, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), z11, 32, null);
    }

    public static /* synthetic */ androidx.compose.ui.p e(androidx.compose.ui.p pVar, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z10, boolean z11, androidx.compose.foundation.interaction.g gVar, boolean z12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z13 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        boolean z14 = z11;
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        androidx.compose.foundation.interaction.g gVar2 = gVar;
        if ((i10 & 32) != 0) {
            z12 = anchoredDraggableState.C();
        }
        return d(pVar, anchoredDraggableState, orientation, z13, z14, gVar2, z12);
    }

    @P
    @Nullable
    public static final <T> Object f(@NotNull AnchoredDraggableState<T> anchoredDraggableState, T t10, float f10, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Object objL = AnchoredDraggableState.l(anchoredDraggableState, t10, null, new AnchoredDraggableKt$animateTo$2(anchoredDraggableState, f10, null), eVar, 2, null);
        return objL == CoroutineSingletons.COROUTINE_SUSPENDED ? objL : kotlin.L0.f217464a;
    }

    public static Object g(AnchoredDraggableState anchoredDraggableState, Object obj, float f10, kotlin.coroutines.e eVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            f10 = anchoredDraggableState.f95181l.getFloatValue();
        }
        return f(anchoredDraggableState, obj, f10, eVar);
    }

    @P
    @NotNull
    public static final <T> androidx.compose.ui.p h(@NotNull androidx.compose.ui.p pVar, @NotNull AnchoredDraggableState<T> anchoredDraggableState, @NotNull Orientation orientation, @NotNull ed.p<? super k0.x, ? super C4811b, ? extends Pair<? extends J<T>, ? extends T>> pVar2) {
        return pVar.P0(new DraggableAnchorsElement(anchoredDraggableState, pVar2, orientation));
    }

    public static final <T> C1849c0<T> i() {
        return new C1849c0<>(kotlin.collections.n0.z());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <I> java.lang.Object j(ed.InterfaceC4376a<? extends I> r4, ed.p<? super I, ? super kotlin.coroutines.e<? super kotlin.L0>, ? extends java.lang.Object> r5, kotlin.coroutines.e<? super kotlin.L0> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof androidx.compose.material.AnchoredDraggableKt$restartable$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.material.AnchoredDraggableKt$restartable$1) r0
            int r1 = r0.f95146b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f95146b = r1
            goto L18
        L13:
            androidx.compose.material.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.material.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f95145a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f95146b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.C4885d0.n(r6)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.C4885d0.n(r6)
            androidx.compose.material.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.material.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L41
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L41
            r0.f95146b = r3     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L41
            java.lang.Object r4 = kotlinx.coroutines.M.g(r6, r0)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L41
            if (r4 != r1) goto L41
            return r1
        L41:
            kotlin.L0 r4 = kotlin.L0.f217464a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableKt.j(ed.a, ed.p, kotlin.coroutines.e):java.lang.Object");
    }

    @P
    @Nullable
    public static final <T> Object k(@NotNull AnchoredDraggableState<T> anchoredDraggableState, T t10, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Object objL = AnchoredDraggableState.l(anchoredDraggableState, t10, null, new AnchoredDraggableKt$snapTo$2(4, null), eVar, 2, null);
        return objL == CoroutineSingletons.COROUTINE_SUSPENDED ? objL : kotlin.L0.f217464a;
    }
}

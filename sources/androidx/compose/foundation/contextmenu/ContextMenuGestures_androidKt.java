package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.K;
import androidx.compose.ui.input.pointer.T;
import androidx.compose.ui.p;
import e.f0;
import ed.l;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nContextMenuGestures.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuGestures.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuGestures_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,72:1\n86#2,2:73\n33#2,6:75\n88#2:81\n*S KotlinDebug\n*F\n+ 1 ContextMenuGestures.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuGestures_androidKt\n*L\n67#1:73,2\n67#1:75,6\n67#1:81\n*E\n"})
public final class ContextMenuGestures_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.InterfaceC2138e r8, kotlin.coroutines.e<? super androidx.compose.ui.input.pointer.A> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$awaitFirstRightClickDown$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$awaitFirstRightClickDown$1 r0 = (androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$awaitFirstRightClickDown$1) r0
            int r1 = r0.f88983c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f88983c = r1
            goto L18
        L13:
            androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$awaitFirstRightClickDown$1 r0 = new androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$awaitFirstRightClickDown$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f88982b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f88983c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.f88981a
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
            r0.f88981a = r8
            r0.f88983c = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.ui.input.pointer.C2137d.t(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L42
            return r1
        L42:
            androidx.compose.ui.input.pointer.q r9 = (androidx.compose.ui.input.pointer.C2150q) r9
            int r2 = r9.f102320c
            boolean r2 = androidx.compose.ui.input.pointer.C2153u.q(r2)
            if (r2 == 0) goto L36
            java.util.List<androidx.compose.ui.input.pointer.A> r2 = r9.f102318a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L54:
            if (r6 >= r4) goto L66
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.A r7 = (androidx.compose.ui.input.pointer.A) r7
            boolean r7 = androidx.compose.ui.input.pointer.r.b(r7)
            if (r7 != 0) goto L63
            goto L36
        L63:
            int r6 = r6 + 1
            goto L54
        L66:
            java.util.List<androidx.compose.ui.input.pointer.A> r8 = r9.f102318a
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.b(androidx.compose.ui.input.pointer.e, kotlin.coroutines.e):java.lang.Object");
    }

    @NotNull
    public static final p c(@NotNull p pVar, @NotNull h hVar) {
        return T.e(pVar, d.f89043a, new ContextMenuGestures_androidKt$contextMenuGestures$1(hVar, null));
    }

    @f0
    @Nullable
    public static final Object d(@NotNull K k10, @NotNull l<? super P.g, L0> lVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objD = ForEachGestureKt.d(k10, new ContextMenuGestures_androidKt$onRightClickDown$2(lVar, null), eVar);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : L0.f217464a;
    }
}

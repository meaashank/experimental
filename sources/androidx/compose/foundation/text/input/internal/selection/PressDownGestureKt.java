package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.K;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class PressDownGestureKt {
    @Nullable
    public static final Object a(@NotNull K k10, @NotNull b bVar, @Nullable InterfaceC4376a<L0> interfaceC4376a, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objD = ForEachGestureKt.d(k10, new PressDownGestureKt$detectPressDownGesture$2(bVar, interfaceC4376a, null), eVar);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : L0.f217464a;
    }

    public static /* synthetic */ Object b(K k10, b bVar, InterfaceC4376a interfaceC4376a, kotlin.coroutines.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC4376a = null;
        }
        return a(k10, bVar, interfaceC4376a, eVar);
    }
}

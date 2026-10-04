package androidx.compose.ui.input.pointer;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2137d {
    public static long a(InterfaceC2138e interfaceC2138e) {
        P.n.f65527b.getClass();
        return P.n.f65528c;
    }

    @Nullable
    public static Object b(InterfaceC2138e interfaceC2138e, long j10, @NotNull ed.p pVar, @NotNull kotlin.coroutines.e eVar) {
        return pVar.invoke(interfaceC2138e, eVar);
    }

    @Nullable
    public static Object c(InterfaceC2138e interfaceC2138e, long j10, @NotNull ed.p pVar, @NotNull kotlin.coroutines.e eVar) {
        return pVar.invoke(interfaceC2138e, eVar);
    }

    public static float h(InterfaceC2138e interfaceC2138e, float f10) {
        return f10 / interfaceC2138e.a();
    }

    public static float l(InterfaceC2138e interfaceC2138e, float f10) {
        return interfaceC2138e.a() * f10;
    }

    public static Object r(InterfaceC2138e interfaceC2138e, long j10, ed.p pVar, kotlin.coroutines.e eVar) {
        return pVar.invoke(interfaceC2138e, eVar);
    }

    public static Object s(InterfaceC2138e interfaceC2138e, long j10, ed.p pVar, kotlin.coroutines.e eVar) {
        return pVar.invoke(interfaceC2138e, eVar);
    }

    public static /* synthetic */ Object t(InterfaceC2138e interfaceC2138e, PointerEventPass pointerEventPass, kotlin.coroutines.e eVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return interfaceC2138e.T1(pointerEventPass, eVar);
    }
}

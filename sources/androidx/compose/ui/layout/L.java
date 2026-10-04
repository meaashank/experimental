package androidx.compose.ui.layout;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L {
    public static long a(M m10, @NotNull InterfaceC2188x interfaceC2188x, @NotNull InterfaceC2188x interfaceC2188x2, long j10, boolean z10) {
        return LookaheadScopeKt.e(m10, interfaceC2188x, interfaceC2188x2, j10, z10);
    }

    public static long b(M m10, InterfaceC2188x interfaceC2188x, InterfaceC2188x interfaceC2188x2, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localLookaheadPositionOf-au-aQtc");
        }
        if ((i10 & 2) != 0) {
            P.g.f65503b.getClass();
            j10 = P.g.f65504c;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return m10.S(interfaceC2188x, interfaceC2188x2, j11, z10);
    }
}

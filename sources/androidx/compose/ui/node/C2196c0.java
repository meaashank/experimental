package androidx.compose.ui.node;

import androidx.compose.ui.p;

/* JADX INFO: renamed from: androidx.compose.ui.node.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2196c0 {
    public static final p.d b(InterfaceC2203g interfaceC2203g, int i10, int i11) {
        p.d dVar = interfaceC2203g.g0().f103120f;
        if (dVar == null || (dVar.f103118d & i10) == 0) {
            return null;
        }
        while (dVar != null) {
            int i12 = dVar.f103117c;
            if ((i12 & i11) != 0) {
                return null;
            }
            if ((i12 & i10) != 0) {
                return dVar;
            }
            dVar = dVar.f103120f;
        }
        return null;
    }
}

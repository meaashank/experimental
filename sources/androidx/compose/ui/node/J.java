package androidx.compose.ui.node;

import androidx.compose.ui.p;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,133:1\n80#2:134\n78#2:135\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n*L\n119#1:134\n120#1:135\n*E\n"})
public final class J {
    public static final p.d b(InterfaceC2203g interfaceC2203g) {
        p.d dVar = interfaceC2203g.g0().f103120f;
        if (dVar == null || (dVar.f103118d & 4) == 0) {
            return null;
        }
        while (dVar != null) {
            int i10 = dVar.f103117c;
            if ((i10 & 2) != 0) {
                return null;
            }
            if ((i10 & 4) != 0) {
                return dVar;
            }
            dVar = dVar.f103120f;
        }
        return null;
    }
}

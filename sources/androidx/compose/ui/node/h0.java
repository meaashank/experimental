package androidx.compose.ui.node;

import androidx.compose.ui.p;
import ed.InterfaceC4376a;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nObserverModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserverModifierNode.kt\nandroidx/compose/ui/node/ObserverModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
public final class h0 {
    public static final <T extends p.d & g0> void a(@NotNull T t10, @NotNull InterfaceC4376a<L0> interfaceC4376a) {
        ObserverNodeOwnerScope observerNodeOwnerScope = t10.f103121g;
        if (observerNodeOwnerScope == null) {
            observerNodeOwnerScope = new ObserverNodeOwnerScope(t10);
            t10.f103121g = observerNodeOwnerScope;
        }
        OwnerSnapshotObserver ownerSnapshotObserverV = C2204h.s(t10).v();
        ObserverNodeOwnerScope.f102976b.getClass();
        ownerSnapshotObserverV.i(observerNodeOwnerScope, ObserverNodeOwnerScope.f102978d, interfaceC4376a);
    }
}

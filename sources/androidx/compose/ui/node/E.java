package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC2155a;
import androidx.compose.ui.layout.C2182q;
import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinatorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,321:1\n42#2,7:322\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinatorKt\n*L\n299#1:322,7\n*E\n"})
public final class E {
    public static final int b(LookaheadCapablePlaceable lookaheadCapablePlaceable, AbstractC2155a abstractC2155a) {
        LookaheadCapablePlaceable lookaheadCapablePlaceableW1 = lookaheadCapablePlaceable.w1();
        if (lookaheadCapablePlaceableW1 == null) {
            W.a.g("Child of " + lookaheadCapablePlaceable + " cannot be null when calculating alignment line");
            throw null;
        }
        if (lookaheadCapablePlaceable.z1().E().containsKey(abstractC2155a)) {
            Integer num = lookaheadCapablePlaceable.z1().E().get(abstractC2155a);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iM = lookaheadCapablePlaceableW1.M(abstractC2155a);
            if (iM != Integer.MIN_VALUE) {
                lookaheadCapablePlaceableW1.f102874i = true;
                lookaheadCapablePlaceable.f102875j = true;
                lookaheadCapablePlaceable.a2();
                lookaheadCapablePlaceableW1.f102874i = false;
                lookaheadCapablePlaceable.f102875j = false;
                return iM + ((int) (abstractC2155a instanceof C2182q ? lookaheadCapablePlaceableW1.E1() & ZipKt.f225990j : lookaheadCapablePlaceableW1.E1() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }
}

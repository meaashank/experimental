package androidx.compose.ui.viewinterop;

import P.j;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.t;
import androidx.compose.ui.node.C2204h;
import androidx.compose.ui.p;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nFocusGroupNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusGroupNode.android.kt\nandroidx/compose/ui/viewinterop/FocusGroupNode_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
public final class d {
    public static final boolean d(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final p e(@NotNull p pVar) {
        p pVarP0 = pVar.P0(FocusGroupPropertiesElement.f105590c);
        FocusTargetNode.FocusTargetElement focusTargetElement = FocusTargetNode.FocusTargetElement.f100618c;
        return pVarP0.P0(focusTargetElement).P0(FocusTargetPropertiesElement.f105592c).P0(focusTargetElement);
    }

    public static final Rect f(t tVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        j jVarN = tVar.n();
        if (jVarN == null) {
            return null;
        }
        int i10 = (int) jVarN.f65511a;
        int i11 = iArr[0];
        int i12 = iArr2[0];
        int i13 = (int) jVarN.f65512b;
        int i14 = iArr[1];
        int i15 = iArr2[1];
        return new Rect((i10 + i11) - i12, (i13 + i14) - i15, (((int) jVarN.f65513c) + i11) - i12, (((int) jVarN.f65514d) + i14) - i15);
    }

    public static final View g(p.d dVar) {
        View viewM = C2204h.r(dVar.f103115a).m();
        if (viewM != null) {
            return viewM;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }
}

package androidx.lifecycle;

import R1.f;
import android.view.View;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@dd.j(name = "ViewTreeViewModelStoreOwner")
public final class ViewTreeViewModelStoreOwner {
    @dd.j(name = w7.i.f240158w)
    @Nullable
    public static final q0 a(@NotNull View view) {
        kotlin.jvm.internal.G.p(view, "<this>");
        return (q0) SequencesKt___SequencesKt.i1(SequencesKt___SequencesKt.S1(SequencesKt__SequencesKt.v(view, new ed.l<View, View>() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1
            @Override // ed.l
            @Nullable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final View invoke(@NotNull View view2) {
                kotlin.jvm.internal.G.p(view2, "view");
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new ed.l<View, q0>() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2
            @Override // ed.l
            @Nullable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final q0 invoke(@NotNull View view2) {
                kotlin.jvm.internal.G.p(view2, "view");
                Object tag = view2.getTag(f.a.f67691a);
                if (tag instanceof q0) {
                    return (q0) tag;
                }
                return null;
            }
        }));
    }

    @dd.j(name = "set")
    public static final void b(@NotNull View view, @Nullable q0 q0Var) {
        kotlin.jvm.internal.G.p(view, "<this>");
        view.setTag(f.a.f67691a, q0Var);
    }
}

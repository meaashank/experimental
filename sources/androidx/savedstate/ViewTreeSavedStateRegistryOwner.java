package androidx.savedstate;

import android.view.View;
import androidx.savedstate.a;
import dd.j;
import ed.l;
import kotlin.jvm.internal.G;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w7.i;

/* JADX INFO: loaded from: classes2.dex */
@j(name = "ViewTreeSavedStateRegistryOwner")
public final class ViewTreeSavedStateRegistryOwner {
    @j(name = i.f240158w)
    @Nullable
    public static final f a(@NotNull View view) {
        G.p(view, "<this>");
        return (f) SequencesKt___SequencesKt.i1(SequencesKt___SequencesKt.S1(SequencesKt__SequencesKt.v(view, new l<View, View>() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1
            @Override // ed.l
            @Nullable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final View invoke(@NotNull View view2) {
                G.p(view2, "view");
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new l<View, f>() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2
            @Override // ed.l
            @Nullable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final f invoke(@NotNull View view2) {
                G.p(view2, "view");
                Object tag = view2.getTag(a.C0328a.f117348a);
                if (tag instanceof f) {
                    return (f) tag;
                }
                return null;
            }
        }));
    }

    @j(name = "set")
    public static final void b(@NotNull View view, @Nullable f fVar) {
        G.p(view, "<this>");
        view.setTag(a.C0328a.f117348a, fVar);
    }
}

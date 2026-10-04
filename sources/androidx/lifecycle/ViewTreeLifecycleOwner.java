package androidx.lifecycle;

import O1.a;
import android.view.View;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@dd.j(name = "ViewTreeLifecycleOwner")
public final class ViewTreeLifecycleOwner {
    @dd.j(name = w7.i.f240158w)
    @Nullable
    public static final B a(@NotNull View view) {
        kotlin.jvm.internal.G.p(view, "<this>");
        return (B) SequencesKt___SequencesKt.i1(SequencesKt___SequencesKt.S1(SequencesKt__SequencesKt.v(view, new ed.l<View, View>() { // from class: androidx.lifecycle.ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1
            @Override // ed.l
            @Nullable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final View invoke(@NotNull View currentView) {
                kotlin.jvm.internal.G.p(currentView, "currentView");
                Object parent = currentView.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new ed.l<View, B>() { // from class: androidx.lifecycle.ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2
            @Override // ed.l
            @Nullable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final B invoke(@NotNull View viewParent) {
                kotlin.jvm.internal.G.p(viewParent, "viewParent");
                Object tag = viewParent.getTag(a.C0085a.f65130a);
                if (tag instanceof B) {
                    return (B) tag;
                }
                return null;
            }
        }));
    }

    @dd.j(name = "set")
    public static final void b(@NotNull View view, @Nullable B b10) {
        kotlin.jvm.internal.G.p(view, "<this>");
        view.setTag(a.C0085a.f65130a, b10);
    }
}

package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import fd.InterfaceC4421d;
import java.util.Iterator;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewGroupKt {

    public static final class a implements InterfaceC5000m<View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f111692a;

        public a(ViewGroup viewGroup) {
            this.f111692a = viewGroup;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<View> iterator() {
            return new b(this.f111692a);
        }
    }

    public static final class b implements Iterator<View>, InterfaceC4421d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f111693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f111694b;

        public b(ViewGroup viewGroup) {
            this.f111694b = viewGroup;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f111694b;
            int i10 = this.f111693a;
            this.f111693a = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f111693a < this.f111694b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f111694b;
            int i10 = this.f111693a - 1;
            this.f111693a = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,680:1\n134#2:681\n*E\n"})
    public static final class c implements InterfaceC5000m<View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f111695a;

        public c(ViewGroup viewGroup) {
            this.f111695a = viewGroup;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        @NotNull
        public Iterator<View> iterator() {
            return new C2497u0(new a(this.f111695a).iterator(), new ed.l<View, Iterator<? extends View>>() { // from class: androidx.core.view.ViewGroupKt$descendants$1$1
                @Override // ed.l
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public final Iterator<View> invoke(View view) {
                    ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    if (viewGroup != null) {
                        return new ViewGroupKt.a(viewGroup).iterator();
                    }
                    return null;
                }
            });
        }
    }

    public static final boolean a(@NotNull ViewGroup viewGroup, @NotNull View view) {
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void b(@NotNull ViewGroup viewGroup, @NotNull ed.l<? super View, kotlin.L0> lVar) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            lVar.invoke(viewGroup.getChildAt(i10));
        }
    }

    public static final void c(@NotNull ViewGroup viewGroup, @NotNull ed.p<? super Integer, ? super View, kotlin.L0> pVar) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            pVar.invoke(Integer.valueOf(i10), viewGroup.getChildAt(i10));
        }
    }

    @NotNull
    public static final View d(@NotNull ViewGroup viewGroup, int i10) {
        View childAt = viewGroup.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder sbA = android.support.v4.media.a.a("Index: ", i10, ", Size: ");
        sbA.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @NotNull
    public static final InterfaceC5000m<View> e(@NotNull ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @NotNull
    public static final InterfaceC5000m<View> f(@NotNull ViewGroup viewGroup) {
        return new c(viewGroup);
    }

    @NotNull
    public static final md.l g(@NotNull ViewGroup viewGroup) {
        return md.u.Y1(0, viewGroup.getChildCount());
    }

    public static final int h(@NotNull ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    public static final boolean i(@NotNull ViewGroup viewGroup) {
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean j(@NotNull ViewGroup viewGroup) {
        return viewGroup.getChildCount() != 0;
    }

    @NotNull
    public static final Iterator<View> k(@NotNull ViewGroup viewGroup) {
        return new b(viewGroup);
    }

    public static final void l(@NotNull ViewGroup viewGroup, @NotNull View view) {
        viewGroup.removeView(view);
    }

    public static final void m(@NotNull ViewGroup viewGroup, @NotNull View view) {
        viewGroup.addView(view);
    }

    public static final void n(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @e.P int i10) {
        marginLayoutParams.setMargins(i10, i10, i10, i10);
    }

    public static final void o(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @e.P int i10, @e.P int i11, @e.P int i12, @e.P int i13) {
        marginLayoutParams.setMargins(i10, i11, i12, i13);
    }

    public static /* synthetic */ void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = marginLayoutParams.leftMargin;
        }
        if ((i14 & 2) != 0) {
            i11 = marginLayoutParams.topMargin;
        }
        if ((i14 & 4) != 0) {
            i12 = marginLayoutParams.rightMargin;
        }
        if ((i14 & 8) != 0) {
            i13 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMargins(i10, i11, i12, i13);
    }

    public static final void q(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, @e.P int i10, @e.P int i11, @e.P int i12, @e.P int i13) {
        marginLayoutParams.setMarginStart(i10);
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.setMarginEnd(i12);
        marginLayoutParams.bottomMargin = i13;
    }

    public static /* synthetic */ void r(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = marginLayoutParams.getMarginStart();
        }
        if ((i14 & 2) != 0) {
            i11 = marginLayoutParams.topMargin;
        }
        if ((i14 & 4) != 0) {
            i12 = marginLayoutParams.getMarginEnd();
        }
        if ((i14 & 8) != 0) {
            i13 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMarginStart(i10);
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.setMarginEnd(i12);
        marginLayoutParams.bottomMargin = i13;
    }
}

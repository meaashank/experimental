package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C extends RecyclerView.l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final boolean f116269m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f116270n = "SimpleItemAnimator";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f116271l = true;

    public abstract boolean D(RecyclerView.C c10);

    public abstract boolean E(RecyclerView.C c10, RecyclerView.C c11, int i10, int i11, int i12, int i13);

    public abstract boolean F(RecyclerView.C c10, int i10, int i11, int i12, int i13);

    public abstract boolean G(RecyclerView.C c10);

    public final void H(RecyclerView.C c10) {
        h(c10);
    }

    public final void I(RecyclerView.C c10) {
    }

    public final void J(RecyclerView.C c10, boolean z10) {
        h(c10);
    }

    public final void K(RecyclerView.C c10, boolean z10) {
    }

    public final void L(RecyclerView.C c10) {
        h(c10);
    }

    public final void M(RecyclerView.C c10) {
    }

    public final void N(RecyclerView.C c10) {
        h(c10);
    }

    public final void O(RecyclerView.C c10) {
    }

    public boolean P() {
        return this.f116271l;
    }

    public void Q(RecyclerView.C c10) {
    }

    public void R(RecyclerView.C c10) {
    }

    public void S(RecyclerView.C c10, boolean z10) {
    }

    public void T(RecyclerView.C c10, boolean z10) {
    }

    public void U(RecyclerView.C c10) {
    }

    public void V(RecyclerView.C c10) {
    }

    public void W(RecyclerView.C c10) {
    }

    public void X(RecyclerView.C c10) {
    }

    public void Y(boolean z10) {
        this.f116271l = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(@NonNull RecyclerView.C c10, @Nullable RecyclerView.l.d dVar, @NonNull RecyclerView.l.d dVar2) {
        int i10;
        int i11;
        if (dVar != null && ((i10 = dVar.f116428a) != (i11 = dVar2.f116428a) || dVar.f116429b != dVar2.f116429b)) {
            return F(c10, i10, dVar.f116429b, i11, dVar2.f116429b);
        }
        D(c10);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean b(@NonNull RecyclerView.C c10, @NonNull RecyclerView.C c11, @NonNull RecyclerView.l.d dVar, @NonNull RecyclerView.l.d dVar2) {
        int i10;
        int i11;
        int i12 = dVar.f116428a;
        int i13 = dVar.f116429b;
        if (c11.shouldIgnore()) {
            int i14 = dVar.f116428a;
            i11 = dVar.f116429b;
            i10 = i14;
        } else {
            i10 = dVar2.f116428a;
            i11 = dVar2.f116429b;
        }
        return E(c10, c11, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean c(@NonNull RecyclerView.C c10, @NonNull RecyclerView.l.d dVar, @Nullable RecyclerView.l.d dVar2) {
        int i10 = dVar.f116428a;
        int i11 = dVar.f116429b;
        View view = c10.itemView;
        int left = dVar2 == null ? view.getLeft() : dVar2.f116428a;
        int top = dVar2 == null ? view.getTop() : dVar2.f116429b;
        if (c10.isRemoved() || (i10 == left && i11 == top)) {
            G(c10);
            return true;
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return F(c10, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean d(@NonNull RecyclerView.C c10, @NonNull RecyclerView.l.d dVar, @NonNull RecyclerView.l.d dVar2) {
        int i10 = dVar.f116428a;
        int i11 = dVar2.f116428a;
        if (i10 != i11 || dVar.f116429b != dVar2.f116429b) {
            return F(c10, i10, dVar.f116429b, i11, dVar2.f116429b);
        }
        h(c10);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f(@NonNull RecyclerView.C c10) {
        return !this.f116271l || c10.isInvalid();
    }
}

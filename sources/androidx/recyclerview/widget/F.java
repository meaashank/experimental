package androidx.recyclerview.widget;

import androidx.recyclerview.widget.E;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class F<T2> extends E.b<T2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.Adapter f116297a;

    public F(RecyclerView.Adapter adapter) {
        this.f116297a = adapter;
    }

    @Override // androidx.recyclerview.widget.E.b, androidx.recyclerview.widget.t
    public void a(int i10, int i11, Object obj) {
        this.f116297a.notifyItemRangeChanged(i10, i11, obj);
    }

    @Override // androidx.recyclerview.widget.t
    public void b(int i10, int i11) {
        this.f116297a.notifyItemRangeInserted(i10, i11);
    }

    @Override // androidx.recyclerview.widget.t
    public void c(int i10, int i11) {
        this.f116297a.notifyItemRangeRemoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.t
    public void d(int i10, int i11) {
        this.f116297a.notifyItemMoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.E.b
    public void h(int i10, int i11) {
        this.f116297a.notifyItemRangeChanged(i10, i11);
    }
}

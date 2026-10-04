package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2639b implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final RecyclerView.Adapter f116555a;

    public C2639b(@NonNull RecyclerView.Adapter adapter) {
        this.f116555a = adapter;
    }

    @Override // androidx.recyclerview.widget.t
    public void a(int i10, int i11, Object obj) {
        this.f116555a.notifyItemRangeChanged(i10, i11, obj);
    }

    @Override // androidx.recyclerview.widget.t
    public void b(int i10, int i11) {
        this.f116555a.notifyItemRangeInserted(i10, i11);
    }

    @Override // androidx.recyclerview.widget.t
    public void c(int i10, int i11) {
        this.f116555a.notifyItemRangeRemoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.t
    public void d(int i10, int i11) {
        this.f116555a.notifyItemMoved(i10, i11);
    }
}

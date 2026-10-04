package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.G;
import androidx.recyclerview.widget.L;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final L.c f116929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final G.d f116930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView.Adapter<RecyclerView.C> f116931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f116932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f116933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView.i f116934f = new a();

    public class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            v vVar = v.this;
            vVar.f116933e = vVar.f116931c.getItemCount();
            v vVar2 = v.this;
            vVar2.f116932d.g(vVar2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i10, int i11) {
            v vVar = v.this;
            vVar.f116932d.a(vVar, i10, i11, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeInserted(int i10, int i11) {
            v vVar = v.this;
            vVar.f116933e += i11;
            vVar.f116932d.f(vVar, i10, i11);
            v vVar2 = v.this;
            if (vVar2.f116933e <= 0 || vVar2.f116931c.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            v vVar3 = v.this;
            vVar3.f116932d.c(vVar3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeMoved(int i10, int i11, int i12) {
            androidx.core.util.t.b(i12 == 1, "moving more than 1 item is not supported in RecyclerView");
            v vVar = v.this;
            vVar.f116932d.b(vVar, i10, i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeRemoved(int i10, int i11) {
            v vVar = v.this;
            vVar.f116933e -= i11;
            vVar.f116932d.e(vVar, i10, i11);
            v vVar2 = v.this;
            if (vVar2.f116933e >= 1 || vVar2.f116931c.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            v vVar3 = v.this;
            vVar3.f116932d.c(vVar3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onStateRestorationPolicyChanged() {
            v vVar = v.this;
            vVar.f116932d.c(vVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i10, int i11, @Nullable Object obj) {
            v vVar = v.this;
            vVar.f116932d.a(vVar, i10, i11, obj);
        }
    }

    public interface b {
        void a(@NonNull v vVar, int i10, int i11, @Nullable Object obj);

        void b(@NonNull v vVar, int i10, int i11);

        void c(v vVar);

        void d(@NonNull v vVar, int i10, int i11);

        void e(@NonNull v vVar, int i10, int i11);

        void f(@NonNull v vVar, int i10, int i11);

        void g(@NonNull v vVar);
    }

    public v(RecyclerView.Adapter<RecyclerView.C> adapter, b bVar, L l10, G.d dVar) {
        this.f116931c = adapter;
        this.f116932d = bVar;
        this.f116929a = l10.b(this);
        this.f116930b = dVar;
        this.f116933e = adapter.getItemCount();
        adapter.registerAdapterDataObserver(this.f116934f);
    }

    public void a() {
        this.f116931c.unregisterAdapterDataObserver(this.f116934f);
        this.f116929a.dispose();
    }

    public int b() {
        return this.f116933e;
    }

    public long c(int i10) {
        return this.f116930b.a(this.f116931c.getItemId(i10));
    }

    public int d(int i10) {
        return this.f116929a.a(this.f116931c.getItemViewType(i10));
    }

    public void e(RecyclerView.C c10, int i10) {
        this.f116931c.bindViewHolder(c10, i10);
    }

    public RecyclerView.C f(ViewGroup viewGroup, int i10) {
        return this.f116931c.onCreateViewHolder(viewGroup, this.f116929a.b(i10));
    }
}

package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.C2640c;
import androidx.recyclerview.widget.C2646i;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s<T, VH extends RecyclerView.C> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2640c<T> f116895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2640c.b<T> f116896e;

    public class a implements C2640c.b<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.C2640c.b
        public void a(@NonNull List<T> list, @NonNull List<T> list2) {
            s.this.getClass();
        }
    }

    public s(@NonNull C2646i.f<T> fVar) {
        a aVar = new a();
        this.f116896e = aVar;
        C2640c<T> c2640c = new C2640c<>(new C2639b(this), new AsyncDifferConfig.Builder(fVar).build());
        this.f116895d = c2640c;
        c2640c.a(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f116895d.b().size();
    }

    @NonNull
    public List<T> h() {
        return this.f116895d.b();
    }

    public T i(int i10) {
        return this.f116895d.b().get(i10);
    }

    public void j(@NonNull List<T> list, @NonNull List<T> list2) {
    }

    public void k(@Nullable List<T> list) {
        this.f116895d.f(list);
    }

    public void l(@Nullable List<T> list, @Nullable Runnable runnable) {
        this.f116895d.g(list, runnable);
    }

    public s(@NonNull AsyncDifferConfig<T> asyncDifferConfig) {
        a aVar = new a();
        this.f116896e = aVar;
        C2640c<T> c2640c = new C2640c<>(new C2639b(this), asyncDifferConfig);
        this.f116895d = c2640c;
        c2640c.a(aVar);
    }
}

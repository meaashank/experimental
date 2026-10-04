package k3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.s;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.GlideException;
import g3.C4447e;
import g3.InterfaceC4444b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k3.m;

/* JADX INFO: loaded from: classes2.dex */
public class p<Model, Data> implements m<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<m<Model, Data>> f214412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.a<List<Throwable>> f214413b;

    public static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<com.bumptech.glide.load.data.d<Data>> f214414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s.a<List<Throwable>> f214415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f214416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Priority f214417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d.a<? super Data> f214418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public List<Throwable> f214419f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f214420g;

        public a(@NonNull List<com.bumptech.glide.load.data.d<Data>> list, @NonNull s.a<List<Throwable>> aVar) {
            this.f214415b = aVar;
            y3.m.d(list);
            this.f214414a = list;
            this.f214416c = 0;
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public Class<Data> a() {
            return this.f214414a.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List<Throwable> list = this.f214419f;
            if (list != null) {
                this.f214415b.b(list);
            }
            this.f214419f = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f214414a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @NonNull
        public DataSource c() {
            return this.f214414a.get(0).c();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f214420g = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f214414a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void d(@NonNull Priority priority, @NonNull d.a<? super Data> aVar) {
            this.f214417d = priority;
            this.f214418e = aVar;
            this.f214419f = this.f214415b.a();
            this.f214414a.get(this.f214416c).d(priority, this);
            if (this.f214420g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void e(@Nullable Data data) {
            if (data != null) {
                this.f214418e.e(data);
            } else {
                g();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(@NonNull Exception exc) {
            List<Throwable> list = this.f214419f;
            y3.m.f(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        public final void g() {
            if (this.f214420g) {
                return;
            }
            if (this.f214416c < this.f214414a.size() - 1) {
                this.f214416c++;
                d(this.f214417d, this.f214418e);
            } else {
                y3.m.e(this.f214419f);
                this.f214418e.f(new GlideException("Fetch failed", new ArrayList(this.f214419f)));
            }
        }
    }

    public p(@NonNull List<m<Model, Data>> list, @NonNull s.a<List<Throwable>> aVar) {
        this.f214412a = list;
        this.f214413b = aVar;
    }

    @Override // k3.m
    public m.a<Data> a(@NonNull Model model, int i10, int i11, @NonNull C4447e c4447e) {
        m.a<Data> aVarA;
        int size = this.f214412a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC4444b interfaceC4444b = null;
        for (int i12 = 0; i12 < size; i12++) {
            m<Model, Data> mVar = this.f214412a.get(i12);
            if (mVar.b(model) && (aVarA = mVar.a(model, i10, i11, c4447e)) != null) {
                interfaceC4444b = aVarA.f214405a;
                arrayList.add(aVarA.f214407c);
            }
        }
        if (arrayList.isEmpty() || interfaceC4444b == null) {
            return null;
        }
        return new m.a<>(interfaceC4444b, new a(arrayList, this.f214413b));
    }

    @Override // k3.m
    public boolean b(@NonNull Model model) {
        Iterator<m<Model, Data>> it = this.f214412a.iterator();
        while (it.hasNext()) {
            if (it.next().b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f214412a.toArray()) + '}';
    }
}

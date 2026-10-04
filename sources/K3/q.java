package k3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.s;
import com.bumptech.glide.Registry;
import e.f0;
import g3.C4447e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k3.m;

/* JADX INFO: loaded from: classes2.dex */
public class q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f214421e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m<Object, Object> f214422f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b<?, ?>> f214423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f214424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<b<?, ?>> f214425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s.a<List<Throwable>> f214426d;

    public static class a implements m<Object, Object> {
        @Override // k3.m
        @Nullable
        public m.a<Object> a(@NonNull Object obj, int i10, int i11, @NonNull C4447e c4447e) {
            return null;
        }

        @Override // k3.m
        public boolean b(@NonNull Object obj) {
            return false;
        }
    }

    public static class b<Model, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<Model> f214427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<Data> f214428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n<? extends Model, ? extends Data> f214429c;

        public b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull n<? extends Model, ? extends Data> nVar) {
            this.f214427a = cls;
            this.f214428b = cls2;
            this.f214429c = nVar;
        }

        public boolean a(@NonNull Class<?> cls) {
            return this.f214427a.isAssignableFrom(cls);
        }

        public boolean b(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return a(cls) && this.f214428b.isAssignableFrom(cls2);
        }
    }

    public static class c {
        @NonNull
        public <Model, Data> p<Model, Data> a(@NonNull List<m<Model, Data>> list, @NonNull s.a<List<Throwable>> aVar) {
            return new p<>(list, aVar);
        }
    }

    public q(@NonNull s.a<List<Throwable>> aVar) {
        this(aVar, f214421e);
    }

    @NonNull
    public static <Model, Data> m<Model, Data> f() {
        return (m<Model, Data>) f214422f;
    }

    public final <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull n<? extends Model, ? extends Data> nVar, boolean z10) {
        b<?, ?> bVar = new b<>(cls, cls2, nVar);
        List<b<?, ?>> list = this.f214423a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    public synchronized <Model, Data> void b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull n<? extends Model, ? extends Data> nVar) {
        a(cls, cls2, nVar, true);
    }

    @NonNull
    public synchronized <Model> List<m<Model, ?>> c(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f214423a) {
                if (!this.f214425c.contains(bVar) && bVar.a(cls)) {
                    this.f214425c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f214425c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    @NonNull
    public synchronized <Model, Data> m<Model, Data> d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b<?, ?> bVar : this.f214423a) {
                if (this.f214425c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f214425c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f214425c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f214424b.a(arrayList, this.f214426d);
            }
            if (arrayList.size() == 1) {
                return (m) arrayList.get(0);
            }
            if (!z10) {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return (m<Model, Data>) f214422f;
        } catch (Throwable th) {
            this.f214425c.clear();
            throw th;
        }
    }

    @NonNull
    public final <Model, Data> m<Model, Data> e(@NonNull b<?, ?> bVar) {
        m<Model, Data> mVar = (m<Model, Data>) bVar.f214429c.e(this);
        y3.m.f(mVar, "Argument must not be null");
        return mVar;
    }

    @NonNull
    public synchronized List<Class<?>> g(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f214423a) {
            if (!arrayList.contains(bVar.f214428b) && bVar.a(cls)) {
                arrayList.add(bVar.f214428b);
            }
        }
        return arrayList;
    }

    @NonNull
    public final <Model, Data> n<Model, Data> h(@NonNull b<?, ?> bVar) {
        return (n<Model, Data>) bVar.f214429c;
    }

    public synchronized <Model, Data> void i(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull n<? extends Model, ? extends Data> nVar) {
        a(cls, cls2, nVar, false);
    }

    @NonNull
    public synchronized <Model, Data> List<n<? extends Model, ? extends Data>> j(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it = this.f214423a.iterator();
        while (it.hasNext()) {
            b<?, ?> next = it.next();
            if (next.b(cls, cls2)) {
                it.remove();
                arrayList.add(next.f214429c);
            }
        }
        return arrayList;
    }

    @NonNull
    public synchronized <Model, Data> List<n<? extends Model, ? extends Data>> k(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull n<? extends Model, ? extends Data> nVar) {
        List<n<? extends Model, ? extends Data>> listJ;
        listJ = j(cls, cls2);
        b(cls, cls2, nVar);
        return listJ;
    }

    @f0
    public q(@NonNull s.a<List<Throwable>> aVar, @NonNull c cVar) {
        this.f214423a = new ArrayList();
        this.f214425c = new HashSet();
        this.f214426d = aVar;
        this.f214424b = cVar;
    }
}

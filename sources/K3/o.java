package k3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.s;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f214408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f214409b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Class<?>, C0816a<?>> f214410a = new HashMap();

        /* JADX INFO: renamed from: k3.o$a$a, reason: collision with other inner class name */
        public static class C0816a<Model> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<m<Model, ?>> f214411a;

            public C0816a(List<m<Model, ?>> list) {
                this.f214411a = list;
            }
        }

        public void a() {
            this.f214410a.clear();
        }

        @Nullable
        public <Model> List<m<Model, ?>> b(Class<Model> cls) {
            C0816a<?> c0816a = this.f214410a.get(cls);
            if (c0816a == null) {
                return null;
            }
            return (List<m<Model, ?>>) c0816a.f214411a;
        }

        public <Model> void c(Class<Model> cls, List<m<Model, ?>> list) {
            if (this.f214410a.put(cls, new C0816a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public o(@NonNull s.a<List<Throwable>> aVar) {
        this(new q(aVar));
    }

    @NonNull
    public static <A> Class<A> c(@NonNull A a10) {
        return (Class<A>) a10.getClass();
    }

    public synchronized <Model, Data> void a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull n<? extends Model, ? extends Data> nVar) {
        this.f214408a.b(cls, cls2, nVar);
        this.f214409b.a();
    }

    public synchronized <Model, Data> m<Model, Data> b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        return this.f214408a.d(cls, cls2);
    }

    @NonNull
    public synchronized List<Class<?>> d(@NonNull Class<?> cls) {
        return this.f214408a.g(cls);
    }

    @NonNull
    public <A> List<m<A, ?>> e(@NonNull A a10) {
        List<m<A, ?>> listF = f(a10.getClass());
        if (listF.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a10);
        }
        int size = listF.size();
        List<m<A, ?>> arrayList = Collections.EMPTY_LIST;
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            m<A, ?> mVar = listF.get(i10);
            if (mVar.b(a10)) {
                if (z10) {
                    arrayList = new ArrayList<>(size - i10);
                    z10 = false;
                }
                arrayList.add(mVar);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a10, listF);
        }
        return arrayList;
    }

    @NonNull
    public final synchronized <A> List<m<A, ?>> f(@NonNull Class<A> cls) {
        List<m<A, ?>> listB;
        listB = this.f214409b.b(cls);
        if (listB == null) {
            listB = Collections.unmodifiableList(this.f214408a.c(cls));
            this.f214409b.c(cls, listB);
        }
        return listB;
    }

    public synchronized <Model, Data> void g(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull n<? extends Model, ? extends Data> nVar) {
        this.f214408a.i(cls, cls2, nVar);
        this.f214409b.a();
    }

    public synchronized <Model, Data> void h(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        j(this.f214408a.j(cls, cls2));
        this.f214409b.a();
    }

    public synchronized <Model, Data> void i(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull n<? extends Model, ? extends Data> nVar) {
        j(this.f214408a.k(cls, cls2, nVar));
        this.f214409b.a();
    }

    public final <Model, Data> void j(@NonNull List<n<? extends Model, ? extends Data>> list) {
        Iterator<n<? extends Model, ? extends Data>> it = list.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public o(@NonNull q qVar) {
        this.f214409b = new a();
        this.f214408a = qVar;
    }
}

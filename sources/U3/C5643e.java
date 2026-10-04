package u3;

import androidx.annotation.NonNull;
import g3.InterfaceC4448f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: u3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5643e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f239363a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, List<a<?, ?>>> f239364b = new HashMap();

    /* JADX INFO: renamed from: u3.e$a */
    public static class a<T, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f239365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<R> f239366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC4448f<T, R> f239367c;

        public a(@NonNull Class<T> cls, @NonNull Class<R> cls2, InterfaceC4448f<T, R> interfaceC4448f) {
            this.f239365a = cls;
            this.f239366b = cls2;
            this.f239367c = interfaceC4448f;
        }

        public boolean a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f239365a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f239366b);
        }
    }

    public synchronized <T, R> void a(@NonNull String str, @NonNull InterfaceC4448f<T, R> interfaceC4448f, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, interfaceC4448f));
    }

    @NonNull
    public synchronized <T, R> List<InterfaceC4448f<T, R>> b(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f239363a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f239364b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f239367c);
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public final synchronized List<a<?, ?>> c(@NonNull String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.f239363a.contains(str)) {
                this.f239363a.add(str);
            }
            arrayList = this.f239364b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f239364b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    @NonNull
    public synchronized <T, R> List<Class<R>> d(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f239363a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f239364b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f239366b)) {
                        arrayList.add(aVar.f239366b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void e(@NonNull String str, @NonNull InterfaceC4448f<T, R> interfaceC4448f, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        c(str).add(0, new a<>(cls, cls2, interfaceC4448f));
    }

    public synchronized void f(@NonNull List<String> list) {
        try {
            ArrayList arrayList = new ArrayList(this.f239363a);
            this.f239363a.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f239363a.add(it.next());
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                String str = (String) obj;
                if (!list.contains(str)) {
                    this.f239363a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

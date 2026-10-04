package r6;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: r6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5537e<K, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f227236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<K, f<T>> f227237b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a<K, T> f227238c;

    /* JADX INFO: renamed from: r6.e$a */
    public interface a<K, T> {
        T create(K k10);
    }

    public C5537e(boolean z10, a<K, T> aVar) {
        this.f227236a = false;
        this.f227236a = z10;
        this.f227238c = aVar;
    }

    public T a(K k10) {
        f<T> fVar = this.f227237b.get(k10);
        if (fVar == null) {
            return null;
        }
        return fVar.o();
    }

    public void b(K k10, T t10) {
        f<T> fVar = this.f227237b.get(k10);
        if (fVar == null) {
            fVar = new f<>(this.f227236a, t10);
            this.f227237b.put(k10, fVar);
        }
        fVar.c(t10);
    }

    public void c(K k10, InterfaceC5536d<T> interfaceC5536d) {
        d(k10, interfaceC5536d, 0);
    }

    public void d(K k10, InterfaceC5536d<T> interfaceC5536d, int i10) {
        f<T> fVar = this.f227237b.get(k10);
        if (fVar == null) {
            fVar = new f<>(this.f227236a, this.f227238c.create(k10));
        }
        fVar.j(interfaceC5536d, i10);
    }

    public void e(K k10, InterfaceC5536d<T> interfaceC5536d) {
        f<T> fVar = this.f227237b.get(k10);
        if (fVar != null) {
            fVar.n(interfaceC5536d);
        }
    }
}

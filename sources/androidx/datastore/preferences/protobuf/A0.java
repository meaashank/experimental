package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class A0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A0 f112497c = new A0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap<Class<?>, G0<?>> f112499b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H0 f112498a = new C2521e0();

    public static A0 a() {
        return f112497c;
    }

    public int b() {
        int iU = 0;
        for (G0<?> g02 : this.f112499b.values()) {
            if (g02 instanceof C2541o0) {
                iU = ((C2541o0) g02).u() + iU;
            }
        }
        return iU;
    }

    public <T> boolean c(T t10) {
        return j(t10).b(t10);
    }

    public <T> void d(T t10) {
        j(t10).e(t10);
    }

    public <T> void e(T t10, F0 f02) throws IOException {
        f(t10, f02, H.d());
    }

    public <T> void f(T t10, F0 f02, H h10) throws IOException {
        j(t10).d(t10, f02, h10);
    }

    public G0<?> g(Class<?> cls, G0<?> g02) {
        V.e(cls, "messageType");
        V.e(g02, "schema");
        return this.f112499b.putIfAbsent(cls, g02);
    }

    public G0<?> h(Class<?> cls, G0<?> g02) {
        V.e(cls, "messageType");
        V.e(g02, "schema");
        return this.f112499b.put(cls, g02);
    }

    public <T> G0<T> i(Class<T> cls) {
        V.e(cls, "messageType");
        G0<T> g0A = (G0) this.f112499b.get(cls);
        if (g0A == null) {
            g0A = this.f112498a.a(cls);
            G0<T> g02 = (G0<T>) g(cls, g0A);
            if (g02 != null) {
                return g02;
            }
        }
        return g0A;
    }

    public <T> G0<T> j(T t10) {
        return i(t10.getClass());
    }

    public <T> void k(T t10, Writer writer) throws IOException {
        j(t10).c(t10, writer);
    }
}

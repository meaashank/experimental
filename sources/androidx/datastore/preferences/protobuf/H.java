package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f112619b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f112620c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f112621d = "androidx.datastore.preferences.protobuf.Extension";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile H f112623f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<a, GeneratedMessageLite.g<?, ?>> f112625a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class<?> f112622e = h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final H f112624g = new H(true);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f112626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f112627b;

        public a(Object obj, int i10) {
            this.f112626a = obj;
            this.f112627b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f112626a == aVar.f112626a && this.f112627b == aVar.f112627b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f112626a) * 65535) + this.f112627b;
        }
    }

    public H() {
        this.f112625a = new HashMap();
    }

    public static H d() {
        H hB;
        H h10 = f112623f;
        if (h10 != null) {
            return h10;
        }
        synchronized (H.class) {
            try {
                hB = f112623f;
                if (hB == null) {
                    hB = f112620c ? G.b() : f112624g;
                    f112623f = hB;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hB;
    }

    public static boolean f() {
        return f112619b;
    }

    public static H g() {
        return f112620c ? G.a() : new H();
    }

    public static Class<?> h() {
        try {
            return Class.forName(f112621d);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void i(boolean z10) {
        f112619b = z10;
    }

    public final void a(F<?, ?> f10) {
        if (GeneratedMessageLite.g.class.isAssignableFrom(f10.getClass())) {
            b((GeneratedMessageLite.g) f10);
        }
        if (f112620c && G.d(this)) {
            try {
                getClass().getMethod("add", f112622e).invoke(this, f10);
            } catch (Exception e10) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", f10), e10);
            }
        }
    }

    public final void b(GeneratedMessageLite.g<?, ?> gVar) {
        this.f112625a.put(new a(gVar.h(), gVar.d()), gVar);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.g<ContainingType, ?> c(ContainingType containingtype, int i10) {
        return (GeneratedMessageLite.g) this.f112625a.get(new a(containingtype, i10));
    }

    public H e() {
        return new H(this);
    }

    public H(H h10) {
        if (h10 == f112624g) {
            this.f112625a = Collections.EMPTY_MAP;
        } else {
            this.f112625a = Collections.unmodifiableMap(h10.f112625a);
        }
    }

    public H(boolean z10) {
        this.f112625a = Collections.EMPTY_MAP;
    }
}

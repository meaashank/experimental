package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2518d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f112833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f112834b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f112833a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f112834b = cls2 != null;
    }

    public static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> b() {
        return f112833a;
    }

    public static boolean c() {
        return (f112833a == null || f112834b) ? false : true;
    }
}

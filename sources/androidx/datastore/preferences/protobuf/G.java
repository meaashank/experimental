package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f112599a = "androidx.datastore.preferences.protobuf.ExtensionRegistry";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f112600b = e();

    public static H a() {
        if (f112600b != null) {
            try {
                return c("newInstance");
            } catch (Exception unused) {
            }
        }
        return new H();
    }

    public static H b() {
        if (f112600b != null) {
            try {
                return c("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return H.f112624g;
    }

    public static final H c(String str) throws Exception {
        return (H) f112600b.getDeclaredMethod(str, null).invoke(null, null);
    }

    public static boolean d(H h10) {
        Class<?> cls = f112600b;
        return cls != null && cls.isAssignableFrom(h10.getClass());
    }

    public static Class<?> e() {
        try {
            return Class.forName(f112599a);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}

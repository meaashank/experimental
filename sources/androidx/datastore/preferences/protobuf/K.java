package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I<?> f112658a = new J();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I<?> f112659b = c();

    public static I<?> a() {
        I<?> i10 = f112659b;
        if (i10 != null) {
            return i10;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static I<?> b() {
        return f112658a;
    }

    public static I<?> c() {
        try {
            return (I) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}

package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2554v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2550t0 f113007a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC2550t0 f113008b = new C2552u0();

    public static InterfaceC2550t0 a() {
        return f113007a;
    }

    public static InterfaceC2550t0 b() {
        return f113008b;
    }

    public static InterfaceC2550t0 c() {
        try {
            return (InterfaceC2550t0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}

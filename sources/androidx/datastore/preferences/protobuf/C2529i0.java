package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2529i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2525g0 f112856a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC2525g0 f112857b = new C2527h0();

    public static InterfaceC2525g0 a() {
        return f112856a;
    }

    public static InterfaceC2525g0 b() {
        return f112857b;
    }

    public static InterfaceC2525g0 c() {
        try {
            return (InterfaceC2525g0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}

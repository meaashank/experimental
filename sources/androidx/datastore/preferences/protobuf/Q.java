package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public class Q implements InterfaceC2533k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q f112675a = new Q();

    public static Q c() {
        return f112675a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2533k0
    public InterfaceC2531j0 a(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC2531j0) GeneratedMessageLite.J(cls.asSubclass(GeneratedMessageLite.class)).u();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2533k0
    public boolean b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}

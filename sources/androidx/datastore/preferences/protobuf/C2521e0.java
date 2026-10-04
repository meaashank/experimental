package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2521e0 implements H0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC2533k0 f112838b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2533k0 f112839a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0$a */
    public static class a implements InterfaceC2533k0 {
        @Override // androidx.datastore.preferences.protobuf.InterfaceC2533k0
        public InterfaceC2531j0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2533k0
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0$b */
    public static class b implements InterfaceC2533k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC2533k0[] f112840a;

        public b(InterfaceC2533k0... interfaceC2533k0Arr) {
            this.f112840a = interfaceC2533k0Arr;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2533k0
        public InterfaceC2531j0 a(Class<?> cls) {
            for (InterfaceC2533k0 interfaceC2533k0 : this.f112840a) {
                if (interfaceC2533k0.b(cls)) {
                    return interfaceC2533k0.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2533k0
        public boolean b(Class<?> cls) {
            for (InterfaceC2533k0 interfaceC2533k0 : this.f112840a) {
                if (interfaceC2533k0.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C2521e0() {
        this(b());
    }

    public static InterfaceC2533k0 b() {
        return new b(Q.f112675a, c());
    }

    public static InterfaceC2533k0 c() {
        try {
            return (InterfaceC2533k0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f112838b;
        }
    }

    public static boolean d(InterfaceC2531j0 interfaceC2531j0) {
        return interfaceC2531j0.getSyntax() == ProtoSyntax.PROTO2;
    }

    public static <T> G0<T> e(Class<T> cls, InterfaceC2531j0 interfaceC2531j0) {
        return GeneratedMessageLite.class.isAssignableFrom(cls) ? d(interfaceC2531j0) ? C2541o0.P(cls, interfaceC2531j0, C2554v0.b(), AbstractC2515b0.b(), I0.S(), K.b(), C2529i0.b()) : C2541o0.P(cls, interfaceC2531j0, C2554v0.b(), AbstractC2515b0.b(), I0.S(), null, C2529i0.b()) : d(interfaceC2531j0) ? C2541o0.P(cls, interfaceC2531j0, C2554v0.a(), AbstractC2515b0.a(), I0.K(), K.a(), C2529i0.a()) : C2541o0.P(cls, interfaceC2531j0, C2554v0.a(), AbstractC2515b0.a(), I0.L(), null, C2529i0.a());
    }

    @Override // androidx.datastore.preferences.protobuf.H0
    public <T> G0<T> a(Class<T> cls) {
        I0.M(cls);
        InterfaceC2531j0 interfaceC2531j0A = this.f112839a.a(cls);
        return interfaceC2531j0A.a() ? GeneratedMessageLite.class.isAssignableFrom(cls) ? new C2543p0(I0.f112631d, K.b(), interfaceC2531j0A.getDefaultInstance()) : new C2543p0(I0.f112629b, K.a(), interfaceC2531j0A.getDefaultInstance()) : e(cls, interfaceC2531j0A);
    }

    public C2521e0(InterfaceC2533k0 interfaceC2533k0) {
        V.e(interfaceC2533k0, "messageInfoFactory");
        this.f112839a = interfaceC2533k0;
    }
}

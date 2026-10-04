package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Mixin extends GeneratedMessageLite<Mixin, Builder> implements InterfaceC2546r0 {
    private static final Mixin DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC2560y0<Mixin> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Mixin, Builder> implements InterfaceC2546r0 {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder clearName() {
            copyOnWrite();
            ((Mixin) this.instance).E0();
            return this;
        }

        public Builder clearRoot() {
            copyOnWrite();
            ((Mixin) this.instance).F0();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2546r0
        public String getName() {
            return ((Mixin) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2546r0
        public ByteString getNameBytes() {
            return ((Mixin) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2546r0
        public String getRoot() {
            return ((Mixin) this.instance).getRoot();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2546r0
        public ByteString getRootBytes() {
            return ((Mixin) this.instance).getRootBytes();
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Mixin) this.instance).W0(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Mixin) this.instance).X0(byteString);
            return this;
        }

        public Builder setRoot(String str) {
            copyOnWrite();
            ((Mixin) this.instance).Y0(str);
            return this;
        }

        public Builder setRootBytes(ByteString byteString) {
            copyOnWrite();
            ((Mixin) this.instance).Z0(byteString);
            return this;
        }

        private Builder() {
            super(Mixin.DEFAULT_INSTANCE);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112664a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112664a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112664a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112664a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112664a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112664a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112664a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112664a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Mixin mixin = new Mixin();
        DEFAULT_INSTANCE = mixin;
        GeneratedMessageLite.v0(Mixin.class, mixin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    public static Mixin G0() {
        return DEFAULT_INSTANCE;
    }

    public static Builder H0() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder I0(Mixin mixin) {
        return DEFAULT_INSTANCE.y(mixin);
    }

    public static Mixin J0(InputStream inputStream) throws IOException {
        return (Mixin) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static Mixin K0(InputStream inputStream, H h10) throws IOException {
        return (Mixin) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Mixin L0(ByteString byteString) throws InvalidProtocolBufferException {
        return (Mixin) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static Mixin M0(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (Mixin) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static Mixin N0(AbstractC2549t abstractC2549t) throws IOException {
        return (Mixin) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static Mixin O0(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (Mixin) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static Mixin P0(InputStream inputStream) throws IOException {
        return (Mixin) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static Mixin Q0(InputStream inputStream, H h10) throws IOException {
        return (Mixin) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Mixin R0(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Mixin) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Mixin S0(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (Mixin) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static Mixin T0(byte[] bArr) throws InvalidProtocolBufferException {
        return (Mixin) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static Mixin U0(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (Mixin) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<Mixin> V0() {
        return DEFAULT_INSTANCE.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(ByteString byteString) {
        byteString.getClass();
        AbstractMessageLite.n(byteString);
        this.name_ = byteString.c0(V.f112719a);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112664a[methodToInvoke.ordinal()]) {
            case 1:
                return new Mixin();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<Mixin> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (Mixin.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new GeneratedMessageLite.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void F0() {
        this.root_ = DEFAULT_INSTANCE.root_;
    }

    public final void Y0(String str) {
        str.getClass();
        this.root_ = str;
    }

    public final void Z0(ByteString byteString) {
        byteString.getClass();
        AbstractMessageLite.n(byteString);
        this.root_ = byteString.c0(V.f112719a);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2546r0
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2546r0
    public ByteString getNameBytes() {
        return ByteString.z(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2546r0
    public String getRoot() {
        return this.root_;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2546r0
    public ByteString getRootBytes() {
        return ByteString.z(this.root_);
    }
}

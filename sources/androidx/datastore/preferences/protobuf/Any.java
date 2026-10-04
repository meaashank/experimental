package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Any extends GeneratedMessageLite<Any, Builder> implements InterfaceC2520e {
    private static final Any DEFAULT_INSTANCE;
    private static volatile InterfaceC2560y0<Any> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.f112510e;

    public static final class Builder extends GeneratedMessageLite.Builder<Any, Builder> implements InterfaceC2520e {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder clearTypeUrl() {
            copyOnWrite();
            ((Any) this.instance).D0();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((Any) this.instance).E0();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2520e
        public String getTypeUrl() {
            return ((Any) this.instance).getTypeUrl();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2520e
        public ByteString getTypeUrlBytes() {
            return ((Any) this.instance).getTypeUrlBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2520e
        public ByteString getValue() {
            return ((Any) this.instance).getValue();
        }

        public Builder setTypeUrl(String str) {
            copyOnWrite();
            ((Any) this.instance).V0(str);
            return this;
        }

        public Builder setTypeUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Any) this.instance).W0(byteString);
            return this;
        }

        public Builder setValue(ByteString byteString) {
            copyOnWrite();
            ((Any) this.instance).X0(byteString);
            return this;
        }

        private Builder() {
            super(Any.DEFAULT_INSTANCE);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112501a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112501a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112501a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112501a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112501a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112501a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112501a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112501a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Any any = new Any();
        DEFAULT_INSTANCE = any;
        GeneratedMessageLite.v0(Any.class, any);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0() {
        this.value_ = DEFAULT_INSTANCE.value_;
    }

    public static Any F0() {
        return DEFAULT_INSTANCE;
    }

    public static Builder G0() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder H0(Any any) {
        return DEFAULT_INSTANCE.y(any);
    }

    public static Any I0(InputStream inputStream) throws IOException {
        return (Any) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static Any J0(InputStream inputStream, H h10) throws IOException {
        return (Any) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Any K0(ByteString byteString) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static Any L0(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static Any M0(AbstractC2549t abstractC2549t) throws IOException {
        return (Any) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static Any N0(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (Any) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static Any O0(InputStream inputStream) throws IOException {
        return (Any) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static Any P0(InputStream inputStream, H h10) throws IOException {
        return (Any) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Any Q0(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Any R0(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static Any S0(byte[] bArr) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static Any T0(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (Any) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<Any> U0() {
        return DEFAULT_INSTANCE.k();
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112501a[methodToInvoke.ordinal()]) {
            case 1:
                return new Any();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<Any> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (Any.class) {
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

    public final void D0() {
        this.typeUrl_ = DEFAULT_INSTANCE.typeUrl_;
    }

    public final void V0(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    public final void W0(ByteString byteString) {
        byteString.getClass();
        AbstractMessageLite.n(byteString);
        this.typeUrl_ = byteString.c0(V.f112719a);
    }

    public final void X0(ByteString byteString) {
        byteString.getClass();
        this.value_ = byteString;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2520e
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2520e
    public ByteString getTypeUrlBytes() {
        return ByteString.z(this.typeUrl_);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2520e
    public ByteString getValue() {
        return this.value_;
    }
}

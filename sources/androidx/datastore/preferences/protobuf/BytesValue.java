package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class BytesValue extends GeneratedMessageLite<BytesValue, Builder> implements InterfaceC2547s {
    private static final BytesValue DEFAULT_INSTANCE;
    private static volatile InterfaceC2560y0<BytesValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private ByteString value_ = ByteString.f112510e;

    public static final class Builder extends GeneratedMessageLite.Builder<BytesValue, Builder> implements InterfaceC2547s {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder clearValue() {
            copyOnWrite();
            ((BytesValue) this.instance).A0();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2547s
        public ByteString getValue() {
            return ((BytesValue) this.instance).getValue();
        }

        public Builder setValue(ByteString byteString) {
            copyOnWrite();
            ((BytesValue) this.instance).S0(byteString);
            return this;
        }

        private Builder() {
            super(BytesValue.DEFAULT_INSTANCE);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112529a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112529a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112529a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112529a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112529a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112529a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112529a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112529a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        BytesValue bytesValue = new BytesValue();
        DEFAULT_INSTANCE = bytesValue;
        GeneratedMessageLite.v0(BytesValue.class, bytesValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0() {
        this.value_ = DEFAULT_INSTANCE.value_;
    }

    public static BytesValue B0() {
        return DEFAULT_INSTANCE;
    }

    public static Builder C0() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder D0(BytesValue bytesValue) {
        return DEFAULT_INSTANCE.y(bytesValue);
    }

    public static BytesValue E0(ByteString byteString) {
        return C0().setValue(byteString).build();
    }

    public static BytesValue F0(InputStream inputStream) throws IOException {
        return (BytesValue) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static BytesValue G0(InputStream inputStream, H h10) throws IOException {
        return (BytesValue) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static BytesValue H0(ByteString byteString) throws InvalidProtocolBufferException {
        return (BytesValue) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static BytesValue I0(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (BytesValue) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static BytesValue J0(AbstractC2549t abstractC2549t) throws IOException {
        return (BytesValue) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static BytesValue K0(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (BytesValue) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static BytesValue L0(InputStream inputStream) throws IOException {
        return (BytesValue) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static BytesValue M0(InputStream inputStream, H h10) throws IOException {
        return (BytesValue) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static BytesValue N0(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BytesValue) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static BytesValue O0(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (BytesValue) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static BytesValue P0(byte[] bArr) throws InvalidProtocolBufferException {
        return (BytesValue) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static BytesValue Q0(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (BytesValue) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<BytesValue> R0() {
        return DEFAULT_INSTANCE.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0(ByteString byteString) {
        byteString.getClass();
        this.value_ = byteString;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112529a[methodToInvoke.ordinal()]) {
            case 1:
                return new BytesValue();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<BytesValue> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (BytesValue.class) {
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

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2547s
    public ByteString getValue() {
        return this.value_;
    }
}

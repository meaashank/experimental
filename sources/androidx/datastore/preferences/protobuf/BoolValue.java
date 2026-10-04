package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class BoolValue extends GeneratedMessageLite<BoolValue, Builder> implements InterfaceC2536m {
    private static final BoolValue DEFAULT_INSTANCE;
    private static volatile InterfaceC2560y0<BoolValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    public static final class Builder extends GeneratedMessageLite.Builder<BoolValue, Builder> implements InterfaceC2536m {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder clearValue() {
            copyOnWrite();
            BoolValue.z0((BoolValue) this.instance);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2536m
        public boolean getValue() {
            return ((BoolValue) this.instance).getValue();
        }

        public Builder setValue(boolean z10) {
            copyOnWrite();
            BoolValue.y0((BoolValue) this.instance, z10);
            return this;
        }

        private Builder() {
            super(BoolValue.DEFAULT_INSTANCE);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112506a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112506a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112506a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112506a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112506a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112506a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112506a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112506a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        BoolValue boolValue = new BoolValue();
        DEFAULT_INSTANCE = boolValue;
        GeneratedMessageLite.v0(BoolValue.class, boolValue);
    }

    private void A0() {
        this.value_ = false;
    }

    public static BoolValue B0() {
        return DEFAULT_INSTANCE;
    }

    public static Builder C0() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder D0(BoolValue boolValue) {
        return DEFAULT_INSTANCE.y(boolValue);
    }

    public static BoolValue E0(boolean z10) {
        return C0().setValue(z10).build();
    }

    public static BoolValue F0(InputStream inputStream) throws IOException {
        return (BoolValue) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static BoolValue G0(InputStream inputStream, H h10) throws IOException {
        return (BoolValue) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static BoolValue H0(ByteString byteString) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static BoolValue I0(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static BoolValue J0(AbstractC2549t abstractC2549t) throws IOException {
        return (BoolValue) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static BoolValue K0(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (BoolValue) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static BoolValue L0(InputStream inputStream) throws IOException {
        return (BoolValue) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static BoolValue M0(InputStream inputStream, H h10) throws IOException {
        return (BoolValue) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static BoolValue N0(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static BoolValue O0(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static BoolValue P0(byte[] bArr) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static BoolValue Q0(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (BoolValue) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<BoolValue> R0() {
        return DEFAULT_INSTANCE.k();
    }

    public static void y0(BoolValue boolValue, boolean z10) {
        boolValue.value_ = z10;
    }

    public static void z0(BoolValue boolValue) {
        boolValue.value_ = false;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112506a[methodToInvoke.ordinal()]) {
            case 1:
                return new BoolValue();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<BoolValue> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (BoolValue.class) {
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

    public final void S0(boolean z10) {
        this.value_ = z10;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2536m
    public boolean getValue() {
        return this.value_;
    }
}

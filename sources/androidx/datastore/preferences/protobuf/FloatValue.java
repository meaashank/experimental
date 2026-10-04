package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class FloatValue extends GeneratedMessageLite<FloatValue, Builder> implements P {
    private static final FloatValue DEFAULT_INSTANCE;
    private static volatile InterfaceC2560y0<FloatValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;

    public static final class Builder extends GeneratedMessageLite.Builder<FloatValue, Builder> implements P {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder clearValue() {
            copyOnWrite();
            FloatValue.z0((FloatValue) this.instance);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.P
        public float getValue() {
            return ((FloatValue) this.instance).getValue();
        }

        public Builder setValue(float f10) {
            copyOnWrite();
            FloatValue.y0((FloatValue) this.instance, f10);
            return this;
        }

        private Builder() {
            super(FloatValue.DEFAULT_INSTANCE);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112598a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112598a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112598a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112598a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112598a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112598a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112598a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112598a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        FloatValue floatValue = new FloatValue();
        DEFAULT_INSTANCE = floatValue;
        GeneratedMessageLite.v0(FloatValue.class, floatValue);
    }

    private void A0() {
        this.value_ = 0.0f;
    }

    public static FloatValue B0() {
        return DEFAULT_INSTANCE;
    }

    public static Builder C0() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder D0(FloatValue floatValue) {
        return DEFAULT_INSTANCE.y(floatValue);
    }

    public static FloatValue E0(float f10) {
        return C0().setValue(f10).build();
    }

    public static FloatValue F0(InputStream inputStream) throws IOException {
        return (FloatValue) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static FloatValue G0(InputStream inputStream, H h10) throws IOException {
        return (FloatValue) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static FloatValue H0(ByteString byteString) throws InvalidProtocolBufferException {
        return (FloatValue) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static FloatValue I0(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (FloatValue) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static FloatValue J0(AbstractC2549t abstractC2549t) throws IOException {
        return (FloatValue) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static FloatValue K0(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (FloatValue) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static FloatValue L0(InputStream inputStream) throws IOException {
        return (FloatValue) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static FloatValue M0(InputStream inputStream, H h10) throws IOException {
        return (FloatValue) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static FloatValue N0(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FloatValue) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FloatValue O0(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (FloatValue) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static FloatValue P0(byte[] bArr) throws InvalidProtocolBufferException {
        return (FloatValue) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static FloatValue Q0(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (FloatValue) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<FloatValue> R0() {
        return DEFAULT_INSTANCE.k();
    }

    public static void y0(FloatValue floatValue, float f10) {
        floatValue.value_ = f10;
    }

    public static void z0(FloatValue floatValue) {
        floatValue.value_ = 0.0f;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112598a[methodToInvoke.ordinal()]) {
            case 1:
                return new FloatValue();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<FloatValue> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (FloatValue.class) {
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

    public final void S0(float f10) {
        this.value_ = f10;
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public float getValue() {
        return this.value_;
    }
}

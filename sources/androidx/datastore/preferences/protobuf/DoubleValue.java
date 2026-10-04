package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class DoubleValue extends GeneratedMessageLite<DoubleValue, Builder> implements InterfaceC2557x {
    private static final DoubleValue DEFAULT_INSTANCE;
    private static volatile InterfaceC2560y0<DoubleValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    public static final class Builder extends GeneratedMessageLite.Builder<DoubleValue, Builder> implements InterfaceC2557x {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder clearValue() {
            copyOnWrite();
            DoubleValue.z0((DoubleValue) this.instance);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2557x
        public double getValue() {
            return ((DoubleValue) this.instance).getValue();
        }

        public Builder setValue(double d10) {
            copyOnWrite();
            DoubleValue.y0((DoubleValue) this.instance, d10);
            return this;
        }

        private Builder() {
            super(DoubleValue.DEFAULT_INSTANCE);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112559a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112559a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112559a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112559a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112559a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112559a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112559a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112559a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        DoubleValue doubleValue = new DoubleValue();
        DEFAULT_INSTANCE = doubleValue;
        GeneratedMessageLite.v0(DoubleValue.class, doubleValue);
    }

    private void A0() {
        this.value_ = 0.0d;
    }

    public static DoubleValue B0() {
        return DEFAULT_INSTANCE;
    }

    public static Builder C0() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder D0(DoubleValue doubleValue) {
        return DEFAULT_INSTANCE.y(doubleValue);
    }

    public static DoubleValue E0(double d10) {
        return C0().setValue(d10).build();
    }

    public static DoubleValue F0(InputStream inputStream) throws IOException {
        return (DoubleValue) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static DoubleValue G0(InputStream inputStream, H h10) throws IOException {
        return (DoubleValue) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static DoubleValue H0(ByteString byteString) throws InvalidProtocolBufferException {
        return (DoubleValue) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static DoubleValue I0(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (DoubleValue) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static DoubleValue J0(AbstractC2549t abstractC2549t) throws IOException {
        return (DoubleValue) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static DoubleValue K0(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (DoubleValue) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static DoubleValue L0(InputStream inputStream) throws IOException {
        return (DoubleValue) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static DoubleValue M0(InputStream inputStream, H h10) throws IOException {
        return (DoubleValue) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static DoubleValue N0(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DoubleValue) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static DoubleValue O0(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (DoubleValue) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static DoubleValue P0(byte[] bArr) throws InvalidProtocolBufferException {
        return (DoubleValue) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static DoubleValue Q0(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (DoubleValue) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<DoubleValue> R0() {
        return DEFAULT_INSTANCE.k();
    }

    public static void y0(DoubleValue doubleValue, double d10) {
        doubleValue.value_ = d10;
    }

    public static void z0(DoubleValue doubleValue) {
        doubleValue.value_ = 0.0d;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112559a[methodToInvoke.ordinal()]) {
            case 1:
                return new DoubleValue();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<DoubleValue> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (DoubleValue.class) {
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

    public final void S0(double d10) {
        this.value_ = d10;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2557x
    public double getValue() {
        return this.value_;
    }
}

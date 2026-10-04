package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Int32Value extends GeneratedMessageLite<Int32Value, Builder> implements S {
    private static final Int32Value DEFAULT_INSTANCE;
    private static volatile InterfaceC2560y0<Int32Value> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<Int32Value, Builder> implements S {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder clearValue() {
            copyOnWrite();
            Int32Value.z0((Int32Value) this.instance);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.S
        public int getValue() {
            return ((Int32Value) this.instance).getValue();
        }

        public Builder setValue(int i10) {
            copyOnWrite();
            Int32Value.y0((Int32Value) this.instance, i10);
            return this;
        }

        private Builder() {
            super(Int32Value.DEFAULT_INSTANCE);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112633a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112633a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112633a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112633a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112633a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112633a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112633a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112633a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Int32Value int32Value = new Int32Value();
        DEFAULT_INSTANCE = int32Value;
        GeneratedMessageLite.v0(Int32Value.class, int32Value);
    }

    private void A0() {
        this.value_ = 0;
    }

    public static Int32Value B0() {
        return DEFAULT_INSTANCE;
    }

    public static Builder C0() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder D0(Int32Value int32Value) {
        return DEFAULT_INSTANCE.y(int32Value);
    }

    public static Int32Value E0(int i10) {
        return C0().setValue(i10).build();
    }

    public static Int32Value F0(InputStream inputStream) throws IOException {
        return (Int32Value) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static Int32Value G0(InputStream inputStream, H h10) throws IOException {
        return (Int32Value) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Int32Value H0(ByteString byteString) throws InvalidProtocolBufferException {
        return (Int32Value) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static Int32Value I0(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (Int32Value) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static Int32Value J0(AbstractC2549t abstractC2549t) throws IOException {
        return (Int32Value) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static Int32Value K0(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (Int32Value) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static Int32Value L0(InputStream inputStream) throws IOException {
        return (Int32Value) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static Int32Value M0(InputStream inputStream, H h10) throws IOException {
        return (Int32Value) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Int32Value N0(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Int32Value) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Int32Value O0(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (Int32Value) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static Int32Value P0(byte[] bArr) throws InvalidProtocolBufferException {
        return (Int32Value) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static Int32Value Q0(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (Int32Value) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<Int32Value> R0() {
        return DEFAULT_INSTANCE.k();
    }

    public static void y0(Int32Value int32Value, int i10) {
        int32Value.value_ = i10;
    }

    public static void z0(Int32Value int32Value) {
        int32Value.value_ = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112633a[methodToInvoke.ordinal()]) {
            case 1:
                return new Int32Value();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<Int32Value> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (Int32Value.class) {
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

    public final void S0(int i10) {
        this.value_ = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public int getValue() {
        return this.value_;
    }
}

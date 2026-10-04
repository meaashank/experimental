package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Int64Value extends GeneratedMessageLite<Int64Value, Builder> implements T {
    private static final Int64Value DEFAULT_INSTANCE;
    private static volatile InterfaceC2560y0<Int64Value> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    public static final class Builder extends GeneratedMessageLite.Builder<Int64Value, Builder> implements T {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder clearValue() {
            copyOnWrite();
            Int64Value.z0((Int64Value) this.instance);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.T
        public long getValue() {
            return ((Int64Value) this.instance).getValue();
        }

        public Builder setValue(long j10) {
            copyOnWrite();
            Int64Value.y0((Int64Value) this.instance, j10);
            return this;
        }

        private Builder() {
            super(Int64Value.DEFAULT_INSTANCE);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112634a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112634a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112634a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112634a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112634a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112634a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112634a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112634a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Int64Value int64Value = new Int64Value();
        DEFAULT_INSTANCE = int64Value;
        GeneratedMessageLite.v0(Int64Value.class, int64Value);
    }

    private void A0() {
        this.value_ = 0L;
    }

    public static Int64Value B0() {
        return DEFAULT_INSTANCE;
    }

    public static Builder C0() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder D0(Int64Value int64Value) {
        return DEFAULT_INSTANCE.y(int64Value);
    }

    public static Int64Value E0(long j10) {
        return C0().setValue(j10).build();
    }

    public static Int64Value F0(InputStream inputStream) throws IOException {
        return (Int64Value) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static Int64Value G0(InputStream inputStream, H h10) throws IOException {
        return (Int64Value) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Int64Value H0(ByteString byteString) throws InvalidProtocolBufferException {
        return (Int64Value) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static Int64Value I0(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (Int64Value) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static Int64Value J0(AbstractC2549t abstractC2549t) throws IOException {
        return (Int64Value) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static Int64Value K0(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (Int64Value) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static Int64Value L0(InputStream inputStream) throws IOException {
        return (Int64Value) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static Int64Value M0(InputStream inputStream, H h10) throws IOException {
        return (Int64Value) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Int64Value N0(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Int64Value) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Int64Value O0(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (Int64Value) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static Int64Value P0(byte[] bArr) throws InvalidProtocolBufferException {
        return (Int64Value) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static Int64Value Q0(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (Int64Value) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<Int64Value> R0() {
        return DEFAULT_INSTANCE.k();
    }

    public static void y0(Int64Value int64Value, long j10) {
        int64Value.value_ = j10;
    }

    public static void z0(Int64Value int64Value) {
        int64Value.value_ = 0L;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112634a[methodToInvoke.ordinal()]) {
            case 1:
                return new Int64Value();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<Int64Value> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (Int64Value.class) {
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

    public final void S0(long j10) {
        this.value_ = j10;
    }

    @Override // androidx.datastore.preferences.protobuf.T
    public long getValue() {
        return this.value_;
    }
}

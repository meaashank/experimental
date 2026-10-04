package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class UInt64Value extends GeneratedMessageLite<UInt64Value, Builder> implements V0 {
    private static final UInt64Value DEFAULT_INSTANCE;
    private static volatile InterfaceC2560y0<UInt64Value> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    public static final class Builder extends GeneratedMessageLite.Builder<UInt64Value, Builder> implements V0 {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder clearValue() {
            copyOnWrite();
            UInt64Value.z0((UInt64Value) this.instance);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.V0
        public long getValue() {
            return ((UInt64Value) this.instance).getValue();
        }

        public Builder setValue(long j10) {
            copyOnWrite();
            UInt64Value.y0((UInt64Value) this.instance, j10);
            return this;
        }

        private Builder() {
            super(UInt64Value.DEFAULT_INSTANCE);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112711a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112711a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112711a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112711a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112711a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112711a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112711a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112711a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        UInt64Value uInt64Value = new UInt64Value();
        DEFAULT_INSTANCE = uInt64Value;
        GeneratedMessageLite.v0(UInt64Value.class, uInt64Value);
    }

    private void A0() {
        this.value_ = 0L;
    }

    public static UInt64Value B0() {
        return DEFAULT_INSTANCE;
    }

    public static Builder C0() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder D0(UInt64Value uInt64Value) {
        return DEFAULT_INSTANCE.y(uInt64Value);
    }

    public static UInt64Value E0(long j10) {
        return C0().setValue(j10).build();
    }

    public static UInt64Value F0(InputStream inputStream) throws IOException {
        return (UInt64Value) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt64Value G0(InputStream inputStream, H h10) throws IOException {
        return (UInt64Value) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static UInt64Value H0(ByteString byteString) throws InvalidProtocolBufferException {
        return (UInt64Value) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static UInt64Value I0(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (UInt64Value) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static UInt64Value J0(AbstractC2549t abstractC2549t) throws IOException {
        return (UInt64Value) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static UInt64Value K0(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (UInt64Value) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static UInt64Value L0(InputStream inputStream) throws IOException {
        return (UInt64Value) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt64Value M0(InputStream inputStream, H h10) throws IOException {
        return (UInt64Value) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static UInt64Value N0(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UInt64Value) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static UInt64Value O0(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (UInt64Value) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static UInt64Value P0(byte[] bArr) throws InvalidProtocolBufferException {
        return (UInt64Value) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static UInt64Value Q0(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (UInt64Value) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<UInt64Value> R0() {
        return DEFAULT_INSTANCE.k();
    }

    private void S0(long j10) {
        this.value_ = j10;
    }

    public static void y0(UInt64Value uInt64Value, long j10) {
        uInt64Value.value_ = j10;
    }

    public static void z0(UInt64Value uInt64Value) {
        uInt64Value.value_ = 0L;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112711a[methodToInvoke.ordinal()]) {
            case 1:
                return new UInt64Value();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<UInt64Value> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (UInt64Value.class) {
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

    @Override // androidx.datastore.preferences.protobuf.V0
    public long getValue() {
        return this.value_;
    }
}

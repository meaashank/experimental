package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Timestamp extends GeneratedMessageLite<Timestamp, Builder> implements Q0 {
    private static final Timestamp DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile InterfaceC2560y0<Timestamp> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    public static final class Builder extends GeneratedMessageLite.Builder<Timestamp, Builder> implements Q0 {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder clearNanos() {
            copyOnWrite();
            Timestamp.B0((Timestamp) this.instance);
            return this;
        }

        public Builder clearSeconds() {
            copyOnWrite();
            Timestamp.z0((Timestamp) this.instance);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.Q0
        public int getNanos() {
            return ((Timestamp) this.instance).getNanos();
        }

        @Override // androidx.datastore.preferences.protobuf.Q0
        public long getSeconds() {
            return ((Timestamp) this.instance).getSeconds();
        }

        public Builder setNanos(int i10) {
            copyOnWrite();
            Timestamp.A0((Timestamp) this.instance, i10);
            return this;
        }

        public Builder setSeconds(long j10) {
            copyOnWrite();
            Timestamp.y0((Timestamp) this.instance, j10);
            return this;
        }

        private Builder() {
            super(Timestamp.DEFAULT_INSTANCE);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112705a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112705a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112705a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112705a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112705a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112705a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112705a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112705a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Timestamp timestamp = new Timestamp();
        DEFAULT_INSTANCE = timestamp;
        GeneratedMessageLite.v0(Timestamp.class, timestamp);
    }

    public static void A0(Timestamp timestamp, int i10) {
        timestamp.nanos_ = i10;
    }

    public static void B0(Timestamp timestamp) {
        timestamp.nanos_ = 0;
    }

    private void C0() {
        this.nanos_ = 0;
    }

    private void D0() {
        this.seconds_ = 0L;
    }

    public static Timestamp E0() {
        return DEFAULT_INSTANCE;
    }

    public static Builder F0() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder G0(Timestamp timestamp) {
        return DEFAULT_INSTANCE.y(timestamp);
    }

    public static Timestamp H0(InputStream inputStream) throws IOException {
        return (Timestamp) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static Timestamp I0(InputStream inputStream, H h10) throws IOException {
        return (Timestamp) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Timestamp J0(ByteString byteString) throws InvalidProtocolBufferException {
        return (Timestamp) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static Timestamp K0(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (Timestamp) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static Timestamp L0(AbstractC2549t abstractC2549t) throws IOException {
        return (Timestamp) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static Timestamp M0(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (Timestamp) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static Timestamp N0(InputStream inputStream) throws IOException {
        return (Timestamp) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static Timestamp O0(InputStream inputStream, H h10) throws IOException {
        return (Timestamp) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Timestamp P0(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Timestamp) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Timestamp Q0(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (Timestamp) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static Timestamp R0(byte[] bArr) throws InvalidProtocolBufferException {
        return (Timestamp) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static Timestamp S0(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (Timestamp) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<Timestamp> T0() {
        return DEFAULT_INSTANCE.k();
    }

    private void U0(int i10) {
        this.nanos_ = i10;
    }

    private void V0(long j10) {
        this.seconds_ = j10;
    }

    public static void y0(Timestamp timestamp, long j10) {
        timestamp.seconds_ = j10;
    }

    public static void z0(Timestamp timestamp) {
        timestamp.seconds_ = 0L;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112705a[methodToInvoke.ordinal()]) {
            case 1:
                return new Timestamp();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<Timestamp> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (Timestamp.class) {
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

    @Override // androidx.datastore.preferences.protobuf.Q0
    public int getNanos() {
        return this.nanos_;
    }

    @Override // androidx.datastore.preferences.protobuf.Q0
    public long getSeconds() {
        return this.seconds_;
    }
}

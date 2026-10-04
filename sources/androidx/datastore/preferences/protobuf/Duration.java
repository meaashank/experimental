package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Duration extends GeneratedMessageLite<Duration, Builder> implements InterfaceC2559y {
    private static final Duration DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile InterfaceC2560y0<Duration> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    public static final class Builder extends GeneratedMessageLite.Builder<Duration, Builder> implements InterfaceC2559y {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder clearNanos() {
            copyOnWrite();
            Duration.B0((Duration) this.instance);
            return this;
        }

        public Builder clearSeconds() {
            copyOnWrite();
            Duration.z0((Duration) this.instance);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2559y
        public int getNanos() {
            return ((Duration) this.instance).getNanos();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2559y
        public long getSeconds() {
            return ((Duration) this.instance).getSeconds();
        }

        public Builder setNanos(int i10) {
            copyOnWrite();
            Duration.A0((Duration) this.instance, i10);
            return this;
        }

        public Builder setSeconds(long j10) {
            copyOnWrite();
            Duration.y0((Duration) this.instance, j10);
            return this;
        }

        private Builder() {
            super(Duration.DEFAULT_INSTANCE);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112560a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112560a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112560a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112560a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112560a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112560a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112560a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112560a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Duration duration = new Duration();
        DEFAULT_INSTANCE = duration;
        GeneratedMessageLite.v0(Duration.class, duration);
    }

    public static void A0(Duration duration, int i10) {
        duration.nanos_ = i10;
    }

    public static void B0(Duration duration) {
        duration.nanos_ = 0;
    }

    public static Duration E0() {
        return DEFAULT_INSTANCE;
    }

    public static Builder F0() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder G0(Duration duration) {
        return DEFAULT_INSTANCE.y(duration);
    }

    public static Duration H0(InputStream inputStream) throws IOException {
        return (Duration) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static Duration I0(InputStream inputStream, H h10) throws IOException {
        return (Duration) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Duration J0(ByteString byteString) throws InvalidProtocolBufferException {
        return (Duration) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static Duration K0(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (Duration) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static Duration L0(AbstractC2549t abstractC2549t) throws IOException {
        return (Duration) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static Duration M0(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (Duration) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static Duration N0(InputStream inputStream) throws IOException {
        return (Duration) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static Duration O0(InputStream inputStream, H h10) throws IOException {
        return (Duration) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Duration P0(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Duration) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Duration Q0(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (Duration) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static Duration R0(byte[] bArr) throws InvalidProtocolBufferException {
        return (Duration) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static Duration S0(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (Duration) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<Duration> T0() {
        return DEFAULT_INSTANCE.k();
    }

    public static void y0(Duration duration, long j10) {
        duration.seconds_ = j10;
    }

    public static void z0(Duration duration) {
        duration.seconds_ = 0L;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112560a[methodToInvoke.ordinal()]) {
            case 1:
                return new Duration();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<Duration> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (Duration.class) {
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

    public final void C0() {
        this.nanos_ = 0;
    }

    public final void D0() {
        this.seconds_ = 0L;
    }

    public final void U0(int i10) {
        this.nanos_ = i10;
    }

    public final void V0(long j10) {
        this.seconds_ = j10;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2559y
    public int getNanos() {
        return this.nanos_;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2559y
    public long getSeconds() {
        return this.seconds_;
    }
}

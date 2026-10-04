package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Empty extends GeneratedMessageLite<Empty, Builder> implements A {
    private static final Empty DEFAULT_INSTANCE;
    private static volatile InterfaceC2560y0<Empty> PARSER;

    public static final class Builder extends GeneratedMessageLite.Builder<Empty, Builder> implements A {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        private Builder() {
            super(Empty.DEFAULT_INSTANCE);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112565a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112565a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112565a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112565a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112565a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112565a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112565a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112565a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Empty empty = new Empty();
        DEFAULT_INSTANCE = empty;
        GeneratedMessageLite.v0(Empty.class, empty);
    }

    public static Builder A0(Empty empty) {
        return DEFAULT_INSTANCE.y(empty);
    }

    public static Empty B0(InputStream inputStream) throws IOException {
        return (Empty) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static Empty C0(InputStream inputStream, H h10) throws IOException {
        return (Empty) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Empty D0(ByteString byteString) throws InvalidProtocolBufferException {
        return (Empty) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static Empty E0(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (Empty) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static Empty F0(AbstractC2549t abstractC2549t) throws IOException {
        return (Empty) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static Empty G0(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (Empty) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static Empty H0(InputStream inputStream) throws IOException {
        return (Empty) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static Empty I0(InputStream inputStream, H h10) throws IOException {
        return (Empty) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Empty J0(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Empty) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Empty K0(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (Empty) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static Empty L0(byte[] bArr) throws InvalidProtocolBufferException {
        return (Empty) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static Empty M0(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (Empty) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<Empty> N0() {
        return DEFAULT_INSTANCE.k();
    }

    public static Empty y0() {
        return DEFAULT_INSTANCE;
    }

    public static Builder z0() {
        return DEFAULT_INSTANCE.x();
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112565a[methodToInvoke.ordinal()]) {
            case 1:
                return new Empty();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<Empty> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (Empty.class) {
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
}

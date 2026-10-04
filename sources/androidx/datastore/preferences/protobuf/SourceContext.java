package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class SourceContext extends GeneratedMessageLite<SourceContext, Builder> implements K0 {
    private static final SourceContext DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC2560y0<SourceContext> PARSER;
    private String fileName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<SourceContext, Builder> implements K0 {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder clearFileName() {
            copyOnWrite();
            ((SourceContext) this.instance).B0();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.K0
        public String getFileName() {
            return ((SourceContext) this.instance).getFileName();
        }

        @Override // androidx.datastore.preferences.protobuf.K0
        public ByteString getFileNameBytes() {
            return ((SourceContext) this.instance).getFileNameBytes();
        }

        public Builder setFileName(String str) {
            copyOnWrite();
            ((SourceContext) this.instance).S0(str);
            return this;
        }

        public Builder setFileNameBytes(ByteString byteString) {
            copyOnWrite();
            ((SourceContext) this.instance).T0(byteString);
            return this;
        }

        private Builder() {
            super(SourceContext.DEFAULT_INSTANCE);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112695a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112695a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112695a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112695a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112695a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112695a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112695a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112695a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        SourceContext sourceContext = new SourceContext();
        DEFAULT_INSTANCE = sourceContext;
        GeneratedMessageLite.v0(SourceContext.class, sourceContext);
    }

    public static SourceContext C0() {
        return DEFAULT_INSTANCE;
    }

    public static Builder D0() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder E0(SourceContext sourceContext) {
        return DEFAULT_INSTANCE.y(sourceContext);
    }

    public static SourceContext F0(InputStream inputStream) throws IOException {
        return (SourceContext) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceContext G0(InputStream inputStream, H h10) throws IOException {
        return (SourceContext) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static SourceContext H0(ByteString byteString) throws InvalidProtocolBufferException {
        return (SourceContext) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static SourceContext I0(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (SourceContext) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static SourceContext J0(AbstractC2549t abstractC2549t) throws IOException {
        return (SourceContext) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static SourceContext K0(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (SourceContext) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static SourceContext L0(InputStream inputStream) throws IOException {
        return (SourceContext) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceContext M0(InputStream inputStream, H h10) throws IOException {
        return (SourceContext) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static SourceContext N0(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SourceContext) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static SourceContext O0(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (SourceContext) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static SourceContext P0(byte[] bArr) throws InvalidProtocolBufferException {
        return (SourceContext) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static SourceContext Q0(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (SourceContext) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<SourceContext> R0() {
        return DEFAULT_INSTANCE.k();
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112695a[methodToInvoke.ordinal()]) {
            case 1:
                return new SourceContext();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<SourceContext> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (SourceContext.class) {
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

    public final void B0() {
        this.fileName_ = DEFAULT_INSTANCE.fileName_;
    }

    public final void S0(String str) {
        str.getClass();
        this.fileName_ = str;
    }

    public final void T0(ByteString byteString) {
        byteString.getClass();
        AbstractMessageLite.n(byteString);
        this.fileName_ = byteString.c0(V.f112719a);
    }

    @Override // androidx.datastore.preferences.protobuf.K0
    public String getFileName() {
        return this.fileName_;
    }

    @Override // androidx.datastore.preferences.protobuf.K0
    public ByteString getFileNameBytes() {
        return ByteString.z(this.fileName_);
    }
}

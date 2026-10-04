package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Any;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Option extends GeneratedMessageLite<Option, Builder> implements InterfaceC2558x0 {
    private static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC2560y0<Option> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String name_ = "";
    private Any value_;

    public static final class Builder extends GeneratedMessageLite.Builder<Option, Builder> implements InterfaceC2558x0 {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder clearName() {
            copyOnWrite();
            ((Option) this.instance).F0();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            Option.E0((Option) this.instance);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2558x0
        public String getName() {
            return ((Option) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2558x0
        public ByteString getNameBytes() {
            return ((Option) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2558x0
        public Any getValue() {
            return ((Option) this.instance).getValue();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2558x0
        public boolean hasValue() {
            return ((Option) this.instance).hasValue();
        }

        public Builder mergeValue(Any any) {
            copyOnWrite();
            ((Option) this.instance).I0(any);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Option) this.instance).Y0(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Option) this.instance).Z0(byteString);
            return this;
        }

        public Builder setValue(Any any) {
            copyOnWrite();
            ((Option) this.instance).b1(any);
            return this;
        }

        private Builder() {
            super(Option.DEFAULT_INSTANCE);
        }

        public Builder setValue(Any.Builder builder) {
            copyOnWrite();
            ((Option) this.instance).a1(builder);
            return this;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112672a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112672a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112672a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112672a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112672a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112672a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112672a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112672a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Option option = new Option();
        DEFAULT_INSTANCE = option;
        GeneratedMessageLite.v0(Option.class, option);
    }

    public static void E0(Option option) {
        option.value_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    private void G0() {
        this.value_ = null;
    }

    public static Option H0() {
        return DEFAULT_INSTANCE;
    }

    public static Builder J0() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder K0(Option option) {
        return DEFAULT_INSTANCE.y(option);
    }

    public static Option L0(InputStream inputStream) throws IOException {
        return (Option) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static Option M0(InputStream inputStream, H h10) throws IOException {
        return (Option) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Option N0(ByteString byteString) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static Option O0(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static Option P0(AbstractC2549t abstractC2549t) throws IOException {
        return (Option) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static Option Q0(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (Option) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static Option R0(InputStream inputStream) throws IOException {
        return (Option) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static Option S0(InputStream inputStream, H h10) throws IOException {
        return (Option) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Option T0(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Option U0(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static Option V0(byte[] bArr) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static Option W0(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (Option) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<Option> X0() {
        return DEFAULT_INSTANCE.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y0(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z0(ByteString byteString) {
        byteString.getClass();
        AbstractMessageLite.n(byteString);
        this.name_ = byteString.c0(V.f112719a);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112672a[methodToInvoke.ordinal()]) {
            case 1:
                return new Option();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<Option> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (Option.class) {
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

    public final void I0(Any any) {
        any.getClass();
        Any any2 = this.value_;
        if (any2 == null || any2 == Any.F0()) {
            this.value_ = any;
        } else {
            this.value_ = Any.H0(this.value_).mergeFrom(any).buildPartial();
        }
    }

    public final void a1(Any.Builder builder) {
        this.value_ = builder.build();
    }

    public final void b1(Any any) {
        any.getClass();
        this.value_ = any;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2558x0
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2558x0
    public ByteString getNameBytes() {
        return ByteString.z(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2558x0
    public Any getValue() {
        Any any = this.value_;
        return any == null ? Any.F0() : any;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2558x0
    public boolean hasValue() {
        return this.value_ != null;
    }
}

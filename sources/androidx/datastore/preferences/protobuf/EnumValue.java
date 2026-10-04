package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Option;
import androidx.datastore.preferences.protobuf.V;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EnumValue extends GeneratedMessageLite<EnumValue, Builder> implements D {
    private static final EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile InterfaceC2560y0<EnumValue> PARSER;
    private int number_;
    private String name_ = "";
    private V.k<Option> options_ = B0.g();

    public static final class Builder extends GeneratedMessageLite.Builder<EnumValue, Builder> implements D {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            ((EnumValue) this.instance).M0(iterable);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            ((EnumValue) this.instance).Q0(option);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((EnumValue) this.instance).R0();
            return this;
        }

        public Builder clearNumber() {
            copyOnWrite();
            EnumValue.H0((EnumValue) this.instance);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((EnumValue) this.instance).T0();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.D
        public String getName() {
            return ((EnumValue) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.D
        public ByteString getNameBytes() {
            return ((EnumValue) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.D
        public int getNumber() {
            return ((EnumValue) this.instance).getNumber();
        }

        @Override // androidx.datastore.preferences.protobuf.D
        public Option getOptions(int i10) {
            return ((EnumValue) this.instance).getOptions(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.D
        public int getOptionsCount() {
            return ((EnumValue) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.D
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((EnumValue) this.instance).getOptionsList());
        }

        public Builder removeOptions(int i10) {
            copyOnWrite();
            ((EnumValue) this.instance).n1(i10);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((EnumValue) this.instance).o1(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((EnumValue) this.instance).p1(byteString);
            return this;
        }

        public Builder setNumber(int i10) {
            copyOnWrite();
            EnumValue.G0((EnumValue) this.instance, i10);
            return this;
        }

        public Builder setOptions(int i10, Option option) {
            copyOnWrite();
            ((EnumValue) this.instance).s1(i10, option);
            return this;
        }

        private Builder() {
            super(EnumValue.DEFAULT_INSTANCE);
        }

        public Builder addOptions(int i10, Option option) {
            copyOnWrite();
            ((EnumValue) this.instance).O0(i10, option);
            return this;
        }

        public Builder setOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            ((EnumValue) this.instance).r1(i10, builder);
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            ((EnumValue) this.instance).P0(builder);
            return this;
        }

        public Builder addOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            ((EnumValue) this.instance).N0(i10, builder);
            return this;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112567a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112567a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112567a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112567a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112567a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112567a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112567a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112567a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        EnumValue enumValue = new EnumValue();
        DEFAULT_INSTANCE = enumValue;
        GeneratedMessageLite.v0(EnumValue.class, enumValue);
    }

    public static void G0(EnumValue enumValue, int i10) {
        enumValue.number_ = i10;
    }

    public static void H0(EnumValue enumValue) {
        enumValue.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0(Iterable<? extends Option> iterable) {
        U0();
        AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0(int i10, Option.Builder builder) {
        U0();
        this.options_.add(i10, builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(int i10, Option option) {
        option.getClass();
        U0();
        this.options_.add(i10, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0(Option.Builder builder) {
        U0();
        this.options_.add(builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0(Option option) {
        option.getClass();
        U0();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0() {
        this.options_ = B0.g();
    }

    private void U0() {
        if (this.options_.k3()) {
            return;
        }
        this.options_ = GeneratedMessageLite.X(this.options_);
    }

    public static EnumValue V0() {
        return DEFAULT_INSTANCE;
    }

    public static Builder Y0() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder Z0(EnumValue enumValue) {
        return DEFAULT_INSTANCE.y(enumValue);
    }

    public static EnumValue a1(InputStream inputStream) throws IOException {
        return (EnumValue) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static EnumValue b1(InputStream inputStream, H h10) throws IOException {
        return (EnumValue) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static EnumValue c1(ByteString byteString) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static EnumValue d1(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static EnumValue e1(AbstractC2549t abstractC2549t) throws IOException {
        return (EnumValue) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static EnumValue f1(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (EnumValue) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static EnumValue g1(InputStream inputStream) throws IOException {
        return (EnumValue) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static EnumValue h1(InputStream inputStream, H h10) throws IOException {
        return (EnumValue) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static EnumValue i1(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EnumValue j1(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static EnumValue k1(byte[] bArr) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static EnumValue l1(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (EnumValue) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<EnumValue> m1() {
        return DEFAULT_INSTANCE.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n1(int i10) {
        U0();
        this.options_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o1(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p1(ByteString byteString) {
        byteString.getClass();
        AbstractMessageLite.n(byteString);
        this.name_ = byteString.c0(V.f112719a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r1(int i10, Option.Builder builder) {
        U0();
        this.options_.set(i10, builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s1(int i10, Option option) {
        option.getClass();
        U0();
        this.options_.set(i10, option);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112567a[methodToInvoke.ordinal()]) {
            case 1:
                return new EnumValue();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", Option.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<EnumValue> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (EnumValue.class) {
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

    public final void S0() {
        this.number_ = 0;
    }

    public InterfaceC2558x0 W0(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends InterfaceC2558x0> X0() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public ByteString getNameBytes() {
        return ByteString.z(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public int getNumber() {
        return this.number_;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public Option getOptions(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public final void q1(int i10) {
        this.number_ = i10;
    }
}

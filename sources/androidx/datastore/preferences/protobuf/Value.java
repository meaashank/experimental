package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.ListValue;
import androidx.datastore.preferences.protobuf.Struct;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Value extends GeneratedMessageLite<Value, Builder> implements b1 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile InterfaceC2560y0<Value> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements b1 {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder clearBoolValue() {
            copyOnWrite();
            ((Value) this.instance).R0();
            return this;
        }

        public Builder clearKind() {
            copyOnWrite();
            ((Value) this.instance).S0();
            return this;
        }

        public Builder clearListValue() {
            copyOnWrite();
            ((Value) this.instance).T0();
            return this;
        }

        public Builder clearNullValue() {
            copyOnWrite();
            ((Value) this.instance).U0();
            return this;
        }

        public Builder clearNumberValue() {
            copyOnWrite();
            ((Value) this.instance).V0();
            return this;
        }

        public Builder clearStringValue() {
            copyOnWrite();
            ((Value) this.instance).W0();
            return this;
        }

        public Builder clearStructValue() {
            copyOnWrite();
            ((Value) this.instance).X0();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.b1
        public boolean getBoolValue() {
            return ((Value) this.instance).getBoolValue();
        }

        @Override // androidx.datastore.preferences.protobuf.b1
        public KindCase getKindCase() {
            return ((Value) this.instance).getKindCase();
        }

        @Override // androidx.datastore.preferences.protobuf.b1
        public ListValue getListValue() {
            return ((Value) this.instance).getListValue();
        }

        @Override // androidx.datastore.preferences.protobuf.b1
        public NullValue getNullValue() {
            return ((Value) this.instance).getNullValue();
        }

        @Override // androidx.datastore.preferences.protobuf.b1
        public int getNullValueValue() {
            return ((Value) this.instance).getNullValueValue();
        }

        @Override // androidx.datastore.preferences.protobuf.b1
        public double getNumberValue() {
            return ((Value) this.instance).getNumberValue();
        }

        @Override // androidx.datastore.preferences.protobuf.b1
        public String getStringValue() {
            return ((Value) this.instance).getStringValue();
        }

        @Override // androidx.datastore.preferences.protobuf.b1
        public ByteString getStringValueBytes() {
            return ((Value) this.instance).getStringValueBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.b1
        public Struct getStructValue() {
            return ((Value) this.instance).getStructValue();
        }

        @Override // androidx.datastore.preferences.protobuf.b1
        public boolean hasListValue() {
            return ((Value) this.instance).hasListValue();
        }

        @Override // androidx.datastore.preferences.protobuf.b1
        public boolean hasStructValue() {
            return ((Value) this.instance).hasStructValue();
        }

        public Builder mergeListValue(ListValue listValue) {
            copyOnWrite();
            ((Value) this.instance).Z0(listValue);
            return this;
        }

        public Builder mergeStructValue(Struct struct) {
            copyOnWrite();
            ((Value) this.instance).a1(struct);
            return this;
        }

        public Builder setBoolValue(boolean z10) {
            copyOnWrite();
            ((Value) this.instance).q1(z10);
            return this;
        }

        public Builder setListValue(ListValue listValue) {
            copyOnWrite();
            ((Value) this.instance).s1(listValue);
            return this;
        }

        public Builder setNullValue(NullValue nullValue) {
            copyOnWrite();
            ((Value) this.instance).t1(nullValue);
            return this;
        }

        public Builder setNullValueValue(int i10) {
            copyOnWrite();
            ((Value) this.instance).u1(i10);
            return this;
        }

        public Builder setNumberValue(double d10) {
            copyOnWrite();
            ((Value) this.instance).v1(d10);
            return this;
        }

        public Builder setStringValue(String str) {
            copyOnWrite();
            ((Value) this.instance).w1(str);
            return this;
        }

        public Builder setStringValueBytes(ByteString byteString) {
            copyOnWrite();
            ((Value) this.instance).x1(byteString);
            return this;
        }

        public Builder setStructValue(Struct struct) {
            copyOnWrite();
            ((Value) this.instance).z1(struct);
            return this;
        }

        private Builder() {
            super(Value.DEFAULT_INSTANCE);
        }

        public Builder setListValue(ListValue.Builder builder) {
            copyOnWrite();
            ((Value) this.instance).r1(builder);
            return this;
        }

        public Builder setStructValue(Struct.Builder builder) {
            copyOnWrite();
            ((Value) this.instance).y1(builder);
            return this;
        }
    }

    public enum KindCase {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);

        private final int value;

        KindCase(int i10) {
            this.value = i10;
        }

        public static KindCase forNumber(int i10) {
            switch (i10) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static KindCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112737a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112737a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112737a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112737a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112737a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112737a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112737a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112737a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        GeneratedMessageLite.v0(Value.class, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    public static Value Y0() {
        return DEFAULT_INSTANCE;
    }

    public static Builder b1() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder c1(Value value) {
        return DEFAULT_INSTANCE.y(value);
    }

    public static Value d1(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static Value e1(InputStream inputStream, H h10) throws IOException {
        return (Value) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Value f1(ByteString byteString) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static Value g1(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static Value h1(AbstractC2549t abstractC2549t) throws IOException {
        return (Value) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static Value i1(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (Value) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static Value j1(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static Value k1(InputStream inputStream, H h10) throws IOException {
        return (Value) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Value l1(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Value m1(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static Value n1(byte[] bArr) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static Value o1(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<Value> p1() {
        return DEFAULT_INSTANCE.k();
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112737a[methodToInvoke.ordinal()]) {
            case 1:
                return new Value();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<Value> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (Value.class) {
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

    public final void R0() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final void T0() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final void U0() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final void V0() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final void W0() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final void X0() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public final void Z0(ListValue listValue) {
        listValue.getClass();
        if (this.kindCase_ != 6 || this.kind_ == ListValue.O0()) {
            this.kind_ = listValue;
        } else {
            this.kind_ = ListValue.S0((ListValue) this.kind_).mergeFrom(listValue).buildPartial();
        }
        this.kindCase_ = 6;
    }

    public final void a1(Struct struct) {
        struct.getClass();
        if (this.kindCase_ != 5 || this.kind_ == Struct.z0()) {
            this.kind_ = struct;
        } else {
            this.kind_ = Struct.E0((Struct) this.kind_).mergeFrom(struct).buildPartial();
        }
        this.kindCase_ = 5;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public KindCase getKindCase() {
        return KindCase.forNumber(this.kindCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public ListValue getListValue() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.O0();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public NullValue getNullValue() {
        if (this.kindCase_ != 1) {
            return NullValue.NULL_VALUE;
        }
        NullValue nullValueForNumber = NullValue.forNumber(((Integer) this.kind_).intValue());
        return nullValueForNumber == null ? NullValue.UNRECOGNIZED : nullValueForNumber;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public String getStringValue() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public ByteString getStringValueBytes() {
        return ByteString.z(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public Struct getStructValue() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.z0();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    public final void q1(boolean z10) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z10);
    }

    public final void r1(ListValue.Builder builder) {
        this.kind_ = builder.build();
        this.kindCase_ = 6;
    }

    public final void s1(ListValue listValue) {
        listValue.getClass();
        this.kind_ = listValue;
        this.kindCase_ = 6;
    }

    public final void t1(NullValue nullValue) {
        nullValue.getClass();
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(nullValue.getNumber());
    }

    public final void u1(int i10) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(i10);
    }

    public final void v1(double d10) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(d10);
    }

    public final void w1(String str) {
        str.getClass();
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    public final void x1(ByteString byteString) {
        byteString.getClass();
        AbstractMessageLite.n(byteString);
        this.kindCase_ = 3;
        this.kind_ = byteString.c0(V.f112719a);
    }

    public final void y1(Struct.Builder builder) {
        this.kind_ = builder.build();
        this.kindCase_ = 5;
    }

    public final void z1(Struct struct) {
        struct.getClass();
        this.kind_ = struct;
        this.kindCase_ = 5;
    }
}

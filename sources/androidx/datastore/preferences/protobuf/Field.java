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
public final class Field extends GeneratedMessageLite<Field, Builder> implements N {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile InterfaceC2560y0<Field> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private V.k<Option> options_ = B0.g();
    private String jsonName_ = "";
    private String defaultValue_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Field, Builder> implements N {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            ((Field) this.instance).f1(iterable);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            ((Field) this.instance).j1(option);
            return this;
        }

        public Builder clearCardinality() {
            copyOnWrite();
            Field.b1((Field) this.instance);
            return this;
        }

        public Builder clearDefaultValue() {
            copyOnWrite();
            ((Field) this.instance).l1();
            return this;
        }

        public Builder clearJsonName() {
            copyOnWrite();
            ((Field) this.instance).m1();
            return this;
        }

        public Builder clearKind() {
            copyOnWrite();
            Field.U0((Field) this.instance);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Field) this.instance).o1();
            return this;
        }

        public Builder clearNumber() {
            copyOnWrite();
            Field.d1((Field) this.instance);
            return this;
        }

        public Builder clearOneofIndex() {
            copyOnWrite();
            Field.F0((Field) this.instance);
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((Field) this.instance).r1();
            return this;
        }

        public Builder clearPacked() {
            copyOnWrite();
            Field.H0((Field) this.instance);
            return this;
        }

        public Builder clearTypeUrl() {
            copyOnWrite();
            ((Field) this.instance).t1();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public Cardinality getCardinality() {
            return ((Field) this.instance).getCardinality();
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public int getCardinalityValue() {
            return ((Field) this.instance).getCardinalityValue();
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public String getDefaultValue() {
            return ((Field) this.instance).getDefaultValue();
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public ByteString getDefaultValueBytes() {
            return ((Field) this.instance).getDefaultValueBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public String getJsonName() {
            return ((Field) this.instance).getJsonName();
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public ByteString getJsonNameBytes() {
            return ((Field) this.instance).getJsonNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public Kind getKind() {
            return ((Field) this.instance).getKind();
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public int getKindValue() {
            return ((Field) this.instance).getKindValue();
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public String getName() {
            return ((Field) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public ByteString getNameBytes() {
            return ((Field) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public int getNumber() {
            return ((Field) this.instance).getNumber();
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public int getOneofIndex() {
            return ((Field) this.instance).getOneofIndex();
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public Option getOptions(int i10) {
            return ((Field) this.instance).getOptions(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public int getOptionsCount() {
            return ((Field) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Field) this.instance).getOptionsList());
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public boolean getPacked() {
            return ((Field) this.instance).getPacked();
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public String getTypeUrl() {
            return ((Field) this.instance).getTypeUrl();
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public ByteString getTypeUrlBytes() {
            return ((Field) this.instance).getTypeUrlBytes();
        }

        public Builder removeOptions(int i10) {
            copyOnWrite();
            ((Field) this.instance).N1(i10);
            return this;
        }

        public Builder setCardinality(Cardinality cardinality) {
            copyOnWrite();
            ((Field) this.instance).O1(cardinality);
            return this;
        }

        public Builder setCardinalityValue(int i10) {
            copyOnWrite();
            Field.Z0((Field) this.instance, i10);
            return this;
        }

        public Builder setDefaultValue(String str) {
            copyOnWrite();
            ((Field) this.instance).Q1(str);
            return this;
        }

        public Builder setDefaultValueBytes(ByteString byteString) {
            copyOnWrite();
            ((Field) this.instance).R1(byteString);
            return this;
        }

        public Builder setJsonName(String str) {
            copyOnWrite();
            ((Field) this.instance).S1(str);
            return this;
        }

        public Builder setJsonNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Field) this.instance).T1(byteString);
            return this;
        }

        public Builder setKind(Kind kind) {
            copyOnWrite();
            ((Field) this.instance).U1(kind);
            return this;
        }

        public Builder setKindValue(int i10) {
            copyOnWrite();
            Field.y0((Field) this.instance, i10);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Field) this.instance).W1(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Field) this.instance).X1(byteString);
            return this;
        }

        public Builder setNumber(int i10) {
            copyOnWrite();
            Field.c1((Field) this.instance, i10);
            return this;
        }

        public Builder setOneofIndex(int i10) {
            copyOnWrite();
            Field.E0((Field) this.instance, i10);
            return this;
        }

        public Builder setOptions(int i10, Option option) {
            copyOnWrite();
            ((Field) this.instance).b2(i10, option);
            return this;
        }

        public Builder setPacked(boolean z10) {
            copyOnWrite();
            Field.G0((Field) this.instance, z10);
            return this;
        }

        public Builder setTypeUrl(String str) {
            copyOnWrite();
            ((Field) this.instance).d2(str);
            return this;
        }

        public Builder setTypeUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Field) this.instance).e2(byteString);
            return this;
        }

        private Builder() {
            super(Field.DEFAULT_INSTANCE);
        }

        public Builder addOptions(int i10, Option option) {
            copyOnWrite();
            ((Field) this.instance).h1(i10, option);
            return this;
        }

        public Builder setOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            ((Field) this.instance).a2(i10, builder);
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            ((Field) this.instance).i1(builder);
            return this;
        }

        public Builder addOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            ((Field) this.instance).g1(i10, builder);
            return this;
        }
    }

    public enum Cardinality implements V.c {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);

        public static final int CARDINALITY_OPTIONAL_VALUE = 1;
        public static final int CARDINALITY_REPEATED_VALUE = 3;
        public static final int CARDINALITY_REQUIRED_VALUE = 2;
        public static final int CARDINALITY_UNKNOWN_VALUE = 0;
        private static final V.d<Cardinality> internalValueMap = new a();
        private final int value;

        public static class a implements V.d<Cardinality> {
            @Override // androidx.datastore.preferences.protobuf.V.d
            public V.c a(int i10) {
                return Cardinality.forNumber(i10);
            }

            public Cardinality b(int i10) {
                return Cardinality.forNumber(i10);
            }
        }

        public static final class b implements V.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final V.e f112570a = new b();

            @Override // androidx.datastore.preferences.protobuf.V.e
            public boolean a(int i10) {
                return Cardinality.forNumber(i10) != null;
            }
        }

        Cardinality(int i10) {
            this.value = i10;
        }

        public static Cardinality forNumber(int i10) {
            if (i10 == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (i10 == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (i10 == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (i10 != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        public static V.d<Cardinality> internalGetValueMap() {
            return internalValueMap;
        }

        public static V.e internalGetVerifier() {
            return b.f112570a;
        }

        @Override // androidx.datastore.preferences.protobuf.V.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Cardinality valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public enum Kind implements V.c {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);

        public static final int TYPE_BOOL_VALUE = 8;
        public static final int TYPE_BYTES_VALUE = 12;
        public static final int TYPE_DOUBLE_VALUE = 1;
        public static final int TYPE_ENUM_VALUE = 14;
        public static final int TYPE_FIXED32_VALUE = 7;
        public static final int TYPE_FIXED64_VALUE = 6;
        public static final int TYPE_FLOAT_VALUE = 2;
        public static final int TYPE_GROUP_VALUE = 10;
        public static final int TYPE_INT32_VALUE = 5;
        public static final int TYPE_INT64_VALUE = 3;
        public static final int TYPE_MESSAGE_VALUE = 11;
        public static final int TYPE_SFIXED32_VALUE = 15;
        public static final int TYPE_SFIXED64_VALUE = 16;
        public static final int TYPE_SINT32_VALUE = 17;
        public static final int TYPE_SINT64_VALUE = 18;
        public static final int TYPE_STRING_VALUE = 9;
        public static final int TYPE_UINT32_VALUE = 13;
        public static final int TYPE_UINT64_VALUE = 4;
        public static final int TYPE_UNKNOWN_VALUE = 0;
        private static final V.d<Kind> internalValueMap = new a();
        private final int value;

        public static class a implements V.d<Kind> {
            @Override // androidx.datastore.preferences.protobuf.V.d
            public V.c a(int i10) {
                return Kind.forNumber(i10);
            }

            public Kind b(int i10) {
                return Kind.forNumber(i10);
            }
        }

        public static final class b implements V.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final V.e f112571a = new b();

            @Override // androidx.datastore.preferences.protobuf.V.e
            public boolean a(int i10) {
                return Kind.forNumber(i10) != null;
            }
        }

        Kind(int i10) {
            this.value = i10;
        }

        public static Kind forNumber(int i10) {
            switch (i10) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        public static V.d<Kind> internalGetValueMap() {
            return internalValueMap;
        }

        public static V.e internalGetVerifier() {
            return b.f112571a;
        }

        @Override // androidx.datastore.preferences.protobuf.V.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Kind valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112572a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112572a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112572a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112572a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112572a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112572a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112572a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112572a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        GeneratedMessageLite.v0(Field.class, field);
    }

    public static Field A1(InputStream inputStream) throws IOException {
        return (Field) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static Field B1(InputStream inputStream, H h10) throws IOException {
        return (Field) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Field C1(ByteString byteString) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static Field D1(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static void E0(Field field, int i10) {
        field.oneofIndex_ = i10;
    }

    public static Field E1(AbstractC2549t abstractC2549t) throws IOException {
        return (Field) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static void F0(Field field) {
        field.oneofIndex_ = 0;
    }

    public static Field F1(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (Field) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static void G0(Field field, boolean z10) {
        field.packed_ = z10;
    }

    public static Field G1(InputStream inputStream) throws IOException {
        return (Field) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static void H0(Field field) {
        field.packed_ = false;
    }

    public static Field H1(InputStream inputStream, H h10) throws IOException {
        return (Field) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Field I1(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Field J1(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static Field K1(byte[] bArr) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static Field L1(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (Field) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<Field> M1() {
        return DEFAULT_INSTANCE.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N1(int i10) {
        u1();
        this.options_.remove(i10);
    }

    public static void U0(Field field) {
        field.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W1(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X1(ByteString byteString) {
        byteString.getClass();
        AbstractMessageLite.n(byteString);
        this.name_ = byteString.c0(V.f112719a);
    }

    private void Y1(int i10) {
        this.number_ = i10;
    }

    public static void Z0(Field field, int i10) {
        field.cardinality_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a2(int i10, Option.Builder builder) {
        u1();
        this.options_.set(i10, builder.build());
    }

    public static void b1(Field field) {
        field.cardinality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b2(int i10, Option option) {
        option.getClass();
        u1();
        this.options_.set(i10, option);
    }

    public static void c1(Field field, int i10) {
        field.number_ = i10;
    }

    public static void d1(Field field) {
        field.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d2(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e2(ByteString byteString) {
        byteString.getClass();
        AbstractMessageLite.n(byteString);
        this.typeUrl_ = byteString.c0(V.f112719a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1(Iterable<? extends Option> iterable) {
        u1();
        AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1(int i10, Option.Builder builder) {
        u1();
        this.options_.add(i10, builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h1(int i10, Option option) {
        option.getClass();
        u1();
        this.options_.add(i10, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i1(Option.Builder builder) {
        u1();
        this.options_.add(builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1(Option option) {
        option.getClass();
        u1();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o1() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    private void p1() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r1() {
        this.options_ = B0.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t1() {
        this.typeUrl_ = DEFAULT_INSTANCE.typeUrl_;
    }

    private void u1() {
        if (this.options_.k3()) {
            return;
        }
        this.options_ = GeneratedMessageLite.X(this.options_);
    }

    public static Field v1() {
        return DEFAULT_INSTANCE;
    }

    public static void y0(Field field, int i10) {
        field.kind_ = i10;
    }

    public static Builder y1() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder z1(Field field) {
        return DEFAULT_INSTANCE.y(field);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112572a[methodToInvoke.ordinal()]) {
            case 1:
                return new Field();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<Field> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (Field.class) {
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

    public final void O1(Cardinality cardinality) {
        cardinality.getClass();
        this.cardinality_ = cardinality.getNumber();
    }

    public final void P1(int i10) {
        this.cardinality_ = i10;
    }

    public final void Q1(String str) {
        str.getClass();
        this.defaultValue_ = str;
    }

    public final void R1(ByteString byteString) {
        byteString.getClass();
        AbstractMessageLite.n(byteString);
        this.defaultValue_ = byteString.c0(V.f112719a);
    }

    public final void S1(String str) {
        str.getClass();
        this.jsonName_ = str;
    }

    public final void T1(ByteString byteString) {
        byteString.getClass();
        AbstractMessageLite.n(byteString);
        this.jsonName_ = byteString.c0(V.f112719a);
    }

    public final void U1(Kind kind) {
        kind.getClass();
        this.kind_ = kind.getNumber();
    }

    public final void V1(int i10) {
        this.kind_ = i10;
    }

    public final void Z1(int i10) {
        this.oneofIndex_ = i10;
    }

    public final void c2(boolean z10) {
        this.packed_ = z10;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public Cardinality getCardinality() {
        Cardinality cardinalityForNumber = Cardinality.forNumber(this.cardinality_);
        return cardinalityForNumber == null ? Cardinality.UNRECOGNIZED : cardinalityForNumber;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public int getCardinalityValue() {
        return this.cardinality_;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public ByteString getDefaultValueBytes() {
        return ByteString.z(this.defaultValue_);
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public String getJsonName() {
        return this.jsonName_;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public ByteString getJsonNameBytes() {
        return ByteString.z(this.jsonName_);
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public Kind getKind() {
        Kind kindForNumber = Kind.forNumber(this.kind_);
        return kindForNumber == null ? Kind.UNRECOGNIZED : kindForNumber;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public int getKindValue() {
        return this.kind_;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public ByteString getNameBytes() {
        return ByteString.z(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public int getNumber() {
        return this.number_;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public Option getOptions(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public boolean getPacked() {
        return this.packed_;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public ByteString getTypeUrlBytes() {
        return ByteString.z(this.typeUrl_);
    }

    public final void k1() {
        this.cardinality_ = 0;
    }

    public final void l1() {
        this.defaultValue_ = DEFAULT_INSTANCE.defaultValue_;
    }

    public final void m1() {
        this.jsonName_ = DEFAULT_INSTANCE.jsonName_;
    }

    public final void n1() {
        this.kind_ = 0;
    }

    public final void q1() {
        this.oneofIndex_ = 0;
    }

    public final void s1() {
        this.packed_ = false;
    }

    public InterfaceC2558x0 w1(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends InterfaceC2558x0> x1() {
        return this.options_;
    }
}

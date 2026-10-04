package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class Struct extends GeneratedMessageLite<Struct, Builder> implements N0 {
    private static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile InterfaceC2560y0<Struct> PARSER;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.i();

    public static final class Builder extends GeneratedMessageLite.Builder<Struct, Builder> implements N0 {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder clearFields() {
            copyOnWrite();
            ((MapFieldLite) Struct.y0((Struct) this.instance)).clear();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.N0
        public boolean containsFields(String str) {
            str.getClass();
            return ((Struct) this.instance).getFieldsMap().containsKey(str);
        }

        @Override // androidx.datastore.preferences.protobuf.N0
        @Deprecated
        public Map<String, Value> getFields() {
            return getFieldsMap();
        }

        @Override // androidx.datastore.preferences.protobuf.N0
        public int getFieldsCount() {
            return ((Struct) this.instance).getFieldsMap().size();
        }

        @Override // androidx.datastore.preferences.protobuf.N0
        public Map<String, Value> getFieldsMap() {
            return Collections.unmodifiableMap(((Struct) this.instance).getFieldsMap());
        }

        @Override // androidx.datastore.preferences.protobuf.N0
        public Value getFieldsOrDefault(String str, Value value) {
            str.getClass();
            Map<String, Value> fieldsMap = ((Struct) this.instance).getFieldsMap();
            return fieldsMap.containsKey(str) ? fieldsMap.get(str) : value;
        }

        @Override // androidx.datastore.preferences.protobuf.N0
        public Value getFieldsOrThrow(String str) {
            str.getClass();
            Map<String, Value> fieldsMap = ((Struct) this.instance).getFieldsMap();
            if (fieldsMap.containsKey(str)) {
                return fieldsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllFields(Map<String, Value> map) {
            copyOnWrite();
            ((MapFieldLite) Struct.y0((Struct) this.instance)).putAll(map);
            return this;
        }

        public Builder putFields(String str, Value value) {
            str.getClass();
            value.getClass();
            copyOnWrite();
            ((MapFieldLite) Struct.y0((Struct) this.instance)).put(str, value);
            return this;
        }

        public Builder removeFields(String str) {
            str.getClass();
            copyOnWrite();
            ((MapFieldLite) Struct.y0((Struct) this.instance)).remove(str);
            return this;
        }

        private Builder() {
            super(Struct.DEFAULT_INSTANCE);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112697a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112697a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112697a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112697a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112697a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112697a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112697a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112697a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2523f0<String, Value> f112698a = new C2523f0<>(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Value.Y0());
    }

    static {
        Struct struct = new Struct();
        DEFAULT_INSTANCE = struct;
        GeneratedMessageLite.v0(Struct.class, struct);
    }

    public static Builder D0() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder E0(Struct struct) {
        return DEFAULT_INSTANCE.y(struct);
    }

    public static Struct F0(InputStream inputStream) throws IOException {
        return (Struct) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct G0(InputStream inputStream, H h10) throws IOException {
        return (Struct) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Struct H0(ByteString byteString) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static Struct I0(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static Struct J0(AbstractC2549t abstractC2549t) throws IOException {
        return (Struct) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static Struct K0(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (Struct) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static Struct L0(InputStream inputStream) throws IOException {
        return (Struct) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct M0(InputStream inputStream, H h10) throws IOException {
        return (Struct) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Struct N0(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Struct O0(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static Struct P0(byte[] bArr) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static Struct Q0(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (Struct) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<Struct> R0() {
        return DEFAULT_INSTANCE.k();
    }

    public static Map y0(Struct struct) {
        return struct.C0();
    }

    public static Struct z0() {
        return DEFAULT_INSTANCE;
    }

    public final Map<String, Value> A0() {
        return C0();
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112697a[methodToInvoke.ordinal()]) {
            case 1:
                return new Struct();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", b.f112698a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<Struct> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (Struct.class) {
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

    public final MapFieldLite<String, Value> B0() {
        return this.fields_;
    }

    public final MapFieldLite<String, Value> C0() {
        MapFieldLite<String, Value> mapFieldLite = this.fields_;
        if (!mapFieldLite.f112662a) {
            this.fields_ = mapFieldLite.t();
        }
        return this.fields_;
    }

    @Override // androidx.datastore.preferences.protobuf.N0
    public boolean containsFields(String str) {
        str.getClass();
        return this.fields_.containsKey(str);
    }

    @Override // androidx.datastore.preferences.protobuf.N0
    @Deprecated
    public Map<String, Value> getFields() {
        return Collections.unmodifiableMap(this.fields_);
    }

    @Override // androidx.datastore.preferences.protobuf.N0
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.N0
    public Map<String, Value> getFieldsMap() {
        return Collections.unmodifiableMap(this.fields_);
    }

    @Override // androidx.datastore.preferences.protobuf.N0
    public Value getFieldsOrDefault(String str, Value value) {
        str.getClass();
        MapFieldLite<String, Value> mapFieldLite = this.fields_;
        return mapFieldLite.containsKey(str) ? mapFieldLite.get(str) : value;
    }

    @Override // androidx.datastore.preferences.protobuf.N0
    public Value getFieldsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Value> mapFieldLite = this.fields_;
        if (mapFieldLite.containsKey(str)) {
            return mapFieldLite.get(str);
        }
        throw new IllegalArgumentException();
    }
}

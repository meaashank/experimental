package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractC2549t;
import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.B0;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.C2523f0;
import androidx.datastore.preferences.protobuf.E0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.InterfaceC2535l0;
import androidx.datastore.preferences.protobuf.InterfaceC2560y0;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class PreferencesProto {

    public static final class PreferenceMap extends GeneratedMessageLite<PreferenceMap, Builder> implements b {
        private static final PreferenceMap DEFAULT_INSTANCE;
        private static volatile InterfaceC2560y0<PreferenceMap> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private MapFieldLite<String, Value> preferences_ = MapFieldLite.i();

        public static final class Builder extends GeneratedMessageLite.Builder<PreferenceMap, Builder> implements b {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearPreferences() {
                copyOnWrite();
                ((MapFieldLite) PreferenceMap.y0((PreferenceMap) this.instance)).clear();
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.b
            public boolean containsPreferences(String str) {
                str.getClass();
                return ((PreferenceMap) this.instance).getPreferencesMap().containsKey(str);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.b
            @Deprecated
            public Map<String, Value> getPreferences() {
                return getPreferencesMap();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.b
            public int getPreferencesCount() {
                return ((PreferenceMap) this.instance).getPreferencesMap().size();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.b
            public Map<String, Value> getPreferencesMap() {
                return Collections.unmodifiableMap(((PreferenceMap) this.instance).getPreferencesMap());
            }

            @Override // androidx.datastore.preferences.PreferencesProto.b
            public Value getPreferencesOrDefault(String str, Value value) {
                str.getClass();
                Map<String, Value> preferencesMap = ((PreferenceMap) this.instance).getPreferencesMap();
                return preferencesMap.containsKey(str) ? preferencesMap.get(str) : value;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.b
            public Value getPreferencesOrThrow(String str) {
                str.getClass();
                Map<String, Value> preferencesMap = ((PreferenceMap) this.instance).getPreferencesMap();
                if (preferencesMap.containsKey(str)) {
                    return preferencesMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public Builder putAllPreferences(Map<String, Value> map) {
                copyOnWrite();
                ((MapFieldLite) PreferenceMap.y0((PreferenceMap) this.instance)).putAll(map);
                return this;
            }

            public Builder putPreferences(String str, Value value) {
                str.getClass();
                value.getClass();
                copyOnWrite();
                ((MapFieldLite) PreferenceMap.y0((PreferenceMap) this.instance)).put(str, value);
                return this;
            }

            public Builder removePreferences(String str) {
                str.getClass();
                copyOnWrite();
                ((MapFieldLite) PreferenceMap.y0((PreferenceMap) this.instance)).remove(str);
                return this;
            }

            private Builder() {
                super(PreferenceMap.DEFAULT_INSTANCE);
            }
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2523f0<String, Value> f112469a = new C2523f0<>(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Value.Y0());
        }

        static {
            PreferenceMap preferenceMap = new PreferenceMap();
            DEFAULT_INSTANCE = preferenceMap;
            GeneratedMessageLite.v0(PreferenceMap.class, preferenceMap);
        }

        public static Builder D0() {
            return DEFAULT_INSTANCE.x();
        }

        public static Builder E0(PreferenceMap preferenceMap) {
            return DEFAULT_INSTANCE.y(preferenceMap);
        }

        public static PreferenceMap F0(InputStream inputStream) throws IOException {
            return (PreferenceMap) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
        }

        public static PreferenceMap G0(InputStream inputStream, H h10) throws IOException {
            return (PreferenceMap) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
        }

        public static PreferenceMap H0(ByteString byteString) throws InvalidProtocolBufferException {
            return (PreferenceMap) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
        }

        public static PreferenceMap I0(ByteString byteString, H h10) throws InvalidProtocolBufferException {
            return (PreferenceMap) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
        }

        public static PreferenceMap J0(AbstractC2549t abstractC2549t) throws IOException {
            return (PreferenceMap) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
        }

        public static PreferenceMap K0(AbstractC2549t abstractC2549t, H h10) throws IOException {
            return (PreferenceMap) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
        }

        public static PreferenceMap L0(InputStream inputStream) throws IOException {
            return (PreferenceMap) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
        }

        public static PreferenceMap M0(InputStream inputStream, H h10) throws IOException {
            return (PreferenceMap) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
        }

        public static PreferenceMap N0(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PreferenceMap) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static PreferenceMap O0(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
            return (PreferenceMap) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
        }

        public static PreferenceMap P0(byte[] bArr) throws InvalidProtocolBufferException {
            return (PreferenceMap) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
        }

        public static PreferenceMap Q0(byte[] bArr, H h10) throws InvalidProtocolBufferException {
            return (PreferenceMap) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
        }

        public static InterfaceC2560y0<PreferenceMap> R0() {
            return DEFAULT_INSTANCE.k();
        }

        public static Map y0(PreferenceMap preferenceMap) {
            return preferenceMap.B0();
        }

        public static PreferenceMap z0() {
            return DEFAULT_INSTANCE;
        }

        public final Map<String, Value> A0() {
            return B0();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            InterfaceC2560y0 bVar;
            a aVar = null;
            switch (a.f112470a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PreferenceMap();
                case 2:
                    return new Builder(aVar);
                case 3:
                    return new E0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", a.f112469a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC2560y0<PreferenceMap> interfaceC2560y0 = PARSER;
                    if (interfaceC2560y0 != null) {
                        return interfaceC2560y0;
                    }
                    synchronized (PreferenceMap.class) {
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
            MapFieldLite<String, Value> mapFieldLite = this.preferences_;
            if (!mapFieldLite.f112662a) {
                this.preferences_ = mapFieldLite.t();
            }
            return this.preferences_;
        }

        public final MapFieldLite<String, Value> C0() {
            return this.preferences_;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.b
        public boolean containsPreferences(String str) {
            str.getClass();
            return this.preferences_.containsKey(str);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.b
        @Deprecated
        public Map<String, Value> getPreferences() {
            return Collections.unmodifiableMap(this.preferences_);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.b
        public int getPreferencesCount() {
            return this.preferences_.size();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.b
        public Map<String, Value> getPreferencesMap() {
            return Collections.unmodifiableMap(this.preferences_);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.b
        public Value getPreferencesOrDefault(String str, Value value) {
            str.getClass();
            MapFieldLite<String, Value> mapFieldLite = this.preferences_;
            return mapFieldLite.containsKey(str) ? mapFieldLite.get(str) : value;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.b
        public Value getPreferencesOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, Value> mapFieldLite = this.preferences_;
            if (mapFieldLite.containsKey(str)) {
                return mapFieldLite.get(str);
            }
            throw new IllegalArgumentException();
        }
    }

    public static final class StringSet extends GeneratedMessageLite<StringSet, Builder> implements c {
        private static final StringSet DEFAULT_INSTANCE;
        private static volatile InterfaceC2560y0<StringSet> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private V.k<String> strings_ = B0.g();

        public static final class Builder extends GeneratedMessageLite.Builder<StringSet, Builder> implements c {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder addAllStrings(Iterable<String> iterable) {
                copyOnWrite();
                ((StringSet) this.instance).D0(iterable);
                return this;
            }

            public Builder addStrings(String str) {
                copyOnWrite();
                ((StringSet) this.instance).E0(str);
                return this;
            }

            public Builder addStringsBytes(ByteString byteString) {
                copyOnWrite();
                ((StringSet) this.instance).F0(byteString);
                return this;
            }

            public Builder clearStrings() {
                copyOnWrite();
                ((StringSet) this.instance).G0();
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.c
            public String getStrings(int i10) {
                return ((StringSet) this.instance).getStrings(i10);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.c
            public ByteString getStringsBytes(int i10) {
                return ((StringSet) this.instance).getStringsBytes(i10);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.c
            public int getStringsCount() {
                return ((StringSet) this.instance).getStringsCount();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.c
            public List<String> getStringsList() {
                return Collections.unmodifiableList(((StringSet) this.instance).getStringsList());
            }

            public Builder setStrings(int i10, String str) {
                copyOnWrite();
                ((StringSet) this.instance).Y0(i10, str);
                return this;
            }

            private Builder() {
                super(StringSet.DEFAULT_INSTANCE);
            }
        }

        static {
            StringSet stringSet = new StringSet();
            DEFAULT_INSTANCE = stringSet;
            GeneratedMessageLite.v0(StringSet.class, stringSet);
        }

        public static StringSet I0() {
            return DEFAULT_INSTANCE;
        }

        public static Builder J0() {
            return DEFAULT_INSTANCE.x();
        }

        public static Builder K0(StringSet stringSet) {
            return DEFAULT_INSTANCE.y(stringSet);
        }

        public static StringSet L0(InputStream inputStream) throws IOException {
            return (StringSet) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
        }

        public static StringSet M0(InputStream inputStream, H h10) throws IOException {
            return (StringSet) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
        }

        public static StringSet N0(ByteString byteString) throws InvalidProtocolBufferException {
            return (StringSet) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
        }

        public static StringSet O0(ByteString byteString, H h10) throws InvalidProtocolBufferException {
            return (StringSet) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
        }

        public static StringSet P0(AbstractC2549t abstractC2549t) throws IOException {
            return (StringSet) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
        }

        public static StringSet Q0(AbstractC2549t abstractC2549t, H h10) throws IOException {
            return (StringSet) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
        }

        public static StringSet R0(InputStream inputStream) throws IOException {
            return (StringSet) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
        }

        public static StringSet S0(InputStream inputStream, H h10) throws IOException {
            return (StringSet) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
        }

        public static StringSet T0(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StringSet) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static StringSet U0(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
            return (StringSet) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
        }

        public static StringSet V0(byte[] bArr) throws InvalidProtocolBufferException {
            return (StringSet) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
        }

        public static StringSet W0(byte[] bArr, H h10) throws InvalidProtocolBufferException {
            return (StringSet) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
        }

        public static InterfaceC2560y0<StringSet> X0() {
            return DEFAULT_INSTANCE.k();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            InterfaceC2560y0 bVar;
            a aVar = null;
            switch (a.f112470a[methodToInvoke.ordinal()]) {
                case 1:
                    return new StringSet();
                case 2:
                    return new Builder(aVar);
                case 3:
                    return new E0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC2560y0<StringSet> interfaceC2560y0 = PARSER;
                    if (interfaceC2560y0 != null) {
                        return interfaceC2560y0;
                    }
                    synchronized (StringSet.class) {
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

        public final void D0(Iterable<String> iterable) {
            H0();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.strings_);
        }

        public final void E0(String str) {
            str.getClass();
            H0();
            this.strings_.add(str);
        }

        public final void F0(ByteString byteString) {
            byteString.getClass();
            H0();
            this.strings_.add(byteString.c0(V.f112719a));
        }

        public final void G0() {
            this.strings_ = B0.g();
        }

        public final void H0() {
            if (this.strings_.k3()) {
                return;
            }
            this.strings_ = GeneratedMessageLite.X(this.strings_);
        }

        public final void Y0(int i10, String str) {
            str.getClass();
            H0();
            this.strings_.set(i10, str);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.c
        public String getStrings(int i10) {
            return this.strings_.get(i10);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.c
        public ByteString getStringsBytes(int i10) {
            return ByteString.z(this.strings_.get(i10));
        }

        @Override // androidx.datastore.preferences.PreferencesProto.c
        public int getStringsCount() {
            return this.strings_.size();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.c
        public List<String> getStringsList() {
            return this.strings_;
        }
    }

    public static final class Value extends GeneratedMessageLite<Value, Builder> implements d {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        private static final Value DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile InterfaceC2560y0<Value> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int bitField0_;
        private int valueCase_ = 0;
        private Object value_;

        public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements d {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearBoolean() {
                copyOnWrite();
                ((Value) this.instance).Q0();
                return this;
            }

            public Builder clearDouble() {
                copyOnWrite();
                ((Value) this.instance).R0();
                return this;
            }

            public Builder clearFloat() {
                copyOnWrite();
                ((Value) this.instance).S0();
                return this;
            }

            public Builder clearInteger() {
                copyOnWrite();
                ((Value) this.instance).T0();
                return this;
            }

            public Builder clearLong() {
                copyOnWrite();
                ((Value) this.instance).U0();
                return this;
            }

            public Builder clearString() {
                copyOnWrite();
                ((Value) this.instance).V0();
                return this;
            }

            public Builder clearStringSet() {
                copyOnWrite();
                ((Value) this.instance).W0();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((Value) this.instance).X0();
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.d
            public boolean getBoolean() {
                return ((Value) this.instance).getBoolean();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.d
            public double getDouble() {
                return ((Value) this.instance).getDouble();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.d
            public float getFloat() {
                return ((Value) this.instance).getFloat();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.d
            public int getInteger() {
                return ((Value) this.instance).getInteger();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.d
            public long getLong() {
                return ((Value) this.instance).getLong();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.d
            public String getString() {
                return ((Value) this.instance).getString();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.d
            public ByteString getStringBytes() {
                return ((Value) this.instance).getStringBytes();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.d
            public StringSet getStringSet() {
                return ((Value) this.instance).getStringSet();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.d
            public ValueCase getValueCase() {
                return ((Value) this.instance).getValueCase();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.d
            public boolean hasBoolean() {
                return ((Value) this.instance).hasBoolean();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.d
            public boolean hasDouble() {
                return ((Value) this.instance).hasDouble();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.d
            public boolean hasFloat() {
                return ((Value) this.instance).hasFloat();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.d
            public boolean hasInteger() {
                return ((Value) this.instance).hasInteger();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.d
            public boolean hasLong() {
                return ((Value) this.instance).hasLong();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.d
            public boolean hasString() {
                return ((Value) this.instance).hasString();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.d
            public boolean hasStringSet() {
                return ((Value) this.instance).hasStringSet();
            }

            public Builder mergeStringSet(StringSet stringSet) {
                copyOnWrite();
                ((Value) this.instance).Z0(stringSet);
                return this;
            }

            public Builder setBoolean(boolean z10) {
                copyOnWrite();
                ((Value) this.instance).p1(z10);
                return this;
            }

            public Builder setDouble(double d10) {
                copyOnWrite();
                ((Value) this.instance).q1(d10);
                return this;
            }

            public Builder setFloat(float f10) {
                copyOnWrite();
                ((Value) this.instance).r1(f10);
                return this;
            }

            public Builder setInteger(int i10) {
                copyOnWrite();
                ((Value) this.instance).s1(i10);
                return this;
            }

            public Builder setLong(long j10) {
                copyOnWrite();
                ((Value) this.instance).t1(j10);
                return this;
            }

            public Builder setString(String str) {
                copyOnWrite();
                ((Value) this.instance).u1(str);
                return this;
            }

            public Builder setStringBytes(ByteString byteString) {
                copyOnWrite();
                ((Value) this.instance).v1(byteString);
                return this;
            }

            public Builder setStringSet(StringSet stringSet) {
                copyOnWrite();
                ((Value) this.instance).x1(stringSet);
                return this;
            }

            private Builder() {
                super(Value.DEFAULT_INSTANCE);
            }

            public Builder setStringSet(StringSet.Builder builder) {
                copyOnWrite();
                ((Value) this.instance).w1(builder);
                return this;
            }
        }

        public enum ValueCase {
            BOOLEAN(1),
            FLOAT(2),
            INTEGER(3),
            LONG(4),
            STRING(5),
            STRING_SET(6),
            DOUBLE(7),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i10) {
                this.value = i10;
            }

            public static ValueCase forNumber(int i10) {
                switch (i10) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return BOOLEAN;
                    case 2:
                        return FLOAT;
                    case 3:
                        return INTEGER;
                    case 4:
                        return LONG;
                    case 5:
                        return STRING;
                    case 6:
                        return STRING_SET;
                    case 7:
                        return DOUBLE;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ValueCase valueOf(int i10) {
                return forNumber(i10);
            }
        }

        static {
            Value value = new Value();
            DEFAULT_INSTANCE = value;
            GeneratedMessageLite.v0(Value.class, value);
        }

        public static Value Y0() {
            return DEFAULT_INSTANCE;
        }

        public static Builder a1() {
            return DEFAULT_INSTANCE.x();
        }

        public static Builder b1(Value value) {
            return DEFAULT_INSTANCE.y(value);
        }

        public static Value c1(InputStream inputStream) throws IOException {
            return (Value) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
        }

        public static Value d1(InputStream inputStream, H h10) throws IOException {
            return (Value) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
        }

        public static Value e1(ByteString byteString) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
        }

        public static Value f1(ByteString byteString, H h10) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
        }

        public static Value g1(AbstractC2549t abstractC2549t) throws IOException {
            return (Value) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
        }

        public static Value h1(AbstractC2549t abstractC2549t, H h10) throws IOException {
            return (Value) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
        }

        public static Value i1(InputStream inputStream) throws IOException {
            return (Value) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
        }

        public static Value j1(InputStream inputStream, H h10) throws IOException {
            return (Value) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
        }

        public static Value k1(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Value l1(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
        }

        public static Value m1(byte[] bArr) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
        }

        public static Value n1(byte[] bArr, H h10) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
        }

        public static InterfaceC2560y0<Value> o1() {
            return DEFAULT_INSTANCE.k();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            InterfaceC2560y0 bVar;
            a aVar = null;
            switch (a.f112470a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Value();
                case 2:
                    return new Builder(aVar);
                case 3:
                    return new E0(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", StringSet.class});
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

        public final void Q0() {
            if (this.valueCase_ == 1) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public final void R0() {
            if (this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public final void S0() {
            if (this.valueCase_ == 2) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public final void T0() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public final void U0() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public final void V0() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public final void W0() {
            if (this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        public final void X0() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        public final void Z0(StringSet stringSet) {
            stringSet.getClass();
            if (this.valueCase_ != 6 || this.value_ == StringSet.I0()) {
                this.value_ = stringSet;
            } else {
                this.value_ = StringSet.K0((StringSet) this.value_).mergeFrom(stringSet).buildPartial();
            }
            this.valueCase_ = 6;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.d
        public boolean getBoolean() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.d
        public double getDouble() {
            if (this.valueCase_ == 7) {
                return ((Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.d
        public float getFloat() {
            if (this.valueCase_ == 2) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.d
        public int getInteger() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.d
        public long getLong() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.d
        public String getString() {
            return this.valueCase_ == 5 ? (String) this.value_ : "";
        }

        @Override // androidx.datastore.preferences.PreferencesProto.d
        public ByteString getStringBytes() {
            return ByteString.z(this.valueCase_ == 5 ? (String) this.value_ : "");
        }

        @Override // androidx.datastore.preferences.PreferencesProto.d
        public StringSet getStringSet() {
            return this.valueCase_ == 6 ? (StringSet) this.value_ : StringSet.I0();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.d
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.d
        public boolean hasBoolean() {
            return this.valueCase_ == 1;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.d
        public boolean hasDouble() {
            return this.valueCase_ == 7;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.d
        public boolean hasFloat() {
            return this.valueCase_ == 2;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.d
        public boolean hasInteger() {
            return this.valueCase_ == 3;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.d
        public boolean hasLong() {
            return this.valueCase_ == 4;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.d
        public boolean hasString() {
            return this.valueCase_ == 5;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.d
        public boolean hasStringSet() {
            return this.valueCase_ == 6;
        }

        public final void p1(boolean z10) {
            this.valueCase_ = 1;
            this.value_ = Boolean.valueOf(z10);
        }

        public final void q1(double d10) {
            this.valueCase_ = 7;
            this.value_ = Double.valueOf(d10);
        }

        public final void r1(float f10) {
            this.valueCase_ = 2;
            this.value_ = Float.valueOf(f10);
        }

        public final void s1(int i10) {
            this.valueCase_ = 3;
            this.value_ = Integer.valueOf(i10);
        }

        public final void t1(long j10) {
            this.valueCase_ = 4;
            this.value_ = Long.valueOf(j10);
        }

        public final void u1(String str) {
            str.getClass();
            this.valueCase_ = 5;
            this.value_ = str;
        }

        public final void v1(ByteString byteString) {
            byteString.getClass();
            this.valueCase_ = 5;
            this.value_ = byteString.c0(V.f112719a);
        }

        public final void w1(StringSet.Builder builder) {
            this.value_ = builder.build();
            this.valueCase_ = 6;
        }

        public final void x1(StringSet stringSet) {
            stringSet.getClass();
            this.value_ = stringSet;
            this.valueCase_ = 6;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112470a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112470a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112470a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112470a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112470a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112470a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112470a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112470a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public interface b extends InterfaceC2535l0 {
        boolean containsPreferences(String str);

        @Deprecated
        Map<String, Value> getPreferences();

        int getPreferencesCount();

        Map<String, Value> getPreferencesMap();

        Value getPreferencesOrDefault(String str, Value value);

        Value getPreferencesOrThrow(String str);
    }

    public interface c extends InterfaceC2535l0 {
        String getStrings(int i10);

        ByteString getStringsBytes(int i10);

        int getStringsCount();

        List<String> getStringsList();
    }

    public interface d extends InterfaceC2535l0 {
        boolean getBoolean();

        double getDouble();

        float getFloat();

        int getInteger();

        long getLong();

        String getString();

        ByteString getStringBytes();

        StringSet getStringSet();

        Value.ValueCase getValueCase();

        boolean hasBoolean();

        boolean hasDouble();

        boolean hasFloat();

        boolean hasInteger();

        boolean hasLong();

        boolean hasString();

        boolean hasStringSet();
    }

    public static void a(H h10) {
    }
}

package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.Value;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ListValue extends GeneratedMessageLite<ListValue, Builder> implements InterfaceC2517c0 {
    private static final ListValue DEFAULT_INSTANCE;
    private static volatile InterfaceC2560y0<ListValue> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private V.k<Value> values_ = B0.g();

    public static final class Builder extends GeneratedMessageLite.Builder<ListValue, Builder> implements InterfaceC2517c0 {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder addAllValues(Iterable<? extends Value> iterable) {
            copyOnWrite();
            ((ListValue) this.instance).H0(iterable);
            return this;
        }

        public Builder addValues(Value value) {
            copyOnWrite();
            ((ListValue) this.instance).L0(value);
            return this;
        }

        public Builder clearValues() {
            copyOnWrite();
            ((ListValue) this.instance).M0();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2517c0
        public Value getValues(int i10) {
            return ((ListValue) this.instance).getValues(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2517c0
        public int getValuesCount() {
            return ((ListValue) this.instance).getValuesCount();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2517c0
        public List<Value> getValuesList() {
            return Collections.unmodifiableList(((ListValue) this.instance).getValuesList());
        }

        public Builder removeValues(int i10) {
            copyOnWrite();
            ((ListValue) this.instance).g1(i10);
            return this;
        }

        public Builder setValues(int i10, Value value) {
            copyOnWrite();
            ((ListValue) this.instance).i1(i10, value);
            return this;
        }

        private Builder() {
            super(ListValue.DEFAULT_INSTANCE);
        }

        public Builder addValues(int i10, Value value) {
            copyOnWrite();
            ((ListValue) this.instance).J0(i10, value);
            return this;
        }

        public Builder setValues(int i10, Value.Builder builder) {
            copyOnWrite();
            ((ListValue) this.instance).h1(i10, builder);
            return this;
        }

        public Builder addValues(Value.Builder builder) {
            copyOnWrite();
            ((ListValue) this.instance).K0(builder);
            return this;
        }

        public Builder addValues(int i10, Value.Builder builder) {
            copyOnWrite();
            ((ListValue) this.instance).I0(i10, builder);
            return this;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112660a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112660a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112660a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112660a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112660a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112660a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112660a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112660a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ListValue listValue = new ListValue();
        DEFAULT_INSTANCE = listValue;
        GeneratedMessageLite.v0(ListValue.class, listValue);
    }

    public static ListValue O0() {
        return DEFAULT_INSTANCE;
    }

    public static Builder R0() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder S0(ListValue listValue) {
        return DEFAULT_INSTANCE.y(listValue);
    }

    public static ListValue T0(InputStream inputStream) throws IOException {
        return (ListValue) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue U0(InputStream inputStream, H h10) throws IOException {
        return (ListValue) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static ListValue V0(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static ListValue W0(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static ListValue X0(AbstractC2549t abstractC2549t) throws IOException {
        return (ListValue) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static ListValue Y0(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (ListValue) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static ListValue Z0(InputStream inputStream) throws IOException {
        return (ListValue) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue a1(InputStream inputStream, H h10) throws IOException {
        return (ListValue) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static ListValue b1(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ListValue c1(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static ListValue d1(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    public static ListValue e1(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (ListValue) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static InterfaceC2560y0<ListValue> f1() {
        return DEFAULT_INSTANCE.k();
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112660a[methodToInvoke.ordinal()]) {
            case 1:
                return new ListValue();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<ListValue> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (ListValue.class) {
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

    public final void H0(Iterable<? extends Value> iterable) {
        N0();
        AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.values_);
    }

    public final void I0(int i10, Value.Builder builder) {
        N0();
        this.values_.add(i10, builder.build());
    }

    public final void J0(int i10, Value value) {
        value.getClass();
        N0();
        this.values_.add(i10, value);
    }

    public final void K0(Value.Builder builder) {
        N0();
        this.values_.add(builder.build());
    }

    public final void L0(Value value) {
        value.getClass();
        N0();
        this.values_.add(value);
    }

    public final void M0() {
        this.values_ = B0.g();
    }

    public final void N0() {
        if (this.values_.k3()) {
            return;
        }
        this.values_ = GeneratedMessageLite.X(this.values_);
    }

    public b1 P0(int i10) {
        return this.values_.get(i10);
    }

    public List<? extends b1> Q0() {
        return this.values_;
    }

    public final void g1(int i10) {
        N0();
        this.values_.remove(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2517c0
    public Value getValues(int i10) {
        return this.values_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2517c0
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2517c0
    public List<Value> getValuesList() {
        return this.values_;
    }

    public final void h1(int i10, Value.Builder builder) {
        N0();
        this.values_.set(i10, builder.build());
    }

    public final void i1(int i10, Value value) {
        value.getClass();
        N0();
        this.values_.set(i10, value);
    }
}

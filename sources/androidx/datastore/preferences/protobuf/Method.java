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
public final class Method extends GeneratedMessageLite<Method, Builder> implements InterfaceC2545q0 {
    private static final Method DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile InterfaceC2560y0<Method> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private boolean requestStreaming_;
    private boolean responseStreaming_;
    private int syntax_;
    private String name_ = "";
    private String requestTypeUrl_ = "";
    private String responseTypeUrl_ = "";
    private V.k<Option> options_ = B0.g();

    public static final class Builder extends GeneratedMessageLite.Builder<Method, Builder> implements InterfaceC2545q0 {
        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            ((Method) this.instance).X0(iterable);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            ((Method) this.instance).b1(option);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Method) this.instance).c1();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((Method) this.instance).d1();
            return this;
        }

        public Builder clearRequestStreaming() {
            copyOnWrite();
            Method.V0((Method) this.instance);
            return this;
        }

        public Builder clearRequestTypeUrl() {
            copyOnWrite();
            ((Method) this.instance).f1();
            return this;
        }

        public Builder clearResponseStreaming() {
            copyOnWrite();
            Method.C0((Method) this.instance);
            return this;
        }

        public Builder clearResponseTypeUrl() {
            copyOnWrite();
            ((Method) this.instance).h1();
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            Method.P0((Method) this.instance);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
        public String getName() {
            return ((Method) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
        public ByteString getNameBytes() {
            return ((Method) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
        public Option getOptions(int i10) {
            return ((Method) this.instance).getOptions(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
        public int getOptionsCount() {
            return ((Method) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
        public List<Option> getOptionsList() {
            return Collections.unmodifiableList(((Method) this.instance).getOptionsList());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
        public boolean getRequestStreaming() {
            return ((Method) this.instance).getRequestStreaming();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
        public String getRequestTypeUrl() {
            return ((Method) this.instance).getRequestTypeUrl();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
        public ByteString getRequestTypeUrlBytes() {
            return ((Method) this.instance).getRequestTypeUrlBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
        public boolean getResponseStreaming() {
            return ((Method) this.instance).getResponseStreaming();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
        public String getResponseTypeUrl() {
            return ((Method) this.instance).getResponseTypeUrl();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
        public ByteString getResponseTypeUrlBytes() {
            return ((Method) this.instance).getResponseTypeUrlBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
        public Syntax getSyntax() {
            return ((Method) this.instance).getSyntax();
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
        public int getSyntaxValue() {
            return ((Method) this.instance).getSyntaxValue();
        }

        public Builder removeOptions(int i10) {
            copyOnWrite();
            ((Method) this.instance).C1(i10);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Method) this.instance).D1(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Method) this.instance).E1(byteString);
            return this;
        }

        public Builder setOptions(int i10, Option option) {
            copyOnWrite();
            ((Method) this.instance).G1(i10, option);
            return this;
        }

        public Builder setRequestStreaming(boolean z10) {
            copyOnWrite();
            Method.U0((Method) this.instance, z10);
            return this;
        }

        public Builder setRequestTypeUrl(String str) {
            copyOnWrite();
            ((Method) this.instance).I1(str);
            return this;
        }

        public Builder setRequestTypeUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Method) this.instance).J1(byteString);
            return this;
        }

        public Builder setResponseStreaming(boolean z10) {
            copyOnWrite();
            Method.B0((Method) this.instance, z10);
            return this;
        }

        public Builder setResponseTypeUrl(String str) {
            copyOnWrite();
            ((Method) this.instance).L1(str);
            return this;
        }

        public Builder setResponseTypeUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Method) this.instance).M1(byteString);
            return this;
        }

        public Builder setSyntax(Syntax syntax) {
            copyOnWrite();
            ((Method) this.instance).N1(syntax);
            return this;
        }

        public Builder setSyntaxValue(int i10) {
            copyOnWrite();
            Method.N0((Method) this.instance, i10);
            return this;
        }

        private Builder() {
            super(Method.DEFAULT_INSTANCE);
        }

        public Builder addOptions(int i10, Option option) {
            copyOnWrite();
            ((Method) this.instance).Z0(i10, option);
            return this;
        }

        public Builder setOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            ((Method) this.instance).F1(i10, builder);
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            ((Method) this.instance).a1(builder);
            return this;
        }

        public Builder addOptions(int i10, Option.Builder builder) {
            copyOnWrite();
            ((Method) this.instance).Y0(i10, builder);
            return this;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112663a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f112663a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112663a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112663a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f112663a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f112663a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f112663a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f112663a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Method method = new Method();
        DEFAULT_INSTANCE = method;
        GeneratedMessageLite.v0(Method.class, method);
    }

    public static Method A1(byte[] bArr, H h10) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.n0(DEFAULT_INSTANCE, bArr, h10);
    }

    public static void B0(Method method, boolean z10) {
        method.responseStreaming_ = z10;
    }

    public static InterfaceC2560y0<Method> B1() {
        return DEFAULT_INSTANCE.k();
    }

    public static void C0(Method method) {
        method.responseStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C1(int i10) {
        j1();
        this.options_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D1(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E1(ByteString byteString) {
        byteString.getClass();
        AbstractMessageLite.n(byteString);
        this.name_ = byteString.c0(V.f112719a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F1(int i10, Option.Builder builder) {
        j1();
        this.options_.set(i10, builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G1(int i10, Option option) {
        option.getClass();
        j1();
        this.options_.set(i10, option);
    }

    public static void N0(Method method, int i10) {
        method.syntax_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N1(Syntax syntax) {
        syntax.getClass();
        this.syntax_ = syntax.getNumber();
    }

    private void O1(int i10) {
        this.syntax_ = i10;
    }

    public static void P0(Method method) {
        method.syntax_ = 0;
    }

    public static void U0(Method method, boolean z10) {
        method.requestStreaming_ = z10;
    }

    public static void V0(Method method) {
        method.requestStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(Iterable<? extends Option> iterable) {
        j1();
        AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y0(int i10, Option.Builder builder) {
        j1();
        this.options_.add(i10, builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z0(int i10, Option option) {
        option.getClass();
        j1();
        this.options_.add(i10, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1(Option.Builder builder) {
        j1();
        this.options_.add(builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b1(Option option) {
        option.getClass();
        j1();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1() {
        this.name_ = DEFAULT_INSTANCE.name_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d1() {
        this.options_ = B0.g();
    }

    private void i1() {
        this.syntax_ = 0;
    }

    private void j1() {
        if (this.options_.k3()) {
            return;
        }
        this.options_ = GeneratedMessageLite.X(this.options_);
    }

    public static Method k1() {
        return DEFAULT_INSTANCE;
    }

    public static Builder n1() {
        return DEFAULT_INSTANCE.x();
    }

    public static Builder o1(Method method) {
        return DEFAULT_INSTANCE.y(method);
    }

    public static Method p1(InputStream inputStream) throws IOException {
        return (Method) GeneratedMessageLite.c0(DEFAULT_INSTANCE, inputStream);
    }

    public static Method q1(InputStream inputStream, H h10) throws IOException {
        return (Method) GeneratedMessageLite.d0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Method r1(ByteString byteString) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.e0(DEFAULT_INSTANCE, byteString);
    }

    public static Method s1(ByteString byteString, H h10) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.f0(DEFAULT_INSTANCE, byteString, h10);
    }

    public static Method t1(AbstractC2549t abstractC2549t) throws IOException {
        return (Method) GeneratedMessageLite.g0(DEFAULT_INSTANCE, abstractC2549t);
    }

    public static Method u1(AbstractC2549t abstractC2549t, H h10) throws IOException {
        return (Method) GeneratedMessageLite.h0(DEFAULT_INSTANCE, abstractC2549t, h10);
    }

    public static Method v1(InputStream inputStream) throws IOException {
        return (Method) GeneratedMessageLite.i0(DEFAULT_INSTANCE, inputStream);
    }

    public static Method w1(InputStream inputStream, H h10) throws IOException {
        return (Method) GeneratedMessageLite.j0(DEFAULT_INSTANCE, inputStream, h10);
    }

    public static Method x1(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.k0(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Method y1(ByteBuffer byteBuffer, H h10) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.l0(DEFAULT_INSTANCE, byteBuffer, h10);
    }

    public static Method z1(byte[] bArr) throws InvalidProtocolBufferException {
        return (Method) GeneratedMessageLite.m0(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object B(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        InterfaceC2560y0 bVar;
        a aVar = null;
        switch (a.f112663a[methodToInvoke.ordinal()]) {
            case 1:
                return new Method();
            case 2:
                return new Builder(aVar);
            case 3:
                return new E0(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", Option.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC2560y0<Method> interfaceC2560y0 = PARSER;
                if (interfaceC2560y0 != null) {
                    return interfaceC2560y0;
                }
                synchronized (Method.class) {
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

    public final void H1(boolean z10) {
        this.requestStreaming_ = z10;
    }

    public final void I1(String str) {
        str.getClass();
        this.requestTypeUrl_ = str;
    }

    public final void J1(ByteString byteString) {
        byteString.getClass();
        AbstractMessageLite.n(byteString);
        this.requestTypeUrl_ = byteString.c0(V.f112719a);
    }

    public final void K1(boolean z10) {
        this.responseStreaming_ = z10;
    }

    public final void L1(String str) {
        str.getClass();
        this.responseTypeUrl_ = str;
    }

    public final void M1(ByteString byteString) {
        byteString.getClass();
        AbstractMessageLite.n(byteString);
        this.responseTypeUrl_ = byteString.c0(V.f112719a);
    }

    public final void e1() {
        this.requestStreaming_ = false;
    }

    public final void f1() {
        this.requestTypeUrl_ = DEFAULT_INSTANCE.requestTypeUrl_;
    }

    public final void g1() {
        this.responseStreaming_ = false;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
    public ByteString getNameBytes() {
        return ByteString.z(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
    public Option getOptions(int i10) {
        return this.options_.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
    public String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
    public ByteString getRequestTypeUrlBytes() {
        return ByteString.z(this.requestTypeUrl_);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
    public String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
    public ByteString getResponseTypeUrlBytes() {
        return ByteString.z(this.responseTypeUrl_);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC2545q0
    public int getSyntaxValue() {
        return this.syntax_;
    }

    public final void h1() {
        this.responseTypeUrl_ = DEFAULT_INSTANCE.responseTypeUrl_;
    }

    public InterfaceC2558x0 l1(int i10) {
        return this.options_.get(i10);
    }

    public List<? extends InterfaceC2558x0> m1() {
        return this.options_;
    }
}

package kotlin.text;

import com.bumptech.glide.load.engine.GlideException;
import com.github.ahmadaghazadeh.editor.processor.TextProcessor;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC5043v;
import kotlin.L0;
import kotlin.O0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "2.2")
@O0(markerClass = {InterfaceC5043v.class})
public final class HexFormat {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f218225d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final HexFormat f218226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final HexFormat f218227f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f218228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BytesHexFormat f218229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final NumberHexFormat f218230c;

    public static final class Builder {

        @Nullable
        private BytesHexFormat.Builder _bytes;

        @Nullable
        private NumberHexFormat.Builder _number;
        private boolean upperCase;

        @InterfaceC4850b0
        public Builder() {
            HexFormat.f218225d.getClass();
            this.upperCase = HexFormat.f218226e.f218228a;
        }

        @Xc.f
        private final void bytes(ed.l<? super BytesHexFormat.Builder, L0> builderAction) {
            kotlin.jvm.internal.G.p(builderAction, "builderAction");
            builderAction.invoke(getBytes());
        }

        @Xc.f
        private final void number(ed.l<? super NumberHexFormat.Builder, L0> builderAction) {
            kotlin.jvm.internal.G.p(builderAction, "builderAction");
            builderAction.invoke(getNumber());
        }

        @InterfaceC4850b0
        @NotNull
        public final HexFormat build() {
            BytesHexFormat bytesHexFormatBuild$kotlin_stdlib;
            NumberHexFormat numberHexFormatBuild$kotlin_stdlib;
            boolean z10 = this.upperCase;
            BytesHexFormat.Builder builder = this._bytes;
            if (builder == null || (bytesHexFormatBuild$kotlin_stdlib = builder.build$kotlin_stdlib()) == null) {
                BytesHexFormat.f218231j.getClass();
                bytesHexFormatBuild$kotlin_stdlib = BytesHexFormat.f218232k;
            }
            NumberHexFormat.Builder builder2 = this._number;
            if (builder2 == null || (numberHexFormatBuild$kotlin_stdlib = builder2.build$kotlin_stdlib()) == null) {
                NumberHexFormat.f218242h.getClass();
                numberHexFormatBuild$kotlin_stdlib = NumberHexFormat.f218243i;
            }
            return new HexFormat(z10, bytesHexFormatBuild$kotlin_stdlib, numberHexFormatBuild$kotlin_stdlib);
        }

        @NotNull
        public final BytesHexFormat.Builder getBytes() {
            if (this._bytes == null) {
                this._bytes = new BytesHexFormat.Builder();
            }
            BytesHexFormat.Builder builder = this._bytes;
            kotlin.jvm.internal.G.m(builder);
            return builder;
        }

        @NotNull
        public final NumberHexFormat.Builder getNumber() {
            if (this._number == null) {
                this._number = new NumberHexFormat.Builder();
            }
            NumberHexFormat.Builder builder = this._number;
            kotlin.jvm.internal.G.m(builder);
            return builder;
        }

        public final boolean getUpperCase() {
            return this.upperCase;
        }

        public final void setUpperCase(boolean z10) {
            this.upperCase = z10;
        }
    }

    public static final class BytesHexFormat {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final a f218231j = new a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public static final BytesHexFormat f218232k = new BytesHexFormat(Integer.MAX_VALUE, Integer.MAX_VALUE, GlideException.a.f139488d, "", "", "");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f218233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f218234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f218235c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f218236d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f218237e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f218238f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f218239g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f218240h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f218241i;

        public static final class Builder {

            @NotNull
            private String bytePrefix;

            @NotNull
            private String byteSeparator;

            @NotNull
            private String byteSuffix;
            private int bytesPerGroup;
            private int bytesPerLine;

            @NotNull
            private String groupSeparator;

            public Builder() {
                a aVar = BytesHexFormat.f218231j;
                aVar.getClass();
                this.bytesPerLine = BytesHexFormat.f218232k.f218233a;
                aVar.getClass();
                this.bytesPerGroup = BytesHexFormat.f218232k.f218234b;
                aVar.getClass();
                this.groupSeparator = BytesHexFormat.f218232k.f218235c;
                aVar.getClass();
                this.byteSeparator = BytesHexFormat.f218232k.f218236d;
                aVar.getClass();
                this.bytePrefix = BytesHexFormat.f218232k.f218237e;
                aVar.getClass();
                this.byteSuffix = BytesHexFormat.f218232k.f218238f;
            }

            @NotNull
            public final BytesHexFormat build$kotlin_stdlib() {
                return new BytesHexFormat(this.bytesPerLine, this.bytesPerGroup, this.groupSeparator, this.byteSeparator, this.bytePrefix, this.byteSuffix);
            }

            @NotNull
            public final String getBytePrefix() {
                return this.bytePrefix;
            }

            @NotNull
            public final String getByteSeparator() {
                return this.byteSeparator;
            }

            @NotNull
            public final String getByteSuffix() {
                return this.byteSuffix;
            }

            public final int getBytesPerGroup() {
                return this.bytesPerGroup;
            }

            public final int getBytesPerLine() {
                return this.bytesPerLine;
            }

            @NotNull
            public final String getGroupSeparator() {
                return this.groupSeparator;
            }

            public final void setBytePrefix(@NotNull String value) {
                kotlin.jvm.internal.G.p(value, "value");
                if (M.o3(value, '\n', false, 2, null) || M.o3(value, '\r', false, 2, null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was ".concat(value));
                }
                this.bytePrefix = value;
            }

            public final void setByteSeparator(@NotNull String value) {
                kotlin.jvm.internal.G.p(value, "value");
                if (M.o3(value, '\n', false, 2, null) || M.o3(value, '\r', false, 2, null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was ".concat(value));
                }
                this.byteSeparator = value;
            }

            public final void setByteSuffix(@NotNull String value) {
                kotlin.jvm.internal.G.p(value, "value");
                if (M.o3(value, '\n', false, 2, null) || M.o3(value, '\r', false, 2, null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was ".concat(value));
                }
                this.byteSuffix = value;
            }

            public final void setBytesPerGroup(int i10) {
                if (i10 <= 0) {
                    throw new IllegalArgumentException(android.support.v4.media.c.a("Non-positive values are prohibited for bytesPerGroup, but was ", i10));
                }
                this.bytesPerGroup = i10;
            }

            public final void setBytesPerLine(int i10) {
                if (i10 <= 0) {
                    throw new IllegalArgumentException(android.support.v4.media.c.a("Non-positive values are prohibited for bytesPerLine, but was ", i10));
                }
                this.bytesPerLine = i10;
            }

            public final void setGroupSeparator(@NotNull String str) {
                kotlin.jvm.internal.G.p(str, "<set-?>");
                this.groupSeparator = str;
            }
        }

        public static final class a {
            public a() {
            }

            @NotNull
            public final BytesHexFormat a() {
                return BytesHexFormat.f218232k;
            }

            public a(C4969v c4969v) {
            }
        }

        public BytesHexFormat(int i10, int i11, @NotNull String groupSeparator, @NotNull String byteSeparator, @NotNull String bytePrefix, @NotNull String byteSuffix) {
            kotlin.jvm.internal.G.p(groupSeparator, "groupSeparator");
            kotlin.jvm.internal.G.p(byteSeparator, "byteSeparator");
            kotlin.jvm.internal.G.p(bytePrefix, "bytePrefix");
            kotlin.jvm.internal.G.p(byteSuffix, "byteSuffix");
            this.f218233a = i10;
            this.f218234b = i11;
            this.f218235c = groupSeparator;
            this.f218236d = byteSeparator;
            this.f218237e = bytePrefix;
            this.f218238f = byteSuffix;
            this.f218239g = i10 == Integer.MAX_VALUE && i11 == Integer.MAX_VALUE;
            this.f218240h = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            this.f218241i = C5018j.c(groupSeparator) || C5018j.c(byteSeparator) || C5018j.c(bytePrefix) || C5018j.c(byteSuffix);
        }

        @NotNull
        public final StringBuilder b(@NotNull StringBuilder sb2, @NotNull String indent) {
            kotlin.jvm.internal.G.p(sb2, "sb");
            kotlin.jvm.internal.G.p(indent, "indent");
            sb2.append(indent);
            sb2.append("bytesPerLine = ");
            sb2.append(this.f218233a);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.f218234b);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("groupSeparator = \"");
            sb2.append(this.f218235c);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSeparator = \"");
            sb2.append(this.f218236d);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytePrefix = \"");
            sb2.append(this.f218237e);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSuffix = \"");
            sb2.append(this.f218238f);
            sb2.append("\"");
            return sb2;
        }

        @NotNull
        public final String c() {
            return this.f218237e;
        }

        @NotNull
        public final String d() {
            return this.f218236d;
        }

        @NotNull
        public final String e() {
            return this.f218238f;
        }

        public final int f() {
            return this.f218234b;
        }

        public final int g() {
            return this.f218233a;
        }

        @NotNull
        public final String h() {
            return this.f218235c;
        }

        public final boolean i() {
            return this.f218241i;
        }

        public final boolean j() {
            return this.f218239g;
        }

        public final boolean k() {
            return this.f218240h;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(\n");
            b(sb2, TextProcessor.f150538k0);
            sb2.append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static final class NumberHexFormat {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final a f218242h = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final NumberHexFormat f218243i = new NumberHexFormat("", "", false, 1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f218244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f218245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f218246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f218247d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f218248e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f218249f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f218250g;

        @kotlin.jvm.internal.V({"SMAP\nHexFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormat$NumberHexFormat$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,845:1\n1#2:846\n*E\n"})
        public static final class Builder {
            private int minLength;

            @NotNull
            private String prefix;
            private boolean removeLeadingZeros;

            @NotNull
            private String suffix;

            public Builder() {
                a aVar = NumberHexFormat.f218242h;
                aVar.getClass();
                this.prefix = NumberHexFormat.f218243i.f218244a;
                aVar.getClass();
                this.suffix = NumberHexFormat.f218243i.f218245b;
                aVar.getClass();
                this.removeLeadingZeros = NumberHexFormat.f218243i.f218246c;
                aVar.getClass();
                this.minLength = NumberHexFormat.f218243i.f218247d;
            }

            @InterfaceC4887e0(version = MBridgeConstans.NATIVE_VIDEO_VERSION)
            public static /* synthetic */ void getMinLength$annotations() {
            }

            @NotNull
            public final NumberHexFormat build$kotlin_stdlib() {
                return new NumberHexFormat(this.prefix, this.suffix, this.removeLeadingZeros, this.minLength);
            }

            public final int getMinLength() {
                return this.minLength;
            }

            @NotNull
            public final String getPrefix() {
                return this.prefix;
            }

            public final boolean getRemoveLeadingZeros() {
                return this.removeLeadingZeros;
            }

            @NotNull
            public final String getSuffix() {
                return this.suffix;
            }

            public final void setMinLength(int i10) {
                if (i10 <= 0) {
                    throw new IllegalArgumentException(android.support.v4.media.c.a("Non-positive values are prohibited for minLength, but was ", i10).toString());
                }
                this.minLength = i10;
            }

            public final void setPrefix(@NotNull String value) {
                kotlin.jvm.internal.G.p(value, "value");
                if (M.o3(value, '\n', false, 2, null) || M.o3(value, '\r', false, 2, null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in prefix, but was ".concat(value));
                }
                this.prefix = value;
            }

            public final void setRemoveLeadingZeros(boolean z10) {
                this.removeLeadingZeros = z10;
            }

            public final void setSuffix(@NotNull String value) {
                kotlin.jvm.internal.G.p(value, "value");
                if (M.o3(value, '\n', false, 2, null) || M.o3(value, '\r', false, 2, null)) {
                    throw new IllegalArgumentException("LF and CR characters are prohibited in suffix, but was ".concat(value));
                }
                this.suffix = value;
            }
        }

        public static final class a {
            public a() {
            }

            @NotNull
            public final NumberHexFormat a() {
                return NumberHexFormat.f218243i;
            }

            public a(C4969v c4969v) {
            }
        }

        public NumberHexFormat(@NotNull String prefix, @NotNull String suffix, boolean z10, int i10) {
            kotlin.jvm.internal.G.p(prefix, "prefix");
            kotlin.jvm.internal.G.p(suffix, "suffix");
            this.f218244a = prefix;
            this.f218245b = suffix;
            this.f218246c = z10;
            this.f218247d = i10;
            boolean z11 = prefix.length() == 0 && suffix.length() == 0;
            this.f218248e = z11;
            this.f218249f = z11 && i10 == 1;
            this.f218250g = C5018j.c(prefix) || C5018j.c(suffix);
        }

        @InterfaceC4887e0(version = MBridgeConstans.NATIVE_VIDEO_VERSION)
        public static /* synthetic */ void e() {
        }

        @NotNull
        public final StringBuilder b(@NotNull StringBuilder sb2, @NotNull String indent) {
            kotlin.jvm.internal.G.p(sb2, "sb");
            kotlin.jvm.internal.G.p(indent, "indent");
            sb2.append(indent);
            sb2.append("prefix = \"");
            sb2.append(this.f218244a);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("suffix = \"");
            sb2.append(this.f218245b);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.f218246c);
            sb2.append(',');
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("minLength = ");
            sb2.append(this.f218247d);
            return sb2;
        }

        public final boolean c() {
            return this.f218250g;
        }

        public final int d() {
            return this.f218247d;
        }

        @NotNull
        public final String f() {
            return this.f218244a;
        }

        public final boolean g() {
            return this.f218246c;
        }

        @NotNull
        public final String h() {
            return this.f218245b;
        }

        public final boolean i() {
            return this.f218248e;
        }

        public final boolean j() {
            return this.f218249f;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(\n");
            b(sb2, TextProcessor.f150538k0);
            sb2.append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static final class a {
        public a() {
        }

        @NotNull
        public final HexFormat a() {
            return HexFormat.f218226e;
        }

        @NotNull
        public final HexFormat b() {
            return HexFormat.f218227f;
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        BytesHexFormat.a aVar = BytesHexFormat.f218231j;
        aVar.getClass();
        BytesHexFormat bytesHexFormat = BytesHexFormat.f218232k;
        NumberHexFormat.a aVar2 = NumberHexFormat.f218242h;
        aVar2.getClass();
        f218226e = new HexFormat(false, bytesHexFormat, NumberHexFormat.f218243i);
        aVar.getClass();
        BytesHexFormat bytesHexFormat2 = BytesHexFormat.f218232k;
        aVar2.getClass();
        f218227f = new HexFormat(true, bytesHexFormat2, NumberHexFormat.f218243i);
    }

    public HexFormat(boolean z10, @NotNull BytesHexFormat bytes, @NotNull NumberHexFormat number) {
        kotlin.jvm.internal.G.p(bytes, "bytes");
        kotlin.jvm.internal.G.p(number, "number");
        this.f218228a = z10;
        this.f218229b = bytes;
        this.f218230c = number;
    }

    @NotNull
    public final BytesHexFormat c() {
        return this.f218229b;
    }

    @NotNull
    public final NumberHexFormat d() {
        return this.f218230c;
    }

    public final boolean e() {
        return this.f218228a;
    }

    @NotNull
    public String toString() {
        StringBuilder sbA = androidx.compose.runtime.changelist.a.a("HexFormat(\n    upperCase = ");
        sbA.append(this.f218228a);
        sbA.append(",\n    bytes = BytesHexFormat(\n");
        this.f218229b.b(sbA, "        ");
        sbA.append('\n');
        sbA.append("    ),");
        sbA.append('\n');
        sbA.append("    number = NumberHexFormat(");
        sbA.append('\n');
        this.f218230c.b(sbA, "        ");
        sbA.append('\n');
        sbA.append("    )");
        sbA.append('\n');
        sbA.append(")");
        return sbA.toString();
    }
}

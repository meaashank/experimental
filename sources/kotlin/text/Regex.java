package kotlin.text;

import ed.InterfaceC4376a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.C4969v;
import kotlin.sequences.C5004q;
import kotlin.sequences.InterfaceC5000m;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,420:1\n24#2,3:421\n1#3:424\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n105#1:421,3\n*E\n"})
public final class Regex implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f218257c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Pattern f218258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Set<? extends RegexOption> f218259b;

    public static final class Serialized implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f218260c = new a();
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f218261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f218262b;

        public static final class a {
            public a() {
            }

            public a(C4969v c4969v) {
            }
        }

        public Serialized(@NotNull String pattern, int i10) {
            kotlin.jvm.internal.G.p(pattern, "pattern");
            this.f218261a = pattern;
            this.f218262b = i10;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f218261a, this.f218262b);
            kotlin.jvm.internal.G.o(patternCompile, "compile(...)");
            return new Regex(patternCompile);
        }

        public final int d() {
            return this.f218262b;
        }

        @NotNull
        public final String g() {
            return this.f218261a;
        }
    }

    public static final class a {
        public a() {
        }

        public final int b(int i10) {
            return (i10 & 2) != 0 ? i10 | 64 : i10;
        }

        @NotNull
        public final String c(@NotNull String literal) {
            kotlin.jvm.internal.G.p(literal, "literal");
            String strQuote = Pattern.quote(literal);
            kotlin.jvm.internal.G.o(strQuote, "quote(...)");
            return strQuote;
        }

        @NotNull
        public final String d(@NotNull String literal) {
            kotlin.jvm.internal.G.p(literal, "literal");
            String strQuoteReplacement = Matcher.quoteReplacement(literal);
            kotlin.jvm.internal.G.o(strQuoteReplacement, "quoteReplacement(...)");
            return strQuoteReplacement;
        }

        @NotNull
        public final Regex e(@NotNull String literal) {
            kotlin.jvm.internal.G.p(literal, "literal");
            return new Regex(literal, RegexOption.LITERAL);
        }

        public a(C4969v c4969v) {
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,420:1\n*E\n"})
    public static final class b implements ed.l<RegexOption, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f218263a;

        public b(int i10) {
            this.f218263a = i10;
        }

        @Override // ed.l
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(RegexOption regexOption) {
            RegexOption regexOption2 = regexOption;
            return Boolean.valueOf((this.f218263a & regexOption2.getMask()) == regexOption2.getValue());
        }
    }

    @InterfaceC4850b0
    public Regex(@NotNull Pattern nativePattern) {
        kotlin.jvm.internal.G.p(nativePattern, "nativePattern");
        this.f218258a = nativePattern;
    }

    public static InterfaceC5023o a(Regex regex, CharSequence charSequence, int i10) {
        return regex.d(charSequence, i10);
    }

    public static /* synthetic */ InterfaceC5023o e(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.d(charSequence, i10);
    }

    public static /* synthetic */ InterfaceC5000m g(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.f(charSequence, i10);
    }

    public static final InterfaceC5023o h(Regex regex, CharSequence charSequence, int i10) {
        return regex.d(charSequence, i10);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    public static /* synthetic */ List s(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.r(charSequence, i10);
    }

    public static /* synthetic */ InterfaceC5000m u(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.t(charSequence, i10);
    }

    private final Object writeReplace() {
        String strPattern = this.f218258a.pattern();
        kotlin.jvm.internal.G.o(strPattern, "pattern(...)");
        return new Serialized(strPattern, this.f218258a.flags());
    }

    public final boolean c(@NotNull CharSequence input) {
        kotlin.jvm.internal.G.p(input, "input");
        return this.f218258a.matcher(input).find();
    }

    @Nullable
    public final InterfaceC5023o d(@NotNull CharSequence input, int i10) {
        kotlin.jvm.internal.G.p(input, "input");
        Matcher matcher = this.f218258a.matcher(input);
        kotlin.jvm.internal.G.o(matcher, "matcher(...)");
        return C5026s.f(matcher, i10, input);
    }

    @NotNull
    public final InterfaceC5000m<InterfaceC5023o> f(@NotNull final CharSequence input, final int i10) {
        kotlin.jvm.internal.G.p(input, "input");
        if (i10 >= 0 && i10 <= input.length()) {
            return SequencesKt__SequencesKt.u(new InterfaceC4376a() { // from class: kotlin.text.r
                @Override // ed.InterfaceC4376a
                public final Object invoke() {
                    return this.f218370a.d(input, i10);
                }
            }, Regex$findAll$2.f218264a);
        }
        StringBuilder sbA = android.support.v4.media.a.a("Start index out of bounds: ", i10, ", input length: ");
        sbA.append(input.length());
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @NotNull
    public final Set<RegexOption> i() {
        Set set = this.f218259b;
        if (set != null) {
            return set;
        }
        int iFlags = this.f218258a.flags();
        EnumSet enumSetAllOf = EnumSet.allOf(RegexOption.class);
        kotlin.jvm.internal.G.m(enumSetAllOf);
        kotlin.collections.N.S0(enumSetAllOf, new b(iFlags));
        Set<RegexOption> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        kotlin.jvm.internal.G.o(setUnmodifiableSet, "unmodifiableSet(...)");
        this.f218259b = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    @NotNull
    public final String j() {
        String strPattern = this.f218258a.pattern();
        kotlin.jvm.internal.G.o(strPattern, "pattern(...)");
        return strPattern;
    }

    @InterfaceC4887e0(version = "1.7")
    @Nullable
    public final InterfaceC5023o k(@NotNull CharSequence input, int i10) {
        kotlin.jvm.internal.G.p(input, "input");
        Matcher matcherRegion = this.f218258a.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i10, input.length());
        if (matcherRegion.lookingAt()) {
            return new C5024p(matcherRegion, input);
        }
        return null;
    }

    @Nullable
    public final InterfaceC5023o l(@NotNull CharSequence input) {
        kotlin.jvm.internal.G.p(input, "input");
        Matcher matcher = this.f218258a.matcher(input);
        kotlin.jvm.internal.G.o(matcher, "matcher(...)");
        return C5026s.h(matcher, input);
    }

    public final boolean m(@NotNull CharSequence input) {
        kotlin.jvm.internal.G.p(input, "input");
        return this.f218258a.matcher(input).matches();
    }

    @InterfaceC4887e0(version = "1.7")
    public final boolean n(@NotNull CharSequence input, int i10) {
        kotlin.jvm.internal.G.p(input, "input");
        return this.f218258a.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i10, input.length()).lookingAt();
    }

    @NotNull
    public final String o(@NotNull CharSequence input, @NotNull ed.l<? super InterfaceC5023o, ? extends CharSequence> transform) {
        kotlin.jvm.internal.G.p(input, "input");
        kotlin.jvm.internal.G.p(transform, "transform");
        int i10 = 0;
        InterfaceC5023o interfaceC5023oD = d(input, 0);
        if (interfaceC5023oD == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            C5024p c5024p = (C5024p) interfaceC5023oD;
            sb2.append(input, i10, C5026s.i(c5024p.f218363a).f221139a);
            sb2.append(transform.invoke(interfaceC5023oD));
            i10 = C5026s.i(c5024p.f218363a).f221140b + 1;
            interfaceC5023oD = c5024p.next();
            if (i10 >= length) {
                break;
            }
        } while (interfaceC5023oD != null);
        if (i10 < length) {
            sb2.append(input, i10, length);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String p(@NotNull CharSequence input, @NotNull String replacement) {
        kotlin.jvm.internal.G.p(input, "input");
        kotlin.jvm.internal.G.p(replacement, "replacement");
        String strReplaceAll = this.f218258a.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.G.o(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    @NotNull
    public final String q(@NotNull CharSequence input, @NotNull String replacement) {
        kotlin.jvm.internal.G.p(input, "input");
        kotlin.jvm.internal.G.p(replacement, "replacement");
        String strReplaceFirst = this.f218258a.matcher(input).replaceFirst(replacement);
        kotlin.jvm.internal.G.o(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    @NotNull
    public final List<String> r(@NotNull CharSequence input, int i10) {
        kotlin.jvm.internal.G.p(input, "input");
        M.j5(i10);
        Matcher matcher = this.f218258a.matcher(input);
        if (i10 == 1 || !matcher.find()) {
            return kotlin.collections.H.l(input.toString());
        }
        int i11 = 10;
        if (i10 > 0 && i10 <= 10) {
            i11 = i10;
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = i10 - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i12 >= 0 && arrayList.size() == i12) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    @InterfaceC4887e0(version = "1.6")
    @NotNull
    public final InterfaceC5000m<String> t(@NotNull CharSequence input, int i10) {
        kotlin.jvm.internal.G.p(input, "input");
        M.j5(i10);
        return C5004q.b(new Regex$splitToSequence$1(this, input, i10, null));
    }

    @NotNull
    public String toString() {
        String string = this.f218258a.toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    @NotNull
    public final Pattern v() {
        return this.f218258a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String pattern) {
        kotlin.jvm.internal.G.p(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.G.o(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String pattern, @NotNull RegexOption option) {
        kotlin.jvm.internal.G.p(pattern, "pattern");
        kotlin.jvm.internal.G.p(option, "option");
        Pattern patternCompile = Pattern.compile(pattern, f218257c.b(option.getValue()));
        kotlin.jvm.internal.G.o(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String pattern, @NotNull Set<? extends RegexOption> options) {
        kotlin.jvm.internal.G.p(pattern, "pattern");
        kotlin.jvm.internal.G.p(options, "options");
        Pattern patternCompile = Pattern.compile(pattern, f218257c.b(C5026s.k(options)));
        kotlin.jvm.internal.G.o(patternCompile, "compile(...)");
        this(patternCompile);
    }
}

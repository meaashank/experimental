package kotlin.text;

import java.nio.charset.Charset;
import org.apache.commons.lang3.CharEncoding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.text.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5013e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5013e f218325a = new C5013e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final Charset f218326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final Charset f218327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final Charset f218328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final Charset f218329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final Charset f218330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final Charset f218331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static volatile Charset f218332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static volatile Charset f218333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static volatile Charset f218334j;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.G.o(charsetForName, "forName(...)");
        f218326b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        kotlin.jvm.internal.G.o(charsetForName2, "forName(...)");
        f218327c = charsetForName2;
        Charset charsetForName3 = Charset.forName(CharEncoding.UTF_16BE);
        kotlin.jvm.internal.G.o(charsetForName3, "forName(...)");
        f218328d = charsetForName3;
        Charset charsetForName4 = Charset.forName(CharEncoding.UTF_16LE);
        kotlin.jvm.internal.G.o(charsetForName4, "forName(...)");
        f218329e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        kotlin.jvm.internal.G.o(charsetForName5, "forName(...)");
        f218330f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.G.o(charsetForName6, "forName(...)");
        f218331g = charsetForName6;
    }

    @dd.j(name = "UTF32")
    @NotNull
    public final Charset a() {
        Charset charset = f218332h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32");
        kotlin.jvm.internal.G.o(charsetForName, "forName(...)");
        f218332h = charsetForName;
        return charsetForName;
    }

    @dd.j(name = "UTF32_BE")
    @NotNull
    public final Charset b() {
        Charset charset = f218334j;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        kotlin.jvm.internal.G.o(charsetForName, "forName(...)");
        f218334j = charsetForName;
        return charsetForName;
    }

    @dd.j(name = "UTF32_LE")
    @NotNull
    public final Charset c() {
        Charset charset = f218333i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        kotlin.jvm.internal.G.o(charsetForName, "forName(...)");
        f218333i = charsetForName;
        return charsetForName;
    }
}

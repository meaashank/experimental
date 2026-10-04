package kotlin.text;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: kotlin.text.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@dd.j(name = "CharsetsKt")
public final class C5014f {
    @Xc.f
    public static final Charset a(String charsetName) {
        kotlin.jvm.internal.G.p(charsetName, "charsetName");
        Charset charsetForName = Charset.forName(charsetName);
        kotlin.jvm.internal.G.o(charsetForName, "forName(...)");
        return charsetForName;
    }
}

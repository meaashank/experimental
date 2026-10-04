package kotlin.text;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class A extends C5033z {
    @Xc.f
    public static final Regex A(String str, Set<? extends RegexOption> options) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(options, "options");
        return new Regex(str, options);
    }

    @Xc.f
    public static final Regex B(String str, RegexOption option) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(option, "option");
        return new Regex(str, option);
    }

    @Xc.f
    public static final Regex z(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return new Regex(str);
    }
}

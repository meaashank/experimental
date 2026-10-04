package kotlin.text;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: kotlin.text.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C5033z extends C5032y {
    @Xc.f
    public static final Regex y(Pattern pattern) {
        kotlin.jvm.internal.G.p(pattern, "<this>");
        return new Regex(pattern);
    }
}

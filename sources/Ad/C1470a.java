package ad;

import kotlin.InterfaceC4887e0;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.G;
import kotlin.text.C5013e;

/* JADX INFO: renamed from: ad.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C1470a {
    @InterfaceC4887e0(version = "1.8")
    @Xc.f
    public static final byte[] a(Base64 base64, CharSequence source, int i10, int i11) {
        G.p(base64, "<this>");
        G.p(source, "source");
        if (!(source instanceof String)) {
            return base64.f(source, i10, i11);
        }
        String str = (String) source;
        base64.i(str.length(), i10, i11);
        String strSubstring = str.substring(i10, i11);
        G.o(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(C5013e.f218331g);
        G.o(bytes, "getBytes(...)");
        return bytes;
    }

    @InterfaceC4887e0(version = "1.8")
    @Xc.f
    public static final int b(Base64 base64, byte[] source, byte[] destination, int i10, int i11, int i12) {
        G.p(base64, "<this>");
        G.p(source, "source");
        G.p(destination, "destination");
        return base64.x(source, destination, i10, i11, i12);
    }

    @InterfaceC4887e0(version = "1.8")
    @Xc.f
    public static final byte[] c(Base64 base64, byte[] source, int i10, int i11) {
        G.p(base64, "<this>");
        G.p(source, "source");
        return base64.D(source, i10, i11);
    }

    @InterfaceC4887e0(version = "1.8")
    @Xc.f
    public static final String d(Base64 base64, byte[] source, int i10, int i11) {
        G.p(base64, "<this>");
        G.p(source, "source");
        return new String(base64.D(source, i10, i11), C5013e.f218331g);
    }
}

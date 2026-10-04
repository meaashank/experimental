package zd;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import kotlin.Pair;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.text.C5013e;
import kotlin.text.M;
import mozilla.components.concept.fetch.Request;
import org.jetbrains.annotations.NotNull;
import zd.i;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f241356a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f241357b = ";base64";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f241358c = "data:";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f241359d = "charset=";

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @NotNull
    public abstract i a(@NotNull Request request) throws IOException;

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final i b(@NotNull Request request) throws IOException {
        Pair pair;
        G.p(request, "request");
        if (!h.b(request)) {
            throw new IOException("Not a data URI");
        }
        try {
            String str = request.f221180a;
            if (M.p3(str, ";base64", false, 2, null)) {
                String strX5 = M.X5(M.P5(str, f241358c, null, 2, null), ";base64", null, 2, null);
                String strSubstring = str.substring(M.Z3(str, ',', 0, false, 6, null) + 1);
                G.o(strSubstring, "substring(...)");
                pair = new Pair(strX5, Base64.decode(strSubstring, 0));
            } else {
                String strX52 = M.X5(M.P5(str, f241358c, null, 2, null), ",", null, 2, null);
                Charset charsetForName = M.p3(strX52, f241359d, false, 2, null) ? Charset.forName(M.X5(M.P5(strX52, f241359d, null, 2, null), ",", null, 2, null)) : C5013e.f218326b;
                String strSubstring2 = str.substring(M.Z3(str, ',', 0, false, 6, null) + 1);
                G.o(strSubstring2, "substring(...)");
                String strDecode = URLDecoder.decode(strSubstring2, charsetForName.name());
                G.o(strDecode, "decode(...)");
                byte[] bytes = strDecode.getBytes(C5013e.f218326b);
                G.o(bytes, "getBytes(...)");
                pair = new Pair(strX52, bytes);
            }
            String str2 = (String) pair.f217467a;
            byte[] bArr = (byte[]) pair.f217468b;
            f fVar = new f((Pair<String, String>[]) new Pair[0]);
            fVar.g("Content-Length", String.valueOf(bArr.length));
            if (str2.length() > 0) {
                fVar.g("Content-Type", str2);
            }
            return new i(str, 200, fVar, new i.a(new ByteArrayInputStream(bArr), str2));
        } catch (Exception unused) {
            throw new IOException("Failed to decode data URI");
        }
    }
}

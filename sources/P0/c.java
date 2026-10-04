package P0;

import U6.j;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.net.ParseException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.text.X;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f65534b = "mailto:";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f65535c = "mailto";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f65536d = "to";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65537e = "body";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f65538f = "cc";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65539g = "bcc";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f65540h = "subject";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, String> f65541a = new HashMap<>();

    public static boolean g(@Nullable Uri uri) {
        return uri != null && f65535c.equals(uri.getScheme());
    }

    public static boolean h(@Nullable String str) {
        return str != null && str.startsWith(f65534b);
    }

    @NonNull
    public static c i(@NonNull Uri uri) throws ParseException {
        return j(uri.toString());
    }

    @NonNull
    public static c j(@NonNull String str) throws ParseException {
        String strDecode;
        String strSubstring;
        str.getClass();
        if (!h(str)) {
            throw new ParseException("Not a mailto scheme");
        }
        int iIndexOf = str.indexOf(35);
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iIndexOf2 = str.indexOf(63);
        if (iIndexOf2 == -1) {
            strDecode = Uri.decode(str.substring(7));
            strSubstring = null;
        } else {
            strDecode = Uri.decode(str.substring(7, iIndexOf2));
            strSubstring = str.substring(iIndexOf2 + 1);
        }
        c cVar = new c();
        if (strSubstring != null) {
            for (String str2 : strSubstring.split("&")) {
                String[] strArrSplit = str2.split("=", 2);
                if (strArrSplit.length != 0) {
                    cVar.f65541a.put(Uri.decode(strArrSplit[0]).toLowerCase(Locale.ROOT), strArrSplit.length > 1 ? Uri.decode(strArrSplit[1]) : null);
                }
            }
        }
        String strF = cVar.f();
        if (strF != null) {
            strDecode = androidx.concurrent.futures.a.a(strDecode, j.f68738d, strF);
        }
        cVar.f65541a.put("to", strDecode);
        return cVar;
    }

    @Nullable
    public String a() {
        return this.f65541a.get(f65539g);
    }

    @Nullable
    public String b() {
        return this.f65541a.get("body");
    }

    @Nullable
    public String c() {
        return this.f65541a.get(f65538f);
    }

    @Nullable
    public Map<String, String> d() {
        return this.f65541a;
    }

    @Nullable
    public String e() {
        return this.f65541a.get(f65540h);
    }

    @Nullable
    public String f() {
        return this.f65541a.get("to");
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("mailto:?");
        for (Map.Entry<String, String> entry : this.f65541a.entrySet()) {
            sb2.append(Uri.encode(entry.getKey()));
            sb2.append(SignatureVisitor.INSTANCEOF);
            sb2.append(Uri.encode(entry.getValue()));
            sb2.append(X.f218302d);
        }
        return sb2.toString();
    }
}

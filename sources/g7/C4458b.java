package g7;

import java.util.regex.Pattern;
import org.objectweb.asm.signature.SignatureVisitor;
import w.y;

/* JADX INFO: renamed from: g7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4458b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f202282a = Pattern.compile("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f202283b = {8, 4, 4, 4, 12};

    public static String a(String str) {
        if (str == null || !f202282a.matcher(str).matches()) {
            return str;
        }
        String strReplace = str.replace(com.prism.gaia.download.a.f164606q, "");
        if (strReplace.length() != 32) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strReplace.charAt(31));
        int i10 = 0;
        sb2.append(strReplace.substring(0, 31));
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder(36);
        int i11 = 0;
        while (true) {
            int[] iArr = f202283b;
            if (i10 >= iArr.length) {
                return sb3.toString();
            }
            if (i10 > 0) {
                sb3.append(SignatureVisitor.SUPER);
            }
            sb3.append((CharSequence) string, i11, iArr[i10] + i11);
            i11 += iArr[i10];
            i10++;
        }
    }

    public static String b() {
        if (!"00000000-0000-0000-0000-000000000000".equals(a("00000000-0000-0000-0000-000000000000"))) {
            return "ZERO_OUT must survive unchanged, got " + a("00000000-0000-0000-0000-000000000000");
        }
        if (!"d68b3f0c-8a42-b40d-393f-a51faca969af".equals(a("68b3f0c8-a42b-40d3-93fa-51faca969afd"))) {
            return "rotation changed: 68b3f0c8-a42b-40d3-93fa-51faca969afd -> " + a("68b3f0c8-a42b-40d3-93fa-51faca969afd") + ", expected d68b3f0c-8a42-b40d-393f-a51faca969af";
        }
        if (a("68b3f0c8-a42b-40d3-93fa-51faca969afd").equals("68b3f0c8-a42b-40d3-93fa-51faca969afd")) {
            return "rotation is a no-op";
        }
        if (!f202282a.matcher(a("68b3f0c8-a42b-40d3-93fa-51faca969afd")).matches()) {
            return "rotation left the UUID shape: " + a("68b3f0c8-a42b-40d3-93fa-51faca969afd");
        }
        String[] strArr = {null, "", "not-an-id", "68b3f0c8a42b40d393fa51faca969afd"};
        for (int i10 = 0; i10 < 4; i10++) {
            String str = strArr[i10];
            if (a(str) != str) {
                return y.a("non-UUID must come back identical: ", str);
            }
        }
        return null;
    }
}

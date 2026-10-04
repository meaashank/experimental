package K3;

import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Locale;
import kotlin.jvm.internal.G;
import kotlin.text.C5011c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    @NotNull
    public static final String a(@NotNull InputStream inputStream) {
        G.p(inputStream, "<this>");
        String str = "";
        try {
            byte[] bArr = new byte[1024];
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            int i10 = 0;
            while (i10 != -1) {
                i10 = inputStream.read(bArr);
                if (i10 > 0) {
                    messageDigest.update(bArr, 0, i10);
                }
            }
            inputStream.close();
            for (byte b10 : messageDigest.digest()) {
                C5011c.a(16);
                String string = Integer.toString((b10 & 255) + 256, 16);
                G.o(string, "toString(...)");
                String strSubstring = string.substring(1);
                G.o(strSubstring, "substring(...)");
                str = str + strSubstring;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        Locale locale = Locale.getDefault();
        G.o(locale, "getDefault(...)");
        String upperCase = str.toUpperCase(locale);
        G.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}

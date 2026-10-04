package H2;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.IconCache;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f45456a = Pattern.compile("\\s*(\\S+?) # Group 1: parameter name\n\\s*=\\s* # Match equals sign\n(?: # non-capturing group of options\n   '( (?: [^'\\\\] | \\\\. )* )' # Group 2: single-quoted\n | \"( (?: [^\"\\\\] | \\\\. )*  )\" # Group 3: double-quoted\n | ( [^'\"][^;\\s]* ) # Group 4: un-quoted parameter\n)\\s*;? # Optional end semicolon", 4);

    @NonNull
    public static String a(@NonNull String str, @NonNull String str2) {
        Charset charsetForName = Charset.forName(str2);
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : charsetForName.encode("+").array()) {
            sb2.append(String.format("%02x", Byte.valueOf(b10)));
        }
        return str.replaceAll("\\+", sb2.toString());
    }

    public static boolean b(@NonNull String str, @NonNull String str2) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(str.lastIndexOf(46) + 1));
        return (mimeTypeFromExtension == null || mimeTypeFromExtension.equalsIgnoreCase(str2)) ? false : true;
    }

    @Nullable
    public static String c(@NonNull String str) {
        String[] strArrSplit = str.trim().split(";", 2);
        String strF = null;
        if (strArrSplit.length < 2 || "inline".equalsIgnoreCase(strArrSplit[0].trim())) {
            return null;
        }
        Matcher matcher = f45456a.matcher(strArrSplit[1]);
        String str2 = null;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            String strG = matcher.group(2) != null ? g(matcher.group(2)) : matcher.group(3) != null ? g(matcher.group(3)) : matcher.group(4);
            if (strGroup != null && strG != null) {
                if ("filename*".equalsIgnoreCase(strGroup)) {
                    strF = f(strG);
                } else if ("filename".equalsIgnoreCase(strGroup)) {
                    str2 = strG;
                }
            }
        }
        return strF != null ? strF : str2;
    }

    @NonNull
    public static String d(@NonNull String str, @Nullable String str2) {
        String lastPathSegment;
        String strC;
        if (str2 != null && (strC = c(str2)) != null) {
            return strC.replaceAll(RemoteSettings.FORWARD_SLASH_STRING, "_");
        }
        Uri uri = Uri.parse(str);
        return (uri == null || (lastPathSegment = uri.getLastPathSegment()) == null) ? com.prism.gaia.download.a.f164602m : lastPathSegment.replaceAll(RemoteSettings.FORWARD_SLASH_STRING, "_");
    }

    @NonNull
    public static String e(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        String strD = d(str, str2);
        String strI = i(str3);
        return strD.indexOf(46) < 0 ? androidx.compose.runtime.changelist.j.a(strD, strI) : (str3 == null || !b(strD, str3)) ? strD : androidx.compose.runtime.changelist.j.a(strD, strI);
    }

    public static String f(String str) {
        String[] strArrSplit = str.split("'", 3);
        if (strArrSplit.length < 3) {
            return null;
        }
        String str2 = strArrSplit[0];
        try {
            return URLDecoder.decode(a(strArrSplit[2], str2), str2);
        } catch (UnsupportedEncodingException | RuntimeException unused) {
            return null;
        }
    }

    public static String g(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\\\(.)", "$1");
    }

    @NonNull
    public static String h(@NonNull String str) {
        return str.replaceAll(RemoteSettings.FORWARD_SLASH_STRING, "_");
    }

    @NonNull
    public static String i(@Nullable String str) {
        if (str == null) {
            return com.prism.gaia.download.a.f164605p;
        }
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        return extensionFromMimeType != null ? IconCache.EMPTY_CLASS_NAME.concat(extensionFromMimeType) : str.equalsIgnoreCase("text/html") ? com.prism.gaia.download.a.f164603n : str.toLowerCase(Locale.ROOT).startsWith("text/") ? com.prism.gaia.download.a.f164604o : com.prism.gaia.download.a.f164605p;
    }
}

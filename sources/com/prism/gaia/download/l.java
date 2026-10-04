package com.prism.gaia.download;

import U6.b;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.android.launcher3.IconCache;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.gaia.download.j;
import java.io.File;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Random f164790a = new Random(SystemClock.uptimeMillis());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f164791b = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");

    public static class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f164792f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f164793g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f164794h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f164795i = 3;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f164796j = 4;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f164797k = 5;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f164798l = 6;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f164799m = 7;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f164800n = 8;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f164801o = 9;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f164802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set<String> f164803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f164804c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f164805d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final char[] f164806e;

        public a(String str, Set<String> set) {
            this.f164802a = str;
            this.f164803b = set;
            char[] cArr = new char[str.length()];
            this.f164806e = cArr;
            str.getChars(0, cArr.length, cArr, 0);
            a();
        }

        public static final boolean c(char c10) {
            if (c10 == '_') {
                return true;
            }
            if (c10 >= 'A' && c10 <= 'Z') {
                return true;
            }
            if (c10 < 'a' || c10 > 'z') {
                return c10 >= '0' && c10 <= '9';
            }
            return true;
        }

        public static final boolean d(char c10) {
            if (c10 == '_') {
                return true;
            }
            if (c10 < 'A' || c10 > 'Z') {
                return c10 >= 'a' && c10 <= 'z';
            }
            return true;
        }

        public void a() {
            int i10;
            int i11;
            char[] cArr = this.f164806e;
            while (true) {
                i10 = this.f164804c;
                if (i10 >= cArr.length || cArr[i10] != ' ') {
                    break;
                } else {
                    this.f164804c = i10 + 1;
                }
            }
            if (i10 == cArr.length) {
                this.f164805d = 9;
                return;
            }
            char c10 = cArr[i10];
            if (c10 == '(') {
                this.f164804c = i10 + 1;
                this.f164805d = 1;
                return;
            }
            if (c10 == ')') {
                this.f164804c = i10 + 1;
                this.f164805d = 2;
                return;
            }
            if (c10 == '?') {
                this.f164804c = i10 + 1;
                this.f164805d = 6;
                return;
            }
            if (c10 == '=') {
                int i12 = i10 + 1;
                this.f164804c = i12;
                this.f164805d = 5;
                if (i12 >= cArr.length || cArr[i12] != '=') {
                    return;
                }
                this.f164804c = i10 + 2;
                return;
            }
            if (c10 == '>') {
                int i13 = i10 + 1;
                this.f164804c = i13;
                this.f164805d = 5;
                if (i13 >= cArr.length || cArr[i13] != '=') {
                    return;
                }
                this.f164804c = i10 + 2;
                return;
            }
            if (c10 == '<') {
                int i14 = i10 + 1;
                this.f164804c = i14;
                this.f164805d = 5;
                if (i14 < cArr.length) {
                    char c11 = cArr[i14];
                    if (c11 == '=' || c11 == '>') {
                        this.f164804c = i10 + 2;
                        return;
                    }
                    return;
                }
                return;
            }
            if (c10 == '!') {
                int i15 = i10 + 1;
                this.f164804c = i15;
                this.f164805d = 5;
                if (i15 >= cArr.length || cArr[i15] != '=') {
                    throw new IllegalArgumentException("Unexpected character after !");
                }
                this.f164804c = i10 + 2;
                return;
            }
            if (!d(c10)) {
                int i16 = this.f164804c;
                if (cArr[i16] != '\'') {
                    throw new IllegalArgumentException("illegal character: " + cArr[this.f164804c]);
                }
                this.f164804c = i16 + 1;
                while (true) {
                    i11 = this.f164804c;
                    if (i11 >= cArr.length) {
                        break;
                    }
                    if (cArr[i11] == '\'') {
                        if (i11 + 1 >= cArr.length || cArr[i11 + 1] != '\'') {
                            break;
                        } else {
                            this.f164804c = i11 + 1;
                        }
                    }
                    this.f164804c++;
                }
                if (i11 == cArr.length) {
                    throw new IllegalArgumentException("unterminated string");
                }
                this.f164804c = i11 + 1;
                this.f164805d = 6;
                return;
            }
            int i17 = this.f164804c;
            this.f164804c = i17 + 1;
            while (true) {
                int i18 = this.f164804c;
                if (i18 >= cArr.length || !c(cArr[i18])) {
                    break;
                } else {
                    this.f164804c++;
                }
            }
            String strSubstring = this.f164802a.substring(i17, this.f164804c);
            if (this.f164804c - i17 <= 4) {
                if (strSubstring.equals("IS")) {
                    this.f164805d = 7;
                    return;
                } else if (strSubstring.equals("OR") || strSubstring.equals("AND")) {
                    this.f164805d = 3;
                    return;
                } else if (strSubstring.equals("NULL")) {
                    this.f164805d = 8;
                    return;
                }
            }
            if (!this.f164803b.contains(strSubstring)) {
                throw new IllegalArgumentException("unrecognized column or keyword");
            }
            this.f164805d = 4;
        }

        public int b() {
            return this.f164805d;
        }
    }

    public static void a(Context context, String str, int i10, boolean z10) throws StopRequestException {
        if (z10) {
            return;
        }
        if (i10 == 0 || i10 == 2) {
            if (str == null) {
                throw new StopRequestException(406, "external download with no mime type not allowed");
            }
            if (b.c(context, str)) {
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            PackageManager packageManager = context.getPackageManager();
            intent.setDataAndType(Uri.fromParts(b.h.f68653a, "", null), str);
            if (packageManager.resolveActivity(intent, 65536) == null) {
                if (com.prism.gaia.download.a.f164587H) {
                    Log.v(com.prism.gaia.download.a.f164590a, "no handler found for type ".concat(str));
                }
                throw new StopRequestException(406, "no handler found for this download type");
            }
        }
    }

    public static String b(String str, int i10, String str2, int i11) {
        String strC;
        String mimeTypeFromExtension;
        if (str == null || ((mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str2.substring(i11 + 1))) != null && mimeTypeFromExtension.equalsIgnoreCase(str))) {
            strC = null;
        } else {
            strC = c(str, false);
            if (strC != null) {
                if (com.prism.gaia.download.a.f164589J) {
                    Log.v(com.prism.gaia.download.a.f164590a, "substituting extension from type");
                }
            } else if (com.prism.gaia.download.a.f164589J) {
                Log.v(com.prism.gaia.download.a.f164590a, "couldn't find extension for ".concat(str));
            }
        }
        if (strC != null) {
            return strC;
        }
        if (com.prism.gaia.download.a.f164589J) {
            Log.v(com.prism.gaia.download.a.f164590a, "keeping extension");
        }
        return str2.substring(i11);
    }

    public static String c(String str, boolean z10) {
        String extensionFromMimeType;
        if (str != null) {
            extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
            if (extensionFromMimeType != null) {
                if (com.prism.gaia.download.a.f164589J) {
                    Log.v(com.prism.gaia.download.a.f164590a, "adding extension from type");
                }
                extensionFromMimeType = IconCache.EMPTY_CLASS_NAME.concat(extensionFromMimeType);
            } else if (com.prism.gaia.download.a.f164589J) {
                Log.v(com.prism.gaia.download.a.f164590a, "couldn't find extension for ".concat(str));
            }
        } else {
            extensionFromMimeType = null;
        }
        if (extensionFromMimeType == null) {
            if (str == null || !str.toLowerCase().startsWith("text/")) {
                if (z10) {
                    if (!com.prism.gaia.download.a.f164589J) {
                        return com.prism.gaia.download.a.f164605p;
                    }
                    Log.v(com.prism.gaia.download.a.f164590a, "adding default binary extension");
                    return com.prism.gaia.download.a.f164605p;
                }
            } else {
                if (str.equalsIgnoreCase("text/html")) {
                    if (!com.prism.gaia.download.a.f164589J) {
                        return com.prism.gaia.download.a.f164603n;
                    }
                    Log.v(com.prism.gaia.download.a.f164590a, "adding default html extension");
                    return com.prism.gaia.download.a.f164603n;
                }
                if (z10) {
                    if (!com.prism.gaia.download.a.f164589J) {
                        return com.prism.gaia.download.a.f164604o;
                    }
                    Log.v(com.prism.gaia.download.a.f164590a, "adding default text extension");
                    return com.prism.gaia.download.a.f164604o;
                }
            }
        }
        return extensionFromMimeType;
    }

    public static String d(String str, String str2, String str3, String str4, int i10) {
        String strDecode;
        int iLastIndexOf;
        String strDecode2;
        if (str2 == null || str2.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            str2 = null;
        } else {
            if (com.prism.gaia.download.a.f164589J) {
                Log.v(com.prism.gaia.download.a.f164590a, "getting filename from hint");
            }
            int iLastIndexOf2 = str2.lastIndexOf(47) + 1;
            if (iLastIndexOf2 > 0) {
                str2 = str2.substring(iLastIndexOf2);
            }
        }
        if (str2 == null && str3 != null && (str2 = j(str3)) != null) {
            if (com.prism.gaia.download.a.f164589J) {
                Log.v(com.prism.gaia.download.a.f164590a, "getting filename from content-disposition");
            }
            int iLastIndexOf3 = str2.lastIndexOf(47) + 1;
            if (iLastIndexOf3 > 0) {
                str2 = str2.substring(iLastIndexOf3);
            }
        }
        if (str2 == null && str4 != null && (strDecode2 = Uri.decode(str4)) != null && !strDecode2.endsWith(RemoteSettings.FORWARD_SLASH_STRING) && strDecode2.indexOf(63) < 0) {
            if (com.prism.gaia.download.a.f164589J) {
                Log.v(com.prism.gaia.download.a.f164590a, "getting filename from content-location");
            }
            int iLastIndexOf4 = strDecode2.lastIndexOf(47) + 1;
            str2 = iLastIndexOf4 > 0 ? strDecode2.substring(iLastIndexOf4) : strDecode2;
        }
        if (str2 == null && (strDecode = Uri.decode(str)) != null && !strDecode.endsWith(RemoteSettings.FORWARD_SLASH_STRING) && strDecode.indexOf(63) < 0 && (iLastIndexOf = strDecode.lastIndexOf(47) + 1) > 0) {
            if (com.prism.gaia.download.a.f164589J) {
                Log.v(com.prism.gaia.download.a.f164590a, "getting filename from uri");
            }
            str2 = strDecode.substring(iLastIndexOf);
        }
        if (str2 == null) {
            if (com.prism.gaia.download.a.f164589J) {
                Log.v(com.prism.gaia.download.a.f164590a, "using default filename");
            }
            str2 = com.prism.gaia.download.a.f164602m;
        }
        return m(str2);
    }

    public static String e(int i10, String str, String str2, boolean z10) throws StopRequestException {
        String strA = androidx.compose.runtime.changelist.j.a(str, str2);
        if (!new File(strA).exists() && (!z10 || (i10 != 1 && i10 != 5 && i10 != 2 && i10 != 3))) {
            return strA;
        }
        String strA2 = androidx.compose.runtime.changelist.j.a(str, com.prism.gaia.download.a.f164606q);
        int iNextInt = 1;
        for (int i11 = 1; i11 < 1000000000; i11 *= 10) {
            for (int i12 = 0; i12 < 9; i12++) {
                String str3 = strA2 + iNextInt + str2;
                if (!new File(str3).exists()) {
                    return str3;
                }
                if (com.prism.gaia.download.a.f164589J) {
                    Log.v(com.prism.gaia.download.a.f164590a, "file with sequence number " + iNextInt + " exists");
                }
                iNextInt += f164790a.nextInt(i11) + 1;
            }
        }
        throw new StopRequestException(j.b.f164699E0, "failed to generate an unused filename on internal download storage");
    }

    public static String f(Context context, String str, String str2, String str3, String str4, String str5, int i10, long j10, boolean z10, o oVar) throws StopRequestException {
        File file;
        String path;
        a(context, str5, i10, z10);
        if (i10 == 4) {
            path = Uri.parse(str2).getPath();
            file = null;
        } else {
            File fileK = oVar.k(str5, i10, j10);
            String strD = d(str, str2, str3, str4, i10);
            file = fileK;
            path = strD;
        }
        oVar.p(i10, path, j10);
        String strG = g(path, str5, i10, file);
        return b.f164616a.equals(str5) ? b.d(strG) : strG;
    }

    public static String g(String str, String str2, int i10, File file) throws StopRequestException {
        String strB;
        int iLastIndexOf = str.lastIndexOf(46);
        boolean z10 = iLastIndexOf < 0 || iLastIndexOf < str.lastIndexOf(47);
        if (i10 == 4) {
            if (z10) {
                strB = "";
            } else {
                strB = str.substring(iLastIndexOf);
                str = str.substring(0, iLastIndexOf);
            }
        } else if (z10) {
            strB = c(str2, true);
        } else {
            strB = b(str2, i10, str, iLastIndexOf);
            str = str.substring(0, iLastIndexOf);
        }
        boolean zEqualsIgnoreCase = com.prism.gaia.download.a.f164609t.equalsIgnoreCase(str + strB);
        if (file != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file.getPath());
            str = android.support.v4.media.e.a(sb2, File.separator, str);
        }
        if (com.prism.gaia.download.a.f164589J) {
            Log.v(com.prism.gaia.download.a.f164590a, "target file: " + str + strB);
        }
        return e(i10, str, strB, zEqualsIgnoreCase);
    }

    public static boolean h(String str, File file) {
        String strReplaceFirst = str.replaceFirst("/+", RemoteSettings.FORWARD_SLASH_STRING);
        return strReplaceFirst.startsWith(Environment.getDownloadCacheDirectory().toString()) || strReplaceFirst.startsWith(file.toString()) || strReplaceFirst.startsWith(Environment.getExternalStorageDirectory().toString());
    }

    public static boolean i(p pVar, int i10) {
        NetworkInfo networkInfoD = pVar.d(i10);
        return networkInfoD != null && networkInfoD.isConnected();
    }

    public static String j(String str) {
        try {
            Matcher matcher = f164791b.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static void k(a aVar) {
        while (true) {
            if (aVar.b() == 1) {
                aVar.a();
                k(aVar);
                if (aVar.b() != 2) {
                    throw new IllegalArgumentException("syntax error, unmatched parenthese");
                }
                aVar.a();
            } else {
                l(aVar);
            }
            if (aVar.b() != 3) {
                return;
            } else {
                aVar.a();
            }
        }
    }

    public static void l(a aVar) {
        if (aVar.b() != 4) {
            throw new IllegalArgumentException("syntax error, expected column name");
        }
        aVar.a();
        if (aVar.b() == 5) {
            aVar.a();
            if (aVar.b() != 6) {
                throw new IllegalArgumentException("syntax error, expected quoted string");
            }
            aVar.a();
            return;
        }
        if (aVar.b() != 7) {
            throw new IllegalArgumentException("syntax error after column name");
        }
        aVar.a();
        if (aVar.b() != 8) {
            throw new IllegalArgumentException("syntax error, expected NULL");
        }
        aVar.a();
    }

    public static String m(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z10 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ((cCharAt < 0 || cCharAt > 31) && cCharAt != '\"' && cCharAt != '*' && cCharAt != '/' && cCharAt != ':' && cCharAt != '<' && cCharAt != '>' && cCharAt != '?' && cCharAt != '\\' && cCharAt != '|' && cCharAt != 127) {
                stringBuffer.append(cCharAt);
                z10 = false;
            } else if (!z10) {
                stringBuffer.append(Ra.b.f67799c);
                z10 = true;
            }
        }
        return stringBuffer.toString();
    }

    public static void n(String str, Set<String> set) {
        if (str != null) {
            try {
                if (str.isEmpty()) {
                    return;
                }
                a aVar = new a(str, set);
                k(aVar);
                if (aVar.f164805d == 9) {
                } else {
                    throw new IllegalArgumentException("syntax error");
                }
            } catch (RuntimeException e10) {
                if (com.prism.gaia.download.a.f164587H) {
                    Log.d(com.prism.gaia.download.a.f164590a, "invalid selection [" + str + "] triggered " + e10);
                }
                throw e10;
            }
        }
    }
}

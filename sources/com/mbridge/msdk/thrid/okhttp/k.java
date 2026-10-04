package com.mbridge.msdk.thrid.okhttp;

import com.android.launcher3.IconCache;
import com.google.common.net.HttpHeaders;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.thrid.okhttp.internal.publicsuffix.PublicSuffixDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f159648j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f159649k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f159650l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f159651m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f159652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f159653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f159654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f159655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f159656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f159657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f159658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f159659h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f159660i;

    private k(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f159652a = str;
        this.f159653b = str2;
        this.f159654c = j10;
        this.f159655d = str3;
        this.f159656e = str4;
        this.f159657f = z10;
        this.f159658g = z11;
        this.f159660i = z12;
        this.f159659h = z13;
    }

    public String a() {
        return this.f159652a;
    }

    public String b() {
        return this.f159653b;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f159652a.equals(this.f159652a) && kVar.f159653b.equals(this.f159653b) && kVar.f159655d.equals(this.f159655d) && kVar.f159656e.equals(this.f159656e) && kVar.f159654c == this.f159654c && kVar.f159657f == this.f159657f && kVar.f159658g == this.f159658g && kVar.f159659h == this.f159659h && kVar.f159660i == this.f159660i;
    }

    public int hashCode() {
        int iA = androidx.compose.foundation.text.modifiers.l.a(this.f159656e, androidx.compose.foundation.text.modifiers.l.a(this.f159655d, androidx.compose.foundation.text.modifiers.l.a(this.f159653b, androidx.compose.foundation.text.modifiers.l.a(this.f159652a, 527, 31), 31), 31), 31);
        long j10 = this.f159654c;
        return ((((((((iA + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (!this.f159657f ? 1 : 0)) * 31) + (!this.f159658g ? 1 : 0)) * 31) + (!this.f159659h ? 1 : 0)) * 31) + (!this.f159660i ? 1 : 0);
    }

    public String toString() {
        return a(false);
    }

    private static boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !com.mbridge.msdk.thrid.okhttp.internal.c.d(str);
    }

    private static long b(String str) {
        try {
            long j10 = Long.parseLong(str);
            if (j10 <= 0) {
                return Long.MIN_VALUE;
            }
            return j10;
        } catch (NumberFormatException e10) {
            if (str.matches("-?\\d+")) {
                return str.startsWith(com.prism.gaia.download.a.f164606q) ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e10;
        }
    }

    @Nullable
    public static k a(s sVar, String str) {
        return a(System.currentTimeMillis(), sVar, str);
    }

    @Nullable
    public static k a(long j10, s sVar, String str) {
        long j11;
        String str2;
        String str3;
        int length = str.length();
        char c10 = ';';
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, 0, length, ';');
        int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, 0, iA, SignatureVisitor.INSTANCEOF);
        String strA = null;
        if (iA2 == iA) {
            return null;
        }
        String strD = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, 0, iA2);
        if (strD.isEmpty() || com.mbridge.msdk.thrid.okhttp.internal.c.c(strD) != -1) {
            return null;
        }
        String strD2 = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, iA2 + 1, iA);
        if (com.mbridge.msdk.thrid.okhttp.internal.c.c(strD2) != -1) {
            return null;
        }
        int i10 = iA + 1;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = true;
        long jA = 253402300799999L;
        long jB = -1;
        String strSubstring = null;
        while (i10 < length) {
            int iA3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i10, length, c10);
            int iA4 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i10, iA3, SignatureVisitor.INSTANCEOF);
            String strD3 = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, i10, iA4);
            String strD4 = iA4 < iA3 ? com.mbridge.msdk.thrid.okhttp.internal.c.d(str, iA4 + 1, iA3) : "";
            if (strD3.equalsIgnoreCase("expires")) {
                try {
                    jA = a(strD4, 0, strD4.length());
                    z10 = true;
                } catch (NumberFormatException | IllegalArgumentException unused) {
                }
            } else if (strD3.equalsIgnoreCase("max-age")) {
                jB = b(strD4);
                z10 = true;
            } else if (strD3.equalsIgnoreCase("domain")) {
                strA = a(strD4);
                z13 = false;
            } else if (strD3.equalsIgnoreCase("path")) {
                strSubstring = strD4;
            } else if (strD3.equalsIgnoreCase("secure")) {
                z11 = true;
            } else if (strD3.equalsIgnoreCase("httponly")) {
                z12 = true;
            }
            i10 = iA3 + 1;
            c10 = ';';
        }
        if (jB == Long.MIN_VALUE) {
            j11 = Long.MIN_VALUE;
        } else if (jB != -1) {
            long j12 = j10 + (jB <= 9223372036854775L ? jB * 1000 : Long.MAX_VALUE);
            j11 = (j12 < j10 || j12 > Fd.c.f39976a) ? 253402300799999L : j12;
        } else {
            j11 = jA;
        }
        String strG = sVar.g();
        if (strA == null) {
            str2 = strG;
        } else {
            if (!a(strG, strA)) {
                return null;
            }
            str2 = strA;
        }
        if (strG.length() != str2.length() && PublicSuffixDatabase.a().a(str2) == null) {
            return null;
        }
        if (strSubstring == null || !strSubstring.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            String strC = sVar.c();
            int iLastIndexOf = strC.lastIndexOf(47);
            if (iLastIndexOf != 0) {
                strSubstring = strC.substring(0, iLastIndexOf);
                str3 = strSubstring;
            } else {
                str3 = RemoteSettings.FORWARD_SLASH_STRING;
            }
        } else {
            str3 = strSubstring;
        }
        return new k(strD, strD2, j11, str2, str3, z11, z12, z13, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long a(java.lang.String r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.k.a(java.lang.String, int, int):long");
    }

    private static int a(String str, int i10, int i11, boolean z10) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    private static String a(String str) {
        if (!str.endsWith(IconCache.EMPTY_CLASS_NAME)) {
            if (str.startsWith(IconCache.EMPTY_CLASS_NAME)) {
                str = str.substring(1);
            }
            String strA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str);
            if (strA != null) {
                return strA;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static List<k> a(s sVar, r rVar) {
        List<String> listC = rVar.c(HttpHeaders.SET_COOKIE);
        int size = listC.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            k kVarA = a(sVar, listC.get(i10));
            if (kVarA != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kVarA);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    public String a(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f159652a);
        sb2.append(SignatureVisitor.INSTANCEOF);
        sb2.append(this.f159653b);
        if (this.f159659h) {
            if (this.f159654c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(com.mbridge.msdk.thrid.okhttp.internal.http.d.a(new Date(this.f159654c)));
            }
        }
        if (!this.f159660i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(IconCache.EMPTY_CLASS_NAME);
            }
            sb2.append(this.f159655d);
        }
        sb2.append("; path=");
        sb2.append(this.f159656e);
        if (this.f159657f) {
            sb2.append("; secure");
        }
        if (this.f159658g) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }
}

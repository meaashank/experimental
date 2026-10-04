package com.mbridge.msdk.thrid.okhttp;

import androidx.compose.animation.core.E0;
import com.android.launcher3.IconCache;
import com.google.common.base.Ascii;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import kotlin.text.X;
import okhttp3.HttpUrl;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char[] f159684j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', androidx.compose.ui.graphics.vector.f.f101688t, 'B', androidx.compose.ui.graphics.vector.f.f101680l, 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f159685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f159686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f159687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f159688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f159689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f159690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final List<String> f159691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final String f159692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f159693i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        String f159694a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        String f159697d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final List<String> f159699f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        List<String> f159700g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        String f159701h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f159695b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f159696c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f159698e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f159699f = arrayList;
            arrayList.add("");
        }

        private boolean c(String str) {
            return str.equals(IconCache.EMPTY_CLASS_NAME) || str.equalsIgnoreCase("%2e");
        }

        public a a(int i10) {
            if (i10 <= 0 || i10 > 65535) {
                throw new IllegalArgumentException(android.support.v4.media.c.a("unexpected port: ", i10));
            }
            this.f159698e = i10;
            return this;
        }

        public a b(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strA = a(str, 0, str.length());
            if (strA == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.f159697d = strA;
            return this;
        }

        public a d() {
            int size = this.f159699f.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f159699f.set(i10, s.a(this.f159699f.get(i10), HttpUrl.f225216p, true, true, false, true));
            }
            List<String> list = this.f159700g;
            if (list != null) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str = this.f159700g.get(i11);
                    if (str != null) {
                        this.f159700g.set(i11, s.a(str, HttpUrl.f225220t, true, true, true, true));
                    }
                }
            }
            String str2 = this.f159701h;
            if (str2 != null) {
                this.f159701h = s.a(str2, HttpUrl.f225223w, true, true, false, false);
            }
            return this;
        }

        public a e(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f159696c = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a f(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f159694a = "http";
                return this;
            }
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.f159694a = "https";
            return this;
        }

        public a g(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f159695b = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f159694a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (!this.f159695b.isEmpty() || !this.f159696c.isEmpty()) {
                sb2.append(this.f159695b);
                if (!this.f159696c.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f159696c);
                }
                sb2.append('@');
            }
            String str2 = this.f159697d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb2.append('[');
                    sb2.append(this.f159697d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f159697d);
                }
            }
            if (this.f159698e != -1 || this.f159694a != null) {
                int iB = b();
                String str3 = this.f159694a;
                if (str3 == null || iB != s.a(str3)) {
                    sb2.append(':');
                    sb2.append(iB);
                }
            }
            s.b(sb2, this.f159699f);
            if (this.f159700g != null) {
                sb2.append('?');
                s.a(sb2, this.f159700g);
            }
            if (this.f159701h != null) {
                sb2.append(H3.b.f45548j);
                sb2.append(this.f159701h);
            }
            return sb2.toString();
        }

        private void c() {
            if (!this.f159699f.remove(r0.size() - 1).isEmpty() || this.f159699f.isEmpty()) {
                this.f159699f.add("");
            } else {
                this.f159699f.set(r0.size() - 1, "");
            }
        }

        private static int e(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i10);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public int b() {
            int i10 = this.f159698e;
            return i10 != -1 ? i10 : s.a(this.f159694a);
        }

        private static int b(String str, int i10, int i11) {
            int i12;
            try {
                i12 = Integer.parseInt(s.a(str, i10, i11, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (i12 <= 0 || i12 > 65535) {
                return -1;
            }
            return i12;
        }

        private static int c(String str, int i10, int i11) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == ':') {
                    return i10;
                }
                if (cCharAt == '[') {
                    do {
                        i10++;
                        if (i10 < i11) {
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            return i11;
        }

        private static int f(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        public a a(@Nullable String str) {
            this.f159700g = str != null ? s.d(s.a(str, HttpUrl.f225217q, true, false, true, true)) : null;
            return this;
        }

        public s a() {
            if (this.f159694a != null) {
                if (this.f159697d != null) {
                    return new s(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private void d(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.f159699f;
                list.set(list.size() - 1, "");
            } else {
                this.f159699f.clear();
                this.f159699f.add("");
                i10++;
            }
            int i12 = i10;
            while (i12 < i11) {
                int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i12, i11, "/\\");
                boolean z10 = iA < i11;
                String str2 = str;
                a(str2, i12, iA, z10, true);
                if (z10) {
                    i12 = iA + 1;
                    str = str2;
                } else {
                    str = str2;
                    i12 = iA;
                }
            }
        }

        public a a(@Nullable s sVar, String str) {
            int iA;
            String str2;
            int i10;
            String str3;
            String str4 = str;
            int iB = com.mbridge.msdk.thrid.okhttp.internal.c.b(str4, 0, str4.length());
            int iC = com.mbridge.msdk.thrid.okhttp.internal.c.c(str4, iB, str4.length());
            int iE = e(str4, iB, iC);
            if (iE != -1) {
                if (str4.regionMatches(true, iB, "https:", 0, 6)) {
                    this.f159694a = "https";
                    iB += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, iB, "http:", 0, 5)) {
                        this.f159694a = "http";
                        iB += 5;
                    } else {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str4.substring(0, iE) + "'");
                    }
                }
            } else if (sVar != null) {
                this.f159694a = sVar.f159685a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int iF = f(str4, iB, iC);
            char c10 = H3.b.f45548j;
            if (iF < 2 && sVar != null && sVar.f159685a.equals(this.f159694a)) {
                this.f159695b = sVar.f();
                this.f159696c = sVar.b();
                this.f159697d = sVar.f159688d;
                this.f159698e = sVar.f159689e;
                this.f159699f.clear();
                this.f159699f.addAll(sVar.d());
                if (iB == iC || str4.charAt(iB) == '#') {
                    a(sVar.e());
                }
                str2 = str4;
            } else {
                int i11 = iB + iF;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str4, i11, iC, "@/\\?#");
                    byte bCharAt = iA != iC ? str4.charAt(iA) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c10 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z10) {
                            int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str4, i11, iA, ':');
                            String strA = s.a(str, i11, iA2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                strA = E0.a(new StringBuilder(), this.f159695b, "%40", strA);
                            }
                            this.f159695b = strA;
                            if (iA2 != iA) {
                                i10 = iA;
                                this.f159696c = s.a(str, iA2 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            } else {
                                i10 = iA;
                            }
                            str3 = str;
                            z11 = true;
                        } else {
                            i10 = iA;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f159696c);
                            sb2.append("%40");
                            str3 = str;
                            sb2.append(s.a(str3, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.f159696c = sb2.toString();
                        }
                        i11 = i10 + 1;
                        str4 = str3;
                        c10 = H3.b.f45548j;
                    }
                }
                str2 = str4;
                int i12 = i11;
                int iC2 = c(str2, i12, iA);
                int i13 = iC2 + 1;
                if (i13 < iA) {
                    this.f159697d = a(str2, i12, iC2);
                    int iB2 = b(str2, i13, iA);
                    this.f159698e = iB2;
                    if (iB2 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i13, iA) + '\"');
                    }
                } else {
                    this.f159697d = a(str2, i12, iC2);
                    this.f159698e = s.a(this.f159694a);
                }
                if (this.f159697d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i12, iC2) + '\"');
                }
                iB = iA;
            }
            int iA3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str2, iB, iC, "?#");
            d(str2, iB, iA3);
            if (iA3 < iC && str2.charAt(iA3) == '?') {
                int iA4 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str2, iA3, iC, H3.b.f45548j);
                this.f159700g = s.d(s.a(str2, iA3 + 1, iA4, HttpUrl.f225217q, true, false, true, true, null));
                iA3 = iA4;
            }
            if (iA3 < iC && str2.charAt(iA3) == '#') {
                this.f159701h = s.a(str2, iA3 + 1, iC, "", true, false, false, false, null);
            }
            return this;
        }

        private boolean d(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void a(String str, int i10, int i11, boolean z10, boolean z11) {
            String strA = s.a(str, i10, i11, HttpUrl.f225215o, z11, false, false, true, null);
            if (c(strA)) {
                return;
            }
            if (d(strA)) {
                c();
                return;
            }
            if (((String) androidx.appcompat.view.menu.d.a(this.f159699f, 1)).isEmpty()) {
                List<String> list = this.f159699f;
                list.set(list.size() - 1, strA);
            } else {
                this.f159699f.add(strA);
            }
            if (z10) {
                this.f159699f.add("");
            }
        }

        private static String a(String str, int i10, int i11) {
            return com.mbridge.msdk.thrid.okhttp.internal.c.a(s.a(str, i10, i11, false));
        }
    }

    public s(a aVar) {
        this.f159685a = aVar.f159694a;
        this.f159686b = a(aVar.f159695b, false);
        this.f159687c = a(aVar.f159696c, false);
        this.f159688d = aVar.f159697d;
        this.f159689e = aVar.b();
        this.f159690f = a(aVar.f159699f, false);
        List<String> list = aVar.f159700g;
        this.f159691g = list != null ? a(list, true) : null;
        String str = aVar.f159701h;
        this.f159692h = str != null ? a(str, false) : null;
        this.f159693i = aVar.toString();
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public String b() {
        if (this.f159687c.isEmpty()) {
            return "";
        }
        return this.f159693i.substring(this.f159693i.indexOf(58, this.f159685a.length() + 3) + 1, this.f159693i.indexOf(64));
    }

    public String c() {
        int iIndexOf = this.f159693i.indexOf(47, this.f159685a.length() + 3);
        String str = this.f159693i;
        return this.f159693i.substring(iIndexOf, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), "?#"));
    }

    public List<String> d() {
        int iIndexOf = this.f159693i.indexOf(47, this.f159685a.length() + 3);
        String str = this.f159693i;
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iA) {
            int i10 = iIndexOf + 1;
            int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f159693i, i10, iA, '/');
            arrayList.add(this.f159693i.substring(i10, iA2));
            iIndexOf = iA2;
        }
        return arrayList;
    }

    @Nullable
    public String e() {
        if (this.f159691g == null) {
            return null;
        }
        int iIndexOf = this.f159693i.indexOf(63) + 1;
        String str = this.f159693i;
        return this.f159693i.substring(iIndexOf, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), H3.b.f45548j));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof s) && ((s) obj).f159693i.equals(this.f159693i);
    }

    public String f() {
        if (this.f159686b.isEmpty()) {
            return "";
        }
        int length = this.f159685a.length() + 3;
        String str = this.f159693i;
        return this.f159693i.substring(length, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, length, str.length(), ":@"));
    }

    public String g() {
        return this.f159688d;
    }

    public boolean h() {
        return this.f159685a.equals("https");
    }

    public int hashCode() {
        return this.f159693i.hashCode();
    }

    public a i() {
        a aVar = new a();
        aVar.f159694a = this.f159685a;
        aVar.f159695b = f();
        aVar.f159696c = b();
        aVar.f159697d = this.f159688d;
        aVar.f159698e = this.f159689e != a(this.f159685a) ? this.f159689e : -1;
        aVar.f159699f.clear();
        aVar.f159699f.addAll(d());
        aVar.a(e());
        aVar.f159701h = a();
        return aVar;
    }

    public int j() {
        return this.f159689e;
    }

    @Nullable
    public String k() {
        if (this.f159691g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        a(sb2, this.f159691g);
        return sb2.toString();
    }

    public String l() {
        return c("/...").g("").e("").a().toString();
    }

    public String m() {
        return this.f159685a;
    }

    public URI n() {
        String string = i().d().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public String toString() {
        return this.f159693i;
    }

    public static void a(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append(X.f218302d);
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append(SignatureVisitor.INSTANCEOF);
                sb2.append(str2);
            }
        }
    }

    @Nullable
    public a c(String str) {
        try {
            return new a().a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void b(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    @Nullable
    public s e(String str) {
        a aVarC = c(str);
        if (aVarC != null) {
            return aVarC.a();
        }
        return null;
    }

    public static List<String> d(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iIndexOf = str.indexOf(38, i10);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i10);
            if (iIndexOf2 != -1 && iIndexOf2 <= iIndexOf) {
                arrayList.add(str.substring(i10, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            } else {
                arrayList.add(str.substring(i10, iIndexOf));
                arrayList.add(null);
            }
            i10 = iIndexOf + 1;
        }
        return arrayList;
    }

    public static s b(String str) {
        return new a().a(null, str).a();
    }

    @Nullable
    public String a() {
        if (this.f159692h == null) {
            return null;
        }
        return this.f159693i.substring(this.f159693i.indexOf(35) + 1);
    }

    public static String a(String str, boolean z10) {
        return a(str, 0, str.length(), z10);
    }

    private List<String> a(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? a(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String a(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                cVar.a(str, i10, i12);
                a(cVar, str, i12, i11, z10);
                return cVar.p();
            }
        }
        return str.substring(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.mbridge.msdk.thrid.okio.c r5, java.lang.String r6, int r7, int r8, boolean r9) {
        /*
        L0:
            if (r7 >= r8) goto L42
            int r0 = r6.codePointAt(r7)
            r1 = 37
            if (r0 != r1) goto L2d
            int r1 = r7 + 2
            if (r1 >= r8) goto L2d
            int r2 = r7 + 1
            char r2 = r6.charAt(r2)
            int r2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(r2)
            char r3 = r6.charAt(r1)
            int r3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(r3)
            r4 = -1
            if (r2 == r4) goto L39
            if (r3 == r4) goto L39
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.writeByte(r7)
            r7 = r1
            goto L3c
        L2d:
            r1 = 43
            if (r0 != r1) goto L39
            if (r9 == 0) goto L39
            r1 = 32
            r5.writeByte(r1)
            goto L3c
        L39:
            r5.f(r0)
        L3c:
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto L0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.s.a(com.mbridge.msdk.thrid.okio.c, java.lang.String, int, int, boolean):void");
    }

    public static boolean a(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i10 + 1)) != -1 && com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i12)) != -1;
    }

    public static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z10 && (!z11 || a(str, iCharCount, i11)))) && (iCodePointAt != 43 || !z12)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                cVar.a(str, i10, iCharCount);
                a(cVar, str, iCharCount, i11, str2, z10, z11, z12, z13, charset);
                return cVar.p();
            }
        }
        return str.substring(i10, i11);
    }

    public static void a(com.mbridge.msdk.thrid.okio.c cVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        com.mbridge.msdk.thrid.okio.c cVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z12) {
                    cVar.a(z10 ? "+" : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z10 && (!z11 || a(str, i10, i11)))))) {
                    cVar.f(iCodePointAt);
                } else {
                    if (cVar2 == null) {
                        cVar2 = new com.mbridge.msdk.thrid.okio.c();
                    }
                    if (charset != null && !charset.equals(com.mbridge.msdk.thrid.okhttp.internal.c.f159284j)) {
                        cVar2.a(str, i10, Character.charCount(iCodePointAt) + i10, charset);
                    } else {
                        cVar2.f(iCodePointAt);
                    }
                    while (!cVar2.f()) {
                        byte b10 = cVar2.readByte();
                        cVar.writeByte(37);
                        char[] cArr = f159684j;
                        cVar.writeByte((int) cArr[((b10 & 255) >> 4) & 15]);
                        cVar.writeByte((int) cArr[b10 & Ascii.SI]);
                    }
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static String a(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, charset);
    }

    public static String a(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }
}

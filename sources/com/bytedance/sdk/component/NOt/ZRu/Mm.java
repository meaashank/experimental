package com.bytedance.sdk.component.NOt.ZRu;

import H3.b;
import androidx.appcompat.view.menu.d;
import androidx.compose.animation.core.E0;
import androidx.compose.ui.graphics.vector.f;
import com.android.launcher3.IconCache;
import com.google.common.base.Ascii;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.text.X;
import okhttp3.HttpUrl;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes2.dex */
public final class Mm {
    private static final char[] uR = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', f.f101688t, 'B', f.f101680l, 'D', 'E', 'F'};
    private final List<String> FA;
    private final String Ht;
    private final List<String> Mm;
    final String NOt;
    private final String TFq;
    private final String Vor;
    final String ZRu;
    private final String aT;
    final int mZ;

    public static final class ZRu {
        String FA;
        final List<String> Ht;
        List<String> Mm;
        String ZRu;
        String uR;
        String NOt = "";
        String mZ = "";
        int TFq = -1;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.NOt.ZRu.Mm$ZRu$ZRu, reason: collision with other inner class name */
        public enum EnumC0409ZRu {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public ZRu() {
            ArrayList arrayList = new ArrayList();
            this.Ht = arrayList;
            arrayList.add("");
        }

        private boolean Ht(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private boolean TFq(String str) {
            return str.equals(IconCache.EMPTY_CLASS_NAME) || str.equalsIgnoreCase("%2e");
        }

        public ZRu NOt(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strTFq = TFq(str, 0, str.length());
            if (strTFq == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.uR = strTFq;
            return this;
        }

        public ZRu ZRu(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.ZRu = "http";
                return this;
            }
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.ZRu = "https";
            return this;
        }

        public ZRu mZ(String str) {
            if (str != null) {
                return ZRu(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.ZRu);
            sb2.append("://");
            if (!this.NOt.isEmpty() || !this.mZ.isEmpty()) {
                sb2.append(this.NOt);
                if (!this.mZ.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.mZ);
                }
                sb2.append('@');
            }
            if (this.uR.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.uR);
                sb2.append(']');
            } else {
                sb2.append(this.uR);
            }
            int iZRu = ZRu();
            if (iZRu != Mm.ZRu(this.ZRu)) {
                sb2.append(':');
                sb2.append(iZRu);
            }
            Mm.ZRu(sb2, this.Ht);
            if (this.Mm != null) {
                sb2.append('?');
                Mm.NOt(sb2, this.Mm);
            }
            if (this.FA != null) {
                sb2.append(b.f45548j);
                sb2.append(this.FA);
            }
            return sb2.toString();
        }

        public ZRu uR(String str) {
            this.Mm = str != null ? Mm.NOt(Mm.ZRu(str, HttpUrl.f225217q, true, false, true, true)) : null;
            return this;
        }

        private static String TFq(String str, int i10, int i11) {
            return com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu(Mm.ZRu(str, i10, i11, false));
        }

        private void mZ() {
            if (this.Ht.remove(r0.size() - 1).isEmpty() && !this.Ht.isEmpty()) {
                this.Ht.set(r0.size() - 1, "");
            } else {
                this.Ht.add("");
            }
        }

        private static int uR(String str, int i10, int i11) {
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

        private static int Ht(String str, int i10, int i11) {
            int i12;
            try {
                i12 = Integer.parseInt(Mm.ZRu(str, i10, i11, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (i12 <= 0 || i12 > 65535) {
                return -1;
            }
            return i12;
        }

        public Mm NOt() {
            if (this.ZRu != null) {
                if (this.uR != null) {
                    return new Mm(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private static int mZ(String str, int i10, int i11) {
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

        public int ZRu() {
            int i10 = this.TFq;
            return i10 != -1 ? i10 : Mm.ZRu(this.ZRu);
        }

        private ZRu ZRu(String str, boolean z10) {
            boolean z11;
            ZRu zRu;
            String str2;
            boolean z12;
            int i10 = 0;
            while (true) {
                int iZRu = com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu(str, i10, str.length(), "/\\");
                if (iZRu < str.length()) {
                    z11 = true;
                    str2 = str;
                    z12 = z10;
                    zRu = this;
                } else {
                    z11 = false;
                    zRu = this;
                    str2 = str;
                    z12 = z10;
                }
                zRu.ZRu(str2, i10, iZRu, z11, z12);
                i10 = iZRu + 1;
                if (i10 > str2.length()) {
                    return zRu;
                }
                str = str2;
                z10 = z12;
            }
        }

        private static int NOt(String str, int i10, int i11) {
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

        public ZRu ZRu(String str, String str2) {
            if (str != null) {
                if (this.Mm == null) {
                    this.Mm = new ArrayList();
                }
                this.Mm.add(Mm.ZRu(str, HttpUrl.f225218r, true, false, true, true));
                this.Mm.add(str2 != null ? Mm.ZRu(str2, HttpUrl.f225218r, true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public EnumC0409ZRu ZRu(Mm mm, String str) {
            int iZRu;
            String str2;
            int i10;
            String str3;
            String str4 = str;
            int iZRu2 = com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu(str4, 0, str4.length());
            int iNOt = com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.NOt(str4, iZRu2, str4.length());
            if (NOt(str4, iZRu2, iNOt) != -1) {
                if (str4.regionMatches(true, iZRu2, "https:", 0, 6)) {
                    this.ZRu = "https";
                    iZRu2 += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, iZRu2, "http:", 0, 5)) {
                        this.ZRu = "http";
                        iZRu2 += 5;
                    } else {
                        return EnumC0409ZRu.UNSUPPORTED_SCHEME;
                    }
                }
            } else if (mm != null) {
                this.ZRu = mm.ZRu;
            } else {
                return EnumC0409ZRu.MISSING_SCHEME;
            }
            int iMZ = mZ(str4, iZRu2, iNOt);
            char c10 = b.f45548j;
            if (iMZ < 2 && mm != null && mm.ZRu.equals(this.ZRu)) {
                this.NOt = mm.NOt();
                this.mZ = mm.mZ();
                this.uR = mm.NOt;
                this.TFq = mm.mZ;
                this.Ht.clear();
                this.Ht.addAll(mm.uR());
                if (iZRu2 == iNOt || str4.charAt(iZRu2) == '#') {
                    uR(mm.TFq());
                }
                str2 = str4;
            } else {
                int i11 = iZRu2 + iMZ;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    iZRu = com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu(str4, i11, iNOt, "@/\\?#");
                    byte bCharAt = iZRu != iNOt ? str4.charAt(iZRu) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c10 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z10) {
                            int iZRu3 = com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu(str4, i11, iZRu, ':');
                            String strZRu = Mm.ZRu(str, i11, iZRu3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                strZRu = E0.a(new StringBuilder(), this.NOt, "%40", strZRu);
                            }
                            this.NOt = strZRu;
                            if (iZRu3 != iZRu) {
                                i10 = iZRu;
                                this.mZ = Mm.ZRu(str, iZRu3 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            } else {
                                i10 = iZRu;
                            }
                            str3 = str;
                            z11 = true;
                        } else {
                            i10 = iZRu;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.mZ);
                            sb2.append("%40");
                            str3 = str;
                            sb2.append(Mm.ZRu(str3, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.mZ = sb2.toString();
                        }
                        i11 = i10 + 1;
                        str4 = str3;
                        c10 = b.f45548j;
                    }
                }
                str2 = str4;
                int i12 = i11;
                int iUR = uR(str2, i12, iZRu);
                int i13 = iUR + 1;
                if (i13 < iZRu) {
                    this.uR = TFq(str2, i12, iUR);
                    int iHt = Ht(str2, i13, iZRu);
                    this.TFq = iHt;
                    if (iHt == -1) {
                        return EnumC0409ZRu.INVALID_PORT;
                    }
                } else {
                    this.uR = TFq(str2, i12, iUR);
                    this.TFq = Mm.ZRu(this.ZRu);
                }
                if (this.uR == null) {
                    return EnumC0409ZRu.INVALID_HOST;
                }
                iZRu2 = iZRu;
            }
            int iZRu4 = com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu(str2, iZRu2, iNOt, "?#");
            ZRu(str2, iZRu2, iZRu4);
            if (iZRu4 < iNOt && str2.charAt(iZRu4) == '?') {
                int iZRu5 = com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu(str2, iZRu4, iNOt, b.f45548j);
                this.Mm = Mm.NOt(Mm.ZRu(str2, iZRu4 + 1, iZRu5, HttpUrl.f225217q, true, false, true, true, null));
                iZRu4 = iZRu5;
            }
            if (iZRu4 < iNOt && str2.charAt(iZRu4) == '#') {
                this.FA = Mm.ZRu(str2, iZRu4 + 1, iNOt, "", true, false, false, false, null);
            }
            return EnumC0409ZRu.SUCCESS;
        }

        private void ZRu(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.Ht;
                list.set(list.size() - 1, "");
            } else {
                this.Ht.clear();
                this.Ht.add("");
                i10++;
            }
            int i12 = i10;
            while (i12 < i11) {
                int iZRu = com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu(str, i12, i11, "/\\");
                boolean z10 = iZRu < i11;
                String str2 = str;
                ZRu(str2, i12, iZRu, z10, true);
                if (z10) {
                    iZRu++;
                }
                i12 = iZRu;
                str = str2;
            }
        }

        private void ZRu(String str, int i10, int i11, boolean z10, boolean z11) {
            String strZRu = Mm.ZRu(str, i10, i11, HttpUrl.f225215o, z11, false, false, true, null);
            if (TFq(strZRu)) {
                return;
            }
            if (Ht(strZRu)) {
                mZ();
                return;
            }
            if (((String) d.a(this.Ht, 1)).isEmpty()) {
                List<String> list = this.Ht;
                list.set(list.size() - 1, strZRu);
            } else {
                this.Ht.add(strZRu);
            }
            if (z10) {
                this.Ht.add("");
            }
        }
    }

    public Mm(ZRu zRu) {
        this.ZRu = zRu.ZRu;
        this.TFq = ZRu(zRu.NOt, false);
        this.Ht = ZRu(zRu.mZ, false);
        this.NOt = zRu.uR;
        this.mZ = zRu.ZRu();
        this.Mm = ZRu(zRu.Ht, false);
        List<String> list = zRu.Mm;
        this.FA = list != null ? ZRu(list, true) : null;
        String str = zRu.FA;
        this.Vor = str != null ? ZRu(str, false) : null;
        this.aT = zRu.toString();
    }

    public String NOt() {
        if (this.TFq.isEmpty()) {
            return "";
        }
        int length = this.ZRu.length() + 3;
        String str = this.aT;
        return this.aT.substring(length, com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu(str, length, str.length(), ":@"));
    }

    public String TFq() {
        if (this.FA == null) {
            return null;
        }
        int iIndexOf = this.aT.indexOf(63) + 1;
        String str = this.aT;
        return this.aT.substring(iIndexOf, com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu(str, iIndexOf, str.length(), b.f45548j));
    }

    public URL ZRu() {
        try {
            return new URL(this.aT);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof Mm) && ((Mm) obj).aT.equals(this.aT);
    }

    public int hashCode() {
        return this.aT.hashCode();
    }

    public String mZ() {
        if (this.Ht.isEmpty()) {
            return "";
        }
        return this.aT.substring(this.aT.indexOf(58, this.ZRu.length() + 3) + 1, this.aT.indexOf(64));
    }

    public String toString() {
        return this.aT;
    }

    public List<String> uR() {
        int iIndexOf = this.aT.indexOf(47, this.ZRu.length() + 3);
        String str = this.aT;
        int iZRu = com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iZRu) {
            int i10 = iIndexOf + 1;
            int iZRu2 = com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu(this.aT, i10, iZRu, '/');
            arrayList.add(this.aT.substring(i10, iZRu2));
            iIndexOf = iZRu2;
        }
        return arrayList;
    }

    public static int ZRu(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static void NOt(StringBuilder sb2, List<String> list) {
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

    public static void ZRu(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    public static Mm mZ(String str) {
        ZRu zRu = new ZRu();
        if (zRu.ZRu((Mm) null, str) == ZRu.EnumC0409ZRu.SUCCESS) {
            return zRu.NOt();
        }
        return null;
    }

    public static String ZRu(String str, boolean z10) {
        return ZRu(str, 0, str.length(), z10);
    }

    private List<String> ZRu(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? ZRu(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List<String> NOt(String str) {
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

    public static String ZRu(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                com.bytedance.sdk.component.NOt.ZRu.NOt.ZRu zRu = new com.bytedance.sdk.component.NOt.ZRu.NOt.ZRu();
                zRu.ZRu(str, i10, i12);
                ZRu(zRu, str, i12, i11, z10);
                return zRu.mZ();
            }
        }
        return str.substring(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ZRu(com.bytedance.sdk.component.NOt.ZRu.NOt.ZRu r5, java.lang.String r6, int r7, int r8, boolean r9) {
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
            int r2 = com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu(r2)
            char r3 = r6.charAt(r1)
            int r3 = com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu(r3)
            r4 = -1
            if (r2 == r4) goto L39
            if (r3 == r4) goto L39
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.NOt(r7)
            r7 = r1
            goto L3c
        L2d:
            r1 = 43
            if (r0 != r1) goto L39
            if (r9 == 0) goto L39
            r1 = 32
            r5.NOt(r1)
            goto L3c
        L39:
            r5.ZRu(r0)
        L3c:
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto L0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.NOt.ZRu.Mm.ZRu(com.bytedance.sdk.component.NOt.ZRu.NOt.ZRu, java.lang.String, int, int, boolean):void");
    }

    public static boolean ZRu(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu(str.charAt(i10 + 1)) != -1 && com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu(str.charAt(i12)) != -1;
    }

    public static String ZRu(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z10 && (!z11 || ZRu(str, iCharCount, i11)))) && (iCodePointAt != 43 || !z12)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.bytedance.sdk.component.NOt.ZRu.NOt.ZRu zRu = new com.bytedance.sdk.component.NOt.ZRu.NOt.ZRu();
                zRu.ZRu(str, i10, iCharCount);
                ZRu(zRu, str, iCharCount, i11, str2, z10, z11, z12, z13, charset);
                return zRu.mZ();
            }
        }
        return str.substring(i10, i11);
    }

    public static void ZRu(com.bytedance.sdk.component.NOt.ZRu.NOt.ZRu zRu, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        com.bytedance.sdk.component.NOt.ZRu.NOt.ZRu zRu2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z12) {
                    zRu.ZRu(z10 ? "+" : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z10 && (!z11 || ZRu(str, i10, i11)))))) {
                    zRu.ZRu(iCodePointAt);
                } else {
                    if (zRu2 == null) {
                        zRu2 = new com.bytedance.sdk.component.NOt.ZRu.NOt.ZRu();
                    }
                    if (charset != null && !charset.equals(com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu)) {
                        zRu2.ZRu(str, i10, Character.charCount(iCodePointAt) + i10, charset);
                    } else {
                        zRu2.ZRu(iCodePointAt);
                    }
                    while (!zRu2.ZRu()) {
                        byte bNOt = zRu2.NOt();
                        zRu.NOt(37);
                        char[] cArr = uR;
                        zRu.NOt((int) cArr[((bNOt & 255) >> 4) & 15]);
                        zRu.NOt((int) cArr[bNOt & Ascii.SI]);
                    }
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static String ZRu(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return ZRu(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }
}

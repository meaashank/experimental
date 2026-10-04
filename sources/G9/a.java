package G9;

import android.os.Build;
import android.os.RemoteException;
import com.prism.commons.exception.BadStrEncodeException;
import com.prism.commons.utils.C3853q;
import com.prism.commons.utils.C3860y;
import com.prism.commons.utils.StringUtils;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.server.U;
import com.prism.gaia.server.accounts.b;
import p6.InterfaceC5394a;
import p6.d;

/* JADX INFO: loaded from: classes6.dex */
public class a extends U.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f45349l = "asdf-".concat(a.class.getSimpleName());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f45350m = "device";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f45351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f45352o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public F9.a f45353k;

    static {
        a aVar = new a();
        f45351n = aVar;
        f45352o = new d("device", aVar, null);
    }

    public static InterfaceC5394a T5() {
        return f45352o;
    }

    public static String U5(String str) {
        return String.valueOf(((Integer.parseInt(str) * 37) + 13) % 1000000);
    }

    public static boolean W5(String str) {
        return str == null || str.isEmpty() || "unknown".equalsIgnoreCase(str);
    }

    public static String X5(String str) {
        if (str == null) {
            return null;
        }
        try {
            return C3860y.j("ljsdk:".concat(str)).substring(0, 16);
        } catch (BadStrEncodeException unused) {
            return e6(str);
        }
    }

    public static String Y5(String str) {
        return C3853q.s(str) ? a6(str) : StringUtils.i(str) ? c6(str) : e6(str);
    }

    public static String Z5(String str) {
        boolean z10;
        if (str == null) {
            return null;
        }
        if (str.length() < 6) {
            return U5(str);
        }
        int length = str.length();
        int i10 = length - 6;
        String strSubstring = str.substring(i10, length);
        if (StringUtils.h(strSubstring)) {
            z10 = true;
        } else {
            if (length == 6) {
                return e6(str);
            }
            strSubstring = str.substring(length - 7, length - 1);
            z10 = false;
        }
        if (!StringUtils.h(strSubstring)) {
            return e6(str);
        }
        String strU5 = U5(strSubstring);
        if (z10) {
            return str.substring(0, i10) + strU5;
        }
        return str.substring(0, length - 7) + strU5 + str.charAt(length - 1);
    }

    public static String a6(String str) {
        if (str == null) {
            return null;
        }
        return str.substring(0, 8) + U5(str.substring(8, 14)) + str.substring(14);
    }

    public static String b6(String str) {
        if (str == null) {
            return null;
        }
        if (str.equalsIgnoreCase(C3853q.f162131e)) {
            return str;
        }
        try {
            int i10 = 0;
            String strSubstring = C3860y.j("ljsdk:".concat(str)).substring(0, 12);
            StringBuilder sb2 = new StringBuilder();
            while (i10 < 6) {
                int i11 = i10 * 2;
                i10++;
                sb2.append(strSubstring.substring(i11, i10 * 2).toUpperCase());
                sb2.append(b.f166434b0);
            }
            sb2.deleteCharAt(sb2.length() - 1);
            return sb2.toString();
        } catch (BadStrEncodeException unused) {
            return e6(str);
        }
    }

    public static String c6(String str) {
        if (str == null) {
            return null;
        }
        String strSubstring = str.substring(8);
        try {
            return str.substring(0, 8) + C3860y.j("ljsdk:" + strSubstring).substring(0, strSubstring.length());
        } catch (BadStrEncodeException unused) {
            return e6(str);
        }
    }

    public static String d6(String str) {
        if (str == null) {
            return null;
        }
        if (str.equalsIgnoreCase("unknown")) {
            return str;
        }
        if (!StringUtils.h(str) && StringUtils.i(str)) {
            try {
                return C3860y.j("ljsdk:".concat(str)).substring(0, str.length());
            } catch (BadStrEncodeException unused) {
                return e6(str);
            }
        }
        int length = str.length();
        if (length >= 6) {
            int i10 = length - 7;
            int i11 = length - 1;
            String strSubstring = str.substring(i10, i11);
            if (StringUtils.h(strSubstring)) {
                return str.substring(0, i10) + U5(strSubstring) + str.charAt(i11);
            }
        }
        return e6(str);
    }

    public static String e6(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (str.length() < 2) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = length - 2;
        sb2.append(str.substring(0, i10));
        sb2.append(str.charAt(length - 1));
        sb2.append(str.charAt(i10));
        return sb2.toString();
    }

    public static a h2() {
        return f45351n;
    }

    @Override // com.prism.gaia.server.U
    public String A3() {
        F9.a aVarV5 = v5();
        if (aVarV5.f39854e.c()) {
            return aVarV5.f39854e.b();
        }
        aVarV5.f39854e.a(b6(C3853q.d(GaiaContext.j().n())));
        return aVarV5.f39854e.b();
    }

    @Override // com.prism.gaia.server.U
    public String A5() {
        String strH6;
        F9.a aVarV5 = v5();
        if (aVarV5.f39856g.c()) {
            return aVarV5.f39856g.b();
        }
        try {
            strH6 = a6(C3853q.h(GaiaContext.j().n()));
        } catch (Throwable th) {
            th.getMessage();
            strH6 = null;
        }
        if (W5(strH6)) {
            strH6 = h6();
        }
        aVarV5.f39856g.a(strH6);
        return aVarV5.f39856g.b();
    }

    @Override // com.prism.gaia.server.U
    public String U4() {
        String strG6;
        F9.a aVarV5 = v5();
        if (aVarV5.f39850a.c()) {
            return aVarV5.f39850a.b();
        }
        try {
            strG6 = d6(C3853q.k());
        } catch (Throwable th) {
            th.getMessage();
            strG6 = null;
        }
        if (W5(strG6)) {
            strG6 = g6("serial", 12);
        }
        aVarV5.f39850a.a(strG6);
        return aVarV5.f39850a.b();
    }

    public final String V5() {
        try {
            String strD1 = d1();
            return !W5(strD1) ? strD1 : "ljsdkdefaultseed";
        } catch (Throwable unused) {
            return "ljsdkdefaultseed";
        }
    }

    @Override // com.prism.gaia.server.U
    public String b4() throws RemoteException {
        F9.a aVarV5 = v5();
        if (aVarV5.f39851b.c()) {
            return aVarV5.f39851b.b();
        }
        C3853q.l();
        aVarV5.f39851b.a(d6(Build.SERIAL));
        return aVarV5.f39851b.b();
    }

    @Override // com.prism.gaia.server.U
    public String d1() {
        F9.a aVarV5 = v5();
        if (aVarV5.f39852c.c()) {
            return aVarV5.f39852c.b();
        }
        aVarV5.f39852c.a(X5(C3853q.b(GaiaContext.j().n())));
        return aVarV5.f39852c.b();
    }

    @Override // com.prism.gaia.server.U
    public String e4() {
        String strF6;
        F9.a aVarV5 = v5();
        if (aVarV5.f39858i.c()) {
            return aVarV5.f39858i.b();
        }
        try {
            strF6 = C3853q.g(GaiaContext.j().n());
        } catch (Throwable th) {
            th.getMessage();
            strF6 = null;
        }
        if (W5(strF6)) {
            strF6 = f6("iccid", 19);
        }
        aVarV5.f39858i.a(strF6);
        return aVarV5.f39858i.b();
    }

    public final String f6(String str, int i10) {
        String strG6 = g6(str, i10 * 2);
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < strG6.length() && sb2.length() < i10; i11++) {
            sb2.append(Character.digit(strG6.charAt(i11), 16) % 10);
        }
        while (sb2.length() < i10) {
            sb2.append('7');
        }
        if (sb2.charAt(0) == '0') {
            sb2.setCharAt(0, '3');
        }
        return sb2.substring(0, i10);
    }

    public final String g6(String str, int i10) {
        String hexString;
        try {
            hexString = C3860y.j("ljsdk:synth:" + str + b.f166434b0 + V5());
        } catch (BadStrEncodeException unused) {
            hexString = Integer.toHexString(("ljsdk" + str + V5()).hashCode());
        }
        StringBuilder sb2 = new StringBuilder();
        while (sb2.length() < i10) {
            sb2.append(hexString);
        }
        return sb2.substring(0, i10).toUpperCase();
    }

    @Override // com.prism.gaia.server.U
    public String getDeviceId() {
        String strH6;
        F9.a aVarV5 = v5();
        if (aVarV5.f39855f.c()) {
            return aVarV5.f39855f.b();
        }
        try {
            strH6 = Y5(C3853q.f(GaiaContext.j().n()));
        } catch (Throwable th) {
            th.getMessage();
            strH6 = null;
        }
        if (W5(strH6)) {
            strH6 = h6();
        }
        aVarV5.f39855f.a(strH6);
        return aVarV5.f39855f.b();
    }

    @Override // com.prism.gaia.server.U
    public String h3() {
        F9.a aVarV5 = v5();
        if (aVarV5.f39853d.c()) {
            return aVarV5.f39853d.b();
        }
        aVarV5.f39853d.a(b6(C3853q.m()));
        return aVarV5.f39853d.b();
    }

    public final String h6() {
        String strF6 = f6("imei", 14);
        int i10 = 0;
        for (int i11 = 13; i11 >= 0; i11--) {
            int iCharAt = strF6.charAt(i11) - '0';
            if ((15 - i11) % 2 == 0 && (iCharAt = iCharAt * 2) > 9) {
                iCharAt -= 9;
            }
            i10 += iCharAt;
        }
        return strF6 + ((10 - (i10 % 10)) % 10);
    }

    @Override // com.prism.gaia.server.U
    public String k3() {
        String strG6;
        F9.a aVarV5 = v5();
        if (aVarV5.f39857h.c()) {
            return aVarV5.f39857h.b();
        }
        try {
            String strJ = C3853q.j(GaiaContext.j().n());
            String strH = C3853q.h(GaiaContext.f164212y.n());
            strG6 = (strH == null || strJ == null || !strH.startsWith(strJ)) ? c6(strJ) : a6(strH).substring(0, strJ.length());
        } catch (Throwable th) {
            th.getMessage();
            strG6 = null;
        }
        if (W5(strG6)) {
            strG6 = g6("meid", 14);
        }
        aVarV5.f39857h.a(strG6);
        return aVarV5.f39857h.b();
    }

    @Override // com.prism.gaia.server.U
    public String v3() {
        String strF6;
        F9.a aVarV5 = v5();
        if (aVarV5.f39859j.c()) {
            return aVarV5.f39859j.b();
        }
        try {
            strF6 = C3853q.i(GaiaContext.j().n());
        } catch (Throwable th) {
            th.getMessage();
            strF6 = null;
        }
        if (W5(strF6)) {
            strF6 = f6("imsi", 15);
        }
        aVarV5.f39859j.a(strF6);
        return aVarV5.f39859j.b();
    }

    public final synchronized F9.a v5() {
        try {
            if (this.f45353k == null) {
                this.f45353k = new F9.a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f45353k;
    }
}

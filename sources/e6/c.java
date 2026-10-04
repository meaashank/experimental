package E6;

import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f28387e = new c(null, null, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28391d;

    public c(String str, String str2, String str3, String str4) {
        this.f28388a = p(str);
        this.f28389b = p(str2);
        this.f28390c = p(str3);
        this.f28391d = p(str4);
    }

    public static String[] a(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        int i10 = 0;
        for (String str : strArr) {
            String strP = p(str);
            if (strP != null) {
                strArr2[i10] = strP;
                i10++;
            }
        }
        String[] strArr3 = new String[i10];
        System.arraycopy(strArr2, 0, strArr3, 0, i10);
        return strArr3;
    }

    public static String b(String str) {
        String[] strArr = {"|", ",", com.prism.gaia.server.accounts.b.f166434b0};
        for (int i10 = 0; i10 < 3; i10++) {
            String str2 = strArr[i10];
            if (str.contains(str2)) {
                return str2;
            }
        }
        return null;
    }

    public static String c(String... strArr) {
        if (strArr == null) {
            return null;
        }
        for (String str : strArr) {
            if (!g(str)) {
                return str;
            }
        }
        return null;
    }

    public static String d(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            String strP = p(jSONObject.optString(str, null));
            if (strP != null) {
                return strP;
            }
        }
        return null;
    }

    public static boolean g(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static c h(c cVar, c cVar2) {
        if (cVar == null) {
            cVar = f28387e;
        }
        if (cVar2 == null) {
            cVar2 = f28387e;
        }
        return new c(c(cVar.f28388a, cVar2.f28388a), c(cVar.f28389b, cVar2.f28389b), c(cVar.f28390c, cVar2.f28390c), c(cVar.f28391d, cVar2.f28391d));
    }

    public static String i(String str) {
        String strP = p(str);
        if (strP == null) {
            return null;
        }
        return strP.toLowerCase().replace("_", "").replace(com.prism.gaia.download.a.f164606q, "");
    }

    public static c j(String str, boolean z10) {
        String strP = p(str);
        return strP == null ? f28387e : strP.startsWith("{") ? m(strP) : strP.contains("=") ? n(strP) : l(strP, z10);
    }

    public static c k(String str) {
        return j(str, false);
    }

    public static c l(String str, boolean z10) {
        String strB = b(str);
        if (strB == null) {
            return f28387e;
        }
        String[] strArrA = a(str.split(Pattern.quote(strB)));
        return z10 ? strArrA.length >= 2 ? new c(strArrA[0], strArrA[1], null, null) : f28387e : strArrA.length >= 4 ? new c(strArrA[0], strArrA[1], strArrA[2], strArrA[3]) : strArrA.length >= 2 ? new c(null, null, strArrA[0], strArrA[1]) : f28387e;
    }

    public static c m(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c(d(jSONObject, RemoteConfigConstants.RequestFieldKey.APP_ID, "app_id", PangleConstants.APP_ID), d(jSONObject, "appKey", "app_key", "appkey"), d(jSONObject, "placementId", MintegralConstants.PLACEMENT_ID, "placement", "pid"), d(jSONObject, "unitId", MBridgeConstans.PROPERTIES_UNIT_ID, "unit", "adUnitId", MintegralConstants.AD_UNIT_ID));
        } catch (Throwable unused) {
            return f28387e;
        }
    }

    public static c n(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split("[&;,]")) {
            int iIndexOf = str2.indexOf(61);
            if (iIndexOf > 0 && iIndexOf < str2.length() - 1) {
                String strI = i(str2.substring(0, iIndexOf));
                String strP = p(str2.substring(iIndexOf + 1));
                if (strI != null && strP != null) {
                    map.put(strI, strP);
                }
            }
        }
        return new c(c((String) map.get(PangleConstants.APP_ID), (String) map.get("app")), (String) map.get("appkey"), c((String) map.get("placementid"), (String) map.get("placement"), (String) map.get("pid")), c((String) map.get("unitid"), (String) map.get("unit"), (String) map.get("adunitid")));
    }

    public static c o(String str) {
        return j(str, true);
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return null;
        }
        return strTrim;
    }

    public boolean e() {
        return (g(this.f28390c) || g(this.f28391d)) ? false : true;
    }

    public boolean f() {
        return (g(this.f28388a) || g(this.f28389b)) ? false : true;
    }
}

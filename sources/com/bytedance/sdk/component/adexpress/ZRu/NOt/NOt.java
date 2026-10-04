package com.bytedance.sdk.component.adexpress.ZRu.NOt;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu;
import com.bytedance.sdk.component.adexpress.uR.aT;
import com.bytedance.sdk.component.utils.lp;
import com.prism.commons.utils.C3843g;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    static Object ZRu = new Object();

    @Deprecated
    private static String Ht() {
        com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRuUR = uR();
        if (zRuUR == null) {
            return null;
        }
        return zRuUR.uR();
    }

    private static File Mm(String str) {
        List<Pair<String, String>> listNOt;
        ZRu.NOt nOtTFq = uR().TFq();
        if (nOtTFq != null && (listNOt = nOtTFq.NOt()) != null && listNOt.size() > 0) {
            for (Pair<String, String> pair : listNOt) {
                Object obj = pair.second;
                if (obj != null && ((String) obj).equals(str)) {
                    return new File(TFq.FA(), (String) pair.first);
                }
            }
        }
        return null;
    }

    public static void NOt() {
        try {
            FA.uR();
            File fileFA = TFq.FA();
            if (fileFA == null || !fileFA.exists()) {
                return;
            }
            if (fileFA.getParentFile() != null) {
                com.bytedance.sdk.component.utils.Ht.mZ(fileFA.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.Ht.mZ(fileFA);
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean TFq() {
        return TFq.NOt().TFq();
    }

    public static void ZRu() {
        TFq.NOt();
    }

    public static String mZ() {
        return Ht.mZ();
    }

    public static com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu uR() {
        return TFq.NOt().Ht();
    }

    private static boolean TFq(String str) {
        com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRuUR;
        List<ZRu.C0421ZRu> listHt;
        if (!TFq() || (zRuUR = uR()) == null || (listHt = zRuUR.Ht()) == null) {
            return false;
        }
        for (ZRu.C0421ZRu c0421ZRu : listHt) {
            if (c0421ZRu != null && TextUtils.equals(str, c0421ZRu.ZRu())) {
                return true;
            }
        }
        return false;
    }

    public static com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt ZRu(String str) {
        return Mm.ZRu().ZRu(str);
    }

    public static com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt mZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt nOtZRu = Mm.ZRu().ZRu(str);
        if (nOtZRu != null) {
            nOtZRu.ZRu(Long.valueOf(System.currentTimeMillis()));
            ZRu(nOtZRu);
        }
        return nOtZRu;
    }

    public static String uR(String str) {
        com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu;
        com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRuUR = uR();
        if (zRuUR == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return Ht();
        }
        Map<String, com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu> mapZRu = zRuUR.ZRu();
        if (mapZRu == null || mapZRu.size() <= 0 || (zRu = mapZRu.get(str)) == null) {
            return null;
        }
        return zRu.uR();
    }

    private static File Ht(String str) {
        if (TFq()) {
            Iterator<ZRu.C0421ZRu> it = uR().Ht().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ZRu.C0421ZRu next = it.next();
                if (next.ZRu() != null && next.ZRu().equals(str)) {
                    File file = new File(TFq.FA(), com.bytedance.sdk.component.utils.TFq.ZRu(next.ZRu()));
                    String strZRu = com.bytedance.sdk.component.utils.TFq.ZRu(file);
                    if (next.NOt() == null || !next.NOt().equals(strZRu)) {
                        break;
                    }
                    return file;
                }
            }
        }
        return null;
    }

    public static void ZRu(com.bytedance.sdk.component.adexpress.ZRu.mZ.uR uRVar) {
        Mm.ZRu().ZRu(uRVar, uRVar.Ht);
    }

    private static void ZRu(final com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt nOt) {
        com.bytedance.sdk.component.adexpress.uR.uR.ZRu(new com.bytedance.sdk.component.FA.FA("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.ZRu.NOt.NOt.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (NOt.ZRu) {
                    Ht.ZRu().ZRu(nOt, true);
                }
            }
        }, 10);
    }

    public static ZRu ZRu(String str, aT.ZRu zRu, String str2, String str3) {
        File fileHt;
        ZRu zRu2 = new ZRu();
        if (TextUtils.isEmpty(str3)) {
            fileHt = null;
        } else {
            fileHt = NOt(str3, str);
            if (fileHt != null) {
                zRu2.ZRu(1);
            }
        }
        if (fileHt == null && (fileHt = Mm(str)) != null) {
            zRu2.ZRu(3);
        }
        if (fileHt == null && (fileHt = Ht(str)) != null) {
            zRu2.ZRu(2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (!ZRu(str, str3)) {
                zRu2.ZRu(4);
            }
        } else if (!TFq(str)) {
            zRu2.ZRu(6);
        }
        zRu2.NOt();
        if (fileHt != null) {
            try {
                zRu2.ZRu(new WebResourceResponse(zRu.ZRu(), C3843g.f162098b, new FileInputStream(fileHt)));
                return zRu2;
            } catch (Throwable th) {
                lp.ZRu("TTDynamic", "get html WebResourceResponse error", th);
            }
        }
        return zRu2;
    }

    public static boolean mZ(JSONObject jSONObject) {
        Object objOpt;
        if (jSONObject == null) {
            return false;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject == null || (objOpt = jSONObjectOptJSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(objOpt.toString())) {
                        return false;
                    }
                }
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static Set<String> NOt(String str) {
        return Mm.ZRu().NOt(str);
    }

    private static File NOt(String str, String str2) {
        com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu;
        com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRuUR = uR();
        if (zRuUR != null && TFq()) {
            Map<String, com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu> mapZRu = zRuUR.ZRu();
            if (mapZRu.size() != 0 && (zRu = mapZRu.get(str)) != null) {
                Iterator<ZRu.C0421ZRu> it = zRu.Ht().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ZRu.C0421ZRu next = it.next();
                    if (next.ZRu() != null && next.ZRu().equals(str2)) {
                        File file = new File(TFq.FA(), com.bytedance.sdk.component.utils.TFq.ZRu(next.ZRu()));
                        String strZRu = com.bytedance.sdk.component.utils.TFq.ZRu(file);
                        if (next.NOt() == null || !next.NOt().equals(strZRu)) {
                            break;
                        }
                        return file;
                    }
                }
            }
        }
        return null;
    }

    public static boolean NOt(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("xTemplate")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    private static boolean ZRu(String str, String str2) {
        com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRuUR;
        com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu zRu;
        if (!TFq() || (zRuUR = uR()) == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu> mapZRu = zRuUR.ZRu();
        if (mapZRu.size() == 0 || (zRu = mapZRu.get(str2)) == null) {
            return false;
        }
        for (ZRu.C0421ZRu c0421ZRu : zRu.Ht()) {
            if (c0421ZRu != null && TextUtils.equals(str, c0421ZRu.ZRu())) {
                return true;
            }
        }
        return false;
    }

    public static boolean ZRu(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }
}

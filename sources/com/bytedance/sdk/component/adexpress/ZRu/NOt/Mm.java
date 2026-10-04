package com.bytedance.sdk.component.adexpress.ZRu.NOt;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lp;
import com.tonyodev.fetch2core.server.FileResponse;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Mm {
    private static volatile Mm ZRu;
    private AtomicBoolean NOt = new AtomicBoolean(false);

    private Mm() {
    }

    private JSONObject mZ(String str) {
        com.bytedance.sdk.component.adexpress.ZRu.ZRu.mZ mZVarMZ = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ();
        if (mZVarMZ == null) {
            return null;
        }
        com.bytedance.sdk.component.Mm.NOt.NOt nOtMm = mZVarMZ.Mm();
        nOtMm.NOt(str);
        com.bytedance.sdk.component.Mm.NOt nOtZRu = nOtMm.ZRu();
        if (nOtZRu != null) {
            try {
                if (nOtZRu.Ht() && nOtZRu.uR() != null) {
                    return new JSONObject(nOtZRu.uR());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Set<String> NOt(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Ht.ZRu().NOt(str);
    }

    public static Mm ZRu() {
        if (ZRu == null) {
            synchronized (Mm.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new Mm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }

    private void NOt() {
        if (com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ() == null) {
            return;
        }
        int iZRu = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ().ZRu();
        if (iZRu <= 0) {
            iZRu = 100;
        }
        List<com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt> listNOt = Ht.ZRu().NOt();
        if (listNOt == null || listNOt.isEmpty() || iZRu >= listNOt.size()) {
            if (listNOt == null) {
                return;
            }
            listNOt.size();
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt nOt : listNOt) {
            treeMap.put(nOt.Mm(), nOt);
        }
        HashSet hashSet = new HashSet();
        int size = (int) (listNOt.size() - (iZRu * 0.75f));
        int i10 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i10 < size) {
                i10++;
                ((Long) entry.getKey()).getClass();
                com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt nOt2 = (com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt) entry.getValue();
                if (nOt2 != null) {
                    hashSet.add(nOt2.NOt());
                }
            }
        }
        ZRu(hashSet);
        this.NOt.set(false);
    }

    public com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt ZRu(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Ht.ZRu().ZRu(str);
    }

    public void ZRu(com.bytedance.sdk.component.adexpress.ZRu.mZ.uR uRVar, String str) {
        String strFA;
        if (uRVar == null) {
            lp.ZRu("TmplDiffManager", "saveTemplate error: tplInfo == null");
            return;
        }
        final String str2 = uRVar.ZRu;
        final String str3 = uRVar.mZ;
        final String str4 = uRVar.NOt;
        final String str5 = uRVar.uR;
        final String str6 = uRVar.TFq;
        if (com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ() != null) {
            strFA = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ().FA();
        } else {
            strFA = "";
        }
        final String str7 = TextUtils.isEmpty(str) ? strFA : str;
        if (TextUtils.isEmpty(str2)) {
            lp.ZRu("TmplDiffManager", "saveTemplate error:tmpId is empty");
        } else {
            com.bytedance.sdk.component.adexpress.uR.uR.ZRu(new com.bytedance.sdk.component.FA.FA("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.ZRu.NOt.Mm.1
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    Mm.this.ZRu(str2, str3, str4, str5, str6, str7);
                }
            }, 10);
        }
    }

    private void NOt(String str, String str2, String str3, String str4, String str5, String str6) {
        Ht.ZRu().ZRu(new com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt().ZRu(str).NOt(str2).mZ(str3).uR(str4).TFq(str5).Ht(str6).ZRu(Long.valueOf(System.currentTimeMillis())), false);
        NOt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ZRu(String str, String str2, String str3, String str4, String str5, String str6) throws Throwable {
        String str7;
        try {
            try {
                if (ZRu(str) != null) {
                    if (!TextUtils.isEmpty(str4)) {
                        if (!TextUtils.isEmpty(str3)) {
                            str7 = str5;
                            NOt(str6, str, str3, str2, str4, str7);
                        }
                    }
                    return;
                }
                str7 = str5;
                if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                    ZRu(str2, str6, str);
                } else {
                    NOt(str6, str, str3, str2, str4, str7);
                }
                boolean zZRu = FA.ZRu(str7);
                if (!NOt.TFq() || zZRu) {
                    TFq.NOt().ZRu(true);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private void ZRu(String str, String str2, String str3) {
        JSONObject jSONObjectMZ;
        if (TextUtils.isEmpty(str) || (jSONObjectMZ = mZ(str)) == null) {
            return;
        }
        String strOptString = jSONObjectMZ.optString(FileResponse.FIELD_MD5);
        String strOptString2 = jSONObjectMZ.optString("version");
        String strOptString3 = jSONObjectMZ.optString("data");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt nOtZRu = new com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt().ZRu(str2).NOt(str3).mZ(strOptString).uR(str).TFq(strOptString3).Ht(strOptString2).ZRu(Long.valueOf(System.currentTimeMillis()));
        Ht.ZRu().ZRu(nOtZRu, false);
        NOt();
        if (FA.ZRu(strOptString2)) {
            nOtZRu.Ht(strOptString2);
            TFq.NOt().ZRu(true);
        }
    }

    public void ZRu(Set<String> set) {
        try {
            Ht.ZRu().ZRu(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}

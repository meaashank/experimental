package com.bytedance.sdk.openadsdk.core.ZH.ZRu;

import android.support.v4.media.f;
import android.text.TextUtils;
import androidx.concurrent.futures.a;
import com.bytedance.sdk.component.FA.FA;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.openadsdk.core.Vor;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.utils.WD;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class NOt {
    private static volatile NOt ZRu;

    public interface ZRu {
        void ZRu(int i10, String str, String str2);

        void ZRu(JSONObject jSONObject, String str);
    }

    private void NOt(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.ZH.ZRu.ZRu zRu = new com.bytedance.sdk.openadsdk.core.ZH.ZRu.ZRu();
        zRu.mZ(str).TFq(str3).uR(str4).NOt(str2).ZRu(str5).ZRu(Long.valueOf(System.currentTimeMillis()));
        mZ.ZRu().ZRu(zRu);
        NOt();
    }

    public static NOt ZRu() {
        if (ZRu == null) {
            synchronized (NOt.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new NOt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }

    public void ZRu(com.bytedance.sdk.openadsdk.core.ZH.Ht.ZRu zRu, String str) {
        if (zRu == null) {
            return;
        }
        if (TextUtils.isEmpty(zRu.ZRu())) {
            lp.ZRu("UGTemplateManager", "save ugen template error : tmpId is empty");
            return;
        }
        StringBuilder sbA = f.a(str, "_");
        sbA.append(zRu.ZRu());
        final String string = sbA.toString();
        final String strMZ = zRu.mZ();
        final String strNOt = zRu.NOt();
        final String strUR = zRu.uR();
        String strTFq = zRu.TFq();
        if (TextUtils.isEmpty(strTFq)) {
            if (str.equals("ad")) {
                strTFq = Vor.NOt().uR();
            } else if (str.equals("adv3")) {
                strTFq = Vor.NOt().uR() + "_v3";
            }
        }
        final String str2 = strTFq;
        WD.ZRu(new FA("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.ZH.ZRu.NOt.1
            @Override // java.lang.Runnable
            public void run() {
                NOt.this.ZRu(string, strMZ, strNOt, strUR, str2);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt() {
        int iUR = WMI.uR().uR();
        if (iUR <= 0) {
            iUR = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.ZH.ZRu.ZRu> listNOt = mZ.ZRu().NOt();
        if (listNOt == null || listNOt.isEmpty() || iUR >= listNOt.size()) {
            if (listNOt == null) {
                return;
            }
            listNOt.size();
            return;
        }
        int size = (int) (listNOt.size() - (iUR * 0.75f));
        if (size <= 0) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.openadsdk.core.ZH.ZRu.ZRu zRu : listNOt) {
            treeMap.put(zRu.uR(), zRu);
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i10 < size) {
                i10++;
                com.bytedance.sdk.openadsdk.core.ZH.ZRu.ZRu zRu2 = (com.bytedance.sdk.openadsdk.core.ZH.ZRu.ZRu) entry.getValue();
                if (zRu2 != null) {
                    hashSet.add(zRu2.ZRu());
                }
            }
        }
        ZRu(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(String str, String str2, String str3, String str4, String str5) {
        if (ZRu(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            NOt(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            ZRu(str2, str, str3, str5, (ZRu) null);
        } else {
            NOt(str2, str3, str5, str4, str);
        }
    }

    public void ZRu(String str, String str2, String str3, String str4, String str5, final ZRu zRu) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (zRu != null) {
                zRu.ZRu(1, "id  or md5 is empty", "net");
                return;
            }
            return;
        }
        String strA = a.a(str, "_", str3);
        com.bytedance.sdk.openadsdk.core.ZH.ZRu.ZRu ZRu2 = ZRu(strA, str4);
        if (ZRu2 != null && !TextUtils.isEmpty(ZRu2.TFq())) {
            ZRu(ZRu2);
            if (zRu != null) {
                try {
                    zRu.ZRu(new JSONObject(ZRu2.TFq()), ImagesContract.LOCAL);
                    return;
                } catch (JSONException unused) {
                    zRu.ZRu(2, "parse json exception data is " + ZRu2.TFq(), ImagesContract.LOCAL);
                    return;
                }
            }
            return;
        }
        ZRu(str2, strA, str4, str5, new ZRu() { // from class: com.bytedance.sdk.openadsdk.core.ZH.ZRu.NOt.2
            @Override // com.bytedance.sdk.openadsdk.core.ZH.ZRu.NOt.ZRu
            public void ZRu(JSONObject jSONObject, String str6) {
                ZRu zRu2 = zRu;
                if (zRu2 != null) {
                    zRu2.ZRu(jSONObject, str6);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.ZH.ZRu.NOt.ZRu
            public void ZRu(int i10, String str6, String str7) {
                ZRu zRu2 = zRu;
                if (zRu2 != null) {
                    zRu2.ZRu(i10, str6, str7);
                }
            }
        });
    }

    private void ZRu(final String str, final String str2, final String str3, final String str4, final ZRu zRu) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (zRu != null) {
                zRu.ZRu(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.Mm.NOt.NOt nOtMZ = com.bytedance.sdk.openadsdk.WMI.mZ.ZRu().NOt().mZ();
            nOtMZ.NOt(str);
            nOtMZ.ZRu(7);
            nOtMZ.ZRu("load_ug_t");
            nOtMZ.ZRu(new com.bytedance.sdk.component.Mm.ZRu.ZRu() { // from class: com.bytedance.sdk.openadsdk.core.ZH.ZRu.NOt.3
                @Override // com.bytedance.sdk.component.Mm.ZRu.ZRu
                public void ZRu(com.bytedance.sdk.component.Mm.NOt.mZ mZVar, com.bytedance.sdk.component.Mm.NOt nOt) {
                    if (nOt == null) {
                        return;
                    }
                    if (!nOt.Ht()) {
                        ZRu zRu2 = zRu;
                        if (zRu2 != null) {
                            zRu2.ZRu(3, "net code error code is " + nOt.ZRu() + " message is " + nOt.NOt(), "net");
                            return;
                        }
                        return;
                    }
                    String strUR = nOt.uR();
                    if (TextUtils.isEmpty(strUR)) {
                        ZRu zRu3 = zRu;
                        if (zRu3 != null) {
                            zRu3.ZRu(3, "net data is null", "net");
                            return;
                        }
                        return;
                    }
                    mZ.ZRu().ZRu(new com.bytedance.sdk.openadsdk.core.ZH.ZRu.ZRu().ZRu(str2).NOt(str3).mZ(str).TFq(str4).uR(strUR).ZRu(Long.valueOf(System.currentTimeMillis())));
                    NOt.this.NOt();
                    if (zRu != null) {
                        try {
                            zRu.ZRu(new JSONObject(strUR), "net");
                        } catch (JSONException unused) {
                            zRu.ZRu(2, "parse json exception data is".concat(String.valueOf(strUR)), "net");
                        }
                    }
                }

                @Override // com.bytedance.sdk.component.Mm.ZRu.ZRu
                public void ZRu(com.bytedance.sdk.component.Mm.NOt.mZ mZVar, IOException iOException) {
                    ZRu zRu2 = zRu;
                    if (zRu2 != null) {
                        zRu2.ZRu(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.ZH.ZRu.ZRu> ZRu(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return mZ.ZRu().ZRu(str);
    }

    public String ZRu(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.ZH.ZRu.ZRu ZRu2 = ZRu(a.a(str, "_", str2), str3);
        if (ZRu2 == null) {
            return null;
        }
        ZRu(ZRu2);
        return ZRu2.TFq();
    }

    private com.bytedance.sdk.openadsdk.core.ZH.ZRu.ZRu ZRu(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return mZ.ZRu().ZRu(str, str2);
    }

    private void ZRu(final com.bytedance.sdk.openadsdk.core.ZH.ZRu.ZRu zRu) {
        zRu.ZRu(Long.valueOf(System.currentTimeMillis()));
        WD.ZRu(new FA("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.ZH.ZRu.NOt.4
            @Override // java.lang.Runnable
            public void run() {
                mZ.ZRu().ZRu(zRu);
            }
        }, 10);
    }

    public void ZRu(Set<String> set) {
        try {
            mZ.ZRu().ZRu(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}

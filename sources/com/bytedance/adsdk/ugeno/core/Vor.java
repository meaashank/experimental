package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.adsdk.ugeno.NOt.ZRu;
import com.bytedance.adsdk.ugeno.core.TFq;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Vor {
    private TFq FA;
    private oK Ht;
    private sAl Mm;
    private JSONObject NOt;
    private lp TFq;
    private String Vor;
    private JSONObject ZH;
    private Context ZRu;
    private FA aT;
    private com.bytedance.adsdk.ugeno.uR.ZRu.ZRu edo;
    private com.bytedance.adsdk.ugeno.NOt.mZ<View> mZ;
    private Ht uR;
    private boolean lp = true;
    private boolean sAl = false;

    public Vor(Context context) {
        this.ZRu = context;
    }

    public com.bytedance.adsdk.ugeno.NOt.mZ<View> NOt(TFq.ZRu zRu, com.bytedance.adsdk.ugeno.NOt.mZ<View> mZVar) {
        List<TFq.ZRu> listMZ;
        ZRu.C0389ZRu c0389ZRuMZ = null;
        if (!TFq.ZRu(zRu)) {
            return null;
        }
        String strMZ = zRu.mZ();
        NOt nOtZRu = uR.ZRu(strMZ);
        if (nOtZRu == null) {
            Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf(strMZ)));
            return null;
        }
        com.bytedance.adsdk.ugeno.NOt.mZ mZVarZRu = nOtZRu.ZRu(this.ZRu);
        if (mZVarZRu == null) {
            return null;
        }
        mZVarZRu.TFq(com.bytedance.adsdk.ugeno.mZ.NOt.ZRu(zRu.ZRu(), this.NOt));
        mZVarZRu.Ht(strMZ);
        mZVarZRu.NOt(zRu.uR());
        mZVarZRu.ZRu(zRu);
        mZVarZRu.ZRu(this.aT);
        if (mZVar instanceof com.bytedance.adsdk.ugeno.NOt.ZRu) {
            com.bytedance.adsdk.ugeno.NOt.ZRu zRu2 = (com.bytedance.adsdk.ugeno.NOt.ZRu) mZVar;
            mZVarZRu.ZRu(zRu2);
            c0389ZRuMZ = zRu2.mZ();
        }
        Iterator<String> itKeys = zRu.uR().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strZRu = com.bytedance.adsdk.ugeno.mZ.NOt.ZRu(zRu.uR().optString(next), this.NOt);
            mZVarZRu.ZRu(next, strZRu);
            if (c0389ZRuMZ != null) {
                c0389ZRuMZ.ZRu(this.ZRu, next, strZRu);
            }
        }
        if (mZVarZRu instanceof com.bytedance.adsdk.ugeno.NOt.ZRu) {
            List<TFq.ZRu> listTFq = zRu.TFq();
            if (listTFq == null || listTFq.size() <= 0) {
                if (TextUtils.equals(mZVarZRu.WD(), "RecyclerLayout") && (listMZ = this.FA.mZ()) != null && listMZ.size() > 0) {
                    Iterator<TFq.ZRu> it = listMZ.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.NOt.mZ<View> mZVarNOt = NOt(it.next(), mZVarZRu);
                        if (mZVarNOt != null && mZVarNOt.Cox()) {
                            ((com.bytedance.adsdk.ugeno.NOt.ZRu) mZVarZRu).ZRu(mZVarNOt);
                        }
                    }
                }
                return mZVarZRu;
            }
            if (TextUtils.equals(mZVarZRu.WD(), "Swiper") && listTFq.size() != 1) {
                Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            Iterator<TFq.ZRu> it2 = listTFq.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.NOt.mZ<View> mZVarNOt2 = NOt(it2.next(), mZVarZRu);
                if (mZVarNOt2 != null && mZVarNOt2.Cox()) {
                    ((com.bytedance.adsdk.ugeno.NOt.ZRu) mZVarZRu).ZRu(mZVarNOt2);
                }
            }
        }
        if (c0389ZRuMZ != null) {
            mZVarZRu.ZRu(c0389ZRuMZ.ZRu());
        }
        this.mZ = mZVarZRu;
        return mZVarZRu;
    }

    public void ZRu(String str, FA fa2) {
        this.aT = fa2;
        this.Vor = str;
        if (fa2 != null) {
            this.NOt = fa2.ZRu();
        }
    }

    public com.bytedance.adsdk.ugeno.NOt.mZ<View> ZRu(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.NOt = jSONObject2;
        oK oKVar = this.Ht;
        if (oKVar != null) {
            oKVar.ZRu();
        }
        this.FA = new TFq(jSONObject, jSONObject2, jSONObject3);
        this.edo = new com.bytedance.adsdk.ugeno.uR.ZRu.ZRu();
        lp lpVar = this.TFq;
        if (lpVar instanceof com.bytedance.adsdk.ugeno.core.ZRu.ZRu) {
            ((com.bytedance.adsdk.ugeno.core.ZRu.ZRu) lpVar).ZRu(this.FA.NOt());
        }
        this.mZ = ZRu(this.FA.ZRu(), (com.bytedance.adsdk.ugeno.NOt.mZ<View>) null);
        oK oKVar2 = this.Ht;
        if (oKVar2 != null) {
            oKVar2.NOt();
            this.mZ.ZRu(this.Ht);
        }
        ZRu(this.mZ);
        return this.mZ;
    }

    public com.bytedance.adsdk.ugeno.NOt.mZ<View> ZRu(TFq.ZRu zRu, com.bytedance.adsdk.ugeno.NOt.mZ<View> mZVar) {
        List<TFq.ZRu> listMZ;
        ZRu.C0389ZRu c0389ZRuMZ = null;
        if (!TFq.ZRu(zRu)) {
            return null;
        }
        String strMZ = zRu.mZ();
        NOt nOtZRu = uR.ZRu(strMZ);
        if (nOtZRu == null) {
            Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf(strMZ)));
            return null;
        }
        com.bytedance.adsdk.ugeno.NOt.mZ mZVarZRu = nOtZRu.ZRu(this.ZRu);
        if (mZVarZRu == null) {
            return null;
        }
        JSONObject jSONObjectUR = zRu.uR();
        mZVarZRu.TFq(com.bytedance.adsdk.ugeno.mZ.NOt.ZRu(zRu.ZRu(), this.NOt));
        mZVarZRu.Ht(strMZ);
        mZVarZRu.NOt(jSONObjectUR);
        mZVarZRu.ZRu(zRu);
        mZVarZRu.ZRu(this.FA.uR());
        mZVarZRu.ZRu(this.aT);
        mZVarZRu.ZRu(this.edo);
        Iterator<String> itKeys = jSONObjectUR.keys();
        if (mZVar instanceof com.bytedance.adsdk.ugeno.NOt.ZRu) {
            com.bytedance.adsdk.ugeno.NOt.ZRu zRu2 = (com.bytedance.adsdk.ugeno.NOt.ZRu) mZVar;
            c0389ZRuMZ = zRu2.mZ();
            mZVarZRu.ZRu(zRu2);
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strZRu = com.bytedance.adsdk.ugeno.mZ.NOt.ZRu(jSONObjectUR.optString(next), this.NOt);
            mZVarZRu.ZRu(next, strZRu);
            if (c0389ZRuMZ != null) {
                c0389ZRuMZ.ZRu(this.ZRu, next, strZRu);
            }
        }
        if (c0389ZRuMZ != null) {
            mZVarZRu.ZRu(c0389ZRuMZ.ZRu());
        }
        if (mZVarZRu instanceof com.bytedance.adsdk.ugeno.NOt.ZRu) {
            List<TFq.ZRu> listTFq = zRu.TFq();
            if (listTFq != null && listTFq.size() > 0) {
                if (TextUtils.equals(mZVarZRu.WD(), "Swiper") && listTFq.size() != 1) {
                    Log.e("UGTemplateEngine", "Swiper must be only one widget");
                }
                Iterator<TFq.ZRu> it = listTFq.iterator();
                while (it.hasNext()) {
                    com.bytedance.adsdk.ugeno.NOt.mZ<View> mZVarZRu2 = ZRu(it.next(), (com.bytedance.adsdk.ugeno.NOt.mZ<View>) mZVarZRu);
                    if (mZVarZRu2 != null && mZVarZRu2.Cox()) {
                        ((com.bytedance.adsdk.ugeno.NOt.ZRu) mZVarZRu).ZRu(mZVarZRu2, mZVarZRu2.le());
                    }
                }
            } else {
                if (TextUtils.equals(mZVarZRu.WD(), "RecyclerLayout") && (listMZ = this.FA.mZ()) != null && listMZ.size() > 0) {
                    Iterator<TFq.ZRu> it2 = listMZ.iterator();
                    while (it2.hasNext()) {
                        com.bytedance.adsdk.ugeno.NOt.mZ<View> mZVarZRu3 = ZRu(it2.next(), (com.bytedance.adsdk.ugeno.NOt.mZ<View>) mZVarZRu);
                        if (mZVarZRu3 != null && mZVarZRu3.Cox()) {
                            ((com.bytedance.adsdk.ugeno.NOt.ZRu) mZVarZRu).ZRu(mZVarZRu3);
                        }
                    }
                }
                return mZVarZRu;
            }
        }
        this.mZ = mZVarZRu;
        return mZVarZRu;
    }

    public void NOt(JSONObject jSONObject) {
        oK oKVar = this.Ht;
        if (oKVar != null) {
            oKVar.mZ();
        }
        this.NOt = jSONObject;
        ZRu(this.mZ, jSONObject);
        ZRu(this.mZ);
        if (this.Ht != null) {
            edo edoVar = new edo();
            edoVar.ZRu(0);
            edoVar.ZRu(this.mZ);
            this.Ht.ZRu(edoVar);
        }
    }

    private void NOt(com.bytedance.adsdk.ugeno.NOt.mZ mZVar) {
        try {
            if (!mZVar.Nb() || mZVar.fcs() == null || mZVar.fcs().Ht() == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("i18n", mZVar.fcs().Ht());
            this.NOt.put("xNode", jSONObject);
        } catch (Exception unused) {
        }
    }

    public com.bytedance.adsdk.ugeno.NOt.mZ<View> ZRu(JSONObject jSONObject) {
        oK oKVar = this.Ht;
        if (oKVar != null) {
            oKVar.ZRu();
        }
        TFq tFq = new TFq(jSONObject, this.NOt);
        this.FA = tFq;
        lp lpVar = this.TFq;
        if (lpVar instanceof com.bytedance.adsdk.ugeno.core.ZRu.ZRu) {
            ((com.bytedance.adsdk.ugeno.core.ZRu.ZRu) lpVar).ZRu(tFq.NOt());
        }
        this.mZ = NOt(this.FA.ZRu(), null);
        oK oKVar2 = this.Ht;
        if (oKVar2 != null) {
            oKVar2.NOt();
            this.mZ.ZRu(this.Ht);
        }
        return this.mZ;
    }

    public void ZRu(com.bytedance.adsdk.ugeno.NOt.mZ mZVar, JSONObject jSONObject) {
        if (mZVar == null) {
            return;
        }
        if (mZVar instanceof com.bytedance.adsdk.ugeno.NOt.ZRu) {
            mZVar.ZRu(jSONObject);
            List<com.bytedance.adsdk.ugeno.NOt.mZ<View>> listZRu = ((com.bytedance.adsdk.ugeno.NOt.ZRu) mZVar).ZRu();
            if (listZRu == null || listZRu.size() <= 0) {
                return;
            }
            Iterator<com.bytedance.adsdk.ugeno.NOt.mZ<View>> it = listZRu.iterator();
            while (it.hasNext()) {
                ZRu(it.next(), jSONObject);
            }
            return;
        }
        mZVar.ZRu(jSONObject);
    }

    private void ZRu(com.bytedance.adsdk.ugeno.NOt.mZ<View> mZVar) {
        List<com.bytedance.adsdk.ugeno.NOt.mZ<View>> listZRu;
        if (mZVar == null) {
            return;
        }
        JSONObject jSONObjectXY = mZVar.xY();
        Iterator<String> itKeys = jSONObjectXY.keys();
        com.bytedance.adsdk.ugeno.NOt.ZRu zRuVdW = mZVar.VdW();
        ZRu.C0389ZRu c0389ZRuMZ = zRuVdW != null ? zRuVdW.mZ() : null;
        NOt(mZVar);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strZRu = com.bytedance.adsdk.ugeno.mZ.NOt.ZRu(jSONObjectXY.optString(next), this.NOt);
            mZVar.ZRu(next, strZRu);
            if (c0389ZRuMZ != null) {
                c0389ZRuMZ.ZRu(this.ZRu, next, strZRu);
            }
        }
        mZVar.ZRu(this.uR);
        mZVar.ZRu(this.TFq);
        mZVar.ZRu(this.Mm);
        if ((mZVar instanceof com.bytedance.adsdk.ugeno.NOt.ZRu) && (listZRu = ((com.bytedance.adsdk.ugeno.NOt.ZRu) mZVar).ZRu()) != null && listZRu.size() > 0) {
            Iterator<com.bytedance.adsdk.ugeno.NOt.mZ<View>> it = listZRu.iterator();
            while (it.hasNext()) {
                ZRu(it.next());
            }
        }
        if (c0389ZRuMZ != null) {
            mZVar.ZRu(c0389ZRuMZ.ZRu());
        }
        mZVar.NOt();
    }

    public void ZRu(lp lpVar) {
        com.bytedance.adsdk.ugeno.core.ZRu.ZRu zRu = new com.bytedance.adsdk.ugeno.core.ZRu.ZRu(lpVar);
        zRu.ZRu(this.ZH);
        zRu.ZRu(this.lp);
        zRu.NOt(this.sAl);
        TFq tFq = this.FA;
        if (tFq != null) {
            zRu.ZRu(tFq.NOt());
        }
        this.TFq = zRu;
    }

    public void ZRu(sAl sal) {
        this.Mm = sal;
    }
}

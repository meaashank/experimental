package com.bytedance.sdk.component.ZRu;

import Z3.f;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.e;
import android.text.TextUtils;
import com.bytedance.sdk.component.ZRu.Mm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZRu {
    Mm Mm;
    protected sAl NOt;
    protected String TFq;
    protected Context ZRu;
    protected FA mZ;
    protected Handler uR = new Handler(Looper.getMainLooper());
    protected volatile boolean Ht = false;
    private final Map<String, Mm> FA = new HashMap();

    public void NOt() {
        this.Mm.ZRu();
        Iterator<Mm> it = this.FA.values().iterator();
        while (it.hasNext()) {
            it.next().ZRu();
        }
        this.uR.removeCallbacksAndMessages(null);
        this.Ht = true;
    }

    public abstract void NOt(aT aTVar);

    public abstract Context ZRu(aT aTVar);

    public abstract String ZRu();

    public abstract void ZRu(String str);

    public void invokeMethod(final String str) {
        if (this.Ht) {
            return;
        }
        this.uR.post(new Runnable() { // from class: com.bytedance.sdk.component.ZRu.ZRu.1
            @Override // java.lang.Runnable
            public void run() {
                yBV ybvZRu;
                if (ZRu.this.Ht) {
                    return;
                }
                try {
                    ybvZRu = ZRu.this.ZRu(new JSONObject(str));
                } catch (Exception unused) {
                    ybvZRu = null;
                }
                if (!yBV.ZRu(ybvZRu)) {
                    ZRu.this.ZRu(ybvZRu);
                    return;
                }
                Objects.toString(ybvZRu);
                if (ybvZRu != null) {
                    ZRu.this.NOt(ru.ZRu(new qF(ybvZRu.ZRu, "Failed to parse invocation.")), ybvZRu);
                }
            }
        });
    }

    public void ZRu(String str, yBV ybv) {
        ZRu(str);
    }

    public final void ZRu(yBV ybv) {
        String strZRu;
        if (this.Ht || (strZRu = ZRu()) == null) {
            return;
        }
        Mm mmNOt = NOt(ybv.Mm);
        if (mmNOt == null) {
            ybv.toString();
            if (this.NOt != null) {
                ZRu();
            }
            NOt(ru.ZRu(new qF(-4, e.a(new StringBuilder("Namespace "), ybv.Mm, " unknown."))), ybv);
            return;
        }
        Ht ht = new Ht();
        ht.NOt = strZRu;
        ht.ZRu = this.ZRu;
        ht.mZ = mmNOt;
        try {
            Mm.ZRu ZRu = mmNOt.ZRu(ybv, ht);
            if (ZRu == null) {
                ybv.toString();
                if (this.NOt != null) {
                    ZRu();
                }
                NOt(ru.ZRu(new qF(-2, "Function " + ybv.uR + " is not registered.")), ybv);
                return;
            }
            if (ZRu.ZRu) {
                NOt(ZRu.NOt, ybv);
            }
            if (this.NOt != null) {
                ZRu();
            }
        } catch (Exception e10) {
            ybv.toString();
            NOt(ru.ZRu(e10), ybv);
        }
    }

    public final void NOt(String str, yBV ybv) {
        JSONObject jSONObject;
        if (this.Ht || TextUtils.isEmpty(ybv.Ht)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            Vor.ZRu(new IllegalArgumentException("Illegal callback data: ".concat(str)));
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        ZRu(oK.ZRu().ZRu("__msg_type", "callback").ZRu("__callback_id", ybv.Ht).ZRu("__params", jSONObject).NOt(), ybv);
    }

    private Mm NOt(String str) {
        if (!TextUtils.equals(str, this.TFq) && !TextUtils.isEmpty(str)) {
            return this.FA.get(str);
        }
        return this.Mm;
    }

    public final void ZRu(aT aTVar, to toVar) {
        this.ZRu = ZRu(aTVar);
        this.mZ = aTVar.uR;
        this.NOt = aTVar.Vor;
        this.Mm = new Mm(aTVar, this, toVar);
        this.TFq = aTVar.ZH;
        NOt(aTVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public yBV ZRu(JSONObject jSONObject) {
        String strOptString;
        if (this.Ht) {
            return null;
        }
        String strOptString2 = jSONObject.optString("__callback_id");
        String strOptString3 = jSONObject.optString("func");
        if (ZRu() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String strValueOf = "";
            try {
                Object objOpt = jSONObject.opt("params");
                if (objOpt == null) {
                    strOptString = strValueOf;
                } else if (objOpt instanceof JSONObject) {
                    strOptString = String.valueOf((JSONObject) objOpt);
                } else {
                    if (objOpt instanceof String) {
                        strValueOf = (String) objOpt;
                    } else {
                        strValueOf = String.valueOf(objOpt);
                    }
                    strOptString = strValueOf;
                }
            } catch (Throwable unused) {
                strOptString = jSONObject.optString("params");
            }
            String string2 = jSONObject.getString("JSSDK");
            String strOptString4 = jSONObject.optString(f.f79414k);
            return yBV.ZRu().ZRu(string2).NOt(string).mZ(strOptString3).uR(strOptString).TFq(strOptString2).Ht(strOptString4).Mm(jSONObject.optString("__iframe_url")).ZRu();
        } catch (JSONException unused2) {
            return yBV.ZRu(strOptString2, -1);
        }
    }
}

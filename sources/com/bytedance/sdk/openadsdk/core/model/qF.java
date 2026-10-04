package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.utils.Yx;
import com.bytedance.sdk.openadsdk.utils.fWk;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qF {
    private long Mm = 0;
    protected boolean NOt = false;
    protected boolean ZRu;
    public static final String mZ = a.a("_", new CharSequence[]{"is", Yx.to()});
    public static final String uR = a.a("_", new CharSequence[]{"is", Yx.to(), "sample"});
    public static final String TFq = a.a("_", new CharSequence[]{Yx.to(), "strategy"});
    protected static int Ht = 330;

    public static class ZRu {
        private List<Integer> FA;
        private String Ht;
        private String Mm;
        private String NOt;
        private String TFq;
        private String Vor;
        private String ZH;
        private String ZRu;
        private String aT;
        private String edo;
        private String lp;
        private String mZ;
        private String sAl;
        private String uR;

        @NonNull
        public static com.bytedance.sdk.openadsdk.core.ZH.Ht.ZRu NOt(ZRu zRu, String str) {
            return new com.bytedance.sdk.openadsdk.core.ZH.Ht.ZRu().ZRu(zRu.Ht()).NOt(zRu.yBV()).mZ(zRu.oK()).uR(zRu.WMI()).TFq(str);
        }

        @NonNull
        public static com.bytedance.sdk.component.adexpress.ZRu.mZ.uR ZRu(ZRu zRu, String str) {
            return com.bytedance.sdk.component.adexpress.ZRu.mZ.uR.ZRu().ZRu(zRu.Ht()).NOt(zRu.Mm()).mZ(zRu.FA()).uR(zRu.Vor()).TFq(zRu.TFq()).Ht(str);
        }

        public String FA() {
            return this.mZ;
        }

        public String Ht() {
            return this.ZRu;
        }

        public String Mm() {
            return this.NOt;
        }

        public String TFq() {
            return this.Ht;
        }

        public String Vor() {
            return this.uR;
        }

        public String WMI() {
            return this.edo;
        }

        public String ZH() {
            return this.Mm;
        }

        public String aT() {
            return this.TFq;
        }

        public boolean edo() {
            return !TextUtils.isEmpty(this.aT) && this.aT.equals("v3");
        }

        public String lp() {
            return this.ZH;
        }

        public List<Integer> mZ() {
            return this.FA;
        }

        public String oK() {
            return this.lp;
        }

        public String sAl() {
            return this.aT;
        }

        public String uR() {
            return this.Vor;
        }

        public String yBV() {
            return this.sAl;
        }

        public void FA(String str) {
            this.Mm = str;
        }

        public void Ht(String str) {
            this.uR = str;
        }

        public void Mm(String str) {
            this.TFq = str;
        }

        public void TFq(String str) {
            this.mZ = str;
        }

        public void Vor(String str) {
            this.ZH = str;
        }

        public void ZH(String str) {
            this.lp = str;
        }

        public void aT(String str) {
            this.aT = str;
        }

        public void lp(String str) {
            this.sAl = str;
        }

        public void mZ(String str) {
            this.ZRu = str;
        }

        public void sAl(String str) {
            this.edo = str;
        }

        public void uR(String str) {
            this.NOt = str;
        }

        public void NOt(String str) {
            this.Ht = str;
        }

        public void ZRu(List<Integer> list) {
            this.FA = list;
        }

        public void ZRu(String str) {
            this.Vor = str;
        }
    }

    public qF() {
        this.ZRu = false;
        this.ZRu = com.bytedance.sdk.openadsdk.OCA.ZRu.ZRu("is_new_playable", false);
    }

    private static long Ht(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0L);
        }
        return 0L;
    }

    private static double Mm(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    public static boolean TFq(qF qFVar) {
        if (qFVar == null) {
            return false;
        }
        int iWZ = qFVar.wZ();
        return qFVar.wcb() || iWZ == 5 || iWZ == 15 || iWZ == 50;
    }

    public static boolean mZ(qF qFVar) {
        return (qFVar == null || qFVar.Qg() == null || qFVar.Qg().uR() != 7 || xY.Mm(qFVar)) ? false : true;
    }

    public static boolean uR(qF qFVar) {
        return (qFVar == null || qFVar.Qg() == null || qFVar.Qg().ZRu() != 1) ? false : true;
    }

    public abstract boolean ACq();

    public abstract le AK();

    public abstract void AK(int i10);

    public abstract com.bytedance.sdk.openadsdk.core.lp.ZRu AOL();

    public abstract int AZ();

    public abstract int CA();

    public abstract long CF();

    public abstract boolean CH();

    public abstract boolean CTl();

    public abstract String CXy();

    public abstract void Cox(int i10);

    public abstract boolean Cox();

    public abstract boolean DoD();

    public abstract int Ds();

    public abstract void EM();

    public abstract int EZN();

    public abstract void FA(int i10);

    public abstract void FA(String str);

    public abstract void FA(boolean z10);

    public boolean FA() {
        return (TextUtils.isEmpty(Ht()) || TextUtils.isEmpty(Mm())) ? false : true;
    }

    public abstract boolean FFX();

    public abstract String FLA();

    public abstract boolean FW();

    public abstract boolean FqN();

    public abstract String GC();

    public abstract int GE();

    public abstract com.bytedance.sdk.openadsdk.core.ZH.Ht.ZRu Gg();

    public abstract String Gis();

    public abstract com.bytedance.sdk.component.Vor.NOt.ZRu Guy();

    public abstract boolean HCG();

    public abstract String HX();

    public abstract JSONObject HZ();

    public abstract ZRu Ho();

    public abstract void Ho(int i10);

    public abstract String Ht();

    public abstract void Ht(int i10);

    public abstract void Ht(String str);

    public abstract void Ht(boolean z10);

    public abstract String Hvv();

    public abstract void Hvv(int i10);

    public abstract int IJM();

    public abstract ZH IOC();

    @Nullable
    public abstract String IU();

    public abstract int IZ();

    public abstract void Iyd();

    public abstract String JVq();

    public abstract oK Jem();

    public abstract int Jf();

    public abstract boolean KIc();

    public abstract String KuY();

    public abstract JSONObject LO();

    public abstract int LrZ();

    public abstract boolean MEE();

    public abstract List<FilterWord> MO();

    public abstract int MR();

    public abstract void MR(int i10);

    public abstract void MR(String str);

    public abstract List<String> MU();

    public abstract boolean Mf();

    public abstract String Mm();

    public abstract void Mm(int i10);

    public abstract void Mm(String str);

    public abstract void Mm(boolean z10);

    public abstract boolean NBW();

    public long NOt() {
        return this.Mm;
    }

    public abstract void NOt(double d10);

    public abstract void NOt(int i10);

    public abstract void NOt(long j10);

    public abstract void NOt(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt nOt);

    public abstract void NOt(com.bytedance.sdk.openadsdk.core.ZH.Ht.ZRu zRu);

    public abstract void NOt(oK oKVar);

    public abstract void NOt(JSONObject jSONObject);

    public abstract void NOt(boolean z10);

    public abstract int Nb();

    public abstract void Nb(int i10);

    public abstract void Nb(String str);

    public abstract int Nl();

    public abstract String NlY();

    public abstract List<oK> Np();

    public abstract String OCA();

    public abstract void OCA(int i10);

    public abstract void OCA(String str);

    public abstract String Oc();

    public abstract boolean PNj();

    public abstract boolean Pzo();

    public abstract boolean QbX();

    public abstract com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt Qg();

    public abstract void Qg(int i10);

    public abstract int RPV();

    public abstract boolean Rgu();

    public abstract void TFq(int i10);

    public abstract void TFq(String str);

    public abstract void TFq(JSONObject jSONObject);

    public abstract void TFq(boolean z10);

    public abstract boolean TFq();

    public abstract boolean Uf();

    public abstract void VI();

    public abstract int VdW();

    public abstract void VdW(int i10);

    public abstract com.bytedance.sdk.openadsdk.core.ZH.Ht.ZRu Vo();

    public abstract WMI Vor();

    public abstract void Vor(int i10);

    public abstract void Vor(String str);

    public abstract void Vor(boolean z10);

    public abstract int Vr();

    public abstract void Vr(int i10);

    public abstract AdSlot WD();

    public abstract void WD(int i10);

    public abstract int WMI();

    public abstract void WMI(int i10);

    public abstract void WMI(String str);

    public abstract String Wo();

    public abstract String XyE();

    public abstract void YuF();

    public abstract String Yx();

    public abstract void Yx(int i10);

    public abstract uR ZH();

    public abstract void ZH(int i10);

    public abstract void ZH(String str);

    public abstract List<String> ZRJ();

    public abstract void ZRu(double d10);

    public abstract void ZRu(float f10);

    public abstract void ZRu(int i10);

    public abstract void ZRu(int i10, int i11);

    public abstract void ZRu(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt nOt);

    public abstract void ZRu(AdSlot adSlot);

    public abstract void ZRu(FilterWord filterWord);

    public abstract void ZRu(com.bytedance.sdk.openadsdk.core.ZH.Ht.ZRu zRu);

    public abstract void ZRu(com.bytedance.sdk.openadsdk.core.lp.ZRu zRu);

    public abstract void ZRu(TFq tFq);

    public abstract void ZRu(Vor vor);

    public abstract void ZRu(WMI wmi);

    public abstract void ZRu(ZH zh);

    public abstract void ZRu(le leVar);

    public abstract void ZRu(lp lpVar);

    public abstract void ZRu(mZ mZVar);

    public abstract void ZRu(oK oKVar);

    public abstract void ZRu(ZRu zRu);

    public abstract void ZRu(sAl sal);

    public abstract void ZRu(to toVar);

    public abstract void ZRu(uR uRVar);

    public abstract void ZRu(xY xYVar);

    public abstract void ZRu(Map<String, Object> map);

    public abstract void ZRu(boolean z10);

    public boolean ZRu() {
        int iYBV = yBV();
        return (xY() != 2 || iYBV == 5 || iYBV == 6 || iYBV == 19 || iYBV == 12) ? false : true;
    }

    public abstract void Zf(int i10);

    public abstract void Zf(String str);

    public abstract boolean Zf();

    public abstract int aNu();

    public abstract TFq aT();

    public abstract void aT(int i10);

    public abstract void aT(String str);

    public abstract void aT(boolean z10);

    public abstract boolean aqk();

    public abstract int bDW();

    public abstract void bO(int i10);

    public abstract boolean bO();

    public abstract int cA();

    public abstract com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt cb();

    public abstract fWk cr();

    public abstract float cvm();

    public abstract int dkT();

    public abstract double eCS();

    public abstract long edo();

    public abstract void edo(int i10);

    public abstract void edo(String str);

    public abstract to elh();

    public abstract int eqw();

    public abstract int fOq();

    public abstract int fWk();

    public abstract void fWk(int i10);

    public abstract String fcs();

    public abstract void fcs(int i10);

    public abstract void fcs(String str);

    public abstract int gI();

    public abstract void gI(int i10);

    public abstract String gX();

    public abstract mZ gaw();

    public abstract List<String> gmt();

    public abstract long gx();

    public abstract boolean hNL();

    public abstract boolean hl();

    public abstract JSONObject jJC();

    public abstract com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt jQo();

    public abstract String jYr();

    public abstract boolean kkl();

    public abstract int klw();

    public abstract int le();

    public abstract String le(String str);

    public abstract void le(int i10);

    public abstract int lp();

    public abstract void lp(int i10);

    public abstract void lp(String str);

    public abstract boolean mGD();

    public abstract void mZ(int i10);

    public abstract void mZ(long j10);

    public abstract void mZ(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt nOt);

    public abstract void mZ(oK oKVar);

    public abstract void mZ(JSONObject jSONObject);

    public abstract void mZ(boolean z10);

    public abstract boolean mg();

    public abstract boolean nqR();

    public abstract String nv();

    public abstract xY oK();

    public abstract void oK(int i10);

    public abstract void oK(String str);

    public abstract boolean oZ();

    public abstract int om();

    public abstract void om(int i10);

    public abstract void om(String str);

    public abstract boolean pD();

    public abstract long pDA();

    public abstract String pU();

    public abstract JSONObject pvl();

    public abstract int qF();

    public abstract void qF(int i10);

    public abstract void qF(String str);

    public abstract JSONObject qZ();

    public abstract boolean qg();

    public abstract int qj();

    public abstract sAl rd();

    public abstract int ru();

    public abstract void ru(int i10);

    public abstract void ru(String str);

    public abstract int sAl();

    public abstract void sAl(int i10);

    public abstract void sAl(String str);

    public abstract Vor th();

    public abstract void th(int i10);

    public abstract int to();

    public abstract void to(int i10);

    public abstract void to(String str);

    public abstract int tp();

    public abstract boolean uJW();

    public abstract void uR(int i10);

    public abstract void uR(JSONObject jSONObject);

    public abstract void uR(boolean z10);

    public abstract boolean uR();

    public abstract String vE();

    public abstract boolean vk();

    public abstract boolean wE();

    public abstract int wZ();

    public abstract boolean wcb();

    public abstract boolean wzV();

    public abstract int xY();

    public abstract void xY(int i10);

    public abstract void xY(String str);

    public abstract int yBV();

    public abstract void yBV(int i10);

    public abstract void yBV(String str);

    public abstract String yM();

    public abstract boolean yx();

    public abstract oK yz();

    public abstract void zG();

    public abstract Map<String, Object> zkn();

    public abstract int zp();

    public abstract int zr();

    public static boolean Ht(qF qFVar) {
        Object obj;
        if (qFVar == null) {
            return false;
        }
        try {
            Map<String, Object> mapZkn = qFVar.zkn();
            if (mapZkn == null || (obj = mapZkn.get(TTAdConstant.SDK_BIDDING_TYPE)) == null) {
                return false;
            }
            return 2 == Integer.parseInt(obj.toString());
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("MaterialMeta", th.getMessage());
            return false;
        }
    }

    public static boolean NOt(qF qFVar) {
        return (ZRu(qFVar) || mZ(qFVar)) ? false : true;
    }

    public static JSONObject mZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("MaterialMeta", e10.getMessage());
            return null;
        }
    }

    public static double NOt(String str) {
        return Mm(mZ(str));
    }

    public static int uR(String str) {
        return ZRu(mZ(str));
    }

    public void ZRu(long j10) {
        this.Mm = j10;
    }

    public static boolean ZRu(qF qFVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (ZRu(qFVar) || z13 || qFVar == null || qFVar.Qg() == null || TextUtils.isEmpty(qFVar.Qg().lp())) {
            return false;
        }
        return mZ(qFVar) ? z12 : (qFVar.Qg() == null || qFVar.Qg().ZRu() != 1) ? z10 : z11;
    }

    public static String NOt(Context context, qF qFVar) {
        if (context != null && qFVar != null) {
            try {
                if (qFVar.IZ() != 8) {
                    if (qFVar.aT().ZRu()) {
                    }
                }
                String strZRu = com.bytedance.sdk.openadsdk.core.act.ZRu.ZRu(context);
                if (TextUtils.isEmpty(strZRu)) {
                    return null;
                }
                return strZRu;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lp.ZRu("MaterialMeta", th.getMessage());
            }
        }
        return null;
    }

    public static qF mZ() {
        return new Zf();
    }

    public static boolean ZRu(qF qFVar) {
        return (qFVar == null || qFVar.Qg() == null || qFVar.Qg().uR() != 1) ? false : true;
    }

    public static com.bytedance.sdk.openadsdk.core.sAl.ZRu.NOt ZRu(String str, qF qFVar) {
        qFVar.Cox(0);
        int iKlw = qFVar.klw();
        int i10 = 3;
        if (iKlw == 3) {
            i10 = 4;
        } else if (iKlw == 7) {
            i10 = 1;
        } else if (iKlw == 8) {
            i10 = 2;
        }
        return new com.bytedance.sdk.openadsdk.core.sAl.ZRu.NOt(str, qFVar.cb(), qFVar.jQo(), qFVar.aNu(), qFVar.IJM(), i10);
    }

    public static long ZRu(String str) {
        return Ht(mZ(str));
    }

    public static int ZRu(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    public static String ZRu(Context context, qF qFVar) {
        if (context == null || qFVar == null || !((qFVar.klw() == 8 || qFVar.klw() == 7) && qFVar.Cox())) {
            return null;
        }
        String strNOt = NOt(context, qFVar);
        if (TextUtils.isEmpty(strNOt) || com.bytedance.sdk.openadsdk.core.act.ZRu.ZRu() != 1) {
            return null;
        }
        return strNOt;
    }
}

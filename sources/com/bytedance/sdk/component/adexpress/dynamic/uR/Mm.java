package com.bytedance.sdk.component.adexpress.dynamic.uR;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.view.E;
import com.bytedance.sdk.component.adexpress.dynamic.TFq.ZH;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Mm {
    private String Ht;
    public String NOt;
    private TFq TFq;
    public int ZRu;
    public JSONObject mZ;
    private Ht uR;

    public Mm(TFq tFq) {
        this.TFq = tFq;
        this.ZRu = tFq.ZRu();
        this.NOt = tFq.mZ();
        this.mZ = tFq.TFq().gaw();
        this.Ht = tFq.uR();
        if (com.bytedance.sdk.component.adexpress.uR.mZ() == 1) {
            this.uR = tFq.Mm();
        } else {
            this.uR = tFq.TFq();
        }
        if (com.bytedance.sdk.component.adexpress.uR.NOt()) {
            this.uR = tFq.TFq();
        }
    }

    private boolean pvl() {
        if (com.bytedance.sdk.component.adexpress.uR.NOt()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.NOt) && this.NOt.contains("adx:")) || ZH.NOt();
    }

    private boolean zkn() {
        return (com.bytedance.sdk.component.adexpress.uR.NOt() && (this.TFq.NOt().contains("logo-union") || this.TFq.NOt().contains("logounion") || this.TFq.NOt().contains("logoad"))) || "logo-union".equals(this.TFq.NOt()) || "logounion".equals(this.TFq.NOt()) || "logoad".equals(this.TFq.NOt());
    }

    public int AK() {
        return this.uR.MO();
    }

    public int CXy() {
        return this.uR.jJC();
    }

    public int Cox() {
        return this.uR.Vor();
    }

    public int FA() {
        String str = this.uR.to();
        if ("left".equals(str)) {
            return 17;
        }
        if ("center".equals(str)) {
            return 4;
        }
        return "right".equals(str) ? 3 : 2;
    }

    public String FFX() {
        return this.uR.le();
    }

    public double GC() {
        return this.uR.Cox();
    }

    public String Gis() {
        return this.uR.VdW();
    }

    public String HX() {
        return this.uR.CA();
    }

    public String Ho() {
        return this.uR.AK();
    }

    public String Ht() {
        return this.ZRu == 0 ? !TextUtils.isEmpty(this.NOt) ? this.NOt : this.mZ.optString(com.bytedance.sdk.component.adexpress.uR.FA.mZ(com.bytedance.sdk.component.adexpress.uR.ZRu())) : "";
    }

    public boolean Hvv() {
        return this.uR.fOq();
    }

    public String IOC() {
        return this.uR.hNL();
    }

    public int IZ() {
        return this.uR.Mm();
    }

    public boolean Jem() {
        return this.uR.bDW();
    }

    public int MO() {
        return this.uR.RPV();
    }

    public long MR() {
        return this.uR.LrZ();
    }

    public String MU() {
        return this.uR.th();
    }

    public int Mm() {
        return ZRu(this.uR.xY());
    }

    public int NBW() {
        return this.uR.rd();
    }

    public int NOt() {
        return (int) this.uR.WMI();
    }

    public int Nb() {
        return ZRu(this.uR.Zf());
    }

    public int Nl() {
        return this.uR.cA();
    }

    public String Np() {
        return this.uR.wcb();
    }

    public boolean OCA() {
        return this.uR.YuF();
    }

    public int Oc() {
        return this.uR.AOL();
    }

    public String Qg() {
        return this.uR.Ho();
    }

    public float TFq() {
        return this.uR.qF();
    }

    public double VdW() {
        return this.uR.FA();
    }

    public int Vor() {
        int iFA = FA();
        if (iFA == 4) {
            return 17;
        }
        if (iFA == 3) {
            return 8388613;
        }
        return E.f111493b;
    }

    public int Vr() {
        return this.uR.wZ();
    }

    public int WD() {
        return this.uR.NOt();
    }

    public float WMI() {
        return this.uR.lp();
    }

    public boolean Wo() {
        return this.uR.HZ();
    }

    public int Yx() {
        return this.uR.uR();
    }

    public String ZH() {
        return this.ZRu == 1 ? this.NOt : "";
    }

    public boolean ZRJ() {
        return this.uR.WD();
    }

    public int ZRu() {
        return (int) this.uR.edo();
    }

    public int Zf() {
        return this.uR.IZ();
    }

    public String aT() {
        int i10 = this.ZRu;
        return (i10 == 2 || i10 == 13) ? this.NOt : "";
    }

    public boolean bO() {
        return this.uR.Wo();
    }

    public double edo() {
        return this.uR.om();
    }

    public int fWk() {
        return this.uR.TFq();
    }

    public int fcs() {
        String strBO = this.uR.bO();
        if ("skip-with-time-skip-btn".equals(this.TFq.NOt()) || "skip".equals(this.TFq.NOt()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.TFq.NOt())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.TFq.NOt()) && !"skip-with-time".equals(this.TFq.NOt())) {
            if (this.ZRu == 10 && TextUtils.equals(this.uR.AK(), "click")) {
                return 5;
            }
            if (zkn() && pvl()) {
                return 0;
            }
            if (zkn()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.TFq.NOt())) {
                return 3;
            }
            if (!TextUtils.isEmpty(strBO) && !strBO.equals("none")) {
                if (strBO.equals("video") || (this.TFq.ZRu() == 7 && TextUtils.equals(strBO, "normal"))) {
                    return (com.bytedance.sdk.component.adexpress.uR.NOt() && this.TFq.TFq() != null && this.TFq.TFq().eqw()) ? 11 : 4;
                }
                if (strBO.equals("normal")) {
                    return 1;
                }
                return (strBO.equals("creative") || "slide".equals(this.uR.AK())) ? 2 : 0;
            }
        }
        return 0;
    }

    public String gI() {
        return this.uR.aT();
    }

    public int gX() {
        return this.uR.Yx();
    }

    public String gaw() {
        return this.uR.IJM();
    }

    public boolean gmt() {
        return this.uR.sAl();
    }

    public String le() {
        return this.uR.JVq();
    }

    public String lp() {
        return this.Ht;
    }

    public int mZ() {
        return (int) this.uR.oK();
    }

    public int nqR() {
        return this.uR.qZ();
    }

    public float oK() {
        return this.uR.ZH();
    }

    public int om() {
        return this.uR.kkl();
    }

    public boolean pDA() {
        return this.uR.bDW();
    }

    public int qF() {
        return this.uR.CH();
    }

    public String ru() {
        return this.uR.bO();
    }

    public double sAl() {
        if (this.ZRu == 11) {
            try {
                return !com.bytedance.sdk.component.adexpress.uR.NOt() ? (int) r0 : Double.parseDouble(this.NOt);
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public int th() {
        return this.uR.mZ();
    }

    public String to() {
        return this.uR.ru();
    }

    public int uR() {
        return (int) this.uR.yBV();
    }

    public double vE() {
        return this.uR.gI();
    }

    public int wZ() {
        return this.uR.CTl();
    }

    public boolean xY() {
        return this.uR.Hvv();
    }

    public int yBV() {
        return ZRu(this.uR.MR());
    }

    public int yM() {
        return this.uR.fWk();
    }

    public int yz() {
        return this.uR.Pzo();
    }

    public static float[] NOt(String str) {
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        return (strArrSplit == null || strArrSplit.length != 4) ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : new float[]{Float.parseFloat(strArrSplit[0]), Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[2]), Float.parseFloat(strArrSplit[3])};
    }

    public void ZRu(float f10) {
        this.uR.ZRu(f10);
    }

    public static int ZRu(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null) {
            try {
                if (strArrSplit.length == 4) {
                    return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return -16777216;
    }

    public boolean ZRu(int i10) {
        TFq tFq = this.TFq;
        if (tFq == null) {
            return false;
        }
        if (i10 == 1) {
            this.uR = tFq.Mm();
        } else {
            this.uR = tFq.TFq();
        }
        return this.uR != null;
    }
}

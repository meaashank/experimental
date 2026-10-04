package com.bytedance.sdk.component.adexpress.dynamic.uR;

import android.text.TextUtils;
import androidx.multidex.d;
import com.prism.gaia.server.accounts.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class FA {
    private float FA;
    private float Ht;
    private float Mm;
    private float NOt;
    private float TFq;
    private TFq Vor;
    private FA ZH;
    private String ZRu;
    private List<FA> aT;
    private boolean edo;
    private List<List<FA>> lp;
    private float mZ;
    private String sAl;
    private float uR;
    private Map<String, String> oK = new HashMap();
    private Map<Integer, String> yBV = new HashMap();

    public float FA() {
        return this.Ht;
    }

    public float Ht() {
        return this.NOt;
    }

    public float Mm() {
        return this.mZ;
    }

    public Map<Integer, String> NOt() {
        return this.yBV;
    }

    public Map<String, String> OCA() {
        return this.oK;
    }

    public float TFq() {
        return this.TFq;
    }

    public float Vor() {
        return this.Mm;
    }

    public List<List<FA>> WMI() {
        return this.lp;
    }

    public List<FA> ZH() {
        return this.aT;
    }

    public String ZRu() {
        return this.sAl;
    }

    public String Zf() {
        return this.Vor.TFq().Zf();
    }

    public TFq aT() {
        return this.Vor;
    }

    public int edo() {
        Ht htTFq = this.Vor.TFq();
        return htTFq.NBW() + htTFq.nqR();
    }

    public FA lp() {
        return this.ZH;
    }

    public String mZ() {
        return this.ZRu;
    }

    public float oK() {
        Ht htTFq = this.Vor.TFq();
        return (htTFq.lp() * 2.0f) + htTFq.yBV() + htTFq.oK() + sAl();
    }

    public boolean om() {
        return this.edo;
    }

    public boolean qF() {
        List<FA> list = this.aT;
        return list == null || list.size() <= 0;
    }

    public boolean ru() {
        return this.Vor.TFq().FFX() < 0 || this.Vor.TFq().zkn() < 0 || this.Vor.TFq().CXy() < 0 || this.Vor.TFq().pDA() < 0;
    }

    public int sAl() {
        Ht htTFq = this.Vor.TFq();
        return htTFq.yz() + htTFq.Nl();
    }

    public void to() {
        List<List<FA>> list = this.lp;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<FA> list2 : this.lp) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.lp = arrayList;
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.ZRu + "', x=" + this.NOt + ", y=" + this.mZ + ", width=" + this.Ht + ", height=" + this.Mm + ", remainWidth=" + this.FA + ", rootBrick=" + this.Vor + ", childrenBrickUnits=" + this.aT + '}';
    }

    public float uR() {
        return this.uR;
    }

    public boolean xY() {
        return TextUtils.equals(this.Vor.TFq().Nb(), "flex");
    }

    public float yBV() {
        Ht htTFq = this.Vor.TFq();
        return (htTFq.lp() * 2.0f) + htTFq.edo() + htTFq.WMI() + edo();
    }

    public void Ht(float f10) {
        this.Mm = f10;
    }

    public void Mm(float f10) {
        this.FA = f10;
    }

    public void NOt(String str) {
        this.ZRu = str;
    }

    public void TFq(float f10) {
        this.Ht = f10;
    }

    public void ZRu(String str) {
        this.sAl = str;
    }

    public void mZ(float f10) {
        this.NOt = f10;
    }

    public void uR(float f10) {
        this.mZ = f10;
    }

    public void NOt(float f10) {
        this.TFq = f10;
    }

    public void ZRu(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    this.yBV.put(Integer.valueOf(jSONObjectOptJSONObject.optInt("id")), jSONObjectOptJSONObject.optString("value"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void mZ(String str) {
        this.Vor.TFq().Ht(str);
    }

    public void NOt(List<List<FA>> list) {
        this.lp = list;
    }

    public void ZRu(float f10) {
        this.uR = f10;
    }

    public void ZRu(TFq tFq) {
        this.Vor = tFq;
    }

    public void ZRu(List<FA> list) {
        this.aT = list;
    }

    public void ZRu(FA fa2) {
        this.ZH = fa2;
    }

    public void ZRu(boolean z10) {
        this.edo = z10;
    }

    public void ZRu(String str, String str2) {
        this.oK.put(str, str2);
    }

    public String ZRu(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.Vor.NOt());
        sb2.append(b.f166434b0);
        sb2.append(this.ZRu);
        if (this.Vor.TFq() != null) {
            sb2.append(b.f166434b0);
            sb2.append(this.Vor.TFq().Ds());
        }
        return d.a(sb2, b.f166434b0, i10);
    }
}

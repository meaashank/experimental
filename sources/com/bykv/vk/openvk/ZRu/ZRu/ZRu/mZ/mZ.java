package com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mZ implements Serializable {
    private NOt Ht;
    private String Mm;
    public int NOt;
    private NOt TFq;
    private boolean WMI;
    private String ZH;
    public String ZRu;
    private String edo;
    private int lp;
    private long oK;
    private int om;
    private int qF;
    private int sAl;
    public int uR;
    private boolean yBV;
    private int FA = 204800;
    private int Vor = 0;
    private int aT = 0;
    public final HashMap<String, Object> mZ = new HashMap<>();
    private int OCA = 10000;
    private int to = 10000;
    private int xY = 10000;
    private int Zf = 0;
    private JSONObject ru = new JSONObject();

    public mZ(String str, NOt nOt, NOt nOt2, int i10, int i11) {
        this.qF = 0;
        this.om = 0;
        this.Mm = str;
        this.TFq = nOt;
        this.Ht = nOt2;
        this.qF = i10;
        this.om = i11;
    }

    public boolean FA() {
        return this.yBV;
    }

    public int Ht() {
        return this.sAl;
    }

    public long Mm() {
        return this.oK;
    }

    public String NOt() {
        return this.Mm;
    }

    public NOt OCA() {
        return this.TFq;
    }

    public int TFq() {
        return this.lp;
    }

    public long Vor() {
        if (ZH()) {
            return this.Ht.TFq();
        }
        NOt nOt = this.TFq;
        if (nOt != null) {
            return nOt.TFq();
        }
        return 0L;
    }

    public int WMI() {
        return this.to;
    }

    public boolean ZH() {
        NOt nOt;
        if (this.om != 1 || (nOt = this.Ht) == null || TextUtils.isEmpty(nOt.ZH())) {
            return false;
        }
        return com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.Ht() == 2 ? Build.VERSION.SDK_INT >= 26 : this.qF == 1;
    }

    public int ZRu() {
        return this.ru.optInt("pitaya_cache_size", 0);
    }

    public boolean aT() {
        if (ZH()) {
            return this.Ht.to();
        }
        NOt nOt = this.TFq;
        if (nOt != null) {
            return nOt.to();
        }
        return true;
    }

    public String edo() {
        if (ZH()) {
            return this.Ht.edo();
        }
        NOt nOt = this.TFq;
        if (nOt != null) {
            return nOt.edo();
        }
        return null;
    }

    public float lp() {
        if (ZH()) {
            return this.Ht.FA();
        }
        NOt nOt = this.TFq;
        if (nOt != null) {
            return nOt.FA();
        }
        return -1.0f;
    }

    public int mZ() {
        if (ZH()) {
            return this.Ht.oK();
        }
        NOt nOt = this.TFq;
        if (nOt != null) {
            return nOt.oK();
        }
        return 0;
    }

    public int oK() {
        return this.qF;
    }

    public int om() {
        return this.Zf;
    }

    public int qF() {
        return this.xY;
    }

    public String sAl() {
        if (ZH()) {
            return this.Ht.ZH();
        }
        NOt nOt = this.TFq;
        if (nOt != null) {
            return nOt.ZH();
        }
        return null;
    }

    public NOt to() {
        return this.Ht;
    }

    public boolean uR() {
        return this.WMI;
    }

    public int yBV() {
        return this.OCA;
    }

    public void Ht(int i10) {
        this.xY = i10;
    }

    public void Mm(int i10) {
        this.Zf = i10;
    }

    public void NOt(String str) {
        this.ZH = str;
    }

    public synchronized Object TFq(String str) {
        return this.mZ.get(str);
    }

    public void ZRu(String str) {
        this.Mm = str;
    }

    public void uR(String str) {
        this.ZRu = str;
    }

    public void NOt(int i10) {
        this.sAl = i10;
    }

    public void TFq(int i10) {
        this.to = i10;
    }

    public void ZRu(int i10) {
        this.lp = i10;
    }

    public void uR(int i10) {
        this.OCA = i10;
    }

    public void ZRu(long j10) {
        this.oK = j10;
    }

    public void ZRu(boolean z10) {
        this.yBV = z10;
    }

    public void mZ(String str) {
        this.edo = str;
    }

    public synchronized void ZRu(String str, Object obj) {
        this.mZ.put(str, obj);
    }

    public void mZ(int i10) {
        this.NOt = i10;
    }
}

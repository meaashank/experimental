package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.NOt.mZ;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s0.x;
import u4.g;

/* JADX INFO: loaded from: classes3.dex */
public class aT {
    private final float FA;
    private final float Ht;
    private final float Mm;
    private final int[] NOt;
    private final float TFq;
    private final long Vor;
    private final JSONObject WMI;
    private final int ZH;
    private final int[] ZRu;
    private final long aT;
    private final int edo;
    private final int lp;
    private final int[] mZ;
    private final SparseArray<mZ.ZRu> oK;
    private final JSONObject om;
    private final String qF;
    private final int sAl;
    private final int[] uR;
    private final int yBV;

    public static class ZRu {
        private float FA;
        private float Ht;
        private float Mm;
        int NOt;
        private int OCA;
        private long TFq;
        private float Vor;
        private SparseArray<mZ.ZRu> WMI;
        private int[] ZH;
        float ZRu;
        private int[] aT;
        private int edo;
        private int[] lp;
        float mZ;
        private int oK;
        private String om;
        private int qF;
        private int[] sAl;
        private JSONObject to;
        private long uR;
        private JSONObject xY;
        private int yBV;

        public ZRu Ht(float f10) {
            this.Vor = f10;
            return this;
        }

        public ZRu NOt(JSONObject jSONObject) {
            this.xY = jSONObject;
            return this;
        }

        public ZRu TFq(float f10) {
            this.FA = f10;
            return this;
        }

        public ZRu ZRu(int i10) {
            this.OCA = i10;
            return this;
        }

        public ZRu mZ(int i10) {
            this.NOt = i10;
            return this;
        }

        public ZRu uR(float f10) {
            this.Mm = f10;
            return this;
        }

        public ZRu Ht(int i10) {
            this.yBV = i10;
            return this;
        }

        public ZRu NOt(int i10) {
            this.qF = i10;
            return this;
        }

        public ZRu TFq(int i10) {
            this.oK = i10;
            return this;
        }

        public ZRu ZRu(JSONObject jSONObject) {
            this.to = jSONObject;
            return this;
        }

        public ZRu mZ(float f10) {
            this.Ht = f10;
            return this;
        }

        public ZRu uR(int[] iArr) {
            this.sAl = iArr;
            return this;
        }

        public ZRu NOt(float f10) {
            this.mZ = f10;
            return this;
        }

        public ZRu ZRu(SparseArray<mZ.ZRu> sparseArray) {
            this.WMI = sparseArray;
            return this;
        }

        public ZRu mZ(int[] iArr) {
            this.lp = iArr;
            return this;
        }

        public ZRu uR(int i10) {
            this.edo = i10;
            return this;
        }

        public ZRu NOt(long j10) {
            this.TFq = j10;
            return this;
        }

        public ZRu ZRu(float f10) {
            this.ZRu = f10;
            return this;
        }

        public ZRu NOt(int[] iArr) {
            this.ZH = iArr;
            return this;
        }

        public ZRu ZRu(long j10) {
            this.uR = j10;
            return this;
        }

        public ZRu ZRu(int[] iArr) {
            this.aT = iArr;
            return this;
        }

        public ZRu ZRu(String str) {
            this.om = str;
            return this;
        }

        public aT ZRu() {
            return new aT(this);
        }
    }

    public JSONObject ZRu() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.om;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.putOpt(next, this.om.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.ZRu;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.ZRu[1]));
            }
            int[] iArr2 = this.NOt;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt(InMobiNetworkValues.WIDTH, Integer.valueOf(iArr2[0])).putOpt(InMobiNetworkValues.HEIGHT, Integer.valueOf(this.NOt[1]));
            }
            int[] iArr3 = this.mZ;
            if (iArr3 != null && iArr3.length == 2) {
                jSONObject.putOpt("button_x", Integer.valueOf(iArr3[0])).putOpt("button_y", Integer.valueOf(this.mZ[1]));
            }
            int[] iArr4 = this.uR;
            if (iArr4 != null && iArr4.length == 2) {
                jSONObject.putOpt("button_width", Integer.valueOf(iArr4[0])).putOpt("button_height", Integer.valueOf(this.uR[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.TFq)).putOpt("down_y", Float.toString(this.Ht)).putOpt("up_x", Float.toString(this.Mm)).putOpt("up_y", Float.toString(this.FA)).putOpt("down_time", Long.valueOf(this.Vor)).putOpt("up_time", Long.valueOf(this.aT)).putOpt("toolType", Integer.valueOf(this.ZH)).putOpt("deviceId", Integer.valueOf(this.lp)).putOpt("source", Integer.valueOf(this.sAl)).putOpt("ft", ZRu(this.oK, this.edo)).putOpt("click_area_type", this.qF);
            int i10 = this.yBV;
            if (i10 > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i10));
            }
            JSONObject jSONObject3 = this.WMI;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    private aT(@NonNull ZRu zRu) {
        this.ZRu = zRu.ZH;
        this.NOt = zRu.lp;
        this.uR = zRu.sAl;
        this.mZ = zRu.aT;
        this.TFq = zRu.Vor;
        this.Ht = zRu.FA;
        this.Mm = zRu.Mm;
        this.FA = zRu.Ht;
        this.Vor = zRu.TFq;
        this.aT = zRu.uR;
        this.ZH = zRu.edo;
        this.lp = zRu.oK;
        this.sAl = zRu.yBV;
        this.edo = zRu.qF;
        this.oK = zRu.WMI;
        this.qF = zRu.om;
        this.yBV = zRu.OCA;
        this.WMI = zRu.to;
        this.om = zRu.xY;
    }

    public static JSONObject ZRu(SparseArray<mZ.ZRu> sparseArray, int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    mZ.ZRu zRuValueAt = sparseArray.valueAt(i11);
                    if (zRuValueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt(g.f239555d, Double.valueOf(zRuValueAt.mZ)).putOpt("mr", Double.valueOf(zRuValueAt.NOt)).putOpt(x.c.f238294S, Integer.valueOf(zRuValueAt.ZRu)).putOpt(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(zRuValueAt.uR));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i10)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}

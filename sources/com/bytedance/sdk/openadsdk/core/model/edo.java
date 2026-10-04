package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.NOt.mZ;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class edo implements com.bytedance.sdk.component.adexpress.mZ {
    public final int FA;
    public final long Ht;
    public final int Mm;
    public final float NOt;
    public final long TFq;
    public final int Vor;
    public JSONObject WMI;
    public final String ZH;
    public final float ZRu;
    public final int aT;
    public SparseArray<mZ.ZRu> edo;
    public int lp;
    public final float mZ;
    public final boolean oK;
    public boolean qF;
    public JSONObject sAl;
    public final float uR;
    public int yBV;

    public static class ZRu {
        private int FA;
        private float Ht;
        private float Mm;
        private long NOt;
        private float TFq;
        private int Vor;
        private int ZH;
        private int aT;
        private JSONObject edo;
        private String lp;
        private long mZ;
        private int oK;
        private boolean qF;
        private int sAl;
        private float uR;
        private JSONObject yBV;
        private boolean WMI = false;
        protected SparseArray<mZ.ZRu> ZRu = new SparseArray<>();

        public ZRu Ht(int i10) {
            this.ZH = i10;
            return this;
        }

        public ZRu NOt(int i10) {
            this.sAl = i10;
            return this;
        }

        public ZRu TFq(int i10) {
            this.aT = i10;
            return this;
        }

        public ZRu ZRu(int i10) {
            this.oK = i10;
            return this;
        }

        public ZRu mZ(float f10) {
            this.Ht = f10;
            return this;
        }

        public ZRu uR(float f10) {
            this.Mm = f10;
            return this;
        }

        public ZRu NOt(long j10) {
            this.mZ = j10;
            return this;
        }

        public ZRu ZRu(JSONObject jSONObject) {
            this.edo = jSONObject;
            return this;
        }

        public ZRu mZ(int i10) {
            this.FA = i10;
            return this;
        }

        public ZRu uR(int i10) {
            this.Vor = i10;
            return this;
        }

        public ZRu NOt(float f10) {
            this.TFq = f10;
            return this;
        }

        public ZRu ZRu(boolean z10) {
            this.qF = z10;
            return this;
        }

        public ZRu NOt(JSONObject jSONObject) {
            this.yBV = jSONObject;
            return this;
        }

        public ZRu ZRu(long j10) {
            this.NOt = j10;
            return this;
        }

        public ZRu NOt(boolean z10) {
            this.WMI = z10;
            return this;
        }

        public ZRu ZRu(float f10) {
            this.uR = f10;
            return this;
        }

        public ZRu ZRu(String str) {
            this.lp = str;
            return this;
        }

        public ZRu ZRu(SparseArray<mZ.ZRu> sparseArray) {
            this.ZRu = sparseArray;
            return this;
        }

        public edo ZRu() {
            return new edo(this);
        }
    }

    private edo(@NonNull ZRu zRu) {
        this.qF = false;
        this.ZRu = zRu.Mm;
        this.NOt = zRu.Ht;
        this.mZ = zRu.TFq;
        this.uR = zRu.uR;
        this.TFq = zRu.mZ;
        this.Ht = zRu.NOt;
        this.Mm = zRu.FA;
        this.FA = zRu.Vor;
        this.Vor = zRu.aT;
        this.aT = zRu.ZH;
        this.ZH = zRu.lp;
        this.edo = zRu.ZRu;
        this.oK = zRu.qF;
        this.lp = zRu.sAl;
        this.sAl = zRu.edo;
        this.yBV = zRu.oK;
        this.WMI = zRu.yBV;
        this.qF = zRu.WMI;
    }
}

package com.bytedance.sdk.openadsdk.edo.ZRu;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.bytedance.sdk.component.NOt.ZRu.edo;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.openadsdk.utils.WD;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TFq {
    public static int ZRu = -10;
    private int FA;
    private long Ht;
    private int Mm;
    private final int NOt;
    private long TFq;
    private boolean Vor;
    private int ZH;
    private String aT;
    private String mZ;
    private long uR;

    public TFq(int i10) {
        this.NOt = i10;
    }

    public TFq NOt(String str) {
        byte[] bytes;
        if (!TextUtils.isEmpty(str) && (bytes = str.getBytes()) != null) {
            this.Mm = bytes.length;
        }
        return this;
    }

    public TFq ZRu(String str) {
        this.mZ = str;
        return this;
    }

    public TFq mZ(String str) {
        byte[] bytes;
        if (!TextUtils.isEmpty(str) && (bytes = str.getBytes()) != null) {
            this.FA = bytes.length;
        }
        return this;
    }

    public TFq uR(String str) {
        this.aT = str;
        return this;
    }

    public static void uR() {
        synchronized (TFq.class) {
            try {
                long jZRu = com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("tt_sdk_req_monitor", "req_monitor_las_req", 0L);
                if (jZRu <= 0) {
                    com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("tt_sdk_req_monitor", "req_monitor_las_req", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                if (System.currentTimeMillis() - jZRu >= 86400000) {
                    String strNOt = com.bytedance.sdk.openadsdk.multipro.uR.uR.NOt("tt_sdk_req_monitor", "req_monitor_data", null);
                    if (!TextUtils.isEmpty(strNOt)) {
                        com.bytedance.sdk.openadsdk.edo.mZ.mZ(strNOt);
                        com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("tt_sdk_req_monitor");
                        com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("tt_sdk_req_monitor", "req_monitor_las_req", Long.valueOf(System.currentTimeMillis()));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public TFq ZRu(edo edoVar) {
        byte[] bArr;
        if (edoVar != null) {
            if (edoVar.Ht == edo.ZRu.STRING_TYPE && !TextUtils.isEmpty(edoVar.ZRu())) {
                this.Mm = edoVar.ZRu().getBytes().length;
            }
            if (edoVar.Ht == edo.ZRu.BYTE_ARRAY_TYPE && (bArr = edoVar.TFq) != null) {
                this.Mm = bArr.length;
            }
        }
        return this;
    }

    public void NOt() {
        this.Ht = SystemClock.elapsedRealtime() - this.uR;
    }

    public void mZ() {
        this.TFq = SystemClock.elapsedRealtime() - this.uR;
        WD.mZ().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.edo.ZRu.TFq.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                ZRu ZRu2;
                JSONObject jSONObjectOptJSONObject;
                synchronized (TFq.class) {
                    try {
                        String strNOt = com.bytedance.sdk.openadsdk.multipro.uR.uR.NOt("tt_sdk_req_monitor", "req_monitor_data", null);
                        try {
                            jSONObject = TextUtils.isEmpty(strNOt) ? new JSONObject() : new JSONObject(strNOt);
                        } catch (Exception e10) {
                            lp.NOt(e10.getMessage());
                        }
                        if (!jSONObject.has(TFq.this.mZ) || (jSONObjectOptJSONObject = jSONObject.optJSONObject(TFq.this.mZ)) == null) {
                            ZRu zRu = new ZRu(TFq.this.NOt, TFq.this.Vor, TFq.this.TFq, TFq.this.Mm, TFq.this.FA, TFq.this.ZH);
                            ZRu2 = zRu;
                            jSONObject.put(TFq.this.mZ, ZRu2.ZRu());
                            com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("tt_sdk_req_monitor", "req_monitor_data", jSONObject.toString());
                        } else {
                            ZRu2 = ZRu.ZRu(jSONObjectOptJSONObject);
                            ZRu2.ZRu(TFq.this.Vor, TFq.this.TFq, TFq.this.Mm, TFq.this.FA, TFq.this.ZH);
                            jSONObject.put(TFq.this.mZ, ZRu2.ZRu());
                            com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu("tt_sdk_req_monitor", "req_monitor_data", jSONObject.toString());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    public static class ZRu {
        private final SparseIntArray FA;
        private int Ht;
        private int Mm;
        private int NOt;
        private long TFq;
        private int ZRu;
        private int mZ;
        private long uR;

        public ZRu() {
            this.ZRu = 0;
            this.NOt = 0;
            this.mZ = 0;
            this.uR = 0L;
            this.TFq = 0L;
            this.Ht = 0;
            this.Mm = 0;
            this.FA = new SparseIntArray();
        }

        public void ZRu(boolean z10, long j10, int i10, int i11, int i12) {
            if (!z10) {
                this.FA.put(i12, this.FA.get(i12) + 1);
            }
            int i13 = this.NOt;
            int i14 = this.mZ;
            int i15 = i13 + i14;
            int i16 = (this.Ht * i15) + i10;
            int i17 = i15 + 1;
            this.Ht = i16 / i17;
            this.Mm = ((this.Mm * i15) + i11) / i17;
            if (z10) {
                long j11 = (this.uR * ((long) i13)) + j10;
                int i18 = i13 + 1;
                this.NOt = i18;
                this.uR = j11 / ((long) i18);
                return;
            }
            long j12 = (this.TFq * ((long) i14)) + j10;
            int i19 = i14 + 1;
            this.mZ = i19;
            this.TFq = j12 / ((long) i19);
        }

        public static ZRu ZRu(JSONObject jSONObject) {
            ZRu zRu = new ZRu();
            zRu.ZRu = jSONObject.optInt("type", 0);
            zRu.NOt = jSONObject.optInt("suc_times", 0);
            zRu.mZ = jSONObject.optInt("fail_times", 0);
            zRu.uR = jSONObject.optLong("suc_duration", 0L);
            zRu.TFq = jSONObject.optLong("fail_duration", 0L);
            zRu.Ht = jSONObject.optInt("req_size", 0);
            zRu.Mm = jSONObject.optInt("res_size", 0);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("codes");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    zRu.FA.put(Integer.parseInt(next), jSONObjectOptJSONObject.optInt(next));
                }
            }
            return zRu;
        }

        public ZRu(int i10, boolean z10, long j10, int i11, int i12, int i13) {
            this.ZRu = 0;
            this.NOt = 0;
            this.mZ = 0;
            this.uR = 0L;
            this.TFq = 0L;
            this.Ht = 0;
            this.Mm = 0;
            SparseIntArray sparseIntArray = new SparseIntArray();
            this.FA = sparseIntArray;
            this.ZRu = i10;
            if (z10) {
                this.NOt++;
                this.uR = j10;
            } else {
                this.mZ++;
                this.TFq = j10;
                sparseIntArray.put(i13, 1);
            }
            this.Ht = i11;
            this.Mm = i12;
        }

        public JSONObject ZRu() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", this.ZRu);
                jSONObject.put("suc_times", this.NOt);
                jSONObject.put("fail_times", this.mZ);
                jSONObject.put("suc_duration", this.uR);
                jSONObject.put("fail_duration", this.TFq);
                jSONObject.put("req_size", this.Ht);
                jSONObject.put("res_size", this.Mm);
                JSONObject jSONObject2 = new JSONObject();
                for (int i10 = 0; i10 < this.FA.size(); i10++) {
                    jSONObject2.put(String.valueOf(this.FA.keyAt(i10)), this.FA.valueAt(i10));
                }
                jSONObject.put("codes", jSONObject2);
                return jSONObject;
            } catch (Exception e10) {
                lp.NOt(e10.getMessage());
                return jSONObject;
            }
        }
    }

    public void ZRu() {
        this.uR = SystemClock.elapsedRealtime();
    }

    public TFq ZRu(int i10) {
        this.ZH = i10;
        return this;
    }

    public TFq ZRu(boolean z10) {
        this.Vor = z10;
        return this;
    }
}

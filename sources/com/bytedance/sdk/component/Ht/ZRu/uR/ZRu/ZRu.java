package com.bytedance.sdk.component.Ht.ZRu.uR.ZRu;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu implements com.bytedance.sdk.component.Ht.ZRu.uR.ZRu {
    private String FA;
    private long Ht;
    private long Mm;
    private NOt NOt;
    private long TFq;
    private String Vor;
    private String ZH;
    protected JSONObject ZRu;
    private byte aT;
    private int lp;
    private byte mZ;
    private byte uR;

    public ZRu(String str, JSONObject jSONObject) {
        this.Vor = str;
        this.ZRu = jSONObject;
    }

    public static com.bytedance.sdk.component.Ht.ZRu.uR.ZRu mZ(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("type");
            int iOptInt2 = jSONObject.optInt("priority");
            ZRu zRu = new ZRu();
            zRu.ZRu((byte) iOptInt);
            zRu.NOt((byte) iOptInt2);
            zRu.ZRu(jSONObject.optJSONObject(NotificationCompat.CATEGORY_EVENT));
            zRu.ZRu(jSONObject.optString("localId"));
            zRu.NOt(jSONObject.optString("genTime"));
            zRu.ZRu(jSONObject.optInt("channel"));
            return zRu;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public long FA() {
        return this.TFq;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public String Ht() {
        if (TextUtils.isEmpty(this.Vor)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.Vor);
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, Mm());
            jSONObject.put("genTime", lp());
            jSONObject.put("priority", (int) this.uR);
            jSONObject.put("type", (int) this.mZ);
            jSONObject.put("channel", this.lp);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public synchronized JSONObject Mm() {
        NOt nOt;
        try {
            if (this.ZRu == null && (nOt = this.NOt) != null) {
                this.ZRu = nOt.ZRu(ZH());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.ZRu;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public byte NOt() {
        return this.aT;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public byte TFq() {
        return this.uR;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public long Vor() {
        return this.Ht;
    }

    public String ZH() {
        return this.ZH;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public NOt ZRu() {
        return this.NOt;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public int aT() {
        return this.lp;
    }

    public String lp() {
        return this.FA;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public byte uR() {
        return this.mZ;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public void NOt(String str) {
        this.FA = str;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public void ZRu(JSONObject jSONObject) {
        this.ZRu = jSONObject;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public void NOt(long j10) {
        this.Ht = j10;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public void ZRu(byte b10) {
        this.mZ = b10;
    }

    public ZRu(String str, NOt nOt) {
        this.Vor = str;
        this.NOt = nOt;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public void NOt(byte b10) {
        this.uR = b10;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public void ZRu(String str) {
        this.Vor = str;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public void ZRu(long j10) {
        this.TFq = j10;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public void ZRu(int i10) {
        this.lp = i10;
    }

    private ZRu() {
    }

    public void mZ(byte b10) {
        this.aT = b10;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public String mZ() {
        return this.Vor;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu
    public void mZ(long j10) {
        this.Mm = j10;
    }
}

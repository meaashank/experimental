package com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ;

import X3.i;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    private String FA;
    private String Ht;
    private String Mm;
    private int NOt;
    private String TFq;
    private String Vor;
    private double ZH;
    private int ZRu;
    private String aT;
    private int lp;
    private long mZ;
    private int sAl;
    private double uR;
    private float edo = -1.0f;
    private int oK = 0;
    private int yBV = 0;
    private int WMI = 0;
    private int qF = 0;
    private int om = 307200;
    private int OCA = 1;

    public float FA() {
        return this.edo;
    }

    public double Ht() {
        return this.uR;
    }

    public double Mm() {
        return this.ZH;
    }

    public int NOt() {
        return this.ZRu;
    }

    public int OCA() {
        return this.yBV;
    }

    public long TFq() {
        return this.mZ;
    }

    public String Vor() {
        return this.TFq;
    }

    public int WMI() {
        return this.qF;
    }

    public String ZH() {
        return this.Mm;
    }

    public int ZRu() {
        return this.lp;
    }

    public String aT() {
        return this.Ht;
    }

    public String edo() {
        if (TextUtils.isEmpty(this.aT)) {
            this.aT = com.bykv.vk.openvk.ZRu.ZRu.ZRu.Mm.NOt.ZRu(this.Mm);
        }
        return this.aT;
    }

    public String lp() {
        return this.FA;
    }

    public int mZ() {
        return this.NOt;
    }

    public int oK() {
        if (this.om < 0) {
            this.om = 307200;
        }
        long j10 = this.om;
        long j11 = this.mZ;
        if (j10 > j11) {
            this.om = (int) j11;
        }
        return this.om;
    }

    public int om() {
        return this.oK;
    }

    public JSONObject qF() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", NOt());
            jSONObject.put("cover_url", aT());
            jSONObject.put("cover_width", mZ());
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, lp());
            jSONObject.put("file_hash", edo());
            jSONObject.put("resolution", Vor());
            jSONObject.put(i.f76775k, TFq());
            jSONObject.put("video_duration", Ht());
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_URL, ZH());
            jSONObject.put("playable_download_url", sAl());
            jSONObject.put("if_playable_loading_show", om());
            jSONObject.put("remove_loading_page_type", OCA());
            jSONObject.put("fallback_endcard_judge", ZRu());
            jSONObject.put("video_preload_size", oK());
            jSONObject.put("reward_video_cached_type", yBV());
            jSONObject.put("execute_cached_type", WMI());
            jSONObject.put("endcard_render", uR());
            jSONObject.put("replay_time", xY());
            jSONObject.put("play_speed_ratio", FA());
            if (Mm() > 0.0d) {
                jSONObject.put("start", Mm());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String sAl() {
        return this.Vor;
    }

    public boolean to() {
        return this.WMI == 0;
    }

    public int uR() {
        return this.sAl;
    }

    public int xY() {
        return this.OCA;
    }

    public int yBV() {
        return this.WMI;
    }

    public void FA(int i10) {
        this.oK = i10;
    }

    public void Ht(String str) {
        this.aT = str;
    }

    public void Mm(int i10) {
        this.qF = i10;
    }

    public void NOt(int i10) {
        this.ZRu = i10;
    }

    public void TFq(String str) {
        this.Vor = str;
    }

    public void Vor(int i10) {
        this.yBV = i10;
    }

    public void ZRu(int i10) {
        this.lp = i10;
    }

    public void aT(int i10) {
        this.OCA = Math.min(4, Math.max(1, i10));
    }

    public void mZ(int i10) {
        this.NOt = i10;
    }

    public void uR(int i10) {
        this.sAl = i10;
    }

    public void Ht(int i10) {
        this.WMI = i10;
    }

    public void NOt(String str) {
        this.Ht = str;
    }

    public void TFq(int i10) {
        this.om = i10;
    }

    public void ZRu(long j10) {
        this.mZ = j10;
    }

    public void mZ(String str) {
        this.Mm = str;
    }

    public void uR(String str) {
        this.FA = str;
    }

    public void ZRu(double d10) {
        this.uR = d10;
    }

    public void ZRu(String str) {
        this.TFq = str;
    }
}

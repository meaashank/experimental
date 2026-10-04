package com.bytedance.sdk.openadsdk.core.settings;

import i2.C4544a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class NOt {
    public int AK;
    public boolean Cox;
    public int FA;
    public int Ho;
    public int Ht;
    public String Hvv;
    public List<FA> IZ;
    public int MR;
    public int Mm;
    public JSONObject NBW;
    public int NOt;

    /* JADX INFO: renamed from: Nb, reason: collision with root package name */
    public int f140676Nb;
    public int OCA;
    public String Qg;
    public int TFq;
    public boolean VdW;
    public int Vor;
    public long Vr;
    public boolean WD;
    public int WMI;
    public int Yx;
    public int ZH;
    public String ZRu;
    public List<String> Zf;
    public int aT;
    public int bO;
    public int edo;
    public int fWk;
    public int fcs;
    public int gI;
    public int le;
    public int lp;
    public int mZ;
    public List<FA> nqR;
    public int oK;
    public int om;
    public int qF;
    public int ru;
    public int sAl;
    public boolean th;
    public boolean to;
    public int uR;
    public int xY;
    public int yBV;

    public NOt(JSONObject jSONObject) {
        this.NOt = 1;
        this.mZ = 1;
        this.uR = 2;
        this.TFq = 1;
        this.Ht = 100;
        this.Mm = 0;
        this.FA = 2;
        this.Vor = 1;
        this.aT = 3;
        this.ZH = 30;
        this.lp = 30;
        this.sAl = 1;
        this.edo = 1;
        this.oK = 2;
        this.yBV = 1500;
        this.WMI = 2;
        this.qF = C4544a.f202779h;
        this.om = 0;
        this.OCA = 5;
        this.to = false;
        this.xY = 0;
        this.ru = 2;
        this.le = -1;
        this.MR = 0;
        this.fcs = 0;
        this.f140676Nb = 5;
        this.VdW = true;
        this.th = false;
        this.WD = false;
        this.fWk = 0;
        this.Yx = -1;
        this.Cox = false;
        this.gI = 60000;
        this.Ho = 2;
        this.bO = 1000;
        this.AK = 1;
        this.IZ = new ArrayList();
        this.nqR = new ArrayList();
        new JSONObject();
        this.NBW = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.ZRu = jSONObject.optString("code_id");
        this.NOt = jSONObject.optInt("auto_play", 1);
        this.Yx = jSONObject.optInt("endcard_close_time", -1);
        this.mZ = jSONObject.optInt("voice_control", 1);
        this.uR = jSONObject.optInt("rv_preload", 2);
        this.TFq = jSONObject.optInt("nv_preload", 1);
        this.Ht = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.Mm = jSONObject.optInt("skip_time_displayed", 0);
        this.FA = jSONObject.optInt("video_skip_result", 2);
        this.Vor = jSONObject.optInt("reg_creative_control", 1);
        this.aT = jSONObject.optInt("play_bar_show_time", 3);
        int iOptInt = jSONObject.optInt("rv_skip_time", 30);
        this.ZH = iOptInt;
        if (iOptInt < 0) {
            this.ZH = 30;
        }
        this.sAl = jSONObject.optInt("voice_control", 2);
        this.edo = jSONObject.optInt("if_show_win", 1);
        this.oK = jSONObject.optInt("sp_preload", 2);
        this.yBV = jSONObject.optInt("stop_time", 1500);
        this.WMI = jSONObject.optInt("native_playable_delay", 2);
        this.qF = jSONObject.optInt("time_out_control", -1);
        this.le = jSONObject.optInt("playable_close_time", -1);
        this.om = jSONObject.optInt("playable_reward_type", 0);
        this.xY = jSONObject.optInt("reward_is_callback", 0);
        int iOptInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.OCA = iOptInt2;
        if (iOptInt2 < 0) {
            this.OCA = 5;
        }
        ZRu(jSONObject.optJSONArray("parent_tpl_ids"));
        this.ru = jSONObject.optInt("slot_type", 2);
        this.to = jSONObject.optBoolean("close_on_click", false);
        this.MR = jSONObject.optInt("allow_system_back", 0);
        this.fcs = jSONObject.optInt("splash_skip_time", 0);
        this.f140676Nb = jSONObject.optInt("splash_image_count_down_time", 5);
        this.th = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.WD = jSONObject.optBoolean("splash_close_on_click", false);
        int iOptInt3 = jSONObject.optInt("splash_load_strategy", 0);
        this.fWk = iOptInt3;
        if (iOptInt3 < 0 || iOptInt3 > 1) {
            this.fWk = 0;
        }
        this.VdW = jSONObject.optBoolean("allow_mediaview_click", true);
        int iOptInt4 = jSONObject.optInt("total_time_out", 60000);
        this.gI = iOptInt4;
        if (iOptInt4 <= 0 || iOptInt4 > 1800000) {
            this.gI = 60000;
        }
        int iOptInt5 = jSONObject.optInt("req_parallel_num", 2);
        this.Ho = iOptInt5;
        if (iOptInt5 <= 0 || iOptInt5 > 4) {
            this.Ho = 2;
        }
        this.bO = jSONObject.optInt("bidding_token_tmax", 1000);
        int iOptInt6 = jSONObject.optInt("ad_load_type", 1);
        this.AK = iOptInt6;
        if (iOptInt6 <= 0 || iOptInt6 > 2) {
            this.AK = 1;
        }
        boolean zOptBoolean = jSONObject.optBoolean("is_mediation", false);
        this.Cox = zOptBoolean;
        if (zOptBoolean) {
            yBV.CH().GC();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("mediation_config");
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                String strOptString = jSONObjectOptJSONObject.optString("adn_name");
                String strOptString2 = jSONObjectOptJSONObject.optString("adn_slot_id");
                int iOptInt7 = jSONObjectOptJSONObject.optInt("ad_expired_time", 3600000);
                int iOptInt8 = jSONObjectOptJSONObject.optInt("req_bidding_type", 2);
                String strOptString3 = jSONObjectOptJSONObject.optString("rit_cpm");
                int iOptInt9 = jSONObjectOptJSONObject.optInt("show_sort");
                int iOptInt10 = jSONObjectOptJSONObject.optInt("layer_time_out", 2000);
                int i11 = (iOptInt10 <= 0 || iOptInt10 > 60000) ? 2000 : iOptInt10;
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("server_params");
                if (iOptInt8 == 2) {
                    arrayList.add(new FA(strOptString, strOptString2, iOptInt7, iOptInt8, strOptString3, iOptInt9, i11, jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : ""));
                } else if (iOptInt8 == 0) {
                    arrayList2.add(new FA(strOptString, strOptString2, iOptInt7, iOptInt8, strOptString3, iOptInt9, i11, jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : ""));
                }
            }
            this.IZ = arrayList;
            this.nqR = arrayList2;
            Collections.sort(arrayList);
            Collections.sort(this.nqR);
        }
        if (!ZRu(this.mZ)) {
            this.mZ = 1;
        }
        if (!ZRu(this.sAl)) {
            this.sAl = 1;
        }
        this.Vr = jSONObject.optLong("waterfall_id");
        String strOptString4 = jSONObject.optString("waterfall_version");
        this.Qg = strOptString4;
        this.Hvv = strOptString4;
        this.lp = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    private static boolean ZRu(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public void ZRu(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.Zf = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                this.Zf.add(jSONArray.get(i10).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }

    public NOt(String str, int i10) {
        this.NOt = 1;
        this.mZ = 1;
        this.uR = 2;
        this.TFq = 1;
        this.Ht = 100;
        this.Mm = 0;
        this.FA = 2;
        this.Vor = 1;
        this.aT = 3;
        this.ZH = 30;
        this.lp = 30;
        this.sAl = 1;
        this.edo = 1;
        this.oK = 2;
        this.yBV = 1500;
        this.WMI = 2;
        this.qF = C4544a.f202779h;
        this.om = 0;
        this.OCA = 5;
        this.to = false;
        this.xY = 0;
        this.ru = 2;
        this.le = -1;
        this.MR = 0;
        this.fcs = 0;
        this.f140676Nb = 5;
        this.VdW = true;
        this.th = false;
        this.WD = false;
        this.fWk = 0;
        this.Yx = -1;
        this.Cox = false;
        this.gI = 60000;
        this.Ho = 2;
        this.bO = 1000;
        this.AK = 1;
        this.IZ = new ArrayList();
        this.nqR = new ArrayList();
        this.NBW = new JSONObject();
        this.ZRu = str;
        this.mZ = i10;
    }
}

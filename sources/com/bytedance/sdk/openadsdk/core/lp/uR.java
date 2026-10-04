package com.bytedance.sdk.openadsdk.core.lp;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.lp.NOt.NOt;
import com.bytedance.sdk.openadsdk.core.lp.NOt.ZRu;
import com.bytedance.sdk.openadsdk.core.lp.NOt.mZ;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class uR {
    private boolean OCA;
    private qF WMI;
    private boolean om;
    private boolean qF;
    private final ZRu sAl;
    private String to;
    private long yBV;
    public List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> ZRu = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> NOt = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> mZ = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> uR = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> TFq = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> Ht = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> Mm = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> FA = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> Vor = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> aT = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.lp.NOt.NOt> ZH = new ArrayList();
    public List<com.bytedance.sdk.openadsdk.core.lp.NOt.ZRu> lp = new ArrayList();
    private final AtomicBoolean edo = new AtomicBoolean(false);
    private final AtomicBoolean oK = new AtomicBoolean(false);

    public uR(ZRu zRu) {
        this.sAl = zRu;
    }

    public void FA(long j10) {
        ZRu(j10, this.Vor, (com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu) null);
    }

    public void Ht(long j10) {
        ZRu(j10, this.Mm, (com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu) null);
    }

    public void Mm(long j10) {
        ZRu(j10, this.FA, null, new mZ.NOt("click", this.WMI));
    }

    public void NOt(long j10) {
        ZRu(j10, this.mZ, (com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu) null);
    }

    public void TFq(long j10) {
        if (this.oK.compareAndSet(false, true)) {
            ZRu(j10, this.Ht, (com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu) null);
        }
    }

    public void Vor(long j10) {
        ZRu(j10, this.aT, (com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu) null);
    }

    public void ZH(List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list) {
        this.Vor.addAll(list);
    }

    public void ZRu(com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu zRu) {
        ZRu(-1L, this.ZRu, zRu);
    }

    public void aT(List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list) {
        this.ZRu.addAll(list);
    }

    public void lp(List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list) {
        this.aT.addAll(list);
    }

    public void mZ(long j10) {
        ZRu(j10, this.uR, (com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu) null);
    }

    public void uR(long j10) {
        ZRu(j10, this.TFq, null, new mZ.NOt("video_progress", this.WMI, 1.0f));
    }

    private void NOt(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, str);
            com.bytedance.sdk.openadsdk.uR.mZ.NOt(this.WMI, this.to, "vast_play_track", jSONObject);
        } catch (Throwable unused) {
        }
    }

    public void FA(List<com.bytedance.sdk.openadsdk.core.lp.NOt.NOt> list) {
        this.ZH.addAll(list);
        Collections.sort(this.ZH);
    }

    public void Ht(List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list) {
        this.Mm.addAll(list);
    }

    public void Mm(List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list) {
        this.FA.addAll(list);
    }

    public void Vor(List<com.bytedance.sdk.openadsdk.core.lp.NOt.ZRu> list) {
        this.lp.addAll(list);
        Collections.sort(this.lp);
    }

    public void ZRu(long j10) {
        if (this.edo.compareAndSet(false, true)) {
            ZRu(j10, this.NOt, null, new mZ.NOt("show_impression", this.WMI));
        }
    }

    public void mZ(List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list) {
        this.uR.addAll(list);
    }

    public void uR(List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list) {
        this.TFq.addAll(list);
    }

    private JSONArray mZ() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.lp.NOt.ZRu> it = this.lp.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().ZRu());
        }
        return jSONArray;
    }

    public void TFq(List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list) {
        this.Ht.addAll(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ZRu(long r8, long r10, com.bytedance.sdk.openadsdk.core.lp.Ht r12) {
        /*
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.yBV
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto Lf
            goto L88
        Lf:
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L88
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L88
            long r0 = java.lang.System.currentTimeMillis()
            r7.yBV = r0
            float r0 = (float) r8
            float r10 = (float) r10
            float r0 = r0 / r10
            java.util.List r4 = r7.ZRu(r8, r0)
            r10 = 1048576000(0x3e800000, float:0.25)
            int r11 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            r1 = 1
            if (r11 < 0) goto L40
            boolean r11 = r7.qF
            if (r11 != 0) goto L40
            java.lang.String r11 = "firstQuartile"
            r7.NOt(r11)
            r7.qF = r1
            if (r12 == 0) goto L3e
            r11 = 6
            r7.ZRu(r12, r11)
        L3e:
            r0 = r10
            goto L71
        L40:
            r10 = 1056964608(0x3f000000, float:0.5)
            int r11 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r11 < 0) goto L58
            boolean r11 = r7.om
            if (r11 != 0) goto L58
            java.lang.String r11 = "midpoint"
            r7.NOt(r11)
            r7.om = r1
            if (r12 == 0) goto L3e
            r11 = 7
            r7.ZRu(r12, r11)
            goto L3e
        L58:
            r10 = 1061158912(0x3f400000, float:0.75)
            int r11 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r11 < 0) goto L71
            boolean r11 = r7.OCA
            if (r11 != 0) goto L71
            java.lang.String r11 = "thirdQuartile"
            r7.NOt(r11)
            r7.OCA = r1
            if (r12 == 0) goto L3e
            r11 = 8
            r7.ZRu(r12, r11)
            goto L3e
        L71:
            r10 = 1022739087(0x3cf5c28f, float:0.03)
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 >= 0) goto L79
            r0 = 0
        L79:
            com.bytedance.sdk.openadsdk.core.lp.NOt.mZ$NOt r6 = new com.bytedance.sdk.openadsdk.core.lp.NOt.mZ$NOt
            java.lang.String r10 = "video_progress"
            com.bytedance.sdk.openadsdk.core.model.qF r11 = r7.WMI
            r6.<init>(r10, r11, r0)
            r5 = 0
            r1 = r7
            r2 = r8
            r1.ZRu(r2, r4, r5, r6)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.lp.uR.ZRu(long, long, com.bytedance.sdk.openadsdk.core.lp.Ht):void");
    }

    public void NOt(List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list) {
        this.mZ.addAll(list);
    }

    private JSONArray NOt() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<com.bytedance.sdk.openadsdk.core.lp.NOt.NOt> it = this.ZH.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().NOt());
        }
        return jSONArray;
    }

    private void ZRu(final Ht ht, final int i10) {
        com.bytedance.sdk.component.utils.Mm.NOt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.lp.uR.1
            @Override // java.lang.Runnable
            public void run() {
                Ht ht2 = ht;
                if (ht2 != null) {
                    ht2.ZRu(i10);
                }
            }
        });
    }

    private void ZRu(long j10, List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list, com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu zRu, mZ.NOt nOt) {
        ZRu zRu2 = this.sAl;
        com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(list, zRu, j10, zRu2 != null ? zRu2.Mm() : null, nOt);
    }

    private void ZRu(long j10, List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list, com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu zRu) {
        ZRu(j10, list, zRu, null);
    }

    public List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> ZRu(long j10, float f10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.ZH.size(); i10++) {
            com.bytedance.sdk.openadsdk.core.lp.NOt.NOt nOt = this.ZH.get(i10);
            if (nOt.ZRu(f10)) {
                arrayList.add(nOt);
            }
        }
        for (int i11 = 0; i11 < this.lp.size(); i11++) {
            com.bytedance.sdk.openadsdk.core.lp.NOt.ZRu zRu = this.lp.get(i11);
            if (zRu.ZRu(j10)) {
                arrayList.add(zRu);
            }
        }
        return arrayList;
    }

    public void ZRu(List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list) {
        this.NOt.addAll(list);
    }

    public JSONObject ZRu() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorTrackers", com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(this.ZRu));
        jSONObject.put(InMobiNetworkValues.IMPRESSION_TRACKERS, com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(this.NOt));
        jSONObject.put("pauseTrackers", com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(this.mZ));
        jSONObject.put("resumeTrackers", com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(this.uR));
        jSONObject.put("completeTrackers", com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(this.TFq));
        jSONObject.put("closeTrackers", com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(this.Ht));
        jSONObject.put("skipTrackers", com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(this.Mm));
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(this.FA));
        jSONObject.put("muteTrackers", com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(this.Vor));
        jSONObject.put("unMuteTrackers", com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(this.aT));
        jSONObject.put("fractionalTrackers", NOt());
        jSONObject.put("absoluteTrackers", mZ());
        return jSONObject;
    }

    public void ZRu(JSONObject jSONObject) {
        aT(com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(jSONObject.optJSONArray("errorTrackers")));
        ZRu(com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(jSONObject.optJSONArray(InMobiNetworkValues.IMPRESSION_TRACKERS)));
        NOt(com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(jSONObject.optJSONArray("pauseTrackers"), true));
        mZ(com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(jSONObject.optJSONArray("resumeTrackers"), true));
        uR(com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(jSONObject.optJSONArray("completeTrackers")));
        TFq(com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(jSONObject.optJSONArray("closeTrackers")));
        Ht(com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(jSONObject.optJSONArray("skipTrackers")));
        Mm(com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(jSONObject.optJSONArray("clickTrackers")));
        ZH(com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(jSONObject.optJSONArray("muteTrackers"), true));
        lp(com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(jSONObject.optJSONArray("unMuteTrackers"), true));
        FA(com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.NOt(jSONObject.optJSONArray("fractionalTrackers")));
        Vor(com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.mZ(jSONObject.optJSONArray("absoluteTrackers")));
    }

    public void ZRu(qF qFVar) {
        this.WMI = qFVar;
    }

    public void ZRu(String str) {
        this.to = str;
    }

    public void ZRu(String str, long j10) {
        if (TextUtils.isEmpty(str) || j10 < 0) {
            return;
        }
        Vor(Collections.singletonList(new ZRu.C0451ZRu(str, j10).ZRu()));
    }

    public void ZRu(String str, float f10) {
        if (TextUtils.isEmpty(str) || f10 < 0.0f) {
            return;
        }
        FA(Collections.singletonList(new NOt.ZRu(str, f10).ZRu()));
    }

    public void ZRu(uR uRVar) {
        aT(uRVar.ZRu);
        ZRu(uRVar.NOt);
        NOt(uRVar.mZ);
        mZ(uRVar.uR);
        uR(uRVar.TFq);
        TFq(uRVar.Ht);
        Ht(uRVar.Mm);
        Mm(uRVar.FA);
        ZH(uRVar.Vor);
        lp(uRVar.aT);
        FA(uRVar.ZH);
        Vor(uRVar.lp);
    }
}

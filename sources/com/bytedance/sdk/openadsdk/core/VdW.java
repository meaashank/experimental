package com.bytedance.sdk.openadsdk.core;

import K9.h;
import Y6.d;
import Z3.f;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.preference.s;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.utils.ru;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.NOt.mZ;
import com.bytedance.sdk.openadsdk.core.model.edo;
import com.bytedance.sdk.openadsdk.core.om;
import com.bytedance.sdk.openadsdk.utils.Cox;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Yx;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class VdW implements com.bytedance.sdk.component.adexpress.TFq.NOt, ru.ZRu, com.bytedance.sdk.openadsdk.aT.NOt {
    private static final Map<String, Boolean> FA;
    private com.bytedance.sdk.component.ZRu.WMI Ho;
    private String Ht;
    private boolean Hvv;
    private boolean IZ;
    private JSONObject MR;
    private com.bytedance.sdk.openadsdk.core.widget.Ht Mm;
    private com.bytedance.sdk.openadsdk.core.sAl.uR.NOt NBW;
    boolean NOt;

    /* JADX INFO: renamed from: Nb, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.lp.NOt f140665Nb;
    private ZRu Nl;
    private com.bytedance.sdk.openadsdk.core.FA.edo OCA;
    private com.bytedance.sdk.openadsdk.lp.Ht Qg;
    private com.bytedance.sdk.openadsdk.lp.Vor VdW;
    private com.bytedance.sdk.openadsdk.aT.mZ Vor;
    private com.bytedance.sdk.openadsdk.core.widget.ZRu.ZRu Vr;
    private List<com.bytedance.sdk.openadsdk.core.model.qF> WD;
    private com.bytedance.sdk.openadsdk.core.model.qF WMI;
    private WeakReference<View> ZH;
    protected Map<String, Object> ZRu;
    private com.bytedance.sdk.openadsdk.lp.ZRu Zf;
    private String aT;
    private String bO;
    private String edo;
    private HashMap<String, aT> fWk;
    private com.bytedance.sdk.openadsdk.core.NOt.uR fcs;
    private com.bytedance.sdk.openadsdk.uR.uR.TFq gI;
    private com.bytedance.sdk.openadsdk.lp.uR le;
    private String lp;
    private Context nqR;
    private int oK;
    private com.bytedance.sdk.component.adexpress.NOt.ZH om;
    private JSONObject qF;
    private com.bytedance.sdk.openadsdk.lp.TFq ru;
    private int sAl;
    private JSONObject to;
    private WeakReference<com.bytedance.sdk.component.Vor.uR> uR;
    private com.bytedance.sdk.openadsdk.aT.uR xY;
    private mZ yz;
    private boolean yBV = true;
    private boolean th = true;
    private boolean Yx = false;
    private boolean Cox = false;
    boolean mZ = false;
    private boolean AK = false;
    private final com.bytedance.sdk.component.utils.ru TFq = new com.bytedance.sdk.component.utils.ru(Looper.getMainLooper(), this);

    public static class NOt {
        public String NOt;
        public int TFq;
        public String ZRu;
        public String mZ;
        public JSONObject uR;
    }

    public interface ZRu {
        void ZRu();
    }

    public static class mZ implements Runnable {
        private final JSONObject NOt;
        private final com.bytedance.sdk.openadsdk.core.FA.edo ZRu;

        public mZ(com.bytedance.sdk.openadsdk.core.FA.edo edoVar, JSONObject jSONObject) {
            this.ZRu = edoVar;
            this.NOt = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            VdW.NOt(this.ZRu, this.NOt);
        }
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        FA = concurrentHashMap;
        Boolean bool = Boolean.TRUE;
        concurrentHashMap.put("log_event", bool);
        concurrentHashMap.put("private", bool);
        concurrentHashMap.put("dispatch_message", bool);
        concurrentHashMap.put("custom_event", bool);
        concurrentHashMap.put("log_event_v3", bool);
    }

    public VdW(Context context) {
        this.nqR = context;
    }

    private void FA(JSONObject jSONObject) throws Exception {
        if (this.Hvv) {
            com.bytedance.sdk.openadsdk.core.model.qF qFVar = this.WMI;
            if ((qFVar instanceof com.bytedance.sdk.openadsdk.core.model.om) && ((com.bytedance.sdk.openadsdk.core.model.om) qFVar).Dg()) {
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("adInfos", jSONArray);
                for (com.bytedance.sdk.openadsdk.core.model.qF qFVar2 : ((com.bytedance.sdk.openadsdk.core.model.om) this.WMI).lgB()) {
                    JSONObject jSONObject2 = new JSONObject();
                    ZRu(jSONObject2, qFVar2);
                    jSONArray.put(jSONObject2);
                }
                return;
            }
        }
        ZRu(jSONObject, this.WMI);
    }

    private void OCA() {
        if (this.nqR == null || TextUtils.isEmpty(WMI.uR().Cox())) {
            return;
        }
        TTWebsiteActivity.ZRu(this.nqR, this.WMI, this.bO);
    }

    private void Vor(JSONObject jSONObject) throws Exception {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.xY.ZH(this.WMI))) {
            return;
        }
        jSONObject.put("playable_style", com.bytedance.sdk.openadsdk.core.model.xY.ZH(this.WMI));
    }

    private void WMI() {
        com.bytedance.sdk.openadsdk.lp.Vor vor = this.VdW;
        if (vor == null) {
            return;
        }
        vor.ZRu();
    }

    private void ZH(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.lp.NOt nOt = this.f140665Nb;
        if (nOt == null || jSONObject == null) {
            return;
        }
        nOt.ZRu(jSONObject.optBoolean("isRenderSuc", false), jSONObject.optInt(f.f79422s, -1), jSONObject.optString("msg", ""));
    }

    private void Zf() {
        if (this.Vor == null) {
            this.Vor = com.bytedance.sdk.openadsdk.aT.ZRu.ZRu(this, this.WMI);
        }
    }

    private void aT(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.uR.uR.TFq tFq;
        if (jSONObject == null || (tFq = this.gI) == null) {
            return;
        }
        tFq.NOt(jSONObject);
    }

    @JProtect
    private JSONObject edo() {
        View view;
        com.bytedance.sdk.component.Vor.uR uRVar;
        try {
            view = this.ZH.get();
            uRVar = this.uR.get();
        } catch (Throwable unused) {
        }
        if (view == null || uRVar == null) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.AndroidObject", "setCloseButtonInfo error closeButton is null");
            return null;
        }
        int[] iArrNOt = Cox.NOt(view);
        int[] iArrNOt2 = Cox.NOt((View) uRVar);
        if (iArrNOt != null && iArrNOt2 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("x", Cox.uR(WMI.ZRu(), iArrNOt[0] - iArrNOt2[0]));
            jSONObject.put("y", Cox.uR(WMI.ZRu(), iArrNOt[1] - iArrNOt2[1]));
            jSONObject.put("w", Cox.uR(WMI.ZRu(), view.getWidth()));
            jSONObject.put(h.f58477a, Cox.uR(WMI.ZRu(), view.getHeight()));
            jSONObject.put("isExist", true);
            return jSONObject;
        }
        com.bytedance.sdk.component.utils.lp.ZRu("TTAD.AndroidObject", "setCloseButtonInfo error position or webViewPosition is null");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lp(JSONObject jSONObject) {
        if (this.OCA == null || jSONObject == null) {
            return;
        }
        try {
            this.OCA.ZRu(jSONObject.optInt("stateType", -1));
        } catch (Exception unused) {
        }
    }

    private static List<String> oK() {
        return Arrays.asList("appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void om() {
        com.bytedance.sdk.openadsdk.core.FA.edo edoVar = this.OCA;
        if (edoVar != null) {
            edoVar.ZRu();
        }
    }

    private void qF() {
        com.bytedance.sdk.openadsdk.lp.Vor vor = this.VdW;
        if (vor == null) {
            return;
        }
        vor.NOt();
    }

    private WebView sAl() {
        com.bytedance.sdk.component.Vor.uR uRVar;
        WeakReference<com.bytedance.sdk.component.Vor.uR> weakReference = this.uR;
        if (weakReference == null || (uRVar = weakReference.get()) == null) {
            return null;
        }
        return uRVar.getWebView();
    }

    @JProtect
    private JSONObject to() {
        return NOt(this.WMI);
    }

    private boolean xY() {
        com.bytedance.sdk.openadsdk.core.model.qF qFVar = this.WMI;
        if (qFVar == null || qFVar.pvl() == null || com.bytedance.sdk.openadsdk.core.model.xY.NOt(this.WMI) || this.Yx || this.WMI.pvl().optInt("parent_type") != 2) {
            return false;
        }
        int iKlw = this.WMI.klw();
        if (iKlw != 8 && iKlw != 7) {
            return false;
        }
        this.Yx = true;
        return true;
    }

    private Context yBV() {
        WeakReference<com.bytedance.sdk.component.Vor.uR> weakReference = this.uR;
        Activity activityZRu = (weakReference == null || weakReference.get() == null) ? null : com.bytedance.sdk.component.utils.NOt.ZRu(this.uR.get());
        return activityZRu == null ? this.nqR : activityZRu;
    }

    public void Ht() {
        com.bytedance.sdk.openadsdk.lp.NOt nOt;
        if (this.IZ && (nOt = this.f140665Nb) != null) {
            nOt.ZRu();
            return;
        }
        Context context = this.nqR;
        if ((context instanceof Activity) && com.bytedance.sdk.openadsdk.utils.om.ZRu((Activity) context)) {
            ((Activity) this.nqR).finish();
        }
    }

    public void Mm() {
        com.bytedance.sdk.openadsdk.core.FA.edo edoVar = this.OCA;
        if (edoVar != null) {
            edoVar.NOt();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.TFq.NOt
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            FA(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.TFq.NOt
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            NOt(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.TFq.NOt
    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VdW.2
                @Override // java.lang.Runnable
                public void run() {
                    VdW.this.lp(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.TFq.NOt
    @JavascriptInterface
    public void chooseAdResult(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("video_choose");
            long jOptLong = jSONObject.optLong("video_choose_duration");
            com.bytedance.sdk.openadsdk.lp.Ht ht = this.Qg;
            if (ht != null) {
                ht.ZRu(iOptInt, jOptLong);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.TFq.NOt
    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VdW.3
                @Override // java.lang.Runnable
                public void run() {
                    VdW.this.uR(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.TFq.NOt
    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            yBV(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.TFq.NOt
    @JavascriptInterface
    public String getCurrentVideoState() {
        JSONObject jSONObject = new JSONObject();
        sAl(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.TFq.NOt
    @JavascriptInterface
    public String getData(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.to.toString();
        }
        try {
            JSONObject jSONObjectZRu = com.bytedance.sdk.openadsdk.core.FA.ZRu.NOt.ZRu(this.to, new JSONObject(str));
            return jSONObjectZRu == null ? this.to.toString() : jSONObjectZRu.toString();
        } catch (Exception unused) {
            return this.to.toString();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.TFq.NOt
    @JavascriptInterface
    public String getTemplateInfo() {
        ZRu("getTemplateInfo", true);
        try {
            JSONObject jSONObject = this.to;
            if (jSONObject != null) {
                jSONObject.put("setting", to());
                com.bytedance.sdk.openadsdk.core.model.qF qFVar = this.WMI;
                if (qFVar != null) {
                    this.to.put("extension", qFVar.qZ());
                }
            }
            ZRu("getTemplateInfo", false);
            return this.to.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.TFq.NOt
    @JavascriptInterface
    public void initRenderFinish() {
        com.bytedance.sdk.openadsdk.utils.WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VdW.5
            @Override // java.lang.Runnable
            public void run() {
                if (VdW.this.Vr != null) {
                    VdW.this.Vr.ZRu();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.TFq.NOt
    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            mZ mZVar = this.yz;
            if (mZVar != null) {
                com.bytedance.sdk.openadsdk.utils.WD.NOt(mZVar);
            }
            mZ mZVar2 = new mZ(this.OCA, jSONObject);
            this.yz = mZVar2;
            com.bytedance.sdk.openadsdk.utils.WD.ZRu(mZVar2);
        } catch (Exception unused) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.AndroidObject", "");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.TFq.NOt
    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            edo(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.TFq.NOt
    @JavascriptInterface
    public void skipVideo() {
        com.bytedance.sdk.openadsdk.utils.WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VdW.4
            @Override // java.lang.Runnable
            public void run() {
                VdW.this.om();
            }
        });
    }

    private boolean oK(@NonNull JSONObject jSONObject) {
        return jSONObject.has("borderRadiusTopLeft") && jSONObject.has("borderRadiusBottomLeft") && jSONObject.has("borderRadiusTopRight") && jSONObject.has("borderRadiusBottomRight");
    }

    public VdW TFq(String str) {
        this.edo = str;
        return this;
    }

    public boolean uR() {
        com.bytedance.sdk.openadsdk.core.model.qF qFVar = this.WMI;
        return qFVar != null && qFVar.Zf();
    }

    private void Mm(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new String(Base64.decode(str, 2)));
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                NOt nOt = new NOt();
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        nOt.ZRu = jSONObjectOptJSONObject.optString("__msg_type", null);
                        nOt.NOt = jSONObjectOptJSONObject.optString("__callback_id", null);
                        nOt.mZ = jSONObjectOptJSONObject.optString("func");
                        nOt.uR = jSONObjectOptJSONObject.optJSONObject("params");
                        nOt.TFq = jSONObjectOptJSONObject.optInt("JSSDK");
                    }
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(nOt.ZRu) && !TextUtils.isEmpty(nOt.mZ)) {
                    Message messageObtainMessage = this.TFq.obtainMessage(11);
                    messageObtainMessage.obj = nOt;
                    this.TFq.sendMessage(messageObtainMessage);
                }
            }
        } catch (Exception unused2) {
        }
    }

    private void WMI(JSONObject jSONObject) {
        if (jSONObject == null || this.xY == null) {
            return;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("temaiProductIds");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                this.xY.ZRu(true, jSONArrayOptJSONArray);
            } else {
                this.xY.ZRu(false, null);
            }
        } catch (Exception unused) {
            this.xY.ZRu(false, null);
        }
    }

    private void om(JSONObject jSONObject) {
        WebView webViewSAl;
        if (jSONObject == null || (webViewSAl = sAl()) == null) {
            return;
        }
        com.bytedance.sdk.component.utils.ZH.ZRu(webViewSAl, "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ")");
    }

    private boolean qF(JSONObject jSONObject) {
        try {
            jSONObject.put("creatives", NOt(this.WD));
        } catch (Exception unused) {
        }
        return true;
    }

    public boolean TFq() {
        return this.mZ;
    }

    public boolean Vor() {
        com.bytedance.sdk.openadsdk.core.model.qF qFVar = this.WMI;
        return qFVar != null && qFVar.Vr() == 1;
    }

    public void ZH() {
        com.bytedance.sdk.openadsdk.aT.mZ mZVar = this.Vor;
        if (mZVar != null) {
            mZVar.ZRu();
        }
        mZ mZVar2 = this.yz;
        if (mZVar2 != null) {
            com.bytedance.sdk.openadsdk.utils.WD.NOt(mZVar2);
            this.yz = null;
        }
        this.nqR = null;
        this.NBW = null;
    }

    public void aT() {
        xY();
    }

    public VdW mZ(String str) {
        this.aT = str;
        return this;
    }

    public VdW uR(String str) {
        this.lp = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject OCA(JSONObject jSONObject) {
        if (this.ZRu != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String strOptString = jSONObject.optString("ad_extra_data", null);
                if (strOptString != null) {
                    jSONObject2 = new JSONObject(strOptString);
                }
                for (Map.Entry<String, Object> entry : this.ZRu.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.lp.NOt(e10.toString());
            }
        }
        return jSONObject;
    }

    private boolean sAl(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.FA.edo edoVar = this.OCA;
        if (edoVar != null && jSONObject != null) {
            double dMZ = edoVar.mZ();
            int iUR = this.OCA.uR();
            try {
                jSONObject.put("currentTime", dMZ / 1000.0d);
                jSONObject.put("state", iUR);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private void yBV(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Uri uri = Uri.parse(jSONObject.optString("trackData"));
            if ("bytedance".equals(uri.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.yBV.ZRu(uri, this);
            }
        } catch (Exception unused) {
        }
    }

    public VdW NOt(String str) {
        this.Ht = str;
        return this;
    }

    public void TFq(boolean z10) {
        this.IZ = z10;
    }

    public void lp() {
        ZRu zRu = this.Nl;
        if (zRu != null) {
            zRu.ZRu();
        }
    }

    public com.bytedance.sdk.openadsdk.core.model.qF mZ() {
        return this.WMI;
    }

    public void uR(JSONObject jSONObject) {
        String str;
        double d10;
        double d11;
        double dOptDouble;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.OCA.ZRu("TTAD.AndroidObject", "trigger Class1 method1");
        try {
            String strOptString = jSONObject.optString("adId");
            int iOptInt = jSONObject.optInt("areaType", 1);
            String strOptString2 = jSONObject.optString("clickAreaType");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("clickInfo");
            double d18 = 0.0d;
            if (jSONObjectOptJSONObject2 != null) {
                double dOptDouble2 = jSONObjectOptJSONObject2.optDouble("down_x", 0.0d);
                dOptDouble = jSONObjectOptJSONObject2.optDouble("down_y", 0.0d);
                double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("up_x", 0.0d);
                double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("up_y", 0.0d);
                double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("down_time", 0.0d);
                double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("up_time", 0.0d);
                double dOptDouble7 = jSONObjectOptJSONObject2.optDouble("button_x", 0.0d);
                double dOptDouble8 = jSONObjectOptJSONObject2.optDouble("button_y", 0.0d);
                double dOptDouble9 = jSONObjectOptJSONObject2.optDouble("button_width", 0.0d);
                double dOptDouble10 = jSONObjectOptJSONObject2.optDouble("button_height", 0.0d);
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("rectInfo");
                d17 = dOptDouble10;
                d18 = dOptDouble2;
                d11 = dOptDouble3;
                d12 = dOptDouble5;
                d13 = dOptDouble6;
                d14 = dOptDouble7;
                d15 = dOptDouble8;
                d16 = dOptDouble9;
                str = strOptString;
                d10 = dOptDouble4;
            } else {
                str = strOptString;
                d10 = 0.0d;
                d11 = 0.0d;
                dOptDouble = 0.0d;
                d12 = 0.0d;
                d13 = 0.0d;
                d14 = 0.0d;
                d15 = 0.0d;
                d16 = 0.0d;
                d17 = 0.0d;
                jSONObjectOptJSONObject = null;
            }
            com.bytedance.sdk.openadsdk.core.model.edo edoVarZRu = new edo.ZRu().uR((float) d18).mZ((float) dOptDouble).NOt((float) d11).ZRu((float) d10).NOt((long) d12).ZRu((long) d13).mZ((int) d14).uR((int) d15).TFq((int) d16).Ht((int) d17).ZRu(strOptString2).ZRu((SparseArray<mZ.ZRu>) null).ZRu(true).NOt(iOptInt).ZRu(jSONObjectOptJSONObject).ZRu(jSONObject.optInt("clickAreaCategory", -1)).NOt(jSONObjectOptJSONObject2).ZRu();
            com.bytedance.sdk.component.adexpress.NOt.ZH zh = this.om;
            if (zh != null) {
                zh.ZRu(null, iOptInt, edoVarZRu);
            }
            ZRu(str, iOptInt, edoVarZRu);
        } catch (Exception unused) {
            com.bytedance.sdk.component.adexpress.NOt.ZH zh2 = this.om;
            if (zh2 != null) {
                zh2.ZRu(null, -1, null);
            }
        }
    }

    private void Vor(String str) {
        int iIndexOf;
        if (str != null && str.startsWith("bytedance://")) {
            try {
                if (str.equals("bytedance://dispatch_message/")) {
                    WebView webViewSAl = sAl();
                    if (webViewSAl != null) {
                        com.bytedance.sdk.component.utils.ZH.ZRu(webViewSAl, "javascript:ToutiaoJSBridge._fetchQueue()");
                        return;
                    }
                    return;
                }
                if (str.startsWith("bytedance://private/setresult/") && (iIndexOf = str.indexOf(38, 30)) > 0) {
                    String strSubstring = str.substring(30, iIndexOf);
                    String strSubstring2 = str.substring(iIndexOf + 1);
                    if (!strSubstring.equals("SCENE_FETCHQUEUE") || strSubstring2.length() <= 0) {
                        return;
                    }
                    Mm(strSubstring2);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void Ht(String str) {
        this.bO = str;
    }

    public VdW NOt(com.bytedance.sdk.component.Vor.uR uRVar) {
        this.uR = new WeakReference<>(uRVar);
        return this;
    }

    public void TFq(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.qF qFVarZRu = com.bytedance.sdk.openadsdk.core.NOt.ZRu(jSONObject);
        if (qFVarZRu != null) {
            boolean zUR = com.bytedance.sdk.openadsdk.core.model.yBV.uR(this.WMI);
            ZRu(qFVarZRu, zUR ? Yx.NOt(this.sAl) : this.bO, !zUR);
        }
    }

    public void mZ(JSONObject jSONObject) {
        qF.ZRu(yBV(), this.nqR instanceof Activity, jSONObject, this.WMI, this.bO, this.sAl, sAl(), this.Mm);
    }

    public JSONObject Ht(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            com.bytedance.sdk.openadsdk.core.model.qF qFVar = this.WMI;
            if (qFVar instanceof com.bytedance.sdk.openadsdk.core.model.om) {
                List<com.bytedance.sdk.openadsdk.core.model.qF> listMZ = ((com.bytedance.sdk.openadsdk.core.model.om) qFVar).gy().mZ();
                for (int i10 = 0; i10 < listMZ.size(); i10++) {
                    jSONArray.put(mZ(listMZ.get(i10)));
                }
            }
            jSONObject2.put("creatives", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public VdW NOt(boolean z10) {
        this.Cox = z10;
        return this;
    }

    public void NOt() {
        com.bytedance.sdk.component.ZRu.WMI wmi = this.Ho;
        if (wmi == null) {
            return;
        }
        wmi.ZRu();
        this.Ho = null;
    }

    public VdW ZRu(com.bytedance.sdk.openadsdk.core.widget.ZRu.ZRu zRu) {
        this.Vr = zRu;
        return this;
    }

    public VdW ZRu(com.bytedance.sdk.openadsdk.core.widget.Ht ht) {
        this.Mm = ht;
        return this;
    }

    public boolean FA() {
        return this.AK;
    }

    public VdW ZRu(com.bytedance.sdk.component.Vor.uR uRVar) {
        WebView webView = uRVar.getWebView();
        if (webView != null) {
            try {
                com.bytedance.sdk.component.ZRu.WMI wmiNOt = com.bytedance.sdk.component.ZRu.WMI.ZRu(webView).ZRu(new com.bytedance.sdk.openadsdk.ZH.ZRu()).ZRu("ToutiaoJSBridge").ZRu(new com.bytedance.sdk.component.ZRu.lp() { // from class: com.bytedance.sdk.openadsdk.core.VdW.1
                    @Override // com.bytedance.sdk.component.ZRu.lp
                    @NonNull
                    public <T> T ZRu(@NonNull String str, @NonNull Type type) {
                        return null;
                    }

                    @Override // com.bytedance.sdk.component.ZRu.lp
                    @NonNull
                    public <T> String ZRu(@NonNull T t10) {
                        return null;
                    }
                }).ZRu(Vor.NOt().WMI()).NOt(true).ZRu().NOt();
                this.Ho = wmiNOt;
                com.bytedance.sdk.openadsdk.ZH.ZRu.Ht.ZRu(wmiNOt, this);
                com.bytedance.sdk.openadsdk.ZH.ZRu.ZRu.ZRu(this.Ho, this);
                com.bytedance.sdk.openadsdk.ZH.ZRu.NOt.ZRu(this.Ho, this);
                com.bytedance.sdk.openadsdk.ZH.ZRu.mZ.ZRu(this.Ho, this);
                com.bytedance.sdk.openadsdk.ZH.ZRu.TFq.ZRu(this.Ho, this);
                com.bytedance.sdk.openadsdk.ZH.ZRu.FA.ZRu(this.Ho, this);
                com.bytedance.sdk.openadsdk.ZH.ZRu.aT.ZRu(this.Ho, this);
                com.bytedance.sdk.openadsdk.ZH.ZRu.Vor.ZRu(this.Ho, uRVar);
                com.bytedance.sdk.openadsdk.ZH.ZRu.Mm.ZRu(this.Ho, this);
                com.bytedance.sdk.openadsdk.ZH.ZRu.uR.ZRu(this.Ho, this.to);
            } catch (Exception unused) {
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean FA(String str) {
        if (!TextUtils.isEmpty(str) && "click_other".equals(str)) {
            return Vor();
        }
        return true;
    }

    public VdW NOt(int i10) {
        this.sAl = i10;
        return this;
    }

    public void mZ(boolean z10) {
        this.mZ = z10;
    }

    @JProtect
    public static void NOt(JSONObject jSONObject) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = oK().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("appName", com.bytedance.sdk.openadsdk.common.NOt.ZRu());
        jSONObject.put("innerAppName", com.bytedance.sdk.openadsdk.common.NOt.TFq());
        jSONObject.put("aid", com.bytedance.sdk.openadsdk.common.NOt.NOt());
        jSONObject.put("sdkEdition", com.bytedance.sdk.openadsdk.common.NOt.mZ());
        jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, com.bytedance.sdk.openadsdk.common.NOt.uR());
        jSONObject.put("netType", com.bytedance.sdk.openadsdk.common.NOt.Ht());
        jSONObject.put("supportList", jSONArray);
        jSONObject.put("deviceId", com.bytedance.sdk.openadsdk.common.NOt.ZRu(WMI.ZRu()));
        if (DeviceUtils.NOt(WMI.ZRu())) {
            jSONObject.put("device_platform", "Android_Pad");
        } else {
            jSONObject.put("device_platform", "Android");
        }
        jSONObject.put("device_type", Build.VERSION.RELEASE);
    }

    private void mZ(String str, JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", NotificationCompat.CATEGORY_EVENT);
            jSONObject2.put("__event_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            om(jSONObject2);
        } catch (Exception unused) {
        }
    }

    @JProtect
    private void edo(JSONObject jSONObject) {
        int i10;
        double dOptDouble;
        double dOptDouble2;
        boolean z10;
        int i11;
        double d10;
        com.bytedance.sdk.openadsdk.lp.Ht ht;
        VdW vdW = this;
        if (vdW.om == null || jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.uR.uR.TFq tFq = vdW.gI;
        if (tFq != null) {
            tFq.yBV();
        }
        com.bytedance.sdk.component.adexpress.NOt.edo edoVar = new com.bytedance.sdk.component.adexpress.NOt.edo();
        edoVar.ZRu(1);
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isRenderSuc");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("AdSize");
            if (jSONObjectOptJSONObject != null) {
                dOptDouble = jSONObjectOptJSONObject.optDouble(InMobiNetworkValues.WIDTH);
                dOptDouble2 = jSONObjectOptJSONObject.optDouble(InMobiNetworkValues.HEIGHT);
            } else {
                dOptDouble = 0.0d;
                dOptDouble2 = 0.0d;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject2 != null) {
                try {
                    double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("x");
                    double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("y");
                    z10 = zOptBoolean;
                    i11 = 101;
                    try {
                        double dOptDouble5 = jSONObjectOptJSONObject2.optDouble(InMobiNetworkValues.WIDTH);
                        double dOptDouble6 = jSONObjectOptJSONObject2.optDouble(InMobiNetworkValues.HEIGHT);
                        if (vdW.oK(jSONObjectOptJSONObject2)) {
                            d10 = dOptDouble2;
                            edoVar.ZRu((float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopLeft"));
                            edoVar.NOt((float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopRight"));
                            edoVar.mZ((float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomLeft"));
                            edoVar.uR((float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomRight"));
                        } else {
                            d10 = dOptDouble2;
                        }
                        edoVar.mZ(dOptDouble3);
                        edoVar.uR(dOptDouble4);
                        edoVar.TFq(dOptDouble5);
                        edoVar.Ht(dOptDouble6);
                    } catch (Exception unused) {
                        vdW = this;
                        i10 = 101;
                    }
                } catch (Exception unused2) {
                    i10 = 101;
                    vdW = this;
                    edoVar.NOt(i10);
                    edoVar.ZRu(FA.ZRu(i10));
                    vdW.om.ZRu(edoVar);
                }
            } else {
                z10 = zOptBoolean;
                d10 = dOptDouble2;
                i11 = 101;
            }
            try {
                String strOptString = jSONObject.optString("msg", FA.ZRu(i11));
                i10 = i11;
                try {
                    int iOptInt = jSONObject.optInt(f.f79422s, i10);
                    edoVar.ZRu(z10);
                    edoVar.ZRu(dOptDouble);
                    edoVar.NOt(d10);
                    edoVar.ZRu(strOptString);
                    edoVar.NOt(iOptInt);
                    vdW = this;
                    vdW.om.ZRu(edoVar);
                    if (jSONObjectOptJSONObject2 == null || (ht = vdW.Qg) == null) {
                        return;
                    }
                    ht.ZRu(edoVar);
                    return;
                } catch (Exception unused3) {
                    vdW = this;
                    edoVar.NOt(i10);
                    edoVar.ZRu(FA.ZRu(i10));
                    vdW.om.ZRu(edoVar);
                }
            } catch (Exception unused4) {
                vdW = this;
            }
        } catch (Exception unused5) {
        }
        i10 = 101;
        edoVar.NOt(i10);
        edoVar.ZRu(FA.ZRu(i10));
        vdW.om.ZRu(edoVar);
    }

    public void Mm(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.ZRu zRuGy;
        if (jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt(FirebaseAnalytics.Param.INDEX);
        com.bytedance.sdk.openadsdk.core.model.qF qFVar = this.WMI;
        if (!(qFVar instanceof com.bytedance.sdk.openadsdk.core.model.om) || (zRuGy = ((com.bytedance.sdk.openadsdk.core.model.om) qFVar).gy()) == null) {
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.qF> listMZ = zRuGy.mZ();
        if (iOptInt < 0 || iOptInt >= listMZ.size()) {
            return;
        }
        ZRu(listMZ.get(iOptInt), this.bO, false);
        com.bytedance.sdk.openadsdk.core.sAl.uR.NOt nOt = this.NBW;
        if (nOt != null) {
            nOt.uR();
        }
    }

    public void mZ(int i10) {
        com.bytedance.sdk.openadsdk.core.FA.edo edoVar = this.OCA;
        if (edoVar != null) {
            edoVar.NOt(i10);
        }
    }

    private JSONObject mZ(com.bytedance.sdk.openadsdk.core.model.qF qFVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("is_ad_event", "1");
        jSONObject2.put(BidResponsedEx.KEY_CID, qFVar.nv());
        jSONObject2.put("req_id", qFVar.jYr());
        jSONObject2.put("ad_id", qFVar.vE());
        jSONObject2.put("log_extra", qFVar.Wo());
        jSONObject2.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.yBV.CH().vE());
        jSONObject.put("ad_info", jSONObject2);
        jSONObject.put("endcard_creative", qFVar.NlY());
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void NOt(com.bytedance.sdk.openadsdk.core.FA.edo edoVar, JSONObject jSONObject) {
        if (edoVar == null || jSONObject == null) {
            return;
        }
        try {
            edoVar.ZRu(jSONObject.optBoolean(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false));
        } catch (Exception unused) {
        }
    }

    public com.bytedance.sdk.component.ZRu.WMI ZRu() {
        return this.Ho;
    }

    public static JSONObject NOt(com.bytedance.sdk.openadsdk.core.model.qF qFVar) {
        int iGE;
        boolean zWMI;
        JSONObject jSONObject = new JSONObject();
        if (WMI.uR() != null) {
            int i10 = 0;
            if (qFVar != null) {
                try {
                    iGE = qFVar.GE();
                } catch (Exception unused) {
                }
            } else {
                iGE = 0;
            }
            int iKlw = qFVar != null ? qFVar.klw() : 0;
            int iAT = WMI.uR().aT(String.valueOf(iGE));
            int iOm = WMI.uR().om(String.valueOf(iGE));
            boolean zHt = WMI.uR().Ht(String.valueOf(iGE));
            boolean z10 = WMI.uR().sAl(String.valueOf(iGE)) == 1;
            if (iKlw != 7 && iKlw != 8) {
                zWMI = WMI.uR().mZ(String.valueOf(iGE));
            } else {
                zWMI = WMI.uR().WMI(String.valueOf(iGE));
            }
            jSONObject.put("voice_control", zWMI);
            jSONObject.put("rv_skip_time", iAT);
            jSONObject.put("fv_skip_show", zHt);
            jSONObject.put("iv_skip_time", iOm);
            jSONObject.put("show_dislike", qFVar != null && qFVar.hNL());
            jSONObject.put("video_adaptation", qFVar != null ? qFVar.Nb() : 0);
            jSONObject.put("skip_change_to_close", z10);
            if (qFVar.HCG() && com.bytedance.sdk.openadsdk.core.settings.yBV.CH().cA()) {
                i10 = 1;
            }
            jSONObject.put("bar_render_platform", i10);
        }
        return jSONObject;
    }

    public VdW ZRu(com.bytedance.sdk.openadsdk.uR.uR.TFq tFq) {
        this.gI = tFq;
        return this;
    }

    public VdW ZRu(boolean z10) {
        this.NOt = z10;
        return this;
    }

    public VdW ZRu(View view) {
        this.ZH = new WeakReference<>(view);
        return this;
    }

    public VdW ZRu(int i10) {
        this.oK = i10;
        return this;
    }

    public VdW ZRu(com.bytedance.sdk.openadsdk.core.model.qF qFVar) {
        this.WMI = qFVar;
        if (qFVar != null) {
            this.qF = qFVar.pvl();
        }
        return this;
    }

    public VdW ZRu(com.bytedance.sdk.openadsdk.lp.NOt nOt) {
        this.f140665Nb = nOt;
        return this;
    }

    public VdW ZRu(com.bytedance.sdk.openadsdk.lp.Vor vor) {
        this.VdW = vor;
        return this;
    }

    public VdW ZRu(Map<String, Object> map) {
        this.ZRu = map;
        return this;
    }

    public VdW ZRu(com.bytedance.sdk.component.adexpress.NOt.ZH zh) {
        this.om = zh;
        return this;
    }

    public VdW ZRu(com.bytedance.sdk.openadsdk.core.FA.edo edoVar) {
        this.OCA = edoVar;
        return this;
    }

    public VdW ZRu(com.bytedance.sdk.openadsdk.core.NOt.uR uRVar) {
        this.fcs = uRVar;
        return this;
    }

    public VdW ZRu(JSONObject jSONObject) {
        this.to = jSONObject;
        return this;
    }

    public VdW ZRu(com.bytedance.sdk.openadsdk.lp.ZRu zRu) {
        this.Zf = zRu;
        return this;
    }

    public VdW ZRu(com.bytedance.sdk.openadsdk.lp.TFq tFq) {
        this.ru = tFq;
        return this;
    }

    public VdW ZRu(com.bytedance.sdk.openadsdk.lp.uR uRVar) {
        this.le = uRVar;
        return this;
    }

    public VdW ZRu(List<com.bytedance.sdk.openadsdk.core.model.qF> list) {
        this.WD = list;
        return this;
    }

    public void uR(boolean z10) {
        this.Hvv = z10;
    }

    public VdW ZRu(com.bytedance.sdk.openadsdk.lp.Ht ht) {
        this.Qg = ht;
        return this;
    }

    public static JSONArray NOt(List<com.bytedance.sdk.openadsdk.core.model.qF> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                jSONArray.put(list.get(i10).HZ());
            }
        }
        return jSONArray;
    }

    public static void ZRu(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.qF qFVar) throws Exception {
        String strVE = qFVar.vE();
        if (!TextUtils.isEmpty(strVE)) {
            jSONObject.put(BidResponsedEx.KEY_CID, strVE);
        }
        String strWo = qFVar.Wo();
        if (!TextUtils.isEmpty(strWo)) {
            jSONObject.put("log_extra", strWo);
        }
        String strIU = qFVar.IU();
        if (!TextUtils.isEmpty(strIU)) {
            jSONObject.put(DownloadModel.DOWNLOAD_URL, strIU);
        }
        jSONObject.put("dc", TextUtils.isEmpty(WMI.uR().bO()) ? WMI.uR().bO() : "SG");
        jSONObject.put("language", lp.ZRu());
        jSONObject.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.yBV.CH().vE());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            om(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public void NOt(@NonNull final Uri uri) {
        try {
            String host = uri.getHost();
            if (!"log_event".equals(host) && !"custom_event".equals(host) && !"log_event_v3".equals(host)) {
                if ("private".equals(host) || "dispatch_message".equals(host)) {
                    Vor(uri.toString());
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.uR.mZ.ZRu(new com.bytedance.sdk.component.FA.FA("log_event_handleUri") { // from class: com.bytedance.sdk.openadsdk.core.VdW.9
                @Override // java.lang.Runnable
                public void run() {
                    long j10;
                    String strZRu;
                    String queryParameter = uri.getQueryParameter("category");
                    String queryParameter2 = uri.getQueryParameter(d.C0152d.f79310d);
                    VdW.this.bO = queryParameter2;
                    String queryParameter3 = uri.getQueryParameter("label");
                    if (VdW.this.FA(queryParameter3)) {
                        long j11 = 0;
                        try {
                            j10 = Long.parseLong(uri.getQueryParameter("value"));
                        } catch (Exception unused) {
                            j10 = 0;
                        }
                        try {
                            j11 = Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (Exception unused2) {
                        }
                        long j12 = j11;
                        String queryParameter4 = uri.getQueryParameter(s.f115701h);
                        JSONObject jSONObject = null;
                        if (!TextUtils.isEmpty(queryParameter4)) {
                            try {
                                JSONObject jSONObject2 = new JSONObject(queryParameter4);
                                try {
                                    jSONObject2.putOpt("ua_policy", Integer.valueOf(VdW.this.oK));
                                } catch (Exception unused3) {
                                }
                                jSONObject = jSONObject2;
                            } catch (Exception unused4) {
                            }
                        }
                        if ("click".equals(queryParameter3)) {
                            jSONObject = VdW.this.OCA(jSONObject);
                        }
                        if ("landing_perf_error".equals(queryParameter3) || "landing_perf_stats".equals(queryParameter3)) {
                            try {
                                jSONObject = new JSONObject();
                                for (String str : uri.getQueryParameterNames()) {
                                    try {
                                        if (s.f115701h.equals(str)) {
                                            jSONObject.put("ad_extra_data", new JSONObject(uri.getQueryParameter(str)).optString("ad_extra_data"));
                                        } else {
                                            jSONObject.put(str, uri.getQueryParameter(str));
                                        }
                                    } catch (Exception unused5) {
                                    }
                                }
                                strZRu = VdW.this.Ht;
                            } catch (Exception unused6) {
                                return;
                            }
                        } else {
                            strZRu = VdW.this.ZRu(queryParameter2, queryParameter3);
                        }
                        com.bytedance.sdk.openadsdk.uR.mZ.ZRu(VdW.this.WMI, queryParameter, strZRu, queryParameter3, j10, j12, jSONObject, com.bytedance.sdk.openadsdk.core.model.yBV.uR(VdW.this.WMI));
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0348 A[PHI: r4
      0x0348: PHI (r4v19 org.json.JSONObject) = (r4v14 org.json.JSONObject), (r4v20 org.json.JSONObject) binds: [B:224:0x0393, B:206:0x0346] A[DONT_GENERATE, DONT_INLINE]] */
    @com.bytedance.JProtect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject ZRu(com.bytedance.sdk.openadsdk.core.VdW.NOt r23, int r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.VdW.ZRu(com.bytedance.sdk.openadsdk.core.VdW$NOt, int):org.json.JSONObject");
    }

    private void ZRu(JSONObject jSONObject, boolean z10, String str) {
        com.bytedance.sdk.openadsdk.core.widget.Ht ht;
        if (z10) {
            try {
                String strOptString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(strOptString) || new JSONObject(strOptString).optInt("agg_request_type", -1) != 1 || !"click".equals(str) || (ht = this.Mm) == null) {
                    return;
                }
                ht.ZRu();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lp.ZRu("TTAD.AndroidObject", "callAggClickListener faile", th);
            }
        }
    }

    private boolean ZRu(JSONObject jSONObject, JSONObject jSONObject2) {
        String strOptString;
        int iOptInt;
        String strOptString2;
        if (jSONObject != null) {
            iOptInt = jSONObject.optInt("landingStyle");
            strOptString = jSONObject.optString("url");
            strOptString2 = jSONObject.optString("fallback_url");
        } else {
            strOptString = null;
            iOptInt = -1;
            strOptString2 = null;
        }
        if (iOptInt == 1) {
            if (!com.bytedance.sdk.component.utils.oK.ZRu(strOptString)) {
                try {
                    jSONObject2.put("invalid_url", 1);
                } catch (JSONException e10) {
                    com.bytedance.sdk.component.utils.lp.ZRu("TTAD.AndroidObject", "handleUrl, EX1->: ", e10);
                }
                return false;
            }
            return true;
        }
        if (iOptInt == 2) {
            try {
                if (TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString2)) {
                    jSONObject2.put("empty_url", 1);
                    return false;
                }
                if (!com.bytedance.sdk.component.utils.oK.ZRu(strOptString2)) {
                    jSONObject2.put("invalid_url", 1);
                    return false;
                }
            } catch (JSONException e11) {
                com.bytedance.sdk.component.utils.lp.ZRu("TTAD.AndroidObject", "handleUrl, EX2->: ", e11);
            }
        }
        return true;
    }

    private void ZRu(String str, boolean z10) {
        if (this.gI == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            this.gI.ZRu(str);
        } else {
            this.gI.NOt(str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.TFq.NOt
    public void ZRu(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("time");
            String strOptString = jSONObject.optString("flag");
            com.bytedance.sdk.openadsdk.core.FA.edo edoVar = this.OCA;
            if (edoVar != null) {
                edoVar.ZRu(iOptInt, strOptString);
            }
        } catch (JSONException unused) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    private void ZRu(final NOt nOt, final JSONObject jSONObject) {
        if (nOt == null) {
            return;
        }
        try {
            ZRu(nOt.uR, new com.bytedance.sdk.openadsdk.lp.mZ() { // from class: com.bytedance.sdk.openadsdk.core.VdW.6
                @Override // com.bytedance.sdk.openadsdk.lp.mZ
                public void ZRu(boolean z10, List<com.bytedance.sdk.openadsdk.core.model.qF> list) {
                    if (!z10) {
                        VdW.this.NOt(nOt.NOt, jSONObject);
                        return;
                    }
                    try {
                        jSONObject.put("creatives", VdW.NOt(list));
                        VdW.this.NOt(nOt.NOt, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    @JProtect
    private boolean ZRu(String str, int i10, com.bytedance.sdk.openadsdk.core.model.edo edoVar) {
        HashMap<String, aT> map;
        if (TextUtils.isEmpty(str) || (map = this.fWk) == null || map.get(str) == null) {
            return false;
        }
        throw null;
    }

    @JProtect
    public void ZRu(JSONObject jSONObject, final com.bytedance.sdk.openadsdk.lp.mZ mZVar) {
        if (mZVar == null) {
            return;
        }
        try {
            final com.bytedance.sdk.openadsdk.lp.mZ mZVar2 = new com.bytedance.sdk.openadsdk.lp.mZ() { // from class: com.bytedance.sdk.openadsdk.core.VdW.7
                @Override // com.bytedance.sdk.openadsdk.lp.mZ
                public void ZRu(final boolean z10, final List<com.bytedance.sdk.openadsdk.core.model.qF> list) {
                    com.bytedance.sdk.openadsdk.utils.WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VdW.7.1
                        @Override // java.lang.Runnable
                        public void run() {
                            mZVar.ZRu(z10, list);
                        }
                    });
                }
            };
            if (this.WMI != null && !TextUtils.isEmpty(this.lp)) {
                int iKlw = this.WMI.klw();
                AdSlot adSlotWD = this.WMI.WD();
                com.bytedance.sdk.openadsdk.core.model.OCA oca = new com.bytedance.sdk.openadsdk.core.model.OCA();
                oca.Ht = true;
                if (this.WMI.Ho() != null || this.WMI.AK() != null) {
                    oca.FA = 2;
                }
                JSONObject jSONObject2 = this.qF;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                }
                oca.Mm = jSONObject2;
                WMI.mZ().ZRu(adSlotWD, oca, iKlw, new om.ZRu() { // from class: com.bytedance.sdk.openadsdk.core.VdW.8
                    @Override // com.bytedance.sdk.openadsdk.core.om.ZRu
                    public void ZRu(int i10, String str) {
                        mZVar2.ZRu(false, null);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.om.ZRu
                    public void ZRu(com.bytedance.sdk.openadsdk.core.model.ZRu zRu, com.bytedance.sdk.openadsdk.core.model.NOt nOt) {
                        if (zRu.mZ() == null || zRu.mZ().isEmpty()) {
                            mZVar2.ZRu(false, null);
                            nOt.ZRu(-3);
                            com.bytedance.sdk.openadsdk.core.model.NOt.ZRu(nOt);
                        } else {
                            com.bytedance.sdk.openadsdk.core.model.qF qFVar = zRu.mZ().get(0);
                            if (qFVar != null) {
                                VdW.this.qF = qFVar.pvl();
                            }
                            mZVar2.ZRu(true, zRu.mZ());
                        }
                    }
                });
                return;
            }
            mZVar2.ZRu(false, null);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.AndroidObject", "get ads error", e10);
        }
    }

    public boolean ZRu(Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            if (!"bytedance".equals(uri.getScheme())) {
                return false;
            }
            if (FA.containsKey(uri.getHost())) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String ZRu(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.core.model.yBV.uR(this.WMI)) {
            if ("show".equals(str2)) {
                return Yx.ZRu(this.sAl);
            }
            return "aggregate_page";
        }
        if (this.f140665Nb != null) {
            return Yx.ZRu(this.sAl);
        }
        return this.om == null ? Yx.NOt(this.sAl) : str;
    }

    @Override // com.bytedance.sdk.component.utils.ru.ZRu
    public void ZRu(Message message) {
        if (message != null && message.what == 11) {
            Object obj = message.obj;
            if (obj instanceof NOt) {
                try {
                    ZRu((NOt) obj, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.aT.NOt
    public void ZRu(String str, JSONObject jSONObject) {
        mZ(str, jSONObject);
    }

    private void ZRu(com.bytedance.sdk.openadsdk.core.model.qF qFVar, String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.NOt.ZRu zRu = new com.bytedance.sdk.openadsdk.core.NOt.ZRu(WMI.ZRu(), qFVar, str, this.sAl);
        zRu.ZRu(com.bytedance.sdk.openadsdk.qF.ZRu.ZRu.Mm.ZRu(WMI.ZRu(), qFVar, str));
        if (!z10) {
            zRu.ZRu(false);
        }
        zRu.onClick(null);
    }

    public void ZRu(com.bytedance.sdk.openadsdk.core.sAl.uR.NOt nOt) {
        this.NBW = nOt;
    }

    public void ZRu(ZRu zRu) {
        this.Nl = zRu;
    }
}

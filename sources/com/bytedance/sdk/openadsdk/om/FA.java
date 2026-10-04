package com.bytedance.sdk.openadsdk.om;

import R9.c;
import Y6.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.compose.animation.core.E0;
import androidx.concurrent.futures.a;
import com.android.launcher3.LauncherSettings;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import s0.x;

/* JADX INFO: loaded from: classes3.dex */
public class FA {
    private String AK;
    private float AOL;
    private int AZ;
    private int CA;
    private int CH;
    private String CTl;
    private WeakReference<View> CXy;
    private long Cox;
    private volatile boolean DoD;
    private int Ds;
    private final Handler FA;
    private com.bytedance.sdk.openadsdk.om.ZRu FFX;
    private long GC;
    private ViewTreeObserver.OnGlobalLayoutListener GE;
    private int Gis;
    private int Guy;
    private String HX;
    private String HZ;
    private long Ho;
    private final String Ht;
    private String Hvv;
    private boolean IJM;
    private int IOC;
    private boolean IU;
    private int IZ;
    private boolean JVq;
    private int Jem;
    private float KIc;
    private String LO;
    private boolean LrZ;

    @Nullable
    private WebView MO;
    private long MR;
    private int MU;
    private final String Mm;
    private boolean NBW;
    public final String NOt;

    /* JADX INFO: renamed from: Nb, reason: collision with root package name */
    private int f140679Nb;
    private int Nl;
    private int Np;
    private String OCA;

    /* JADX INFO: renamed from: Oc, reason: collision with root package name */
    private JSONObject f140680Oc;
    private String Pzo;
    private String Qg;
    private JSONObject RPV;
    public final String TFq;
    private boolean Uf;
    private long VdW;
    private Runnable Vor;
    private String Vr;
    private long WD;
    private boolean WMI;
    private ZRu Wo;
    private int YuF;
    private long Yx;
    private Runnable ZH;
    private int ZRJ;
    public final String ZRu;
    private boolean Zf;
    private String aNu;
    private Runnable aT;
    private String bDW;
    private long bO;
    private String cA;

    /* JADX INFO: renamed from: cb, reason: collision with root package name */
    private boolean f140681cb;
    private JSONObject cvm;
    private String dkT;
    private int eCS;
    private Runnable edo;
    private int eqw;
    private String fOq;
    private long fWk;
    private long fcs;
    private long gI;
    private int gX;
    private int gaw;
    private boolean gmt;
    private String gx;
    private String hNL;
    private boolean hl;
    private Map<String, String> jJC;
    private boolean jQo;
    private int kkl;
    private String klw;
    private String le;
    private final Handler lp;
    public final String mZ;
    private int nqR;
    private NOt oK;
    private Set<String> om;
    private Ht pDA;
    private float pU;
    private int pvl;
    private boolean qF;
    private int qZ;
    private List<JSONObject> qg;

    /* JADX INFO: renamed from: rd, reason: collision with root package name */
    private int f140682rd;
    private boolean ru;
    private Runnable sAl;
    private long th;
    private String to;
    public final String uR;
    private long vE;
    private Context wZ;
    private JSONObject wcb;
    private boolean wzV;
    private boolean xY;
    private boolean yBV;
    private int yM;
    private volatile boolean yx;
    private int yz;
    private mZ zkn;
    private int zr;

    public enum ZRu {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    private FA(Context context, WebView webView, mZ mZVar, com.bytedance.sdk.openadsdk.om.ZRu zRu, ZRu zRu2) {
        this.Ht = "playable_stuck_check_ping";
        this.Mm = "playable_apply_media_permission_callback";
        this.FA = new Handler(Looper.getMainLooper());
        this.lp = new Handler(Looper.getMainLooper());
        this.yBV = true;
        this.WMI = true;
        this.qF = true;
        this.ZRu = "PL_sdk_playable_global_viewable";
        this.NOt = "PL_sdk_page_screen_blank";
        this.mZ = "PL_sdk_playable_destroy_analyze_summary";
        this.uR = "PL_sdk_playable_hardware_dialog_cancel";
        this.TFq = "PL_sdk_playable_hardware_dialog_setting";
        this.om = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.OCA = null;
        this.to = "embeded_ad";
        this.xY = true;
        this.Zf = true;
        this.ru = false;
        this.le = "";
        this.MR = 10L;
        this.fcs = 10L;
        this.f140679Nb = x.h.f238407j;
        this.VdW = 0L;
        this.th = 0L;
        this.WD = -1L;
        this.fWk = -1L;
        this.Yx = -1L;
        this.Cox = -1L;
        this.gI = -1L;
        this.Ho = -1L;
        this.bO = -1L;
        this.AK = "";
        this.Vr = "";
        this.Qg = "";
        this.Hvv = "";
        this.IZ = 0;
        this.nqR = 0;
        this.NBW = false;
        this.Nl = 0;
        this.yz = -1;
        this.Jem = 0;
        this.Gis = 0;
        this.Np = 0;
        this.HX = null;
        this.gmt = false;
        this.ZRJ = 0;
        this.MU = 0;
        this.yM = 0;
        this.gX = 0;
        this.GC = 0L;
        this.vE = 0L;
        this.gaw = -2;
        this.IOC = 0;
        this.pvl = 0;
        this.AZ = 0;
        this.cvm = new JSONObject();
        this.jJC = new HashMap();
        this.RPV = new JSONObject();
        this.bDW = "";
        this.AOL = 0.0f;
        this.KIc = 0.0f;
        this.jQo = false;
        this.hl = false;
        this.Uf = false;
        this.qg = new ArrayList();
        this.wzV = true;
        this.yx = true;
        this.DoD = true;
        this.GE = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.om.FA.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) FA.this.CXy.get();
                    if (view == null) {
                        return;
                    }
                    FA.this.NOt(view);
                } catch (Throwable th) {
                    Mm.ZRu("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.eCS = -1;
        this.gaw = 0;
        this.Wo = zRu2;
        this.MO = webView;
        Vor.ZRu(webView);
        ZRu(webView);
        ZRu(context, mZVar, zRu);
    }

    private void AK() {
        this.oK = new NOt(this, this.f140679Nb);
        this.Vor = new Runnable() { // from class: com.bytedance.sdk.openadsdk.om.FA.5
            @Override // java.lang.Runnable
            public void run() {
                if (FA.this.xY) {
                    FA.this.xY = false;
                    FA.this.FA.removeCallbacks(FA.this.aT);
                    FA.this.ZRu(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.aT = new Runnable() { // from class: com.bytedance.sdk.openadsdk.om.FA.6
            @Override // java.lang.Runnable
            public void run() {
                if (FA.this.xY) {
                    FA.this.xY = false;
                    FA.this.yx = false;
                    FA.this.FA.removeCallbacks(FA.this.Vor);
                    FA.this.ZRu(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.sAl = new Runnable() { // from class: com.bytedance.sdk.openadsdk.om.FA.7
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (FA.this.MO != null) {
                    FA.this.MO.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.om.FA.7.1
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (FA.this.oK != null) {
                                FA.this.oK.ZRu(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (FA.this.lp != null) {
                    FA.this.lp.postDelayed(this, 500L);
                }
            }
        };
        this.edo = new Runnable() { // from class: com.bytedance.sdk.openadsdk.om.FA.8
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                FA.this.ZRu("playable_stuck_check_ping", new JSONObject());
                if (FA.this.lp != null) {
                    FA.this.lp.postDelayed(this, 500L);
                }
            }
        };
        this.ZH = new Runnable() { // from class: com.bytedance.sdk.openadsdk.om.FA.9
            @Override // java.lang.Runnable
            public void run() {
                if (FA.this.vE <= 0) {
                    FA.this.NOt(1, "Clicking on the hot zone causes the program to freeze.");
                } else {
                    if (FA.this.vE - FA.this.GC > FA.this.f140679Nb) {
                        FA.this.NOt(1, "Clicking on the hot zone causes the program to freeze.");
                        return;
                    }
                    FA.this.WD();
                    FA.this.GC = 0L;
                    FA.this.vE = 0L;
                }
            }
        };
    }

    private void Qg() {
        Runnable runnable;
        Runnable runnable2;
        this.oK.ZRu(System.currentTimeMillis());
        Handler handler = this.lp;
        if (handler != null) {
            int i10 = this.gaw;
            if (i10 == 0 && (runnable2 = this.sAl) != null) {
                handler.post(runnable2);
            } else if ((i10 == 1 || i10 == 2) && (runnable = this.edo) != null) {
                handler.post(runnable);
            }
            this.oK.ZRu(500);
        }
    }

    private void Vr() {
        String str;
        if (this.RPV == null || (str = this.CTl) == null || str.contains("/cid_")) {
            return;
        }
        String strOptString = this.RPV.optString(BidResponsedEx.KEY_CID);
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        String host = Uri.parse(this.CTl).getHost();
        if (TextUtils.isEmpty(host)) {
            this.CTl = E0.a(new StringBuilder(), this.CTl, "/cid_", strOptString);
        } else {
            this.CTl = this.CTl.replace(host, a.a(host, "/cid_", strOptString));
        }
    }

    public static /* synthetic */ int lp(FA fa2) {
        int i10 = fa2.IZ;
        fa2.IZ = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int sAl(FA fa2) {
        int i10 = fa2.nqR;
        fa2.nqR = i10 + 1;
        return i10;
    }

    public void Cox() {
        if (this.Uf) {
            return;
        }
        this.Uf = true;
        this.th = 0L;
        this.WMI = true;
        Yx();
        try {
            View view = this.CXy.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.GE);
            }
        } catch (Throwable unused) {
        }
        try {
            this.pDA.NOt();
        } catch (Throwable unused2) {
        }
        try {
            NOt nOt = this.oK;
            if (nOt != null) {
                nOt.ZRu();
                this.oK = null;
            }
            Handler handler = this.lp;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
        try {
            if (!TextUtils.isEmpty(this.CTl)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.IZ);
                jSONObject.put("playable_hit_times", this.nqR);
                int i10 = this.IZ;
                if (i10 > 0) {
                    jSONObject.put("playable_hit_ratio", ((double) this.nqR) / (((double) i10) * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                mZ("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (!TextUtils.isEmpty(this.CTl)) {
                if (this.WD != -1) {
                    this.VdW += System.currentTimeMillis() - this.WD;
                    this.WD = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.VdW);
                mZ("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused4) {
        }
        this.yx = false;
        this.DoD = false;
        this.FA.removeCallbacks(this.Vor);
        this.FA.removeCallbacks(this.aT);
        this.FA.removeCallbacksAndMessages(null);
    }

    public String Ho() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    public void MR() {
        if (this.FFX != null) {
            ZRu zRu = ZRu.FEED_AWEME;
        }
    }

    public void Nb() {
        NOt nOt;
        this.vE = System.currentTimeMillis();
        int i10 = this.gaw;
        if ((i10 == 1 || i10 == 2) && (nOt = this.oK) != null) {
            nOt.ZRu(System.currentTimeMillis());
        }
    }

    public JSONObject OCA() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.pU);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(InMobiNetworkValues.WIDTH, this.Ds);
            jSONObject2.put(InMobiNetworkValues.HEIGHT, this.qZ);
            jSONObject.put(LauncherSettings.Favorites.SCREEN, jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.YuF);
            jSONObject3.put("y", this.CH);
            jSONObject3.put(InMobiNetworkValues.WIDTH, this.kkl);
            jSONObject3.put(InMobiNetworkValues.HEIGHT, this.zr);
            jSONObject.put("webview", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.f140682rd);
            jSONObject4.put("y", this.eqw);
            jSONObject4.put(InMobiNetworkValues.WIDTH, this.CA);
            jSONObject4.put(InMobiNetworkValues.HEIGHT, this.Guy);
            jSONObject.put("visible", jSONObject4);
            return jSONObject;
        } catch (Throwable th) {
            Mm.ZRu("PlayablePlugin", "getViewport error", th);
            return jSONObject;
        }
    }

    public void VdW() {
        int i10;
        int i11 = this.gaw;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            if (this.yx) {
                this.FA.postDelayed(this.Vor, this.MR * 1000);
            }
            if ((this.DoD && lp(this.CTl)) || (i10 = this.gaw) == 1 || i10 == 2) {
                this.FA.postDelayed(this.aT, this.fcs * 1000);
            }
        }
    }

    public void WD() {
        if (this.Zf) {
            this.Ho = System.currentTimeMillis();
            if (this.Wo == ZRu.FEED_AWEME) {
                if (this.f140681cb && this.IOC == 3) {
                    NOt nOt = this.oK;
                    if (nOt != null && nOt.NOt()) {
                        Qg();
                        return;
                    } else {
                        if (this.oK == null) {
                            this.oK = new NOt(this, this.f140679Nb);
                            Qg();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.f140681cb && this.IOC == 2) {
                NOt nOt2 = this.oK;
                if (nOt2 != null && nOt2.NOt()) {
                    Qg();
                } else if (this.oK == null) {
                    this.oK = new NOt(this, this.f140679Nb);
                    Qg();
                }
            }
        }
    }

    public com.bytedance.sdk.openadsdk.om.ZRu WMI() {
        return this.FFX;
    }

    public void Yx() {
        this.pvl = 0;
        this.AZ = 0;
        this.pU = 0.0f;
        this.Ds = 0;
        this.qZ = 0;
        this.CH = 0;
        this.YuF = 0;
        this.kkl = 0;
        this.zr = 0;
        this.eqw = 0;
        this.f140682rd = 0;
        this.CA = 0;
        this.Guy = 0;
    }

    public void Zf() {
        this.yz = 2;
    }

    public int bO() {
        return this.eCS;
    }

    public JSONObject edo() {
        boolean zZRu;
        boolean zZRu2;
        try {
            boolean z10 = true;
            if (Build.VERSION.SDK_INT >= 33) {
                zZRu = TFq.ZRu(this.wZ, "android.permission.READ_MEDIA_IMAGES");
                zZRu2 = true;
            } else {
                zZRu = TFq.ZRu(this.wZ, "android.permission.READ_EXTERNAL_STORAGE");
                zZRu2 = TFq.ZRu(this.wZ, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", zZRu);
            jSONObject.put("isHasWrite", zZRu2);
            if (!zZRu || !zZRu2) {
                z10 = false;
            }
            jSONObject.put(c.f67796d, z10);
            return jSONObject;
        } catch (Throwable th) {
            Mm.ZRu("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public void fWk() {
        try {
            NOt nOt = this.oK;
            if (nOt != null) {
                nOt.ZRu();
            }
            Handler handler = this.lp;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public void fcs() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.gI > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.gI);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.Yx > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.Yx);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            mZ("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public int gI() {
        return (this.fWk == -1 || !this.f140681cb) ? 1 : 2;
    }

    public void le() {
        if (this.FFX != null) {
            ZRu zRu = ZRu.FEED_AWEME;
        }
    }

    public JSONObject oK() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.Wo.ordinal());
            jSONObject.put("safe_area_top_height", this.AOL);
            jSONObject.put("safe_area_bottom_height", this.KIc);
            jSONObject.put("playable_enter_from", this.Gis);
            jSONObject.put("playable_retry_count", this.Jem);
            jSONObject.put("playable_card_session", this.AK);
            jSONObject.put("playable_video_session", this.Vr);
            jSONObject.put("playable_network_type", yBV());
            jSONObject.put("aweme_id", this.Hvv);
            return jSONObject;
        } catch (Throwable th) {
            Mm.ZRu("PlayablePlugin", "playableInfo error", th);
            return new JSONObject();
        }
    }

    public JSONObject om() {
        return this.RPV;
    }

    public JSONObject qF() {
        if (this.cvm.isNull(InMobiNetworkValues.WIDTH)) {
            View view = this.CXy.get();
            if (view == null) {
                return this.cvm;
            }
            NOt(view);
        }
        return this.cvm;
    }

    public void ru() {
        this.gmt = true;
    }

    public void th() {
        this.DoD = false;
        this.FA.removeCallbacks(this.aT);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.Yx > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.Yx);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            mZ("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void to() {
        com.bytedance.sdk.openadsdk.om.ZRu zRu = this.FFX;
        if (zRu != null) {
            zRu.NOt();
        }
    }

    public void xY() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.gI > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.gI);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.Yx > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.Yx;
                this.bO = jCurrentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", jCurrentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            mZ("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public String yBV() {
        com.bytedance.sdk.openadsdk.om.ZRu zRu;
        if (TextUtils.isEmpty(this.Qg) && (zRu = this.FFX) != null) {
            this.Qg = zRu.ZRu().toString();
        }
        return this.Qg;
    }

    private boolean lp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public boolean FA() {
        return this.IJM;
    }

    public String Ht() {
        return this.HZ;
    }

    public String Mm() {
        return this.aNu;
    }

    public String TFq() {
        return this.Pzo;
    }

    public boolean Vor() {
        return this.f140681cb;
    }

    public Set<String> ZH() {
        return this.pDA.ZRu();
    }

    public JSONObject aT() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.JVq);
            return jSONObject;
        } catch (Throwable th) {
            Mm.ZRu("PlayablePlugin", "getPlayableClickStatus error", th);
            return new JSONObject();
        }
    }

    public JSONObject mZ() {
        return this.wcb;
    }

    public JSONObject sAl() {
        try {
            boolean zZRu = TFq.ZRu(this.wZ, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(c.f67796d, zZRu);
            return jSONObject;
        } catch (Throwable th) {
            Mm.ZRu("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public String uR() {
        return this.hNL;
    }

    public JSONObject FA(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (iOptInt == 1) {
                jSONObject2.put(c.f67796d, TFq.NOt(this.wZ, "android.permission.RECORD_AUDIO"));
            } else {
                if (iOptInt == 2) {
                    jSONObject2.put(c.f67796d, TFq.NOt(this.wZ, "android.permission.CAMERA"));
                    return jSONObject2;
                }
                if (iOptInt == 3) {
                    jSONObject2.put(c.f67796d, TFq.ZRu(this.wZ));
                    return jSONObject2;
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public FA Ht(String str) {
        this.to = str;
        return this;
    }

    public FA Mm(String str) {
        int iIndexOf;
        String strDecode;
        this.bDW = str;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                String host = uri.getHost();
                if (!"webview".equalsIgnoreCase(host) && (host == null || !host.contains("webview"))) {
                    if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                        if (this.gaw == -1) {
                            NOt(2);
                        } else {
                            NOt(1);
                        }
                    }
                } else {
                    NOt(0);
                    String queryParameter = uri.getQueryParameter("url");
                    if (!TextUtils.isEmpty(queryParameter) && (strDecode = Uri.decode(queryParameter)) != null) {
                        int iIndexOf2 = strDecode.indexOf("?");
                        str = iIndexOf2 != -1 ? strDecode.substring(0, iIndexOf2) : strDecode;
                    }
                }
            } else {
                NOt(0);
                if (str != null && (iIndexOf = str.indexOf("?")) != -1) {
                    str = str.substring(0, iIndexOf);
                }
            }
        } catch (Throwable unused) {
        }
        this.CTl = str;
        return this;
    }

    public FA TFq(String str) {
        this.aNu = str;
        return this;
    }

    public void Vor(String str) {
        WebView webView;
        boolean z10 = this.IOC == -1;
        this.IOC = 2;
        if (!z10) {
            this.fOq = str;
            JSONObject jSONObject = new JSONObject();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.Cox = jCurrentTimeMillis;
                long j10 = this.Yx;
                jSONObject.put("playable_html_load_start_duration", j10 != -1 ? jCurrentTimeMillis - j10 : 0L);
                jSONObject.put("playable_has_show", gI());
            } catch (Throwable th) {
                Mm.ZRu("PlayablePlugin", "reportUrlLoadFinish error", th);
            }
            mZ("PL_sdk_html_load_finish", jSONObject);
        }
        this.yx = false;
        this.FA.removeCallbacks(this.Vor);
        try {
            if (this.gaw == 0) {
                if (this.yBV && (webView = this.MO) != null) {
                    this.yBV = false;
                    webView.evaluateJavascript(Ho(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.om.FA.11
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                WD();
            }
        } catch (Throwable th2) {
            Mm.ZRu("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    public void ZH(String str) {
        this.FA.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.om.FA.3
            @Override // java.lang.Runnable
            public void run() {
                FA.sAl(FA.this);
            }
        });
    }

    public JSONObject lp() {
        try {
            boolean zZRu = TFq.ZRu(this.wZ, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(c.f67796d, zZRu);
            return jSONObject;
        } catch (Throwable th) {
            Mm.ZRu("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public FA mZ(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.wcb = jSONObject;
            return this;
        } catch (Throwable th) {
            Mm.ZRu("PlayablePlugin", "setPlayableStyle error", th);
            return this;
        }
    }

    public FA uR(String str) {
        this.HZ = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.pvl == view.getWidth() && this.AZ == view.getHeight()) {
                return;
            }
            this.pvl = view.getWidth();
            this.AZ = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InMobiNetworkValues.WIDTH, this.pvl);
            jSONObject.put(InMobiNetworkValues.HEIGHT, this.AZ);
            ZRu("resize", jSONObject);
            this.cvm = jSONObject;
        } catch (Throwable th) {
            Mm.ZRu("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    public void Ht(JSONObject jSONObject) {
        NOt(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    public void TFq(JSONObject jSONObject) {
        this.f140680Oc = jSONObject;
        this.Np++;
        fWk();
        this.FA.removeCallbacks(this.ZH);
        if (this.Zf) {
            this.Ho = System.currentTimeMillis();
            this.GC = System.currentTimeMillis();
            this.vE = 0L;
            int i10 = this.gaw;
            if (i10 == 0) {
                WebView webView = this.MO;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.om.FA.10
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            FA.this.vE = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i10 == 1 || i10 == 2) {
                ZRu("playable_stuck_check_ping", new JSONObject());
            }
            this.FA.postDelayed(this.ZH, this.f140679Nb);
        }
    }

    public FA uR(boolean z10) {
        this.JVq = z10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.JVq);
            ZRu("change_playable_click", jSONObject);
            return this;
        } catch (Throwable th) {
            Mm.ZRu("PlayablePlugin", "setPlayableClick error", th);
            return this;
        }
    }

    private void ZRu(Context context, mZ mZVar, com.bytedance.sdk.openadsdk.om.ZRu zRu) {
        this.OCA = UUID.randomUUID().toString();
        this.wZ = context;
        this.FFX = zRu;
        this.zkn = mZVar;
        aT.ZRu(zRu);
        this.pDA = new Ht(this);
        AK();
        if (this.MO == null) {
            this.eCS = 4;
            this.FA.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.om.FA.4
                @Override // java.lang.Runnable
                public void run() {
                    FA.this.ZRu(5, "webview is null");
                }
            });
        }
    }

    public void aT(String str) {
        this.FA.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.om.FA.2
            @Override // java.lang.Runnable
            public void run() {
                FA.lp(FA.this);
            }
        });
    }

    public void Ht(boolean z10) {
        this.IU = z10;
    }

    public FA mZ(boolean z10) {
        if (this.eCS != -1 && this.f140681cb != z10) {
            this.f140681cb = z10;
            JSONObject jSONObject = new JSONObject();
            try {
                if (!this.f140681cb) {
                    jSONObject.put("playable_background_show_type", this.MU);
                }
            } catch (JSONException unused) {
            }
            mZ(this.f140681cb ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
            if (this.fWk == -1 && this.f140681cb) {
                this.fWk = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("render_type", this.eCS == 1 ? 1 : 2);
                    int i10 = this.eCS;
                    if (i10 != -1) {
                        jSONObject2.put("webview_state", i10);
                    }
                } catch (JSONException unused2) {
                }
                mZ("PL_sdk_page_show", jSONObject2);
            }
            if (this.fWk != -1 && !this.f140681cb && !this.jQo) {
                this.jQo = true;
            }
            if (this.f140681cb) {
                this.WD = System.currentTimeMillis();
            } else if (this.WD != -1) {
                this.VdW += System.currentTimeMillis() - this.WD;
                this.WD = -1L;
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("viewStatus", this.f140681cb);
                ZRu("viewableChange", jSONObject3);
            } catch (Throwable th) {
                Mm.ZRu("PlayablePlugin", "setViewable error", th);
            }
            if (this.f140681cb) {
                WD();
            } else {
                fWk();
            }
        }
        return this;
    }

    public void uR(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.HX = jSONObject.optString("section");
        }
    }

    private String uR(String str, String str2) {
        String str3 = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.CTl = str3;
        return str3;
    }

    public void FA(String str) {
        this.IOC = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.Yx = jCurrentTimeMillis;
            long j10 = this.fWk;
            jSONObject.put("playable_page_show_duration", j10 != -1 ? jCurrentTimeMillis - j10 : 0L);
        } catch (Throwable th) {
            Mm.ZRu("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        mZ("PL_sdk_html_load_start", jSONObject);
        this.yx = true;
        this.DoD = true;
        if (this.wzV) {
            VdW();
            this.yx = false;
            this.DoD = false;
        }
        if (this.WMI) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (TFq.ZRu(this.wZ, TFq.lp)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (TFq.NOt(this.wZ, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    }
                } else {
                    stringBuffer2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                if (TFq.ZRu(this.wZ, TFq.ZH)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                if (TFq.ZRu(this.wZ, TFq.aT)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                if (TFq.ZRu(this.wZ, TFq.Vor)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                if (TFq.ZRu(this.wZ, TFq.FA)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (TFq.NOt(this.wZ, "android.permission.CAMERA")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    }
                } else {
                    stringBuffer2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                if (TFq.ZRu(this.wZ, TFq.Mm)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (TFq.ZRu(this.wZ)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    }
                } else {
                    stringBuffer2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                    stringBuffer3.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                mZ("PL_sdk_hardware_detect", jSONObject2);
                this.WMI = false;
            } catch (Throwable th2) {
                Mm.ZRu("PlayablePlugin", "Hardware detect error", th2);
            }
        }
    }

    public JSONObject uR(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (Mm.ZRu() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject jSONObjectZRu = this.pDA.ZRu(str, jSONObject);
        if (Mm.ZRu()) {
            System.currentTimeMillis();
            if (jSONObjectZRu != null) {
                jSONObjectZRu.toString();
            }
        }
        return jSONObjectZRu;
    }

    public Map<String, String> NOt() {
        return this.jJC;
    }

    public FA NOt(String str) {
        this.hNL = str;
        return this;
    }

    public FA NOt(boolean z10) {
        this.LrZ = z10;
        return this;
    }

    public void ZRu(View view) {
        if (view == null) {
            return;
        }
        try {
            this.CXy = new WeakReference<>(view);
            NOt(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.GE);
        } catch (Throwable th) {
            Mm.ZRu("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    public FA NOt(long j10) {
        if (j10 <= 0) {
            this.fcs = 10L;
            return this;
        }
        this.fcs = j10;
        return this;
    }

    private void TFq(String str, JSONObject jSONObject) {
        try {
            int i10 = this.gaw;
            if (i10 == 0) {
                if (this.Wo != ZRu.LAND_PAGE && !lp(this.CTl)) {
                    Vr();
                }
                jSONObject.put("playable_url", this.CTl);
            } else if (i10 == 3 || i10 == 4) {
                jSONObject.put("playable_url", uR(this.dkT, this.gx));
            } else if (i10 == 1 || i10 == 2) {
                jSONObject.put("playable_url", mZ(this.LO, this.klw));
            }
            jSONObject.put("playable_render_type", this.gaw);
            if (this.FFX != null) {
                if (this.gaw == 0 && (this.Wo != ZRu.LAND_PAGE || lp(this.CTl))) {
                    this.FFX.ZRu(jSONObject);
                } else if (this.gaw != 0) {
                    this.FFX.ZRu(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void NOt(JSONObject jSONObject) {
        if (this.FFX != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    public Context ZRu() {
        return this.wZ;
    }

    public void NOt(String str, String str2) {
        Bitmap bitmapZRu;
        if (TextUtils.isEmpty(str2) || (bitmapZRu = TFq.ZRu(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.wZ.getContentResolver(), bitmapZRu, str, "");
    }

    public FA ZRu(String str, String str2) {
        this.jJC.put(str, str2);
        return this;
    }

    public FA ZRu(String str) {
        this.Pzo = str;
        return this;
    }

    public void Vor(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean zOptBoolean = jSONObject.optBoolean("success", true);
            if (zOptBoolean) {
                this.IOC = 3;
                WD();
            } else {
                this.IOC = -2;
            }
            if (zOptBoolean || !this.xY) {
                return;
            }
            this.xY = false;
            this.yx = false;
            this.DoD = false;
            this.FA.removeCallbacks(this.Vor);
            this.FA.removeCallbacks(this.aT);
            ZRu(4, "CaseRenderFail");
        }
    }

    public FA ZRu(boolean z10) {
        this.IJM = z10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.IJM);
            ZRu("volumeChange", jSONObject);
            return this;
        } catch (Throwable th) {
            Mm.ZRu("PlayablePlugin", "setIsMute error", th);
            return this;
        }
    }

    public JSONObject Mm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (iOptInt == 1) {
            return lp();
        }
        if (iOptInt != 2) {
            return iOptInt != 3 ? jSONObject2 : edo();
        }
        return sAl();
    }

    public FA NOt(int i10) {
        this.gaw = i10;
        return this;
    }

    public void NOt(int i10, String str) {
        this.yz = i10;
        if (this.f140680Oc == null) {
            this.f140680Oc = new JSONObject();
        }
        try {
            this.f140680Oc.put("playable_stuck_type", i10);
            this.f140680Oc.put("playable_stuck_reason", str);
            if (this.Ho > 0) {
                this.f140680Oc.put("playable_stuck_duration", System.currentTimeMillis() - this.Ho);
            } else {
                this.f140680Oc.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        mZ("PL_sdk_page_stuck", this.f140680Oc);
        fWk();
        if (this.FFX == null || i10 != 2) {
            return;
        }
        this.f140680Oc = new JSONObject();
    }

    public FA ZRu(long j10) {
        if (j10 <= 0) {
            this.MR = 10L;
            return this;
        }
        this.MR = j10;
        return this;
    }

    public FA TFq(boolean z10) {
        this.wzV = z10;
        return this;
    }

    public void ZRu(int i10) {
        this.eCS = i10;
    }

    public void ZRu(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.om.ZRu zRu = this.FFX;
        if (zRu == null || zRu.NOt(jSONObject) || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        int iOptInt = jSONObject.optInt("resource_type", -1);
        String strOptString2 = jSONObject.optString("resource_name", "playable_media");
        if (iOptInt == 1) {
            NOt(strOptString2, strOptString);
        }
    }

    public FA mZ(JSONObject jSONObject) {
        this.RPV = jSONObject;
        return this;
    }

    private void mZ(int i10, String str) {
        com.bytedance.sdk.openadsdk.om.ZRu zRu = this.FFX;
        if (zRu != null) {
            zRu.ZRu(i10, str);
        }
    }

    public void NOt(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TFq(str, jSONObject);
    }

    public void ZRu(String str, JSONObject jSONObject) {
        if (Mm.ZRu() && jSONObject != null) {
            jSONObject.toString();
        }
        mZ mZVar = this.zkn;
        if (mZVar != null) {
            mZVar.ZRu(str, jSONObject);
        }
    }

    private String mZ(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.cA) && !TextUtils.isEmpty(this.bDW)) {
            Uri uri = Uri.parse(this.bDW);
            String host = uri.getHost();
            if (!"lynxview".equalsIgnoreCase(host) && (host == null || !host.contains("lynxview"))) {
                queryParameter = "";
                queryParameter2 = "";
            } else {
                queryParameter = uri.getQueryParameter("surl");
                queryParameter2 = uri.getQueryParameter("playable_hash");
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(uri.getScheme()).authority(host).appendQueryParameter("surl", queryParameter);
            if (!TextUtils.isEmpty(queryParameter2)) {
                builderAppendQueryParameter.appendQueryParameter("playable_hash", queryParameter2);
            }
            this.cA = builderAppendQueryParameter.toString();
        }
        return this.cA;
    }

    public FA ZRu(float f10) {
        this.pU = f10;
        return this;
    }

    public void ZRu(int i10, String str) {
        fWk();
        mZ(i10, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i10);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            Mm.ZRu("PlayablePlugin", "reportRenderFatal error", th);
        }
        mZ("PL_sdk_global_faild", jSONObject);
    }

    public void ZRu(int i10, String str, String str2) {
        this.IOC = -1;
        this.fOq = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i10);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", gI());
        } catch (Throwable th) {
            Mm.ZRu("PlayablePlugin", "onWebReceivedError error", th);
        }
        mZ("PL_sdk_html_load_error", jSONObject);
        if (this.xY) {
            this.xY = false;
            this.yx = false;
            this.DoD = false;
            this.FA.removeCallbacks(this.Vor);
            this.FA.removeCallbacks(this.aT);
            ZRu(1, "ContainerLoadFail");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void mZ(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.NBW && this.nqR > 0) {
                this.NBW = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.IU ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.f140681cb);
            jSONObject.put("playable_session_id", this.OCA);
            int i10 = this.gaw;
            if (i10 == 0) {
                if (this.Wo != ZRu.LAND_PAGE && !lp(this.CTl)) {
                    Vr();
                }
                jSONObject.put("playable_url", this.CTl);
            } else if (i10 == 3 || i10 == 4) {
                jSONObject.put("playable_url", uR(this.dkT, this.gx));
            } else if (i10 == 1 || i10 == 2) {
                jSONObject.put("playable_url", mZ(this.LO, this.klw));
            }
            jSONObject.put("playable_full_url", this.bDW);
            jSONObject.put("playable_replay_count", this.Nl);
            jSONObject.put("playable_is_prerender", this.LrZ);
            jSONObject.put("playable_is_preload", this.NBW);
            jSONObject.put("playable_render_type", this.gaw);
            jSONObject.put("playable_scenes_type", this.Wo.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.LO) ? "" : this.LO);
            if (!TextUtils.isEmpty(this.klw)) {
                str2 = this.klw;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.dkT);
            jSONObject.put("playable_minigamelite_schema", this.gx);
            jSONObject.put("playable_is_debug", this.hl);
            jSONObject.put("playable_retry_count", this.Jem);
            jSONObject.put("playable_enter_from", this.Gis);
            jSONObject.put("playable_sequence", this.Np);
            jSONObject.put("playable_current_section", this.HX);
            jSONObject.put("is_playable_finish", this.gmt);
            jSONObject.put("playable_card_session", this.AK);
            jSONObject.put("playable_video_session", this.Vr);
            jSONObject.put("playable_network_type", yBV());
            jSONObject.put("playable_lynx_version", this.le);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ad_extra_data", jSONObject);
            jSONObject2.put(d.C0152d.f79310d, this.to);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put("refer", "playable");
            jSONObject2.put("value", this.RPV.opt(BidResponsedEx.KEY_CID));
            jSONObject2.put("log_extra", this.RPV.opt("log_extra"));
            int i11 = this.gaw;
            if (i11 != -1 && i11 != -2) {
                if (this.FFX != null) {
                    List<JSONObject> list = this.qg;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.qg.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObjectOptJSONObject = it.next().optJSONObject("ad_extra_data");
                            if (jSONObjectOptJSONObject != null) {
                                jSONObjectOptJSONObject.put("playable_render_type", this.gaw);
                                jSONObjectOptJSONObject.put("playable_url", this.CTl);
                            }
                            this.FFX.ZRu(jSONObjectOptJSONObject);
                        }
                        this.qg.clear();
                    }
                    if (this.gaw == 0 && (this.Wo != ZRu.LAND_PAGE || lp(this.CTl))) {
                        this.FFX.ZRu(jSONObject);
                        return;
                    } else {
                        if (this.gaw != 0) {
                            this.FFX.ZRu(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.qg == null) {
                this.qg = new ArrayList();
            }
            this.qg.add(jSONObject2);
        } catch (Throwable th) {
            Mm.ZRu("PlayablePlugin", "reportEvent error", th);
        }
    }

    public void ZRu(boolean z10, String str, int i10) {
        if (z10) {
            this.IOC = -1;
            this.fOq = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i10);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", gI());
            } catch (Throwable th) {
                Mm.ZRu("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            mZ("PL_sdk_html_load_error", jSONObject);
            if (this.xY) {
                this.xY = false;
                this.yx = false;
                this.DoD = false;
                this.FA.removeCallbacks(this.Vor);
                this.FA.removeCallbacks(this.aT);
                ZRu(1, "ContainerLoadFail");
            }
        }
    }

    private FA(Context context, int i10, mZ mZVar, com.bytedance.sdk.openadsdk.om.ZRu zRu) {
        this.Ht = "playable_stuck_check_ping";
        this.Mm = "playable_apply_media_permission_callback";
        this.FA = new Handler(Looper.getMainLooper());
        this.lp = new Handler(Looper.getMainLooper());
        this.yBV = true;
        this.WMI = true;
        this.qF = true;
        this.ZRu = "PL_sdk_playable_global_viewable";
        this.NOt = "PL_sdk_page_screen_blank";
        this.mZ = "PL_sdk_playable_destroy_analyze_summary";
        this.uR = "PL_sdk_playable_hardware_dialog_cancel";
        this.TFq = "PL_sdk_playable_hardware_dialog_setting";
        this.om = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.OCA = null;
        this.to = "embeded_ad";
        this.xY = true;
        this.Zf = true;
        this.ru = false;
        this.le = "";
        this.MR = 10L;
        this.fcs = 10L;
        this.f140679Nb = x.h.f238407j;
        this.VdW = 0L;
        this.th = 0L;
        this.WD = -1L;
        this.fWk = -1L;
        this.Yx = -1L;
        this.Cox = -1L;
        this.gI = -1L;
        this.Ho = -1L;
        this.bO = -1L;
        this.AK = "";
        this.Vr = "";
        this.Qg = "";
        this.Hvv = "";
        this.IZ = 0;
        this.nqR = 0;
        this.NBW = false;
        this.Nl = 0;
        this.yz = -1;
        this.Jem = 0;
        this.Gis = 0;
        this.Np = 0;
        this.HX = null;
        this.gmt = false;
        this.ZRJ = 0;
        this.MU = 0;
        this.yM = 0;
        this.gX = 0;
        this.GC = 0L;
        this.vE = 0L;
        this.gaw = -2;
        this.IOC = 0;
        this.pvl = 0;
        this.AZ = 0;
        this.cvm = new JSONObject();
        this.jJC = new HashMap();
        this.RPV = new JSONObject();
        this.bDW = "";
        this.AOL = 0.0f;
        this.KIc = 0.0f;
        this.jQo = false;
        this.hl = false;
        this.Uf = false;
        this.qg = new ArrayList();
        this.wzV = true;
        this.yx = true;
        this.DoD = true;
        this.GE = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.om.FA.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) FA.this.CXy.get();
                    if (view == null) {
                        return;
                    }
                    FA.this.NOt(view);
                } catch (Throwable th) {
                    Mm.ZRu("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.eCS = -1;
        this.gaw = i10;
        this.Wo = ZRu.LAND_PAGE;
        ZRu(context, mZVar, zRu);
    }

    public static FA ZRu(Context context, @Nullable WebView webView, mZ mZVar, com.bytedance.sdk.openadsdk.om.ZRu zRu) {
        if (mZVar == null || zRu == null) {
            return null;
        }
        if (webView == null) {
            return new FA(context, 0, mZVar, zRu);
        }
        return new FA(context, webView, mZVar, zRu, ZRu.LAND_PAGE);
    }
}

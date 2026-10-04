package com.bytedance.sdk.openadsdk.core.settings;

import Jb.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C1498d;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.model.a;
import com.bytedance.sdk.openadsdk.core.settings.TFq;
import com.bytedance.sdk.openadsdk.core.settings.TTSdkSettings;
import com.bytedance.sdk.openadsdk.core.settings.edo;
import com.bytedance.sdk.openadsdk.core.settings.oK;
import com.bytedance.sdk.openadsdk.uR.ZRu.edo;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.WD;
import com.bytedance.sdk.openadsdk.utils.Yx;
import e.g0;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s0.x;

/* JADX INFO: loaded from: classes3.dex */
public class yBV implements Ht, edo.ZRu {
    TFq.NOt<com.bytedance.sdk.openadsdk.uR.ZRu.edo> FA;
    private final Runnable MR;
    final TFq.NOt<ConcurrentHashMap<String, Integer>> Mm;

    /* JADX INFO: renamed from: Nb, reason: collision with root package name */
    private final Set<String> f140677Nb;
    private int OCA;
    private final TFq.NOt<Set<String>> VdW;
    private volatile boolean WMI;
    private Vor Zf;
    private Set<String> aT;
    private final com.bytedance.sdk.openadsdk.core.settings.ZRu edo;
    private final TFq.NOt<Map<String, Integer>> fcs;
    private final BroadcastReceiver le;
    private final sAl oK;
    private int om;
    private boolean qF;
    private final aT sAl;
    private TFq.NOt<JSONObject> th;
    private boolean to;
    private final AtomicBoolean yBV;
    public static final String ZRu = a.a("_", new CharSequence[]{"bus_con_collect", Yx.to()});
    public static final String NOt = a.a("_", new CharSequence[]{"bus_con", Yx.to(), Yx.OCA(), d.f58184l});
    public static final String mZ = a.a("_", new CharSequence[]{"bus_con", Yx.to(), Yx.OCA(), "alpha"});
    private static final String Vor = Yx.edo();
    private static final com.bytedance.sdk.component.FA.FA ZH = new com.bytedance.sdk.component.FA.FA("TemplateReInitTask") { // from class: com.bytedance.sdk.openadsdk.core.settings.yBV.1
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.adexpress.ZRu.NOt.TFq.NOt().Vor();
            com.bytedance.sdk.component.adexpress.ZRu.NOt.TFq.NOt().NOt(false);
            com.bytedance.sdk.component.adexpress.ZRu.NOt.NOt.NOt();
            com.bytedance.sdk.component.adexpress.ZRu.NOt.TFq.NOt().mZ();
        }
    };
    public static String uR = "";
    public static String TFq = "IABTCF_TCString";
    private static boolean lp = false;
    private static final ConcurrentLinkedQueue<oK.ZRu> xY = new ConcurrentLinkedQueue<>();
    private static final ZH ru = new ZH();
    static final ConcurrentHashMap<String, Integer> Ht = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.yBV$11, reason: invalid class name */
    public class AnonymousClass11 extends BroadcastReceiver {
        private final Runnable NOt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.yBV.11.1
            @Override // java.lang.Runnable
            public void run() {
                WD.NOt(new com.bytedance.sdk.component.FA.FA("LoadLocalData") { // from class: com.bytedance.sdk.openadsdk.core.settings.yBV.11.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            yBV.this.NOt();
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        };

        public AnonymousClass11() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            if (intent == null) {
                return;
            }
            WD.NOt(new com.bytedance.sdk.component.FA.FA("setting_receiver") { // from class: com.bytedance.sdk.openadsdk.core.settings.yBV.11.2
                @Override // java.lang.Runnable
                public void run() {
                    String action = intent.getAction();
                    if ("_tryFetRemoDat".equals(action)) {
                        yBV.this.ZRu(intent.getIntExtra("_source", 0), intent.getBooleanExtra("_force", false));
                    } else if ("_dataChanged".equals(action)) {
                        com.bytedance.sdk.component.utils.Mm.ZRu().removeCallbacks(AnonymousClass11.this.NOt);
                        com.bytedance.sdk.component.utils.Mm.ZRu().postDelayed(AnonymousClass11.this.NOt, 10000L);
                    }
                }
            });
        }
    }

    public static final class ZRu {
        static final yBV ZRu = new yBV();
    }

    private int CA() {
        return this.oK.ZRu("coppa", -99);
    }

    public static Ht CH() {
        if (WMI.ZRu() != null) {
            return ZRu.ZRu;
        }
        IllegalStateException illegalStateException = new IllegalStateException("context is null");
        Log.e("Pangle", "context is null", illegalStateException);
        ApmHelper.reportCustomError("context is null", "context is null", illegalStateException);
        return ru;
    }

    private long Guy() {
        long jZRu = this.oK.ZRu("req_inter_min", 600000L);
        if (jZRu < 0 || jZRu > 86400000) {
            return 600000L;
        }
        return jZRu;
    }

    private Set<String> IJM() {
        return (Set) this.oK.ZRu("perf_con_applog_send", this.f140677Nb, this.VdW);
    }

    private long aNu() {
        return this.oK.ZRu("last_req_time", 0L);
    }

    public static boolean kkl() {
        return lp;
    }

    private static int mZ(boolean z10) {
        return z10 ? 20 : 5;
    }

    public static void qZ() {
        Context contextZRu;
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ() && (contextZRu = WMI.ZRu()) != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(contextZRu.getPackageName());
                intent.setAction("_dataChanged");
                contextZRu.sendBroadcast(intent);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lp.ZRu("TTAD.SdkSettings", "", th);
            }
        }
    }

    private String rd() {
        return this.oK.ZRu("force_language", "");
    }

    @Nullable
    private static SharedPreferences uR(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int AK() {
        return this.oK.ZRu("isGdprUser", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int AOL() {
        return this.oK.ZRu("perf_con_close_button_delay_check_time", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean AZ() {
        return this.oK.ZRu("perf_con_use_new_thread_pool", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int CTl() {
        return this.oK.ZRu(NOt, 10000);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean CXy() {
        return this.oK.ZRu("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public String Cox() {
        return this.oK.ZRu("policy_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public Set<String> Ds() {
        return (Set) this.oK.ZRu("perf_con_drop2rt_skip_label_list", Collections.EMPTY_SET, TFq.NOt);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean FA() {
        return this.oK.ZRu("if_both_open", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int FFX() {
        int iZRu = this.oK.ZRu("bus_con_token_thread_count", 4);
        if (iZRu <= 0 || iZRu > 30) {
            return 4;
        }
        return iZRu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public void GC() {
        this.qF = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean Gis() {
        return this.oK.ZRu("read_video_from_cache", 1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int HX() {
        int iZRu = this.oK.ZRu("perf_con_webview_cache_count_v3", 0);
        if (iZRu < 0) {
            return 0;
        }
        return iZRu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int HZ() {
        return this.oK.ZRu("perf_con_drawable_code", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public String Ho() {
        return this.oK.ZRu("dyn_draw_engine_url", Vor);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public long Ht() {
        return this.oK.ZRu("data_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int Hvv() {
        int iZRu = this.oK.ZRu("privacy_personalized_ad", Integer.MAX_VALUE);
        if (iZRu != Integer.MAX_VALUE) {
            return iZRu;
        }
        int iYBV = Yx.yBV();
        if (iYBV == 1 || iYBV == 2) {
            return 2;
        }
        return iYBV != 3 ? 0 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int IOC() {
        return this.oK.ZRu("perf_con_thread_stack_size", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean IZ() {
        int iZRu = this.edo.ZRu("perf_con_apm", 100);
        if (iZRu == 0) {
            return false;
        }
        return iZRu < 0 || iZRu >= 100 || iZRu > ((int) (Math.random() * 100.0d));
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean Jem() {
        return this.oK.ZRu("global_rate", 1.0f) == 1.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean KIc() {
        return this.oK.ZRu("perf_con_is_new_net_thread", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean MO() {
        return this.oK.ZRu("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public String MR() {
        return this.oK.ZRu("playableLoadH5Url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public String[] MU() {
        Set<String> set;
        try {
            set = this.aT;
        } catch (Throwable unused) {
        }
        if (set == null || set.size() == 0) {
            JSONArray jSONArray = new JSONArray(this.oK.ZRu("gecko_hosts", (String) null));
            if (jSONArray.length() != 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    this.aT.add(jSONArray.getString(i10));
                }
            }
            Set<String> setZRu = sAl.ZRu(this.aT);
            this.aT = setZRu;
            if (setZRu != null) {
                if (setZRu.size() == 0) {
                }
            }
            return null;
        }
        return (String[]) this.aT.toArray(new String[0]);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public void Mm() {
        this.oK.ZRu().ZRu("tt_sdk_settings").ZRu("ab_test_param").ZRu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean NBW() {
        return this.oK.ZRu("bus_con_dislike_report_raw", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int Nb() {
        int iZRu = this.oK.ZRu("fetch_tpl_second", 0);
        if (iZRu <= 0) {
            return 0;
        }
        return iZRu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean Nl() {
        return this.oK.ZRu("privacy_debug_unlock", 1) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int Np() {
        int iZRu = this.oK.ZRu("perf_con_webview_cache_count", 0);
        if (iZRu < 0) {
            return 0;
        }
        return iZRu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public String OCA() {
        return this.oK.ZRu("ab_test_param", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int Oc() {
        return this.oK.ZRu("bus_con_send_log_type", 1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int Pzo() {
        int iZRu = this.oK.ZRu("bus_con_auto_click_delay", 3000);
        if (iZRu <= 0) {
            return 3000;
        }
        return iZRu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean Qg() {
        int iZRu = this.oK.ZRu("privacy_ad_enable", Integer.MAX_VALUE);
        if (iZRu == 1) {
            return true;
        }
        if (iZRu == 0) {
            return false;
        }
        int iYBV = Yx.yBV();
        return iYBV == 1 || iYBV == 2 || iYBV == 3;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean RPV() {
        return this.oK.ZRu(ZRu, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    @Nullable
    public JSONObject TFq() {
        return (JSONObject) this.oK.ZRu("digest", null, TFq.ZRu);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int VdW(String str) {
        Integer num;
        Map map = (Map) this.oK.ZRu("perf_con_applog_rate", null, this.fcs);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean Vor() {
        return this.oK.ZRu("support_tnc", 1) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int Vr() {
        return this.oK.ZRu("vbtt", 5);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public String WD() {
        return this.oK.ZRu("ads_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean WMI() {
        return this.oK.ZRu("support_gzip", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean Wo() {
        return this.oK.ZRu("bus_con_adshow_check_enable", true);
    }

    public void YuF() {
        if (edo.ZRu()) {
            com.bytedance.sdk.openadsdk.core.edo.NOt().removeCallbacks(this.MR);
            com.bytedance.sdk.openadsdk.core.edo.NOt().postDelayed(this.MR, Guy());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public String Yx() {
        return this.edo.ZRu("apm_url", "pangolin16.sgsnssdk.com");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int ZH() {
        return this.oK.ZRu("load_callback_strategy", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int ZRJ() {
        int iZRu = this.oK.ZRu("perf_con_webview_preload_cache_v3", 0);
        if (iZRu < 0) {
            return 0;
        }
        if (iZRu > 5) {
            return 5;
        }
        int iHX = HX();
        return iZRu > iHX ? iHX : iZRu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public long Zf() {
        return this.oK.ZRu(x.h.f238399b, 10000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public String aT() {
        return this.oK.ZRu("ab_test_version", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public String bDW() {
        return this.oK.ZRu("bus_con_check_clz", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public String bO() {
        return this.oK.ZRu("dc", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean cA() {
        return this.oK.ZRu("bus_con_rewardedfull_link", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public String cvm() {
        return this.oK.ZRu("dual_event_url", (String) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int edo() {
        IJM();
        return this.OCA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public float fOq() {
        return this.oK.ZRu(mZ, 1.0f);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public String fWk() {
        return this.oK.ZRu("app_log_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int fcs() {
        int iZRu = this.oK.ZRu("fetch_tpl_timeout_ctrl", 3000);
        if (iZRu <= 0) {
            return 3000;
        }
        return iZRu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int gI() {
        return this.oK.ZRu("ivrv_downward", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public JSONObject gX() {
        return (JSONObject) this.oK.ZRu("video_cache_config", null, TFq.ZRu);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean gaw() {
        return this.oK.ZRu("perf_con_apm_native", Integer.MAX_VALUE) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int gmt() {
        int iZRu = this.oK.ZRu("perf_con_webview_preload_cache", 0);
        if (iZRu < 0) {
            return 0;
        }
        if (iZRu > 5) {
            return 5;
        }
        int iNp = Np();
        return iZRu > iNp ? iNp : iZRu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public com.bytedance.sdk.openadsdk.uR.ZRu.edo hNL() {
        return (com.bytedance.sdk.openadsdk.uR.ZRu.edo) this.oK.ZRu("perf_con_track_url_strategy", com.bytedance.sdk.openadsdk.uR.ZRu.edo.ZRu, this.FA);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public JSONObject jJC() {
        return (JSONObject) this.oK.ZRu("perf_con_thread_pool_config", new JSONObject(), this.th);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public Mm le() {
        return (Mm) this.oK.ZRu("insert_js_config", Mm.ZRu, new TFq.NOt<Mm>() { // from class: com.bytedance.sdk.openadsdk.core.settings.yBV.10
            @Override // com.bytedance.sdk.openadsdk.core.settings.TFq.NOt
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public Mm NOt(String str) {
                return new Mm(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int lp() {
        return this.oK.ZRu("splash_video_load_strategy", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean nqR() {
        return this.oK.ZRu("bus_con_sec_type", Integer.MAX_VALUE) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int oK() {
        IJM();
        return this.om;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int om() {
        return this.oK.ZRu("loadedCallbackOpportunity", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public long pDA() {
        long jZRu = this.oK.ZRu("bus_con_tnc_interval", 600000L);
        if (jZRu < 10000) {
            return 10000L;
        }
        return jZRu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean pU() {
        return this.oK.ZRu("bus_con_video_keep_screen_on", 1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int pvl() {
        return this.oK.ZRu("bus_con_behavior_count", 300);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean qF() {
        return this.oK.ZRu("ad_revenue_enable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int ru() {
        return this.oK.ZRu("max", 50);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public Set<String> sAl() {
        return IJM();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean th() {
        return this.oK.NOt();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    @NonNull
    public Vor to() {
        Vor vor = this.Zf;
        if (vor != null) {
            return vor;
        }
        Vor vor2 = (Vor) this.sAl.ZRu("mediation_init_conf", Vor.ZRu, new TFq.NOt<Vor>() { // from class: com.bytedance.sdk.openadsdk.core.settings.yBV.9
            @Override // com.bytedance.sdk.openadsdk.core.settings.TFq.NOt
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public Vor NOt(String str) {
                return new Vor(str);
            }
        });
        this.Zf = vor2;
        return vor2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean vE() {
        if (com.bytedance.sdk.component.adexpress.uR.NOt.ZRu(WMI.ZRu())) {
            return this.oK.ZRu("support_rtl", false);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public long wZ() {
        return this.oK.ZRu("perf_con_adlog_expire_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean wcb() {
        return this.oK.ZRu("bus_con_url_check", 1) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean xY() {
        return this.oK.ZRu("landingpage_new_style", -1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean yBV() {
        return this.oK.ZRu("allow_blind_mode_request_ad", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int yM() {
        return this.oK.ZRu("blank_detect_rate", 30);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean yz() {
        return this.WMI;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public String zkn() {
        return this.oK.ZRu("bus_con_express_host", "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/");
    }

    private yBV() {
        this.aT = Collections.synchronizedSet(new HashSet());
        this.sAl = new aT();
        this.edo = new com.bytedance.sdk.openadsdk.core.settings.ZRu();
        this.oK = new sAl(new oK.ZRu() { // from class: com.bytedance.sdk.openadsdk.core.settings.yBV.6
            @Override // com.bytedance.sdk.openadsdk.core.settings.oK.ZRu
            public void NOt() {
                if (yBV.xY == null || yBV.xY.isEmpty()) {
                    return;
                }
                Iterator it = yBV.xY.iterator();
                while (it.hasNext()) {
                    ((oK.ZRu) it.next()).NOt();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.oK.ZRu
            public void ZRu() {
                oK.ZRu[] zRuArr;
                boolean unused = yBV.lp = true;
                if (yBV.xY == null || yBV.xY.size() == 0 || (zRuArr = (oK.ZRu[]) yBV.xY.toArray()) == null) {
                    return;
                }
                for (oK.ZRu zRu : zRuArr) {
                    zRu.ZRu();
                }
            }
        });
        this.yBV = new AtomicBoolean(false);
        this.WMI = false;
        this.qF = false;
        this.om = 5000;
        this.OCA = 10;
        AnonymousClass11 anonymousClass11 = new AnonymousClass11();
        this.le = anonymousClass11;
        this.MR = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.yBV.12
            @Override // java.lang.Runnable
            public void run() {
                yBV.this.uR(2);
                yBV.this.YuF();
            }
        };
        this.Mm = new TFq.NOt<ConcurrentHashMap<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.yBV.13
            @Override // com.bytedance.sdk.openadsdk.core.settings.TFq.NOt
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public ConcurrentHashMap<String, Integer> NOt(String str) {
                if (TextUtils.isEmpty(str)) {
                    return yBV.Ht;
                }
                ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        int iOptInt = jSONObject.optInt(next, 100);
                        if (!TextUtils.isEmpty(next) && iOptInt >= 0 && iOptInt <= 100) {
                            concurrentHashMap.put(next, Integer.valueOf(iOptInt));
                        }
                    }
                    return concurrentHashMap;
                } catch (JSONException e10) {
                    Log.i("TTAD.SdkSettings", e10.getMessage());
                    return concurrentHashMap;
                }
            }
        };
        this.fcs = new TFq.NOt<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.yBV.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.TFq.NOt
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public Map<String, Integer> NOt(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    HashMap map = new HashMap(jSONObject.length());
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!TextUtils.isEmpty(next)) {
                            int iOptInt = jSONObject.optInt(next, 100);
                            if (iOptInt < 0 || iOptInt > 100) {
                                map.put(next, 100);
                            } else {
                                map.put(next, Integer.valueOf(iOptInt));
                            }
                        }
                    }
                    return map;
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.lp.NOt("get applog rate from sp failed:" + e10.getMessage());
                    return null;
                }
            }
        };
        this.f140677Nb = new HashSet();
        this.VdW = new TFq.NOt<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.yBV.3
            @Override // com.bytedance.sdk.openadsdk.core.settings.TFq.NOt
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public Set<String> NOt(String str) {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int iOptInt = jSONObject.optInt("applog_count");
                        if (iOptInt >= 2 && iOptInt <= 100) {
                            yBV.this.OCA = iOptInt;
                        }
                        int iOptInt2 = jSONObject.optInt("applog_interval");
                        if (iOptInt2 >= 100 && iOptInt2 <= 30000) {
                            yBV.this.om = iOptInt2;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                String string = jSONArray.getString(i10);
                                if (!TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (JSONException e10) {
                        Log.i("TTAD.SdkSettings", e10.getMessage());
                    }
                }
                return hashSet.size() == 0 ? new HashSet(Arrays.asList("click", "show", "insight_log", "mrc_show")) : hashSet;
            }
        };
        this.th = new TFq.NOt<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.yBV.4
            @Override // com.bytedance.sdk.openadsdk.core.settings.TFq.NOt
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public JSONObject NOt(String str) {
                JSONObject jSONObject;
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lp.ZRu("TTAD.SdkSettings", th.getMessage());
                    jSONObject = null;
                }
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        };
        this.FA = new TFq.NOt<com.bytedance.sdk.openadsdk.uR.ZRu.edo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.yBV.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.TFq.NOt
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.openadsdk.uR.ZRu.edo NOt(String str) {
                com.bytedance.sdk.openadsdk.uR.ZRu.edo edoVar = new com.bytedance.sdk.openadsdk.uR.ZRu.edo();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    edoVar.ZRu(jSONObject.optInt("enable_strategy", 0) == 1);
                    edoVar.ZRu(ZRu(jSONObject.optJSONObject("default")));
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adid_configs");
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            edoVar.ZRu(next, ZRu(jSONObjectOptJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (Exception unused) {
                }
                return edoVar;
            }

            private edo.ZRu ZRu(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new edo.ZRu(jSONObject.optInt("retry_times", -1), jSONObject.optInt("time_interval", -1));
                }
                return null;
            }
        };
        try {
            Context contextZRu = WMI.ZRu();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("_dataChanged");
            if (Build.VERSION.SDK_INT >= 33) {
                contextZRu.registerReceiver(anonymousClass11, intentFilter, 4);
            } else {
                contextZRu.registerReceiver(anonymousClass11, intentFilter);
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.SdkSettings", "", e10);
        }
    }

    public static String mZ(Context context) {
        SharedPreferences sharedPreferencesUR;
        return (context == null || (sharedPreferencesUR = uR(context)) == null) ? "" : sharedPreferencesUR.getString(TFq, "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean FA(String str) {
        return str == null || fcs(str).edo == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean Ht(String str) {
        return fcs(str).Mm == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean MR(String str) {
        return WMI.uR().fcs(str).oK == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int Mm(String str) {
        return fcs(str).qF;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean Nb(@NonNull String str) {
        Set set = (Set) this.oK.ZRu("privacy_fields_allowed", Collections.EMPTY_SET, TFq.NOt);
        if (!set.isEmpty()) {
            return set.contains(str);
        }
        int iYBV = Yx.yBV();
        if (iYBV != 1) {
            if (iYBV != 2 && iYBV != 3) {
                return false;
            }
            if (!"mcc".equals(str) && !"mnc".equals(str)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean OCA(String str) {
        return fcs(str).to;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean TFq(String str) {
        int i10 = fcs(str).TFq;
        return i10 != 1 ? i10 == 2 && com.bytedance.sdk.component.utils.oK.mZ(WMI.ZRu()) != 0 : com.bytedance.sdk.component.utils.oK.uR(WMI.ZRu());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int Vor(String str) {
        if (str == null) {
            return 1500;
        }
        return fcs(str).yBV;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean WMI(String str) {
        return str == null || DeviceUtils.FA(WMI.ZRu()) == 0 || fcs(str).sAl == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int ZH(String str) {
        return fcs(str).lp;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int Zf(String str) {
        return fcs(str).f140676Nb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int aT(String str) {
        return fcs(str).ZH;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    @NonNull
    public NOt fcs(String str) {
        return mZ.ZRu(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int le(String str) {
        return fcs(str).fWk;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean lp(String str) {
        try {
            return fcs(str).Zf != null;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int om(String str) {
        return fcs(str).OCA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public JSONObject qF(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(this.oK.ZRu("core_settings", ""));
            try {
                jSONObject2.put("ad_slot_setting", fcs(str).NBW);
                return jSONObject2;
            } catch (JSONException e10) {
                e = e10;
                jSONObject = jSONObject2;
                com.bytedance.sdk.component.utils.lp.ZRu("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
                return jSONObject;
            }
        } catch (JSONException e11) {
            e = e11;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean ru(String str) {
        return fcs(str).WD;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int sAl(String str) {
        return fcs(String.valueOf(str)).FA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int uR() {
        return this.oK.ZRu("max_tpl_cnts", 100);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int xY(String str) {
        return fcs(str).fcs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean yBV(String str) {
        return fcs(str).xY == 0;
    }

    private static void NOt(int i10, boolean z10) {
        Context contextZRu = WMI.ZRu();
        if (contextZRu != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(contextZRu.getPackageName());
                intent.setAction("_tryFetRemoDat");
                intent.putExtra("_force", z10);
                intent.putExtra("_source", i10);
                contextZRu.sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public void ZRu() {
        File file;
        try {
            mZ.ZRu();
            this.oK.mZ();
            this.sAl.mZ();
            this.edo.mZ();
            Context contextZRu = WMI.ZRu();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                file = new File(contextZRu.getDataDir(), "shared_prefs");
            } else {
                file = new File(contextZRu.getDatabasePath("1").getParentFile().getParentFile(), "shared_prefs");
            }
            File file2 = new File(file, "tt_sdk_settings.xml");
            if (file2.exists() && file2.isFile()) {
                String strReplace = file2.getName().replace(C1498d.f86308y, "");
                if (i10 >= 24) {
                    contextZRu.deleteSharedPreferences(strReplace);
                } else {
                    contextZRu.getSharedPreferences(strReplace, 0).edit().clear().apply();
                    com.bytedance.sdk.component.utils.Ht.mZ(file2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean edo(String str) {
        return sAl(str) != 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int oK(String str) {
        return fcs(str).aT;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int to(String str) {
        return fcs(str).MR;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean uR(String str) {
        return fcs(str).VdW;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public void VdW() {
        String strRd = rd();
        if (TextUtils.isEmpty(strRd)) {
            return;
        }
        if (strRd.equals("zh-Hant")) {
            com.bytedance.sdk.component.utils.Vor.ZRu(WMI.ZRu(), "zh", "tw");
        } else {
            com.bytedance.sdk.component.utils.Vor.ZRu(WMI.ZRu(), strRd, null);
        }
        try {
            TTAdDislikeToast.onResourceUpdated();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.SdkSettings", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public String mZ() {
        return this.oK.ZRu("aes_key", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public void uR(@TTSdkSettings.FETCH_REQUEST_SOURCE int i10) {
        ZRu(i10, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean mZ(String str) {
        return fcs(str).mZ == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int mZ(int i10) {
        return fcs(String.valueOf(i10)).Vor;
    }

    public static int NOt(Context context) {
        SharedPreferences sharedPreferencesUR;
        if (context == null || (sharedPreferencesUR = uR(context)) == null) {
            return -2;
        }
        int i10 = sharedPreferencesUR.getInt("IABTCF_CmpSdkID", Integer.MIN_VALUE);
        int i11 = sharedPreferencesUR.getInt("IABTCF_CmpSdkVersion", Integer.MIN_VALUE);
        if (i10 == Integer.MIN_VALUE && i11 == Integer.MIN_VALUE) {
            return -2;
        }
        return sharedPreferencesUR.getInt("IABTCF_gdprApplies", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    @g0
    public synchronized void NOt() {
        SystemClock.elapsedRealtime();
        boolean z10 = this.WMI;
        this.sAl.ZRu(this.WMI);
        this.edo.ZRu(this.WMI);
        this.oK.ZRu(this.WMI);
        mZ.ZRu(!z10);
        com.bytedance.sdk.openadsdk.core.Vor.NOt().uR(CA());
        this.WMI = true;
        SystemClock.elapsedRealtime();
        if (!z10) {
            com.bytedance.sdk.openadsdk.core.edo.NOt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.yBV.7
                @Override // java.lang.Runnable
                public void run() {
                    if (!edo.ZRu()) {
                        com.bytedance.sdk.openadsdk.multipro.aidl.ZRu.ZRu().NOt();
                    } else {
                        yBV.this.uR(1);
                        yBV.this.YuF();
                    }
                }
            }, 1000L);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public void ZRu(JSONObject jSONObject, TFq.ZRu zRu) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        sAl sal = this.oK;
        String str = Vor;
        String strZRu = sal.ZRu("dyn_draw_engine_url", str);
        final String strOptString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(strZRu) && !TextUtils.isEmpty(strOptString) && !strOptString.equals(strZRu)) {
            com.bytedance.sdk.openadsdk.core.edo.NOt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.yBV.8
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.equals(yBV.this.oK.ZRu("dyn_draw_engine_url", yBV.Vor), strOptString)) {
                        com.bytedance.sdk.component.adexpress.ZRu.NOt.TFq.NOt().mZ();
                    }
                }
            }, 5000L);
        }
        zRu.ZRu("dyn_draw_engine_url", strOptString);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public void NOt(JSONObject jSONObject, TFq.ZRu zRu) {
        if (jSONObject.has("is_gdpr_user")) {
            int iOptInt = jSONObject.optInt("is_gdpr_user", -1);
            zRu.ZRu("isGdprUser", (iOptInt == -1 || iOptInt == 1 || iOptInt == 0) ? iOptInt : -1);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int ZRu(String str) {
        if (str == null) {
            return 0;
        }
        return WMI.uR().fcs(str).om;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int NOt(String str) {
        Integer num;
        Map map = (Map) this.oK.ZRu("perf_con_stats_rate", Ht, this.Mm);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int ZRu(String str, boolean z10) {
        if (str == null) {
            return mZ(z10);
        }
        int i10 = fcs(str).le;
        return i10 != -1 ? i10 : mZ(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int ZRu(int i10) {
        return fcs(String.valueOf(i10)).Yx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public int NOt(int i10) {
        return fcs(String.valueOf(i10)).NOt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public void ZRu(long j10) {
        this.oK.ZRu().ZRu("last_req_time", j10).ZRu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public void ZRu(@TTSdkSettings.FETCH_REQUEST_SOURCE int i10, boolean z10) {
        if (!com.bytedance.sdk.openadsdk.core.edo.TFq() && i10 != 1 && i10 != 2) {
            if (z10) {
                this.to = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.Vor.NOt().uR())) {
                return;
            }
            if (this.to) {
                this.to = false;
                if (!z10) {
                    z10 = true;
                }
            }
            long jANu = aNu();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jGuy = Guy();
            long j10 = jCurrentTimeMillis - jANu;
            if (!z10 && j10 < jGuy) {
                com.bytedance.sdk.openadsdk.core.aT.ZRu.ZRu();
                return;
            }
            if (!edo.ZRu()) {
                NOt(i10, z10);
            } else if (this.yBV.compareAndSet(false, true)) {
                WD.NOt((com.bytedance.sdk.component.FA.FA) new edo(this, this.oK, this.sAl, this.edo));
                com.bytedance.sdk.openadsdk.core.edo.NOt().removeCallbacks(this.MR);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.edo.ZRu
    public void ZRu(boolean z10) {
        this.yBV.set(false);
        YuF();
        if (z10) {
            qZ();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public void ZRu(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("_tryFetRemoDat");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this.le, intentFilter, 4);
            } else {
                context.registerReceiver(this.le, intentFilter);
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.SdkSettings", "", e10);
        }
        if (yz()) {
            uR(1);
            YuF();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Ht
    public boolean ZRu(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        if (cryptDataScene != PangleEncryptConstant.CryptDataScene.GET_ADS && cryptDataScene != PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN) {
            if (cryptDataScene == PangleEncryptConstant.CryptDataScene.APP_LOG) {
                return this.oK.ZRu("perf_con_crypt_V4_applog", false);
            }
            return this.oK.ZRu("perf_con_crypt_V4", false);
        }
        return this.oK.ZRu("perf_con_crypt_V4_get_ad", false);
    }

    public static void ZRu(oK.ZRu zRu) {
        ConcurrentLinkedQueue<oK.ZRu> concurrentLinkedQueue = xY;
        if (concurrentLinkedQueue.contains(zRu)) {
            return;
        }
        concurrentLinkedQueue.add(zRu);
    }
}

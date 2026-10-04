package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.setting.k;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile d f155979l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f155980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f155981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FastKV f155982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f155983d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f155984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f155985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f155986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f155987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f155988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.preload.a f155989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f155990k;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f155991a;

        public a(Context context) {
            this.f155991a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.h(this.f155991a);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Looper.prepare();
            d.this.g();
            d.this.d();
            Looper.loop();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.a(dVar.f155984e);
            new h(d.this.f155987h).a();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.d$d, reason: collision with other inner class name */
    public class C0564d implements a.e {
        public C0564d() {
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f155996a;

        public e(String str) {
            this.f155996a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(350L);
            } catch (InterruptedException e10) {
                q0.b("SDKController", e10.getMessage());
            }
            new k().b(d.this.f155987h, this.f155996a, d.this.f155985f);
        }
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            com.mbridge.msdk.timer.b.class.getDeclaredMethod("start", null).invoke(com.mbridge.msdk.timer.b.class.getMethod("getInstance", null).invoke(null, null), null);
        } catch (Throwable th) {
            q0.b("SDKController", th.getMessage(), th);
        }
    }

    public boolean e() {
        return true;
    }

    public void f() {
    }

    private void c() {
        com.mbridge.msdk.foundation.controller.c.n().b(this.f155987h);
        com.mbridge.msdk.foundation.controller.c.n().e(this.f155984e);
        com.mbridge.msdk.foundation.controller.c.n().f(this.f155985f);
        com.mbridge.msdk.foundation.controller.c.n().d(this.f155990k);
        com.mbridge.msdk.foundation.controller.c.n().b(this.f155986g);
        com.mbridge.msdk.foundation.controller.c.n().c(new C0564d());
        try {
            com.mbridge.msdk.foundation.same.net.utils.d.h().j();
        } catch (Throwable th) {
            q0.b("SDKController", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        List<com.mbridge.msdk.foundation.entity.a> listG;
        Object objNewInstance;
        Object objNewInstance2;
        try {
            g gVarF = i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarF == null || (listG = gVarF.g()) == null || listG.size() <= 0) {
                return;
            }
            for (com.mbridge.msdk.foundation.entity.a aVar : listG) {
                if (aVar.a() == 287) {
                    if (this.f155987h != null && (objNewInstance = MBInterstitialVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                        MBInterstitialVideoHandler.class.getMethod("loadFormSelfFilling", null).invoke(objNewInstance, null);
                    }
                } else if (aVar.a() == 94 && (objNewInstance2 = MBRewardVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                    MBRewardVideoHandler.class.getMethod("loadFormSelfFilling", null).invoke(objNewInstance2, null);
                }
            }
        } catch (Throwable th) {
            q0.b("SDKController", th.getMessage());
        }
    }

    public void b() {
        a(this.f155987h.getApplicationContext());
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new b());
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new c());
            j.b();
        } catch (Exception unused) {
            q0.b("SDKController", "get app setting failed");
        }
        this.f155983d = true;
    }

    public static d a() {
        if (f155979l == null) {
            synchronized (d.class) {
                try {
                    if (f155979l == null) {
                        f155979l = new d();
                    }
                } finally {
                }
            }
        }
        return f155979l;
    }

    public void b(String str) {
        if (this.f155989j == null) {
            this.f155989j = new com.mbridge.msdk.preload.a();
        }
        try {
            Map<String, Object> map = this.f155981b;
            if (map == null || map.size() <= 0 || !this.f155981b.containsKey(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)) {
                return;
            }
            int iIntValue = ((Integer) this.f155981b.get(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)).intValue();
            if (iIntValue == 0) {
                this.f155989j.a(this.f155981b, this.f155980a);
                return;
            }
            if (1 == iIntValue) {
                this.f155989j.a(this.f155981b);
            } else if (2 != iIntValue) {
                q0.b("SDKController", "unknow layout type in preload");
            } else {
                this.f155989j.b(this.f155981b);
            }
        } catch (Exception e10) {
            q0.b("SDKController", e10.getMessage());
        }
    }

    public void a(Map map, Context context) {
        Object obj;
        if (context != null) {
            if (!TextUtils.isEmpty(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE)) {
                com.mbridge.msdk.foundation.controller.c.n().c(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE);
            } else if (map.containsKey(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME) && (obj = map.get(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME)) != null) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    com.mbridge.msdk.foundation.controller.c.n().c(str);
                }
            }
            if (map != null) {
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPID)) {
                    this.f155984e = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPID);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPKEY)) {
                    this.f155985f = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPKEY);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_WX_APPID)) {
                    this.f155990k = (String) map.get(MBridgeConstans.ID_MBRIDGE_WX_APPID);
                }
                if (map.containsKey(MBridgeConstans.PACKAGE_NAME_MANIFEST)) {
                    this.f155986g = (String) map.get(MBridgeConstans.PACKAGE_NAME_MANIFEST);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH)) {
                    this.f155988i = (String) map.get(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH);
                }
            }
            this.f155987h = context.getApplicationContext();
            c();
            if (this.f155983d) {
                return;
            }
            b();
            m0.l(context);
            long jD0 = i.b().d(this.f155984e).D0();
            if (jD0 != 1300) {
                new Handler(Looper.getMainLooper()).postDelayed(new a(context), jD0);
            }
        }
    }

    private void a(Context context) {
        String string;
        try {
            if (e() && this.f155982c == null) {
                try {
                    this.f155982c = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), k0.a("H+tU+FeXHM==")).build();
                } catch (Exception unused) {
                    this.f155982c = null;
                }
            }
            FastKV fastKV = this.f155982c;
            String string2 = "";
            if (fastKV != null) {
                String string3 = fastKV.getString(k0.a("H+tU+bfPhM=="), "");
                String string4 = this.f155982c.getString(k0.a("H+tU+Fz8"), "");
                if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f156311V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f156323g)) {
                    com.mbridge.msdk.foundation.same.a.f156311V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                    com.mbridge.msdk.foundation.same.a.f156323g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(a7.c.f84756a);
                }
                if (TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f156311V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f156323g)) {
                        return;
                    }
                    this.f155982c.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.f156311V);
                    this.f155982c.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f156323g);
                } else {
                    com.mbridge.msdk.foundation.same.a.f156311V = string3;
                    com.mbridge.msdk.foundation.same.a.f156323g = string4;
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.f156311V);
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(a7.c.f84756a, com.mbridge.msdk.foundation.same.a.f156323g);
                }
            } else {
                SharedPreferences sharedPreferences = context.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
                if (sharedPreferences != null) {
                    string2 = sharedPreferences.getString(k0.a("H+tU+bfPhM=="), "");
                    string = sharedPreferences.getString(k0.a("H+tU+Fz8"), "");
                } else {
                    string = "";
                }
                if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f156311V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f156323g)) {
                    com.mbridge.msdk.foundation.same.a.f156311V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                    com.mbridge.msdk.foundation.same.a.f156323g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(a7.c.f84756a);
                }
                if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string)) {
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f156311V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f156323g)) {
                        return;
                    }
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.f156311V);
                        editorEdit.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f156323g);
                        editorEdit.apply();
                    }
                } else {
                    com.mbridge.msdk.foundation.same.a.f156311V = string2;
                    com.mbridge.msdk.foundation.same.a.f156323g = string;
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.f156311V);
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(a7.c.f84756a, com.mbridge.msdk.foundation.same.a.f156323g);
                }
            }
            new com.mbridge.msdk.config.component.common.util.d().a();
        } catch (Throwable th) {
            q0.b("SDKController", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (i.b() == null) {
            return;
        }
        i iVarB = i.b();
        if (iVarB != null) {
            g gVarF = iVarB.f(str);
            if (gVarF != null) {
                MBridgeConstans.OMID_JS_SERVICE_URL = gVarF.W();
                MBridgeConstans.OMID_JS_H5_URL = gVarF.V();
                if (!TextUtils.isEmpty(gVarF.v())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f156490i = gVarF.v();
                    com.mbridge.msdk.foundation.same.net.utils.d.h().e();
                }
                if (!TextUtils.isEmpty(gVarF.w())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f156494m = gVarF.w();
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f();
                }
            } else {
                MBridgeConstans.OMID_JS_SERVICE_URL = com.mbridge.msdk.setting.net.b.f158614b;
                MBridgeConstans.OMID_JS_H5_URL = com.mbridge.msdk.setting.net.b.f158613a;
            }
        }
        if (i.b().i(str) && i.b().a(str, 1, (String) null)) {
            int iA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("is_first_init", 0);
            com.mbridge.msdk.foundation.same.a.f156313X = iA == 0 ? 1 : 0;
            com.mbridge.msdk.foundation.same.a.f156314Y = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("first_lau_time").longValue();
            if (iA == 0) {
                try {
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("is_first_init", 1);
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("first_lau_time", System.currentTimeMillis());
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.tools.g.d())) {
                        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(str));
                        return;
                    } else {
                        new k().b(this.f155987h, str, this.f155985f);
                        return;
                    }
                } catch (Throwable unused) {
                    new k().b(this.f155987h, str, this.f155985f);
                    return;
                }
            }
            new k().b(this.f155987h, str, this.f155985f);
        }
    }

    public void a(Map<String, Object> map, int i10) {
        if (MBridgeSDKFactory.getMBridgeSDK().getStatus() != MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            q0.b("SDKController", "preloaad failed,sdk do not inited");
            return;
        }
        this.f155981b = map;
        this.f155980a = i10;
        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        if (map != null) {
            b(strB);
        }
    }
}

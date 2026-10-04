package com.mbridge.msdk.advanced.middle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.advanced.view.MBOutNativeAdvancedViewGroup;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.setting.k;
import com.mbridge.msdk.setting.m;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static String f153860G = "NativeAdvancedProvider";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f153861A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f153862B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f153863C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f153867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f153868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBridgeIds f153869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.advanced.manager.b f153870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.advanced.manager.c f153871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f153872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private NativeAdvancedAdListener f153873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f153874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBNativeAdvancedView f153875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBNativeAdvancedWebview f153876j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.advanced.view.a f153877k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private m f153878l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f153879m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private k f153880n;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private JSONObject f153890x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private MBOutNativeAdvancedViewGroup f153892z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f153881o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f153882p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f153883q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f153884r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f153885s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f153886t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f153887u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f153888v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f153889w = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f153891y = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f153864D = true;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f153865E = false;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f153866F = new a();

    public class a implements ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.middle.c$a$a, reason: collision with other inner class name */
        public class RunnableC0542a implements Runnable {
            public RunnableC0542a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f153864D = true;
            }
        }

        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (c.this.f153864D) {
                c.this.f153864D = false;
                if (c.this.f153892z != null) {
                    c.this.f153892z.postDelayed(new RunnableC0542a(), 1000L);
                }
                try {
                    c.this.i();
                } catch (Exception e10) {
                    q0.b(c.f153860G, e10.getMessage());
                }
            }
        }
    }

    public c(String str, String str2, Activity activity) {
        this.f153868b = TextUtils.isEmpty(str) ? "" : str;
        this.f153867a = str2;
        this.f153869c = new MBridgeIds(str, str2);
        a(activity);
    }

    private void e(int i10) {
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f153876j;
        if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
            return;
        }
        try {
            if (this.f153876j != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", i10);
                f.a().a((WebView) this.f153876j, "onNetstatChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th) {
            q0.a(f153860G, th.getMessage());
        }
    }

    private void j() {
        a(this.f153881o);
        c(this.f153883q);
        g(this.f153885s);
        a(this.f153890x);
        e(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
    }

    public MBOutNativeAdvancedViewGroup d() {
        return this.f153892z;
    }

    public int f() {
        return this.f153881o;
    }

    public boolean g() {
        return this.f153879m;
    }

    public void h(int i10) {
        this.f153886t = true;
        g(i10);
    }

    public void i(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    if (this.f153863C) {
                        return;
                    } else {
                        this.f153863C = true;
                    }
                }
            } else if (this.f153862B) {
                return;
            } else {
                this.f153862B = true;
            }
        } else if (this.f153861A) {
            return;
        } else {
            this.f153861A = true;
        }
        try {
            i();
        } catch (Exception e10) {
            q0.b(f153860G, e10.getMessage());
        }
    }

    private void g(int i10) {
        if (this.f153886t) {
            this.f153885s = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f153876j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f153876j, "setVideoPlayMode", "autoPlay", Integer.valueOf(i10));
        }
    }

    public void b(JSONObject jSONObject) {
        this.f153891y = true;
        a(jSONObject);
    }

    public void c(String str) throws Throwable {
        b bVar = new b(this, this.f153869c);
        this.f153872f = bVar;
        bVar.a(this.f153873g);
        this.f153872f.a(str);
        a(str, 2);
    }

    public void d(String str) throws Throwable {
        if (!TextUtils.isEmpty(str)) {
            c(str);
            return;
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f153873g;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLoadFailed(this.f153869c, "bid  token is null or empty");
        }
    }

    public void f(int i10) {
        if (i10 == 1) {
            this.f153861A = false;
        } else if (i10 == 2) {
            this.f153862B = false;
        } else if (i10 == 3) {
            this.f153863C = false;
        }
        h();
    }

    private void h() {
        com.mbridge.msdk.advanced.manager.c cVar = this.f153871e;
        if (cVar != null) {
            cVar.e();
        }
    }

    public void a(boolean z10) {
        this.f153879m = z10;
    }

    public boolean b(String str) {
        return (this.f153892z == null || com.mbridge.msdk.advanced.manager.d.a(this.f153875i, this.f153868b, this.f153867a, str, this.f153881o, false, true) == null) ? false : true;
    }

    private void a(JSONObject jSONObject) {
        if (this.f153891y) {
            this.f153890x = jSONObject;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f153876j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f153876j, "setStyleList", "", jSONObject);
        }
    }

    public void b(int i10) {
        this.f153882p = true;
        a(i10);
    }

    private void c(int i10) {
        if (this.f153884r) {
            this.f153883q = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f153876j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f153876j, "setVolume", CampaignEx.JSON_NATIVE_VIDEO_MUTE, Integer.valueOf(i10));
        }
    }

    public void d(int i10) {
        this.f153884r = true;
        c(i10);
    }

    public void b(int i10, int i11) {
        a(i10, i11);
    }

    public String e() {
        if (this.f153865E) {
            com.mbridge.msdk.advanced.manager.c cVar = this.f153871e;
            if (cVar != null) {
                return cVar.c();
            }
            return "";
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f153870d;
        if (bVar != null) {
            return bVar.d();
        }
        return "";
    }

    public void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (this.f153878l == null) {
                this.f153878l = i.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f153867a);
            }
            this.f153874h = new d(this, this.f153873g, campaignEx);
            q0.a(f153860G, "show start");
            if (this.f153887u != 0 && this.f153888v != 0) {
                a(campaignEx, false);
                return;
            }
            d dVar = this.f153874h;
            if (dVar != null) {
                dVar.a(this.f153869c, "width or height is 0  or width or height is too small");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f153861A && this.f153862B && this.f153863C) {
            CampaignEx campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f153875i, this.f153868b, this.f153867a, "", this.f153881o, true, true);
            com.mbridge.msdk.advanced.manager.c cVar = this.f153871e;
            if (cVar != null) {
                cVar.f();
            }
            b(campaignExA);
        }
    }

    public void a(NativeAdvancedAdListener nativeAdvancedAdListener) {
        this.f153873g = nativeAdvancedAdListener;
    }

    private void a(int i10) {
        if (this.f153882p) {
            this.f153881o = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f153876j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            int i11 = this.f153881o;
            if (i11 == 1) {
                this.f153871e.a(true);
                com.mbridge.msdk.advanced.signal.a.a(this.f153876j, "showCloseButton", "", null);
            } else if (i11 == 0) {
                this.f153871e.a(false);
                com.mbridge.msdk.advanced.signal.a.a(this.f153876j, "hideCloseButton", "", null);
            }
        }
    }

    public String c() {
        if (this.f153865E) {
            com.mbridge.msdk.advanced.manager.c cVar = this.f153871e;
            if (cVar != null) {
                return cVar.a();
            }
            return "";
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f153870d;
        if (bVar != null) {
            return bVar.c();
        }
        return "";
    }

    public void b() {
        if (this.f153873g != null) {
            this.f153873g = null;
        }
        if (this.f153872f != null) {
            this.f153872f = null;
        }
        if (this.f153874h != null) {
            this.f153874h = null;
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f153870d;
        if (bVar != null) {
            bVar.a((MBNativeAdvancedView) null);
            this.f153870d.e();
        }
        com.mbridge.msdk.advanced.manager.c cVar = this.f153871e;
        if (cVar != null) {
            cVar.g();
        }
        MBNativeAdvancedView mBNativeAdvancedView = this.f153875i;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.destroy();
        }
        com.mbridge.msdk.advanced.common.c.b(this.f153868b + this.f153867a + e());
        com.mbridge.msdk.advanced.view.a aVar = this.f153877k;
        if (aVar != null) {
            aVar.b();
        }
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f153892z;
        if (mBOutNativeAdvancedViewGroup != null) {
            mBOutNativeAdvancedViewGroup.getViewTreeObserver().removeOnScrollChangedListener(this.f153866F);
            this.f153892z.removeAllViews();
            this.f153892z = null;
        }
    }

    public void a(CampaignEx campaignEx, boolean z10) {
        j();
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f153892z;
        if (mBOutNativeAdvancedViewGroup == null || mBOutNativeAdvancedViewGroup.getParent() == null) {
            return;
        }
        if (campaignEx != null && z10) {
            if (this.f153878l == null) {
                this.f153878l = i.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f153867a);
            }
            this.f153874h = new d(this, this.f153873g, campaignEx);
        }
        if (this.f153871e == null) {
            com.mbridge.msdk.advanced.manager.c cVar = new com.mbridge.msdk.advanced.manager.c(com.mbridge.msdk.foundation.controller.c.n().d(), this.f153868b, this.f153867a);
            this.f153871e = cVar;
            cVar.a(this);
        }
        a(campaignEx);
    }

    private void a(CampaignEx campaignEx) {
        if (com.mbridge.msdk.advanced.manager.d.a(this.f153875i, campaignEx, this.f153868b, this.f153867a)) {
            this.f153871e.a(this.f153874h);
            q0.b(f153860G, "start show process");
            this.f153871e.a(campaignEx, this.f153875i, true);
        }
    }

    private void a(String str, int i10) throws Throwable {
        boolean zB;
        this.f153864D = true;
        synchronized (this.f153889w) {
            try {
                if (this.f153879m) {
                    if (this.f153872f != null) {
                        this.f153872f.a(new com.mbridge.msdk.foundation.error.b(880016, "current unit is loading"), i10);
                        this.f153879m = true;
                    }
                    return;
                }
                this.f153879m = true;
                if (this.f153887u != 0 && this.f153888v != 0) {
                    if (this.f153875i == null) {
                        if (this.f153872f != null) {
                            this.f153872f.a(new com.mbridge.msdk.foundation.error.b(880030), i10);
                            return;
                        }
                        return;
                    }
                    try {
                        zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
                    } catch (Exception e10) {
                        q0.b(f153860G, e10.getMessage());
                        zB = false;
                    }
                    if (!zB) {
                        if (this.f153872f != null) {
                            this.f153872f.a(new com.mbridge.msdk.foundation.error.b(880029), i10);
                            return;
                        }
                        return;
                    }
                    this.f153875i.clearResStateAndRemoveClose();
                    m mVarA = i.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f153867a);
                    this.f153878l = mVarA;
                    if (mVarA == null) {
                        this.f153878l = m.k(this.f153867a);
                    }
                    if (this.f153870d == null) {
                        this.f153870d = new com.mbridge.msdk.advanced.manager.b(this.f153868b, this.f153867a, 0L);
                    }
                    b bVar = this.f153872f;
                    if (bVar != null) {
                        bVar.a(str);
                        this.f153870d.a(this.f153872f);
                    }
                    this.f153875i.resetLoadState();
                    this.f153870d.a(this.f153875i);
                    this.f153870d.a(this.f153878l);
                    this.f153870d.a(this.f153887u, this.f153888v);
                    this.f153870d.a(this.f153881o);
                    this.f153870d.b(str, i10);
                    return;
                }
                if (this.f153872f != null) {
                    this.f153872f.a(new com.mbridge.msdk.foundation.error.b(880028), i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(Activity activity) {
        com.mbridge.msdk.advanced.view.a aVar;
        ViewGroup.LayoutParams layoutParams;
        if (this.f153871e == null) {
            com.mbridge.msdk.advanced.manager.c cVar = new com.mbridge.msdk.advanced.manager.c(com.mbridge.msdk.foundation.controller.c.n().d(), this.f153868b, this.f153867a);
            this.f153871e = cVar;
            cVar.a(this);
        }
        if (this.f153876j == null) {
            try {
                this.f153876j = new MBNativeAdvancedWebview(com.mbridge.msdk.foundation.controller.c.n().d());
            } catch (Exception e10) {
                q0.b(f153860G, e10.getMessage());
            }
            if (this.f153877k == null) {
                try {
                    this.f153877k = new com.mbridge.msdk.advanced.view.a(this.f153867a, this.f153871e.b(), this);
                } catch (Exception e11) {
                    q0.b(f153860G, e11.getMessage());
                }
            }
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f153876j;
            if (mBNativeAdvancedWebview != null && (aVar = this.f153877k) != null) {
                mBNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.f153875i == null) {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            Context context = activity;
            if (activity == null) {
                context = contextD;
            }
            MBNativeAdvancedView mBNativeAdvancedView = new MBNativeAdvancedView(context);
            this.f153875i = mBNativeAdvancedView;
            mBNativeAdvancedView.setAdvancedNativeWebview(this.f153876j);
            MBNativeAdvancedWebview mBNativeAdvancedWebview2 = this.f153876j;
            if (mBNativeAdvancedWebview2 != null && mBNativeAdvancedWebview2.getParent() == null) {
                this.f153875i.addView(this.f153876j, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.f153892z == null) {
            this.f153892z = new MBOutNativeAdvancedViewGroup(com.mbridge.msdk.foundation.controller.c.n().d());
            if (this.f153887u != 0 && this.f153888v != 0) {
                layoutParams = new ViewGroup.LayoutParams(this.f153887u, this.f153888v);
            } else {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            this.f153892z.setLayoutParams(layoutParams);
            this.f153892z.setProvider(this);
            this.f153892z.addView(this.f153875i);
            this.f153892z.getViewTreeObserver().addOnScrollChangedListener(this.f153866F);
        }
        if (this.f153880n == null) {
            this.f153880n = new k();
        }
        this.f153880n.a(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c(), this.f153867a);
    }

    public String a(String str) {
        com.mbridge.msdk.advanced.manager.b bVar = this.f153870d;
        if (bVar != null) {
            return bVar.a(str);
        }
        return "";
    }

    private void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f153888v = i10;
        this.f153887u = i11;
        this.f153892z.setLayoutParams(new ViewGroup.LayoutParams(i11, i10));
    }
}

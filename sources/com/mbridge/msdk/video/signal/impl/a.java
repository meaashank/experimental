package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements com.mbridge.msdk.video.signal.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f161421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.setting.c f161422k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f161423l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f161412a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f161413b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f161414c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f161415d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f161416e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f161417f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f161418g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f161419h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f161420i = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a.InterfaceC0651a f161424m = new C0652a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f161425n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f161426o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdSession f161427p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MediaEvents f161428q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AdEvents f161429r = null;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.a$a, reason: collision with other inner class name */
    public static class C0652a implements a.InterfaceC0651a {
        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0651a
        public void a(boolean z10) {
            q0.a("DefaultJSCommon", "onStartInstall");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
            q0.a("DefaultJSCommon", "onDownloadProgress,progress:" + i10);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            q0.a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0651a
        public void onInitSuccess() {
            q0.a("DefaultJSCommon", "onInitSuccess");
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            q0.a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            q0.a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            q0.a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0651a
        public void a(int i10, String str) {
            q0.a("DefaultJSCommon", "onH5Error,code:" + i10 + "，msg:" + str);
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0651a
        public void a() {
            q0.a("DefaultJSCommon", "videoLocationReady");
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(boolean z10) {
        q0.a("DefaultJSCommon", "setIsShowingTransparent:" + z10);
        this.f161413b = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(int i10) {
        this.f161414c = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void c(int i10) {
        this.f161416e = i10;
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void click(int i10, String str) {
        q0.a("DefaultJSCommon", "click:type" + i10 + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void d(int i10) {
        q0.a("DefaultJSCommon", "setAlertDialogRole " + i10);
        this.f161419h = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void e(int i10) {
        this.f161415d = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String f(int i10) {
        q0.a("DefaultJSCommon", "getSDKInfo");
        return Ib.b.f53002g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void g(int i10) {
        this.f161425n = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void h() {
    }

    @Override // com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i10, String str) {
        q0.a("DefaultJSCommon", "handlerH5Exception,code=" + i10 + ",msg:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int i() {
        return this.f161420i;
    }

    public AdEvents j() {
        return this.f161429r;
    }

    public AdSession k() {
        return this.f161427p;
    }

    public int l() {
        if (this.f161414c == 0 && this.f161413b) {
            this.f161414c = 1;
        }
        return this.f161414c;
    }

    public int m() {
        if (this.f161415d == 0 && this.f161413b) {
            this.f161415d = 1;
        }
        return this.f161415d;
    }

    public int n() {
        if (this.f161416e == 0 && this.f161413b) {
            this.f161416e = 1;
        }
        return this.f161416e;
    }

    public MediaEvents o() {
        return this.f161428q;
    }

    public boolean p() {
        return this.f161413b;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void release() {
        q0.a("DefaultJSCommon", "release");
        com.mbridge.msdk.click.a aVar = this.f161423l;
        if (aVar != null) {
            aVar.a(false);
            this.f161423l.a((NativeListener.NativeTrackingListener) null);
            this.f161423l.c();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setActivity(Activity activity) {
        q0.a("DefaultJSCommon", "setActivity ");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdEvents(AdEvents adEvents) {
        this.f161429r = adEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setAdSession(AdSession adSession) {
        this.f161427p = adSession;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar) {
        q0.a("DefaultJSCommon", "setSetting:" + cVar);
        this.f161422k = cVar;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setUnitId(String str) {
        com.mbridge.msdk.advanced.manager.f.a("setUnitId:", str, "DefaultJSCommon");
        this.f161421j = str;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f161428q = mediaEvents;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void setWebViewFront(int i10) {
        this.f161418g = i10;
    }

    public static class b implements a.InterfaceC0651a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.signal.d f161430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a.InterfaceC0651a f161431b;

        public b(com.mbridge.msdk.video.signal.d dVar, a.InterfaceC0651a interfaceC0651a) {
            this.f161430a = dVar;
            this.f161431b = interfaceC0651a;
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0651a
        public void a(boolean z10) {
            a.InterfaceC0651a interfaceC0651a = this.f161431b;
            if (interfaceC0651a != null) {
                interfaceC0651a.a(z10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
            a.InterfaceC0651a interfaceC0651a = this.f161431b;
            if (interfaceC0651a != null) {
                interfaceC0651a.onDismissLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
            a.InterfaceC0651a interfaceC0651a = this.f161431b;
            if (interfaceC0651a != null) {
                interfaceC0651a.onDownloadFinish(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
            a.InterfaceC0651a interfaceC0651a = this.f161431b;
            if (interfaceC0651a != null) {
                interfaceC0651a.onDownloadProgress(i10);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
            a.InterfaceC0651a interfaceC0651a = this.f161431b;
            if (interfaceC0651a != null) {
                interfaceC0651a.onDownloadStart(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            a.InterfaceC0651a interfaceC0651a = this.f161431b;
            if (interfaceC0651a != null) {
                interfaceC0651a.onFinishRedirection(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f161430a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0651a
        public void onInitSuccess() {
            a.InterfaceC0651a interfaceC0651a = this.f161431b;
            if (interfaceC0651a != null) {
                interfaceC0651a.onInitSuccess();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            a.InterfaceC0651a interfaceC0651a = this.f161431b;
            return interfaceC0651a != null && interfaceC0651a.onInterceptDefaultLoadingDialog();
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            a.InterfaceC0651a interfaceC0651a = this.f161431b;
            if (interfaceC0651a != null) {
                interfaceC0651a.onRedirectionFailed(campaign, str);
            }
            com.mbridge.msdk.video.signal.d dVar = this.f161430a;
            if (dVar != null) {
                dVar.f();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
            a.InterfaceC0651a interfaceC0651a = this.f161431b;
            if (interfaceC0651a != null) {
                interfaceC0651a.onShowLoading(campaign);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            a.InterfaceC0651a interfaceC0651a = this.f161431b;
            if (interfaceC0651a != null) {
                interfaceC0651a.onStartRedirection(campaign, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0651a
        public void a(int i10, String str) {
            a.InterfaceC0651a interfaceC0651a = this.f161431b;
            if (interfaceC0651a != null) {
                interfaceC0651a.a(i10, str);
            }
        }

        @Override // com.mbridge.msdk.video.signal.a.InterfaceC0651a
        public void a() {
            a.InterfaceC0651a interfaceC0651a = this.f161431b;
            if (interfaceC0651a != null) {
                interfaceC0651a.a();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int b() {
        return this.f161418g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String c() {
        q0.a("DefaultJSCommon", "init");
        return Ib.b.f53002g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String e() {
        q0.a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public String g() {
        return Ib.b.f53002g;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public boolean a() {
        return this.f161412a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void b(boolean z10) {
        this.f161412a = z10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public int d() {
        q0.a("DefaultJSCommon", "getAlertDialogRole " + this.f161419h);
        return this.f161419h;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void f() {
        q0.a("DefaultJSCommon", "finish");
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(a.InterfaceC0651a interfaceC0651a) {
        q0.a("DefaultJSCommon", "setTrackingListener:" + interfaceC0651a);
        this.f161424m = interfaceC0651a;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10, String str) {
        q0.a("DefaultJSCommon", "statistics,type:" + i10 + ",json:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(int i10) {
        this.f161420i = i10;
    }

    @Override // com.mbridge.msdk.video.signal.a
    public void a(String str) {
        q0.a("DefaultJSCommon", "setNotchArea");
    }
}

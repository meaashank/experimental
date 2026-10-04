package com.mbridge.msdk.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.multidex.MultiDexExtractor;
import androidx.recyclerview.widget.m;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class MBridgeH5EndCardView extends MBridgeH5EndCardViewDiff {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f160775A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f160776B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f160777C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f160778D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f160779E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f160780F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f160781G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f160782H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f160783I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f160784J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private String f160785K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    Handler f160786L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f160787M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f160788N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f160789O;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected View f160790m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected RelativeLayout f160791n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected ImageView f160792o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected WindVaneWebView f160793p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f160794q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected Handler f160795r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected String f160796s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f160797t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f160798u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f160799v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f160800w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f160801x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f160802y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f160803z;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 100) {
                return;
            }
            if (MBridgeH5EndCardView.this.f160777C) {
                MBridgeH5EndCardView.this.notifyListener.a(122, "");
            }
            MBridgeH5EndCardView.this.notifyListener.a(103, "");
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeH5EndCardView.this.onCloseViewClick();
        }
    }

    public class c extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f160806a;

        public c(boolean z10) {
            this.f160806a = z10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            super.a(webView, i10);
            StringBuilder sbA = android.support.v4.media.a.a("h5EncardView readyStatus:", i10, "- isError");
            sbA.append(MBridgeH5EndCardView.this.f160798u);
            q0.c("WindVaneWebView", sbA.toString());
            MBridgeH5EndCardView.this.f160775A = i10;
            if (!MBridgeH5EndCardView.this.f160798u) {
                MBridgeH5EndCardView.this.a(System.currentTimeMillis() - MBridgeH5EndCardView.this.f160776B, false);
            }
            if (this.f160806a) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("type", 3);
                    eVar.a(R9.c.f67796d, Integer.valueOf(i10));
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", MBridgeH5EndCardView.this.f160707b, eVar);
                } catch (Throwable th) {
                    q0.b("WindVaneWebView", th.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void b(WebView webView, int i10) {
            super.b(webView, i10);
            MBridgeH5EndCardView.this.f160775A = i10;
            if (MBridgeH5EndCardView.this.f160803z) {
                return;
            }
            MBridgeH5EndCardView.this.f160803z = true;
            if (i10 == 1) {
                MBridgeH5EndCardView.this.reportRenderResult("success", 4);
            } else {
                MBridgeH5EndCardView.this.notifyListener.a(127, "");
                MBridgeH5EndCardView.this.reportRenderResult("failed", 6);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
            if (mBridgeH5EndCardView.f160798u) {
                return;
            }
            mBridgeH5EndCardView.f160797t = true;
            mBridgeH5EndCardView.notifyListener.a(100, "");
            if (MBridgeH5EndCardView.this.f160707b != null) {
                n nVar = new n();
                nVar.n(MBridgeH5EndCardView.this.f160707b.getRequestId());
                nVar.o(MBridgeH5EndCardView.this.f160707b.getRequestIdNotice());
                nVar.b(MBridgeH5EndCardView.this.f160707b.getId());
                nVar.d(1);
                nVar.e(String.valueOf(System.currentTimeMillis() - MBridgeH5EndCardView.this.f160776B));
                nVar.m("onPageFinished");
                String str2 = "2";
                if (MBridgeH5EndCardView.this.f160707b.getAdType() == 287) {
                    nVar.a(t1.b.f238888Z4);
                } else if (MBridgeH5EndCardView.this.f160707b.getAdType() == 94) {
                    nVar.a("1");
                } else if (MBridgeH5EndCardView.this.f160707b.getAdType() == 42) {
                    nVar.a("2");
                }
                if (MBridgeH5EndCardView.this.f160707b.isMraid()) {
                    nVar.b(n.f156188N);
                } else {
                    nVar.g(MBridgeH5EndCardView.this.f160707b.getendcard_url());
                    if (a1.b(MBridgeH5EndCardView.this.f160707b.getendcard_url()) && MBridgeH5EndCardView.this.f160707b.getendcard_url().contains(MultiDexExtractor.f114845k)) {
                        str2 = "1";
                    }
                    nVar.f(str2);
                    nVar.b(n.f156189O);
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = MBridgeH5EndCardView.this;
                com.mbridge.msdk.foundation.same.report.g.b(nVar, mBridgeH5EndCardView2.unitId, mBridgeH5EndCardView2.f160707b);
            }
            MBridgeH5EndCardView.this.notifyListener.a(120, "");
            if (this.f160806a) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 3);
                eVar.a(R9.c.f67796d, 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", MBridgeH5EndCardView.this.f160707b, eVar);
            } catch (Throwable th) {
                q0.b("WindVaneWebView", th.getMessage());
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
            if (mBridgeH5EndCardView.f160798u) {
                return;
            }
            mBridgeH5EndCardView.notifyListener.a(118, "onReceivedError " + i10 + str);
            MBridgeH5EndCardView.this.reportRenderResult(str, 3);
            MBridgeH5EndCardView.this.notifyListener.a(127, "");
            MBridgeH5EndCardView.this.notifyListener.a(129, "");
            MBridgeH5EndCardView.this.f160798u = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            super.onRenderProcessGone(webView);
            MBridgeH5EndCardView.this.setCloseVisible(0);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String string;
            try {
                q0.a(MBridgeBaseView.TAG, "webviewshow");
                try {
                    int[] iArr = new int[2];
                    MBridgeH5EndCardView.this.f160793p.getLocationOnScreen(iArr);
                    q0.b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                    if (contextD != null) {
                        jSONObject.put("startX", v0.b(contextD, iArr[0]));
                        jSONObject.put("startY", v0.b(contextD, iArr[1]));
                        jSONObject.put(com.mbridge.msdk.foundation.same.a.f156328l, v0.d(contextD));
                    }
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
                    string = "";
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f160793p, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
                MBridgeH5EndCardView.this.notifyListener.a(109, "");
                MBridgeH5EndCardView.this.i();
                MBridgeH5EndCardView.this.startCounterEndCardShowTimer();
                com.mbridge.msdk.mbsignalcommon.windvane.f fVarA = com.mbridge.msdk.mbsignalcommon.windvane.f.a();
                MBridgeH5EndCardView mBridgeH5EndCardView = MBridgeH5EndCardView.this;
                fVarA.a((WebView) mBridgeH5EndCardView.f160793p, "oncutoutfetched", Base64.encodeToString(mBridgeH5EndCardView.f160785K.getBytes(), 0));
                MBridgeH5EndCardView.this.e();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f160810a;

        public f(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f160810a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e10) {
                q0.b("CloseRunnable", e10.getMessage());
            }
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f160810a;
            if (mBridgeH5EndCardView == null || (handler = mBridgeH5EndCardView.f160786L) == null) {
                return;
            }
            handler.sendEmptyMessage(100);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f160812a;

        public g(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f160812a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f160812a;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.f160803z) {
                return;
            }
            this.f160812a.f160803z = true;
            this.f160812a.f160797t = false;
            MBridgeH5EndCardView.this.reportRenderResult(Jb.d.f58184l, 5);
            this.f160812a.notifyListener.a(127, "");
            q0.a(MBridgeBaseView.TAG, "notify TYPE_NOTIFY_SHOW_NATIVE_ENDCARD");
        }
    }

    public static class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f160814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f160815b;

        public h(MBridgeH5EndCardView mBridgeH5EndCardView, int i10) {
            this.f160814a = mBridgeH5EndCardView;
            this.f160815b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f160814a;
            if (mBridgeH5EndCardView == null || mBridgeH5EndCardView.f160707b == null) {
                return;
            }
            try {
                if (mBridgeH5EndCardView.f160802y) {
                    q0.c(MBridgeBaseView.TAG, "insertEndCardReadyState hasInsertLoadEndCardReport true return");
                    return;
                }
                this.f160814a.f160802y = true;
                n nVar = new n("m_download_end", 12, (this.f160815b * 1000) + "", this.f160814a.f160707b.getendcard_url(), this.f160814a.f160707b.getId(), this.f160814a.unitId, "ready timeout", (a1.b(this.f160814a.f160707b.getendcard_url()) && this.f160814a.f160707b.getendcard_url().contains(MultiDexExtractor.f114845k)) ? "1" : "2");
                try {
                    if (this.f160814a.f160707b.getAdType() == 287) {
                        nVar.a(t1.b.f238888Z4);
                    } else if (this.f160814a.f160707b.getAdType() == 94) {
                        nVar.a("1");
                    } else if (this.f160814a.f160707b.getAdType() == 42) {
                        nVar.a("2");
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                nVar.n(this.f160814a.f160707b.getRequestId());
                nVar.k(this.f160814a.f160707b.getCurrentLocalRid());
                nVar.o(this.f160814a.f160707b.getRequestIdNotice());
                nVar.a(this.f160814a.f160707b.getAdSpaceT());
                this.f160814a.isLoadSuccess();
            } catch (Throwable th) {
                q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f160816a;

        public i(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f160816a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f160816a;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.f160781G = true;
            }
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f160818a;

        public j(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f160818a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f160818a;
            if (mBridgeH5EndCardView != null) {
                mBridgeH5EndCardView.f160782H = true;
            }
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeH5EndCardView f160820a;

        public k(MBridgeH5EndCardView mBridgeH5EndCardView) {
            this.f160820a = mBridgeH5EndCardView;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeH5EndCardView mBridgeH5EndCardView = this.f160820a;
            if (mBridgeH5EndCardView != null) {
                if (!mBridgeH5EndCardView.f160783I) {
                    MBridgeH5EndCardView.this.setCloseVisible(0);
                }
                this.f160820a.f160778D = true;
            }
        }
    }

    public MBridgeH5EndCardView(Context context) {
        super(context);
        this.f160794q = false;
        this.f160795r = new Handler();
        this.f160797t = false;
        this.f160798u = false;
        this.f160799v = false;
        this.f160800w = 1;
        this.f160801x = 1;
        this.f160802y = false;
        this.f160803z = false;
        this.f160775A = 1;
        this.f160776B = 0L;
        this.f160777C = false;
        this.f160778D = false;
        this.f160779E = false;
        this.f160780F = false;
        this.f160781G = false;
        this.f160782H = false;
        this.f160783I = false;
        this.f160784J = false;
        this.f160785K = "";
        this.f160786L = new a(Looper.getMainLooper());
        this.f160787M = false;
        this.f160788N = false;
        this.f160789O = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        int i10 = getResources().getConfiguration().orientation;
        String str = AdError.UNDEFINED_DOMAIN;
        if (i10 != 0) {
            if (i10 == 1) {
                str = "portrait";
            } else if (i10 == 2) {
                str = "landscape";
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        HashMap map = new HashMap();
        map.put("placementType", "Interstitial");
        map.put("state", "default");
        map.put("viewable", "true");
        map.put("currentAppOrientation", jSONObject);
        if (getContext() instanceof Activity) {
            float fN = m0.n(getContext());
            float fM = m0.m(getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f10 = displayMetrics.widthPixels;
            float f11 = displayMetrics.heightPixels;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f160793p, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f160793p, f10, f11);
        }
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f160793p, r7.getLeft(), this.f160793p.getTop(), this.f160793p.getWidth(), this.f160793p.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f160793p, r13.getLeft(), this.f160793p.getTop(), this.f160793p.getWidth(), this.f160793p.getHeight());
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f160793p, map);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f160793p, com.mbridge.msdk.mbsignalcommon.mraid.d.f157579f);
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f160793p);
    }

    public boolean canBackPress() {
        ImageView imageView = this.f160792o;
        return imageView != null && imageView.getVisibility() == 0;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    public void excuteEndCardShowTask(int i10) {
        this.f160795r.postDelayed(new h(this, i10), i10 * 1000);
    }

    public void excuteTask() {
        if (this.f160799v || this.f160800w <= -1) {
            return;
        }
        this.f160795r.postDelayed(new k(this), this.f160800w * 1000);
    }

    public void executeEndCardShow(int i10) {
        this.f160795r.postDelayed(new g(this), i10 * 1000);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
    }

    public RelativeLayout.LayoutParams getContentLayoutParams() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        return this.f160707b;
    }

    public String getURL() {
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx == null) {
            this.f160777C = false;
            return null;
        }
        this.f160777C = true;
        if (campaignEx.isMraid()) {
            this.f160799v = false;
            String mraid = this.f160707b.getMraid();
            if (TextUtils.isEmpty(mraid)) {
                return this.f160707b.getEndScreenUrl();
            }
            File file = new File(mraid);
            try {
                if (!file.exists() || !file.isFile() || !file.canRead()) {
                    return this.f160707b.getEndScreenUrl();
                }
                return "file:////" + mraid;
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
                return mraid;
            }
        }
        String str = this.f160707b.getendcard_url();
        if (a1.a(str)) {
            this.f160799v = false;
            return this.f160707b.getEndScreenUrl();
        }
        this.f160799v = true;
        String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(str);
        if (!TextUtils.isEmpty(h5ResAddress)) {
            StringBuilder sbA = android.support.v4.media.f.a(h5ResAddress, "&native_adtype=");
            sbA.append(this.f160707b.getAdType());
            return sbA.toString();
        }
        try {
            String path = Uri.parse(str).getPath();
            if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(MultiDexExtractor.f114845k)) {
                String endScreenUrl = this.f160707b.getEndScreenUrl();
                if (TextUtils.isEmpty(endScreenUrl)) {
                    return null;
                }
                this.f160799v = false;
                excuteTask();
                return endScreenUrl;
            }
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
        StringBuilder sbA2 = android.support.v4.media.f.a(str, "&native_adtype=");
        sbA2.append(this.f160707b.getAdType());
        return sbA2.toString();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void handlerPlayableException(String str) {
        if (this.f160798u) {
            return;
        }
        this.f160798u = true;
        this.f160797t = false;
        if (this.f160707b != null) {
            n nVar = new n();
            nVar.n(this.f160707b.getRequestId());
            nVar.o(this.f160707b.getRequestIdNotice());
            nVar.b(this.f160707b.getId());
            nVar.m(str);
            com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f160706a.getApplicationContext(), this.unitId);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_endcard_h5");
        if (i0.a(iFindLayout)) {
            View viewInflate = this.f160708c.inflate(iFindLayout, (ViewGroup) null);
            this.f160790m = viewInflate;
            try {
                this.f160710e = a(viewInflate);
            } catch (Exception unused) {
                this.f160710e = false;
            }
            addView(this.f160790m, getContentLayoutParams());
            d();
            j();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void install(CampaignEx campaignEx) {
    }

    public boolean isLoadSuccess() {
        return this.f160797t;
    }

    public boolean isPlayable() {
        return this.f160799v;
    }

    public void j() {
        if (this.f160710e) {
            setMatchParent();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        if (i10 == 0) {
            this.f160779E = true;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f160780F = true;
        }
    }

    public void onBackPress() {
        boolean z10;
        if (this.f160778D || (((z10 = this.f160779E) && this.f160780F) || (!(z10 || !this.f160781G || this.f160789O) || (!z10 && this.f160782H && this.f160789O)))) {
            onCloseViewClick();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.mbridge.msdk.foundation.same.report.metrics.d] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.mbridge.msdk.foundation.entity.CampaignEx] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0032 -> B:18:0x0057). Please report as a decompilation issue!!! */
    public void onCloseViewClick() {
        Object objB = "";
        int i10 = 119;
        int i11 = 103;
        try {
            if (this.f160793p != null) {
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f160793p, "onSystemDestory", "");
                new Thread(new f(this)).start();
            } else {
                this.notifyListener.a(103, "");
                this.notifyListener.a(119, "webview is null when closing webview");
            }
        } catch (Exception e10) {
            this.notifyListener.a(i11, objB);
            this.notifyListener.a(i10, "close webview exception" + e10.getMessage());
            q0.a(MBridgeBaseView.TAG, e10.getMessage());
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
            objB = com.mbridge.msdk.foundation.same.report.metrics.d.b();
            i10 = "2000134";
            i11 = this.f160707b;
            objB.a("2000134", i11);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onFinishRedirection(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        u0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onRedirectionFailed(Campaign campaign, String str) {
        if (campaign == null) {
            return;
        }
        u0.a(campaign, this);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    @Override // com.mbridge.msdk.out.BaseTrackingListener
    public void onStartRedirection(Campaign campaign, String str) {
        u0.b(campaign, this);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0 || this.f160784J) {
            return;
        }
        this.f160784J = true;
        setFocusableInTouchMode(true);
        requestFocus();
        requestFocusFromTouch();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        if (z10) {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f160793p, "true");
        } else {
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().c(this.f160793p, "false");
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        super.open(str);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void orientation(Configuration configuration) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f160793p, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        String url = getURL();
        if (!this.f160710e || this.f160707b == null || TextUtils.isEmpty(url) || this.f160793p == null) {
            reportRenderResult("PL URL IS NULL", 3);
            this.notifyListener.a(127, "");
            this.notifyListener.a(129, "");
        } else {
            this.f160776B = System.currentTimeMillis();
            try {
                reportRenderResult("start", 0);
            } catch (Exception unused) {
            }
            com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(this.f160707b);
            aVar.a(this.f160707b.getAppName());
            this.f160793p.setDownloadListener(aVar);
            this.f160793p.setCampaignId(this.f160707b.getId());
            this.f160793p.setTempTypeForMetrics(3);
            CampaignEx campaignEx = this.f160707b;
            if (campaignEx != null) {
                this.f160793p.setCampaignEx(campaignEx);
            }
            setCloseVisible(8);
            this.f160793p.setApiManagerJSFactory(bVar);
            if (this.f160707b.isMraid()) {
                this.f160793p.setMraidObject(this);
            }
            boolean z10 = url.contains("wfr=1") || url.contains("wfl=1");
            b1.a(this.f160793p, this.f160707b.getLocalRequestId(), this.f160707b.getLocalAllowTrackClick());
            this.f160793p.setWebViewListener(new c(z10));
            if (TextUtils.isEmpty(this.f160707b.getMraid())) {
                h();
            }
            setHtmlSource(HTMLResourceManager.getInstance().getHtmlContentFromUrl(url));
            if (TextUtils.isEmpty(this.f160796s)) {
                this.f160793p.loadUrl(url);
            } else {
                this.f160793p.loadDataWithBaseURL(url, this.f160796s, "text/html", "UTF-8", null);
            }
        }
        this.f160789O = false;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void readyStatus(int i10) {
    }

    public void release() {
        Handler handler = this.f160795r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f160795r = null;
        }
        Handler handler2 = this.f160786L;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.f160786L = null;
        }
        this.f160791n.removeAllViews();
        this.f160793p.release();
        this.f160793p = null;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void reportOpen(String str) {
        CampaignEx mraidCampaign = getMraidCampaign();
        if (mraidCampaign != null) {
            new com.mbridge.msdk.foundation.same.report.h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.unitId, str, this.f160707b.isBidCampaign());
        }
    }

    public void reportRenderResult(String str, int i10) {
        if (this.f160707b == null || this.f160798u) {
            return;
        }
        n nVar = new n();
        nVar.n(this.f160707b.getRequestId());
        nVar.o(this.f160707b.getRequestIdNotice());
        nVar.b(this.f160707b.getId());
        nVar.d(i10);
        nVar.e(String.valueOf(System.currentTimeMillis() - this.f160776B));
        nVar.m(str);
        String str2 = "2";
        if (this.f160707b.getAdType() == 287) {
            nVar.a(t1.b.f238888Z4);
        } else if (this.f160707b.getAdType() == 94) {
            nVar.a("1");
        } else if (this.f160707b.getAdType() == 42) {
            nVar.a("2");
        }
        if (this.f160707b.isMraid()) {
            nVar.b(n.f156188N);
        } else {
            nVar.g(this.f160707b.getendcard_url());
            if (a1.b(this.f160707b.getendcard_url()) && this.f160707b.getendcard_url().contains(MultiDexExtractor.f114845k)) {
                str2 = "1";
            }
            nVar.f(str2);
            nVar.b(n.f156189O);
        }
        com.mbridge.msdk.foundation.same.report.g.b(nVar, this.unitId, this.f160707b);
    }

    public void setCloseDelayShowTime(int i10) {
        this.f160800w = i10;
    }

    public void setCloseVisible(int i10) {
        if (this.f160710e) {
            this.f160792o.setVisibility(i10);
        }
    }

    public void setCloseVisibleForMraid(int i10) {
        if (this.f160710e) {
            this.f160783I = true;
            if (i10 == 4) {
                this.f160792o.setImageDrawable(new ColorDrawable(m.f116809W));
            } else {
                this.f160792o.setImageResource(findDrawable("mbridge_reward_close"));
            }
            this.f160792o.setVisibility(0);
        }
    }

    public void setError(boolean z10) {
        this.f160798u = z10;
    }

    public void setHtmlSource(String str) {
        this.f160796s = str;
    }

    public void setLoadPlayable(boolean z10) {
        this.f160789O = z10;
    }

    public void setNotchValue(String str, int i10, int i11, int i12, int i13) {
        if (!TextUtils.isEmpty(str)) {
            this.f160785K = str;
        }
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx == null || campaignEx.getAdSpaceT() == 2) {
            return;
        }
        q0.b(MBridgeBaseView.TAG, "NOTCH H5ENDCARD ".concat(String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13))));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f160792o.getLayoutParams();
        int iA = v0.a(getContext(), 20.0f);
        layoutParams.setMargins(i10 + iA, i12 + iA, i11 + iA, i13 + iA);
        this.f160792o.setLayoutParams(layoutParams);
    }

    public void setPlayCloseBtnTm(int i10) {
        this.f160801x = i10;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String str = this.f160707b.getendcard_url();
            if (a1.b(str) && str.contains("wfl=1")) {
                String[] strArrSplit = str.split("&");
                int iA = 15;
                if (strArrSplit != null && strArrSplit.length > 0) {
                    for (String str2 : strArrSplit) {
                        if (a1.b(str2) && str2.contains(Jb.d.f58184l) && str2.split("=") != null && str2.split("=").length > 0) {
                            iA = v0.a((Object) str2.split("=")[1]);
                        }
                    }
                }
                executeEndCardShow(iA);
            }
        } catch (Throwable th) {
            q0.a(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        int visibility = this.f160792o.getVisibility();
        if (i10 == 1) {
            this.f160778D = true;
            visibility = 0;
        } else if (i10 == 2) {
            this.f160778D = false;
            if (this.f160789O) {
                g();
            } else {
                f();
            }
            visibility = 8;
        }
        setCloseVisible(visibility);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff, com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        try {
            setCloseVisibleForMraid(z10 ? 4 : 0);
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public void volumeChange(double d10) {
        com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f160793p, d10);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f160793p;
        if (windVaneWebView != null) {
            windVaneWebView.post(new d());
        }
    }

    private void f() {
        if (this.f160787M || this.f160779E) {
            return;
        }
        this.f160787M = true;
        int i10 = this.f160800w;
        if (i10 == 0) {
            this.f160781G = true;
            return;
        }
        this.f160781G = false;
        if (i10 > -1) {
            this.f160795r.postDelayed(new i(this), this.f160800w * 1000);
        }
    }

    private void g() {
        if (this.f160788N || this.f160779E) {
            return;
        }
        this.f160788N = true;
        int i10 = this.f160801x;
        if (i10 == 0) {
            this.f160782H = true;
            return;
        }
        this.f160782H = false;
        if (i10 > -1) {
            this.f160795r.postDelayed(new j(this), this.f160801x * 1000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void h() {
        /*
            r7 = this;
            java.lang.String r0 = "wfr=1"
            java.lang.String r1 = "="
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3b
            r7.f160776B = r2     // Catch: java.lang.Throwable -> L3b
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r7.f160707b     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = r2.getendcard_url()     // Catch: java.lang.Throwable -> L3b
            com.mbridge.msdk.videocommon.setting.b r3 = com.mbridge.msdk.videocommon.setting.b.b()     // Catch: java.lang.Throwable -> L3b
            com.mbridge.msdk.foundation.controller.c r4 = com.mbridge.msdk.foundation.controller.c.n()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = r4.b()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r5 = r7.unitId     // Catch: java.lang.Throwable -> L3b
            com.mbridge.msdk.videocommon.setting.c r3 = r3.c(r4, r5)     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r7.f160799v     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L97
            boolean r4 = com.mbridge.msdk.foundation.tools.a1.b(r2)     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L97
            boolean r4 = r2.contains(r0)     // Catch: java.lang.Throwable -> L3b
            if (r4 != 0) goto L3d
            if (r3 == 0) goto L97
            int r4 = r3.v()     // Catch: java.lang.Throwable -> L3b
            if (r4 <= 0) goto L97
            goto L3d
        L3b:
            r0 = move-exception
            goto L98
        L3d:
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L3b
            r4 = 20
            if (r0 == 0) goto L80
            java.lang.String r0 = "&"
            java.lang.String[] r0 = r2.split(r0)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L8d
            int r2 = r0.length     // Catch: java.lang.Throwable -> L3b
            if (r2 <= 0) goto L8d
            int r2 = r0.length     // Catch: java.lang.Throwable -> L3b
            r3 = 0
        L52:
            if (r3 >= r2) goto L8d
            r5 = r0[r3]     // Catch: java.lang.Throwable -> L3b
            boolean r6 = com.mbridge.msdk.foundation.tools.a1.b(r5)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L7d
            java.lang.String r6 = "to"
            boolean r6 = r5.contains(r6)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L7d
            java.lang.String[] r6 = r5.split(r1)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L7d
            java.lang.String[] r6 = r5.split(r1)     // Catch: java.lang.Throwable -> L3b
            int r6 = r6.length     // Catch: java.lang.Throwable -> L3b
            if (r6 <= 0) goto L7d
            java.lang.String[] r0 = r5.split(r1)     // Catch: java.lang.Throwable -> L3b
            r1 = 1
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L3b
            int r0 = com.mbridge.msdk.foundation.tools.v0.a(r0)     // Catch: java.lang.Throwable -> L3b
            goto L8e
        L7d:
            int r3 = r3 + 1
            goto L52
        L80:
            if (r3 == 0) goto L8d
            int r0 = r3.v()     // Catch: java.lang.Throwable -> L3b
            if (r0 <= 0) goto L8d
            int r0 = r3.v()     // Catch: java.lang.Throwable -> L3b
            goto L8e
        L8d:
            r0 = r4
        L8e:
            if (r0 < 0) goto L94
            r7.excuteEndCardShowTask(r0)     // Catch: java.lang.Throwable -> L3b
            return
        L94:
            r7.excuteEndCardShowTask(r4)     // Catch: java.lang.Throwable -> L3b
        L97:
            return
        L98:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "MBridgeBaseView"
            com.mbridge.msdk.foundation.tools.q0.b(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.h():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            CampaignEx campaignEx = this.f160707b;
            if (campaignEx != null) {
                campaignEx.setCampaignUnitId(this.unitId);
                com.mbridge.msdk.foundation.feedback.b.b().d(this.unitId + "_1");
                com.mbridge.msdk.foundation.feedback.b.b().a(this.unitId + "_2", this.f160707b);
            }
            CampaignEx campaignEx2 = this.f160707b;
            if (campaignEx2 == null || !campaignEx2.isMraid()) {
                return;
            }
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            imageView.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_notice", AppIntroBaseFragmentKt.ARG_DRAWABLE));
            ImageView imageView2 = this.f160792o;
            RelativeLayout.LayoutParams layoutParams = imageView2 != null ? (RelativeLayout.LayoutParams) imageView2.getLayoutParams() : null;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f));
            layoutParams2.addRule(9);
            layoutParams2.addRule(10);
            if (layoutParams != null) {
                layoutParams2.leftMargin = layoutParams.rightMargin;
                layoutParams2.topMargin = layoutParams.topMargin;
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
            } else {
                layoutParams2.leftMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f);
                layoutParams2.topMargin = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f);
            }
            addView(imageView, layoutParams2);
            v0.a(4, imageView, this.f160707b, com.mbridge.msdk.foundation.controller.c.n().d(), false, new e());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void d() {
        super.d();
        if (this.f160710e) {
            this.f160792o.setOnClickListener(new b());
        }
    }

    private boolean a(View view) {
        this.f160792o = (ImageView) view.findViewById(findID("mbridge_windwv_close"));
        this.f160791n = (RelativeLayout) view.findViewById(findID("mbridge_windwv_content_rl"));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext());
        this.f160793p = windVaneWebView;
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx != null) {
            windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
        }
        this.f160793p.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f160791n.addView(this.f160793p);
        return isNotNULL(this.f160792o, this.f160793p);
    }

    public class e implements com.mbridge.msdk.foundation.feedback.a {
        public e() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f160793p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f160793p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBridgeH5EndCardView.this.f160793p, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:5|6|(1:13)(1:10)|14|(1:16)(2:17|(1:19)(9:22|21|23|49|24|(1:26)(2:29|(1:31)(2:32|(1:34)))|48|37|(1:55)(4:40|(1:42)(1:43)|44|56)))|20|21|23|49|24|(0)(0)|48|37|(1:55)(1:54)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[Catch: all -> 0x0029, NullPointerException -> 0x0082, TryCatch #0 {NullPointerException -> 0x0082, blocks: (B:24:0x0072, B:26:0x007c, B:29:0x0084, B:31:0x008e, B:32:0x0092, B:34:0x009c), top: B:49:0x0072, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[Catch: all -> 0x0029, NullPointerException -> 0x0082, TryCatch #0 {NullPointerException -> 0x0082, blocks: (B:24:0x0072, B:26:0x007c, B:29:0x0084, B:31:0x008e, B:32:0x0092, B:34:0x009c), top: B:49:0x0072, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r15, boolean r17) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeH5EndCardView.a(long, boolean):void");
    }

    public MBridgeH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f160794q = false;
        this.f160795r = new Handler();
        this.f160797t = false;
        this.f160798u = false;
        this.f160799v = false;
        this.f160800w = 1;
        this.f160801x = 1;
        this.f160802y = false;
        this.f160803z = false;
        this.f160775A = 1;
        this.f160776B = 0L;
        this.f160777C = false;
        this.f160778D = false;
        this.f160779E = false;
        this.f160780F = false;
        this.f160781G = false;
        this.f160782H = false;
        this.f160783I = false;
        this.f160784J = false;
        this.f160785K = "";
        this.f160786L = new a(Looper.getMainLooper());
        this.f160787M = false;
        this.f160788N = false;
        this.f160789O = false;
    }

    private static void a(n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), campaignEx.getCampaignUnitId());
            if (cVarC != null) {
                nVar.s(cVarC.x());
            }
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC != null) {
                nVar.r(aVarC.f());
            }
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }
}

package com.mbridge.msdk.splash.manager;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import s0.x;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f158693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected MBSplashView f158694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected com.mbridge.msdk.splash.middle.d f158695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f158696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f158697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f158698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f158699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f158700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f158701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected MBridgeIds f158702k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f158708q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f158709r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected Context f158710s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f158712u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private i f158713v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AdSession f158714w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f158692a = "SplashShowManager";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f158703l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected String f158704m = "点击跳过|";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected String f158705n = "点击跳过|";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected String f158706o = "秒";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected String f158707p = "秒后自动关闭";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f158711t = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View.OnClickListener f158715x = new a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Handler f158716y = new HandlerC0622b(Looper.getMainLooper());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f158717z = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected j f158691A = new e();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f158697f) {
                b.this.b(1);
                b.this.d(-1);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.b$b, reason: collision with other inner class name */
    public class HandlerC0622b extends Handler {
        public HandlerC0622b(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void handleMessage(@androidx.annotation.NonNull android.os.Message r9) {
            /*
                Method dump skipped, instruction units count: 231
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.manager.b.HandlerC0622b.handleMessage(android.os.Message):void");
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.k();
        }
    }

    public class e implements j {
        public e() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, b.this.f158694c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, b.this.f158694c);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            u0.b(campaign, b.this.f158694c);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f158723a;

        public f(int i10) {
            this.f158723a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f158723a);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f158725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f158726b;

        public g(Context context, CampaignEx campaignEx) {
            this.f158725a = context;
            this.f158726b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f158725a)).b(this.f158726b.getId());
            } catch (Exception unused) {
                q0.b("SplashShowManager", "campain can't insert db");
            }
        }
    }

    public class h implements com.mbridge.msdk.foundation.feedback.a {
        public h() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            b.this.f();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            b.this.g();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            b.this.g();
        }
    }

    public class i implements com.mbridge.msdk.splash.middle.a {
        private i() {
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(CampaignEx campaignEx) {
            b.this.b(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void close() {
            b.this.b(1);
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void toggleCloseBtn(int i10) {
            MBSplashView mBSplashView = b.this.f158694c;
            if (mBSplashView != null) {
                mBSplashView.changeCloseBtnState(i10);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void triggerCloseBtn(Object obj, String str) {
            b.this.b(1);
        }

        public /* synthetic */ i(b bVar, a aVar) {
            this();
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(int i10) {
            q0.b("SplashShowManager", "resetCountdown" + i10);
            b bVar = b.this;
            bVar.f158703l = i10;
            bVar.f158716y.removeMessages(1);
            b.this.f158716y.sendEmptyMessageDelayed(1, 1000L);
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(boolean z10) {
            if (z10) {
                b.this.f158716y.removeMessages(1);
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(boolean z10, String str) {
            try {
                if (b.this.f158695d != null) {
                    if (TextUtils.isEmpty(str)) {
                        b bVar = b.this;
                        bVar.f158695d.a(bVar.f158702k);
                        return;
                    }
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(b.this.f158693b));
                    campaignWithBackData.setClickTempSource(2);
                    campaignWithBackData.setClickType(2);
                    campaignWithBackData.setTriggerClickSource(2);
                    campaignWithBackData.setClickURL(str);
                    b.this.b(campaignWithBackData, true, str);
                }
            } catch (Exception e10) {
                q0.b("SplashShowManager", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.splash.middle.a
        public void a(int i10, int i11) {
            if (i10 == 1) {
                b.this.f158716y.removeMessages(1);
            }
            if (i10 == 2) {
                b bVar = b.this;
                bVar.f158703l = i11;
                bVar.f158716y.removeMessages(1);
                b.this.f158716y.sendEmptyMessageDelayed(1, 1000L);
            }
        }
    }

    public b(Context context, String str, String str2) {
        this.f158700i = str2;
        this.f158701j = str;
        this.f158702k = new MBridgeIds(str, str2);
        this.f158710s = context;
        if (this.f158698g == null) {
            TextView textView = new TextView(context);
            this.f158698g = textView;
            textView.setGravity(1);
            this.f158698g.setTextIsSelectable(false);
            this.f158698g.setPadding(v0.a(context, 5.0f), v0.a(context, 5.0f), v0.a(context, 5.0f), v0.a(context, 5.0f));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f158698g.getLayoutParams();
            this.f158698g.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(v0.a(context, 100.0f), v0.a(context, 50.0f)) : layoutParams);
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        MBSplashView mBSplashView;
        try {
            if (this.f158693b == null) {
                return;
            }
            this.f158709r = true;
            if (this.f158695d != null && (mBSplashView = this.f158694c) != null) {
                if (mBSplashView.getContext() != null && (this.f158694c.getContext() instanceof Activity) && ((Activity) this.f158694c.getContext()).isFinishing()) {
                    q0.a("SplashShowManager", "Activity is finishing");
                }
                if (this.f158694c.isShown()) {
                    this.f158695d.b(this.f158702k);
                } else {
                    this.f158695d.a(this.f158702k, "SplashView or container is not visibility");
                }
            }
            if (!this.f158693b.isReport()) {
                MBSplashView mBSplashView2 = this.f158694c;
                if (mBSplashView2 == null || mBSplashView2.isDynamicView()) {
                    a(this.f158693b);
                } else {
                    b(this.f158693b);
                }
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f158693b, this.f158700i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void j() {
        String str;
        if (this.f158697f) {
            str = this.f158705n + this.f158703l + this.f158706o;
        } else {
            str = this.f158703l + this.f158707p;
        }
        this.f158698g.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        MBSplashView mBSplashView;
        MBSplashWebview splashWebview;
        View splashWebview2 = this.f158694c.getSplashWebview();
        if (splashWebview2 == null) {
            splashWebview2 = this.f158694c.getSplashNativeView();
        }
        l lVarA = com.mbridge.msdk.foundation.tools.h.a(splashWebview2, this.f158693b.getImpReportType());
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f158693b);
        if (lVarA.a()) {
            com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
        } else if (this.f158717z) {
            this.f158717z = false;
            this.f158694c.postDelayed(new c(), 200L);
            return;
        } else {
            com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
            if (this.f158693b.getLocalCheckShow() == 1) {
                a("ad env is not available");
                return;
            }
        }
        CampaignEx campaignEx = this.f158693b;
        if (campaignEx != null && campaignEx.isActiveOm() && (mBSplashView = this.f158694c) != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            try {
                AdSession adSessionA = com.mbridge.msdk.omsdk.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), splashWebview, splashWebview.getUrl(), this.f158693b);
                this.f158714w = adSessionA;
                if (adSessionA != null) {
                    splashWebview.setAdSession(adSessionA);
                    this.f158714w.registerAdView(splashWebview);
                    this.f158714w.start();
                }
                q0.a("OMSDK", "adSession.start()");
            } catch (Throwable th) {
                q0.a("OMSDK", th.getMessage());
                CampaignEx campaignEx2 = this.f158693b;
                if (campaignEx2 != null) {
                    new com.mbridge.msdk.foundation.same.report.h(splashWebview.getContext()).a(campaignEx2.getRequestId(), this.f158693b.getRequestIdNotice(), this.f158693b.getId(), this.f158700i, com.bykv.vk.openvk.preload.geckox.d.j.a(th, new StringBuilder("fetch OM failed, exception")));
                }
            }
        }
        com.mbridge.msdk.splash.manager.d.b(this.f158700i);
        this.f158716y.removeMessages(1);
        this.f158716y.sendEmptyMessageDelayed(1, 1000L);
        this.f158716y.sendEmptyMessageDelayed(2, 1000L);
        b();
        if (!this.f158693b.isMraid()) {
            a();
        }
        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f158693b.getMaitve(), this.f158693b.getMaitve_src());
        try {
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f158700i, this.f158693b.getAdType());
            if (bitmapDrawableA != null) {
                if (this.f158712u == null) {
                    this.f158712u = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                if (this.f158712u.getVisibility() != 0) {
                    this.f158712u.setVisibility(0);
                }
                v0.a(this.f158712u, bitmapDrawableA, this.f158694c.getResources().getDisplayMetrics());
                if (this.f158712u.getParent() == null) {
                    this.f158694c.addView(this.f158712u, new ViewGroup.LayoutParams(-1, -1));
                }
                AdSession adSession = this.f158714w;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(this.f158712u, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    public void g() {
        MBSplashView mBSplashView;
        Handler handler;
        this.f158711t = true;
        if (this.f158694c != null && this.f158703l > 0 && (handler = this.f158716y) != null) {
            handler.removeMessages(1);
            View splashWebview = this.f158694c.getSplashWebview();
            if (splashWebview == null) {
                splashWebview = this.f158694c.getSplashNativeView();
            }
            CampaignEx campaignEx = this.f158693b;
            if (campaignEx != null ? com.mbridge.msdk.foundation.tools.h.b(campaignEx, null, splashWebview, campaignEx.getImpReportType()) : true) {
                this.f158716y.sendEmptyMessageDelayed(1, 1000L);
            }
        }
        if (com.mbridge.msdk.foundation.feedback.b.f156248f || (mBSplashView = this.f158694c) == null) {
            return;
        }
        mBSplashView.onResume();
        MBSplashWebview splashWebview2 = this.f158694c.getSplashWebview();
        if (splashWebview2 == null || splashWebview2.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.splash.signal.c.a(splashWebview2, "onSystemPause", "");
    }

    public void h() {
        if (this.f158695d != null) {
            this.f158695d = null;
        }
        if (this.f158713v != null) {
            this.f158713v = null;
        }
        if (this.f158715x != null) {
            this.f158715x = null;
        }
        MBSplashView mBSplashView = this.f158694c;
        if (mBSplashView != null) {
            mBSplashView.destroy();
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f158700i);
    }

    private void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            String strI = com.mbridge.msdk.foundation.controller.c.n().i();
            int identifier = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip", x.b.f238264e, strI);
            int identifier2 = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip_not", x.b.f238264e, strI);
            int identifier3 = contextD.getResources().getIdentifier("mbridge_splash_count_time_can_skip_s", x.b.f238264e, strI);
            this.f158705n = contextD.getResources().getString(identifier);
            String string = contextD.getResources().getString(identifier2);
            this.f158707p = string;
            this.f158704m = string;
            this.f158706o = contextD.getResources().getString(identifier3);
            this.f158698g.setBackgroundResource(contextD.getResources().getIdentifier("mbridge_splash_close_bg", AppIntroBaseFragmentKt.ARG_DRAWABLE, com.mbridge.msdk.foundation.controller.c.n().i()));
            this.f158698g.setTextColor(contextD.getResources().getColor(contextD.getResources().getIdentifier("mbridge_splash_count_time_skip_text_color", "color", strI)));
        }
    }

    public void c(int i10) {
        this.f158703l = i10;
    }

    public String d() {
        CampaignEx campaignEx = this.f158693b;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.f158693b.getRequestId();
    }

    public void f() {
        Handler handler;
        this.f158711t = false;
        if (this.f158694c != null && this.f158703l > 0 && (handler = this.f158716y) != null) {
            handler.removeMessages(1);
        }
        MBSplashView mBSplashView = this.f158694c;
        if (mBSplashView != null) {
            mBSplashView.onPause();
            MBSplashWebview splashWebview = this.f158694c.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.splash.signal.c.a(splashWebview, "onSystemPause", "");
        }
    }

    public String c() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.f158693b;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx.isHasMBTplMark()) {
            return;
        }
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f158700i);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f158700i, campaignEx, "splash");
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f158700i);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f158700i);
    }

    public void a(com.mbridge.msdk.splash.middle.d dVar) {
        this.f158695d = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i10) {
        MBSplashView mBSplashView = this.f158694c;
        if (mBSplashView != null) {
            mBSplashView.updateCountdown(i10);
            if (this.f158694c.getSplashSignalCommunicationImpl() != null) {
                this.f158694c.getSplashSignalCommunicationImpl().c(i10);
            }
        }
        if (i10 < 0) {
            this.f158703l = i10;
            return;
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f158695d;
        if (dVar != null) {
            dVar.a(this.f158702k, i10 * 1000);
        }
        if (this.f158699h == null) {
            j();
        }
    }

    public void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.f158715x);
        }
        this.f158699h = viewGroup;
    }

    private void c(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    CampaignEx campaignEx2 = campaignEx;
                    Context context2 = context;
                    String str2 = str;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, str2, it.next(), false, true);
                    context = context2;
                    campaignEx = campaignEx2;
                    str = str2;
                }
            } catch (Throwable th) {
                q0.b("SplashShowManager", th.getMessage());
            }
        }
    }

    public void a(CampaignEx campaignEx, MBSplashView mBSplashView) {
        a(this.f158697f);
        this.f158693b = campaignEx;
        this.f158694c = mBSplashView;
        com.mbridge.msdk.splash.signal.b splashSignalCommunicationImpl = mBSplashView.getSplashSignalCommunicationImpl();
        com.mbridge.msdk.splash.signal.b bVar = splashSignalCommunicationImpl;
        if (splashSignalCommunicationImpl == null) {
            com.mbridge.msdk.splash.signal.b bVar2 = new com.mbridge.msdk.splash.signal.b(mBSplashView.getContext(), this.f158701j, this.f158700i);
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            bVar2.a(arrayList);
            bVar = bVar2;
        }
        bVar.b(this.f158703l);
        bVar.a(this.f158697f ? 1 : 0);
        if (this.f158713v == null) {
            this.f158713v = new i(this, null);
        }
        bVar.a(this.f158713v);
        mBSplashView.setSplashSignalCommunicationImpl(bVar);
        boolean zIsHasMBTplMark = campaignEx.isHasMBTplMark();
        View view = this.f158699h;
        if (view == null) {
            if (zIsHasMBTplMark) {
                this.f158698g.setVisibility(8);
            }
            j();
            a(this.f158698g);
            mBSplashView.setCloseView(this.f158698g);
        } else {
            if (zIsHasMBTplMark) {
                view.setVisibility(8);
            }
            a(this.f158699h);
            mBSplashView.setCloseView(this.f158699h);
        }
        b1.a(mBSplashView.getSplashWebview() != null ? mBSplashView.getSplashWebview() : mBSplashView.getSplashNativeView(), this.f158693b.getLocalRequestId(), this.f158693b.getLocalAllowTrackClick(), mBSplashView.getAllowClickSplashTouchListener());
        mBSplashView.show(campaignEx);
        this.f158717z = true;
        k();
    }

    public class d implements com.mbridge.msdk.foundation.feedback.a {
        public d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            b.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                q0.b("SplashShowManager", th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f158694c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            b.this.g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                q0.b("SplashShowManager", th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f158694c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            b.this.g();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                q0.b("SplashShowManager", th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) b.this.f158694c.getSplashWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public void b(int i10) {
        CampaignEx campaignEx;
        MBSplashWebview splashWebview;
        MBSplashView mBSplashView = this.f158694c;
        if (mBSplashView != null && (splashWebview = mBSplashView.getSplashWebview()) != null) {
            splashWebview.finishAdSession();
        }
        if (this.f158716y != null && (campaignEx = this.f158693b) != null && campaignEx.isActiveOm()) {
            this.f158716y.postDelayed(new f(i10), 1500L);
        } else {
            a(i10);
        }
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f154113n);
            } catch (Throwable th) {
                q0.b("SplashShowManager", th.getMessage());
            }
        }
    }

    public void b() {
        MBSplashView mBSplashView;
        Context context;
        CampaignEx campaignEx = this.f158693b;
        if (campaignEx == null || campaignEx.getPrivacyButtonTemplateVisibility() != 1 || (mBSplashView = this.f158694c) == null || mBSplashView.getSplashWebview() == null || this.f158694c.isDynamicView() || !this.f158693b.isMraid() || (context = this.f158694c.getContext()) == null) {
            return;
        }
        try {
            int iA = i0.a(context, "mbridge_splash_notice", AppIntroBaseFragmentKt.ARG_DRAWABLE);
            int iA2 = v0.a(context, 35.0f);
            int iA3 = v0.a(context, 9.0f);
            ImageView imageView = new ImageView(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA2, iA2);
            layoutParams.addRule(9);
            layoutParams.addRule(10);
            layoutParams.setMargins(iA3, iA3, iA3, iA3);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackgroundResource(iA);
            v0.a(3, imageView, this.f158693b, context, true, new h());
            this.f158694c.addView(imageView);
        } catch (Throwable th) {
            q0.b("SplashShowManager", th.getMessage());
        }
    }

    private void a() {
        RelativeLayout.LayoutParams layoutParams;
        CampaignEx campaignEx = this.f158693b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f158700i);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f158700i, 3);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f158700i, this.f158693b);
        }
        if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
            MBSplashView mBSplashView = this.f158694c;
            if (mBSplashView == null || !mBSplashView.isDynamicView()) {
                com.mbridge.msdk.foundation.feedback.b.b().a(this.f158700i, new d());
                FeedBackButton feedBackButtonA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f158700i);
                if (feedBackButtonA != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) feedBackButtonA.getLayoutParams();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        layoutParams = null;
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f156247e, com.mbridge.msdk.foundation.feedback.b.f156246d);
                    }
                    layoutParams.topMargin = com.mbridge.msdk.advanced.signal.c.a(10.0f);
                    layoutParams.leftMargin = com.mbridge.msdk.advanced.signal.c.a(10.0f);
                    ViewGroup viewGroup = (ViewGroup) feedBackButtonA.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(feedBackButtonA);
                    }
                    MBSplashView mBSplashView2 = this.f158694c;
                    if (mBSplashView2 != null) {
                        mBSplashView2.addView(feedBackButtonA, layoutParams);
                    }
                }
            }
        }
    }

    private void a(CampaignEx campaignEx) {
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f158700i);
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f158700i);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f158700i);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f158700i, campaignEx, "splash");
    }

    private void a(String str) {
        com.mbridge.msdk.splash.middle.d dVar = this.f158695d;
        if (dVar != null) {
            dVar.a(this.f158702k, "web show failed:" + str);
        }
        MBSplashView mBSplashView = this.f158694c;
        if (mBSplashView == null || mBSplashView.getParent() == null || !(this.f158694c.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.f158694c.getParent()).removeView(this.f158694c);
    }

    public void a(boolean z10) {
        this.f158697f = z10;
        if (z10) {
            this.f158704m = this.f158705n;
        } else {
            this.f158704m = this.f158707p;
        }
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
        if (this.f158696e == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f158700i);
            this.f158696e = aVar;
            aVar.a(this.f158691A);
        }
        campaignEx.setCampaignUnitId(this.f158700i);
        this.f158696e.a(campaignEx);
        if (!this.f158693b.isReportClick()) {
            this.f158693b.setReportClick(true);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f158695d;
        if (dVar != null) {
            dVar.a(this.f158702k);
            b(3);
        }
        if (!z10 || TextUtils.isEmpty(str)) {
            return;
        }
        com.mbridge.msdk.splash.report.a.a(campaignEx, this.f158700i, str);
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f158715x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        MBSplashView mBSplashView;
        try {
            com.mbridge.msdk.splash.middle.d dVar = this.f158695d;
            if (dVar != null) {
                dVar.a(this.f158702k, i10);
                this.f158695d = null;
                com.mbridge.msdk.splash.report.a.a(this.f158700i, this.f158693b);
            }
            ImageView imageView = this.f158712u;
            if (imageView != null && imageView.getParent() != null && (mBSplashView = this.f158694c) != null) {
                mBSplashView.removeView(this.f158712u);
                this.f158712u.setVisibility(8);
            }
            this.f158709r = false;
            com.mbridge.msdk.splash.report.a.a(this.f158700i, i10, this.f158693b);
            Handler handler = this.f158716y;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Exception e10) {
            q0.b("SplashShowManager", e10.getMessage());
        }
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        com.mbridge.msdk.foundation.controller.c.n().a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new g(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f154112m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }
}

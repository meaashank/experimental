package com.mbridge.msdk.video.module;

import B0.z;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.C1477d;
import androidx.appcompat.widget.e0;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewParameters;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBAlertDialog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import s0.x;

/* JADX INFO: loaded from: classes5.dex */
public class MBridgeVideoView extends MBridgeBaseView implements com.mbridge.msdk.video.signal.j {

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private static int f160897R0 = 0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private static int f160898S0 = 0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private static int f160899T0 = 0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private static int f160900U0 = 0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private static int f160901V0 = 0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private static boolean f160902W0 = false;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private static long f160903X0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f160904A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private int f160905A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private FrameLayout f160906B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private int f160907B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private MBridgeClickCTAView f160908C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private int f160909C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.factory.b f160910D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private AcquireRewardPopViewParameters f160911D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f160912E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private MBAcquireRewardPopView f160913E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f160914F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private boolean f160915F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private RelativeLayout f160916G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private RelativeLayout f160917G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f160918H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private CollapsibleWebView f160919H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f160920I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private RelativeLayout f160921I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f160922J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private boolean f160923J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private String f160924K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private int f160925K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f160926L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private boolean f160927L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f160928M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private boolean f160929M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f160930N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private w f160931N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private MBAlertDialog f160932O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private boolean f160933O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private com.mbridge.msdk.widget.dialog.b f160934P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private Runnable f160935P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private String f160936Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private final Runnable f160937Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private double f160938R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private double f160939S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f160940T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f160941U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f160942V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f160943W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f160944a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f160945b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f160946c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f160947d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f160948e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f160949f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f160950g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f160951h0;
    public boolean hasBufferTimeout;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private AdSession f160952i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private MediaEvents f160953j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private String f160954k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private int f160955l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextView f160956m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f160957m0;
    public List<CampaignEx> mCampOrderViewData;
    public int mCampaignSize;
    public int mCurrPlayNum;
    public int mCurrentPlayProgressTime;
    public int mMuteSwitch;
    public PlayerView mPlayerView;
    public SoundImageView mSoundImageView;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f160958n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private int f160959n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RelativeLayout f160960o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f160961o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ImageView f160962p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f160963p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ProgressBar f160964q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f160965q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private FeedBackButton f160966r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f160967r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ImageView f160968s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f160969s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private MBridgeSegmentsProgressBar f160970t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f160971t0;
    public TextView tvFlag;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.mbridge.msdk.video.module.listener.a f160972u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f160973u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private u f160974v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean f160975v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f160976w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f160977w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.a f160978x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private AlphaAnimation f160979x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.f f160980y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private MBridgeBaitClickView f160981y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f160982z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f160983z0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeVideoView.this.f160947d0 = true;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f160985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f160986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f160987c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f160988d;

        public b(int i10, int i11, int i12, int i13) {
            this.f160985a = i10;
            this.f160986b = i11;
            this.f160987c = i12;
            this.f160988d = i13;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBridgeVideoView.this.f160960o == null) {
                return;
            }
            MBridgeVideoView.this.f160960o.setVisibility(0);
            CampaignEx campaignEx = MBridgeVideoView.this.f160707b;
            if (campaignEx == null || campaignEx.getAdSpaceT() == 2) {
                return;
            }
            MBridgeVideoView.this.f160960o.setPadding(this.f160985a, this.f160986b, this.f160987c, this.f160988d);
            MBridgeVideoView.this.f160960o.startAnimation(MBridgeVideoView.this.f160979x0);
        }
    }

    public class c implements com.mbridge.msdk.foundation.same.image.c {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bitmap f160991a;

            /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$c$a$a, reason: collision with other inner class name */
            public class RunnableC0649a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Bitmap f160993a;

                public RunnableC0649a(Bitmap bitmap) {
                    this.f160993a = bitmap;
                }

                @Override // java.lang.Runnable
                public void run() {
                    MBridgeVideoView.this.f160962p.setVisibility(0);
                    MBridgeVideoView.this.f160962p.setImageBitmap(this.f160993a);
                }
            }

            public a(Bitmap bitmap) {
                this.f160991a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    MBridgeVideoView.this.f160962p.post(new RunnableC0649a(a0.a(this.f160991a, 10)));
                } catch (Exception e10) {
                    q0.b(MBridgeBaseView.TAG, e10.getMessage());
                }
            }
        }

        public c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b(MBridgeBaseView.TAG, str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled() || MBridgeVideoView.this.f160962p == null) {
                        return;
                    }
                    com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new a(bitmap));
                } catch (Throwable th) {
                    q0.b(MBridgeBaseView.TAG, th.getMessage());
                }
            }
        }
    }

    public class d implements CollapsibleWebView.e {
        public d() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.e
        public void a(View view, Map<String, String> map) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.e
        public void b(View view, Map<String, String> map) {
            String str;
            String str2;
            str = "";
            if (map != null) {
                String str3 = map.get("url");
                str = str3 != null ? str3 : "";
                str2 = map.get("description");
            } else {
                str2 = "";
            }
            a(str, str2);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.e
        public void a(View view, String str) {
            JSONObject jSONObject;
            if (MBridgeVideoView.this.f160923J0) {
                return;
            }
            MBridgeVideoView.this.f160923J0 = true;
            if (MBridgeVideoView.this.f160917G0 != null && MBridgeVideoView.this.f160917G0.getVisibility() != 0) {
                MBridgeVideoView.this.f160917G0.setVisibility(0);
            }
            Context context = MBridgeVideoView.this.getContext();
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            com.mbridge.msdk.click.a.a(context, mBridgeVideoView.f160707b, mBridgeVideoView.getUnitId(), MBridgeVideoView.this.f160707b.getNoticeUrl(), true, false, com.mbridge.msdk.click.retry.a.f154114o);
            try {
                MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                new com.mbridge.msdk.click.a(mBridgeVideoView2.f160706a, mBridgeVideoView2.f160936Q).c(MBridgeVideoView.this.f160707b);
            } catch (Exception unused) {
            }
            com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d().getApplicationContext(), MBridgeVideoView.this.f160707b);
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(R9.c.f67796d, 1);
            if (MBridgeVideoView.this.f160972u != null) {
                try {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put(com.mbridge.msdk.foundation.same.a.f156326j, MBridgeVideoView.this.a(0));
                    } catch (JSONException e10) {
                        e = e10;
                        e.printStackTrace();
                    }
                } catch (JSONException e11) {
                    e = e11;
                    jSONObject = null;
                }
                MBridgeVideoView.this.f160972u.a(131, jSONObject);
                MBridgeVideoView.this.f160707b.setClickType(1);
                MBridgeVideoView.this.f160707b.setClickTempSource(1);
                MBridgeVideoView.this.f160707b.setTriggerClickSource(2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000149", MBridgeVideoView.this.f160707b);
                eVar.a("type", 9);
                ArrayList arrayList = new ArrayList();
                arrayList.add("web_view");
                eVar.a("click_path", arrayList.toString());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000150", MBridgeVideoView.this.f160707b, eVar);
            }
            eVar.a("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_webview_render", MBridgeVideoView.this.f160707b, eVar);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.e
        public void b(View view, String str) {
            a(str, Jb.d.f58184l);
        }

        private void a(String str, String str2) {
            if (MBridgeVideoView.this.f160923J0) {
                return;
            }
            MBridgeVideoView.this.f160923J0 = true;
            if (str == null) {
                str = "";
            }
            if (MBridgeVideoView.this.f160917G0 != null && MBridgeVideoView.this.f160917G0.getVisibility() == 0) {
                MBridgeVideoView.this.f160917G0.setVisibility(8);
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(R9.c.f67796d, 2);
            eVar.a("url", str);
            eVar.a("reason", str2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_webview_render", MBridgeVideoView.this.f160707b, eVar);
        }
    }

    public class e extends WebViewClient {
        public e() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            q0.b(MBridgeBaseView.TAG, "WebView called onRenderProcessGone");
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    if (webView instanceof WindVaneWebView) {
                        ((WindVaneWebView) webView).release();
                    } else {
                        webView.destroy();
                    }
                } catch (Throwable th) {
                    q0.b(MBridgeBaseView.TAG, th.getMessage());
                }
            }
            return true;
        }
    }

    public class f implements CommonWebView.h {
        public f() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.h
        public void a() {
            if (MBridgeVideoView.this.f160921I0 != null) {
                MBridgeVideoView.this.f160921I0.setVisibility(0);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("status", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_webview_zoom", MBridgeVideoView.this.f160707b, eVar);
            }
            if (MBridgeVideoView.this.f160919H0 != null) {
                MBridgeVideoView.this.f160919H0.setCustomizedToolBarMarginWidthPixel(0, 0, 0, 0);
            }
            MBridgeVideoView.this.p();
        }
    }

    public class g implements CommonWebView.h {
        public g() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.h
        public void a() {
            if (MBridgeVideoView.this.f160921I0 != null) {
                MBridgeVideoView.this.f160921I0.setVisibility(8);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("status", 2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_webview_zoom", MBridgeVideoView.this.f160707b, eVar);
            }
            if (MBridgeVideoView.this.f160919H0 != null) {
                MBridgeVideoView.this.f160919H0.setCustomizedToolBarMarginWidthPixel(0, MBridgeVideoView.this.f160925K0, 0, 0);
            }
            MBridgeVideoView.this.o();
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeVideoView.this.f160921I0 != null) {
                MBridgeVideoView.this.f160921I0.setVisibility(0);
            }
            if (MBridgeVideoView.this.f160917G0 != null) {
                MBridgeVideoView.this.f160917G0.setVisibility(8);
            }
            if (MBridgeVideoView.this.f160969s0) {
                return;
            }
            MBridgeVideoView.this.p();
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            if (mBridgeVideoView.notifyListener != null) {
                mBridgeVideoView.f160707b.setTriggerClickSource(2);
                MBridgeVideoView.this.b("bait_click_clicked");
            }
        }
    }

    public class j implements AcquireRewardPopViewBehaviourListener {
        public j() {
        }

        @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
        public void onOutOfContentClicked(float f10, float f11) {
            if (MBridgeVideoView.this.f160972u != null) {
                MBridgeVideoView.this.f160972u.a(105, "");
            }
        }

        @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
        public void onReceivedFail(String str) {
            MBridgeVideoView.this.f160922J = false;
            if (com.mbridge.msdk.util.b.b()) {
                MBridgeVideoView.this.setCover(false);
            }
            MBridgeVideoView.this.p();
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            com.mbridge.msdk.foundation.same.report.j.a(mBridgeVideoView.f160707b, mBridgeVideoView.f160936Q, MBridgeVideoView.this.f160983z0, 2, str);
        }

        @Override // com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewBehaviourListener
        public void onReceivedSuccess(int i10) {
            MBridgeVideoView.this.f160922J = false;
            if (com.mbridge.msdk.util.b.b()) {
                MBridgeVideoView.this.setCover(false);
            }
            int videoCompleteTime = MBridgeVideoView.this.getVideoCompleteTime() - i10;
            MBridgeVideoView.this.f160707b.setVideoCompleteTime(videoCompleteTime);
            MBridgeVideoView.this.p();
            com.mbridge.msdk.video.module.listener.a aVar = MBridgeVideoView.this.notifyListener;
            if (aVar != null) {
                aVar.a(130, Integer.valueOf(videoCompleteTime));
            }
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            com.mbridge.msdk.foundation.same.report.j.a(mBridgeVideoView.f160707b, mBridgeVideoView.f160936Q, MBridgeVideoView.this.f160983z0, 1, "");
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBridgeVideoView.this.f160906B != null) {
                MBridgeVideoView.this.f160906B.setVisibility(8);
            }
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBridgeVideoView.this.f160905A0 <= 0) {
                MBridgeVideoView.this.showRewardPopView();
                MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                mBridgeVideoView.removeCallbacks(mBridgeVideoView.f160937Q0);
            } else {
                MBridgeVideoView.W(MBridgeVideoView.this);
                MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                mBridgeVideoView2.postDelayed(mBridgeVideoView2.f160937Q0, 1000L);
            }
        }
    }

    public class n implements PlayerView.OnPlayerViewVisibleListener {
        public n() {
        }

        @Override // com.mbridge.msdk.playercommon.PlayerView.OnPlayerViewVisibleListener
        public void playerViewVisibleCallback() {
            if (MBridgeVideoView.this.f160976w) {
                return;
            }
            MBridgeVideoView.this.f160976w = true;
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            if (mBridgeVideoView.notifyListener == null || mBridgeVideoView.f160974v == null) {
                return;
            }
            MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
            mBridgeVideoView2.notifyListener.a(20, mBridgeVideoView2.f160974v);
        }
    }

    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeVideoView.this.notifyListener != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.mbridge.msdk.foundation.same.a.f156326j, MBridgeVideoView.this.mPlayerView.buildH5JsonObject(0));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                MBridgeVideoView.this.f160707b.setClickTempSource(1);
                MBridgeVideoView.this.f160707b.setTriggerClickSource(2);
                MBridgeVideoView.this.notifyListener.a(1, jSONObject);
            }
            if (MBridgeVideoView.this.f160953j0 != null) {
                try {
                    MBridgeVideoView.this.f160953j0.adUserInteraction(InteractionType.CLICK);
                    q0.a("omsdk", "play video view:  click");
                } catch (Exception e11) {
                    q0.b("omsdk", e11.getMessage());
                }
            }
            MBridgeVideoView.this.setCTALayoutVisibleOrGone();
        }
    }

    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoView.this.f160707b.setClickTempSource(1);
            MBridgeVideoView.this.f160707b.setTriggerClickSource(2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_player_click", MBridgeVideoView.this.f160707b);
            if (MBridgeVideoView.this.notifyListener != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.mbridge.msdk.foundation.same.a.f156326j, MBridgeVideoView.this.mPlayerView.buildH5JsonObject(0));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                MBridgeVideoView.this.notifyListener.a(1, jSONObject);
            }
        }
    }

    public class q implements View.OnClickListener {
        public q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            Integer num = 2;
            PlayerView playerView = MBridgeVideoView.this.mPlayerView;
            if (playerView != null) {
                eVar.a("mute_state", Boolean.valueOf(playerView.isSilent()));
                if (MBridgeVideoView.this.mPlayerView.isSilent()) {
                    num = 1;
                }
            }
            if (num.intValue() == 1) {
                MBridgeVideoView.this.mMuteSwitch = 2;
            } else {
                MBridgeVideoView.this.mMuteSwitch = 1;
            }
            com.mbridge.msdk.video.module.listener.a aVar = MBridgeVideoView.this.notifyListener;
            if (aVar != null) {
                aVar.a(5, num);
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_sound_click", MBridgeVideoView.this.f160707b, eVar);
        }
    }

    public class r implements View.OnClickListener {
        public r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000148", MBridgeVideoView.this.f160707b, eVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
            if (!MBridgeVideoView.this.f160950g0) {
                CampaignEx campaignEx = MBridgeVideoView.this.f160707b;
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || MBridgeVideoView.this.f160707b.getRewardTemplateMode().k() != 5002010 || !MBridgeVideoView.this.f160969s0) {
                    MBridgeVideoView.this.y();
                    return;
                }
                MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                if (mBridgeVideoView.notifyListener != null) {
                    mBridgeVideoView.f160927L0 = true;
                    MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                    mBridgeVideoView2.notifyListener.a(2, mBridgeVideoView2.c(mBridgeVideoView2.f160969s0));
                    return;
                }
                return;
            }
            MBridgeVideoView.this.f160975v0 = true;
            CampaignEx campaignEx2 = MBridgeVideoView.this.f160707b;
            if (campaignEx2 != null && campaignEx2.getRewardTemplateMode() != null && MBridgeVideoView.this.f160707b.getRewardTemplateMode().k() == 5002010 && MBridgeVideoView.this.f160969s0) {
                MBridgeVideoView mBridgeVideoView3 = MBridgeVideoView.this;
                if (mBridgeVideoView3.notifyListener != null) {
                    mBridgeVideoView3.f160927L0 = true;
                    MBridgeVideoView mBridgeVideoView4 = MBridgeVideoView.this;
                    mBridgeVideoView4.notifyListener.a(2, mBridgeVideoView4.c(mBridgeVideoView4.f160969s0));
                    return;
                }
                return;
            }
            if (MBridgeVideoView.this.f160967r0) {
                MBridgeVideoView.this.y();
                return;
            }
            com.mbridge.msdk.video.module.listener.a aVar = MBridgeVideoView.this.notifyListener;
            if (aVar != null) {
                aVar.a(123, "");
            }
        }
    }

    public class s implements com.mbridge.msdk.widget.dialog.b {
        public s() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            MBridgeVideoView.this.f160920I = false;
            MBridgeVideoView.this.f160965q0 = true;
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.f160920I);
            MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
            com.mbridge.msdk.foundation.same.report.j.a(mBridgeVideoView2.f160706a, mBridgeVideoView2.f160707b, mBridgeVideoView2.f160954k0, MBridgeVideoView.this.f160936Q, 1, 1, 1);
            if (MBridgeVideoView.this.f160950g0 && MBridgeVideoView.this.f160955l0 == com.mbridge.msdk.foundation.same.a.f156297H) {
                MBridgeVideoView mBridgeVideoView3 = MBridgeVideoView.this;
                if (mBridgeVideoView3.notifyListener != null) {
                    mBridgeVideoView3.f160927L0 = true;
                    MBridgeVideoView mBridgeVideoView4 = MBridgeVideoView.this;
                    mBridgeVideoView4.notifyListener.a(2, mBridgeVideoView4.c(mBridgeVideoView4.f160969s0));
                    return;
                }
                return;
            }
            if (MBridgeVideoView.this.f160950g0 && MBridgeVideoView.this.f160955l0 == com.mbridge.msdk.foundation.same.a.f156298I) {
                MBridgeVideoView.this.p();
                return;
            }
            MBridgeVideoView mBridgeVideoView5 = MBridgeVideoView.this;
            if (mBridgeVideoView5.notifyListener != null) {
                mBridgeVideoView5.f160927L0 = true;
                MBridgeVideoView.this.notifyListener.a(2, "");
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            MBridgeVideoView.this.f160920I = false;
            MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
            mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.f160920I);
            if (MBridgeVideoView.this.f160950g0 && (MBridgeVideoView.this.f160955l0 == com.mbridge.msdk.foundation.same.a.f156298I || MBridgeVideoView.this.f160955l0 == com.mbridge.msdk.foundation.same.a.f156297H)) {
                MBridgeVideoView.this.f160963p0 = true;
                com.mbridge.msdk.video.module.listener.a aVar = MBridgeVideoView.this.notifyListener;
                if (aVar != null) {
                    aVar.a(124, "");
                }
                MBridgeVideoView.this.f160973u0 = true;
                MBridgeVideoView.this.gonePlayingCloseView();
            }
            MBridgeVideoView.this.p();
            MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
            com.mbridge.msdk.foundation.same.report.j.a(mBridgeVideoView2.f160706a, mBridgeVideoView2.f160707b, mBridgeVideoView2.f160954k0, MBridgeVideoView.this.f160936Q, 1, 0, 1);
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
        }
    }

    public class t implements com.mbridge.msdk.foundation.feedback.a {
        public t() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            MBridgeVideoView.this.o();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            MBridgeVideoView.this.p();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            MBridgeVideoView.this.p();
        }
    }

    public interface u {
        void a();
    }

    public static class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f161016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f161017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f161018c;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ProgressData{curPlayPosition=");
            sb2.append(this.f161016a);
            sb2.append(", allDuration=");
            return C1477d.a(sb2, this.f161017b, '}');
        }
    }

    public static final class w extends DefaultVideoPlayerStatusListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeVideoView f161019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f161020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f161021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f161022d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f161023e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private MediaEvents f161024f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f161029k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f161030l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private CampaignEx f161031m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f161032n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f161033o;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private v f161025g = new v();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f161026h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f161027i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f161028j = false;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f161034p = false;

        public w(MBridgeVideoView mBridgeVideoView) {
            this.f161019a = mBridgeVideoView;
            if (mBridgeVideoView != null) {
                this.f161030l = mBridgeVideoView.getUnitId();
                this.f161031m = mBridgeVideoView.getCampaign();
            }
        }

        private void c() {
            int i10;
            CampaignEx campaignEx;
            String str;
            if (!s0.a().a("h_c_r_w_p_c", false) || (i10 = this.f161032n) == 100 || this.f161033o != 0 || this.f161034p || i10 == 0 || (campaignEx = this.f161031m) == null) {
                return;
            }
            try {
                if (campaignEx.getAdType() == 94 || this.f161031m.getAdType() == 287) {
                    str = this.f161031m.getRequestId() + this.f161031m.getId() + this.f161031m.getVideoUrlEncode();
                } else {
                    str = this.f161031m.getId() + this.f161031m.getVideoUrlEncode() + this.f161031m.getBidToken();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f161030l, str);
                if (aVarA != null) {
                    aVarA.A();
                    this.f161034p = true;
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultVideoPlayerStatusListener", "CDRate is : 0  and start download when player create!");
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("DefaultVideoPlayerStatusListener", e10.getMessage());
                }
            }
        }

        private void e() {
            MBridgeVideoView mBridgeVideoView = this.f161019a;
            if (mBridgeVideoView == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mBridgeVideoView.f160956m.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = com.mbridge.msdk.advanced.signal.c.a(25.0f);
                this.f161019a.f160956m.setLayoutParams(layoutParams);
            }
            int iA = com.mbridge.msdk.advanced.signal.c.a(5.0f);
            this.f161019a.f160956m.setPadding(iA, 0, iA, 0);
        }

        public int b() {
            return this.f161022d;
        }

        public void d() {
            this.f161019a = null;
            boolean unused = MBridgeVideoView.f160902W0 = false;
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                MediaEvents mediaEvents = this.f161024f;
                if (mediaEvents != null) {
                    mediaEvents.bufferFinish();
                    q0.a("omsdk", "play:  videoEvents.bufferFinish()");
                }
                this.f161019a.notifyListener.a(14, "");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                if (this.f161024f != null) {
                    q0.a("omsdk", "play:  videoEvents.bufferStart()");
                    this.f161024f.bufferStart();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingTimeOut(String str) {
            try {
                MBridgeVideoView mBridgeVideoView = this.f161019a;
                mBridgeVideoView.hasBufferTimeout = true;
                mBridgeVideoView.notifyListener.a(13, "");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayCompleted() {
            MBridgeVideoView mBridgeVideoView;
            super.onPlayCompleted();
            this.f161019a.f160969s0 = true;
            CampaignEx campaignEx = this.f161031m;
            if (campaignEx != null) {
                if (this.f161029k && campaignEx.getRewardTemplateMode() != null && this.f161031m.getRewardTemplateMode().k() == 5002010) {
                    this.f161019a.f160956m.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                } else {
                    this.f161019a.f160956m.setText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_complete", x.b.f238264e));
                }
                this.f161031m.setVideoPlayProgress(100);
                if (this.f161031m.getAdSpaceT() == 2) {
                    this.f161019a.f160958n.setVisibility(4);
                    if (this.f161019a.f160966r != null) {
                        this.f161019a.f160966r.setClickable(false);
                    }
                    SoundImageView soundImageView = this.f161019a.mSoundImageView;
                    if (soundImageView != null) {
                        soundImageView.setClickable(false);
                    }
                }
            } else {
                this.f161019a.f160956m.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
            }
            MediaEvents mediaEvents = this.f161024f;
            if (mediaEvents != null) {
                mediaEvents.complete();
                q0.a("omsdk", "play:  videoEvents.complete()");
            }
            this.f161019a.mPlayerView.setClickable(false);
            String strC = this.f161019a.c(true);
            CampaignEx campaignEx2 = this.f161031m;
            if (campaignEx2 != null && campaignEx2.getRewardTemplateMode() != null && this.f161031m.getRewardTemplateMode().k() == 5002010) {
                this.f161019a.x();
            }
            CampaignEx campaignEx3 = this.f161031m;
            if (campaignEx3 != null && campaignEx3.getDynamicTempCode() == 5 && (mBridgeVideoView = this.f161019a) != null && mBridgeVideoView.f160978x != null) {
                MBridgeVideoView mBridgeVideoView2 = this.f161019a;
                if (mBridgeVideoView2.mCampaignSize > mBridgeVideoView2.mCurrPlayNum) {
                    HashMap map = new HashMap();
                    map.put(W3.o.f76584m, Integer.valueOf(this.f161019a.mCurrPlayNum));
                    int i10 = this.f161019a.mMuteSwitch;
                    if (i10 != 0) {
                        map.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, Integer.valueOf(i10));
                    }
                    this.f161019a.f160978x.a(map);
                    return;
                }
            }
            MBridgeVideoView mBridgeVideoView3 = this.f161019a;
            if (mBridgeVideoView3 != null) {
                mBridgeVideoView3.notifyListener.a(121, "");
                this.f161019a.notifyListener.a(11, strC);
            }
            int i11 = this.f161021c;
            this.f161020b = i11;
            this.f161019a.mCurrentPlayProgressTime = i11;
            boolean unused = MBridgeVideoView.f160902W0 = true;
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayError(String str) {
            com.mbridge.msdk.activity.a.a("errorStr", str, "DefaultVideoPlayerStatusListener");
            super.onPlayError(str);
            MBridgeVideoView mBridgeVideoView = this.f161019a;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.notifyListener.a(12, str);
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayProgress(int i10, int i11) {
            CampaignEx campaignEx;
            int videoCompleteTime;
            super.onPlayProgress(i10, i11);
            if (MBridgeVideoView.f160903X0 == 0) {
                long unused = MBridgeVideoView.f160903X0 = System.currentTimeMillis();
            }
            if (!this.f161019a.f160929M0 && this.f161019a.f160980y != null) {
                this.f161019a.f160929M0 = true;
                this.f161019a.f160980y.a();
            }
            if (this.f161019a.f160710e) {
                CampaignEx campaignEx2 = this.f161031m;
                if (campaignEx2 != null) {
                    videoCompleteTime = campaignEx2.getVideoCompleteTime();
                    if (videoCompleteTime <= 0) {
                        videoCompleteTime = i11;
                    }
                    com.mbridge.msdk.foundation.feedback.b.b().b(this.f161031m.getCampaignUnitId() + "_1", i10);
                } else {
                    videoCompleteTime = 0;
                }
                CampaignEx campaignEx3 = this.f161031m;
                if (campaignEx3 != null && campaignEx3.isDynamicView() && this.f161031m.getDynamicTempCode() == 5) {
                    try {
                        b(videoCompleteTime, this.f161019a.f160982z, i10);
                    } catch (Exception e10) {
                        q0.b("DefaultVideoPlayerStatusListener", e10.getMessage());
                    }
                } else {
                    a(videoCompleteTime, i11, i10);
                    this.f161025g.f161016a = i10;
                }
            }
            this.f161021c = i11;
            v vVar = this.f161025g;
            vVar.f161017b = i11;
            vVar.f161018c = this.f161019a.f160973u0;
            this.f161020b = i10;
            if (this.f161019a.f160968s != null) {
                this.f161019a.f160968s.setTag("" + this.f161020b);
            }
            MBridgeVideoView mBridgeVideoView = this.f161019a;
            mBridgeVideoView.mCurrentPlayProgressTime = i10;
            mBridgeVideoView.notifyListener.a(15, this.f161025g);
            MediaEvents mediaEvents = this.f161024f;
            if (mediaEvents != null) {
                int i12 = (i10 * 100) / i11;
                int i13 = ((i10 + 1) * 100) / i11;
                if (i12 <= 25 && 25 < i13 && !this.f161026h) {
                    this.f161026h = true;
                    mediaEvents.firstQuartile();
                    q0.a("omsdk", "play:  videoEvents.firstQuartile()");
                } else if (i12 <= 50 && 50 < i13 && !this.f161027i) {
                    this.f161027i = true;
                    mediaEvents.midpoint();
                    q0.a("omsdk", "play:  videoEvents.midpoint()");
                } else if (i12 <= 75 && 75 < i13 && !this.f161028j) {
                    this.f161028j = true;
                    mediaEvents.thirdQuartile();
                    q0.a("omsdk", "play:  videoEvents.thirdQuartile()");
                }
            }
            if (this.f161019a.f160950g0 && !this.f161019a.f160961o0 && this.f161019a.f160955l0 == com.mbridge.msdk.foundation.same.a.f156298I) {
                this.f161019a.y();
            }
            try {
                MBridgeVideoView mBridgeVideoView2 = this.f161019a;
                if (mBridgeVideoView2 != null && mBridgeVideoView2.f160970t != null) {
                    int i14 = (i10 * 100) / i11;
                    this.f161019a.f160970t.setProgress(i14, this.f161019a.mCurrPlayNum - 1);
                    this.f161031m.setVideoPlayProgress(i14);
                }
                MBridgeVideoView mBridgeVideoView3 = this.f161019a;
                if (mBridgeVideoView3 != null) {
                    int i15 = mBridgeVideoView3.f160914F != -5 ? this.f161019a.f160914F : this.f161019a.f160912E;
                    if (i15 != -1 && i10 == i15 && (campaignEx = this.f161019a.f160707b) != null && campaignEx.isDynamicView()) {
                        this.f161019a.setCTALayoutVisibleOrGone();
                    }
                }
            } catch (Throwable th) {
                q0.b("DefaultVideoPlayerStatusListener", th.getMessage());
            }
            a(i10, i11);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayStarted(int i10) {
            PlayerView playerView;
            CampaignEx campaignEx;
            super.onPlayStarted(i10);
            MBridgeVideoView mBridgeVideoView = this.f161019a;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.g();
            }
            if (!this.f161023e) {
                MBridgeVideoView mBridgeVideoView2 = this.f161019a;
                if (mBridgeVideoView2 != null) {
                    mBridgeVideoView2.f160904A = true;
                    this.f161019a.notifyListener.a(10, this.f161025g);
                }
                this.f161023e = true;
            }
            this.f161022d = i10;
            CampaignEx campaignEx2 = this.f161031m;
            if (campaignEx2 != null) {
                int videoCompleteTime = campaignEx2.getVideoCompleteTime();
                if (videoCompleteTime <= 0) {
                    videoCompleteTime = i10;
                }
                if (this.f161031m.isDynamicView()) {
                    b(videoCompleteTime);
                } else {
                    a(videoCompleteTime);
                }
            }
            MBridgeVideoView mBridgeVideoView3 = this.f161019a;
            if (mBridgeVideoView3 != null && mBridgeVideoView3.f160964q != null) {
                this.f161019a.f160964q.setMax(i10);
            }
            MBridgeVideoView mBridgeVideoView4 = this.f161019a;
            if (mBridgeVideoView4 != null && mBridgeVideoView4.f160960o != null && (campaignEx = this.f161031m) != null && campaignEx.getAdSpaceT() == 2) {
                this.f161019a.f160960o.setVisibility(0);
            }
            MBridgeVideoView mBridgeVideoView5 = this.f161019a;
            if (mBridgeVideoView5 != null && mBridgeVideoView5.f160956m != null && this.f161019a.f160956m.getVisibility() == 0) {
                this.f161019a.f();
            }
            boolean unused = MBridgeVideoView.f160902W0 = false;
            if (this.f161019a != null && this.f161031m.isDynamicView()) {
                if (this.f161019a.f160914F != -5) {
                    if (this.f161019a.f160914F == 0) {
                        this.f161019a.setCTALayoutVisibleOrGone();
                    }
                } else if (this.f161019a.f160912E == 0) {
                    this.f161019a.setCTALayoutVisibleOrGone();
                }
            }
            MBridgeVideoView mBridgeVideoView6 = this.f161019a;
            if (mBridgeVideoView6 != null) {
                mBridgeVideoView6.showMoreOfferInPlayTemplate();
                this.f161019a.showBaitClickView();
                this.f161019a.q();
            }
            if (this.f161024f != null) {
                try {
                    MBridgeVideoView mBridgeVideoView7 = this.f161019a;
                    this.f161024f.start(i10, (mBridgeVideoView7 == null || (playerView = mBridgeVideoView7.mPlayerView) == null) ? 0.0f : playerView.getVolume());
                    q0.a("omsdk", "play video view:  videoEvents.start");
                } catch (Exception e10) {
                    q0.b("omsdk", e10.getMessage());
                }
            }
        }

        public void a(CampaignEx campaignEx) {
            this.f161031m = campaignEx;
        }

        public void b(int i10, int i11) {
            this.f161032n = i10;
            this.f161033o = i11;
            c();
        }

        public void a(boolean z10) {
            this.f161029k = z10;
        }

        public void a(String str) {
            this.f161030l = str;
        }

        private void b(int i10) {
            MBridgeVideoView mBridgeVideoView = this.f161019a;
            if (mBridgeVideoView == null || mBridgeVideoView.f160956m == null) {
                return;
            }
            String str = "mbridge_reward_video_time_count_num_bg";
            if (this.f161031m.getDynamicTempCode() == 5) {
                MBridgeVideoView mBridgeVideoView2 = this.f161019a;
                if (mBridgeVideoView2.mCurrPlayNum > 1 && i10 <= 0) {
                    mBridgeVideoView2.f160956m.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_time_count_num_bg", AppIntroBaseFragmentKt.ARG_DRAWABLE));
                    e();
                    return;
                }
            }
            if (i10 > 0) {
                if (!this.f161029k || this.f161031m.getDynamicTempCode() == 5) {
                    e();
                }
            } else {
                str = "mbridge_reward_shape_progress";
            }
            CampaignEx campaignEx = this.f161031m;
            if (campaignEx != null && campaignEx.getUseSkipTime() == 1 && this.f161029k) {
                e();
            }
            this.f161019a.f160956m.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, AppIntroBaseFragmentKt.ARG_DRAWABLE));
        }

        public int a() {
            return this.f161020b;
        }

        private void a(int i10) {
            if (i10 > 0) {
                this.f161019a.f160956m.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_time_count_num_bg", AppIntroBaseFragmentKt.ARG_DRAWABLE));
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, com.mbridge.msdk.advanced.signal.c.a(30.0f));
                int iA = com.mbridge.msdk.advanced.signal.c.a(5.0f);
                layoutParams.addRule(1, i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_native_endcard_feed_btn", "id"));
                layoutParams.setMargins(iA, 0, 0, 0);
                this.f161019a.f160956m.setPadding(iA, 0, iA, 0);
                this.f161019a.f160956m.setLayoutParams(layoutParams);
                return;
            }
            this.f161019a.f160956m.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_shape_progress", AppIntroBaseFragmentKt.ARG_DRAWABLE));
        }

        private void b(int i10, int i11, int i12) {
            int i13;
            MBridgeVideoView mBridgeVideoView = this.f161019a;
            if (mBridgeVideoView == null) {
                return;
            }
            String strA = (String) mBridgeVideoView.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_complete", x.b.f238264e));
            String str = (String) this.f161019a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left", x.b.f238264e));
            if (i10 >= 0) {
                if (this.f161031m.getUseSkipTime() == 1) {
                    int iMin = Math.min(this.f161019a.f160926L, i10);
                    if (iMin >= i10 || iMin <= 0) {
                        i13 = i10 - i12;
                        if (this.f161029k) {
                            if (i13 <= 0) {
                                this.f161019a.f160956m.setVisibility(4);
                            } else {
                                str = (String) this.f161019a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left_skip_time", x.b.f238264e));
                            }
                        }
                    } else {
                        i13 = iMin - i12;
                        if (i13 <= 0) {
                            i13 = i10 - i12;
                            if (this.f161029k) {
                                this.f161019a.f160956m.setVisibility(4);
                            }
                        } else {
                            str = (String) this.f161019a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left_skip_time", x.b.f238264e));
                        }
                    }
                } else {
                    i13 = i10 - i12;
                }
                if (i13 > 0) {
                    strA = z.a(i13, str);
                }
            } else {
                i13 = i11 - i12;
                if (i13 > 0) {
                    strA = i10 <= 0 ? z.a(i13, "") : z.a(i13, str);
                } else if (i10 <= 0) {
                    strA = MBridgeConstans.ENDCARD_URL_TYPE_PL;
                }
            }
            this.f161025g.f161016a = i12;
            this.f161019a.f160956m.setText(strA);
            if (this.f161019a.f160964q != null && this.f161019a.f160964q.getVisibility() == 0) {
                this.f161019a.f160964q.setProgress(i12);
            }
            if (i13 >= this.f161019a.f160909C0 || this.f161019a.f160913E0 == null || !this.f161019a.f160922J) {
                return;
            }
            this.f161019a.f160913E0.onTimeLessThanReduce(i13);
        }

        private void a(int i10, int i11) {
            int i12;
            String str;
            int i13 = this.f161032n;
            if (i13 == 100 || this.f161034p || i13 == 0) {
                return;
            }
            if (this.f161033o > i13) {
                this.f161033o = i13 / 2;
            }
            int i14 = this.f161033o;
            if (i14 < 0 || i10 < (i12 = (i11 * i14) / 100)) {
                return;
            }
            if (this.f161031m.getAdType() != 94 && this.f161031m.getAdType() != 287) {
                str = this.f161031m.getId() + this.f161031m.getVideoUrlEncode() + this.f161031m.getBidToken();
            } else {
                str = this.f161031m.getRequestId() + this.f161031m.getId() + this.f161031m.getVideoUrlEncode();
            }
            com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f161030l, str);
            if (aVarA != null) {
                aVarA.A();
                this.f161034p = true;
                q0.b("DefaultVideoPlayerStatusListener", "CDRate is : " + i12 + " and start download !");
            }
        }

        private void a(int i10, int i11, int i12) {
            String strA;
            MBridgeVideoView mBridgeVideoView = this.f161019a;
            if (mBridgeVideoView == null) {
                return;
            }
            int i13 = 0;
            if (this.f161029k) {
                strA = String.format(C4.s.f17585b, Integer.valueOf(i11 - i12));
            } else {
                if (i10 > i11) {
                    i10 = i11;
                }
                int i14 = i10 <= 0 ? i11 - i12 : i10 - i12;
                if (i14 <= 0) {
                    strA = i10 <= 0 ? MBridgeConstans.ENDCARD_URL_TYPE_PL : (String) mBridgeVideoView.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_complete", x.b.f238264e));
                } else {
                    if (i10 <= 0) {
                        strA = z.a(i14, "");
                    } else {
                        strA = i14 + ((String) this.f161019a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left", x.b.f238264e)));
                    }
                    i13 = i14;
                }
                if (i13 < this.f161019a.f160909C0 && this.f161019a.f160913E0 != null && this.f161019a.f160922J) {
                    this.f161019a.f160913E0.onTimeLessThanReduce(i13);
                }
            }
            CampaignEx campaignEx = this.f161031m;
            if (campaignEx != null && campaignEx.getUseSkipTime() == 1) {
                int iMin = Math.min(this.f161019a.f160926L, i11);
                if (iMin >= i10 || iMin < 0) {
                    int i15 = i10 - i12;
                    if (this.f161029k) {
                        if (i15 > 0) {
                            strA = i15 + ((String) this.f161019a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left_skip_time", x.b.f238264e)));
                        } else if (i15 == 0) {
                            this.f161019a.f160956m.setVisibility(4);
                        }
                    }
                } else {
                    int i16 = iMin - i12;
                    if (i16 > 0) {
                        strA = i16 + ((String) this.f161019a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left_skip_time", x.b.f238264e)));
                    } else if (this.f161029k && i16 == 0) {
                        this.f161019a.f160956m.setVisibility(4);
                    }
                }
            }
            this.f161019a.f160956m.setText(strA);
            if (this.f161019a.f160964q == null || this.f161019a.f160964q.getVisibility() != 0) {
                return;
            }
            this.f161019a.f160964q.setProgress(i12);
        }
    }

    public MBridgeVideoView(Context context) {
        super(context);
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.mMuteSwitch = 0;
        this.f160976w = false;
        this.f160982z = 0;
        this.f160918H = false;
        this.f160920I = false;
        this.f160922J = false;
        this.f160936Q = "";
        this.f160940T = false;
        this.f160941U = false;
        this.f160942V = false;
        this.f160943W = false;
        this.f160944a0 = false;
        this.f160945b0 = false;
        this.f160946c0 = false;
        this.f160947d0 = false;
        this.f160948e0 = false;
        this.f160950g0 = false;
        this.f160951h0 = 2;
        this.f160961o0 = false;
        this.f160963p0 = false;
        this.f160965q0 = false;
        this.f160967r0 = true;
        this.f160969s0 = false;
        this.f160971t0 = false;
        this.f160973u0 = false;
        this.f160975v0 = false;
        this.f160977w0 = false;
        this.f160983z0 = 0;
        this.f160905A0 = 5;
        this.f160907B0 = 5;
        this.f160909C0 = 5;
        this.f160915F0 = false;
        this.f160923J0 = false;
        this.f160925K0 = 0;
        this.f160927L0 = false;
        this.f160929M0 = false;
        this.hasBufferTimeout = false;
        this.f160931N0 = new w(this);
        this.f160933O0 = false;
        this.f160935P0 = new k();
        this.f160937Q0 = new m();
    }

    public static /* synthetic */ int W(MBridgeVideoView mBridgeVideoView) {
        int i10 = mBridgeVideoView.f160905A0;
        mBridgeVideoView.f160905A0 = i10 - 1;
        return i10;
    }

    private int getCDRate() {
        return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f160936Q, false).g();
    }

    private int getVideoAllDuration() {
        try {
            w wVar = this.f160931N0;
            int iB = wVar != null ? wVar.b() : 0;
            return iB == 0 ? this.f160707b.getVideoLength() : iB;
        } catch (Throwable th) {
            q0.b(MBridgeBaseView.TAG, th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getVideoCompleteTime() {
        int videoCompleteTime = 0;
        try {
            int videoAllDuration = getVideoAllDuration();
            CampaignEx campaignEx = this.f160707b;
            if (campaignEx != null) {
                videoCompleteTime = campaignEx.getVideoCompleteTime();
                if (this.f160707b.getDynamicTempCode() != 5 && videoCompleteTime > videoAllDuration) {
                    videoCompleteTime = videoAllDuration;
                }
                if (videoCompleteTime > 0) {
                    return videoCompleteTime;
                }
            }
            return videoAllDuration;
        } catch (Throwable th) {
            q0.b(MBridgeBaseView.TAG, th.getMessage());
            return videoCompleteTime;
        }
    }

    private void setBlurBackgroundImage(String str) {
        com.mbridge.msdk.advanced.manager.e.a().a(str, new c());
    }

    private void setPlayerViewRadius(int i10) {
        if (i10 > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(v0.a(getContext(), i10));
            gradientDrawable.setColor(-1);
            gradientDrawable.setStroke(1, 0);
            setBackground(gradientDrawable);
            this.mPlayerView.setBackground(gradientDrawable);
            setClipToOutline(true);
            this.mPlayerView.setClipToOutline(true);
        }
    }

    private void t() {
    }

    public void addCTAView() {
        if (this.f160906B == null) {
            return;
        }
        if (this.f160908C == null) {
            MBridgeClickCTAView mBridgeClickCTAView = new MBridgeClickCTAView(getContext());
            this.f160908C = mBridgeClickCTAView;
            mBridgeClickCTAView.setCampaign(this.f160707b);
            this.f160908C.setUnitId(this.f160936Q);
            com.mbridge.msdk.video.module.listener.a aVar = this.f160972u;
            if (aVar != null) {
                this.f160908C.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.i(aVar));
            }
            this.f160908C.preLoadData(this.f160910D);
        }
        this.f160906B.addView(this.f160908C);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void alertWebViewShowed() {
        this.f160920I = true;
        setShowingAlertViewCover(true);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void closeVideoOperate(int i10, int i11) {
        if (i10 == 1) {
            this.f160975v0 = true;
            if (getVisibility() == 0) {
                y();
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000148", this.f160707b, eVar);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", this.f160707b);
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
        if (i11 == 1) {
            gonePlayingCloseView();
        } else if (i11 == 2) {
            if (this.f160973u0 && getVisibility() == 0) {
                return;
            }
            x();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
        this.f160940T = true;
        showVideoLocation(0, 0, v0.g(this.f160706a), v0.f(this.f160706a), 0, 0, 0, 0, 0);
        videoOperate(1);
        if (this.f160926L == 0) {
            closeVideoOperate(-1, 2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void dismissAllAlert() {
        MBAlertDialog mBAlertDialog = this.f160932O;
        if (mBAlertDialog != null) {
            mBAlertDialog.dismiss();
        }
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null) {
            aVar.a(125, "");
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewHeight() {
        return f160901V0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewLeft() {
        return f160899T0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewRadius() {
        return f160897R0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewTop() {
        return f160898S0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewWidth() {
        return f160900U0;
    }

    public int getBufferTimeout() {
        return this.f160928M;
    }

    public int getCloseAlert() {
        return this.f160930N;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public String getCurrentProgress() {
        try {
            int iA = this.f160931N0.a();
            CampaignEx campaignEx = this.f160707b;
            int videoLength = campaignEx != null ? campaignEx.getVideoLength() : 0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("progress", a(iA, videoLength));
            jSONObject.put("time", iA);
            jSONObject.put(x.h.f238399b, videoLength + "");
            return jSONObject.toString();
        } catch (Throwable th) {
            q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
            return Ib.b.f53002g;
        }
    }

    public int getMute() {
        return this.f160951h0;
    }

    public String getPlayURL() {
        return this.f160924K;
    }

    public String getUnitId() {
        return this.f160936Q;
    }

    public int getVideoSkipTime() {
        return this.f160926L;
    }

    public void gonePlayingCloseView() {
        if (this.f160710e && this.f160958n.getVisibility() != 8) {
            this.f160958n.setVisibility(8);
            this.f160944a0 = false;
        }
        i();
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void hideAlertView(int i10) {
        if (this.f160920I) {
            this.f160920I = false;
            this.f160961o0 = true;
            setShowingAlertViewCover(false);
            com.mbridge.msdk.foundation.same.report.j.a(this.f160706a, this.f160707b, com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f160936Q, false).c(), this.f160936Q, 1, i10, 1);
            if (i10 == 0) {
                p();
                if (this.f160950g0) {
                    int i11 = this.f160955l0;
                    if (i11 == com.mbridge.msdk.foundation.same.a.f156298I || i11 == com.mbridge.msdk.foundation.same.a.f156297H) {
                        this.f160963p0 = true;
                        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
                        if (aVar != null) {
                            aVar.a(124, "");
                        }
                        CampaignEx campaignEx = this.f160707b;
                        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f160707b.getRewardTemplateMode().k() == 5002010) {
                            x();
                            return;
                        } else {
                            this.f160973u0 = true;
                            gonePlayingCloseView();
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            this.f160965q0 = true;
            boolean z10 = this.f160950g0;
            if (z10 && this.f160955l0 == com.mbridge.msdk.foundation.same.a.f156298I) {
                p();
                return;
            }
            if (z10 && this.f160955l0 == com.mbridge.msdk.foundation.same.a.f156297H) {
                com.mbridge.msdk.video.module.listener.a aVar2 = this.notifyListener;
                if (aVar2 != null) {
                    this.f160927L0 = true;
                    aVar2.a(2, c(this.f160969s0));
                    return;
                }
                return;
            }
            com.mbridge.msdk.video.module.listener.a aVar3 = this.notifyListener;
            if (aVar3 != null) {
                this.f160927L0 = true;
                aVar3.a(2, "");
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    @Override // com.mbridge.msdk.video.signal.j
    public boolean isH5Canvas() {
        return getLayoutParams().height < v0.f(this.f160706a.getApplicationContext());
    }

    public boolean isInstDialogShowing() {
        return this.f160915F0;
    }

    public boolean isMiniCardShowing() {
        return this.f160943W;
    }

    public boolean isRewardPopViewShowing() {
        return this.f160922J;
    }

    public boolean isShowingAlertView() {
        return this.f160920I;
    }

    public boolean isShowingTransparent() {
        return this.f160948e0;
    }

    public boolean isfront() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return false;
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int childCount = viewGroup.getChildCount();
        int i10 = iIndexOfChild + 1;
        boolean z10 = false;
        while (i10 <= childCount - 1) {
            if (viewGroup.getChildAt(i10).getVisibility() == 0 && this.f160943W) {
                return false;
            }
            i10++;
            z10 = true;
        }
        return z10;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void notifyCloseBtn(int i10) {
        if (i10 == 0) {
            this.f160945b0 = true;
            this.f160947d0 = false;
        } else if (i10 == 1) {
            this.f160946c0 = true;
        }
    }

    public void notifyVideoClose() {
        this.f160927L0 = true;
        this.notifyListener.a(2, "");
    }

    public void onActivityPause() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.f160913E0;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onPause();
            }
        } catch (Throwable th) {
            q0.b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void onActivityResume() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.f160913E0;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onResume();
            }
        } catch (Throwable th) {
            q0.b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void onActivityStop() {
        try {
            MBAcquireRewardPopView mBAcquireRewardPopView = this.f160913E0;
            if (mBAcquireRewardPopView != null) {
                mBAcquireRewardPopView.onStop();
            }
        } catch (Throwable th) {
            q0.b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void onBackPress() {
        boolean z10;
        if (this.f160943W || this.f160920I || this.f160963p0) {
            return;
        }
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f160707b.getRewardTemplateMode().k() == 5002010 && (z10 = this.f160969s0)) {
            com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
            if (aVar != null) {
                this.f160927L0 = true;
                aVar.a(2, c(z10));
                return;
            }
            return;
        }
        if (this.f160944a0) {
            y();
            return;
        }
        boolean z11 = this.f160945b0;
        if (z11 && this.f160946c0) {
            y();
        } else {
            if (z11 || !this.f160947d0) {
                return;
            }
            y();
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CampaignEx campaignEx = this.f160707b;
        if ((campaignEx == null || !campaignEx.isDynamicView()) && this.f160710e && this.f160940T) {
            u();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (this.f160935P0 != null) {
                getHandler().removeCallbacks(this.f160935P0);
            }
            if (this.f160983z0 != 0) {
                removeCallbacks(this.f160937Q0);
            }
        } catch (Throwable th) {
            q0.b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f160910D = bVar;
        if (!this.f160710e) {
            com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
            if (aVar != null) {
                aVar.a(12, "MBridgeVideoView initSuccess false");
            }
        } else if (!TextUtils.isEmpty(this.f160924K) && this.f160707b != null) {
            AdSession adSession = this.f160952i0;
            if (adSession != null) {
                adSession.registerAdView(this.mPlayerView);
                SoundImageView soundImageView = this.mSoundImageView;
                if (soundImageView != null) {
                    this.f160952i0.addFriendlyObstruction(soundImageView, FriendlyObstructionPurpose.OTHER, null);
                }
                this.f160952i0.addFriendlyObstruction(this.f160956m, FriendlyObstructionPurpose.OTHER, null);
                this.f160952i0.addFriendlyObstruction(this.f160958n, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
            }
            k();
            this.mPlayerView.initBufferIngParam(this.f160928M);
            this.mPlayerView.initVFPData(this.f160924K, this.f160707b.getVideoUrlEncode(), this.f160931N0);
            soundOperate(this.f160951h0, -1, null);
        }
        f160902W0 = false;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressBarOperate(int i10) {
        ProgressBar progressBar;
        if (this.f160710e) {
            if (i10 == 1) {
                ProgressBar progressBar2 = this.f160964q;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                    return;
                }
                return;
            }
            if (i10 != 2 || (progressBar = this.f160964q) == null) {
                return;
            }
            progressBar.setVisibility(0);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressOperate(int i10, int i11) {
        if (this.f160710e) {
            q0.c(MBridgeBaseView.TAG, "progressOperate progress:" + i10);
            CampaignEx campaignEx = this.f160707b;
            int videoLength = campaignEx != null ? campaignEx.getVideoLength() : 0;
            if (i10 > 0 && i10 <= videoLength && this.mPlayerView != null) {
                q0.c(MBridgeBaseView.TAG, "progressOperate progress:" + i10);
                this.mPlayerView.seekTo(i10 * 1000);
            }
            if (i11 == 1) {
                this.f160956m.setVisibility(8);
            } else if (i11 == 2) {
                this.f160956m.setVisibility(0);
            }
            if (this.f160956m.getVisibility() == 0) {
                f();
            }
        }
    }

    public void releasePlayer() {
        try {
            PlayerView playerView = this.mPlayerView;
            if (playerView != null && !this.f160942V) {
                playerView.release();
                if (!TextUtils.isEmpty(this.f160924K)) {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    long jCurrentTimeMillis = f160903X0;
                    if (jCurrentTimeMillis != 0) {
                        jCurrentTimeMillis = System.currentTimeMillis() - f160903X0;
                    }
                    eVar.a(x.h.f238399b, Long.valueOf(jCurrentTimeMillis));
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000146", this.f160707b, eVar);
                }
            }
            w wVar = this.f160931N0;
            if (wVar != null) {
                wVar.d();
            }
            if (this.f160972u != null) {
                this.f160972u = null;
            }
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public void setAdSession(AdSession adSession) {
        this.f160952i0 = adSession;
    }

    public void setBufferTimeout(int i10) {
        this.f160928M = i10;
    }

    public void setCTALayoutVisibleOrGone() {
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx == null || this.f160906B == null) {
            return;
        }
        if (campaignEx.getRewardTemplateMode() == null || this.f160707b.getRewardTemplateMode().k() != 902) {
            int i10 = this.f160914F;
            if (i10 != -5) {
                if (i10 == -3) {
                    return;
                }
                if (this.f160908C == null) {
                    addCTAView();
                }
                if (this.f160914F == -1) {
                    if (this.f160906B.getVisibility() != 0) {
                        this.f160906B.setVisibility(0);
                        postDelayed(this.f160935P0, e0.f86341n);
                    } else {
                        this.f160906B.setVisibility(8);
                        getHandler().removeCallbacks(this.f160935P0);
                    }
                }
                if (this.f160914F >= 0) {
                    this.f160906B.setVisibility(0);
                    return;
                }
                return;
            }
            if (this.f160912E < -1) {
                return;
            }
            if (this.f160908C == null) {
                addCTAView();
            }
            int i11 = this.f160912E;
            if (i11 >= 0) {
                this.f160906B.setVisibility(0);
                return;
            }
            if (i11 == -1) {
                if (this.f160906B.getVisibility() != 0) {
                    this.f160906B.setVisibility(0);
                    postDelayed(this.f160935P0, e0.f86341n);
                } else {
                    this.f160906B.setVisibility(8);
                    getHandler().removeCallbacks(this.f160935P0);
                }
            }
        }
    }

    public void setCamPlayOrderCallback(com.mbridge.msdk.video.dynview.listener.a aVar, List<CampaignEx> list, int i10, int i11) {
        MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar;
        this.f160978x = aVar;
        this.mCampaignSize = list.size();
        this.mCurrPlayNum = i10;
        this.f160982z = i11;
        this.mCampOrderViewData = list;
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx == null || campaignEx.getDynamicTempCode() != 5) {
            CampaignEx campaignEx2 = this.f160707b;
            if (campaignEx2 == null || campaignEx2.getProgressBarShow() != 1 || (mBridgeSegmentsProgressBar = this.f160970t) == null) {
                return;
            }
            mBridgeSegmentsProgressBar.init(1, 3);
            this.f160970t.setVisibility(0);
            return;
        }
        MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar2 = this.f160970t;
        if (mBridgeSegmentsProgressBar2 == null || this.mCampOrderViewData == null) {
            return;
        }
        if (this.mCampaignSize > 1) {
            mBridgeSegmentsProgressBar2.setVisibility(0);
            this.f160970t.init(this.mCampaignSize, 2);
            for (int i12 = 0; i12 < this.mCampOrderViewData.size(); i12++) {
                int videoPlayProgress = this.mCampOrderViewData.get(i12).getVideoPlayProgress();
                if (videoPlayProgress > 0) {
                    this.f160970t.setProgress(videoPlayProgress, i12);
                }
                if (this.mCampOrderViewData.get(i12).isRewardPopViewShowed) {
                    this.f160918H = true;
                }
            }
            return;
        }
        CampaignEx campaignEx3 = this.f160707b;
        if (campaignEx3 == null || campaignEx3.getProgressBarShow() != 1) {
            this.f160970t.setVisibility(8);
            return;
        }
        MBridgeSegmentsProgressBar mBridgeSegmentsProgressBar3 = this.f160970t;
        if (mBridgeSegmentsProgressBar3 != null) {
            mBridgeSegmentsProgressBar3.init(1, 3);
            this.f160970t.setVisibility(0);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setCampaign(CampaignEx campaignEx) {
        super.setCampaign(campaignEx);
        w wVar = this.f160931N0;
        if (wVar != null) {
            wVar.a(campaignEx);
            this.f160931N0.b(a(campaignEx), getCDRate());
        }
    }

    public void setCloseAlert(int i10) {
        this.f160930N = i10;
    }

    public void setContainerViewOnNotifyListener(com.mbridge.msdk.video.module.listener.a aVar) {
        this.f160972u = aVar;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setCover(boolean z10) {
        if (this.f160710e) {
            this.mPlayerView.setIsCovered(z10);
        }
    }

    public void setDialogRole(int i10) {
        this.f160967r0 = i10 == 1;
        q0.b(MBridgeBaseView.TAG, i10 + C4.q.f17581a + this.f160967r0);
    }

    public void setIPlayVideoViewLayoutCallBack(com.mbridge.msdk.video.dynview.listener.f fVar) {
        this.f160980y = fVar;
    }

    public void setIVRewardEnable(int i10, int i11, int i12) {
        this.f160955l0 = i10;
        this.f160957m0 = i11;
        this.f160959n0 = i12;
    }

    public void setInstDialogState(boolean z10) {
        PlayerView playerView;
        this.f160915F0 = z10;
        if (!com.mbridge.msdk.util.b.a() || (playerView = this.mPlayerView) == null) {
            return;
        }
        playerView.setIsCovered(z10);
    }

    public void setIsIV(boolean z10) {
        this.f160950g0 = z10;
        w wVar = this.f160931N0;
        if (wVar != null) {
            wVar.a(z10);
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setMiniEndCardState(boolean z10) {
        this.f160943W = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        RelativeLayout relativeLayout;
        MBridgeVideoView mBridgeVideoView;
        try {
            q0.b(MBridgeBaseView.TAG, "NOTCH VideoView ".concat(String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13))));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            int i14 = layoutParams.leftMargin;
            int i15 = layoutParams.rightMargin;
            int i16 = layoutParams.topMargin;
            int i17 = layoutParams.bottomMargin;
            this.f160925K0 = i12;
            if (Math.max(Math.max(i14, i15), Math.max(i16, i17)) <= Math.max(Math.max(i10, i11), Math.max(i12, i13)) && (relativeLayout = this.f160960o) != null) {
                mBridgeVideoView = this;
                try {
                    relativeLayout.postDelayed(mBridgeVideoView.new b(i10, i12, i11, i13), 200L);
                } catch (Exception e10) {
                    e = e10;
                    q0.b(MBridgeBaseView.TAG, e.getMessage());
                    return;
                }
            } else {
                mBridgeVideoView = this;
            }
            if (mBridgeVideoView.f160956m.getVisibility() == 0) {
                f();
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void setPlayURL(String str) {
        this.f160924K = str;
    }

    public void setPlayerViewAttachListener(u uVar) {
        this.f160974v = uVar;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setScaleFitXY(int i10) {
        this.f160949f0 = i10;
    }

    public void setShowingAlertViewCover(boolean z10) {
        MBAcquireRewardPopView mBAcquireRewardPopView;
        if (z10 && (mBAcquireRewardPopView = this.f160913E0) != null && this.f160922J && this.f160920I) {
            mBAcquireRewardPopView.onPause();
        }
        this.mPlayerView.setIsCovered(z10);
    }

    public void setShowingTransparent(boolean z10) {
        this.f160948e0 = z10;
    }

    public void setSoundState(int i10) {
        this.f160951h0 = i10;
    }

    public void setUnitId(String str) {
        this.f160936Q = str;
        w wVar = this.f160931N0;
        if (wVar != null) {
            wVar.a(str);
        }
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f160953j0 = mediaEvents;
        w wVar = this.f160931N0;
        if (wVar != null) {
            wVar.f161024f = mediaEvents;
        }
        PlayerView playerView = this.mPlayerView;
        if (playerView != null) {
            playerView.setVideoEvents(mediaEvents);
        }
    }

    public void setVideoLayout(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f160707b = campaignEx;
            this.f160713h = campaignEx.isDynamicView();
        }
        if (this.f160713h) {
            a(this, campaignEx);
        } else {
            h();
        }
    }

    public void setVideoSkipTime(int i10) {
        this.f160926L = i10;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setVisible(int i10) {
        setVisibility(i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showAlertView() {
        CampaignEx campaignEx;
        if (this.f160943W) {
            return;
        }
        if (this.f160934P == null) {
            this.f160934P = new s();
        }
        if (this.f160932O == null) {
            MBAlertDialog mBAlertDialog = new MBAlertDialog(getContext(), this.f160934P);
            this.f160932O = mBAlertDialog;
            AdSession adSession = this.f160952i0;
            if (adSession != null) {
                adSession.addFriendlyObstruction(mBAlertDialog.getWindow().getDecorView(), FriendlyObstructionPurpose.NOT_VISIBLE, null);
            }
        }
        if (this.f160950g0) {
            this.f160932O.makeIVAlertView(this.f160955l0, this.f160936Q);
        } else {
            this.f160932O.makeRVAlertView(this.f160936Q);
        }
        PlayerView playerView = this.mPlayerView;
        if (playerView != null) {
            if (playerView.isComplete() && ((campaignEx = this.f160707b) == null || campaignEx.getRewardTemplateMode() == null || this.f160707b.getRewardTemplateMode().k() != 5002010)) {
                return;
            }
            this.f160932O.show();
            this.f160961o0 = true;
            this.f160920I = true;
            setShowingAlertViewCover(true);
            String strC = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f160936Q, false).c();
            this.f160954k0 = strC;
            com.mbridge.msdk.foundation.same.report.j.a(this.f160706a, this.f160707b, strC, this.f160936Q, 1, 1);
        }
    }

    public void showBaitClickView() {
        int i10;
        MBridgeBaitClickView mBridgeBaitClickView;
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx == null || !campaignEx.isDynamicView() || this.f160707b.getRewardTemplateMode() == null) {
            return;
        }
        String strJ = this.f160707b.getRewardTemplateMode().j();
        if (TextUtils.isEmpty(strJ)) {
            return;
        }
        try {
            String strA = c1.a(strJ, "bait_click");
            if (TextUtils.isEmpty(strA) || (i10 = Integer.parseInt(strA)) == 0 || (mBridgeBaitClickView = this.f160981y0) == null) {
                return;
            }
            mBridgeBaitClickView.setVisibility(0);
            this.f160981y0.init(i10);
            this.f160981y0.startAnimation();
            this.f160981y0.setOnClickListener(new i());
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showIVRewardAlertView(String str) {
        this.notifyListener.a(8, "");
    }

    public void showMoreOfferInPlayTemplate() {
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx == null || this.f160916G == null || !campaignEx.isDynamicView() || this.f160707b.getRewardTemplateMode() == null) {
            return;
        }
        String strJ = this.f160707b.getRewardTemplateMode().j();
        if (TextUtils.isEmpty(strJ)) {
            return;
        }
        try {
            String strA = c1.a(strJ, "mof");
            if (TextUtils.isEmpty(strA) || Integer.parseInt(strA) != 1) {
                return;
            }
            com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f160707b, this, new com.mbridge.msdk.video.module.listener.impl.i(this.f160972u), 1);
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public void showRewardPopView() {
        AcquireRewardPopViewParameters acquireRewardPopViewParameters;
        MBAcquireRewardPopView mBAcquireRewardPopView = this.f160913E0;
        if (mBAcquireRewardPopView == null || (acquireRewardPopViewParameters = this.f160911D0) == null) {
            return;
        }
        try {
            mBAcquireRewardPopView.init(acquireRewardPopViewParameters);
            this.f160913E0.setVisibility(0);
            setCover(true);
            o();
            this.f160922J = true;
            CampaignEx campaignEx = this.f160707b;
            if (campaignEx != null) {
                campaignEx.isRewardPopViewShowed = true;
            }
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showVideoLocation(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        float f10;
        if (this.f160710e) {
            this.f160960o.setPadding(0, 0, 0, 0);
            setVisibility(0);
            if (this.f160960o.getVisibility() != 0) {
                this.f160960o.setVisibility(0);
            }
            if (this.f160956m.getVisibility() == 0) {
                f();
            }
            if (!b(i12, i13) || this.f160940T) {
                u();
                return;
            }
            f160898S0 = i15;
            f160899T0 = i16;
            f160900U0 = i17 + 4;
            f160901V0 = i18 + 4;
            float f11 = i12 / i13;
            try {
                f10 = (float) (this.f160938R / this.f160939S);
            } catch (Throwable th) {
                q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
                f10 = 0.0f;
            }
            if (i14 > 0) {
                f160897R0 = i14;
                setPlayerViewRadius(i14);
            }
            if (Math.abs(f11 - f10) > 0.1f && this.f160949f0 != 1) {
                u();
                videoOperate(1);
                return;
            }
            u();
            if (!this.f160948e0) {
                setLayoutParam(i11, i10, i12, i13);
                return;
            }
            setLayoutCenter(i12, i13);
            if (f160902W0) {
                this.notifyListener.a(114, "");
            } else {
                this.notifyListener.a(116, "");
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i10, int i11) {
        soundOperate(i10, i11, "2");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void videoOperate(int i10) {
        q0.a(MBridgeBaseView.TAG, "VideoView videoOperate:" + i10);
        if (this.f160710e) {
            if (i10 == 1) {
                if (getVisibility() == 0 && isfront()) {
                    q0.a(MBridgeBaseView.TAG, "VideoView videoOperate:play");
                    RelativeLayout relativeLayout = this.f160921I0;
                    if ((relativeLayout != null && relativeLayout.getVisibility() != 0) || this.f160920I || com.mbridge.msdk.foundation.feedback.b.f156248f) {
                        return;
                    }
                    if (!com.mbridge.msdk.util.b.a()) {
                        p();
                        return;
                    } else {
                        if (this.f160943W || this.f160915F0) {
                            return;
                        }
                        p();
                        return;
                    }
                }
                return;
            }
            if (i10 == 2) {
                if (getVisibility() == 0 && isfront()) {
                    q0.a(MBridgeBaseView.TAG, "VideoView videoOperate:pause");
                    o();
                    return;
                }
                return;
            }
            if (i10 == 3) {
                if (this.f160942V) {
                    return;
                }
                this.mPlayerView.stop();
                CampaignEx campaignEx = this.f160707b;
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || this.f160707b.getRewardTemplateMode().k() != 5002010) {
                    this.mPlayerView.release();
                    this.f160942V = true;
                    if (TextUtils.isEmpty(this.f160924K)) {
                        return;
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    long jCurrentTimeMillis = f160903X0;
                    if (jCurrentTimeMillis != 0) {
                        jCurrentTimeMillis = System.currentTimeMillis() - f160903X0;
                    }
                    eVar.a(x.h.f238399b, Long.valueOf(jCurrentTimeMillis));
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000146", this.f160707b, eVar);
                    return;
                }
                return;
            }
            if (i10 == 5) {
                if (com.mbridge.msdk.util.b.a()) {
                    this.f160915F0 = true;
                    if (this.f160942V) {
                        return;
                    }
                    o();
                    return;
                }
                return;
            }
            if (i10 == 4) {
                if (com.mbridge.msdk.util.b.a()) {
                    this.f160915F0 = false;
                    if (this.f160942V || isMiniCardShowing()) {
                        return;
                    }
                    p();
                    return;
                }
                return;
            }
            if (i10 != 6 || this.f160942V) {
                return;
            }
            this.mPlayerView.release();
            this.f160942V = true;
            if (TextUtils.isEmpty(this.f160924K)) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            long jCurrentTimeMillis2 = f160903X0;
            if (jCurrentTimeMillis2 != 0) {
                jCurrentTimeMillis2 = System.currentTimeMillis() - f160903X0;
            }
            eVar2.a(x.h.f238399b, Long.valueOf(jCurrentTimeMillis2));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000146", this.f160707b, eVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        w wVar;
        RelativeLayout relativeLayout;
        try {
            CampaignEx campaignEx = this.f160707b;
            if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || this.f160707b.getRewardTemplateMode().k() != 5002010 || (relativeLayout = this.f160921I0) == null || relativeLayout.getVisibility() == 0) {
                if (!this.f160941U) {
                    boolean zPlayVideo = this.mPlayerView.playVideo();
                    CampaignEx campaignEx2 = this.f160707b;
                    if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() != 2 && !zPlayVideo && (wVar = this.f160931N0) != null) {
                        wVar.onPlayError("play video failed");
                    }
                    this.f160941U = true;
                    return;
                }
                MBAcquireRewardPopView mBAcquireRewardPopView = this.f160913E0;
                if (mBAcquireRewardPopView != null && this.f160922J) {
                    mBAcquireRewardPopView.onResume();
                }
                if (this.f160922J) {
                    return;
                }
                if (!com.mbridge.msdk.util.b.a()) {
                    w();
                } else {
                    if (this.f160915F0 || this.f160920I) {
                        return;
                    }
                    this.mPlayerView.setIsCovered(false);
                    w();
                }
            }
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage(), e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        String strJ;
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx == null || !campaignEx.isDynamicView() || this.f160918H) {
            return;
        }
        if (!TextUtils.isEmpty(this.f160707b.getMof_template_url())) {
            strJ = this.f160707b.getMof_template_url();
        } else if (this.f160707b.getRewardTemplateMode() == null) {
            return;
        } else {
            strJ = this.f160707b.getRewardTemplateMode().j();
        }
        if (TextUtils.isEmpty(strJ)) {
            return;
        }
        try {
            String strA = c1.a(strJ, "guideShow");
            String strA2 = c1.a(strJ, "guideDelay");
            String strA3 = c1.a(strJ, "guideTime");
            String strA4 = c1.a(strJ, "guideRewardTime");
            if (!TextUtils.isEmpty(strA)) {
                this.f160983z0 = Integer.parseInt(strA);
            }
            if (!TextUtils.isEmpty(strA2)) {
                int i10 = Integer.parseInt(strA2);
                this.f160905A0 = i10;
                if (i10 > 10 || i10 < 3) {
                    this.f160905A0 = 5;
                }
            }
            if (!TextUtils.isEmpty(strA3)) {
                int i11 = Integer.parseInt(strA3);
                this.f160907B0 = i11;
                if (i11 > 10 || i11 < 3) {
                    this.f160907B0 = 5;
                }
            }
            if (!TextUtils.isEmpty(strA4)) {
                int i12 = Integer.parseInt(strA4);
                this.f160909C0 = i12;
                if (i12 > 10 || i12 < 5) {
                    this.f160909C0 = 5;
                }
            }
            int i13 = this.f160983z0;
            if (i13 > 0 && i13 <= 2) {
                int videoCompleteTime = getVideoCompleteTime();
                if (videoCompleteTime == 0 || videoCompleteTime > this.f160905A0) {
                    int i14 = videoCompleteTime - this.f160905A0;
                    if (i14 >= 0 && this.f160909C0 > i14) {
                        this.f160909C0 = i14;
                    }
                    int videoAllDuration = getVideoAllDuration();
                    if (this.f160909C0 >= videoAllDuration) {
                        this.f160909C0 = videoAllDuration - this.f160905A0;
                    }
                    if (this.f160905A0 >= videoAllDuration) {
                        return;
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add(this.f160707b.getAppName());
                    com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                    this.f160911D0 = new AcquireRewardPopViewParameters.Builder("", this.f160936Q, this.f160983z0, gVarD != null ? gVarD.k() : "US").setAutoDismissTime(this.f160907B0).setReduceTime(this.f160909C0).setBehaviourListener(new j()).setRightAnswerList(arrayList).build();
                    postDelayed(this.f160937Q0, 1000L);
                }
            }
        } catch (Throwable th) {
            q0.b(MBridgeBaseView.TAG, th.getMessage());
        }
    }

    private void r() {
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx == null || campaignEx.getAdSpaceT() != 2 || this.tvFlag == null) {
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            this.tvFlag.setText("AD");
        } else {
            this.tvFlag.setText("广告");
        }
    }

    private void s() {
        int iG;
        int iK;
        float fG = v0.g(this.f160706a);
        float f10 = v0.f(this.f160706a);
        double d10 = this.f160938R;
        if (d10 > 0.0d) {
            double d11 = this.f160939S;
            if (d11 > 0.0d && fG > 0.0f && f10 > 0.0f) {
                double d12 = d10 / d11;
                double d13 = fG / f10;
                q0.c(MBridgeBaseView.TAG, "videoWHDivide:" + d12 + "  screenWHDivide:" + d13);
                double dA = v0.a(Double.valueOf(d12));
                double dA2 = v0.a(Double.valueOf(d13));
                q0.c(MBridgeBaseView.TAG, "videoWHDivideFinal:" + dA + "  screenWHDivideFinal:" + dA2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mPlayerView.getLayoutParams();
                if (dA > dA2) {
                    double d14 = (((double) fG) * this.f160939S) / this.f160938R;
                    layoutParams.width = -1;
                    layoutParams.height = (int) d14;
                    layoutParams.gravity = 17;
                } else if (dA < dA2) {
                    layoutParams.width = (int) (((double) f10) * d12);
                    layoutParams.height = -1;
                    layoutParams.gravity = 17;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
                try {
                    CampaignEx campaignEx = this.f160707b;
                    if (campaignEx != null && campaignEx.isDynamicView()) {
                        if (this.f160707b.getRewardTemplateMode() != null) {
                            iK = this.f160707b.getRewardTemplateMode().k();
                            iG = this.f160707b.getRewardTemplateMode().g();
                        } else {
                            iG = this.f160706a.getResources().getConfiguration().orientation;
                            iK = x.b.f238273n;
                        }
                        if (iK == 102 || iK == 202) {
                            if (iG == 1) {
                                layoutParams.width = -1;
                                layoutParams.gravity = 17;
                                layoutParams.height = (int) (this.f160939S / (this.f160938R / ((double) fG)));
                            } else {
                                layoutParams.height = -1;
                                layoutParams.gravity = 17;
                                layoutParams.width = (int) (((double) f10) * d12);
                            }
                        }
                        if (iK == 202 && !TextUtils.isEmpty(this.f160707b.getImageUrl())) {
                            setBlurBackgroundImage(this.f160707b.getImageUrl());
                        }
                        if (iK == 302 || iK == 802 || iK == 5002010) {
                            double d15 = this.f160938R;
                            double d16 = this.f160939S;
                            if (d15 / d16 > 1.0d) {
                                layoutParams.width = -1;
                                layoutParams.height = (int) ((d16 * ((double) fG)) / d15);
                            } else {
                                int iA = v0.a(getContext(), 220.0f);
                                layoutParams.width = (int) ((this.f160938R * ((double) iA)) / this.f160939S);
                                layoutParams.height = iA;
                            }
                        }
                    }
                } catch (Throwable th) {
                    q0.b(MBridgeBaseView.TAG, th.getMessage());
                }
                this.mPlayerView.setLayoutParams(layoutParams);
                setMatchParent();
                return;
            }
        }
        v();
    }

    private void u() {
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx == null) {
            return;
        }
        if (campaignEx.getAdSpaceT() == 2) {
            t();
        } else {
            s();
        }
    }

    private void v() {
        try {
            setLayoutParam(0, 0, -1, -1);
            if (isLandscape() || !this.f160710e) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mPlayerView.getLayoutParams();
            int iG = v0.g(this.f160706a);
            layoutParams.width = -1;
            layoutParams.height = (iG * 9) / 16;
            layoutParams.gravity = 17;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void w() {
        if (this.f160969s0) {
            if (!this.f160971t0) {
                this.mPlayerView.seekToEndFrame();
            }
            this.f160971t0 = true;
        } else {
            this.mPlayerView.onResume();
        }
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx == null || campaignEx.isRewardPopViewShowed) {
            return;
        }
        post(this.f160937Q0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (!this.f160710e || this.f160958n.getVisibility() == 0) {
            return;
        }
        this.f160958n.setVisibility(0);
        this.f160944a0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        int i10;
        com.mbridge.msdk.video.module.listener.a aVar;
        boolean z10;
        try {
            CampaignEx campaignEx = this.f160707b;
            if (campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f160707b.getRewardTemplateMode().k() == 5002010 && this.f160927L0 && !(z10 = this.f160969s0)) {
                com.mbridge.msdk.video.module.listener.a aVar2 = this.notifyListener;
                if (aVar2 != null) {
                    this.f160927L0 = true;
                    aVar2.a(2, c(z10));
                    return;
                }
                return;
            }
            if (!this.f160950g0 || ((i10 = this.f160955l0) != com.mbridge.msdk.foundation.same.a.f156297H && i10 != com.mbridge.msdk.foundation.same.a.f156298I)) {
                CampaignEx campaignEx2 = this.f160707b;
                if (campaignEx2 == null || campaignEx2.getAdSpaceT() == 2) {
                    com.mbridge.msdk.video.module.listener.a aVar3 = this.notifyListener;
                    if (aVar3 != null) {
                        this.f160927L0 = true;
                        aVar3.a(2, "");
                        return;
                    }
                    return;
                }
                boolean zM = m();
                if (zM && this.f160930N == 1 && !this.f160948e0) {
                    o();
                    com.mbridge.msdk.video.module.listener.a aVar4 = this.notifyListener;
                    if (aVar4 != null) {
                        aVar4.a(8, "");
                        return;
                    }
                    return;
                }
                if (this.notifyListener != null) {
                    this.f160927L0 = true;
                    if (this.f160707b.getAdType() == 94 && !zM) {
                        this.notifyListener.a(17, "");
                    }
                    this.notifyListener.a(2, c(!zM));
                    return;
                }
                return;
            }
            if (this.f160961o0) {
                if (i10 != com.mbridge.msdk.foundation.same.a.f156298I || (aVar = this.notifyListener) == null) {
                    return;
                }
                this.f160927L0 = true;
                aVar.a(2, c(this.f160969s0));
                return;
            }
            if (i10 == com.mbridge.msdk.foundation.same.a.f156298I && this.f160975v0) {
                com.mbridge.msdk.video.module.listener.a aVar5 = this.notifyListener;
                if (aVar5 != null) {
                    this.f160927L0 = true;
                    aVar5.a(2, c(this.f160969s0));
                    return;
                }
                return;
            }
            if (this.f160967r0) {
                int curPosition = this.mPlayerView.getCurPosition() / 1000;
                int videoLength = (int) ((curPosition / (this.mPlayerView.getDuration() == 0 ? this.f160707b.getVideoLength() : this.mPlayerView.getDuration())) * 100.0f);
                if (this.f160955l0 == com.mbridge.msdk.foundation.same.a.f156297H) {
                    o();
                    int i11 = this.f160957m0;
                    if (i11 == com.mbridge.msdk.foundation.same.a.f156299J && videoLength >= this.f160959n0) {
                        com.mbridge.msdk.video.module.listener.a aVar6 = this.notifyListener;
                        if (aVar6 != null) {
                            this.f160927L0 = true;
                            aVar6.a(2, c(this.f160969s0));
                            return;
                        }
                        return;
                    }
                    if (i11 == com.mbridge.msdk.foundation.same.a.f156300K && curPosition >= this.f160959n0) {
                        com.mbridge.msdk.video.module.listener.a aVar7 = this.notifyListener;
                        if (aVar7 != null) {
                            this.f160927L0 = true;
                            aVar7.a(2, c(this.f160969s0));
                            return;
                        }
                        return;
                    }
                    com.mbridge.msdk.video.module.listener.a aVar8 = this.notifyListener;
                    if (aVar8 != null) {
                        aVar8.a(8, "");
                    }
                }
                if (this.f160955l0 == com.mbridge.msdk.foundation.same.a.f156298I) {
                    int i12 = this.f160957m0;
                    if (i12 == com.mbridge.msdk.foundation.same.a.f156299J && videoLength >= this.f160959n0) {
                        o();
                        com.mbridge.msdk.video.module.listener.a aVar9 = this.notifyListener;
                        if (aVar9 != null) {
                            aVar9.a(8, "");
                            return;
                        }
                        return;
                    }
                    if (i12 != com.mbridge.msdk.foundation.same.a.f156300K || curPosition < this.f160959n0) {
                        return;
                    }
                    o();
                    com.mbridge.msdk.video.module.listener.a aVar10 = this.notifyListener;
                    if (aVar10 != null) {
                        aVar10.a(8, "");
                    }
                }
            }
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i10, int i11, String str) {
        com.mbridge.msdk.video.module.listener.a aVar;
        SoundImageView soundImageView;
        if (this.f160710e) {
            this.f160951h0 = i10;
            if (i10 == 1) {
                this.f160910D.getJSCommon().g(i10);
                SoundImageView soundImageView2 = this.mSoundImageView;
                if (soundImageView2 != null) {
                    soundImageView2.setSoundStatus(false);
                }
                this.mPlayerView.closeSound();
                try {
                    MediaEvents mediaEvents = this.f160953j0;
                    if (mediaEvents != null) {
                        mediaEvents.volumeChange(0.0f);
                        q0.a("omsdk", "play video view:  mute");
                    }
                } catch (Exception e10) {
                    q0.a("OMSDK", e10.getMessage());
                }
            } else if (i10 == 2) {
                this.f160910D.getJSCommon().g(i10);
                SoundImageView soundImageView3 = this.mSoundImageView;
                if (soundImageView3 != null) {
                    soundImageView3.setSoundStatus(true);
                }
                this.mPlayerView.openSound();
                try {
                    MediaEvents mediaEvents2 = this.f160953j0;
                    if (mediaEvents2 != null) {
                        mediaEvents2.volumeChange(1.0f);
                        q0.a("omsdk", "play video view:  unmute");
                    }
                } catch (Exception e11) {
                    q0.a("OMSDK", e11.getMessage());
                }
            }
            CampaignEx campaignEx = this.f160707b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                SoundImageView soundImageView4 = this.mSoundImageView;
                if (soundImageView4 != null) {
                    soundImageView4.setVisibility(0);
                }
            } else if (i11 == 1) {
                SoundImageView soundImageView5 = this.mSoundImageView;
                if (soundImageView5 != null) {
                    soundImageView5.setVisibility(8);
                }
            } else if (i11 == 2 && (soundImageView = this.mSoundImageView) != null) {
                soundImageView.setVisibility(0);
            }
        }
        if (str == null || !str.equals("2") || (aVar = this.notifyListener) == null) {
            return;
        }
        aVar.a(7, Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(boolean z10) {
        if (!this.f160950g0) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.f160961o0) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.f156295F);
            }
            if (this.f160965q0) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.f156293D);
            }
            if (this.f160963p0) {
                jSONObject.put("Alert_window_status", com.mbridge.msdk.foundation.same.a.f156294E);
            }
            jSONObject.put("complete_info", z10 ? 1 : 2);
            return jSONObject.toString();
        } catch (Exception unused) {
            q0.b(MBridgeBaseView.TAG, "getIVRewardStatusString ERROR");
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f160936Q);
            com.mbridge.msdk.foundation.feedback.b.b().a(android.support.v4.media.e.a(new StringBuilder(), this.f160936Q, "_1"), this.f160707b);
        }
        if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
            if (this.f160966r != null) {
                com.mbridge.msdk.foundation.feedback.b.b().a(android.support.v4.media.e.a(new StringBuilder(), this.f160936Q, "_1"), this.f160966r);
            }
        } else {
            FeedBackButton feedBackButton = this.f160966r;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        CollapsibleWebView collapsibleWebView = this.f160919H0;
        if (collapsibleWebView == null || this.f160707b == null || !TextUtils.isEmpty(collapsibleWebView.getUrl())) {
            return;
        }
        this.f160919H0.loadUrl(this.f160707b.getClickURL());
        this.f160919H0.setToolBarTitle(this.f160707b.getAppName());
        com.mbridge.msdk.setting.g gVarA = com.mbridge.msdk.advanced.manager.g.a(com.mbridge.msdk.setting.i.b());
        if (gVarA == null) {
            gVarA = com.mbridge.msdk.setting.i.b().a();
        }
        this.f160919H0.setPageLoadTimtout((int) gVarA.u0());
        this.f160919H0.setPageLoadListener(new d());
        this.f160919H0.setWebViewClient(new e());
        this.f160919H0.setCollapseListener(new f());
        this.f160919H0.setExpandListener(new g());
        this.f160919H0.setExitsClickListener(new h());
    }

    private void h() {
        int iFindLayout = findLayout("mbridge_reward_videoview_item");
        if (i0.a(iFindLayout)) {
            this.f160708c.inflate(iFindLayout, this);
            n();
        }
        f160902W0 = false;
        r();
    }

    private void i() {
        if (this.f160933O0 || this.f160947d0 || this.f160945b0) {
            return;
        }
        this.f160933O0 = true;
        int i10 = this.f160926L;
        if (i10 < 0) {
            return;
        }
        if (i10 == 0) {
            this.f160947d0 = true;
        } else {
            new Handler().postDelayed(new a(), this.f160926L * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx == null || !campaignEx.isDynamicView() || this.f160906B == null) {
            return;
        }
        if (this.f160908C == null) {
            addCTAView();
        }
        if (this.f160906B.getVisibility() != 0) {
            this.f160906B.setVisibility(0);
            postDelayed(this.f160935P0, e0.f86341n);
        } else {
            this.f160906B.setVisibility(8);
            getHandler().removeCallbacks(this.f160935P0);
        }
    }

    private void k() {
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx == null || !a1.b(campaignEx.getVideoResolution())) {
            return;
        }
        String videoResolution = this.f160707b.getVideoResolution();
        q0.c(MBridgeBaseView.TAG, "MBridgeBaseView videoResolution:" + videoResolution);
        String[] strArrSplit = videoResolution.split("x");
        if (strArrSplit.length == 2) {
            if (v0.m(strArrSplit[0]) > 0.0d) {
                this.f160938R = v0.m(strArrSplit[0]);
            }
            if (v0.m(strArrSplit[1]) > 0.0d) {
                this.f160939S = v0.m(strArrSplit[1]);
            }
            q0.c(MBridgeBaseView.TAG, "MBridgeBaseView mVideoW:" + this.f160938R + "  mVideoH:" + this.f160939S);
        }
        if (this.f160938R <= 0.0d) {
            this.f160938R = 1280.0d;
        }
        if (this.f160939S <= 0.0d) {
            this.f160939S = 720.0d;
        }
    }

    private boolean l() {
        try {
            this.mPlayerView = (PlayerView) findViewById(filterFindViewId(this.f160977w0, "mbridge_vfpv"));
            this.mSoundImageView = (SoundImageView) findViewById(filterFindViewId(this.f160977w0, "mbridge_sound_switch"));
            this.f160956m = (TextView) findViewById(filterFindViewId(this.f160977w0, "mbridge_tv_count"));
            View viewFindViewById = findViewById(filterFindViewId(this.f160977w0, "mbridge_rl_playing_close"));
            this.f160958n = viewFindViewById;
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(4);
            }
            this.f160960o = (RelativeLayout) findViewById(filterFindViewId(this.f160977w0, "mbridge_top_control"));
            this.f160962p = (ImageView) findViewById(filterFindViewId(this.f160977w0, "mbridge_videoview_bg"));
            this.f160964q = (ProgressBar) findViewById(filterFindViewId(this.f160977w0, "mbridge_video_progress_bar"));
            this.f160966r = (FeedBackButton) findViewById(filterFindViewId(this.f160977w0, "mbridge_native_endcard_feed_btn"));
            this.f160968s = (ImageView) findViewById(filterFindViewId(this.f160977w0, "mbridge_iv_link"));
            this.f160917G0 = (RelativeLayout) findViewById(filterFindViewId(this.f160977w0, "mbridge_reward_scale_webview_layout"));
            this.f160921I0 = (RelativeLayout) findViewById(filterFindViewId(this.f160977w0, "mbridge_reward_header_layout"));
            if (this.f160917G0 != null) {
                CollapsibleWebView collapsibleWebView = new CollapsibleWebView(getContext());
                this.f160919H0 = collapsibleWebView;
                this.f160917G0.addView(collapsibleWebView, new RelativeLayout.LayoutParams(-1, -1));
            }
            v0.a(1, this.f160968s, this.f160707b, this.f160706a, false, new t());
            this.f160970t = (MBridgeSegmentsProgressBar) findViewById(filterFindViewId(this.f160977w0, "mbridge_reward_segment_progressbar"));
            this.f160906B = (FrameLayout) findViewById(filterFindViewId(this.f160977w0, "mbridge_reward_cta_layout"));
            this.f160981y0 = (MBridgeBaitClickView) findViewById(filterFindViewId(this.f160977w0, "mbridge_animation_click_view"));
            this.f160916G = (RelativeLayout) findViewById(filterFindViewId(this.f160977w0, "mbridge_reward_moreoffer_layout"));
            this.f160913E0 = (MBAcquireRewardPopView) findViewById(filterFindViewId(this.f160977w0, "mbridge_reward_popview"));
            this.tvFlag = (TextView) findViewById(filterFindViewId(this.f160977w0, "mbridge_tv_flag"));
            return isNotNULL(this.mPlayerView, this.mSoundImageView, this.f160956m, this.f160958n);
        } catch (Throwable th) {
            q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    private boolean m() {
        int videoCompleteTime = getVideoCompleteTime();
        int curPosition = (this.mPlayerView.getCurPosition() / 1000) + 1;
        if (this.f160707b.getDynamicTempCode() != 5 || this.mCurrPlayNum <= 1) {
            if ((videoCompleteTime <= 0 || curPosition >= videoCompleteTime) && videoCompleteTime != 0) {
                return false;
            }
        } else if (videoCompleteTime == 0 || videoCompleteTime <= 0 || curPosition >= videoCompleteTime) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        PlayerView playerView;
        boolean zL = l();
        this.f160710e = zL;
        if (!zL) {
            q0.b(MBridgeBaseView.TAG, "MBridgeVideoView init fail");
        }
        if (s0.a().a("i_l_s_t_r_i", false) && (playerView = this.mPlayerView) != null) {
            playerView.setNotifyListener(new n());
        }
        d();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f160979x0 = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        try {
            PlayerView playerView = this.mPlayerView;
            if (playerView != null) {
                playerView.onPause();
                CampaignEx campaignEx = this.f160707b;
                if (campaignEx != null && !campaignEx.isRewardPopViewShowed) {
                    removeCallbacks(this.f160937Q0);
                }
                if (com.mbridge.msdk.util.b.a()) {
                    this.mPlayerView.setIsCovered(this.f160915F0 || this.f160920I || this.f160922J);
                }
                CampaignEx campaignEx2 = this.f160707b;
                if (campaignEx2 == null || campaignEx2.getNativeVideoTracking() == null || this.f160707b.isHasReportAdTrackPause()) {
                    return;
                }
                this.f160707b.setHasReportAdTrackPause(true);
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                CampaignEx campaignEx3 = this.f160707b;
                com.mbridge.msdk.click.a.a(contextD, campaignEx3, this.f160936Q, campaignEx3.getNativeVideoTracking().s(), false, false);
            }
        } catch (Throwable th) {
            q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void d() {
        super.d();
        if (this.f160710e) {
            b1.a(this.mPlayerView, this.f160707b.getLocalRequestId(), this.f160707b.getLocalAllowTrackClick());
            if (this.f160713h) {
                if (com.mbridge.msdk.video.dynview.util.a.b(this.f160707b) == -1 || com.mbridge.msdk.video.dynview.util.a.b(this.f160707b) == 100) {
                    this.mPlayerView.setOnClickListener(new o());
                }
            } else {
                this.mPlayerView.setOnClickListener(new p());
            }
            SoundImageView soundImageView = this.mSoundImageView;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(new q());
            }
            this.f160958n.setOnClickListener(new r());
        }
    }

    private boolean b(int i10, int i11) {
        return i10 > 0 && i11 > 0 && v0.g(this.f160706a) >= i10 && v0.f(this.f160706a) >= i11;
    }

    private void a(ViewGroup viewGroup, CampaignEx campaignEx) {
        com.mbridge.msdk.video.dynview.c cVarB = new com.mbridge.msdk.video.dynview.wrapper.c().b(viewGroup, campaignEx);
        com.mbridge.msdk.video.dynview.b.a().a(cVarB, new l(viewGroup, campaignEx, cVarB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        JSONObject jSONObject;
        if (this.f160972u != null) {
            CampaignEx campaignEx = this.f160707b;
            if (campaignEx != null) {
                campaignEx.setClickTempSource(1);
                try {
                    CampaignEx.c rewardTemplateMode = this.f160707b.getRewardTemplateMode();
                    String str2 = "";
                    if (rewardTemplateMode != null) {
                        str2 = rewardTemplateMode.k() + "";
                    }
                    com.mbridge.msdk.foundation.same.report.j.a(this.f160706a, str, this.f160707b.getCampaignUnitId(), this.f160707b.isBidCampaign(), this.f160707b.getRequestId(), this.f160707b.getRequestIdNotice(), this.f160707b.getId(), str2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.mbridge.msdk.foundation.same.a.f156326j, a(0));
                } catch (JSONException e11) {
                    e = e11;
                    e.printStackTrace();
                }
            } catch (JSONException e12) {
                e = e12;
                jSONObject = null;
            }
            this.f160972u.a(105, jSONObject);
            if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                try {
                    com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d().getApplicationContext(), this.f160707b);
                } catch (Exception e13) {
                    q0.b(MBridgeBaseView.TAG, e13.getMessage());
                }
            }
        }
    }

    private String a(int i10, int i11) {
        if (i11 != 0) {
            try {
                return v0.a(Double.valueOf(i10 / i11)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return z.a(i11, "");
    }

    public class l implements com.mbridge.msdk.video.dynview.listener.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f161003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f161004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.video.dynview.c f161005c;

        public class a extends com.mbridge.msdk.widget.a {
            public a() {
            }

            @Override // com.mbridge.msdk.widget.a
            public void a(View view) {
                if (view instanceof TextView) {
                    MBridgeVideoView.this.f160707b.setTriggerClickSource(1);
                } else {
                    MBridgeVideoView.this.f160707b.setTriggerClickSource(2);
                }
                if (MBridgeVideoView.this.f160707b.getRewardTemplateMode() == null || MBridgeVideoView.this.f160707b.getRewardTemplateMode().k() != 902) {
                    MBridgeVideoView.this.b("video_play_click");
                } else {
                    MBridgeVideoView.this.j();
                }
            }
        }

        public l(ViewGroup viewGroup, CampaignEx campaignEx, com.mbridge.msdk.video.dynview.c cVar) {
            this.f161003a = viewGroup;
            this.f161004b = campaignEx;
            this.f161005c = cVar;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.a aVar) {
            if (aVar != null) {
                if (this.f161003a != null && aVar.b() != null) {
                    aVar.b().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    this.f161003a.addView(aVar.b());
                }
                if (aVar.a() != null) {
                    for (View view : aVar.a()) {
                        b1.a(view, this.f161004b.getLocalRequestId(), this.f161004b.getLocalAllowTrackClick());
                        view.setOnClickListener(new a());
                    }
                }
                MBridgeVideoView.this.f160977w0 = aVar.c();
                MBridgeVideoView.this.n();
                boolean unused = MBridgeVideoView.f160902W0 = false;
                MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                CampaignEx campaignEx = mBridgeVideoView.f160707b;
                if (campaignEx != null) {
                    campaignEx.setTemplateRenderSucc(mBridgeVideoView.f160977w0);
                }
                MBridgeVideoView.this.f160912E = this.f161005c.j();
                MBridgeVideoView.this.f160914F = this.f161005c.e();
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.error.a aVar) {
            q0.b(MBridgeBaseView.TAG, "errorMsg：" + aVar.h());
        }
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (campaignEx.getReady_rate() != -1) {
                return campaignEx.getReady_rate();
            }
            return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f160936Q, false).w();
        }
        return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f160936Q, false).w();
    }

    public MBridgeVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.mMuteSwitch = 0;
        this.f160976w = false;
        this.f160982z = 0;
        this.f160918H = false;
        this.f160920I = false;
        this.f160922J = false;
        this.f160936Q = "";
        this.f160940T = false;
        this.f160941U = false;
        this.f160942V = false;
        this.f160943W = false;
        this.f160944a0 = false;
        this.f160945b0 = false;
        this.f160946c0 = false;
        this.f160947d0 = false;
        this.f160948e0 = false;
        this.f160950g0 = false;
        this.f160951h0 = 2;
        this.f160961o0 = false;
        this.f160963p0 = false;
        this.f160965q0 = false;
        this.f160967r0 = true;
        this.f160969s0 = false;
        this.f160971t0 = false;
        this.f160973u0 = false;
        this.f160975v0 = false;
        this.f160977w0 = false;
        this.f160983z0 = 0;
        this.f160905A0 = 5;
        this.f160907B0 = 5;
        this.f160909C0 = 5;
        this.f160915F0 = false;
        this.f160923J0 = false;
        this.f160925K0 = 0;
        this.f160927L0 = false;
        this.f160929M0 = false;
        this.hasBufferTimeout = false;
        this.f160931N0 = new w(this);
        this.f160933O0 = false;
        this.f160935P0 = new k();
        this.f160937Q0 = new m();
    }
}

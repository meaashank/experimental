package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.g;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView;
import com.mbridge.msdk.video.module.listener.impl.i;
import com.mbridge.msdk.video.module.listener.impl.k;
import com.mbridge.msdk.video.module.listener.impl.l;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class MBridgeContainerView extends MBridgeBaseView implements f, h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f160735A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f160736B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f160737C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f160738D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f160739E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f160740F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f160741G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f160742H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f160743I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f160744J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f160745K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f160746L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f160747M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f160748N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f160749O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private String f160750P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.factory.b f160751Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f160752R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f160753S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private List<CampaignEx> f160754T;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MBridgePlayableView f160755m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MBridgeClickCTAView f160756n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MBridgeClickMiniCardView f160757o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private MBridgeNativeEndCardView f160758p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MBridgeH5EndCardView f160759q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private MBridgeVastEndCardView f160760r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MBridgeLandingPageView f160761s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private MBridgeVideoEndCoverView f160762t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private MBridgeAlertWebview f160763u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private MBridgeOrderCampView f160764v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f160765w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f160766x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f160767y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f160768z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.video.signal.factory.b f160769a;

        public a(com.mbridge.msdk.video.signal.factory.b bVar) {
            this.f160769a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
            mBridgeContainerView.a(this.f160769a, Integer.valueOf(mBridgeContainerView.f160707b.getVideo_end_type()));
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.video.signal.factory.b f160771a;

        public b(com.mbridge.msdk.video.signal.factory.b bVar) {
            this.f160771a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
            mBridgeContainerView.a(this.f160771a, Integer.valueOf(mBridgeContainerView.f160707b.getVideo_end_type()));
        }
    }

    public class c implements com.mbridge.msdk.video.dynview.listener.b {
        public c() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.b
        public void a() {
            com.mbridge.msdk.video.module.listener.a aVar = MBridgeContainerView.this.notifyListener;
            if (aVar != null) {
                aVar.a(117, "");
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.b
        public void b() {
            if (MBridgeContainerView.this.f160707b.getAdSpaceT() == 2) {
                MBridgeContainerView.this.showVideoEndCover();
            } else {
                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                mBridgeContainerView.showEndcard(mBridgeContainerView.f160707b.getVideo_end_type());
            }
        }
    }

    public class d extends i {
        public d(com.mbridge.msdk.video.module.listener.a aVar) {
            super(aVar);
        }

        @Override // com.mbridge.msdk.video.module.listener.impl.i, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
        public void a(int i10, Object obj) {
            super.a(i10, obj);
            if (i10 == 100) {
                MBridgeContainerView.this.webviewshow();
                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                mBridgeContainerView.onConfigurationChanged(mBridgeContainerView.getResources().getConfiguration());
                n nVar = new n();
                nVar.n(MBridgeContainerView.this.f160707b.getRequestId());
                nVar.o(MBridgeContainerView.this.f160707b.getRequestIdNotice());
                nVar.b(MBridgeContainerView.this.f160707b.getId());
                nVar.b(MBridgeContainerView.this.f160707b.isMraid() ? n.f156188N : n.f156189O);
                MBridgeContainerView mBridgeContainerView2 = MBridgeContainerView.this;
                g.d(nVar, mBridgeContainerView2.f160706a, mBridgeContainerView2.f160765w);
            }
        }
    }

    public MBridgeContainerView(Context context) {
        super(context);
        this.f160767y = 1;
        this.f160768z = 1;
        this.f160735A = 1;
        this.f160736B = false;
        this.f160737C = false;
        this.f160738D = false;
        this.f160739E = true;
        this.f160740F = false;
        this.f160741G = false;
        this.f160743I = false;
        this.f160744J = false;
        this.f160752R = false;
        this.f160753S = false;
        this.f160754T = new ArrayList();
    }

    private void addCTAView() {
        if (this.f160756n == null) {
            b(-1);
        }
        if (this.f160756n != null) {
            CampaignEx campaignEx = this.f160707b;
            if (campaignEx == null || !campaignEx.isDynamicView()) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                addView(this.f160756n, 0, layoutParams);
            }
        }
    }

    private void b(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f160751Q = bVar;
        if (this.f160762t == null) {
            MBridgeVideoEndCoverView mBridgeVideoEndCoverView = new MBridgeVideoEndCoverView(this.f160706a);
            this.f160762t = mBridgeVideoEndCoverView;
            mBridgeVideoEndCoverView.setCampaign(this.f160707b);
            this.f160762t.setNotifyListener(new i(this.notifyListener));
            this.f160762t.preLoadData(bVar);
        }
    }

    private void e() {
        if (this.f160763u == null) {
            q();
        }
        MBridgeAlertWebview mBridgeAlertWebview = this.f160763u;
        if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
            removeView(this.f160763u);
        }
        addView(this.f160763u);
    }

    private void f() {
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx != null) {
            boolean zIsDynamicView = campaignEx.isDynamicView();
            boolean zL = v0.l(this.f160707b.getendcard_url());
            if (zIsDynamicView && !zL && !this.f160707b.isMraid()) {
                j();
                return;
            }
        }
        if (this.f160767y != 2 || this.f160743I) {
            j();
        } else {
            g();
        }
    }

    private void g() {
        if (this.f160759q == null) {
            a(this.f160751Q, (Integer) 2);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f160759q;
        if (mBridgeH5EndCardView == null || !mBridgeH5EndCardView.isLoadSuccess()) {
            j();
            MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f160759q;
            if (mBridgeH5EndCardView2 != null) {
                mBridgeH5EndCardView2.reportRenderResult(Jb.d.f58184l, 3);
                this.f160759q.setError(true);
            }
        } else {
            this.f160743I = true;
            addView(this.f160759q);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f160759q.excuteTask();
            this.f160759q.setNotchValue(this.f160750P, this.f160745K, this.f160746L, this.f160747M, this.f160748N);
            n nVar = new n();
            nVar.n(this.f160707b.getRequestId());
            nVar.o(this.f160707b.getRequestIdNotice());
            nVar.b(this.f160707b.getId());
            nVar.b(this.f160707b.isMraid() ? n.f156188N : n.f156189O);
            g.d(nVar, this.f160706a, this.f160765w);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView3 = this.f160759q;
        if (mBridgeH5EndCardView3 != null) {
            mBridgeH5EndCardView3.setUnitId(this.f160765w);
        }
    }

    private void h() {
        if (this.f160761s == null) {
            a(this.f160751Q, (Integer) 4);
        }
        this.f160761s.setUnitId(this.f160765w);
        this.f160761s.preLoadData(this.f160751Q);
        addView(this.f160761s);
    }

    private void i() {
        if (this.f160757o == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.f160738D && this.f160739E) {
            this.f160739E = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f160757o, layoutParams);
    }

    private void j() {
        this.f160767y = 1;
        if (this.f160758p == null) {
            a(this.f160751Q, (Integer) 2);
        }
        addView(this.f160758p);
        onConfigurationChanged(getResources().getConfiguration());
        this.f160758p.notifyShowListener();
        this.f160753S = true;
        bringToFront();
    }

    private void k() {
        if (this.f160755m == null) {
            preLoadData(this.f160751Q);
        }
        addView(this.f160755m);
        MBridgePlayableView mBridgePlayableView = this.f160755m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.setUnitId(this.f160765w);
            CampaignEx campaignEx = this.f160707b;
            if (campaignEx != null && campaignEx.isMraid() && this.f160707b.getPlayable_ads_without_video() == 2) {
                this.f160755m.setCloseVisible(0);
            }
            this.f160755m.setNotchValue(this.f160750P, this.f160745K, this.f160746L, this.f160747M, this.f160748N);
        }
    }

    private void l() {
        if (this.f160760r == null) {
            a(this.f160751Q, (Integer) 3);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        addView(this.f160760r, layoutParams);
        this.f160760r.notifyShowListener();
    }

    private void m() {
        if (this.f160762t == null) {
            b(this.f160751Q);
        }
        addView(this.f160762t);
        onConfigurationChanged(getResources().getConfiguration());
        this.f160753S = true;
        bringToFront();
    }

    private boolean n() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1;
    }

    private void o() {
        this.f160737C = false;
        this.f160753S = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i10 = 0;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof MBridgeContainerView) {
                    i10++;
                } else {
                    viewGroup.bringChildToFront(childAt);
                }
            }
        }
    }

    private void p() {
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getendcard_url();
        int i10 = 404;
        if (!TextUtils.isEmpty(str)) {
            try {
                i10 = Integer.parseInt(c1.a(str, "ecid"));
            } catch (Throwable th) {
                q0.b(MBridgeBaseView.TAG, th.getMessage());
            }
        }
        this.f160758p = new MBridgeNativeEndCardView(this.f160706a, null, true, i10, this.f160707b.getAdSpaceT() == 2, this.f160716k, this.f160707b.getMof_tplid());
        if (this.f160707b.getDynamicTempCode() != 5) {
            this.f160758p.setCampaign(this.f160707b);
            return;
        }
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.f160707b);
        }
        this.f160758p.setCampaign(this.f160707b);
    }

    private void q() {
        if (this.f160763u == null) {
            MBridgeAlertWebview mBridgeAlertWebview = new MBridgeAlertWebview(this.f160706a);
            this.f160763u = mBridgeAlertWebview;
            mBridgeAlertWebview.setUnitId(this.f160765w);
            this.f160763u.setCampaign(this.f160707b);
        }
        this.f160763u.preLoadData(this.f160751Q);
    }

    private void r() {
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    public void addOrderViewData(List<CampaignEx> list) {
        if (list == null) {
            return;
        }
        this.f160754T = list;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view == null) {
            q0.b(MBridgeBaseView.TAG, "view is null");
        } else {
            a(view);
            super.addView(view);
        }
    }

    public boolean canBackPress() {
        if (this.f160758p != null) {
            return false;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f160759q;
        if (mBridgeH5EndCardView != null) {
            return mBridgeH5EndCardView.canBackPress();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f160761s;
        if (mBridgeLandingPageView != null) {
            return mBridgeLandingPageView.canBackPress();
        }
        MBridgePlayableView mBridgePlayableView = this.f160755m;
        if (mBridgePlayableView != null) {
            return mBridgePlayableView.canBackPress();
        }
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i10, int i11, int i12) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f160757o;
        if (mBridgeClickMiniCardView == null || mBridgeClickMiniCardView.getVisibility() != 0) {
            return;
        }
        this.f160757o.resizeMiniCard(i10, i11);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        return this.f160736B;
    }

    public boolean endcardIsPlayable() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f160759q;
        return mBridgeH5EndCardView != null && mBridgeH5EndCardView.isPlayable();
    }

    public MBridgeH5EndCardView getH5EndCardView() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f160759q;
        return mBridgeH5EndCardView == null ? this.f160755m : mBridgeH5EndCardView;
    }

    public CampaignEx getReSetCampaign() {
        if (!this.f160707b.isDynamicView() || !TextUtils.isEmpty(this.f160707b.getendcard_url())) {
            return null;
        }
        int size = this.f160754T.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (this.f160754T.get(i11) != null && this.f160754T.get(i11).getId() == this.f160707b.getId()) {
                    i10 = i11 - 1;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        if (i10 < 0 || i10 >= size || this.f160754T.get(i10) == null) {
            return null;
        }
        return this.f160754T.get(i10);
    }

    public boolean getShowingTransparent() {
        return this.f160738D;
    }

    public String getUnitID() {
        return this.f160765w;
    }

    public int getVideoInteractiveType() {
        return this.f160766x;
    }

    public int getVideoSkipTime() {
        return this.f160742H;
    }

    public void handlerPlayableException(String str) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f160759q;
        if (mBridgeH5EndCardView == null) {
            f();
            return;
        }
        mBridgeH5EndCardView.handlerPlayableException(str);
        if (this.f160743I) {
            f();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        if (isLast()) {
            return;
        }
        if (this.f160752R && !this.f160753S) {
            o();
            this.f160752R = false;
        }
        MBridgeAlertWebview mBridgeAlertWebview = this.f160763u;
        if (mBridgeAlertWebview == null || mBridgeAlertWebview.getParent() == null) {
            return;
        }
        removeView(this.f160763u);
        MBridgeClickCTAView mBridgeClickCTAView = this.f160756n;
        if (mBridgeClickCTAView == null || mBridgeClickCTAView.getParent() == null) {
            return;
        }
        r();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        setVisibility(0);
    }

    public void install(CampaignEx campaignEx) {
        this.notifyListener.a(105, campaignEx);
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup != null && viewGroup.indexOfChild(this) == 0;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void ivRewardAdsWithoutVideo(String str) {
        this.notifyListener.a(103, str);
    }

    public boolean miniCardLoaded() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f160757o;
        return mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.isLoadSuccess();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        return this.f160737C;
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        MBridgePlayableView mBridgePlayableView = this.f160755m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.notifyCloseBtn(i10);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f160759q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.notifyCloseBtn(i10);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(configuration, this.f160755m, this.f160756n, this.f160757o, this.f160758p, this.f160759q, this.f160760r, this.f160761s, this.f160762t);
    }

    public void onEndcardBackPress() {
        if (this.f160758p != null || this.f160760r != null) {
            this.notifyListener.a(104, "");
            try {
                com.mbridge.msdk.video.dynview.moffer.a.a().b();
                return;
            } catch (Exception e10) {
                q0.b(MBridgeBaseView.TAG, e10.getMessage());
                return;
            }
        }
        if (this.f160761s != null) {
            this.notifyListener.a(103, "");
            return;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f160759q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.onBackPress();
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.f160737C) {
            this.notifyListener.a(107, "");
        }
    }

    public void onPlayableBackPress() {
        MBridgePlayableView mBridgePlayableView = this.f160755m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.onBackPress();
        }
    }

    public void orientation(Configuration configuration) {
        a(this.f160755m, this.f160757o, this.f160759q, this.f160763u);
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f160751Q = bVar;
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx != null) {
            if (campaignEx.getPlayable_ads_without_video() == 2) {
                a(bVar);
            } else {
                b(this.f160766x);
                if (this.f160707b.isDynamicView()) {
                    try {
                        a(bVar, Integer.valueOf(this.f160707b.getVideo_end_type()));
                    } catch (Throwable th) {
                        q0.b(MBridgeBaseView.TAG, th.getMessage());
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new a(bVar));
                    }
                    if (!v0.l(this.f160707b.getendcard_url())) {
                        try {
                            String strA = c1.a(this.f160707b.getendcard_url(), "mof");
                            if (!TextUtils.isEmpty(strA) && Integer.parseInt(strA) == 1) {
                                com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f160707b, 2);
                            }
                        } catch (Exception e10) {
                            q0.b(MBridgeBaseView.TAG, e10.getMessage());
                        }
                    }
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new b(bVar), getVideoSkipTime());
                }
            }
            q();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i10) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f160759q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.readyStatus(i10);
        }
    }

    public void release() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f160759q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.release();
            this.f160759q = null;
        }
        MBridgePlayableView mBridgePlayableView = this.f160755m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.release();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f160761s;
        if (mBridgeLandingPageView != null) {
            mBridgeLandingPageView.release();
        }
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f160758p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.clearMoreOfferBitmap();
            this.f160758p.release();
        }
        if (this.notifyListener != null) {
            this.notifyListener = null;
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i10, int i11, int i12) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f160757o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.resizeMiniCard(i10, i11);
            this.f160757o.setRadius(i12);
            removeAllViews();
            setMatchParent();
            this.f160753S = true;
            bringToFront();
            i();
        }
    }

    public void setCloseDelayTime(int i10) {
        this.f160768z = i10;
    }

    public void setEndscreenType(int i10) {
        this.f160767y = i10;
    }

    public void setJSFactory(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f160751Q = bVar;
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f160757o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMBridgeClickMiniCardViewTransparent();
            this.f160757o.setMBridgeClickMiniCardViewClickable(false);
        }
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13, int i14) {
        q0.b(MBridgeBaseView.TAG, "NOTCH ContainerView ".concat(String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i10))));
        this.f160749O = i10;
        this.f160745K = i11;
        this.f160746L = i12;
        this.f160747M = i13;
        this.f160748N = i14;
        this.f160750P = d0.a(i10, i11, i12, i13, i14);
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f160758p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setNotchPadding(i11, i12, i13, i14);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f160759q;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f160793p != null) {
            mBridgeH5EndCardView.setNotchValue(this.f160750P, i11, i12, i13, i14);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f160759q.f160793p, "oncutoutfetched", Base64.encodeToString(this.f160750P.getBytes(), 0));
        }
        MBridgePlayableView mBridgePlayableView = this.f160755m;
        if (mBridgePlayableView != null && mBridgePlayableView.f160793p != null) {
            mBridgePlayableView.setNotchValue(this.f160750P, i11, i12, i13, i14);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f160755m.f160793p, "oncutoutfetched", Base64.encodeToString(this.f160750P.getBytes(), 0));
        }
        MBridgeOrderCampView mBridgeOrderCampView = this.f160764v;
        if (mBridgeOrderCampView != null) {
            mBridgeOrderCampView.setNotchPadding(i11, i12, i13, i14);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setNotifyListener(com.mbridge.msdk.video.module.listener.a aVar) {
        super.setNotifyListener(aVar);
        a(aVar, this.f160755m, this.f160756n, this.f160757o, this.f160758p, this.f160759q, this.f160760r, this.f160761s, this.f160762t);
    }

    public void setOnPause() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f160758p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f160758p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i10) {
        this.f160735A = i10;
    }

    public void setRewardStatus(boolean z10) {
        this.f160744J = z10;
    }

    public void setShowingTransparent(boolean z10) {
        this.f160738D = z10;
    }

    public void setUnitID(String str) {
        this.f160765w = str;
    }

    public void setVideoInteractiveType(int i10) {
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx == null || !campaignEx.isDynamicView()) {
            this.f160766x = i10;
            return;
        }
        int iB = com.mbridge.msdk.video.dynview.util.a.b(this.f160707b);
        if (iB == 100) {
            this.f160766x = i10;
        } else {
            this.f160766x = iB;
        }
    }

    public void setVideoSkipTime(int i10) {
        this.f160742H = i10;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        MBridgeAlertWebview mBridgeAlertWebview = this.f160763u;
        if (mBridgeAlertWebview == null || !mBridgeAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        if (!n() && !this.f160753S) {
            removeAllViews();
            bringToFront();
            this.f160752R = true;
        }
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f160757o;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
            return false;
        }
        e();
        setBackgroundColor(0);
        this.f160763u.webviewshow();
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i10) {
        CampaignEx campaignEx = this.f160707b;
        if (campaignEx != null) {
            if (i10 == 1) {
                this.notifyListener.a(104, "");
            } else if (i10 == 100) {
                if (campaignEx.getPlayable_ads_without_video() == 2) {
                    this.f160741G = true;
                }
                a(this.f160755m);
                setMatchParent();
                j();
            } else if (i10 == 3) {
                removeAllViews();
                setMatchParent();
                l();
                this.f160753S = true;
                bringToFront();
            } else if (i10 == 4) {
                this.notifyListener.a(113, "");
                removeAllViews();
                setMatchParent();
                h();
                this.f160753S = true;
                bringToFront();
            } else if (i10 != 5) {
                removeAllViews();
                setMatchParent();
                this.f160753S = true;
                bringToFront();
                f();
                this.notifyListener.a(117, "");
            } else {
                this.notifyListener.a(106, "");
            }
        }
        this.f160736B = true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i10, int i11, int i12, int i13, int i14) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f160757o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMiniCardLocation(i10, i11, i12, i13);
            this.f160757o.setRadius(i14);
            this.f160757o.setCloseVisible(8);
            this.f160757o.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.f160753S = true;
            bringToFront();
            i();
            if (this.f160740F) {
                return;
            }
            this.f160740F = true;
            this.notifyListener.a(109, "");
            this.notifyListener.a(117, "");
        }
    }

    public void showOrderCampView() {
        MBridgeOrderCampView mBridgeOrderCampView = new MBridgeOrderCampView(this.f160706a);
        this.f160764v = mBridgeOrderCampView;
        mBridgeOrderCampView.setCampaignExes(this.f160754T);
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.f160754T);
        }
        this.f160764v.setNotifyListener(new i(this.notifyListener));
        this.f160764v.setRewarded(this.f160744J);
        this.f160764v.setNotchPadding(this.f160745K, this.f160746L, this.f160747M, this.f160748N);
        this.f160764v.setCampOrderViewBuildCallback(new c());
        this.f160764v.createView(this);
    }

    public void showPlayableView() {
        if (this.f160707b == null || this.f160741G) {
            return;
        }
        removeAllViews();
        setMatchParent();
        k();
        this.f160753S = true;
        bringToFront();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i10) {
        if (this.f160707b != null) {
            if (i10 == -1) {
                if (isLast() || endCardShowing()) {
                    return;
                }
                o();
                return;
            }
            if (i10 == 1) {
                if (this.f160736B) {
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView = this.f160759q;
                if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getParent() != null) {
                    removeView(this.f160759q);
                }
                MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f160757o;
                if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
                    removeView(this.f160757o);
                }
                MBridgeClickCTAView mBridgeClickCTAView = this.f160756n;
                if (mBridgeClickCTAView == null || mBridgeClickCTAView.getParent() == null) {
                    try {
                        CampaignEx campaignEx = this.f160707b;
                        if (campaignEx != null && campaignEx.getPlayable_ads_without_video() == 1) {
                            this.f160753S = true;
                            addCTAView();
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                    return;
                }
                return;
            }
            if (i10 != 2) {
                return;
            }
            MBridgeClickCTAView mBridgeClickCTAView2 = this.f160756n;
            if (mBridgeClickCTAView2 != null && mBridgeClickCTAView2.getParent() != null) {
                removeView(this.f160756n);
            }
            MBridgeAlertWebview mBridgeAlertWebview = this.f160763u;
            if (mBridgeAlertWebview == null || mBridgeAlertWebview.getParent() == null) {
                MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f160757o;
                if (mBridgeClickMiniCardView2 == null || mBridgeClickMiniCardView2.getParent() == null) {
                    try {
                        CampaignEx campaignEx2 = this.f160707b;
                        if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 1) {
                            setMatchParent();
                            i();
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                if (!miniCardLoaded()) {
                    o();
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f160759q;
                if (mBridgeH5EndCardView2 != null && mBridgeH5EndCardView2.getParent() != null) {
                    removeView(this.f160759q);
                }
                this.notifyListener.a(112, "");
                CampaignEx campaignEx3 = this.f160707b;
                if (campaignEx3 != null && !campaignEx3.isHasReportAdTrackPause()) {
                    this.f160707b.setHasReportAdTrackPause(true);
                    com.mbridge.msdk.video.module.report.b.c(this.f160706a, this.f160707b);
                }
                if (this.f160738D) {
                    this.notifyListener.a(115, "");
                } else {
                    this.f160753S = true;
                    bringToFront();
                    webviewshow();
                    onConfigurationChanged(getResources().getConfiguration());
                }
                this.f160737C = true;
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        m();
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        MBridgePlayableView mBridgePlayableView = this.f160755m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.toggleCloseBtn(i10);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f160759q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.toggleCloseBtn(i10);
        }
    }

    public void triggerCloseBtn(String str) {
        try {
            e eVar = new e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", this.f160707b);
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
        if (this.f160707b != null) {
            this.notifyListener.a(122, "");
            this.notifyListener.a(104, "");
        }
    }

    public void webviewshow() {
        try {
            e eVar = new e();
            eVar.a("type", 3);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000133", this.f160707b, eVar);
        } catch (Exception unused) {
        }
        b(this.f160755m, this.f160757o, this.f160759q, this.f160763u);
    }

    private void a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th) {
                q0.b(MBridgeBaseView.TAG, th.getMessage(), th);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            a(view);
            super.addView(view, layoutParams);
        } else {
            q0.b(MBridgeBaseView.TAG, "view is null");
        }
    }

    private void a(com.mbridge.msdk.video.signal.factory.b bVar) {
        if (this.f160755m == null) {
            this.f160755m = new MBridgePlayableView(this.f160706a);
        }
        this.f160755m.setCloseDelayShowTime(this.f160768z);
        this.f160755m.setPlayCloseBtnTm(this.f160735A);
        this.f160755m.setCampaign(this.f160707b);
        this.f160755m.setNotifyListener(new d(this.notifyListener));
        this.f160755m.preLoadData(bVar);
    }

    private void b(int i10) {
        if (i10 != -3) {
            if (i10 != -2) {
                if (this.f160756n == null) {
                    this.f160756n = new MBridgeClickCTAView(this.f160706a);
                }
                this.f160756n.setCampaign(this.f160707b);
                this.f160756n.setUnitId(this.f160765w);
                this.f160756n.setNotifyListener(new i(this.notifyListener));
                this.f160756n.preLoadData(this.f160751Q);
                return;
            }
            CampaignEx campaignEx = this.f160707b;
            if (campaignEx == null || campaignEx.getVideo_end_type() != 2) {
                return;
            }
            if (this.f160757o == null) {
                this.f160757o = new MBridgeClickMiniCardView(this.f160706a);
            }
            this.f160757o.setCampaign(this.f160707b);
            MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f160757o;
            mBridgeClickMiniCardView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.g(mBridgeClickMiniCardView, this.notifyListener));
            this.f160757o.preLoadData(this.f160751Q);
            setMatchParent();
            i();
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.video.signal.factory.b bVar, Integer num) {
        CampaignEx campaignEx;
        com.mbridge.msdk.video.module.listener.a aVar;
        CampaignEx campaignEx2;
        this.f160751Q = bVar;
        CampaignEx campaignEx3 = this.f160707b;
        if (campaignEx3 != null) {
            if (num == null) {
                num = Integer.valueOf(campaignEx3.getVideo_end_type());
            }
            if (!isLast()) {
                o();
            }
            int iIntValue = num.intValue();
            if (iIntValue != 1) {
                if (iIntValue == 3) {
                    if (this.f160760r == null) {
                        this.f160760r = new MBridgeVastEndCardView(this.f160706a);
                    }
                    this.f160760r.setCampaign(this.f160707b);
                    this.f160760r.setNotifyListener(new l(this.notifyListener));
                    this.f160760r.preLoadData(bVar);
                    return;
                }
                if (iIntValue == 4) {
                    if (this.f160761s == null) {
                        this.f160761s = new MBridgeLandingPageView(this.f160706a);
                    }
                    this.f160761s.setCampaign(this.f160707b);
                    this.f160761s.setNotifyListener(new i(this.notifyListener));
                    return;
                }
                if (iIntValue != 5) {
                    if (this.f160767y == 2) {
                        boolean zIsDynamicView = this.f160707b.isDynamicView();
                        boolean zL = v0.l(this.f160707b.getendcard_url());
                        if ((zIsDynamicView && !zL && (campaignEx2 = this.f160707b) != null && !campaignEx2.isMraid()) || (campaignEx = this.f160707b) == null || campaignEx.getAdSpaceT() == 2) {
                            return;
                        }
                        if (this.f160759q == null) {
                            this.f160759q = new MBridgeH5EndCardView(this.f160706a);
                            try {
                                e eVar = new e();
                                eVar.a("type", 3);
                                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", this.f160707b, eVar);
                            } catch (Throwable th) {
                                q0.b(MBridgeBaseView.TAG, th.getMessage());
                            }
                        }
                        if (this.f160707b.getDynamicTempCode() == 5 && (aVar = this.notifyListener) != null && (aVar instanceof k)) {
                            ((k) aVar).a(this.f160707b);
                        }
                        this.f160759q.setCampaign(this.f160707b);
                        this.f160759q.setCloseDelayShowTime(this.f160768z);
                        this.f160759q.setNotifyListener(new i(this.notifyListener));
                        this.f160759q.setUnitId(this.f160765w);
                        this.f160759q.setNotchValue(this.f160750P, this.f160745K, this.f160746L, this.f160747M, this.f160748N);
                        this.f160759q.preLoadData(bVar);
                        if (this.f160738D) {
                            return;
                        }
                        addView(this.f160759q);
                        return;
                    }
                    CampaignEx campaignEx4 = this.f160707b;
                    int iG = (campaignEx4 == null || campaignEx4.getRewardTemplateMode() == null) ? 0 : this.f160707b.getRewardTemplateMode().g();
                    if (this.f160758p == null) {
                        CampaignEx campaignEx5 = this.f160707b;
                        if (campaignEx5 != null && campaignEx5.isDynamicView()) {
                            p();
                        } else {
                            Context context = this.f160706a;
                            CampaignEx campaignEx6 = this.f160707b;
                            boolean z10 = campaignEx6 != null && campaignEx6.getAdSpaceT() == 2;
                            CampaignEx campaignEx7 = this.f160707b;
                            MBridgeNativeEndCardView mBridgeNativeEndCardView = new MBridgeNativeEndCardView(context, null, false, -1, z10, iG, campaignEx7 != null ? campaignEx7.getMof_tplid() : 0);
                            this.f160758p = mBridgeNativeEndCardView;
                            mBridgeNativeEndCardView.setCampaign(this.f160707b);
                        }
                    }
                    this.f160758p.setLayout();
                    if (this.f160707b.isDynamicView()) {
                        if (com.mbridge.msdk.video.dynview.moffer.a.a().b(this.f160707b.getRequestId() + "_" + this.f160707b.getId())) {
                            try {
                                com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f160758p, this.f160707b.getRequestId() + "_" + this.f160707b.getId(), new i(this.notifyListener));
                            } catch (Exception e10) {
                                q0.b(MBridgeBaseView.TAG, e10.getMessage());
                            }
                        } else {
                            try {
                                String strA = c1.a(this.f160707b.getendcard_url(), "mof");
                                if (!TextUtils.isEmpty(strA) && Integer.parseInt(strA) == 1) {
                                    com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f160707b, this.f160758p, new i(this.notifyListener), 2);
                                }
                            } catch (Exception e11) {
                                q0.b(MBridgeBaseView.TAG, e11.getMessage());
                            }
                        }
                    }
                    this.f160758p.setUnitId(this.f160765w);
                    this.f160758p.setCloseBtnDelay(this.f160768z);
                    this.f160758p.setNotifyListener(new i(this.notifyListener));
                    this.f160758p.preLoadData(bVar);
                    this.f160758p.setNotchPadding(this.f160745K, this.f160746L, this.f160747M, this.f160748N);
                }
            }
        }
    }

    public MBridgeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f160767y = 1;
        this.f160768z = 1;
        this.f160735A = 1;
        this.f160736B = false;
        this.f160737C = false;
        this.f160738D = false;
        this.f160739E = true;
        this.f160740F = false;
        this.f160741G = false;
        this.f160743I = false;
        this.f160744J = false;
        this.f160752R = false;
        this.f160753S = false;
        this.f160754T = new ArrayList();
    }

    private void b(MBridgeH5EndCardView... mBridgeH5EndCardViewArr) {
        for (MBridgeH5EndCardView mBridgeH5EndCardView : mBridgeH5EndCardViewArr) {
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0 && mBridgeH5EndCardView.getParent() != null && !isLast()) {
                mBridgeH5EndCardView.webviewshow();
            }
        }
    }

    private void a(com.mbridge.msdk.video.module.listener.a aVar, MBridgeBaseView... mBridgeBaseViewArr) {
        for (MBridgeBaseView mBridgeBaseView : mBridgeBaseViewArr) {
            if (mBridgeBaseView != null) {
                if (mBridgeBaseView instanceof MBridgeClickMiniCardView) {
                    mBridgeBaseView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.g(this.f160757o, aVar));
                } else {
                    mBridgeBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    private void a(Configuration configuration, MBridgeBaseView... mBridgeBaseViewArr) {
        for (MBridgeBaseView mBridgeBaseView : mBridgeBaseViewArr) {
            if (mBridgeBaseView != null && (mBridgeBaseView instanceof MBridgeClickMiniCardView)) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            } else if (mBridgeBaseView != null && mBridgeBaseView.getVisibility() == 0 && mBridgeBaseView.getParent() != null && !isLast()) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    private void a(MBridgeH5EndCardView... mBridgeH5EndCardViewArr) {
        for (MBridgeH5EndCardView mBridgeH5EndCardView : mBridgeH5EndCardViewArr) {
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0) {
                mBridgeH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }
}

package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.a;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.impl.i;
import com.mbridge.msdk.video.signal.impl.j;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.video.signal.impl.m;
import com.mbridge.msdk.video.signal.impl.n;
import com.mbridge.msdk.video.signal.impl.o;
import com.mbridge.msdk.video.signal.impl.q;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class b extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Activity f161403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WebView f161404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBridgeVideoView f161405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MBridgeContainerView f161406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CampaignEx f161407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MBridgeBTContainer f161408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a.InterfaceC0651a f161409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f161410o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<CampaignEx> f161411p;

    public b(Activity activity) {
        this.f161403h = activity;
    }

    public void a(k kVar) {
        this.f161397b = kVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        WebView webView = this.f161404i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f161396a == null) {
            this.f161396a = new i(webView);
        }
        return this.f161396a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.i getIJSRewardVideoV1() {
        Activity activity;
        MBridgeContainerView mBridgeContainerView = this.f161406k;
        if (mBridgeContainerView == null || (activity = this.f161403h) == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.f161401f == null) {
            this.f161401f = new o(activity, mBridgeContainerView);
        }
        return this.f161401f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f161403h == null || this.f161408m == null) {
            return super.getJSBTModule();
        }
        if (this.f161402g == null) {
            this.f161402g = new j(this.f161403h, this.f161408m);
        }
        return this.f161402g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        CampaignEx campaignEx;
        List<CampaignEx> list;
        Activity activity = this.f161403h;
        if (activity == null || (campaignEx = this.f161407l) == null) {
            return super.getJSCommon();
        }
        if (this.f161397b == null) {
            this.f161397b = new k(activity, campaignEx);
        }
        if (this.f161407l.getDynamicTempCode() == 5 && (list = this.f161411p) != null) {
            d dVar = this.f161397b;
            if (dVar instanceof k) {
                ((k) dVar).a(list);
            }
        }
        this.f161397b.setActivity(this.f161403h);
        this.f161397b.setUnitId(this.f161410o);
        this.f161397b.a(this.f161409n);
        return this.f161397b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        MBridgeContainerView mBridgeContainerView = this.f161406k;
        if (mBridgeContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f161400e == null) {
            this.f161400e = new m(mBridgeContainerView);
        }
        return this.f161400e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        WebView webView = this.f161404i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f161399d == null) {
            this.f161399d = new n(webView);
        }
        return this.f161399d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.j getJSVideoModule() {
        MBridgeVideoView mBridgeVideoView = this.f161405j;
        if (mBridgeVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f161398c == null) {
            this.f161398c = new q(mBridgeVideoView);
        }
        return this.f161398c;
    }

    public void a(List<CampaignEx> list) {
        this.f161411p = list;
    }

    public b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f161403h = activity;
        this.f161408m = mBridgeBTContainer;
        this.f161404i = webView;
    }

    public b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, a.InterfaceC0651a interfaceC0651a) {
        this.f161403h = activity;
        this.f161404i = webView;
        this.f161405j = mBridgeVideoView;
        this.f161406k = mBridgeContainerView;
        this.f161407l = campaignEx;
        this.f161409n = interfaceC0651a;
        this.f161410o = mBridgeVideoView.getUnitId();
    }
}

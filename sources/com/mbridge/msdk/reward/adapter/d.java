package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f158190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f158191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f158192c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f158193d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f158194e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f158195f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f158196g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f158197h = 0;

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f158190a = copyOnWriteArrayList;
    }

    public CopyOnWriteArrayList<CampaignEx> b() {
        return this.f158190a;
    }

    public int c() {
        return this.f158196g;
    }

    public int d() {
        return this.f158195f;
    }

    public boolean e() {
        return this.f158192c;
    }

    public void a(boolean z10) {
        this.f158192c = z10;
    }

    public void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f158191b = campaignEx;
            this.f158193d = campaignEx.getSecondRequestIndex();
            this.f158194e = campaignEx.getSecondShowIndex();
            this.f158195f = campaignEx.getFilterCallBackState();
            this.f158197h = campaignEx.getFilterAdsShowCallState();
            this.f158196g = campaignEx.getFilterAdsVideoCallState();
        }
    }

    public boolean a() {
        return this.f158193d == 1 && this.f158192c;
    }
}

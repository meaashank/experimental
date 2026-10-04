package com.mbridge.msdk.mbnative.listener;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class a implements NativeListener.NativeAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NativeListener.NativeAdListener f157470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f157471b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f157472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f157473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f157474e;

    public a() {
    }

    public void a(boolean z10) {
        this.f157474e = z10;
    }

    public void b() {
        this.f157471b = true;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdClick(Campaign campaign) {
        NativeListener.NativeAdListener nativeAdListener = this.f157470a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdClick(campaign);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdFramesLoaded(List<Frame> list) {
        NativeListener.NativeAdListener nativeAdListener = this.f157470a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdFramesLoaded(list);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoadError(String str) {
        this.f157471b = false;
        NativeListener.NativeAdListener nativeAdListener = this.f157470a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f157473d == null) {
                this.f157473d = c.n().d();
            }
            if (TextUtils.isEmpty(this.f157472c)) {
                return;
            }
            com.mbridge.msdk.mbnative.report.a.a(this.f157473d, str, this.f157472c, this.f157474e, (CampaignEx) null);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoaded(List<Campaign> list, int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        try {
            this.f157471b = false;
            synchronized (list) {
                copyOnWriteArrayList = new CopyOnWriteArrayList(list);
            }
            if (this.f157470a != null) {
                if (copyOnWriteArrayList.size() > 0) {
                    this.f157470a.onAdLoaded(copyOnWriteArrayList, i10);
                } else {
                    this.f157470a.onAdLoaded(list, i10);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onLoggingImpression(int i10) {
        NativeListener.NativeAdListener nativeAdListener = this.f157470a;
        if (nativeAdListener != null) {
            nativeAdListener.onLoggingImpression(i10);
        }
    }

    public void a(String str) {
        this.f157472c = str;
    }

    public a(NativeListener.NativeAdListener nativeAdListener) {
        this.f157470a = nativeAdListener;
    }

    public boolean a() {
        return this.f157471b;
    }

    public void a(CampaignEx campaignEx, String str) {
        this.f157471b = false;
        NativeListener.NativeAdListener nativeAdListener = this.f157470a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f157473d == null) {
                this.f157473d = c.n().d();
            }
            if (TextUtils.isEmpty(this.f157472c)) {
                return;
            }
            com.mbridge.msdk.mbnative.report.a.a(this.f157473d, str, this.f157472c, this.f157474e, campaignEx);
        }
    }
}

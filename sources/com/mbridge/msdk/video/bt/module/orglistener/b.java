package com.mbridge.msdk.video.bt.module.orglistener;

import com.bumptech.glide.load.engine.GlideException;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes5.dex */
public class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f160427a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f160428b = null;

    public void a() {
        this.f160428b = Boolean.TRUE;
    }

    public void b() {
        this.f160427a = Boolean.TRUE;
    }

    public Boolean c() {
        return this.f160428b;
    }

    public Boolean d() {
        return this.f160427a;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        q0.a("ShowRewardListener", "onAdShow");
        this.f160427a = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void b(String str, String str2) {
        com.mbridge.msdk.advanced.manager.f.a("onVideoComplete: ", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
        q0.a("ShowRewardListener", "onAdClose:isCompleteView:" + z10 + ",reward:" + cVar2);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        com.mbridge.msdk.advanced.manager.f.a("onShowFail:", str, "ShowRewardListener");
        this.f160428b = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, String str, String str2) {
        com.mbridge.msdk.advanced.manager.f.a("onVideoAdClicked:", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, int i10) {
        q0.a("ShowRewardListener", "onAdCloseWithIVReward: " + z10 + GlideException.a.f139488d + i10);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(String str, String str2) {
        com.mbridge.msdk.advanced.manager.f.a("onEndcardShow: ", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(int i10, String str, String str2) {
        com.mbridge.msdk.advanced.manager.f.a("onAutoLoad: ", str2, "ShowRewardListener");
    }
}

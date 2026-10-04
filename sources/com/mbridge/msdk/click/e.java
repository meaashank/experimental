package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes5.dex */
public class e extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f153999e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f154002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p f154003i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    JumpLoaderResult f153996b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f153997c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f153998d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f154000f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f154001g = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f154004j = new Handler(Looper.getMainLooper());

    public e(Context context) {
        this.f154002h = new com.mbridge.msdk.foundation.same.task.b(context);
        this.f154003i = new p(context);
    }

    public void a(String str, CampaignEx campaignEx, g gVar, String str2, boolean z10, boolean z11, int i10) {
        String id2;
        this.f153998d = str2;
        this.f154000f = gVar;
        this.f153996b = null;
        this.f153999e = i10;
        if (campaignEx != null) {
            z = CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode());
            id2 = campaignEx.getId();
        } else {
            id2 = "";
        }
        this.f154003i.a(str2, gVar, z, id2, str, campaignEx, z10, z11, i10);
    }

    public void a(String str, CampaignEx campaignEx, g gVar) {
        this.f153998d = new String(campaignEx.getClickURL());
        this.f154000f = gVar;
        this.f153996b = null;
        this.f154003i.a(campaignEx.getClickURL(), gVar, CampaignEx.CLICKMODE_ON.equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode()), campaignEx.getId(), str, campaignEx, true, false, com.mbridge.msdk.click.retry.a.f154115p);
    }

    public void a() {
        this.f154001g = false;
    }
}

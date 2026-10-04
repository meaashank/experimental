package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.viewdata.base.a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes5.dex */
public class MBSplashData implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DyOption f155679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f155680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f155681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f155682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f155683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CampaignEx f155684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f155685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f155686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f155687i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f155688j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f155689k = 0;

    public MBSplashData(DyOption dyOption) {
        this.f155679a = dyOption;
        this.f155684f = dyOption.getCampaignEx();
    }

    public String getAdClickText() {
        return this.f155681c;
    }

    public String getAppInfo() {
        return this.f155680b;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public CampaignEx getBindData() {
        return this.f155684f;
    }

    public int getClickType() {
        return this.f155689k;
    }

    public String getCountDownText() {
        return this.f155682d;
    }

    public DyOption getDyOption() {
        return this.f155679a;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public DyOption getEffectData() {
        return this.f155679a;
    }

    public int getLogoImage() {
        return this.f155686h;
    }

    public String getLogoText() {
        return this.f155683e;
    }

    public int getNoticeImage() {
        return this.f155685g;
    }

    public float getxInScreen() {
        return this.f155687i;
    }

    public float getyInScreen() {
        return this.f155688j;
    }

    public void setAdClickText(String str) {
        this.f155681c = str;
    }

    public void setAppInfo(String str) {
        this.f155680b = str;
    }

    public void setClickType(int i10) {
        this.f155689k = i10;
    }

    public void setCountDownText(String str) {
        this.f155682d = str;
    }

    public void setLogoImage(int i10) {
        this.f155686h = i10;
    }

    public void setLogoText(String str) {
        this.f155683e = str;
    }

    public void setNoticeImage(int i10) {
        this.f155685g = i10;
    }

    public void setxInScreen(float f10) {
        this.f155687i = f10;
    }

    public void setyInScreen(float f10) {
        this.f155688j = f10;
    }
}

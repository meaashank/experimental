package com.mbridge.msdk.mbbid.out;

/* JADX INFO: loaded from: classes5.dex */
public class BannerBidRequestParams extends CommonBidRequestParams {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f157266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f157267e;

    public BannerBidRequestParams(String str, String str2, int i10, int i11) {
        super(str, str2);
        this.f157266d = i11;
        this.f157267e = i10;
    }

    public int getHeight() {
        return this.f157266d;
    }

    public int getWidth() {
        return this.f157267e;
    }

    public void setHeight(int i10) {
        this.f157266d = i10;
    }

    public void setWidth(int i10) {
        this.f157267e = i10;
    }

    public BannerBidRequestParams(String str, String str2, String str3, int i10, int i11) {
        super(str, str2, str3);
        this.f157266d = i11;
        this.f157267e = i10;
    }
}

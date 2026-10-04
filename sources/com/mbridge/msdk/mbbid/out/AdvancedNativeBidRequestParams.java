package com.mbridge.msdk.mbbid.out;

/* JADX INFO: loaded from: classes5.dex */
public class AdvancedNativeBidRequestParams extends CommonBidRequestParams {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f157264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f157265e;

    public AdvancedNativeBidRequestParams(String str, String str2, int i10, int i11) {
        super(str, str2);
        this.f157264d = i11;
        this.f157265e = i10;
    }

    public int getHeight() {
        return this.f157264d;
    }

    public int getWidth() {
        return this.f157265e;
    }

    public void setHeight(int i10) {
        this.f157264d = i10;
    }

    public void setWidth(int i10) {
        this.f157265e = i10;
    }

    public AdvancedNativeBidRequestParams(String str, String str2, String str3, int i10, int i11) {
        super(str, str2, str3);
        this.f157264d = i11;
        this.f157265e = i10;
    }
}

package com.mbridge.msdk.mbbid.common;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f157246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f157247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f157248c;

    public c(String str, String str2) {
        this.f157246a = str;
        this.f157247b = str2;
    }

    public String getmFloorPrice() {
        return this.f157248c;
    }

    public String getmPlacementId() {
        return this.f157246a;
    }

    public String getmUnitId() {
        return this.f157247b;
    }

    public void setmFloorPrice(String str) {
        this.f157248c = str;
    }

    public void setmPlacementId(String str) {
        this.f157246a = str;
    }

    public void setmUnitId(String str) {
        this.f157247b = str;
    }

    public c(String str, String str2, String str3) {
        this.f157246a = str;
        this.f157247b = str2;
        this.f157248c = str3;
    }
}

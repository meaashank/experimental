package com.mbridge.msdk.video.dynview.error;

/* JADX INFO: loaded from: classes5.dex */
public enum a {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one"),
    VIEW_CREATE_ERROR(-5, "view create error"),
    NOT_FOUND_ROOTVIEW(-6, "rootview is null");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f160497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f160498b;

    a(int i10, String str) {
        this.f160497a = i10;
        this.f160498b = str;
    }

    public int g() {
        return this.f160497a;
    }

    public String h() {
        return this.f160498b;
    }
}

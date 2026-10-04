package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class N5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final N5 f152287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final N5 f152288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final N5 f152289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final N5 f152290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final N5 f152291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final N5 f152292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final N5 f152293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ N5[] f152294k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f152297c;

    static {
        N5 n52 = new N5("LPClickStart", 0, "clickStartCalled", "sdk_click_detected", 0);
        f152287d = n52;
        N5 n53 = new N5("LPStartFailed", 1, "landingsStartFailed", "valid_click_failed", 1);
        f152288e = n53;
        N5 n54 = new N5("LPStartSuccess", 2, "landingsStartSuccess", "browser_open_success", 2);
        f152289f = n54;
        N5 n55 = new N5("LPBrowserOpenFailed", 3, "browserOpenFailed", "browser_open_failed", 2);
        f152290g = n55;
        N5 n56 = new N5("LPPageStart", 4, "landingsPageStarted", "on_page_started", 3);
        f152291h = n56;
        N5 n57 = new N5("LPCompleteSuccess", 5, "landingsCompleteSuccess", "landing_success", 4);
        f152292i = n57;
        N5 n58 = new N5("LPCompleteFailed", 6, "landingsCompleteFailed", "landing_failed", 4);
        f152293j = n58;
        N5[] n5Arr = {n52, n53, n54, n55, n56, n57, n58};
        f152294k = n5Arr;
        kotlin.enums.c.c(n5Arr);
    }

    public N5(String str, int i10, String str2, String str3, int i11) {
        this.f152295a = str2;
        this.f152296b = str3;
        this.f152297c = i11;
    }

    public static N5 valueOf(String str) {
        return (N5) Enum.valueOf(N5.class, str);
    }

    public static N5[] values() {
        return (N5[]) f152294k.clone();
    }
}

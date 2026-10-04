package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.inmobi.media.h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3570h8 extends C3561h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f152982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f152983e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3570h8(C3561h ad2, JSONArray jSONArray, String videoUrl, String videoDuration, String str, ArrayList trackers, ArrayList companionAds) {
        super(ad2, jSONArray);
        kotlin.jvm.internal.G.p(ad2, "ad");
        kotlin.jvm.internal.G.p(videoUrl, "videoUrl");
        kotlin.jvm.internal.G.p(videoDuration, "videoDuration");
        kotlin.jvm.internal.G.p(trackers, "trackers");
        kotlin.jvm.internal.G.p(companionAds, "companionAds");
        this.f152979a = videoUrl;
        this.f152980b = videoDuration;
        this.f152981c = str;
        this.f152982d = trackers;
        this.f152983e = companionAds;
    }
}

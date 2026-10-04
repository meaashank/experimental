package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;

/* JADX INFO: renamed from: com.inmobi.media.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3714s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdEvents f153334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaEvents f153335b;

    public C3714s(AdSession adSession, String str) {
        kotlin.jvm.internal.G.p(adSession, "adSession");
        if (!kotlin.jvm.internal.G.g(str, "native_video_ad")) {
            this.f153334a = AdEvents.createAdEvents(adSession);
        } else {
            this.f153335b = MediaEvents.createMediaEvents(adSession);
            this.f153334a = AdEvents.createAdEvents(adSession);
        }
    }
}

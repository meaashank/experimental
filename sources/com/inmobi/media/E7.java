package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class E7 extends C3639m7 {
    public /* synthetic */ E7(String str, String str2, C3653n7 c3653n7, String str3, String str4, JSONObject jSONObject) {
        this(str, str2, c3653n7, str3, new ArrayList(), str4, jSONObject);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E7(String assetId, String assetName, C3653n7 assetStyle, String url, List trackers, String interactionMode, JSONObject jSONObject) {
        super(assetId, assetName, "IMAGE", assetStyle, trackers);
        kotlin.jvm.internal.G.p(assetId, "assetId");
        kotlin.jvm.internal.G.p(assetName, "assetName");
        kotlin.jvm.internal.G.p(assetStyle, "assetStyle");
        kotlin.jvm.internal.G.p(url, "url");
        kotlin.jvm.internal.G.p(trackers, "trackers");
        kotlin.jvm.internal.G.p(interactionMode, "interactionMode");
        this.f153148e = url;
        if (jSONObject != null) {
            this.f153150g = interactionMode;
        }
    }
}

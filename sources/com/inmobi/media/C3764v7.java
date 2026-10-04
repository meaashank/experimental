package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.v7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3764v7 extends Y7 {
    public /* synthetic */ C3764v7(String str, String str2, C3750u7 c3750u7, String str3, String str4) {
        this(str, str2, c3750u7, str3, new ArrayList(), str4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3764v7(String assetId, String assetName, C3750u7 assetStyle, String str, List trackers, String interactionMode) {
        super(assetId, assetName, "CTA", assetStyle, str);
        kotlin.jvm.internal.G.p(assetId, "assetId");
        kotlin.jvm.internal.G.p(assetName, "assetName");
        kotlin.jvm.internal.G.p(assetStyle, "assetStyle");
        kotlin.jvm.internal.G.p(trackers, "trackers");
        kotlin.jvm.internal.G.p(interactionMode, "interactionMode");
        this.f153162s.addAll(trackers);
        this.f153150g = interactionMode;
    }
}

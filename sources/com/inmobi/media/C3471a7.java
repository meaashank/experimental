package com.inmobi.media;

import java.util.HashMap;

/* JADX INFO: renamed from: com.inmobi.media.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3471a7 implements InterfaceC3502ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3499c7 f152701a;

    public C3471a7(C3499c7 c3499c7) {
        this.f152701a = c3499c7;
    }

    @Override // com.inmobi.media.InterfaceC3502ca
    public final void a(String triggerApi) {
        kotlin.jvm.internal.G.p(triggerApi, "triggerApi");
        HashMap map = new HashMap();
        map.put("creativeId", this.f152701a.getCreativeId());
        map.put("trigger", triggerApi);
        map.put("impressionId", this.f152701a.getImpressionId());
        map.put("adType", "native");
        Lb lb2 = Lb.f152196a;
        Lb.b("BlockAutoRedirection", map, Qb.f152402a);
    }

    @Override // com.inmobi.media.InterfaceC3502ca
    public final boolean d() {
        return true;
    }

    @Override // com.inmobi.media.InterfaceC3502ca
    public final long getViewTouchTimestamp() {
        return -1L;
    }
}

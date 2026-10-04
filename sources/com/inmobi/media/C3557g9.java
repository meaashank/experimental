package com.inmobi.media;

import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.HashMap;

/* JADX INFO: renamed from: com.inmobi.media.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3557g9 extends W8 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C3543f9 f152941y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3557g9(C3543f9 novatiqData, N4 n42) {
        super(novatiqData.f152929c.getBeaconUrl(), n42);
        kotlin.jvm.internal.G.p(novatiqData, "novatiqData");
        this.f152941y = novatiqData;
        this.f152571t = false;
        this.f152572u = false;
        this.f152575x = false;
    }

    @Override // com.inmobi.media.W8
    public final void f() {
        N4 n42 = this.f152556e;
        if (n42 != null) {
            this.f152941y.getClass();
            ((O4) n42).a("Novatiq", "preparing Novatiq request with data - hyperId - " + this.f152941y.f152927a + " - sspHost - " + this.f152941y.f152928b + " - pubId - inmobi");
        }
        super.f();
        HashMap map = this.f152561j;
        if (map != null) {
            map.put("sptoken", this.f152941y.f152927a);
        }
        HashMap map2 = this.f152561j;
        if (map2 != null) {
            this.f152941y.getClass();
            map2.put("sspid", "i6i");
        }
        HashMap map3 = this.f152561j;
        if (map3 != null) {
            map3.put("ssphost", this.f152941y.f152928b);
        }
        HashMap map4 = this.f152561j;
        if (map4 != null) {
            this.f152941y.getClass();
            map4.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "inmobi");
        }
    }
}

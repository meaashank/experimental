package com.inmobi.media;

import android.util.Log;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.commons.core.configs.AdConfig;
import ed.InterfaceC4376a;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class L extends Lambda implements InterfaceC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f152179a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(N n10) {
        super(0);
        this.f152179a = n10;
    }

    @Override // ed.InterfaceC4376a
    public final Object invoke() {
        N n10 = this.f152179a;
        n10.getClass();
        Log.i("AdQualityBeaconExecutor", "beacon handler execute");
        n10.f152262b.set(true);
        ScheduledExecutorService scheduledExecutorService = P.f152360a;
        kotlin.G g10 = AbstractC3531eb.f152882a;
        int iA = F1.a((F1) g10.getValue());
        S s10 = (S) g10.getValue();
        s10.getClass();
        Log.i("AdQualityDao", "peek");
        List<AdQualityResult> listA = F1.a(s10, null, null, null, null, null, Integer.valueOf(iA), 31);
        if (listA.isEmpty()) {
            listA = EmptyList.f217510a;
        }
        for (AdQualityResult adQualityResult : listA) {
            if (adQualityResult != null) {
                AdConfig adConfig = n10.f152261a;
                G5 g52 = new G5(adQualityResult, new C3686pc(adConfig.getIncludeIdParams()), adConfig.getAdQuality());
                M m10 = new M(n10, adQualityResult);
                Log.i("JsonBeaconRequest", "hitBeacon");
                g52.f();
                g52.f152574w = new La(g52.f151979z.getMaxRetries(), g52.f151979z.getRetryInterval());
                g52.a(new F5(m10));
            }
        }
        n10.f152263c.set(true);
        return kotlin.L0.f217464a;
    }
}

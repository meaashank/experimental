package com.google.firebase.analytics.ktx.ktxtesting;

import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ktx.AnalyticsKt;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.jvm.internal.G;

/* JADX INFO: loaded from: classes.dex */
public final class TestingKt {
    public static final void withAnalyticsForTest(@NonNull FirebaseAnalytics analytics, @NonNull InterfaceC4376a<L0> block) {
        G.p(analytics, "analytics");
        G.p(block, "block");
        synchronized (AnalyticsKt.getLOCK()) {
            FirebaseAnalytics analytics2 = AnalyticsKt.getANALYTICS();
            AnalyticsKt.setANALYTICS(analytics);
            try {
                block.invoke();
            } finally {
                AnalyticsKt.setANALYTICS(analytics2);
            }
        }
    }
}

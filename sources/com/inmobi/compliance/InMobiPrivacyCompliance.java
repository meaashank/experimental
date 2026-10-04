package com.inmobi.compliance;

import com.inmobi.media.AbstractC3648n2;
import com.mbridge.msdk.MBridgeConstans;
import dd.o;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class InMobiPrivacyCompliance {

    @NotNull
    public static final InMobiPrivacyCompliance INSTANCE = new InMobiPrivacyCompliance();

    @o
    public static final void setDoNotSell(boolean z10) {
        AbstractC3648n2.f153185a.put("do_not_sell", z10 ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
    }

    @o
    public static final void setUSPrivacyString(@NotNull String privacyString) {
        G.p(privacyString, "privacyString");
        AbstractC3648n2.f153185a.put("us_privacy", privacyString);
    }
}

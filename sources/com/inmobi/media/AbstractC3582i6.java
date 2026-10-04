package com.inmobi.media;

import com.google.ads.mediation.inmobi.InMobiNetworkKeys;

/* JADX INFO: renamed from: com.inmobi.media.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3582i6 {
    public static final EnumC3568h6 a(String logLevel) {
        kotlin.jvm.internal.G.p(logLevel, "logLevel");
        return logLevel.equalsIgnoreCase("DEBUG") ? EnumC3568h6.f152974b : logLevel.equalsIgnoreCase("ERROR") ? EnumC3568h6.f152975c : logLevel.equalsIgnoreCase("INFO") ? EnumC3568h6.f152973a : logLevel.equalsIgnoreCase(InMobiNetworkKeys.STATE) ? EnumC3568h6.f152976d : EnumC3568h6.f152975c;
    }
}

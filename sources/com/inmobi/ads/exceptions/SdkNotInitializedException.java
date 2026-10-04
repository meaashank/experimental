package com.inmobi.ads.exceptions;

import androidx.annotation.Keep;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class SdkNotInitializedException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkNotInitializedException(@NotNull String adType) {
        super("Please initialize the SDK before creating " + adType + " ad");
        G.p(adType, "adType");
    }
}

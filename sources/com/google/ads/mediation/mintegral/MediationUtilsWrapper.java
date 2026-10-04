package com.google.ads.mediation.mintegral;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import java.util.List;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class MediationUtilsWrapper {
    @Nullable
    public final AdSize findClosestSize(@NotNull Context context, @NotNull AdSize adSize, @NotNull List<AdSize> potentials) {
        G.p(context, "context");
        G.p(adSize, "adSize");
        G.p(potentials, "potentials");
        return MediationUtils.findClosestSize(context, adSize, potentials);
    }
}

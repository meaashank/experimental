package com.google.ads.mediation.mintegral;

import android.os.Bundle;
import e.f0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class FlagValueGetter {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String KEY_FLIP_MULTIPLE_AD_LOADS_BEHAVIOR = "enable_multiple_ads_per_unit";
    private static boolean flipMultipleAdLoadsBehavior;

    public static final class Companion {
        public /* synthetic */ Companion(C4969v c4969v) {
            this();
        }

        @f0
        public static /* synthetic */ void getFlipMultipleAdLoadsBehavior$annotations() {
        }

        public final boolean getFlipMultipleAdLoadsBehavior() {
            return FlagValueGetter.flipMultipleAdLoadsBehavior;
        }

        public final void setFlipMultipleAdLoadsBehavior(boolean z10) {
            FlagValueGetter.flipMultipleAdLoadsBehavior = z10;
        }

        private Companion() {
        }
    }

    public final boolean getClientSideRestrictMultipleAdLoadsFlagValue() {
        try {
            Method declaredMethod = Class.forName("com.google.android.gms.ads.internal.adaptersettings.AdapterSettings").getDeclaredMethod("getInstance", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            Method declaredMethod2 = objInvoke.getClass().getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            declaredMethod2.setAccessible(true);
            Object objInvoke2 = declaredMethod2.invoke(objInvoke, "adapter:mintegral_android_restrict_multiple_ads", Boolean.FALSE);
            G.n(objInvoke2, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) objInvoke2).booleanValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
            return false;
        }
    }

    public final void processMultipleAdLoadsServerParam(@NotNull Bundle serverParams) {
        G.p(serverParams, "serverParams");
        if (serverParams.containsKey(KEY_FLIP_MULTIPLE_AD_LOADS_BEHAVIOR) && G.g(serverParams.getString(KEY_FLIP_MULTIPLE_AD_LOADS_BEHAVIOR), "true")) {
            flipMultipleAdLoadsBehavior = true;
        }
    }

    public final boolean shouldRestrictMultipleAdLoads() {
        return getClientSideRestrictMultipleAdLoadsFlagValue() || flipMultipleAdLoadsBehavior;
    }
}

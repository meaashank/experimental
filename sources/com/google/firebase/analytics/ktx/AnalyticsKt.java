package com.google.firebase.analytics.ktx;

import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.ktx.FirebaseKt;
import ed.l;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsKt {

    @Nullable
    private static volatile FirebaseAnalytics zza;

    @NotNull
    private static final Object zzb = new Object();

    @androidx.annotation.Nullable
    public static final FirebaseAnalytics getANALYTICS() {
        return zza;
    }

    @NotNull
    public static final FirebaseAnalytics getAnalytics(@NonNull Firebase firebase) {
        G.p(firebase, "<this>");
        if (zza == null) {
            synchronized (zzb) {
                if (zza == null) {
                    zza = FirebaseAnalytics.getInstance(FirebaseKt.getApp(Firebase.INSTANCE).getApplicationContext());
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = zza;
        G.m(firebaseAnalytics);
        return firebaseAnalytics;
    }

    @NotNull
    public static final Object getLOCK() {
        return zzb;
    }

    @InterfaceC4982o(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public static final void logEvent(@NonNull FirebaseAnalytics firebaseAnalytics, @NonNull String name, @NonNull l<? super ParametersBuilder, L0> block) {
        G.p(firebaseAnalytics, "<this>");
        G.p(name, "name");
        G.p(block, "block");
        ParametersBuilder parametersBuilder = new ParametersBuilder();
        block.invoke(parametersBuilder);
        firebaseAnalytics.logEvent(name, parametersBuilder.getBundle());
    }

    public static final void setANALYTICS(@Nullable FirebaseAnalytics firebaseAnalytics) {
        zza = firebaseAnalytics;
    }

    @InterfaceC4982o(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public static final void setConsent(@NonNull FirebaseAnalytics firebaseAnalytics, @NonNull l<? super ConsentBuilder, L0> block) {
        G.p(firebaseAnalytics, "<this>");
        G.p(block, "block");
        ConsentBuilder consentBuilder = new ConsentBuilder();
        block.invoke(consentBuilder);
        firebaseAnalytics.setConsent(consentBuilder.asMap());
    }
}

package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class HsdpDeepLinkServiceFactory {
    private static final String HPOA_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hpoa.service.HpoaService";
    private static final String HPOA_SERVICE_CLASS_NAME_FOR_TESTING = "com.google.android.play.core.hsdp.testapp.FakeHpoaService";
    private static final String HSDP_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hsdp.service.HsdpService";

    private HsdpDeepLinkServiceFactory() {
    }

    @NonNull
    @Keep
    public static HsdpDeepLinkService create(@NonNull Activity activity) {
        return create(activity, false);
    }

    private static Intent createHpoaServiceIntent(Context context, boolean z10) {
        return z10 ? new Intent().setClassName(context.getPackageName(), HPOA_SERVICE_CLASS_NAME_FOR_TESTING) : new Intent().setClassName("com.android.vending", HPOA_SERVICE_CLASS_NAME);
    }

    public static Intent createHsdpServiceIntent() {
        return new Intent().setClassName("com.android.vending", HSDP_SERVICE_CLASS_NAME);
    }

    private static HsdpDeepLinkService createInternal(final Context context, boolean z10, boolean z11) {
        if (!z11 && !(context instanceof Activity)) {
            throw new IllegalArgumentException("Context must be an Activity when using activity-based HSDP.");
        }
        if (z10 && !(context instanceof Activity)) {
            throw new IllegalArgumentException("Context must be an Activity when enabling loading panel.");
        }
        final boolean z12 = ActivityManager.isRunningInTestHarness() || (Build.VERSION.SDK_INT >= 29 && ActivityManager.isRunningInUserTestHarness());
        return new zzat(context, com.google.android.gms.internal.playcore_hsdp.zzj.zza(new com.google.android.gms.internal.playcore_hsdp.zzg() { // from class: com.google.android.play.core.hsdp.service.zzaj
            @Override // com.google.android.gms.internal.playcore_hsdp.zzg
            public final Object zza() {
                return HsdpDeepLinkServiceFactory.lambda$createInternal$0(context, z12);
            }
        }), com.google.android.gms.internal.playcore_hsdp.zzj.zza(new com.google.android.gms.internal.playcore_hsdp.zzg() { // from class: com.google.android.play.core.hsdp.service.zzak
            @Override // com.google.android.gms.internal.playcore_hsdp.zzg
            public final Object zza() {
                return zzs.zza(HsdpDeepLinkServiceFactory.createHsdpServiceIntent(), context);
            }
        }), z12, z11, z10);
    }

    public static /* synthetic */ zze lambda$createInternal$0(Context context, boolean z10) {
        return new zzp(createHpoaServiceIntent(context, z10), (Activity) context);
    }

    @NonNull
    @Keep
    public static HsdpDeepLinkService create(@NonNull Activity activity, boolean z10) {
        return create(activity, z10, false);
    }

    @NonNull
    @Keep
    public static HsdpDeepLinkService create(@NonNull Activity activity, boolean z10, boolean z11) {
        return createInternal(activity, z10, z11);
    }

    @NonNull
    @Keep
    public static HsdpDeepLinkService create(@NonNull Context context) {
        return createInternal(context, false, true);
    }
}

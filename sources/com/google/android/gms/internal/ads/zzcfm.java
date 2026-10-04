package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcfm implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcgo zzb;

    public zzcfm(zzcfn zzcfnVar, Context context, zzcgo zzcgoVar) {
        this.zza = context;
        this.zzb = zzcgoVar;
        Objects.requireNonNull(zzcfnVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            this.zzb.zzd(e10);
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception while getting advertising Id info", e10);
        }
    }
}

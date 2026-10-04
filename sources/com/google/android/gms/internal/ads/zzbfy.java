package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbfy implements Runnable {
    final /* synthetic */ zzbfz zza;

    public zzbfy(zzbfz zzbfzVar) {
        Objects.requireNonNull(zzbfzVar);
        this.zza = zzbfzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbfz zzbfzVar = this.zza;
        synchronized (zzbfzVar.zzf()) {
            if (zzbfzVar.zzg().get() && zzbfzVar.zzh()) {
                zzbfzVar.zzg().set(false);
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App went background");
                Iterator it = zzbfzVar.zzi().iterator();
                while (it.hasNext()) {
                    try {
                        ((zzbga) it.next()).zza(false);
                    } catch (Exception e10) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                    }
                }
            } else {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App is still foreground");
            }
        }
    }
}

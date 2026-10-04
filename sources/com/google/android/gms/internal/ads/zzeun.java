package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeun {
    private final zzdrb zza;
    private final zzeua zzb;
    private final zzdds zzc;

    public zzeun(zzdrb zzdrbVar, zzeaj zzeajVar) {
        this.zza = zzdrbVar;
        final zzeua zzeuaVar = new zzeua(zzeajVar);
        this.zzb = zzeuaVar;
        final zzbtc zzbtcVarZze = zzdrbVar.zze();
        this.zzc = new zzdds() { // from class: com.google.android.gms.internal.ads.zzeum
            @Override // com.google.android.gms.internal.ads.zzdds
            public final /* synthetic */ void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzeuaVar.zzdJ(zzeVar);
                zzbtc zzbtcVar = zzbtcVarZze;
                if (zzbtcVar != null) {
                    try {
                        zzbtcVar.zzg(zzeVar);
                    } catch (RemoteException e10) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                    }
                }
                if (zzbtcVar != null) {
                    try {
                        zzbtcVar.zzf(zzeVar.zza);
                    } catch (RemoteException e11) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e11);
                    }
                }
            }
        };
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzb.zzl(zzbhVar);
    }

    public final zzdov zzb() {
        return new zzdov(this.zza, this.zzb.zzi());
    }

    public final zzeua zzc() {
        return this.zzb;
    }

    public final zzdfd zzd() {
        return this.zzb;
    }

    public final zzdds zze() {
        return this.zzc;
    }
}

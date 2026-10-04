package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public class zzhnc implements zzhet {
    final String zza;
    final Class zzb;
    final int zzc;

    public zzhnc(String str, Class cls, int i10, zzihe zziheVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = i10;
    }

    public static zzhfk zze(String str, Class cls, zzihe zziheVar) {
        return new zzhnb(str, cls, zziheVar);
    }

    public static zzhet zzf(String str, Class cls, int i10, zzihe zziheVar) {
        return new zzhnc(str, cls, i10, zziheVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhet
    public final Object zza(zziei zzieiVar) throws GeneralSecurityException {
        return zzhnt.zza().zzd(zzhnw.zza().zzg(zzhos.zza(this.zza, zzieiVar, zzhor.zzc(this.zzc), zzhor.zzd(5), null), zzheq.zza()), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhet
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhet
    public final Class zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhet
    public final zzhtt zzd(zziei zzieiVar) throws GeneralSecurityException {
        zzhtv zzhtvVarZzd = zzhtw.zzd();
        zzhtvVarZzd.zza(this.zza);
        zzhtvVarZzd.zzb(zzieiVar);
        zzhtvVarZzd.zzc(5);
        zzhos zzhosVar = (zzhos) zzhnw.zza().zzh(zzhnn.zza().zzc(zzhnw.zza().zzj(zzhot.zzb((zzhtw) zzhtvVarZzd.zzbu())), null), zzhos.class, zzheq.zza());
        zzhts zzhtsVarZzc = zzhtt.zzc();
        zzhtsVarZzc.zza(zzhosVar.zzg());
        zzhtsVarZzc.zzb(zzhosVar.zzb());
        zzhtsVarZzc.zzc(zzhor.zzb(zzhosVar.zzc()));
        return (zzhtt) zzhtsVarZzc.zzbu();
    }
}

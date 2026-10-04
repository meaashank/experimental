package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzerj implements zzemw {
    private final Context zza;
    private final Executor zzb;
    private final zzdwp zzc;

    public zzerj(Context context, Executor executor, zzdwp zzdwpVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdwpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        try {
            ((zzfmu) zzemtVar.zzb).zzl(zzfloVar.zza.zza.zzd, zzfldVar.zzv.toString());
        } catch (Exception e10) {
            String str = zzemtVar.zza;
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd {
        zzfmu zzfmuVar = (zzfmu) zzemtVar.zzb;
        if (zzfmuVar.zzn()) {
            zze(zzfloVar, zzfldVar, zzemtVar);
            return;
        }
        zzerg zzergVar = new zzerg(this, zzfloVar, zzfldVar, zzemtVar);
        zzdez zzdezVar = zzemtVar.zzc;
        ((zzeog) zzdezVar).zzc(zzergVar);
        Context context = this.zza;
        zzflw zzflwVar = zzfloVar.zza.zza;
        String string = zzfldVar.zzv.toString();
        zzfmuVar.zzk(context, zzflwVar.zzd, null, (zzccs) zzdezVar, string);
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ Object zzb(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzeqf, zzfmd {
        zzdwl zzdwlVarZzf = this.zzc.zzf(new zzczb(zzfloVar, zzfldVar, zzemtVar.zza), new zzdwm(new zzerh(this, zzemtVar, zzfldVar)));
        zzdwlVarZzf.zza().zzq(new zzctr((zzfmu) zzemtVar.zzb), this.zzb);
        zzdew zzdewVarZzb = zzdwlVarZzf.zzb();
        zzddn zzddnVarZzc = zzdwlVarZzf.zzc();
        ((zzeog) zzemtVar.zzc).zzb(new zzeri(this, zzdwlVarZzf.zzi(), zzddnVarZzc, zzdewVarZzb, zzdwlVarZzf.zzk()));
        return zzdwlVarZzf.zzh();
    }

    public final /* synthetic */ Executor zzc() {
        return this.zzb;
    }
}

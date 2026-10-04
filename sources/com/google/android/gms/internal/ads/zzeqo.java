package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeqo implements zzemw {
    private final Context zza;
    private final Executor zzb;
    private final zzdwp zzc;

    public zzeqo(Context context, Executor executor, zzdwp zzdwpVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdwpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd {
        try {
            zzflw zzflwVar = zzfloVar.zza.zza;
            if (zzflwVar.zzp.zza == 3) {
                ((zzfmu) zzemtVar.zzb).zzx(this.zza, zzflwVar.zzd, zzfldVar.zzv.toString(), (zzbwa) zzemtVar.zzc);
            } else {
                ((zzfmu) zzemtVar.zzb).zzv(this.zza, zzflwVar.zzd, zzfldVar.zzv.toString(), (zzbwa) zzemtVar.zzc);
            }
        } catch (Exception e10) {
            String str = zzemtVar.zza;
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ Object zzb(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzeqf, zzfmd {
        zzdwl zzdwlVarZzf = this.zzc.zzf(new zzczb(zzfloVar, zzfldVar, zzemtVar.zza), new zzdwm(new zzeqn(this, zzemtVar, zzfldVar)));
        zzdwlVarZzf.zza().zzq(new zzctr((zzfmu) zzemtVar.zzb), this.zzb);
        ((zzeof) zzemtVar.zzc).zzb(zzdwlVarZzf.zzm());
        return zzdwlVarZzf.zzh();
    }
}

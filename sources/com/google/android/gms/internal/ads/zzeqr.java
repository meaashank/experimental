package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeqr implements zzemw {
    private final Context zza;
    private final zzdwp zzb;

    public zzeqr(Context context, zzdwp zzdwpVar) {
        this.zza = context;
        this.zzb = zzdwpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd {
        try {
            zzbxt zzbxtVar = (zzbxt) zzemtVar.zzb;
            zzbxtVar.zzo(zzfldVar.zzZ);
            zzflw zzflwVar = zzfloVar.zza.zza;
            if (zzflwVar.zzp.zza == 3) {
                zzbxtVar.zzp(zzfldVar.zzU, zzfldVar.zzv.toString(), zzflwVar.zzd, ObjectWrapper.wrap(this.zza), new zzeqq(this, zzemtVar, null), (zzbwa) zzemtVar.zzc);
            } else {
                zzbxtVar.zzl(zzfldVar.zzU, zzfldVar.zzv.toString(), zzflwVar.zzd, ObjectWrapper.wrap(this.zza), new zzeqq(this, zzemtVar, null), (zzbwa) zzemtVar.zzc);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ Object zzb(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzeqf, zzfmd {
        zzeoo zzeooVar = new zzeoo(zzfldVar, (zzbxt) zzemtVar.zzb, AdFormat.REWARDED);
        zzdwl zzdwlVarZzf = this.zzb.zzf(new zzczb(zzfloVar, zzfldVar, zzemtVar.zza), new zzdwm(zzeooVar));
        zzeooVar.zzc(zzdwlVarZzf.zzd());
        ((zzeof) zzemtVar.zzc).zzb(zzdwlVarZzf.zzn());
        return zzdwlVarZzf.zzh();
    }
}

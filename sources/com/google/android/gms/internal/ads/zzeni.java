package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeni implements zzemw {
    private final Context zza;
    private final zzcvr zzb;

    public zzeni(Context context, zzcvr zzcvrVar) {
        this.zza = context;
        this.zzb = zzcvrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd {
        try {
            zzbxt zzbxtVar = (zzbxt) zzemtVar.zzb;
            zzbxtVar.zzo(zzfldVar.zzZ);
            zzbxtVar.zzs(zzfldVar.zzU, zzfldVar.zzv.toString(), zzfloVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzenh(zzemtVar, null), (zzbwa) zzemtVar.zzc);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e10);
            throw new zzfmd(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ Object zzb(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzeqf, zzfmd {
        zzeoo zzeooVar = new zzeoo(zzfldVar, (zzbxt) zzemtVar.zzb, AdFormat.APP_OPEN_AD);
        zzcvo zzcvoVarZzf = this.zzb.zzf(new zzczb(zzfloVar, zzfldVar, zzemtVar.zza), new zzdnb(zzeooVar, null), new zzcvp(zzfldVar.zzaa));
        zzeooVar.zzc(zzcvoVarZzf.zzd());
        ((zzeof) zzemtVar.zzc).zzb(zzcvoVarZzf.zzg());
        return zzcvoVarZzf.zzh();
    }
}

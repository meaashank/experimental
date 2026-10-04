package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeot implements zzemw {
    private final Context zza;
    private final zzdoe zzb;

    public zzeot(Context context, zzdoe zzdoeVar) {
        this.zza = context;
        this.zzb = zzdoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd {
        try {
            zzbxt zzbxtVar = (zzbxt) zzemtVar.zzb;
            zzbxtVar.zzo(zzfldVar.zzZ);
            zzbxtVar.zzj(zzfldVar.zzU, zzfldVar.zzv.toString(), zzfloVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeos(this, zzemtVar, null), (zzbwa) zzemtVar.zzc);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e10);
            throw new zzfmd(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ Object zzb(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzeqf, zzfmd {
        zzeoo zzeooVar = new zzeoo(zzfldVar, (zzbxt) zzemtVar.zzb, AdFormat.INTERSTITIAL);
        zzdmy zzdmyVarZzd = this.zzb.zzd(new zzczb(zzfloVar, zzfldVar, zzemtVar.zza), new zzdnb(zzeooVar, null));
        zzeooVar.zzc(zzdmyVarZzd.zzd());
        ((zzeof) zzemtVar.zzc).zzb(zzdmyVarZzd.zzg());
        return zzdmyVarZzd.zzh();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeph implements zzemw {
    private final Context zza;
    private final zzdpa zzb;
    private zzbwj zzc;
    private final VersionInfoParcel zzd;

    public zzeph(Context context, zzdpa zzdpaVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdpaVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd {
        try {
            zzbxt zzbxtVar = (zzbxt) zzemtVar.zzb;
            zzbxtVar.zzo(zzfldVar.zzZ);
            if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcx)).intValue()) {
                zzbxtVar.zzn(zzfldVar.zzU, zzfldVar.zzv.toString(), zzfloVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzepg(this, zzemtVar, null), (zzbwa) zzemtVar.zzc);
                return;
            }
            String str = zzfldVar.zzU;
            String string = zzfldVar.zzv.toString();
            zzflw zzflwVar = zzfloVar.zza.zza;
            zzbxtVar.zzr(str, string, zzflwVar.zzd, ObjectWrapper.wrap(this.zza), new zzepg(this, zzemtVar, null), (zzbwa) zzemtVar.zzc, zzflwVar.zzj);
        } catch (RemoteException e10) {
            throw new zzfmd(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ Object zzb(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzeqf, zzfmd {
        ArrayList arrayList = zzfloVar.zza.zza.zzh;
        if (!arrayList.contains(Integer.toString(6))) {
            throw new zzeqf(2, "Unified must be used for RTB.");
        }
        zzdqr zzdqrVarZzaf = zzdqr.zzaf(this.zzc);
        if (!arrayList.contains(Integer.toString(zzdqrVarZzaf.zzx()))) {
            throw new zzeqf(1, "No corresponding native ad listener");
        }
        zzdqt zzdqtVarZze = this.zzb.zze(new zzczb(zzfloVar, zzfldVar, zzemtVar.zza), new zzdrc(zzdqrVarZzaf), new zzdsv(null, null, this.zzc));
        ((zzeof) zzemtVar.zzc).zzb(zzdqtVarZze.zzg());
        return zzdqtVarZze.zzh();
    }

    public final /* synthetic */ void zzc(zzbwj zzbwjVar) {
        this.zzc = zzbwjVar;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzepe implements zzemw {
    private final Context zza;
    private final zzdpa zzb;
    private final Executor zzc;

    public zzepe(Context context, zzdpa zzdpaVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdpaVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzflo zzfloVar, int i10) {
        return zzfloVar.zza.zza.zzh.contains(Integer.toString(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd {
        zzfmu zzfmuVar = (zzfmu) zzemtVar.zzb;
        zzflw zzflwVar = zzfloVar.zza.zza;
        String string = zzfldVar.zzv.toString();
        String strZzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfldVar.zzs);
        zzfmuVar.zzo(this.zza, zzflwVar.zzd, string, strZzm, (zzbwa) zzemtVar.zzc, zzflwVar.zzj, zzflwVar.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ Object zzb(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzeqf, zzfmd {
        zzdqr zzdqrVarZzag;
        zzfmu zzfmuVar = (zzfmu) zzemtVar.zzb;
        zzbwf zzbwfVarZzD = zzfmuVar.zzD();
        zzbwg zzbwgVarZzE = zzfmuVar.zzE();
        zzbwj zzbwjVarZzu = zzfmuVar.zzu();
        if (zzbwjVarZzu != null && zzc(zzfloVar, 6)) {
            zzdqrVarZzag = zzdqr.zzaf(zzbwjVarZzu);
        } else if (zzbwfVarZzD != null && zzc(zzfloVar, 6)) {
            zzdqrVarZzag = zzdqr.zzai(zzbwfVarZzD);
        } else if (zzbwfVarZzD != null && zzc(zzfloVar, 2)) {
            zzdqrVarZzag = zzdqr.zzah(zzbwfVarZzD);
        } else if (zzbwgVarZzE != null && zzc(zzfloVar, 6)) {
            zzdqrVarZzag = zzdqr.zzaj(zzbwgVarZzE);
        } else {
            if (zzbwgVarZzE == null || !zzc(zzfloVar, 1)) {
                throw new zzeqf(1, "No native ad mappers");
            }
            zzdqrVarZzag = zzdqr.zzag(zzbwgVarZzE);
        }
        if (zzdqrVarZzag != null) {
            zzflw zzflwVar = zzfloVar.zza.zza;
            if (zzflwVar.zzh.contains(Integer.toString(zzdqrVarZzag.zzx()))) {
                zzdqt zzdqtVarZze = this.zzb.zze(new zzczb(zzfloVar, zzfldVar, zzemtVar.zza), new zzdrc(zzdqrVarZzag), new zzdsv(zzbwgVarZzE, zzbwfVarZzD, zzbwjVarZzu));
                ((zzeof) zzemtVar.zzc).zzb(zzdqtVarZze.zzf());
                zzdqtVarZze.zza().zzq(new zzctr(zzfmuVar), this.zzc);
                return zzdqtVarZze.zzh();
            }
        }
        throw new zzeqf(1, "No corresponding native ad listener");
    }
}

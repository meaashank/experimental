package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeoq implements zzemw {
    private final Context zza;
    private final zzdoe zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzeoq(Context context, VersionInfoParcel versionInfoParcel, zzdoe zzdoeVar, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdoeVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd {
        zzfmu zzfmuVar = (zzfmu) zzemtVar.zzb;
        zzflw zzflwVar = zzfloVar.zza.zza;
        String string = zzfldVar.zzv.toString();
        String strZzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfldVar.zzs);
        zzfmuVar.zzh(this.zza, zzflwVar.zzd, string, strZzm, (zzbwa) zzemtVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ Object zzb(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzeqf, zzfmd {
        zzdmy zzdmyVarZzd = this.zzb.zzd(new zzczb(zzfloVar, zzfldVar, zzemtVar.zza), new zzdnb(new zzeop(this, zzemtVar, zzfldVar), null));
        zzdmyVarZzd.zza().zzq(new zzctr((zzfmu) zzemtVar.zzb), this.zzd);
        ((zzeof) zzemtVar.zzc).zzb(zzdmyVarZzd.zzf());
        return zzdmyVarZzd.zzh();
    }

    public final /* synthetic */ VersionInfoParcel zzc() {
        return this.zzc;
    }
}

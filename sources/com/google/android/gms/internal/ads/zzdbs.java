package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdbs implements zzdgv, zzdmi {
    private final Context zza;
    private final zzflw zzb;
    private final VersionInfoParcel zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzecu zze;
    private final zzfrj zzf;
    private final zzedp zzg;

    public zzdbs(Context context, zzflw zzflwVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.zzg zzgVar, zzecu zzecuVar, zzfrj zzfrjVar, zzedp zzedpVar) {
        this.zza = context;
        this.zzb = zzflwVar;
        this.zzc = versionInfoParcel;
        this.zzd = zzgVar;
        this.zze = zzecuVar;
        this.zzf = zzfrjVar;
        this.zzg = zzedpVar;
    }

    private final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfb)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzc;
            zzflw zzflwVar = this.zzb;
            zzfrj zzfrjVar = this.zzf;
            zzedp zzedpVar = this.zzg;
            com.google.android.gms.ads.internal.zzt.zzl().zzb(context, versionInfoParcel, zzflwVar.zzg, zzgVar.zzi(), zzfrjVar, zzedpVar.zzs());
        }
        this.zze.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zzd(@Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfc)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdP(zzcbv zzcbvVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdQ(zzflo zzfloVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zze(@Nullable String str) {
    }
}

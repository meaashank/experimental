package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdwh implements zzbra {
    private final zzdew zza;

    @Nullable
    private final zzcct zzb;
    private final String zzc;
    private final String zzd;

    public zzdwh(zzdew zzdewVar, zzfld zzfldVar) {
        this.zza = zzdewVar;
        this.zzb = zzfldVar.zzl;
        this.zzc = zzfldVar.zzj;
        this.zzd = zzfldVar.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzbra
    public final void zza() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbra
    @ParametersAreNonnullByDefault
    public final void zzb(@Nullable zzcct zzcctVar) {
        int i10;
        String str;
        zzcct zzcctVar2 = this.zzb;
        if (zzcctVar2 != null) {
            zzcctVar = zzcctVar2;
        }
        if (zzcctVar != null) {
            str = zzcctVar.zza;
            i10 = zzcctVar.zzb;
        } else {
            i10 = 1;
            str = "";
        }
        this.zza.zze(new zzcce(str, i10), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbra
    public final void zzc() {
        this.zza.zzf();
    }
}

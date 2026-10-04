package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdcy {
    private Context zza;
    private zzflw zzb;
    private Bundle zzc;

    @Nullable
    private zzflp zzd;

    @Nullable
    private zzdcs zze;

    @Nullable
    private zzemv zzf;

    public final zzdcy zza(Context context) {
        this.zza = context;
        return this;
    }

    public final zzdcy zzb(zzflw zzflwVar) {
        this.zzb = zzflwVar;
        return this;
    }

    public final zzdcy zzc(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzdcy zzd(@Nullable zzdcs zzdcsVar) {
        this.zze = zzdcsVar;
        return this;
    }

    public final zzdcz zze() {
        return new zzdcz(this, null);
    }

    public final zzdcy zzf(zzflp zzflpVar) {
        this.zzd = zzflpVar;
        return this;
    }

    public final zzdcy zzg(@Nullable zzemv zzemvVar) {
        this.zzf = zzemvVar;
        return this;
    }

    public final /* synthetic */ Context zzh() {
        return this.zza;
    }

    public final /* synthetic */ zzflw zzi() {
        return this.zzb;
    }

    public final /* synthetic */ Bundle zzj() {
        return this.zzc;
    }

    public final /* synthetic */ zzflp zzk() {
        return this.zzd;
    }

    public final /* synthetic */ zzdcs zzl() {
        return this.zze;
    }

    public final /* synthetic */ zzemv zzm() {
        return this.zzf;
    }
}

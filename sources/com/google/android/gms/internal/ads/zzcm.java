package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcm {
    private long zza;
    private zzbf zzb;

    @Nullable
    private Object zzc;

    public /* synthetic */ zzcm(zzcn zzcnVar, byte[] bArr) {
        this.zza = zzcnVar.zzb;
        this.zzb = zzcnVar.zzc;
        this.zzc = zzcnVar.zzd;
    }

    public final zzcm zza(long j10) {
        this.zza = j10;
        return this;
    }

    public final zzcm zzb(zzbf zzbfVar) {
        this.zzb = zzbfVar;
        return this;
    }

    public final zzcm zzc(@Nullable Object obj) {
        this.zzc = obj;
        return this;
    }

    public final zzcn zzd() {
        Object obj;
        if (!this.zzb.zzg() && (obj = this.zzc) != null) {
            zzguk.zza(this.zzb.zze(obj) != -1);
        }
        return new zzcn(this, null);
    }

    public final /* synthetic */ long zze() {
        return this.zza;
    }

    public final /* synthetic */ zzbf zzf() {
        return this.zzb;
    }

    public final /* synthetic */ Object zzg() {
        return this.zzc;
    }

    public zzcm() {
        this.zza = 0L;
        this.zzb = zzbf.zza;
        this.zzc = null;
    }
}

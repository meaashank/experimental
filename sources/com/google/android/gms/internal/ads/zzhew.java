package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhew {
    private boolean zza;

    @Nullable
    private final zzhfj zzc;
    private final zzheu zzb = zzheu.zza;
    private zzhex zzd = null;

    @Nullable
    private zzhey zze = null;

    public /* synthetic */ zzhew(zzhfj zzhfjVar, byte[] bArr) {
        this.zzc = zzhfjVar;
    }

    public final zzhew zza() {
        zzhey zzheyVar = this.zze;
        if (zzheyVar != null) {
            zzheyVar.zzc();
        }
        this.zza = true;
        return this;
    }

    public final zzhew zzb() {
        this.zzd = zzhex.zza;
        return this;
    }

    public final /* synthetic */ boolean zzc() {
        return this.zza;
    }

    public final /* synthetic */ void zzd(boolean z10) {
        this.zza = false;
    }

    public final /* synthetic */ zzheu zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzhfj zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzhex zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzhey zzh() {
        return this.zze;
    }

    public final /* synthetic */ void zzi(zzhey zzheyVar) {
        this.zze = zzheyVar;
    }
}

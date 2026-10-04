package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class zzagx implements zzaht {
    private final zzaht zza;

    public zzagx(zzaht zzahtVar) {
        this.zza = zzahtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zzA(zzv zzvVar) {
        this.zza.zzA(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zzP(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public int zza(zzj zzjVar, int i10, boolean z10) throws IOException {
        return this.zza.zza(zzjVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public int zzb(zzj zzjVar, int i10, boolean z10, int i11) throws IOException {
        return this.zza.zzb(zzjVar, i10, z10, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public void zzc(zzeu zzeuVar, int i10) {
        this.zza.zzc(zzeuVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public void zzd(zzeu zzeuVar, int i10, int i11) {
        this.zza.zzd(zzeuVar, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public void zze(long j10, int i10, int i11, int i12, @Nullable zzahs zzahsVar) {
        this.zza.zze(j10, i10, i11, i12, zzahsVar);
    }
}

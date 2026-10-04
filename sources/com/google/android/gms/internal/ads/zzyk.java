package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class zzyk extends zzagx {
    private final zzzf zza;
    private final zzage zzb;
    private final AtomicReference zzc;

    public zzyk(zzzf zzzfVar) {
        super(zzzfVar);
        this.zza = zzzfVar;
        this.zzb = new zzage();
        this.zzc = new AtomicReference(zzyj.PASS_THROUGH);
    }

    private final zzaht zzh() {
        return this.zzc.get() == zzyj.DISCARDING ? this.zzb : this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagx, com.google.android.gms.internal.ads.zzaht
    public final int zza(zzj zzjVar, int i10, boolean z10) throws IOException {
        return zzh().zza(zzjVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzagx, com.google.android.gms.internal.ads.zzaht
    public final int zzb(zzj zzjVar, int i10, boolean z10, int i11) throws IOException {
        return zzh().zzb(zzjVar, i10, z10, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagx, com.google.android.gms.internal.ads.zzaht
    public final void zzc(zzeu zzeuVar, int i10) {
        zzh().zzc(zzeuVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzagx, com.google.android.gms.internal.ads.zzaht
    public final void zzd(zzeu zzeuVar, int i10, int i11) {
        zzh().zzd(zzeuVar, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzagx, com.google.android.gms.internal.ads.zzaht
    public final void zze(long j10, int i10, int i11, int i12, @Nullable zzahs zzahsVar) {
        zzh().zze(j10, i10, i11, i12, zzahsVar);
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() == zzyj.DISCARD_AFTER_NEXT_SAMPLE_METADATA) {
            this.zza.zzg(false);
            atomicReference.set(zzyj.DISCARDING);
        }
    }

    public final boolean zzf() {
        return this.zzc.get() == zzyj.PASS_THROUGH;
    }
}

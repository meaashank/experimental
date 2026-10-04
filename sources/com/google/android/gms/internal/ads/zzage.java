package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzage implements zzaht {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zzA(zzv zzvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public /* synthetic */ void zzP(long j10) {
        A.a(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public /* synthetic */ int zza(zzj zzjVar, int i10, boolean z10) {
        return A.b(this, zzjVar, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final int zzb(zzj zzjVar, int i10, boolean z10, int i11) throws IOException {
        int iZza = zzjVar.zza(this.zza, 0, Math.min(4096, i10));
        if (iZza != -1) {
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public /* synthetic */ void zzc(zzeu zzeuVar, int i10) {
        A.c(this, zzeuVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zzd(zzeu zzeuVar, int i10, int i11) {
        zzeuVar.zzk(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zze(long j10, int i10, int i11, int i12, @Nullable zzahs zzahsVar) {
    }
}

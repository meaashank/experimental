package com.google.android.gms.internal.ads;

import androidx.compose.foundation.layout.C1709v0;

/* JADX INFO: loaded from: classes4.dex */
final class zzals implements zzalp {
    private final int zza;
    private final int zzb;
    private final zzeu zzc;

    public zzals(zzga zzgaVar, zzv zzvVar) {
        zzeu zzeuVar = zzgaVar.zza;
        this.zzc = zzeuVar;
        zzeuVar.zzh(12);
        int iZzH = zzeuVar.zzH();
        if ("audio/raw".equals(zzvVar.zzp)) {
            int iZzI = zzfm.zzI(zzvVar.zzL) * zzvVar.zzI;
            if (iZzH % iZzI != 0) {
                zzeh.zzc("BoxParsers", C1709v0.a(new StringBuilder(String.valueOf(iZzI).length() + 66 + String.valueOf(iZzH).length()), "Audio sample size mismatch. stsd sample size: ", iZzI, ", stsz sample size: ", iZzH));
                iZzH = iZzI;
            }
        }
        this.zza = iZzH == 0 ? -1 : iZzH;
        this.zzb = zzeuVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final int zzc() {
        int i10 = this.zza;
        return i10 == -1 ? this.zzc.zzH() : i10;
    }
}

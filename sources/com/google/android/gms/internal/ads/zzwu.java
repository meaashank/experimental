package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzwu implements zzxz, zzuo {
    final /* synthetic */ zzww zza;
    private final Object zzb;
    private zzxy zzc;
    private zzun zzd;

    public zzwu(zzww zzwwVar, Object obj) {
        Objects.requireNonNull(zzwwVar);
        this.zza = zzwwVar;
        this.zzc = zzwwVar.zzf(null);
        this.zzd = zzwwVar.zzh(null);
        this.zzb = obj;
    }

    private final boolean zzf(int i10, @Nullable zzxo zzxoVar) {
        zzxo zzxoVarZzy;
        if (zzxoVar != null) {
            zzxoVarZzy = this.zza.zzy(this.zzb, zzxoVar);
            if (zzxoVarZzy == null) {
                return false;
            }
        } else {
            zzxoVarZzy = null;
        }
        zzww zzwwVar = this.zza;
        zzwwVar.zzx(this.zzb, 0);
        zzxy zzxyVar = this.zzc;
        int i11 = zzxyVar.zza;
        if (!Objects.equals(zzxyVar.zzb, zzxoVarZzy)) {
            this.zzc = zzwwVar.zzg(0, zzxoVarZzy);
        }
        zzun zzunVar = this.zzd;
        int i12 = zzunVar.zza;
        if (Objects.equals(zzunVar.zzb, zzxoVarZzy)) {
            return true;
        }
        this.zzd = zzwwVar.zzi(0, zzxoVarZzy);
        return true;
    }

    private final zzxk zzg(zzxk zzxkVar, @Nullable zzxo zzxoVar) {
        zzww zzwwVar = this.zza;
        Object obj = this.zzb;
        zzwwVar.zzz(obj, zzxkVar.zzc, zzxoVar);
        zzwwVar.zzz(obj, zzxkVar.zzd, zzxoVar);
        return zzxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzai(int i10, @Nullable zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar, int i11) {
        if (zzf(0, zzxoVar)) {
            zzxy zzxyVar = this.zzc;
            zzg(zzxkVar, zzxoVar);
            zzxyVar.zzd(zzxfVar, zzxkVar, i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzaj(int i10, @Nullable zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar) {
        if (zzf(0, zzxoVar)) {
            zzxy zzxyVar = this.zzc;
            zzg(zzxkVar, zzxoVar);
            zzxyVar.zze(zzxfVar, zzxkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzak(int i10, @Nullable zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar) {
        if (zzf(0, zzxoVar)) {
            zzxy zzxyVar = this.zzc;
            zzg(zzxkVar, zzxoVar);
            zzxyVar.zzf(zzxfVar, zzxkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzal(int i10, @Nullable zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar, IOException iOException, boolean z10) {
        if (zzf(0, zzxoVar)) {
            zzxy zzxyVar = this.zzc;
            zzg(zzxkVar, zzxoVar);
            zzxyVar.zzg(zzxfVar, zzxkVar, iOException, z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzam(int i10, @Nullable zzxo zzxoVar, zzxk zzxkVar) {
        if (zzf(0, zzxoVar)) {
            zzxy zzxyVar = this.zzc;
            zzg(zzxkVar, zzxoVar);
            zzxyVar.zzh(zzxkVar);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Looper;
import androidx.annotation.Nullable;
import e.InterfaceC4326A;

/* JADX INFO: loaded from: classes4.dex */
public final class zzyy extends zzwp implements zzym {
    private final zzhr zza;
    private final zzyg zzb;
    private final zzus zzc;
    private final int zzd;
    private boolean zze = true;
    private long zzf = -9223372036854775807L;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    @Nullable
    private zziq zzj;

    @InterfaceC4326A("this")
    private zzak zzk;
    private final zzabz zzl;

    public /* synthetic */ zzyy(zzak zzakVar, zzhr zzhrVar, zzyg zzygVar, zzus zzusVar, zzabz zzabzVar, int i10, boolean z10, int i11, zzv zzvVar, zzgvc zzgvcVar, byte[] bArr) {
        this.zzk = zzakVar;
        this.zza = zzhrVar;
        this.zzb = zzygVar;
        this.zzc = zzusVar;
        this.zzl = zzabzVar;
        this.zzd = i10;
    }

    private final void zzv() {
        long j10 = this.zzf;
        boolean z10 = this.zzg;
        boolean z11 = this.zzh;
        zzak zzakVarZzK = zzK();
        zzbf zzzkVar = new zzzk(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, zzakVarZzK, z11 ? zzakVarZzK.zzc : null);
        if (this.zze) {
            zzzkVar = new zzyv(this, zzzkVar);
        }
        zze(zzzkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwp, com.google.android.gms.internal.ads.zzxq
    public final synchronized void zzB(zzak zzakVar) {
        this.zzk = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzE(zzxm zzxmVar) {
        ((zzyu) zzxmVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzxm zzH(zzxo zzxoVar, zzabp zzabpVar, long j10) {
        zzhs zzhsVarZza = this.zza.zza();
        zziq zziqVar = this.zzj;
        if (zziqVar != null) {
            zzhsVarZza.zze(zziqVar);
        }
        zzag zzagVar = zzK().zzb;
        zzagVar.getClass();
        return new zzyu(zzagVar.zza, zzhsVarZza, this.zzb.zza(zzk()), this.zzc, zzh(zzxoVar), this.zzl, zzf(zzxoVar), this, zzabpVar, null, this.zzd, false, 0, null, zzfm.zzt(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final synchronized zzak zzK() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void zza(@Nullable zziq zziqVar) {
        this.zzj = zziqVar;
        Looper.myLooper().getClass();
        zzk();
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final void zzb(long j10, zzahk zzahkVar, boolean z10) {
        if (this.zzi && zzahkVar.zzj()) {
            return;
        }
        this.zzi = !zzahkVar.zzj();
        if (j10 == -9223372036854775807L) {
            j10 = this.zzf;
        }
        boolean zZzb = zzahkVar.zzb();
        if (!this.zze && this.zzf == j10 && this.zzg == zZzb && this.zzh == z10) {
            return;
        }
        this.zzf = j10;
        this.zzg = zZzb;
        this.zzh = z10;
        this.zze = false;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzu() {
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzpx {
    final /* synthetic */ zzpy zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzxo zze;
    private boolean zzf;
    private boolean zzg;

    public zzpx(zzpy zzpyVar, String str, @Nullable int i10, zzxo zzxoVar) {
        Objects.requireNonNull(zzpyVar);
        this.zza = zzpyVar;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = zzxoVar == null ? -1L : zzxoVar.zzd;
        if (zzxoVar == null || !zzxoVar.zzb()) {
            return;
        }
        this.zze = zzxoVar;
    }

    public final boolean zza(zzbf zzbfVar, zzbf zzbfVar2) {
        int i10 = this.zzc;
        if (i10 < zzbfVar.zza()) {
            zzpy zzpyVar = this.zza;
            zzbfVar.zzb(i10, zzpyVar.zzj(), 0L);
            for (int i11 = zzpyVar.zzj().zzn; i11 <= zzpyVar.zzj().zzo; i11++) {
                int iZze = zzbfVar2.zze(zzbfVar.zzf(i11));
                if (iZze != -1) {
                    i10 = zzbfVar2.zzd(iZze, zzpyVar.zzk(), false).zzc;
                    break;
                }
            }
            i10 = -1;
        } else if (i10 >= zzbfVar2.zza()) {
            i10 = -1;
        }
        this.zzc = i10;
        if (i10 == -1) {
            return false;
        }
        zzxo zzxoVar = this.zze;
        return zzxoVar == null || zzbfVar2.zze(zzxoVar.zza) != -1;
    }

    public final boolean zzb(int i10, @Nullable zzxo zzxoVar) {
        if (zzxoVar != null) {
            long j10 = zzxoVar.zzd;
            if (j10 != -1) {
                zzxo zzxoVar2 = this.zze;
                return zzxoVar2 == null ? !zzxoVar.zzb() && j10 == this.zzd : j10 == zzxoVar2.zzd && zzxoVar.zzb == zzxoVar2.zzb && zzxoVar.zzc == zzxoVar2.zzc;
            }
        }
        return i10 == this.zzc;
    }

    public final void zzc(int i10, @Nullable zzxo zzxoVar) {
        if (this.zzd == -1 && i10 == this.zzc && zzxoVar != null) {
            zzpy zzpyVar = this.zza;
            long j10 = zzxoVar.zzd;
            if (j10 >= zzpyVar.zzi()) {
                this.zzd = j10;
            }
        }
    }

    public final boolean zzd(zznr zznrVar) {
        zzxo zzxoVar = zznrVar.zzd;
        if (zzxoVar == null) {
            return this.zzc != zznrVar.zzc;
        }
        long j10 = this.zzd;
        if (j10 == -1) {
            return false;
        }
        long j11 = zzxoVar.zzd;
        if (j11 > j10) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbf zzbfVar = zznrVar.zzb;
        int iZze = zzbfVar.zze(zzxoVar.zza);
        int iZze2 = zzbfVar.zze(this.zze.zza);
        zzxo zzxoVar2 = this.zze;
        if (j11 < zzxoVar2.zzd || iZze < iZze2) {
            return false;
        }
        if (iZze > iZze2) {
            return true;
        }
        if (!zzxoVar.zzb()) {
            int i10 = zzxoVar.zze;
            return i10 == -1 || i10 > zzxoVar2.zzb;
        }
        int i11 = zzxoVar.zzb;
        int i12 = zzxoVar.zzc;
        int i13 = zzxoVar2.zzb;
        if (i11 <= i13) {
            return i11 == i13 && i12 > zzxoVar2.zzc;
        }
        return true;
    }

    public final /* synthetic */ String zze() {
        return this.zzb;
    }

    public final /* synthetic */ int zzf() {
        return this.zzc;
    }

    public final /* synthetic */ long zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzxo zzh() {
        return this.zze;
    }

    public final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    public final /* synthetic */ void zzj(boolean z10) {
        this.zzf = true;
    }

    public final /* synthetic */ boolean zzk() {
        return this.zzg;
    }

    public final /* synthetic */ void zzl(boolean z10) {
        this.zzg = true;
    }
}

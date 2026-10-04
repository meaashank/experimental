package com.google.android.gms.internal.ads;

import androidx.compose.foundation.layout.C1709v0;
import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes4.dex */
final class zzasc implements zzasb {
    private final zzagk zza;
    private final zzaht zzb;
    private final zzasf zzc;
    private final zzv zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzasc(zzagk zzagkVar, zzaht zzahtVar, zzasf zzasfVar, String str, int i10) throws zzat {
        this.zza = zzagkVar;
        this.zzb = zzahtVar;
        this.zzc = zzasfVar;
        int i11 = zzasfVar.zzb * zzasfVar.zze;
        int i12 = zzasfVar.zzd;
        int i13 = i11 / 8;
        if (i12 != i13) {
            throw zzat.zzb(C1709v0.a(new StringBuilder(String.valueOf(i13).length() + 28 + String.valueOf(i12).length()), "Expected block size: ", i13, "; got: ", i12), null);
        }
        int i14 = zzasfVar.zzc * i13;
        int i15 = i14 * 8;
        int iMax = Math.max(i13, i14 / 10);
        this.zze = iMax;
        zzt zztVar = new zzt();
        zztVar.zzn("audio/wav");
        zztVar.zzo(str);
        zztVar.zzi(i15);
        zztVar.zzj(i15);
        zztVar.zzp(iMax);
        zztVar.zzH(zzasfVar.zzb);
        zztVar.zzI(zzft.zzb(zzasfVar.zzg));
        zztVar.zzJ(zzasfVar.zzc);
        zztVar.zzK(i10);
        this.zzd = zztVar.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzasb
    public final void zza(long j10) {
        this.zzf = j10;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzasb
    public final void zzb(int i10, long j10) {
        zzasi zzasiVar = new zzasi(this.zzc, 1, i10, j10);
        this.zza.zzw(zzasiVar);
        zzaht zzahtVar = this.zzb;
        zzahtVar.zzA(this.zzd);
        zzahtVar.zzP(zzasiVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzasb
    public final boolean zzc(zzagi zzagiVar, long j10) throws IOException {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.zzg) < (i11 = this.zze)) {
            int iZza = this.zzb.zza(zzagiVar, (int) Math.min(i11 - i10, j11), true);
            if (iZza == -1) {
                j11 = 0;
            } else {
                this.zzg += iZza;
                j11 -= (long) iZza;
            }
        }
        zzasf zzasfVar = this.zzc;
        int i12 = this.zzg;
        int i13 = zzasfVar.zzd;
        int i14 = i12 / i13;
        if (i14 > 0) {
            long jZzw = this.zzf + zzfm.zzw(this.zzh, 1000000L, zzasfVar.zzc, RoundingMode.DOWN);
            int i15 = i14 * i13;
            int i16 = this.zzg - i15;
            this.zzb.zze(jZzw, 1, i15, i16, null);
            this.zzh += (long) i14;
            this.zzg = i16;
        }
        return j11 <= 0;
    }
}

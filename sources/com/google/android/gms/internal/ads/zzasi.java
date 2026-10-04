package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes4.dex */
final class zzasi implements zzahk {
    private final zzasf zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzasi(zzasf zzasfVar, int i10, long j10, long j11) {
        this.zza = zzasfVar;
        this.zzb = i10;
        this.zzc = j10;
        long j12 = (j11 - j10) / ((long) zzasfVar.zzd);
        this.zzd = j12;
        this.zze = zze(j12);
    }

    private final long zze(long j10) {
        return zzfm.zzw(j10 * ((long) this.zzb), 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j10) {
        long j11 = this.zzb;
        zzasf zzasfVar = this.zza;
        long j12 = (((long) zzasfVar.zzc) * j10) / (j11 * 1000000);
        String str = zzfm.zza;
        long j13 = this.zzd - 1;
        long jMax = Math.max(0L, Math.min(j12, j13));
        long j14 = zzasfVar.zzd;
        long jZze = zze(jMax);
        long j15 = this.zzc;
        zzahl zzahlVar = new zzahl(jZze, (jMax * j14) + j15);
        if (jZze >= j10 || jMax == j13) {
            return new zzahi(zzahlVar, zzahlVar);
        }
        long j16 = jMax + 1;
        return new zzahi(zzahlVar, new zzahl(zze(j16), (j14 * j16) + j15));
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ boolean zzj() {
        return C3373z.a(this);
    }
}

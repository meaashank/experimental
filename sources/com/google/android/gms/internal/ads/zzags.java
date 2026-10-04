package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzags implements zzahk {
    private final zzagu zza;
    private final long zzb;

    public zzags(zzagu zzaguVar, long j10) {
        this.zza = zzaguVar;
        this.zzb = j10;
    }

    private final zzahl zze(long j10, long j11) {
        return new zzahl((j10 * 1000000) / ((long) this.zza.zze), this.zzb + j11);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j10) {
        zzagu zzaguVar = this.zza;
        zzagt zzagtVar = zzaguVar.zzk;
        zzagtVar.getClass();
        long jZzb = zzaguVar.zzb(j10);
        long[] jArr = zzagtVar.zza;
        int iZzo = zzfm.zzo(jArr, jZzb, true, false);
        long j11 = iZzo == -1 ? 0L : jArr[iZzo];
        long[] jArr2 = zzagtVar.zzb;
        zzahl zzahlVarZze = zze(j11, iZzo != -1 ? jArr2[iZzo] : 0L);
        if (zzahlVarZze.zzb == j10 || iZzo == jArr.length - 1) {
            return new zzahi(zzahlVarZze, zzahlVarZze);
        }
        int i10 = iZzo + 1;
        return new zzahi(zzahlVarZze, zze(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ boolean zzj() {
        return C3373z.a(this);
    }
}

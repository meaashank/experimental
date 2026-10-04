package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahd implements zzahk {
    private final zzei zza;
    private final zzei zzb;
    private long zzc;

    public zzahd(long[] jArr, long[] jArr2, long j10) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzguk.zza(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new zzei(length2);
            this.zzb = new zzei(length2);
        } else {
            int i10 = length2 + 1;
            zzei zzeiVar = new zzei(i10);
            this.zza = zzeiVar;
            zzei zzeiVar2 = new zzei(i10);
            this.zzb = zzeiVar2;
            zzeiVar.zza(0L);
            zzeiVar2.zza(0L);
        }
        this.zza.zzb(jArr);
        this.zzb.zzb(jArr2);
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return this.zzb.zzd() > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j10) {
        zzei zzeiVar = this.zzb;
        if (zzeiVar.zzd() == 0) {
            zzahl zzahlVar = zzahl.zza;
            return new zzahi(zzahlVar, zzahlVar);
        }
        int iZzp = zzfm.zzp(zzeiVar, j10, true, true);
        long jZzc = zzeiVar.zzc(iZzp);
        zzei zzeiVar2 = this.zza;
        zzahl zzahlVar2 = new zzahl(jZzc, zzeiVar2.zzc(iZzp));
        if (zzahlVar2.zzb == j10 || iZzp == zzeiVar.zzd() - 1) {
            return new zzahi(zzahlVar2, zzahlVar2);
        }
        int i10 = iZzp + 1;
        return new zzahi(zzahlVar2, new zzahl(zzeiVar.zzc(i10), zzeiVar2.zzc(i10)));
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ boolean zzj() {
        return C3373z.a(this);
    }
}

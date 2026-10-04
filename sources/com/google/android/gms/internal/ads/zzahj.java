package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public class zzahj implements zzahk {
    private final long zza;
    private final zzahi zzb;

    public zzahj(long j10, long j11) {
        this.zza = j10;
        zzahl zzahlVar = j11 == 0 ? zzahl.zza : new zzahl(0L, j11);
        this.zzb = new zzahi(zzahlVar, zzahlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j10) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ boolean zzj() {
        return C3373z.a(this);
    }
}

package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzanb implements zzahk {
    final /* synthetic */ zzanc zza;

    public /* synthetic */ zzanb(zzanc zzancVar, byte[] bArr) {
        Objects.requireNonNull(zzancVar);
        this.zza = zzancVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        zzanc zzancVar = this.zza;
        return zzancVar.zzf().zzh(zzancVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j10) {
        zzanc zzancVar = this.zza;
        long jZzd = zzancVar.zzd() + BigInteger.valueOf(zzancVar.zzf().zzi(j10)).multiply(BigInteger.valueOf(zzancVar.zze() - zzancVar.zzd())).divide(BigInteger.valueOf(zzancVar.zzg())).longValue();
        String str = zzfm.zza;
        zzahl zzahlVar = new zzahl(j10, Math.max(zzancVar.zzd(), Math.min(jZzd - 30000, zzancVar.zze() - 1)));
        return new zzahi(zzahlVar, zzahlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ boolean zzj() {
        return C3373z.a(this);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzahq extends zzagw {
    final /* synthetic */ zzahk zza;
    final /* synthetic */ zzahr zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzahq(zzahr zzahrVar, zzahk zzahkVar, zzahk zzahkVar2) {
        super(zzahkVar);
        this.zza = zzahkVar2;
        Objects.requireNonNull(zzahrVar);
        this.zzb = zzahrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagw, com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j10) {
        zzahi zzahiVarZzc = this.zza.zzc(j10);
        zzahl zzahlVar = zzahiVarZzc.zza;
        long j11 = zzahlVar.zzb;
        zzahr zzahrVar = this.zzb;
        zzahl zzahlVar2 = new zzahl(j11, zzahrVar.zza() + zzahlVar.zzc);
        zzahl zzahlVar3 = zzahiVarZzc.zzb;
        return new zzahi(zzahlVar2, new zzahl(zzahlVar3.zzb, zzahrVar.zza() + zzahlVar3.zzc));
    }
}

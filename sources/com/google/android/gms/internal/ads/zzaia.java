package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzaia implements zzahk {
    final /* synthetic */ zzaic zza;
    private final long zzb;

    public zzaia(zzaic zzaicVar, long j10) {
        Objects.requireNonNull(zzaicVar);
        this.zza = zzaicVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j10) {
        zzaic zzaicVar = this.zza;
        zzahi zzahiVarZzg = zzaicVar.zzh()[0].zzg(j10);
        for (int i10 = 1; i10 < zzaicVar.zzh().length; i10++) {
            zzahi zzahiVarZzg2 = zzaicVar.zzh()[i10].zzg(j10);
            if (zzahiVarZzg2.zza.zzc < zzahiVarZzg.zza.zzc) {
                zzahiVarZzg = zzahiVarZzg2;
            }
        }
        return zzahiVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ boolean zzj() {
        return C3373z.a(this);
    }
}

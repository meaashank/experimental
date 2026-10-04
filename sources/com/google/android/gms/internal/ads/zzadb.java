package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzadb {
    final /* synthetic */ zzadc zza;
    private zzv zzb;

    public /* synthetic */ zzadb(zzadc zzadcVar, byte[] bArr) {
        Objects.requireNonNull(zzadcVar);
        this.zza = zzadcVar;
    }

    public final void zza(final zzbv zzbvVar) {
        zzt zztVar = new zzt();
        zztVar.zzv(zzbvVar.zzb);
        zztVar.zzw(zzbvVar.zzc);
        zztVar.zzo("video/raw");
        this.zzb = zztVar.zzQ();
        this.zza.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzada
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzB().zzd(zzbvVar);
            }
        });
    }

    public final void zzb(long j10, long j11, boolean z10) {
        if (z10) {
            zzadc zzadcVar = this.zza;
            if (zzadcVar.zzA() != null) {
                zzadcVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacy
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zza.zzB().zzb();
                    }
                });
            }
        }
        zzv zzvVarZzQ = this.zzb;
        if (zzvVarZzQ == null) {
            zzvVarZzQ = new zzt().zzQ();
        }
        zzv zzvVar = zzvVarZzQ;
        zzadc zzadcVar2 = this.zza;
        zzadcVar2.zzD().zzcS(j11, j10, zzvVar, null);
        ((zzafb) zzadcVar2.zzz().remove()).zza(j10);
    }
}

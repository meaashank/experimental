package com.google.android.gms.internal.ads;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class zzahr implements zzagk {
    private final long zzb;
    private final zzagk zzc;

    public zzahr(long j10, zzagk zzagkVar) {
        this.zzb = j10;
        this.zzc = zzagkVar;
    }

    public final /* synthetic */ long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final zzaht zzs(int i10, int i11) {
        return this.zzc.zzs(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zzv() {
        this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zzw(zzahk zzahkVar) {
        this.zzc.zzw(new zzahq(this, zzahkVar, zzahkVar));
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzasj implements zzagh {
    private final zzeu zza = new zzeu(4);
    private final zzahm zzb = new zzahm(-1, -1, "image/webp");

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        zzeu zzeuVar = this.zza;
        zzeuVar.zza(4);
        zzagiVar.zzi(zzeuVar.zzi(), 0, 4);
        if (zzeuVar.zzz() != 1380533830) {
            return false;
        }
        zzagiVar.zzk(4);
        zzeuVar.zza(4);
        zzagiVar.zzi(zzeuVar.zzi(), 0, 4);
        return zzeuVar.zzz() == 1464156752;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ List zzb() {
        return C3365x.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zzb.zzc(zzagkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        return this.zzb.zzd(zzagiVar, zzahhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j10, long j11) {
        this.zzb.zze(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public /* synthetic */ zzagh zzg() {
        return C3365x.b(this);
    }
}

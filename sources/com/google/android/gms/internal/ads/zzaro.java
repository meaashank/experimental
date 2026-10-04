package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzaro implements zzarh {
    final /* synthetic */ zzarr zza;
    private final zzet zzb;

    public zzaro(zzarr zzarrVar) {
        Objects.requireNonNull(zzarrVar);
        this.zza = zzarrVar;
        this.zzb = new zzet(new byte[4], 4);
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public final void zza(zzfj zzfjVar, zzagk zzagkVar, zzarv zzarvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public final void zzb(zzeu zzeuVar) {
        if (zzeuVar.zzs() == 0 && (zzeuVar.zzs() & 128) != 0) {
            zzeuVar.zzk(6);
            int iZzd = zzeuVar.zzd() / 4;
            for (int i10 = 0; i10 < iZzd; i10++) {
                zzet zzetVar = this.zzb;
                zzeuVar.zzl(zzetVar, 4);
                int iZzj = zzetVar.zzj(16);
                zzetVar.zzh(3);
                if (iZzj == 0) {
                    zzetVar.zzh(13);
                } else {
                    int iZzj2 = zzetVar.zzj(13);
                    zzarr zzarrVar = this.zza;
                    if (zzarrVar.zzj().get(iZzj2) == null) {
                        zzarrVar.zzj().put(iZzj2, new zzari(new zzarp(zzarrVar, iZzj2)));
                        zzarrVar.zzo(zzarrVar.zzn() + 1);
                    }
                }
            }
            this.zza.zzj().remove(0);
        }
    }
}

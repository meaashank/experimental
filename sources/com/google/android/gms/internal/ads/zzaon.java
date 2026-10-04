package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaon implements zzanz {
    private final zzeu zza = new zzeu();
    private final zzeu zzb = new zzeu();
    private final zzaom zzc = new zzaom();

    @Nullable
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzanz
    public final void zza(byte[] bArr, int i10, int i11, zzany zzanyVar, zzdu zzduVar) {
        zzeu zzeuVar = this.zza;
        zzeuVar.zzb(bArr, i11 + i10);
        zzeuVar.zzh(i10);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzeu zzeuVar2 = this.zzb;
        if (zzfm.zzQ(zzeuVar, zzeuVar2, this.zzd)) {
            zzeuVar.zzb(zzeuVar2.zzi(), zzeuVar2.zze());
        }
        zzaom zzaomVar = this.zzc;
        zzaomVar.zzb();
        ArrayList arrayList = new ArrayList();
        while (zzeuVar.zzd() >= 3) {
            int iZze = zzeuVar.zze();
            int iZzs = zzeuVar.zzs();
            int iZzt = zzeuVar.zzt();
            int iZzg = zzeuVar.zzg() + iZzt;
            zzcy zzcyVarZza = null;
            if (iZzg > iZze) {
                zzeuVar.zzh(iZze);
            } else {
                if (iZzs != 128) {
                    switch (iZzs) {
                        case 20:
                            zzaomVar.zzc(zzeuVar, iZzt);
                            break;
                        case 21:
                            zzaomVar.zzd(zzeuVar, iZzt);
                            break;
                        case 22:
                            zzaomVar.zze(zzeuVar, iZzt);
                            break;
                    }
                } else {
                    zzcyVarZza = zzaomVar.zza();
                    zzaomVar.zzb();
                }
                zzeuVar.zzh(iZzg);
            }
            if (zzcyVarZza != null) {
                arrayList.add(zzcyVarZza);
            }
        }
        zzduVar.zza(new zzanr(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}

package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
final class zzaiq extends zzaiv {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaiq(zzaht zzahtVar) {
        super(zzahtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaiv
    public final boolean zza(zzeu zzeuVar) throws zzaiu {
        if (this.zzc) {
            zzeuVar.zzk(1);
        } else {
            int iZzs = zzeuVar.zzs();
            int i10 = iZzs >> 4;
            this.zze = i10;
            if (i10 == 2) {
                int i11 = zzb[(iZzs >> 2) & 3];
                zzt zztVar = new zzt();
                zztVar.zzn("video/x-flv");
                zztVar.zzo("audio/mpeg");
                zztVar.zzH(1);
                zztVar.zzJ(i11);
                this.zza.zzA(zztVar.zzQ());
                this.zzd = true;
            } else if (i10 == 7 || i10 == 8) {
                zzt zztVar2 = new zzt();
                zztVar2.zzn("video/x-flv");
                zztVar2.zzo(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zztVar2.zzH(1);
                zztVar2.zzJ(8000);
                this.zza.zzA(zztVar2.zzQ());
                this.zzd = true;
            } else if (i10 != 10) {
                throw new zzaiu(androidx.multidex.d.a(new StringBuilder(String.valueOf(i10).length() + 28), "Audio format not supported: ", i10));
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaiv
    public final boolean zzb(zzeu zzeuVar, long j10) throws zzat {
        if (this.zze == 2) {
            int iZzd = zzeuVar.zzd();
            zzaht zzahtVar = this.zza;
            zzahtVar.zzc(zzeuVar, iZzd);
            zzahtVar.zze(j10, 1, iZzd, 0, null);
            return true;
        }
        int iZzs = zzeuVar.zzs();
        if (iZzs != 0 || this.zzd) {
            if (this.zze == 10 && iZzs != 1) {
                return false;
            }
            int iZzd2 = zzeuVar.zzd();
            zzaht zzahtVar2 = this.zza;
            zzahtVar2.zzc(zzeuVar, iZzd2);
            zzahtVar2.zze(j10, 1, iZzd2, 0, null);
            return true;
        }
        int iZzd3 = zzeuVar.zzd();
        byte[] bArr = new byte[iZzd3];
        zzeuVar.zzm(bArr, 0, iZzd3);
        zzafe zzafeVarZza = zzaff.zza(bArr);
        zzt zztVar = new zzt();
        zztVar.zzn("video/x-flv");
        zztVar.zzo("audio/mp4a-latm");
        zztVar.zzk(zzafeVarZza.zzc);
        zztVar.zzH(zzafeVarZza.zzb);
        zztVar.zzJ(zzafeVarZza.zza);
        zztVar.zzr(Collections.singletonList(bArr));
        this.zza.zzA(zztVar.zzQ());
        this.zzd = true;
        return false;
    }
}

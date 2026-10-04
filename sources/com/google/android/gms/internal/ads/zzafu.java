package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzafu {
    public static void zza(long j10, zzeu zzeuVar, zzaht[] zzahtVarArr) {
        int iZzB;
        while (true) {
            if (zzeuVar.zzd() <= 1) {
                return;
            }
            int iZzc = zzc(zzeuVar);
            int iZzc2 = zzc(zzeuVar);
            int iZzg = zzeuVar.zzg() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzeuVar.zzd()) {
                zzeh.zzc("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzg = zzeuVar.zze();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzs = zzeuVar.zzs();
                int iZzt = zzeuVar.zzt();
                if (iZzt == 49) {
                    iZzB = zzeuVar.zzB();
                    iZzt = 49;
                } else {
                    iZzB = 0;
                }
                int iZzs2 = zzeuVar.zzs();
                if (iZzt == 47) {
                    zzeuVar.zzk(1);
                    iZzt = 47;
                }
                boolean z10 = iZzs == 181 && (iZzt == 49 || iZzt == 47) && iZzs2 == 3;
                if (iZzt == 49) {
                    z10 &= iZzB == 1195456820;
                }
                if (z10) {
                    zzb(j10, zzeuVar, zzahtVarArr);
                }
            }
            zzeuVar.zzh(iZzg);
        }
    }

    public static void zzb(long j10, zzeu zzeuVar, zzaht[] zzahtVarArr) {
        int iZzs = zzeuVar.zzs();
        if ((iZzs & 64) != 0) {
            int i10 = iZzs & 31;
            zzeuVar.zzk(1);
            int iZzg = zzeuVar.zzg();
            for (zzaht zzahtVar : zzahtVarArr) {
                int i11 = i10 * 3;
                zzeuVar.zzh(iZzg);
                zzahtVar.zzc(zzeuVar, i11);
                zzguk.zzi(j10 != -9223372036854775807L);
                zzahtVar.zze(j10, 1, i11, 0, null);
            }
        }
    }

    private static int zzc(zzeu zzeuVar) {
        int i10 = 0;
        while (zzeuVar.zzd() != 0) {
            int iZzs = zzeuVar.zzs();
            i10 += iZzs;
            if (iZzs != 255) {
                return i10;
            }
        }
        return -1;
    }
}

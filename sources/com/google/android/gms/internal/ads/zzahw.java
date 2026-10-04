package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahw {
    public final List zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    private zzahw(List list, int i10, String str, int i11) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = i11;
    }

    public static zzahw zza(zzeu zzeuVar) throws zzat {
        String str;
        int iZzs;
        int iZzs2;
        int i10;
        int i11;
        int i12;
        try {
            if (zzeuVar.zzB() != 0) {
                throw zzat.zzb("Unsupported VVC version", null);
            }
            int iZzs3 = zzeuVar.zzs();
            int i13 = iZzs3 >> 1;
            int i14 = 1;
            str = "L";
            if ((iZzs3 & 1) != 0) {
                zzeuVar.zzk(1);
                int iZzs4 = zzeuVar.zzs() >> 4;
                iZzs = zzeuVar.zzs() >> 5;
                int iZzs5 = zzeuVar.zzs() & 63;
                int iZzs6 = zzeuVar.zzs();
                i10 = iZzs6 >> 1;
                str = (iZzs6 & 1) != 0 ? "H" : "L";
                iZzs2 = zzeuVar.zzs();
                zzeuVar.zzk(iZzs5);
                int i15 = iZzs4 & 7;
                if (i15 > 1) {
                    int iZzs7 = zzeuVar.zzs();
                    for (int i16 = 0; i16 < i15 - 1; i16++) {
                        if (((iZzs7 >> (7 - i16)) & 1) != 0) {
                            zzeuVar.zzk(1);
                        }
                    }
                }
                zzeuVar.zzk(zzeuVar.zzs() * 4);
                zzeuVar.zzk(6);
            } else {
                iZzs = 0;
                iZzs2 = 0;
                i10 = 0;
            }
            int iZzs8 = zzeuVar.zzs();
            int iZzg = zzeuVar.zzg();
            int i17 = 0;
            int i18 = 0;
            while (true) {
                i11 = 12;
                i12 = 13;
                if (i17 >= iZzs8) {
                    break;
                }
                int iZzs9 = zzeuVar.zzs() & 31;
                int iZzt = (iZzs9 == 13 || iZzs9 == 12) ? 1 : zzeuVar.zzt();
                for (int i19 = 0; i19 < iZzt; i19++) {
                    int iZzt2 = zzeuVar.zzt();
                    i18 = iZzt2 + 4 + i18;
                    zzeuVar.zzk(iZzt2);
                }
                i17++;
            }
            zzeuVar.zzh(iZzg);
            byte[] bArr = new byte[i18];
            int i20 = 0;
            int i21 = 0;
            while (i20 < iZzs8) {
                int iZzs10 = zzeuVar.zzs() & 31;
                int iZzt3 = (iZzs10 == i12 || iZzs10 == i11) ? i14 : zzeuVar.zzt();
                int i22 = i14;
                for (int i23 = 0; i23 < iZzt3; i23++) {
                    int iZzt4 = zzeuVar.zzt();
                    System.arraycopy(zzgr.zza, 0, bArr, i21, 4);
                    int i24 = i21 + 4;
                    zzeuVar.zzm(bArr, i24, iZzt4);
                    i21 = i24 + iZzt4;
                }
                i20++;
                i14 = i22;
                i11 = 12;
                i12 = 13;
            }
            int i25 = i14;
            Locale locale = Locale.US;
            Integer numValueOf = Integer.valueOf(i10);
            Integer numValueOf2 = Integer.valueOf(iZzs2);
            Object[] objArr = new Object[3];
            objArr[0] = numValueOf;
            objArr[i25] = str;
            objArr[2] = numValueOf2;
            return new zzahw(zzgxm.zzj(bArr), (i13 & 3) + 1, String.format(locale, "vvc1.%d.%s%d", objArr), iZzs + 8);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzat.zzb("Error parsing VVC configuration", e10);
        }
    }
}

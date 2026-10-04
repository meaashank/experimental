package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhh {
    public static int zza(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    public static zzhe zzb(zzeu zzeuVar, boolean z10, boolean z11) throws zzat {
        if (z10) {
            zzc(3, zzeuVar, false);
        }
        String strZzK = zzeuVar.zzK((int) zzeuVar.zzA(), StandardCharsets.UTF_8);
        int length = strZzK.length();
        long jZzA = zzeuVar.zzA();
        String[] strArr = new String[(int) jZzA];
        int length2 = length + 15;
        for (int i10 = 0; i10 < jZzA; i10++) {
            String strZzK2 = zzeuVar.zzK((int) zzeuVar.zzA(), StandardCharsets.UTF_8);
            strArr[i10] = strZzK2;
            length2 = length2 + 4 + strZzK2.length();
        }
        if (z11 && (zzeuVar.zzs() & 1) == 0) {
            throw zzat.zzb("framing bit expected to be set", null);
        }
        return new zzhe(strZzK, strArr, length2 + 1);
    }

    public static boolean zzc(int i10, zzeu zzeuVar, boolean z10) throws zzat {
        if (zzeuVar.zzd() < 7) {
            if (z10) {
                return false;
            }
            int iZzd = zzeuVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 18);
            sb2.append("too short header: ");
            sb2.append(iZzd);
            throw zzat.zzb(sb2.toString(), null);
        }
        if (zzeuVar.zzs() != i10) {
            if (z10) {
                return false;
            }
            throw zzat.zzb("expected header type ".concat(String.valueOf(Integer.toHexString(i10))), null);
        }
        if (zzeuVar.zzs() == 118 && zzeuVar.zzs() == 111 && zzeuVar.zzs() == 114 && zzeuVar.zzs() == 98 && zzeuVar.zzs() == 105 && zzeuVar.zzs() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw zzat.zzb("expected characters 'vorbis'", null);
    }
}

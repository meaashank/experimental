package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzapn {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private zzapn(String str, int i10, String str2, Set set) {
        this.zzb = i10;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static zzapn zza(String str, int i10) {
        String str2;
        String strTrim = str.trim();
        zzguk.zza(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(C4.q.f17581a);
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        String str3 = zzfm.zza;
        String[] strArrSplit = strTrim.split("\\.", -1);
        String str4 = strArrSplit[0];
        HashSet hashSet = new HashSet();
        for (int i11 = 1; i11 < strArrSplit.length; i11++) {
            hashSet.add(strArrSplit[i11]);
        }
        return new zzapn(str4, i10, str2, hashSet);
    }

    public static zzapn zzb() {
        return new zzapn("", 0, "", Collections.EMPTY_SET);
    }
}

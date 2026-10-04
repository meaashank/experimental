package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
final class zzdb {
    private static final String zza;
    private static final String zzb;
    private static final String zzc;
    private static final String zzd;
    private static final String zze;

    static {
        String str = zzfm.zza;
        zza = Integer.toString(0, 36);
        zzb = Integer.toString(1, 36);
        zzc = Integer.toString(2, 36);
        zzd = Integer.toString(3, 36);
        zze = Integer.toString(4, 36);
    }

    public static ArrayList zza(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (zzdd zzddVar : (zzdd[]) spanned.getSpans(0, spanned.length(), zzdd.class)) {
            arrayList.add(zzb(spanned, zzddVar, 1, zzddVar.zza()));
        }
        for (zzdf zzdfVar : (zzdf[]) spanned.getSpans(0, spanned.length(), zzdf.class)) {
            arrayList.add(zzb(spanned, zzdfVar, 2, zzdfVar.zza()));
        }
        for (zzdc zzdcVar : (zzdc[]) spanned.getSpans(0, spanned.length(), zzdc.class)) {
            arrayList.add(zzb(spanned, zzdcVar, 3, null));
        }
        for (zzdg zzdgVar : (zzdg[]) spanned.getSpans(0, spanned.length(), zzdg.class)) {
            arrayList.add(zzb(spanned, zzdgVar, 4, zzdgVar.zza()));
        }
        return arrayList;
    }

    private static Bundle zzb(Spanned spanned, Object obj, int i10, @Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(zza, spanned.getSpanStart(obj));
        bundle2.putInt(zzb, spanned.getSpanEnd(obj));
        bundle2.putInt(zzc, spanned.getSpanFlags(obj));
        bundle2.putInt(zzd, i10);
        if (bundle != null) {
            bundle2.putBundle(zze, bundle);
        }
        return bundle2;
    }
}

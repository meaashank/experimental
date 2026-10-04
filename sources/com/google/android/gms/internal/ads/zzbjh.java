package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbjh {
    public static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbkq.zzd("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzble.zza);
        zzc(arrayList, zzble.zzb);
        zzc(arrayList, zzble.zzc);
        zzc(arrayList, zzble.zzd);
        zzc(arrayList, zzble.zze);
        zzc(arrayList, zzble.zzu);
        zzc(arrayList, zzble.zzf);
        zzc(arrayList, zzble.zzm);
        zzc(arrayList, zzble.zzn);
        zzc(arrayList, zzble.zzo);
        zzc(arrayList, zzble.zzp);
        zzc(arrayList, zzble.zzq);
        zzc(arrayList, zzble.zzr);
        zzc(arrayList, zzble.zzs);
        zzc(arrayList, zzble.zzt);
        zzc(arrayList, zzble.zzg);
        zzc(arrayList, zzble.zzh);
        zzc(arrayList, zzble.zzi);
        zzc(arrayList, zzble.zzj);
        zzc(arrayList, zzble.zzk);
        zzc(arrayList, zzble.zzl);
        return arrayList;
    }

    public static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzblt.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbkq zzbkqVar) {
        String str = (String) zzbkqVar.zze();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}

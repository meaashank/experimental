package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbrb implements zzbqh {
    private final zzbra zza;

    public zzbrb(zzbra zzbraVar) {
        this.zza = zzbraVar;
    }

    public static void zzb(zzclm zzclmVar, zzbra zzbraVar) {
        zzclmVar.zzab("/reward", new zzbrb(zzbraVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzc();
                    return;
                }
                return;
            }
        }
        zzcct zzcctVar = null;
        try {
            int i10 = Integer.parseInt((String) map.get(RewardPlus.AMOUNT));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzcctVar = new zzcct(str2, i10);
            }
        } catch (NumberFormatException e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to parse reward amount.", e10);
        }
        this.zza.zzb(zzcctVar);
    }
}

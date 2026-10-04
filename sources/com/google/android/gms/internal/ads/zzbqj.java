package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbqj implements zzbqh {
    private final zzbqk zza;

    public zzbqj(zzbqk zzbqkVar) {
        this.zza = zzbqkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclm zzclmVar = (zzclm) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f10 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to parse float", e10);
        }
        zzbqk zzbqkVar = this.zza;
        zzbqkVar.zza(zEquals);
        zzbqkVar.zzb(zEquals2, f10);
        zzclmVar.zzaE(zEquals, (int) f10);
    }
}

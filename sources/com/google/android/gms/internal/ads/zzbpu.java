package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzbpu implements zzbqh {
    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclm zzclmVar = (zzclm) obj;
        if (map.containsKey("start")) {
            zzclmVar.zzP().zzr();
        } else if (map.containsKey("stop")) {
            zzclmVar.zzP().zzs();
        } else if (map.containsKey("cancel")) {
            zzclmVar.zzP().zzt();
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzazx extends zzazv {
    public String zza;
    public long zzb;
    public String zzc;
    public String zzd;
    public String zze;

    public zzazx() {
        this.zza = t1.b.f238825S4;
        this.zzb = -1L;
        this.zzc = t1.b.f238825S4;
        this.zzd = t1.b.f238825S4;
        this.zze = t1.b.f238825S4;
    }

    @Override // com.google.android.gms.internal.ads.zzazv
    public final HashMap zza() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(4, this.zze);
        map.put(3, this.zzd);
        map.put(2, this.zzc);
        map.put(1, Long.valueOf(this.zzb));
        return map;
    }

    public zzazx(String str) {
        String str2 = t1.b.f238825S4;
        this.zza = t1.b.f238825S4;
        this.zzb = -1L;
        this.zzc = t1.b.f238825S4;
        this.zzd = t1.b.f238825S4;
        this.zze = t1.b.f238825S4;
        HashMap mapZzb = zzazv.zzb(str);
        if (mapZzb != null) {
            this.zza = mapZzb.get(0) == null ? t1.b.f238825S4 : (String) mapZzb.get(0);
            this.zzb = mapZzb.get(1) != null ? ((Long) mapZzb.get(1)).longValue() : -1L;
            this.zzc = mapZzb.get(2) == null ? t1.b.f238825S4 : (String) mapZzb.get(2);
            this.zzd = mapZzb.get(3) == null ? t1.b.f238825S4 : (String) mapZzb.get(3);
            this.zze = mapZzb.get(4) != null ? (String) mapZzb.get(4) : str2;
        }
    }
}

package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbda extends zzbdt {
    private final zzbch zzh;

    public zzbda(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, int i10, int i11, zzbch zzbchVar) {
        super(zzbcgVar, "4UiqdD16WGcqj9vsERkA6tbA4c/2yE/sXnYMi3TR5nPXoyMXncc0iB8g5zhndeqU", "5yR6P4d4j2VnbvLNLQtiv9yBd7AWiKZJ6Mp0Kq9QPto=", zzayaVar, i10, 85);
        this.zzh = zzbchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Method method = this.zze;
        zzbch zzbchVar = this.zzh;
        long[] jArr = (long[]) method.invoke(null, Long.valueOf(zzbchVar.zzf()), Long.valueOf(zzbchVar.zzg()), Long.valueOf(zzbchVar.zzi()), Long.valueOf(zzbchVar.zzh()));
        zzaya zzayaVar = this.zzd;
        synchronized (zzayaVar) {
            zzayaVar.zzY(jArr[0]);
            zzayaVar.zzZ(jArr[1]);
        }
    }
}

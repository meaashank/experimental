package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbcx extends zzbdt {
    private final long zzh;

    public zzbcx(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, long j10, int i10, int i11) {
        super(zzbcgVar, "y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", zzayaVar, i10, 25);
        this.zzh = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zze.invoke(null, null)).longValue();
        zzaya zzayaVar = this.zzd;
        synchronized (zzayaVar) {
            try {
                zzayaVar.zzac(jLongValue);
                long j10 = this.zzh;
                if (j10 != 0) {
                    zzayaVar.zzk(jLongValue - j10);
                    zzayaVar.zzn(j10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

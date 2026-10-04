package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbde extends zzbdt {
    private final zzbbj zzh;
    private final long zzi;
    private final long zzj;

    public zzbde(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, int i10, int i11, zzbbj zzbbjVar, long j10, long j11) {
        super(zzbcgVar, "0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", zzayaVar, i10, 11);
        this.zzh = zzbbjVar;
        this.zzi = j10;
        this.zzj = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzbbj zzbbjVar = this.zzh;
        if (zzbbjVar != null) {
            zzbbh zzbbhVar = new zzbbh((String) this.zze.invoke(null, zzbbjVar.zzb(), Long.valueOf(this.zzi), Long.valueOf(this.zzj)));
            zzaya zzayaVar = this.zzd;
            synchronized (zzayaVar) {
                try {
                    zzayaVar.zzf(zzbbhVar.zza.longValue());
                    if (zzbbhVar.zzb.longValue() >= 0) {
                        zzayaVar.zzW(zzbbhVar.zzb.longValue());
                    }
                    if (zzbbhVar.zzc.longValue() >= 0) {
                        zzayaVar.zzX(zzbbhVar.zzc.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

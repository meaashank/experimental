package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbdd extends zzbdt {
    private final zzbby zzh;

    public zzbdd(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, int i10, int i11, zzbby zzbbyVar) {
        super(zzbcgVar, "/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", zzayaVar, i10, 94);
        this.zzh = zzbbyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int iIntValue = ((Integer) this.zze.invoke(null, this.zzh.zzb())).intValue();
        zzaya zzayaVar = this.zzd;
        synchronized (zzayaVar) {
            zzayaVar.zzaj(zzayo.zza(iIntValue));
        }
    }
}

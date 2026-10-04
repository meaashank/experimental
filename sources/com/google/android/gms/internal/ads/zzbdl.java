package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbdl extends zzbdt {
    private final StackTraceElement[] zzh;

    public zzbdl(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(zzbcgVar, "X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", zzayaVar, i10, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            zzbbx zzbbxVar = new zzbbx((String) this.zze.invoke(null, stackTraceElementArr));
            zzaya zzayaVar = this.zzd;
            synchronized (zzayaVar) {
                try {
                    zzayaVar.zzC(zzbbxVar.zza.longValue());
                    if (zzbbxVar.zzb.booleanValue()) {
                        zzayaVar.zzag(true != zzbbxVar.zzc.booleanValue() ? 2 : 1);
                    } else {
                        zzayaVar.zzag(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

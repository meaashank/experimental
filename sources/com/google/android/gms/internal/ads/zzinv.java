package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzinv implements zziof, zzinq {
    private static final Object zza = new Object();
    private volatile zziof zzb;
    private volatile Object zzc = zza;

    private zzinv(zziof zziofVar) {
        this.zzb = zziofVar;
    }

    public static zziof zza(zziof zziofVar) {
        return zziofVar instanceof zzinv ? zziofVar : new zzinv(zziofVar);
    }

    public static zzinq zzc(zziof zziofVar) {
        if (zziofVar instanceof zzinq) {
            return (zzinq) zziofVar;
        }
        zziofVar.getClass();
        return new zzinv(zziofVar);
    }

    private final synchronized Object zzd() {
        try {
            Object obj = this.zzc;
            Object obj2 = zza;
            if (obj != obj2) {
                return obj;
            }
            Object objZzb = this.zzb.zzb();
            Object obj3 = this.zzc;
            if (obj3 != obj2 && obj3 != objZzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
            }
            this.zzc = objZzb;
            this.zzb = null;
            return objZzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final Object zzb() {
        Object obj = this.zzc;
        return obj == zza ? zzd() : obj;
    }
}

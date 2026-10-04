package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzinu implements zzinw {
    private zziof zza;

    public static void zza(zziof zziofVar, zziof zziofVar2) {
        zzinu zzinuVar = (zzinu) zziofVar;
        if (zzinuVar.zza != null) {
            throw new IllegalStateException();
        }
        zzinuVar.zza = zziofVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final Object zzb() {
        zziof zziofVar = this.zza;
        if (zziofVar != null) {
            return zziofVar.zzb();
        }
        throw new IllegalStateException();
    }
}

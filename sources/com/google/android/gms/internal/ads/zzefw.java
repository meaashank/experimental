package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzefw implements zzinw {
    private final zziof zza;

    private zzefw(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzefw zzc(zziof zziofVar) {
        return new zzefw(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((zzcok) this.zza).zza().getPackageName();
        zzioe.zzb(packageName);
        return packageName;
    }
}

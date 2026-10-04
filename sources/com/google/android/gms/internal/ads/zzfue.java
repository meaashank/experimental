package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfue implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzfue(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzfue zza(zziof zziofVar, zziof zziofVar2) {
        return new zzfue(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfud((zzfuj) this.zza.zzb(), (zzftu) this.zzb.zzb());
    }
}

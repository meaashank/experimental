package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgdi implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzgdi(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        this.zza = zziofVar;
        this.zzb = zziofVar3;
    }

    public static zzgdi zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzgdi(zziofVar, zziofVar2, zziofVar3, zziofVar4);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgdh zzb() {
        return new zzgdh((androidx.datastore.core.d) this.zza.zzb(), zzcom.zzc(), (zzdxu) this.zzb.zzb(), new zzgcg());
    }
}

package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgou implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzgou(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzgou zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzgou(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.zza.zzb();
        zzggf zzggfVar = (zzggf) this.zzb.zzb();
        final zzgrh zzgrhVar = (zzgrh) this.zzc.zzb();
        return zzggfVar.zza(file, zzggt.zzh(), new zzgub() { // from class: com.google.android.gms.internal.ads.zzgom
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                zzgrhVar.zzd(15308, (Throwable) obj);
                return zzggt.zzh();
            }
        });
    }
}

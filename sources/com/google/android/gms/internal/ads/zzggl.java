package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzggl implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;

    private zzggl(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
        this.zze = zziofVar5;
    }

    public static zzggl zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5) {
        return new zzggl(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zza.zzb();
        zzgfo zzgfoVar = (zzgfo) this.zzb.zzb();
        ExecutorService executorService = (ExecutorService) this.zzc.zzb();
        zzgfh zzgfhVar = (zzgfh) this.zzd.zzb();
        zzgei zzgeiVar = (zzgei) this.zze.zzb();
        return new zzggp(context, zzgfoVar, executorService, zzgfhVar, new Random(), zzgeiVar.zzg().zza(), zzgeiVar.zzg().zzc(), zzgeiVar.zzg().zzd(), zzgeiVar.zzg().zzb(), zzgeiVar.zzd(), zzgeiVar.zzM(), zzgeiVar.zzK() - 1);
    }
}

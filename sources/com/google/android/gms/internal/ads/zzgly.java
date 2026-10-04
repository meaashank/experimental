package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgly implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzgly(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzgly zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzgly(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.zza.zzb();
        zziof zziofVar = this.zzc;
        return new zzgmd(context, context.getSharedPreferences("pcvmspf2", 0), zzinv.zzc(this.zzb), (zzgrh) zziofVar.zzb());
    }
}

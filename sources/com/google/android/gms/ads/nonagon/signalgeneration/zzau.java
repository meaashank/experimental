package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zzioe;

/* JADX INFO: loaded from: classes3.dex */
public final class zzau implements zzinw {
    private final zzat zza;

    private zzau(zzat zzatVar) {
        this.zza = zzatVar;
    }

    public static zzau zza(zzat zzatVar) {
        return new zzau(zzatVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        zzbil.zza.EnumC0488zza enumC0488zzaZzc = this.zza.zzc();
        zzioe.zzb(enumC0488zzaZzc);
        return enumC0488zzaZzc;
    }
}

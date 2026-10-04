package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdjs implements zzinw {
    private final zzdjp zza;

    private zzdjs(zzdjp zzdjpVar) {
        this.zza = zzdjpVar;
    }

    public static zzdjs zza(zzdjp zzdjpVar) {
        return new zzdjs(zzdjpVar);
    }

    public static Set zzc(zzdjp zzdjpVar) {
        Set set = Collections.EMPTY_SET;
        zzioe.zzb(set);
        return set;
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}

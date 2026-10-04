package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzms implements zzmk {
    public final zzxj zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzms(zzxq zzxqVar, boolean z10) {
        this.zza = new zzxj(zzxqVar, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final Object zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final zzbf zzb() {
        return this.zza.zzA();
    }

    public final void zzc(int i10) {
        this.zzd = i10;
        this.zze = false;
        this.zzc.clear();
    }
}

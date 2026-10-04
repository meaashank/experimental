package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import e.InterfaceC4326A;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzjh implements zzabp {
    final /* synthetic */ zzjj zza;

    @InterfaceC4326A("this")
    private final HashMap zzb;

    @InterfaceC4326A("this")
    private final zzqj zzc;

    public zzjh(zzjj zzjjVar, zzqj zzqjVar) {
        Objects.requireNonNull(zzjjVar);
        this.zza = zzjjVar;
        this.zzb = new HashMap();
        this.zzc = zzqjVar;
    }

    @InterfaceC4326A("this")
    private final void zze(zzabn zzabnVar) {
        zzqj zzqjVar = (zzqj) this.zzb.remove(zzabnVar);
        zzqjVar.getClass();
        zzji zzjiVar = (zzji) this.zza.zzl().get(zzqjVar);
        if (zzjiVar != null) {
            zzjiVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized zzabn zza() {
        zzabn zzabnVarZza;
        zzjj zzjjVar = this.zza;
        zzabv zzabvVarZzk = zzjjVar.zzk();
        HashMap map = this.zzb;
        zzabnVarZza = zzabvVarZzk.zza();
        zzqj zzqjVar = this.zzc;
        map.put(zzabnVarZza, zzqjVar);
        zzji zzjiVar = (zzji) zzjjVar.zzl().get(zzqjVar);
        if (zzjiVar != null) {
            zzjiVar.zza();
        }
        return zzabnVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized void zzb(zzabn zzabnVar) {
        this.zza.zzk().zzb(zzabnVar);
        zze(zzabnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized void zzc(@Nullable zzabo zzaboVar) {
        this.zza.zzk().zzc(zzaboVar);
        while (zzaboVar != null) {
            zze(zzaboVar.zzd());
            zzaboVar = zzaboVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized void zzd() {
        this.zza.zzk().zzd();
    }
}

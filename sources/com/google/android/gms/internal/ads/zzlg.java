package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzlg implements zzmk {
    private final Object zza;
    private zzbf zzb;

    public zzlg(Object obj, zzxj zzxjVar) {
        this.zza = obj;
        this.zzb = zzxjVar.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmk
    public final zzbf zzb() {
        return this.zzb;
    }

    public final void zzc(zzbf zzbfVar) {
        this.zzb = zzbfVar;
    }
}

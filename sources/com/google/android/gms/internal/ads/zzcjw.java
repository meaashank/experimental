package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcjw extends zzcjs {
    public zzcjw(zzcif zzcifVar) {
        super(zzcifVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final boolean zze(String str) {
        String strZzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str);
        zzcif zzcifVar = (zzcif) this.zzc.get();
        if (zzcifVar != null && strZzg != null) {
            zzcifVar.zzt(strZzg, this);
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("VideoStreamNoopCache is doing nothing.");
        zzq(str, strZzg, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zzl() {
    }
}

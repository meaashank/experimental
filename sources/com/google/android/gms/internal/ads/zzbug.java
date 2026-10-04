package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbug extends zzcgv {
    private final Object zza = new Object();
    private final zzbul zzb;
    private boolean zzc;

    public zzbug(zzbul zzbulVar) {
        this.zzb = zzbulVar;
    }

    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
                if (this.zzc) {
                    com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                    return;
                }
                this.zzc = true;
                zze(new zzbud(this), new zzcgr());
                zze(new zzbue(this), new zzbuf(this));
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ zzbul zzb() {
        return this.zzb;
    }
}

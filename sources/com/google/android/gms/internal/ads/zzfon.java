package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfon {
    private final zzfof zza;
    private final ListenableFuture zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfon(final zzfnl zzfnlVar, final zzfoe zzfoeVar, final zzfof zzfofVar) {
        this.zza = zzfofVar;
        this.zzb = zzhcy.zzh(zzhcy.zzj(zzfoeVar.zza(zzfofVar), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzfom
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfoeVar, zzfnlVar, zzfofVar, (zzfnu) obj);
            }
        }, zzfofVar.zza()), Exception.class, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzfok
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzd(zzfoeVar, (Exception) obj);
            }
        }, zzfofVar.zza());
    }

    public final synchronized void zza(zzhcv zzhcvVar) {
        zzfof zzfofVar = this.zza;
        zzhcy.zzr(zzhcy.zzj(this.zzb, zzfol.zza, zzfofVar.zza()), zzhcvVar, zzfofVar.zza());
    }

    public final synchronized ListenableFuture zzb(zzfof zzfofVar) {
        if (!this.zzd && !this.zzc) {
            zzfof zzfofVar2 = this.zza;
            if (zzfofVar2.zzb() != null && zzfofVar.zzb() != null && zzfofVar2.zzb().equals(zzfofVar.zzb())) {
                this.zzc = true;
                return this.zzb;
            }
        }
        return null;
    }

    public final /* synthetic */ ListenableFuture zzc(zzfoe zzfoeVar, zzfnl zzfnlVar, zzfof zzfofVar, zzfnu zzfnuVar) {
        synchronized (this) {
            try {
                this.zzd = true;
                zzfoeVar.zzb(zzfnuVar);
                if (this.zzc) {
                    return zzhcy.zza(new zzfod(zzfnuVar, zzfofVar));
                }
                zzfnlVar.zzb(zzfofVar.zzb(), zzfnuVar);
                return zzhcy.zza(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ ListenableFuture zzd(zzfoe zzfoeVar, Exception exc) {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }
}

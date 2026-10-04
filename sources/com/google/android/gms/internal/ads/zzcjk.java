package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcjk extends com.google.android.gms.ads.internal.util.zzb {
    final zzcif zza;
    final zzcjs zzb;
    private final String zzc;
    private final String[] zzd;

    public zzcjk(zzcif zzcifVar, zzcjs zzcjsVar, String str, String[] strArr) {
        this.zza = zzcifVar;
        this.zzb = zzcjsVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzt.zzB().zzc(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzf(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcji(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final ListenableFuture zzb() {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcM)).booleanValue() && (this.zzb instanceof zzckb)) ? zzcgj.zzf.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzcjj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zze();
            }
        }) : super.zzb();
    }

    public final String zzd() {
        return this.zzc;
    }

    public final /* synthetic */ Boolean zze() {
        return Boolean.valueOf(this.zzb.zzg(this.zzc, this.zzd, this));
    }
}

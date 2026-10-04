package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbvj {
    private final zzbum zza;
    private ListenableFuture zzb;

    public zzbvj(zzbum zzbumVar) {
        this.zza = zzbumVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzcgo zzcgoVar = new zzcgo();
            this.zzb = zzcgoVar;
            this.zza.zzb(null).zze(new zzcgs() { // from class: com.google.android.gms.internal.ads.zzbvi
                @Override // com.google.android.gms.internal.ads.zzcgs
                public final /* synthetic */ void zza(Object obj) {
                    zzcgoVar.zzc((zzbun) obj);
                }
            }, new zzcgq() { // from class: com.google.android.gms.internal.ads.zzbvf
                @Override // com.google.android.gms.internal.ads.zzcgq
                public final /* synthetic */ void zza() {
                    zzcgoVar.zzd(new zzbup("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbvm zza(String str, zzbut zzbutVar, zzbus zzbusVar) {
        zzd();
        return new zzbvm(this.zzb, "google.afma.activeView.handleUpdate", zzbutVar, zzbusVar);
    }

    public final void zzb(final String str, final zzbqh zzbqhVar) {
        zzd();
        this.zzb = zzhcy.zzj(this.zzb, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzbvg
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                zzbun zzbunVar = (zzbun) obj;
                zzbunVar.zzm(str, zzbqhVar);
                return zzhcy.zza(zzbunVar);
            }
        }, zzcgj.zzh);
    }

    public final void zzc(final String str, final zzbqh zzbqhVar) {
        this.zzb = zzhcy.zzk(this.zzb, new zzgub() { // from class: com.google.android.gms.internal.ads.zzbvh
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                zzbun zzbunVar = (zzbun) obj;
                zzbunVar.zzn(str, zzbqhVar);
                return zzbunVar;
            }
        }, zzcgj.zzh);
    }
}

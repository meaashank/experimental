package com.google.android.gms.internal.ads;

import androidx.collection.C1520a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdsr implements zzdej {
    private final zzdqr zza;
    private final zzdqw zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdsr(zzdqr zzdqrVar, zzdqw zzdqwVar, Executor executor, Executor executor2) {
        this.zza = zzdqrVar;
        this.zzb = zzdqwVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(final zzclm zzclmVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsq
            @Override // java.lang.Runnable
            public final void run() {
                zzclmVar.zze("onSdkImpression", new C1520a());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void zzdr() {
        if (this.zzb.zzd()) {
            zzdqr zzdqrVar = this.zza;
            zzeml zzemlVarZzZ = zzdqrVar.zzZ();
            if (zzemlVarZzZ == null && zzdqrVar.zzX() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgx)).booleanValue()) {
                ListenableFuture listenableFutureZzX = zzdqrVar.zzX();
                zzcgo zzcgoVarZzY = zzdqrVar.zzY();
                if (listenableFutureZzX == null || zzcgoVarZzY == null) {
                    return;
                }
                zzhcy.zzr(zzhcy.zzq(listenableFutureZzX, zzcgoVarZzY), new zzdsp(this), this.zzd);
                return;
            }
            if (zzemlVarZzZ != null) {
                zzclm zzclmVarZzW = zzdqrVar.zzW();
                zzclm zzclmVarZzT = zzdqrVar.zzT();
                if (zzclmVarZzW == null) {
                    zzclmVarZzW = zzclmVarZzT == null ? null : zzclmVarZzT;
                }
                if (zzclmVarZzW != null) {
                    zza(zzclmVarZzW);
                }
            }
        }
    }
}

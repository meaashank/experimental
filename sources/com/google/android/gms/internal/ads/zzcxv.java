package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcxv implements zzbfg {

    @Nullable
    private final zzclm zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    public zzcxv(@Nullable zzclm zzclmVar, Executor executor) {
        this.zza = zzclmVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final synchronized void zzdj(zzbff zzbffVar) {
        final zzclm zzclmVar = this.zza;
        if (zzclmVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzon)).booleanValue()) {
                if (zzbffVar.zzj) {
                    AtomicReference atomicReference = this.zzc;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxu
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzclmVar.onResume();
                            }
                        });
                    }
                } else {
                    AtomicReference atomicReference2 = this.zzc;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxt
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzclmVar.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}

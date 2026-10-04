package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzghf implements zzggg {
    private final zzgei zza;
    private final zzghb zzb;
    private final zzggv zzc;
    private final ExecutorService zzd;
    private final zzgrh zze;
    private final AtomicReference zzf = new AtomicReference();

    public zzghf(zzgei zzgeiVar, zzghb zzghbVar, zzggv zzggvVar, ExecutorService executorService, zzgrh zzgrhVar) {
        this.zza = zzgeiVar;
        this.zzb = zzghbVar;
        this.zzc = zzggvVar;
        this.zzd = executorService;
        this.zze = zzgrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggg
    public final ListenableFuture zza() {
        zzghb zzghbVar = this.zzb;
        zzgei zzgeiVar = this.zza;
        zzhcq zzhcqVar = (zzhcq) zzhcy.zzk(zzhcq.zzw(zzghbVar.zzb(zzgeiVar.zzK(), zzgeiVar.zza())), new zzgub() { // from class: com.google.android.gms.internal.ads.zzghe
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                zzggu zzgguVar = (zzggu) obj;
                this.zza.zzf(zzgguVar);
                return zzgguVar;
            }
        }, zzhdp.zza());
        zzhcy.zzr(zzhcqVar, new zzghd(this), this.zzd);
        return zzhcqVar;
    }

    public final ListenableFuture zzb(Context context) {
        return ((zzggu) this.zzf.get()).zzc(context);
    }

    public final ListenableFuture zzc(Context context, String str, View view, Activity activity) {
        return ((zzggu) this.zzf.get()).zzd(context, null, view, activity);
    }

    public final ListenableFuture zzd(Context context, String str, View view, Activity activity) {
        return ((zzggu) this.zzf.get()).zze(context, str, view, null);
    }

    public final void zze(InputEvent inputEvent) {
        zzggu zzgguVar = (zzggu) this.zzf.get();
        if (zzgguVar == null) {
            this.zze.zzb(54);
        } else {
            zzgguVar.zzf(inputEvent);
        }
    }

    public final /* synthetic */ zzggu zzf(zzggu zzgguVar) {
        this.zzf.set(zzgguVar);
        return zzgguVar;
    }

    public final /* synthetic */ zzggv zzg() {
        return this.zzc;
    }

    public final int zzh() {
        zzggu zzgguVar = (zzggu) this.zzf.get();
        if (zzgguVar == null) {
            return 1;
        }
        return zzgguVar.zzg();
    }
}

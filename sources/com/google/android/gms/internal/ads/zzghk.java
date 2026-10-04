package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final class zzghk implements zzggu {
    private final ExecutorService zza;
    private final zzinq zzb;
    private final zzinq zzc;
    private final zzgqc zzd;
    private final zzinq zze;
    private final zziol zzf;
    private final zzgei zzg;

    public zzghk(ExecutorService executorService, zzinq zzinqVar, zzinq zzinqVar2, zzgqc zzgqcVar, zzinq zzinqVar3, zziol zziolVar, zzgei zzgeiVar) {
        this.zza = executorService;
        this.zzb = zzinqVar;
        this.zzc = zzinqVar2;
        this.zzd = zzgqcVar;
        this.zze = zzinqVar3;
        this.zzf = zziolVar;
        this.zzg = zzgeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final String zza() {
        return "1.904631200";
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ListenableFuture zzb() {
        return zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzghj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzh();
                return null;
            }
        }, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ListenableFuture zzc(Context context) {
        zzgia zzgiaVarZzh = ((zzgia) this.zzf.zzb()).zzh(context);
        zzgiaVarZzh.zzd(this.zzd.zzb());
        zzgiaVarZzh.zzc(zzaza.zzj());
        zzgiaVarZzh.zzb(zzgff.QUERY);
        return zzgiaVarZzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ListenableFuture zzd(Context context, String str, View view, Activity activity) {
        zzgia zzgiaVarZzh = ((zzgia) this.zzf.zzb()).zzh(context);
        zzgiaVarZzh.zzg(view);
        zzgiaVarZzh.zzf(activity);
        zzgiaVarZzh.zze(true != this.zzg.zzh() ? "" : null);
        zzgiaVarZzh.zzd(this.zzd.zzc(context, view));
        zzgiaVarZzh.zzc(zzaza.zzj());
        zzgiaVarZzh.zzb(zzgff.VIEW);
        return zzgiaVarZzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ListenableFuture zze(Context context, String str, View view, Activity activity) {
        zzinq zzinqVar = this.zze;
        Map mapZzd = this.zzd.zzd();
        ((zzghs) zzinqVar.zzb()).zzb(mapZzd);
        zzgia zzgiaVarZzh = ((zzgia) this.zzf.zzb()).zzh(context);
        zzgiaVarZzh.zzg(view);
        zzgiaVarZzh.zzf(null);
        zzgiaVarZzh.zze(str);
        zzgiaVarZzh.zzd(mapZzd);
        zzgiaVarZzh.zzb(zzgff.CLICK);
        zzgiaVarZzh.zzc(zzaza.zzj());
        return zzgiaVarZzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final void zzf(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            ((zzghs) this.zze.zzb()).zza((MotionEvent) inputEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final int zzg() {
        return 2;
    }

    public final /* synthetic */ Void zzh() {
        ((zzgid) this.zzc.zzb()).zza();
        ((zzgiw) this.zzb.zzb()).zza();
        return null;
    }
}

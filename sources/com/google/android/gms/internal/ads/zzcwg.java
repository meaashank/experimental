package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzcwg extends zzcwd {
    private final Context zzc;
    private final View zzd;

    @Nullable
    private final zzclm zze;
    private final zzfle zzf;
    private final zzcyj zzg;
    private final zzdrb zzh;
    private final zzdly zzi;
    private final zzinq zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzr zzl;

    public zzcwg(zzcyk zzcykVar, Context context, zzfle zzfleVar, View view, @Nullable zzclm zzclmVar, zzcyj zzcyjVar, zzdrb zzdrbVar, zzdly zzdlyVar, zzinq zzinqVar, Executor executor) {
        super(zzcykVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzclmVar;
        this.zzf = zzfleVar;
        this.zzg = zzcyjVar;
        this.zzh = zzdrbVar;
        this.zzi = zzdlyVar;
        this.zzj = zzinqVar;
        this.zzk = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final View zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final void zzb(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzclm zzclmVar;
        if (viewGroup == null || (zzclmVar = this.zze) == null) {
            return;
        }
        zzclmVar.zzaf(zzcnw.zza(zzrVar));
        viewGroup.setMinimumHeight(zzrVar.zzc);
        viewGroup.setMinimumWidth(zzrVar.zzf);
        this.zzl = zzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzea zzc() {
        try {
            return this.zzg.zza();
        } catch (zzfmd unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final zzfle zze() {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zzl;
        if (zzrVar != null) {
            return zzfmc.zzb(zzrVar);
        }
        zzfld zzfldVar = this.zzb;
        if (zzfldVar.zzac) {
            for (String str : zzfldVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfle(view.getWidth(), view.getHeight(), false);
        }
        return (zzfle) zzfldVar.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final zzfle zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final int zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjf)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjg)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final int zzh() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final void zzi() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzj() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcwf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk();
            }
        });
        super.zzj();
    }

    public final /* synthetic */ void zzk() {
        zzbod zzbodVarZzd = this.zzh.zzd();
        if (zzbodVarZzd == null) {
            return;
        }
        try {
            zzbodVarZzd.zze((com.google.android.gms.ads.internal.client.zzbu) this.zzj.zzb(), ObjectWrapper.wrap(this.zzc));
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException when notifyAdLoad is called", e10);
        }
    }
}

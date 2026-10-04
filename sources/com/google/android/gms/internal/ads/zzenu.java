package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzenu implements zzemw {
    private final Context zza;
    private final zzcxi zzb;
    private final Executor zzc;

    public zzenu(Context context, zzcxi zzcxiVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcxiVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd {
        com.google.android.gms.ads.internal.client.zzr zzrVar;
        zzflw zzflwVar = zzfloVar.zza.zza;
        com.google.android.gms.ads.internal.client.zzr zzrVar2 = zzflwVar.zzf;
        if (zzrVar2.zzn) {
            zzrVar = new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzb(zzrVar2.zze, zzrVar2.zzb));
        } else {
            zzrVar = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjf)).booleanValue() && zzfldVar.zzag) ? new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzc(zzrVar2.zze, zzrVar2.zzb)) : zzfmc.zza(this.zza, zzfldVar.zzu);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar3 = zzrVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjf)).booleanValue() && zzfldVar.zzag) {
            ((zzfmu) zzemtVar.zzb).zzb(this.zza, zzrVar3, zzflwVar.zzd, zzfldVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbp.zzm(zzfldVar.zzs), (zzbwa) zzemtVar.zzc);
        } else {
            ((zzfmu) zzemtVar.zzb).zzg(this.zza, zzrVar3, zzflwVar.zzd, zzfldVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbp.zzm(zzfldVar.zzs), (zzbwa) zzemtVar.zzc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ Object zzb(zzflo zzfloVar, final zzfld zzfldVar, zzemt zzemtVar) throws zzeqf, zzfmd {
        final View viewZza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjf)).booleanValue() && zzfldVar.zzag) {
            zzbwd zzbwdVarZzc = ((zzfmu) zzemtVar.zzb).zzc();
            if (zzbwdVarZzc == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfmd(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) ObjectWrapper.unwrap(zzbwdVarZzc.zze());
                boolean zZzf = zzbwdVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzfmd(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzhcy.zzj(zzhcy.zza(null), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzens
                            @Override // com.google.android.gms.internal.ads.zzhcg
                            public final /* synthetic */ ListenableFuture zza(Object obj) {
                                return this.zza.zzc(viewZza, zzfldVar, obj);
                            }
                        }, zzcgj.zzf).get();
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new zzfmd(e10);
                    }
                }
            } catch (RemoteException e11) {
                throw new zzfmd(e11);
            }
        } else {
            viewZza = ((zzfmu) zzemtVar.zzb).zza();
        }
        zzcxi zzcxiVar = this.zzb;
        zzczb zzczbVar = new zzczb(zzfloVar, zzfldVar, zzemtVar.zza);
        final zzfmu zzfmuVar = (zzfmu) zzemtVar.zzb;
        Objects.requireNonNull(zzfmuVar);
        zzcwe zzcweVarZzf = zzcxiVar.zzf(zzczbVar, new zzcwk(viewZza, null, new zzcyj() { // from class: com.google.android.gms.internal.ads.zzent
            @Override // com.google.android.gms.internal.ads.zzcyj
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza() {
                return zzfmuVar.zzt();
            }
        }, (zzfle) zzfldVar.zzu.get(0)));
        zzcweVarZzf.zzk().zza(viewZza);
        zzcweVarZzf.zza().zzq(new zzctr(zzfmuVar), this.zzc);
        ((zzeof) zzemtVar.zzc).zzb(zzcweVarZzf.zzf());
        return zzcweVarZzf.zzi();
    }

    public final /* synthetic */ ListenableFuture zzc(View view, zzfld zzfldVar, Object obj) {
        return zzhcy.zza(zzcxx.zza(this.zza, view, zzfldVar));
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzenq implements zzemq {
    private final zzcxi zza;
    private final Context zzb;
    private final zzdxg zzc;
    private final zzflw zzd;
    private final Executor zze;
    private final zzgub zzf;
    private final zzeae zzg;

    public zzenq(zzcxi zzcxiVar, Context context, Executor executor, zzdxg zzdxgVar, zzflw zzflwVar, zzgub zzgubVar, zzeae zzeaeVar) {
        this.zzb = context;
        this.zza = zzcxiVar;
        this.zze = executor;
        this.zzc = zzdxgVar;
        this.zzd = zzflwVar;
        this.zzf = zzgubVar;
        this.zzg = zzeaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean zza(zzflo zzfloVar, zzfld zzfldVar) {
        zzfli zzfliVar = zzfldVar.zzs;
        return (zzfliVar == null || zzfliVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ListenableFuture zzb(final zzflo zzfloVar, final zzfld zzfldVar) {
        return zzhcy.zzj(zzhcy.zza(null), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzenp
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfloVar, zzfldVar, obj);
            }
        }, this.zze);
    }

    public final /* synthetic */ ListenableFuture zzc(zzflo zzfloVar, zzfld zzfldVar, Object obj) throws zzcmb {
        zzbix zzbixVar = zzbjg.zzcV;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
            E0.a(this.zzg, zzdzs.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzr zzrVarZza = zzfmc.zza(context, zzfldVar.zzu);
        final zzclm zzclmVarZza = this.zzc.zza(zzrVarZza, zzfldVar, zzfloVar.zzb.zzb);
        zzclmVarZza.zzaw(zzfldVar.zzW);
        View viewZza = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjf)).booleanValue() && zzfldVar.zzag) ? zzcxx.zza(context, zzclmVarZza.zzE(), zzfldVar) : new zzdxj(context, zzclmVarZza.zzE(), (com.google.android.gms.ads.internal.util.zzat) this.zzf.apply(zzfldVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
            E0.a(this.zzg, zzdzs.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcxi zzcxiVar = this.zza;
        final zzcwe zzcweVarZzf = zzcxiVar.zzf(new zzczb(zzfloVar, zzfldVar, null), new zzcwk(viewZza, zzclmVarZza, new zzcyj() { // from class: com.google.android.gms.internal.ads.zzenl
            @Override // com.google.android.gms.internal.ads.zzcyj
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza() {
                return zzclmVarZza.zzh();
            }
        }, zzfmc.zzb(zzrVarZza)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
            E0.a(this.zzg, zzdzs.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzdxf zzdxfVarZzj = zzcweVarZzf.zzj();
        zzeae zzeaeVar = this.zzg;
        zzdxfVarZzj.zzi(zzclmVarZza, false, null, zzeaeVar);
        zzdeh zzdehVarZzd = zzcweVarZzf.zzd();
        zzdej zzdejVar = new zzdej() { // from class: com.google.android.gms.internal.ads.zzenm
            @Override // com.google.android.gms.internal.ads.zzdej
            public final /* synthetic */ void zzdr() {
                zzclm zzclmVar = zzclmVarZza;
                if (zzclmVar.zzP() != null) {
                    zzclmVar.zzP().zzq();
                }
            }
        };
        zzhdi zzhdiVar = zzcgj.zzh;
        zzdehVarZzd.zzq(zzdejVar, zzhdiVar);
        zzfli zzfliVar = zzfldVar.zzs;
        String strZza = zzfliVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgt)).booleanValue() && zzcweVarZzf.zzm().zza(true)) {
            strZza = zzcnd.zza(strZza, zzcnd.zzb(zzfldVar));
        }
        zzcweVarZzf.zzj();
        ListenableFuture listenableFutureZzj = zzdxf.zzj(zzclmVarZza, zzfliVar.zzb, strZza, zzeaeVar, zzcxiVar.zze());
        if (zzfldVar.zzM) {
            listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzclmVarZza.zzav();
                }
            }, this.zze);
        }
        listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(zzclmVarZza);
            }
        }, this.zze);
        return zzhcy.zzk(listenableFutureZzj, new zzgub() { // from class: com.google.android.gms.internal.ads.zzeno
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj2) {
                return zzcweVarZzf.zzi();
            }
        }, zzhdiVar);
    }

    public final /* synthetic */ void zzd(zzclm zzclmVar) {
        zzclmVar.zzJ();
        zzflw zzflwVar = this.zzd;
        zzcms zzcmsVarZzh = zzclmVar.zzh();
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzflwVar.zza;
        if (zzfwVar != null && zzcmsVarZzh != null) {
            zzcmsVarZzh.zzb(zzfwVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbZ)).booleanValue() || zzclmVar.isAttachedToWindow()) {
            return;
        }
        zzclmVar.onPause();
        zzclmVar.zzaG(true);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzenz implements zzemw {
    private final Context zza;
    private final zzcxi zzb;
    private View zzc;
    private zzbwd zzd;

    public zzenz(Context context, zzcxi zzcxiVar) {
        this.zza = context;
        this.zzb = zzcxiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd {
        try {
            zzbxt zzbxtVar = (zzbxt) zzemtVar.zzb;
            zzbxtVar.zzo(zzfldVar.zzZ);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjf)).booleanValue() && zzfldVar.zzag) {
                String str = zzfldVar.zzU;
                String string = zzfldVar.zzv.toString();
                zzflw zzflwVar = zzfloVar.zza.zza;
                zzbxtVar.zzq(str, string, zzflwVar.zzd, ObjectWrapper.wrap(this.zza), new zzeny(this, zzemtVar, null), (zzbwa) zzemtVar.zzc, zzflwVar.zzf);
                return;
            }
            String str2 = zzfldVar.zzU;
            String string2 = zzfldVar.zzv.toString();
            zzflw zzflwVar2 = zzfloVar.zza.zza;
            zzbxtVar.zzi(str2, string2, zzflwVar2.zzd, ObjectWrapper.wrap(this.zza), new zzeny(this, zzemtVar, null), (zzbwa) zzemtVar.zzc, zzflwVar2.zzf);
        } catch (RemoteException e10) {
            throw new zzfmd(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ Object zzb(zzflo zzfloVar, final zzfld zzfldVar, final zzemt zzemtVar) throws zzeqf, zzfmd {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjf)).booleanValue() && zzfldVar.zzag) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zZzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfmd(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) zzhcy.zzj(zzhcy.zza(null), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzenw
                            @Override // com.google.android.gms.internal.ads.zzhcg
                            public final /* synthetic */ ListenableFuture zza(Object obj) {
                                return this.zza.zzc(view, zzfldVar, obj);
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
            view = this.zzc;
        }
        zzcwe zzcweVarZzf = this.zzb.zzf(new zzczb(zzfloVar, zzfldVar, zzemtVar.zza), new zzcwk(view, null, new zzcyj() { // from class: com.google.android.gms.internal.ads.zzenx
            @Override // com.google.android.gms.internal.ads.zzcyj
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza() throws zzfmd {
                try {
                    return ((zzbxt) zzemtVar.zzb).zzh();
                } catch (RemoteException e12) {
                    throw new zzfmd(e12);
                }
            }
        }, (zzfle) zzfldVar.zzu.get(0)));
        zzcweVarZzf.zzk().zza(view);
        ((zzeof) zzemtVar.zzc).zzb(zzcweVarZzf.zzg());
        return zzcweVarZzf.zzi();
    }

    public final /* synthetic */ ListenableFuture zzc(View view, zzfld zzfldVar, Object obj) {
        return zzhcy.zza(zzcxx.zza(this.zza, view, zzfldVar));
    }

    public final /* synthetic */ void zzd(View view) {
        this.zzc = view;
    }

    public final /* synthetic */ void zze(zzbwd zzbwdVar) {
        this.zzd = zzbwdVar;
    }
}

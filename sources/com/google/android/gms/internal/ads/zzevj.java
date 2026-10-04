package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzevj implements zzfdi {
    private final zzhdi zza;
    private final zzflw zzb;

    public zzevj(zzhdi zzhdiVar, zzflw zzflwVar, zzfmm zzfmmVar) {
        this.zza = zzhdiVar;
        this.zzb = zzflwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzevi
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 5;
    }

    public final /* synthetic */ zzevk zzc() {
        List listAsList;
        String strZza = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzie)).booleanValue()) {
            String strZzc = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(this.zzb.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzig)).booleanValue()) {
                listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzih)).split(","));
            } else {
                listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzif)).split(","));
            }
            if (listAsList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(strZzc))) {
                strZza = zzfmm.zza();
            }
        }
        return new zzevk(strZza);
    }
}

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzese implements zzemq {

    @Nullable
    private final zzbkb zza;
    private final zzhdi zzb;
    private final zzfqi zzc;
    private final zzesn zzd;

    public zzese(zzfqi zzfqiVar, zzhdi zzhdiVar, @Nullable zzbkb zzbkbVar, zzesn zzesnVar) {
        this.zzc = zzfqiVar;
        this.zzb = zzhdiVar;
        this.zza = zzbkbVar;
        this.zzd = zzesnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean zza(zzflo zzfloVar, zzfld zzfldVar) {
        zzfli zzfliVar;
        return (this.zza == null || (zzfliVar = zzfldVar.zzs) == null || zzfliVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ListenableFuture zzb(zzflo zzfloVar, zzfld zzfldVar) {
        zzcgo zzcgoVar = new zzcgo();
        zzesj zzesjVar = new zzesj();
        zzesjVar.zzd(new zzesc(this, zzcgoVar, zzfloVar, zzfldVar, zzesjVar));
        zzfli zzfliVar = zzfldVar.zzs;
        final zzbjw zzbjwVar = new zzbjw(zzesjVar, zzfliVar.zzb, zzfliVar.zza);
        zzfqc zzfqcVar = zzfqc.CUSTOM_RENDER_SYN;
        zzfqi zzfqiVar = this.zzc;
        Objects.requireNonNull(zzfqiVar);
        return zzfpt.zzd(new zzfpo() { // from class: com.google.android.gms.internal.ads.zzesd
            @Override // com.google.android.gms.internal.ads.zzfpo
            public final /* synthetic */ void zza() throws RemoteException {
                this.zza.zzc(zzbjwVar);
            }
        }, this.zzb, zzfqcVar, zzfqiVar).zzj(zzfqc.CUSTOM_RENDER_ACK).zze(zzcgoVar).zzi();
    }

    public final /* synthetic */ void zzc(zzbjw zzbjwVar) throws RemoteException {
        this.zza.zze(zzbjwVar);
    }

    public final /* synthetic */ zzesn zzd() {
        return this.zzd;
    }
}

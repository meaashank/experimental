package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzerz implements zzemq {
    private final Context zza;
    private final zzcxi zzb;

    @Nullable
    private final zzbkb zzc;
    private final zzhdi zzd;
    private final zzfqi zze;

    public zzerz(Context context, zzcxi zzcxiVar, zzfqi zzfqiVar, zzhdi zzhdiVar, @Nullable zzbkb zzbkbVar) {
        this.zza = context;
        this.zzb = zzcxiVar;
        this.zze = zzfqiVar;
        this.zzd = zzhdiVar;
        this.zzc = zzbkbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean zza(zzflo zzfloVar, zzfld zzfldVar) {
        zzfli zzfliVar;
        return (this.zzc == null || (zzfliVar = zzfldVar.zzs) == null || zzfliVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ListenableFuture zzb(zzflo zzfloVar, zzfld zzfldVar) {
        zzerv zzervVar = new zzerv(this, new View(this.zza), null, zzerx.zza, (zzfle) zzfldVar.zzu.get(0));
        zzcwe zzcweVarZzf = this.zzb.zzf(new zzczb(zzfloVar, zzfldVar, null), zzervVar);
        zzery zzeryVarZzl = zzcweVarZzf.zzl();
        zzfli zzfliVar = zzfldVar.zzs;
        final zzbjw zzbjwVar = new zzbjw(zzeryVarZzl, zzfliVar.zzb, zzfliVar.zza);
        zzfqc zzfqcVar = zzfqc.CUSTOM_RENDER_SYN;
        zzfqi zzfqiVar = this.zze;
        Objects.requireNonNull(zzfqiVar);
        return zzfpt.zzd(new zzfpo() { // from class: com.google.android.gms.internal.ads.zzerw
            @Override // com.google.android.gms.internal.ads.zzfpo
            public final /* synthetic */ void zza() throws RemoteException {
                this.zza.zzc(zzbjwVar);
            }
        }, this.zzd, zzfqcVar, zzfqiVar).zzj(zzfqc.CUSTOM_RENDER_ACK).zze(zzhcy.zza(zzcweVarZzf.zzi())).zzi();
    }

    public final /* synthetic */ void zzc(zzbjw zzbjwVar) throws RemoteException {
        this.zzc.zze(zzbjwVar);
    }
}

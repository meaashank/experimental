package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeil {
    private final Context zza;
    private final zzhdi zzb;
    private final zzhdi zzc;
    private final zzinq zzd;
    private final VersionInfoParcel zze;
    private final zzeih zzf;
    private final zzeaj zzg;

    public zzeil(Context context, zzhdi zzhdiVar, zzhdi zzhdiVar2, zzinq zzinqVar, VersionInfoParcel versionInfoParcel, zzeih zzeihVar, zzeaj zzeajVar) {
        this.zza = context;
        this.zzb = zzhdiVar;
        this.zzc = zzhdiVar2;
        this.zzd = zzinqVar;
        this.zze = versionInfoParcel;
        this.zzf = zzeihVar;
        this.zzg = zzeajVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzc() {
        try {
            ((zzejg) this.zzd.zzb()).zzi(this.zze.afmaVersion);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpT)).booleanValue()) {
                zzeai zzeaiVarZza = this.zzg.zza();
                zzeaiVarZza.zzc("action", "ptard");
                zzeaiVarZza.zzc("ptard", com.prism.gaia.helper.utils.l.f165154a);
                zzeaiVarZza.zzd();
            }
        } catch (RemoteException | NullPointerException e10) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpU)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "Preconnect Local");
            }
        }
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(this.zza.getPackageName())) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeij
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            });
            return;
        }
        zzeii zzeiiVar = new zzeii(this);
        zzein zzeinVarZzb = this.zzf.zzb();
        zzeinVarZzb.zzb(zzeiiVar);
        final zzegv zzegvVarZza = zzeinVarZzb.zza().zza();
        zzhdi zzhdiVar = this.zzb;
        Objects.requireNonNull(zzegvVarZza);
        zzhdiVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeik
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzegvVarZza.zza();
            }
        });
    }

    public final /* synthetic */ zzeaj zzd() {
        return this.zzg;
    }
}

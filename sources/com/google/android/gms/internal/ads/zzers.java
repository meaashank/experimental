package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzers implements zzemq {
    private final zzems zza;
    private final zzemw zzb;
    private final zzfqi zzc;
    private final zzhdi zzd;

    public zzers(zzfqi zzfqiVar, zzhdi zzhdiVar, zzems zzemsVar, zzemw zzemwVar) {
        this.zzc = zzfqiVar;
        this.zzd = zzhdiVar;
        this.zzb = zzemwVar;
        this.zza = zzemsVar;
    }

    @e.f0
    public static final String zze(String str, int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i10).length());
        sb2.append("Error from: ");
        sb2.append(str);
        sb2.append(", code: ");
        sb2.append(i10);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean zza(zzflo zzfloVar, zzfld zzfldVar) {
        return !zzfldVar.zzt.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ListenableFuture zzb(final zzflo zzfloVar, final zzfld zzfldVar) {
        final zzemt zzemtVarZza;
        Iterator it = zzfldVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzemtVarZza = null;
                break;
            }
            try {
                zzemtVarZza = this.zza.zza((String) it.next(), zzfldVar.zzv);
                break;
            } catch (zzfmd unused) {
            }
        }
        if (zzemtVarZza == null) {
            return zzhcy.zzc(new zzepj("Unable to instantiate mediation adapter class."));
        }
        zzcgo zzcgoVar = new zzcgo();
        zzemtVarZza.zzc.zza(new zzerp(this, zzemtVarZza, zzcgoVar));
        if (zzfldVar.zzM) {
            Bundle bundle = zzfloVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfqi zzfqiVar = this.zzc;
        zzfqc zzfqcVar = zzfqc.ADAPTER_LOAD_AD_SYN;
        Objects.requireNonNull(zzfqiVar);
        return zzfpt.zzd(new zzfpo() { // from class: com.google.android.gms.internal.ads.zzerr
            @Override // com.google.android.gms.internal.ads.zzfpo
            public final /* synthetic */ void zza() throws zzfmd {
                this.zza.zzc(zzfloVar, zzfldVar, zzemtVarZza);
            }
        }, this.zzd, zzfqcVar, zzfqiVar).zzj(zzfqc.ADAPTER_LOAD_AD_ACK).zze(zzcgoVar).zzj(zzfqc.ADAPTER_WRAP_ADAPTER).zzb(new zzfpi() { // from class: com.google.android.gms.internal.ads.zzerq
            @Override // com.google.android.gms.internal.ads.zzfpi
            public final /* synthetic */ Object zza(Object obj) {
                return this.zza.zzd(zzfloVar, zzfldVar, zzemtVarZza, (Void) obj);
            }
        }).zzi();
    }

    public final /* synthetic */ void zzc(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd {
        this.zzb.zza(zzfloVar, zzfldVar, zzemtVar);
    }

    public final /* synthetic */ Object zzd(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar, Void r42) {
        return this.zzb.zzb(zzfloVar, zzfldVar, zzemtVar);
    }
}

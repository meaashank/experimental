package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfte {
    private final Context zza;
    private final Executor zzb;
    private final zzhdj zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzfsw zze;
    private final zzfrj zzf;
    private final zzcny zzg;

    public zzfte(Context context, Executor executor, zzhdj zzhdjVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzfsw zzfswVar, zzfrj zzfrjVar, zzcny zzcnyVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzhdjVar;
        this.zzd = zzuVar;
        this.zze = zzfswVar;
        this.zzf = zzfrjVar;
        this.zzg = zzcnyVar;
    }

    public final void zza(List list, @Nullable com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), zzvVar, null, null);
        }
    }

    public final void zzb(final String str, @Nullable com.google.android.gms.ads.internal.util.client.zzv zzvVar, @Nullable zzfrg zzfrgVar, @Nullable zzdge zzdgeVar) {
        ListenableFuture listenableFutureZzc;
        zzfqw zzfqwVarA = null;
        if (zzfrj.zza() && ((Boolean) zzbla.zzd.zze()).booleanValue()) {
            zzfqwVarA = R0.a(this.zza, 14);
            zzfqwVarA.zza();
        }
        if (zzvVar != null) {
            listenableFutureZzc = new zzfsv(zzvVar.zza(), this.zzd, this.zzc, this.zze, this.zzg).zza(str);
        } else {
            listenableFutureZzc = this.zzc.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzftd
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(str);
                }
            });
        }
        zzhcy.zzr(listenableFutureZzc, new zzftc(this, zzfqwVarA, zzfrgVar, zzdgeVar), this.zzb);
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zzc(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzko)).booleanValue() || (!com.google.android.gms.ads.internal.zzt.zzc().zzh(str) && !com.google.android.gms.ads.internal.zzt.zzc().zzi(str))) {
            return this.zzd.zzc(str, null);
        }
        String strZzb = this.zzg.zzb();
        HashMap map = new HashMap();
        if (strZzb != null) {
            map.put((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkp), strZzb);
        }
        return this.zzd.zzc(str, map);
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzu zzd() {
        return this.zzd;
    }

    public final /* synthetic */ zzfrj zze() {
        return this.zzf;
    }
}

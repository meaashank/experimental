package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzghy {
    private final zzhdi zza;
    private final zzgid zzb;
    private final Set zzc;
    private final String zzd;
    private final zzaya zze;
    private final zzgiw zzf;
    private final zzgrh zzg;

    public zzghy(zzhdi zzhdiVar, zzgid zzgidVar, zzgiw zzgiwVar, zzgff zzgffVar, String str, zzaya zzayaVar, zziol zziolVar, zziol zziolVar2, zziol zziolVar3, zzgrh zzgrhVar) {
        this.zza = zzhdiVar;
        this.zzb = zzgidVar;
        this.zzd = str;
        this.zzf = zzgiwVar;
        this.zze = zzayaVar;
        this.zzg = zzgrhVar;
        int iOrdinal = zzgffVar.ordinal();
        if (iOrdinal == 0) {
            this.zzc = ((zzioi) zziolVar).zzb();
        } else if (iOrdinal == 1) {
            this.zzc = ((zzioi) zziolVar2).zzb();
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException();
            }
            this.zzc = ((zzioi) zziolVar3).zzb();
        }
    }

    public final ListenableFuture zza() {
        if (!this.zzb.zzc()) {
            return zzhcy.zza(Integer.toString(7));
        }
        if (!this.zzf.zzb()) {
            return zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzghx
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb();
                }
            }, this.zza);
        }
        Set set = this.zzc;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.zza.zzc((zzgjz) it.next()));
        }
        return zzhcy.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzghv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        }, zzhdp.zza());
    }

    public final /* synthetic */ String zzb() {
        return this.zzb.zzg(16384, this.zzd);
    }

    public final /* synthetic */ String zzc() {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzghw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzd();
            }
        };
        zzgrf zzgrfVarZza = this.zzg.zza(101);
        try {
            zzgrfVarZza.zza();
            Object objCall = callable.call();
            zzgrfVarZza.zzc();
            return (String) objCall;
        } finally {
        }
    }

    public final /* synthetic */ String zzd() {
        zzaza zzazaVar = (zzaza) this.zze.zzbu();
        String str = this.zzd;
        zzgid zzgidVar = this.zzb;
        try {
            return Base64.encodeToString(((zzazt) zzgidVar.zzf(zzazaVar.zzaN(), str).zzbu()).zzaN(), 11);
        } catch (IllegalArgumentException unused) {
            return zzgidVar.zzg(4096, str);
        }
    }
}

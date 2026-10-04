package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhnw {
    private static final zzhnw zza = (zzhnw) zzhpc.zza(zzhnv.zza);
    private final AtomicReference zzb = new AtomicReference(new zzhpa(new zzhox(), null));

    public static zzhnw zza() {
        return zza;
    }

    public final synchronized void zzb(zzhna zzhnaVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhox zzhoxVar = new zzhox((zzhpa) atomicReference.get());
        zzhoxVar.zza(zzhnaVar);
        atomicReference.set(new zzhpa(zzhoxVar, null));
    }

    public final synchronized void zzc(zzhmx zzhmxVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhox zzhoxVar = new zzhox((zzhpa) atomicReference.get());
        zzhoxVar.zzb(zzhmxVar);
        atomicReference.set(new zzhpa(zzhoxVar, null));
    }

    public final synchronized void zzd(zzhod zzhodVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhox zzhoxVar = new zzhox((zzhpa) atomicReference.get());
        zzhoxVar.zzc(zzhodVar);
        atomicReference.set(new zzhpa(zzhoxVar, null));
    }

    public final synchronized void zze(zzhoa zzhoaVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhox zzhoxVar = new zzhox((zzhpa) atomicReference.get());
        zzhoxVar.zzd(zzhoaVar);
        atomicReference.set(new zzhpa(zzhoxVar, null));
    }

    public final boolean zzf(zzhow zzhowVar) {
        return ((zzhpa) this.zzb.get()).zza(zzhowVar);
    }

    public final zzhes zzg(zzhow zzhowVar, @Nullable zzhfr zzhfrVar) throws GeneralSecurityException {
        return ((zzhpa) this.zzb.get()).zzb(zzhowVar, zzhfrVar);
    }

    public final zzhow zzh(zzhes zzhesVar, Class cls, @Nullable zzhfr zzhfrVar) throws GeneralSecurityException {
        return ((zzhpa) this.zzb.get()).zzc(zzhesVar, cls, zzhfrVar);
    }

    public final boolean zzi(zzhow zzhowVar) {
        return ((zzhpa) this.zzb.get()).zzd(zzhowVar);
    }

    public final zzhfj zzj(zzhow zzhowVar) throws GeneralSecurityException {
        return ((zzhpa) this.zzb.get()).zze(zzhowVar);
    }

    public final zzhow zzk(zzhfj zzhfjVar, Class cls) throws GeneralSecurityException {
        return ((zzhpa) this.zzb.get()).zzf(zzhfjVar, cls);
    }
}

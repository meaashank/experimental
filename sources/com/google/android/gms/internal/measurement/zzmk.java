package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzmk<T, B> {
    private static volatile int zza = 100;

    public abstract int zza(T t10);

    public abstract B zza();

    public abstract T zza(T t10, T t11);

    public abstract void zza(B b10, int i10, int i11);

    public abstract void zza(B b10, int i10, long j10);

    public abstract void zza(B b10, int i10, zzik zzikVar);

    public abstract void zza(B b10, int i10, T t10);

    public abstract void zza(T t10, zznb zznbVar) throws IOException;

    public abstract boolean zza(zzlr zzlrVar);

    public final boolean zza(B b10, zzlr zzlrVar, int i10) throws IOException {
        int iZzd = zzlrVar.zzd();
        int i11 = iZzd >>> 3;
        int i12 = iZzd & 7;
        if (i12 == 0) {
            zzb(b10, i11, zzlrVar.zzl());
            return true;
        }
        if (i12 == 1) {
            zza(b10, i11, zzlrVar.zzk());
            return true;
        }
        if (i12 == 2) {
            zza((Object) b10, i11, zzlrVar.zzp());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw zzkb.zza();
            }
            zza((Object) b10, i11, zzlrVar.zzf());
            return true;
        }
        B bZza = zza();
        int i13 = 4 | (i11 << 3);
        int i14 = i10 + 1;
        if (i14 >= zza) {
            throw zzkb.zzh();
        }
        while (zzlrVar.zzc() != Integer.MAX_VALUE && zza(bZza, zzlrVar, i14)) {
        }
        if (i13 != zzlrVar.zzd()) {
            throw zzkb.zzb();
        }
        zza(b10, i11, zze(bZza));
        return true;
    }

    public abstract int zzb(T t10);

    public abstract void zzb(B b10, int i10, long j10);

    public abstract void zzb(T t10, zznb zznbVar) throws IOException;

    public abstract void zzb(Object obj, B b10);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t10);

    public abstract T zzd(Object obj);

    public abstract T zze(B b10);

    public abstract void zzf(Object obj);
}

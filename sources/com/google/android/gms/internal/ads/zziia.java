package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
abstract class zziia {
    private static volatile int zza = 100;

    public abstract void zza(Object obj, int i10, long j10);

    public abstract void zzb(Object obj, int i10, int i11);

    public abstract void zzc(Object obj, int i10, long j10);

    public abstract void zzd(Object obj, int i10, zziei zzieiVar);

    public abstract void zze(Object obj, int i10, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public final boolean zzh(Object obj, zzihj zzihjVar, int i10) throws IOException {
        int iZzc = zzihjVar.zzc();
        int i11 = iZzc >>> 3;
        int i12 = iZzc & 7;
        if (i12 == 0) {
            zza(obj, i11, zzihjVar.zzh());
            return true;
        }
        if (i12 == 1) {
            zzc(obj, i11, zzihjVar.zzj());
            return true;
        }
        if (i12 == 2) {
            zzd(obj, i11, zzihjVar.zzq());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                if (i10 != 0) {
                    return false;
                }
                throw new zzige("Protocol message end-group tag did not match expected tag.");
            }
            if (i12 != 5) {
                throw new zzigd("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i11, zzihjVar.zzk());
            return true;
        }
        Object objZzf = zzf();
        int i13 = i11 << 3;
        int i14 = i10 + 1;
        if (i14 >= zza) {
            throw new zzige("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzihjVar.zzb() != Integer.MAX_VALUE && zzh(objZzf, zzihjVar, i14)) {
        }
        if ((i13 | 4) != zzihjVar.zzc()) {
            throw new zzige("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i11, zzg(objZzf));
        return true;
    }
}

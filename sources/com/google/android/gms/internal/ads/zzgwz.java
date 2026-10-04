package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgwz {
    private static final zzgwz zza = new zzgwx();
    private static final zzgwz zzb = new zzgwy(-1);
    private static final zzgwz zzc = new zzgwy(1);

    public /* synthetic */ zzgwz(byte[] bArr) {
    }

    public static zzgwz zzg() {
        return zza;
    }

    public abstract zzgwz zza(Object obj, Object obj2, Comparator comparator);

    public abstract zzgwz zzb(int i10, int i11);

    public abstract zzgwz zzc(boolean z10, boolean z11);

    public abstract zzgwz zzd(boolean z10, boolean z11);

    public abstract int zze();
}

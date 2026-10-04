package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhod {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhod(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhod zzd(zzhoc zzhocVar, Class cls, Class cls2) {
        return new zzhob(cls, cls2, zzhocVar);
    }

    public abstract zzhow zza(zzhfj zzhfjVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}

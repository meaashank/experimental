package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhna {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhna(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhna zzd(zzhmz zzhmzVar, Class cls, Class cls2) {
        return new zzhmy(cls, cls2, zzhmzVar);
    }

    public abstract zzhow zza(zzhes zzhesVar, @Nullable zzhfr zzhfrVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhmx {
    private final zzich zza;
    private final Class zzb;

    public /* synthetic */ zzhmx(zzich zzichVar, Class cls, byte[] bArr) {
        this.zza = zzichVar;
        this.zzb = cls;
    }

    public static zzhmx zzd(zzhmw zzhmwVar, zzich zzichVar, Class cls) {
        return new zzhmv(zzichVar, cls, zzhmwVar);
    }

    public abstract zzhes zza(zzhow zzhowVar, @Nullable zzhfr zzhfrVar) throws GeneralSecurityException;

    public final zzich zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}

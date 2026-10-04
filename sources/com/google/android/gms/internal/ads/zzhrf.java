package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhrf extends zzhri {
    private final zzhrg zza;
    private final zzicj zzb;

    private zzhrf(zzhrg zzhrgVar, zzicj zzicjVar) {
        this.zza = zzhrgVar;
        this.zzb = zzicjVar;
    }

    public static zzhrf zzc(zzhrg zzhrgVar, zzicj zzicjVar) throws GeneralSecurityException {
        if (zzhrgVar.zzc() == zzicjVar.zzd()) {
            return new zzhrf(zzhrgVar, zzicjVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.ads.zzhri, com.google.android.gms.internal.ads.zzhes
    public final /* synthetic */ zzhfj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    @Nullable
    public final Integer zzb() {
        return null;
    }

    public final zzicj zzd() {
        return this.zzb;
    }
}

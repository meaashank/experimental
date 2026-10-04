package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhne extends zzhes {
    private final zzhos zza;

    public zzhne(zzhos zzhosVar, @Nullable zzhfr zzhfrVar) throws GeneralSecurityException {
        zze(zzhosVar, zzhfrVar);
        this.zza = zzhosVar;
    }

    private static void zze(zzhos zzhosVar, @Nullable zzhfr zzhfrVar) throws GeneralSecurityException {
        if (zzhosVar.zzc().equals(zzhfl.zzb)) {
            return;
        }
        zzhfl zzhflVarZzc = zzhosVar.zzc();
        zzhfl zzhflVar = zzhfl.zzc;
        zzhflVarZzc.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    public final zzhfj zza() {
        zzhos zzhosVar = this.zza;
        return new zzhnd(zzhosVar.zzg(), zzhosVar.zzd(), null);
    }

    @Override // com.google.android.gms.internal.ads.zzhes
    @Nullable
    public final Integer zzb() {
        return this.zza.zze();
    }

    public final zzhos zzc(@Nullable zzhfr zzhfrVar) throws GeneralSecurityException {
        zzhos zzhosVar = this.zza;
        zze(zzhosVar, zzhfrVar);
        return zzhosVar;
    }

    public final zzich zzd() throws GeneralSecurityException {
        zzhos zzhosVar = this.zza;
        if (zzhosVar.zzd().equals(zzhfm.zzd)) {
            return zzich.zza(new byte[0]);
        }
        if (zzhosVar.zzd().equals(zzhfm.zzb)) {
            return zzhnx.zzb(zzhosVar.zze().intValue());
        }
        if (zzhosVar.zzd().equals(zzhfm.zzc) || zzhosVar.zzd().equals(zzhfm.zze)) {
            return zzhnx.zza(zzhosVar.zze().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}

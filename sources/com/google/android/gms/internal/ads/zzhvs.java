package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhvs {
    private zzhvv zza = null;
    private zzhvt zzb = null;
    private zzhvu zzc = null;
    private zzhvw zzd = zzhvw.zzd;

    private zzhvs() {
    }

    public final zzhvs zza(zzhvv zzhvvVar) {
        this.zza = zzhvvVar;
        return this;
    }

    public final zzhvs zzb(zzhvt zzhvtVar) {
        this.zzb = zzhvtVar;
        return this;
    }

    public final zzhvs zzc(zzhvu zzhvuVar) {
        this.zzc = zzhvuVar;
        return this;
    }

    public final zzhvs zzd(zzhvw zzhvwVar) {
        this.zzd = zzhvwVar;
        return this;
    }

    public final zzhvx zze() throws GeneralSecurityException {
        zzhvv zzhvvVar = this.zza;
        if (zzhvvVar == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        zzhvt zzhvtVar = this.zzb;
        if (zzhvtVar == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        zzhvu zzhvuVar = this.zzc;
        if (zzhvuVar == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        zzhvw zzhvwVar = this.zzd;
        if (zzhvwVar == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (zzhvtVar == zzhvt.zza && zzhvuVar != zzhvu.zza) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        if (zzhvtVar == zzhvt.zzb && zzhvuVar != zzhvu.zzb && zzhvuVar != zzhvu.zzc) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (zzhvtVar != zzhvt.zzc || zzhvuVar == zzhvu.zzc) {
            return new zzhvx(zzhvvVar, zzhvtVar, zzhvuVar, zzhvwVar, null);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }

    public /* synthetic */ zzhvs(byte[] bArr) {
    }
}

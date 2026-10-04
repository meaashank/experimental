package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhos implements zzhow {
    private final String zza;
    private final zzich zzb;
    private final zziei zzc;
    private final zzhfl zzd;
    private final zzhfm zze;

    @Nullable
    private final Integer zzf;

    private zzhos(String str, zzich zzichVar, zziei zzieiVar, zzhfl zzhflVar, zzhfm zzhfmVar, @Nullable Integer num) {
        this.zza = str;
        this.zzb = zzichVar;
        this.zzc = zzieiVar;
        this.zzd = zzhflVar;
        this.zze = zzhfmVar;
        this.zzf = num;
    }

    public static zzhos zza(String str, zziei zzieiVar, zzhfl zzhflVar, zzhfm zzhfmVar, @Nullable Integer num) throws GeneralSecurityException {
        if (zzhfmVar.equals(zzhfm.zzd)) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzhos(str, zzhpd.zzb(str), zzieiVar, zzhflVar, zzhfmVar, num);
    }

    public final zziei zzb() {
        return this.zzc;
    }

    public final zzhfl zzc() {
        return this.zzd;
    }

    public final zzhfm zzd() {
        return this.zze;
    }

    @Nullable
    public final Integer zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhow
    public final zzich zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zza;
    }
}

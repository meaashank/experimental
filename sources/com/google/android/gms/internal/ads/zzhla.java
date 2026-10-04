package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhla implements zzhek {
    private final zzhek zza;
    private final byte[] zzb;

    private zzhla(zzhek zzhekVar, byte[] bArr) {
        this.zza = zzhekVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzhek zzb(zzhne zzhneVar) throws GeneralSecurityException {
        zzhos zzhosVarZzc = zzhneVar.zzc(zzheq.zza());
        return new zzhla((zzhek) zzhmu.zza().zzc(zzhosVarZzc.zzg(), zzhek.class).zza(zzhosVarZzc.zzb()), zzhor.zza(zzhosVarZzc.zzd(), zzhneVar.zzb()).zzc());
    }

    public static zzhek zzc(zzhek zzhekVar, zzich zzichVar) {
        return new zzhla(zzhekVar, zzichVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzhpd.zze(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}

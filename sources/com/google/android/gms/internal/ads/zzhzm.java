package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhzm implements zzhfo {
    private final zzhfo zza;
    private final byte[] zzb;
    private final byte[] zzc;

    private zzhzm(zzhfo zzhfoVar, byte[] bArr, byte[] bArr2) {
        this.zza = zzhfoVar;
        this.zzb = bArr;
        this.zzc = bArr2;
    }

    public static zzhfo zzb(zzhne zzhneVar) throws GeneralSecurityException {
        zzhos zzhosVarZzc = zzhneVar.zzc(zzheq.zza());
        return new zzhzm((zzhfo) zzhmu.zza().zzc(zzhosVarZzc.zzg(), zzhfo.class).zza(zzhosVarZzc.zzb()), zzc(zzhosVarZzc), zzd(zzhosVarZzc));
    }

    public static byte[] zzc(zzhos zzhosVar) throws GeneralSecurityException {
        return zzhor.zza(zzhosVar.zzd(), zzhosVar.zze()).zzc();
    }

    public static byte[] zzd(zzhos zzhosVar) {
        return zzhosVar.zzd().equals(zzhfm.zzc) ? new byte[]{0} : new byte[0];
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0 && this.zzc.length == 0) {
            this.zza.zza(bArr, bArr2);
        } else {
            if (!zzhpd.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.zzc;
            if (bArr4.length != 0) {
                bArr2 = zziat.zza(bArr2, bArr4);
            }
            this.zza.zza(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}

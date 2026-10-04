package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzibc implements zzhek {
    private final zzibs zza;
    private final zzhfi zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzibc(zzibs zzibsVar, zzhfi zzhfiVar, int i10, byte[] bArr) {
        this.zza = zzibsVar;
        this.zzb = zzhfiVar;
        this.zzc = i10;
        this.zzd = bArr;
    }

    public static zzhek zzb(zzhge zzhgeVar) throws GeneralSecurityException {
        zziam zziamVar = new zziam(zzhgeVar.zze().zzc(zzheq.zza()), zzhgeVar.zzg().zzf());
        String strValueOf = String.valueOf(zzhgeVar.zzg().zzh());
        return new zzibc(zziamVar, new zzibx(new zzibw("HMAC".concat(strValueOf), new SecretKeySpec(zzhgeVar.zzf().zzc(zzheq.zza()), "HMAC")), zzhgeVar.zzg().zze()), zzhgeVar.zzg().zze(), zzhgeVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int length = bArr.length;
        int i10 = this.zzc;
        int length2 = bArr3.length;
        if (length < i10 + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzhpd.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i11 = length - i10;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i11);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i11, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((zzibx) this.zzb).zzc(zziat.zza(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))), bArrCopyOfRange2)) {
            return this.zza.zza(bArrCopyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}

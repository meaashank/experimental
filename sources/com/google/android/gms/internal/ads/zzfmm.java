package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfmm {
    @e.f0
    public zzfmm() {
        try {
            zzhfv.zza();
        } catch (GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        byte[] byteArray;
        try {
            zzhfd zzhfdVarZzg = zzhfd.zzg(zzhev.zzb(zzhns.zza().zzc("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzheo.zzb(zzhfdVarZzg, zzhen.zzb(byteArrayOutputStream));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "CryptoUtils.generateKey");
            byteArray = new byte[0];
        }
        return Base64.encodeToString(byteArray, 11);
    }

    @Nullable
    public static final String zzb(byte[] bArr, byte[] bArr2, @Nullable String str, zzeae zzeaeVar) {
        zzhfd zzhfdVarZzc;
        if (str != null && (zzhfdVarZzc = zzc(str)) != null) {
            try {
                byte[] bArrZza = ((zzhek) zzhfdVarZzc.zzh(zzhlz.zza(), zzhek.class)).zza(bArr, bArr2);
                zzeaeVar.zzc().put("ds", "1");
                return new String(bArrZza, StandardCharsets.UTF_8);
            } catch (UnsupportedOperationException | GeneralSecurityException e10) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e10.toString()));
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "CryptoUtils.decrypt");
                zzeaeVar.zzc().put("dsf", e10.toString());
            }
        }
        return null;
    }

    @Nullable
    private static final zzhfd zzc(String str) {
        try {
            try {
                return zzheo.zza(zzhem.zza(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "CryptoUtils.getHandle");
            return null;
        }
    }
}

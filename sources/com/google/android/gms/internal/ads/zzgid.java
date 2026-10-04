package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgid {
    private MessageDigest zza;
    private final zzgrh zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private SecureRandom zze;

    public zzgid(zzgrh zzgrhVar) {
        this.zzb = zzgrhVar;
    }

    public final void zza() {
        if (zzc()) {
            return;
        }
        zzb(new SecureRandom());
    }

    public final synchronized void zzb(SecureRandom secureRandom) {
        zzgrf zzgrfVarZza = this.zzb.zza(202);
        try {
            try {
                try {
                    zzgrfVarZza.zza();
                    this.zze = secureRandom;
                    this.zza = MessageDigest.getInstance("MD5");
                    this.zzd = true;
                } catch (Throwable th) {
                    zzgrfVarZza.zzb(th);
                    throw th;
                }
            } catch (NoSuchAlgorithmException e10) {
                zzgrfVarZza.zzb(e10);
            }
            zzgrfVarZza.zzc();
        } catch (Throwable th2) {
            zzgrfVarZza.zzc();
            throw th2;
        }
    }

    public final synchronized boolean zzc() {
        return this.zzd;
    }

    public final byte[] zzd(byte[] bArr, String str, boolean z10) {
        int length = bArr.length;
        int i10 = true != z10 ? 255 : 239;
        zzguk.zza(length <= i10);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i10 + 1).put((byte) length);
        if (length < i10) {
            int i11 = i10 - length;
            byte[] bArr2 = new byte[i11];
            this.zze.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i11);
            System.arraycopy(bArr2, 0, bArr, length, i11);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z10) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzgig[] zzgigVarArr = new zzgit().zzcK;
        int length2 = zzgigVarArr.length;
        for (int i12 = 0; i12 < 12; i12++) {
            zzgigVarArr[i12].zza(bArrArray, bArr3);
        }
        if (!zzgvb.zzc(str)) {
            new zzgif(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8)).zza(bArr3);
        }
        return bArr3;
    }

    public final byte[] zze(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.zzc) {
            this.zza.reset();
            this.zza.update(bArr);
            bArrDigest = this.zza.digest();
        }
        return bArrDigest;
    }

    public final zzazs zzf(byte[] bArr, String str) {
        zzazs zzazsVarZza = zzazt.zza();
        byte[] bArrZze = zze(bArr);
        zziei zzieiVar = zziei.zza;
        zzazsVarZza.zzb(zziei.zzt(bArrZze, 0, bArrZze.length));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            int length = bArr.length;
            if (i10 >= ((length - 1) / 255) + 1) {
                break;
            }
            int i11 = i10 * 255;
            int i12 = i11 + 255;
            if (length > i12) {
                length = i12;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i11, length));
            i10++;
        }
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            zzazsVarZza.zza(zziei.zzt(zzd((byte[]) obj, str, false), 0, 256));
        }
        return zzazsVarZza;
    }

    public final String zzg(int i10, String str) {
        zzaya zzayaVarZzj = zzaza.zzj();
        zzayaVarZzj.zzl(i10);
        return Base64.encodeToString(zzd(((zzaza) zzayaVarZzj.zzbu()).zzaN(), str, true), 11);
    }
}

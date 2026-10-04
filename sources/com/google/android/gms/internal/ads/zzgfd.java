package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgfd {
    public static String zza(byte[] bArr, boolean z10) {
        return zzc(z10).zzj(bArr, 0, bArr.length);
    }

    public static byte[] zzb(String str, boolean z10) throws IllegalArgumentException {
        byte[] bArrZzk = zzc(z10).zzk(str);
        if (bArrZzk.length != 0 || str.length() <= 0) {
            return bArrZzk;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    private static zzhah zzc(boolean z10) {
        return z10 ? zzhah.zzm().zzh() : zzhah.zzl();
    }
}

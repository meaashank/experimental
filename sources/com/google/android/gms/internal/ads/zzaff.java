package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaff {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, com.prism.gaia.server.accounts.r.f166614b, 48000, 44100, 32000, 24000, 22050, 16000, M6.b.f58838e, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzafe zza(byte[] bArr) throws zzat {
        return zzb(new zzet(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzafe zzb(com.google.android.gms.internal.ads.zzet r11, boolean r12) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaff.zzb(com.google.android.gms.internal.ads.zzet, boolean):com.google.android.gms.internal.ads.zzafe");
    }

    private static int zzc(zzet zzetVar) {
        int iZzj = zzetVar.zzj(5);
        return iZzj == 31 ? zzetVar.zzj(6) + 32 : iZzj;
    }

    private static int zzd(zzet zzetVar) throws zzat {
        int iZzj = zzetVar.zzj(4);
        if (iZzj == 15) {
            if (zzetVar.zzc() >= 24) {
                return zzetVar.zzj(24);
            }
            throw zzat.zzb("AAC header insufficient data", null);
        }
        if (iZzj < 13) {
            return zzb[iZzj];
        }
        throw zzat.zzb("AAC header wrong Sampling Frequency Index", null);
    }
}

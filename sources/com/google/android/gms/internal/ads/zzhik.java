package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhik {
    public static final zzhik zza = new zzhik("ASSUME_AES_GCM");
    public static final zzhik zzb = new zzhik("ASSUME_XCHACHA20POLY1305");
    public static final zzhik zzc = new zzhik("ASSUME_CHACHA20POLY1305");
    public static final zzhik zzd = new zzhik("ASSUME_AES_CTR_HMAC");
    public static final zzhik zze = new zzhik("ASSUME_AES_EAX");
    public static final zzhik zzf = new zzhik("ASSUME_AES_GCM_SIV");
    private final String zzg;

    private zzhik(String str) {
        this.zzg = str;
    }

    public final String toString() {
        return this.zzg;
    }
}

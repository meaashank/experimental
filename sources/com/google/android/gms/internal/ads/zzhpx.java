package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhpx {
    public static final zzhpx zza = new zzhpx("SHA1");
    public static final zzhpx zzb = new zzhpx("SHA224");
    public static final zzhpx zzc = new zzhpx("SHA256");
    public static final zzhpx zzd = new zzhpx("SHA384");
    public static final zzhpx zze = new zzhpx("SHA512");
    private final String zzf;

    private zzhpx(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}

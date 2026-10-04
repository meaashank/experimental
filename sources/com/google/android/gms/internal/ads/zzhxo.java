package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhxo {
    public static final zzhxo zza = new zzhxo("SHA256");
    public static final zzhxo zzb = new zzhxo("SHA384");
    public static final zzhxo zzc = new zzhxo("SHA512");
    private final String zzd;

    private zzhxo(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}

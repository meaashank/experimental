package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhya {
    public static final zzhya zza = new zzhya("SHA256");
    public static final zzhya zzb = new zzhya("SHA384");
    public static final zzhya zzc = new zzhya("SHA512");
    private final String zzd;

    private zzhya(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}

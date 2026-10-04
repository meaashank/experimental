package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhvu {
    public static final zzhvu zza = new zzhvu("SHA256");
    public static final zzhvu zzb = new zzhvu("SHA384");
    public static final zzhvu zzc = new zzhvu("SHA512");
    private final String zzd;

    private zzhvu(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}

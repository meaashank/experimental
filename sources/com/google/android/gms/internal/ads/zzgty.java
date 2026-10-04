package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgty implements zzgul {
    public static zzgty zzc() {
        return zzgtx.zzb;
    }

    public static zzgty zzd(char c10) {
        return new zzgtu(c10);
    }

    @Override // com.google.android.gms.internal.ads.zzgul
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c10);
}

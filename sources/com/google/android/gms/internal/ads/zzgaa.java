package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgaa extends Exception {
    private final int zza;

    public zzgaa(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public final int zza() {
        return this.zza;
    }

    public zzgaa(int i10, Throwable th) {
        super(th);
        this.zza = i10;
    }
}

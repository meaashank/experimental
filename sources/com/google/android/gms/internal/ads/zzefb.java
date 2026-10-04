package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public class zzefb extends Exception {
    private final int zza;

    public zzefb(int i10) {
        this.zza = i10;
    }

    public final int zza() {
        return this.zza;
    }

    public zzefb(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public zzefb(int i10, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}

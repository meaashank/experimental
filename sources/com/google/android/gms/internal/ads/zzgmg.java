package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgmg extends RuntimeException {
    public zzgmg() {
        this(0);
    }

    public zzgmg(int i10) {
        super(androidx.multidex.d.a(new StringBuilder(String.valueOf(i10).length() + 3), "r: ", i10));
    }

    public zzgmg(int i10, Throwable th) {
        super("r: 2", th);
    }
}

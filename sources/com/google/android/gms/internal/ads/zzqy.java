package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqy extends Exception {
    public final int zza;
    public final boolean zzb;

    public zzqy(int i10, boolean z10) {
        super(androidx.multidex.d.a(new StringBuilder(String.valueOf(i10).length() + 26), "AudioOutput write failed: ", i10));
        this.zzb = z10;
        this.zza = i10;
    }
}

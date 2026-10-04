package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzsh extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzv zzc;

    public zzsh(int i10, zzv zzvVar, boolean z10) {
        super(androidx.multidex.d.a(new StringBuilder(String.valueOf(i10).length() + 25), "AudioTrack write failed: ", i10));
        this.zzb = z10;
        this.zza = i10;
        this.zzc = zzvVar;
    }
}

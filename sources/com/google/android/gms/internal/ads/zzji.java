package com.google.android.gms.internal.ads;

import e.InterfaceC4326A;

/* JADX INFO: loaded from: classes4.dex */
final class zzji {
    public int zza = 1;
    public boolean zzb;
    public int zzc;

    @InterfaceC4326A("this")
    private int zzd;

    public final synchronized void zza() {
        this.zzd++;
    }

    public final synchronized void zzb() {
        this.zzd--;
    }

    public final synchronized int zzc() {
        return this.zzd;
    }
}

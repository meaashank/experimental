package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzatq implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzats zzc;

    public zzatq(zzats zzatsVar, String str, long j10) {
        this.zza = str;
        this.zzb = j10;
        Objects.requireNonNull(zzatsVar);
        this.zzc = zzatsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzats zzatsVar = this.zzc;
        zzatsVar.zzx().zza(this.zza, this.zzb);
        zzatsVar.zzx().zzb(zzatsVar.toString());
    }
}

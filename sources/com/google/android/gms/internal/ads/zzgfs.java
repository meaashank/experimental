package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgfs implements Comparable {
    final Runnable zza;
    final long zzb;

    public zzgfs(Runnable runnable, long j10) {
        this.zza = runnable;
        this.zzb = j10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.zzb, ((zzgfs) obj).zzb);
    }
}

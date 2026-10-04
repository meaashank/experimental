package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzapo implements Comparable {
    public final int zza;
    public final zzapj zzb;

    public zzapo(int i10, zzapj zzapjVar) {
        this.zza = i10;
        this.zzb = zzapjVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzapo) obj).zza);
    }
}

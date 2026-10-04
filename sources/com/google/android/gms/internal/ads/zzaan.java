package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzaan extends zzaau implements Comparable {
    private final int zze;
    private final int zzf;

    public zzaan(int i10, zzbg zzbgVar, int i11, zzaaq zzaaqVar, int i12) {
        super(i10, zzbgVar, i11);
        this.zze = C3355u1.c(i12, zzaaqVar.zzV) ? 1 : 0;
        this.zzf = this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaan zzaanVar) {
        return Integer.compare(this.zzf, zzaanVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final /* bridge */ /* synthetic */ boolean zzc(zzaau zzaauVar) {
        return false;
    }
}

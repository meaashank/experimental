package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zziic extends zziia {
    public static final void zzi(zziib zziibVar, int i10, zziei zzieiVar) {
        zziibVar.zzk((i10 << 3) | 2, zzieiVar);
    }

    public static final void zzj(zziib zziibVar, int i10, long j10) {
        zziibVar.zzk(i10 << 3, Long.valueOf(j10));
    }

    public static final zziib zzk(Object obj) {
        zzifm zzifmVar = (zzifm) obj;
        zziib zziibVar = zzifmVar.zzt;
        if (zziibVar != zziib.zza()) {
            return zziibVar;
        }
        zziib zziibVarZzb = zziib.zzb();
        zzifmVar.zzt = zziibVarZzb;
        return zziibVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zziia
    public final /* bridge */ /* synthetic */ void zza(Object obj, int i10, long j10) {
        zzj((zziib) obj, i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zziia
    public final /* bridge */ /* synthetic */ void zzb(Object obj, int i10, int i11) {
        ((zziib) obj).zzk((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.gms.internal.ads.zziia
    public final /* bridge */ /* synthetic */ void zzc(Object obj, int i10, long j10) {
        ((zziib) obj).zzk((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.zziia
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i10, zziei zzieiVar) {
        zzi((zziib) obj, i10, zzieiVar);
    }

    @Override // com.google.android.gms.internal.ads.zziia
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i10, Object obj2) {
        ((zziib) obj).zzk((i10 << 3) | 3, (zziib) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zziia
    public final /* synthetic */ Object zzf() {
        return zziib.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zziia
    public final /* synthetic */ Object zzg(Object obj) {
        zziib zziibVar = (zziib) obj;
        zziibVar.zzd();
        return zziibVar;
    }
}

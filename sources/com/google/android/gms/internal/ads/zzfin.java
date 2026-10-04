package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes4.dex */
final class zzfin implements zzgub {
    final /* synthetic */ zzfiq zza;

    public zzfin(zzfiq zzfiqVar) {
        Objects.requireNonNull(zzfiqVar);
        this.zza = zzfiqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzcbv zzcbvVar = (zzcbv) obj;
        zzfio zzfioVar = new zzfio(zzcbvVar, new zzfnx(zzcbvVar.zzj), null);
        zzfiq zzfiqVar = this.zza;
        zzfiqVar.zzd(zzfioVar);
        return zzfiqVar.zzc();
    }
}

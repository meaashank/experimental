package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzsw implements zztj {
    final /* synthetic */ zztd zza;

    public /* synthetic */ zzsw(zztd zztdVar, byte[] bArr) {
        Objects.requireNonNull(zztdVar);
        this.zza = zztdVar;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void zza(long j10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 41);
        sb2.append("Ignoring impossibly large audio latency: ");
        sb2.append(j10);
        zzeh.zzc("AudioTrackAudioOutput", sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void zzb(final long j10) {
        zztd zztdVar = this.zza;
        if (zztdVar.zzu().zzb()) {
            zzeg zzegVarZzu = zztdVar.zzu();
            zzegVarZzu.zze(-1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzsv
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj) {
                    ((zzqx) obj).zza(j10);
                }
            });
            zzegVarZzu.zzf();
        }
    }
}

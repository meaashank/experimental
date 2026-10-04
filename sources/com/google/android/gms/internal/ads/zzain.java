package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzain extends zzaft {
    public zzain(final zzagu zzaguVar, int i10, long j10, long j11) {
        long j12;
        Objects.requireNonNull(zzaguVar);
        zzafq zzafqVar = new zzafq() { // from class: com.google.android.gms.internal.ads.zzail
            @Override // com.google.android.gms.internal.ads.zzafq
            public final /* synthetic */ long zza(long j13) {
                return zzaguVar.zzb(j13);
            }
        };
        zzaim zzaimVar = new zzaim(zzaguVar, i10, null);
        long jZza = zzaguVar.zza();
        long j13 = zzaguVar.zzj;
        int i11 = zzaguVar.zzd;
        if (i11 > 0) {
            j12 = ((((long) i11) + ((long) zzaguVar.zzc)) / 2) + 1;
        } else {
            int i12 = zzaguVar.zza;
            int i13 = zzaguVar.zzb;
            long j14 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            if (i12 == i13 && i12 > 0) {
                j14 = i12;
            }
            j12 = 64 + (((j14 * ((long) zzaguVar.zzg)) * ((long) zzaguVar.zzh)) / 8);
        }
        super(zzafqVar, zzaimVar, jZza, 0L, j13, j10, j11, j12, Math.max(6, zzaguVar.zzc));
    }
}

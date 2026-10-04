package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzaud {
    public static final boolean zza = zzaue.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzaue.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j10) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzauc(str, j10, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        this.zzc = true;
        List<zzauc> list = this.zzb;
        long j10 = list.size() == 0 ? 0L : ((zzauc) list.get(list.size() - 1)).zzc - ((zzauc) list.get(0)).zzc;
        if (j10 > 0) {
            long j11 = ((zzauc) list.get(0)).zzc;
            zzaue.zzb("(%-4d ms) %s", Long.valueOf(j10), str);
            for (zzauc zzaucVar : list) {
                long j12 = zzaucVar.zzc;
                zzaue.zzb("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(zzaucVar.zzb), zzaucVar.zza);
                j11 = j12;
            }
        }
    }
}

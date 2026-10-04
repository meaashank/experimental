package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzabs {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzabt zzabtVar) {
        zzb(zzabtVar);
        this.zza.add(new zzabr(handler, zzabtVar));
    }

    public final void zzb(zzabt zzabtVar) {
        CopyOnWriteArrayList<zzabr> copyOnWriteArrayList = this.zza;
        for (zzabr zzabrVar : copyOnWriteArrayList) {
            if (zzabrVar.zzc() == zzabtVar) {
                zzabrVar.zza();
                copyOnWriteArrayList.remove(zzabrVar);
            }
        }
    }

    public final void zzc(final int i10, final long j10, final long j11) {
        for (final zzabr zzabrVar : this.zza) {
            if (!zzabrVar.zzd()) {
                zzabrVar.zzb().post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzabrVar.zzc().zzX(i10, j10, j11);
                    }
                });
            }
        }
    }
}

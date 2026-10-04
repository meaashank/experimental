package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgrb implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzgrd zza;

    public zzgrb(zzgrd zzgrdVar) {
        Objects.requireNonNull(zzgrdVar);
        this.zza = zzgrdVar;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        zzgrd zzgrdVar = this.zza;
        synchronized (zzgrdVar) {
            try {
                if (z10) {
                    zzgrdVar.zzg(System.currentTimeMillis());
                    zzgrdVar.zzj(true);
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzgrdVar.zzh() > 0 && jCurrentTimeMillis >= zzgrdVar.zzh()) {
                        zzgrdVar.zzi(jCurrentTimeMillis - zzgrdVar.zzh());
                    }
                    zzgrdVar.zzj(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

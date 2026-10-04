package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbco implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzbcp zza;

    public zzbco(zzbcp zzbcpVar) {
        Objects.requireNonNull(zzbcpVar);
        this.zza = zzbcpVar;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        if (z10) {
            zzbcp zzbcpVar = this.zza;
            zzbcpVar.zze(System.currentTimeMillis());
            zzbcpVar.zzh(true);
            return;
        }
        zzbcp zzbcpVar2 = this.zza;
        long jZzf = zzbcpVar2.zzf();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jZzf > 0 && jCurrentTimeMillis >= zzbcpVar2.zzf()) {
            zzbcpVar2.zzg(jCurrentTimeMillis - zzbcpVar2.zzf());
        }
        zzbcpVar2.zzh(false);
    }
}

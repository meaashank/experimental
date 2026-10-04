package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbce implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbcg zzb;

    public zzbce(zzbcg zzbcgVar, int i10, boolean z10) {
        this.zza = i10;
        Objects.requireNonNull(zzbcgVar);
        this.zzb = zzbcgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaza zzazaVarZza;
        int i10 = this.zza;
        zzbcg zzbcgVar = this.zzb;
        if (i10 > 0) {
            try {
                Thread.sleep(i10 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzbcgVar.zza;
            zzazaVarZza = zzfyp.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzazaVarZza = null;
        }
        zzbcg zzbcgVar2 = this.zzb;
        zzbcgVar2.zzs(zzazaVarZza);
        int i11 = this.zza;
        if (i11 < 4) {
            if (zzazaVarZza != null && zzazaVarZza.zza() && !zzazaVarZza.zzb().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzazaVarZza.zzg() && zzazaVarZza.zzh().zza() && zzazaVarZza.zzh().zzb() != -2) {
                return;
            }
            zzbcgVar2.zzp(i11 + 1, true);
        }
    }
}

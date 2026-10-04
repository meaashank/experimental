package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfat implements zzfdi {
    private final Context zza;
    private final Intent zzb;

    public zzfat(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        com.google.android.gms.ads.internal.util.zze.zza("HsdpMigrationSignal.produce");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoy)).booleanValue()) {
            return zzhcy.zza(new zzfau(null));
        }
        boolean z10 = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                com.google.android.gms.ads.internal.util.zze.zza("HSDP intent is supported");
                z10 = true;
            }
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzhcy.zza(new zzfau(Boolean.valueOf(z10)));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 60;
    }
}

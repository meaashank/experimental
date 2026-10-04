package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgsp extends zzgrn {
    final /* synthetic */ zzgsr zza;
    private final zzgsw zzb;

    public zzgsp(zzgsr zzgsrVar, zzgsw zzgswVar) {
        Objects.requireNonNull(zzgsrVar);
        this.zza = zzgsrVar;
        this.zzb = zzgswVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgro
    public final void zza(Bundle bundle) {
        int i10 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i11 = bundle.getInt("uiMode", 0);
        zzgsu zzgsuVarZze = zzgsv.zze();
        zzgsuVarZze.zza(i10);
        if (string != null) {
            zzgsuVarZze.zzb(string);
        }
        zzgsuVarZze.zzc(i11);
        if (bundle.containsKey("userInteracted")) {
            zzgsuVarZze.zzd(Boolean.valueOf(bundle.getBoolean("userInteracted")));
        }
        this.zzb.zza(zzgsuVarZze.zze());
        if (i10 == 8157) {
            this.zza.zzd();
        }
    }
}

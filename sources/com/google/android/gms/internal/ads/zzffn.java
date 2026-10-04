package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzffn {
    private final zzcbv zza;
    private final int zzb;

    public zzffn(zzcbv zzcbvVar, int i10) {
        this.zza = zzcbvVar;
        this.zzb = i10;
    }

    public final String zza() {
        return this.zza.zzd;
    }

    public final String zzb() {
        return zzgvb.zza(this.zza.zza.getString("ms"));
    }

    @Nullable
    public final PackageInfo zzc() {
        return this.zza.zzf;
    }

    public final List zzd() {
        return this.zza.zze;
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final int zzf() {
        return this.zzb;
    }

    public final boolean zzg() {
        return this.zza.zzk;
    }

    public final boolean zzh() {
        return this.zza.zzl;
    }

    public final int zzi() {
        Bundle bundle = this.zza.zza.getBundle("extras");
        if (bundle != null && !bundle.isEmpty()) {
            switch (bundle.getString("query_info_type", "")) {
            }
            return -1;
        }
        return -1;
    }
}

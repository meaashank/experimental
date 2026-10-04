package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdcz {
    private final Context zza;
    private final zzflw zzb;
    private final Bundle zzc;

    @Nullable
    private final zzflp zzd;

    @Nullable
    private final zzdcs zze;

    @Nullable
    private final zzemv zzf;

    public /* synthetic */ zzdcz(zzdcy zzdcyVar, byte[] bArr) {
        this.zza = zzdcyVar.zzh();
        this.zzb = zzdcyVar.zzi();
        this.zzc = zzdcyVar.zzj();
        this.zzd = zzdcyVar.zzk();
        this.zze = zzdcyVar.zzl();
        this.zzf = zzdcyVar.zzm();
    }

    public final zzdcy zza() {
        zzdcy zzdcyVar = new zzdcy();
        zzdcyVar.zza(this.zza);
        zzdcyVar.zzb(this.zzb);
        zzdcyVar.zzc(this.zzc);
        zzdcyVar.zzd(this.zze);
        zzdcyVar.zzg(this.zzf);
        return zzdcyVar;
    }

    public final zzflw zzb() {
        return this.zzb;
    }

    @Nullable
    public final zzflp zzc() {
        return this.zzd;
    }

    @Nullable
    public final Bundle zzd() {
        return this.zzc;
    }

    @Nullable
    public final zzdcs zze() {
        return this.zze;
    }

    public final Context zzf(Context context) {
        return this.zza;
    }

    public final zzemv zzg(String str) {
        zzemv zzemvVar = this.zzf;
        return zzemvVar != null ? zzemvVar : new zzemv(str);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzddc implements zzinw {
    private final zzdcz zza;

    private zzddc(zzdcz zzdczVar) {
        this.zza = zzdczVar;
    }

    public static zzddc zzc(zzdcz zzdczVar) {
        return new zzddc(zzdczVar);
    }

    @Nullable
    public final Bundle zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzctr implements zzdek {
    private final zzfmu zza;

    public zzctr(zzfmu zzfmuVar) {
        this.zza = zzfmuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zza(@Nullable Context context) {
        try {
            this.zza.zzi();
        } catch (zzfmd e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onPause for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zzb(@Nullable Context context) {
        try {
            zzfmu zzfmuVar = this.zza;
            zzfmuVar.zzj();
            if (context != null) {
                zzfmuVar.zzp(context);
            }
        } catch (zzfmd e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onResume for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zzc(@Nullable Context context) {
        try {
            this.zza.zzf();
        } catch (zzfmd e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onDestroy for the mediation adapter.", e10);
        }
    }
}

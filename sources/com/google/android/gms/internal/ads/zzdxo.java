package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdxo implements zzdek {

    @Nullable
    private final zzclm zza;

    public zzdxo(@Nullable zzclm zzclmVar) {
        this.zza = zzclmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zza(@Nullable Context context) {
        zzclm zzclmVar = this.zza;
        if (zzclmVar != null) {
            zzclmVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zzb(@Nullable Context context) {
        zzclm zzclmVar = this.zza;
        if (zzclmVar != null) {
            zzclmVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zzc(@Nullable Context context) {
        zzclm zzclmVar = this.zza;
        if (zzclmVar != null) {
            zzclmVar.destroy();
        }
    }
}

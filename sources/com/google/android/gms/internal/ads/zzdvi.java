package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.android.launcher3.IconCache;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdvi implements zzbqh {

    @Nullable
    private final zzbnw zza;
    private final zzdvv zzb;
    private final zzinq zzc;

    public zzdvi(zzdrb zzdrbVar, zzdqr zzdqrVar, zzdvv zzdvvVar, zzinq zzinqVar) {
        this.zza = zzdrbVar.zzg(zzdqrVar.zzS());
        this.zzb = zzdvvVar;
        this.zzc = zzinqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbnm) this.zzc.zzb(), str);
        } catch (RemoteException e10) {
            String strA = androidx.compose.animation.core.E0.a(new StringBuilder(String.valueOf(str).length() + 40), "Failed to call onCustomClick for asset ", str, IconCache.EMPTY_CLASS_NAME);
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(strA, e10);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzd("/nativeAdCustomClick", this);
    }
}

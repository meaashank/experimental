package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcdk implements RewardItem {
    private final zzccx zza;

    public zzcdk(zzccx zzccxVar) {
        this.zza = zzccxVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzccx zzccxVar = this.zza;
        if (zzccxVar != null) {
            try {
                return zzccxVar.zzf();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not forward getAmount to RewardItem", e10);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    @Nullable
    public final String getType() {
        zzccx zzccxVar = this.zza;
        if (zzccxVar != null) {
            try {
                return zzccxVar.zze();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not forward getType to RewardItem", e10);
            }
        }
        return null;
    }
}

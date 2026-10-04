package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcdr extends zzccw {
    private final String zza;
    private final int zzb;

    public zzcdr(@Nullable RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final String zze() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzf() throws RemoteException {
        return this.zzb;
    }

    public zzcdr(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }
}

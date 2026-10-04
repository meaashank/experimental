package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Strings;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexr implements zzfdi {

    @Nullable
    private final zzfic zza;

    public zzexr(@Nullable zzfic zzficVar) {
        this.zza = zzficVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        zzfic zzficVar = this.zza;
        if (zzficVar == null) {
            return zzhcy.zza(new zzexq(null));
        }
        String strZza = zzficVar.zza();
        return Strings.isEmptyOrWhitespace(strZza) ? zzhcy.zza(new zzexq(null)) : zzhcy.zza(new zzexq(strZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 15;
    }
}

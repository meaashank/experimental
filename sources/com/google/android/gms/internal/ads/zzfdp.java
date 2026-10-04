package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfdp implements zzfdg {
    private final int zza;
    private final int zzb;

    public zzfdp(int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i10;
        int i11 = this.zza;
        Bundle bundle = (Bundle) obj;
        if (i11 == -1 || (i10 = this.zzb) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i11);
        bundle.putInt("crashes_without_flags", i10);
        int i12 = com.google.android.gms.ads.internal.client.zzay.zza;
        if (com.google.android.gms.ads.internal.client.zzba.zzc().zzc()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}

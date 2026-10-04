package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeuz implements zzfdg {
    private final boolean zza;

    public zzeuz(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.zza ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
    }
}

package com.google.android.gms.internal.ads;

import com.mbridge.msdk.MBridgeConstans;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcfy {
    private BigInteger zza = BigInteger.ONE;
    private String zzb = MBridgeConstans.ENDCARD_URL_TYPE_PL;

    public final synchronized String zza() {
        String string;
        string = this.zza.toString();
        this.zza = this.zza.add(BigInteger.ONE);
        this.zzb = string;
        return string;
    }

    public final synchronized String zzb() {
        return this.zzb;
    }
}

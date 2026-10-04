package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class zzinj extends zzino {
    final String zza;

    public zzinj(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(com.google.android.gms.ads.internal.util.e.a(str, com.google.android.gms.ads.internal.util.e.a(str2, 1)));
        sb2.append(str2);
        sb2.append(com.prism.gaia.server.accounts.b.f166434b0);
        sb2.append(str);
        Log.d("isoparser", sb2.toString());
    }
}

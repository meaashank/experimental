package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
final class zzaii implements zzahz {
    public final String zza;

    private zzaii(String str) {
        this.zza = str;
    }

    public static zzaii zzb(zzeu zzeuVar) {
        return new zzaii(zzeuVar.zzK(zzeuVar.zzd(), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzahz
    public final int zza() {
        return 1852994675;
    }
}

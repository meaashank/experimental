package com.google.android.gms.ads.internal.util;

import androidx.fragment.app.C2564b;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzaub;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbg implements zzatw {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbi zzb;

    public zzbg(zzbl zzblVar, String str, zzbi zzbiVar) {
        this.zza = str;
        this.zzb = zzbiVar;
        Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void zza(zzaub zzaubVar) {
        String str = this.zza;
        String string = zzaubVar.toString();
        String strA = C2564b.a(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length()), "Failed to load URL: ", str, "\n", string);
        int i10 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strA);
        this.zzb.zza((Object) null);
    }
}

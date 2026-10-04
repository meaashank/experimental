package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfbw implements zzfdg {

    @Nullable
    private final String zza;

    @Nullable
    private final Integer zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final String zzd;

    @Nullable
    private final String zze;

    @Nullable
    private final String zzf;

    public zzfbw(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.zza = str;
        this.zzb = num;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfml.zze(bundle, "pn", this.zza);
        zzfml.zzh(bundle, "vc", this.zzb);
        zzfml.zze(bundle, "vnm", this.zzc);
        zzfml.zze(bundle, "dl", this.zzd);
        zzfml.zze(bundle, "ins_pn", this.zze);
        zzfml.zze(bundle, "ini_pn", this.zzf);
    }
}

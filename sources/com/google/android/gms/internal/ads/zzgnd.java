package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
final class zzgnd {
    private final zzavl zza;
    private final long zzb;
    private final long zzc;
    private final String zzd;

    private zzgnd(zzavl zzavlVar, long j10, long j11, String str) {
        this.zza = zzavlVar;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = str;
    }

    public static /* synthetic */ zzgnd zza(zzavl zzavlVar, byte[] bArr, boolean z10) throws zzavj, zzavn {
        zzavlVar.zza();
        zzavlVar.zzb(bArr);
        List list = (List) zzavlVar.zzc(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        zzavlVar.zzd(jLongValue, Optional.empty());
        String strZza = zzgfd.zza(zzavo.zza(), false);
        int length = strZza.length();
        String str = true != z10 ? "" : "-s";
        return new zzgnd(zzavlVar, jLongValue2, jLongValue3, androidx.compose.animation.core.E0.a(new StringBuilder(str.length() + length + 12), "3.904631200.", strZza, str));
    }

    public final /* synthetic */ String zzb(Map map) {
        return zzgfd.zza((byte[]) this.zza.zzd(this.zzb, Optional.of(map)), true);
    }

    public final /* synthetic */ void zzc(Map map) throws zzavj, zzavn {
        this.zza.zzd(this.zzc, Optional.of(map));
    }

    public final /* synthetic */ String zzd() {
        return this.zzd;
    }
}

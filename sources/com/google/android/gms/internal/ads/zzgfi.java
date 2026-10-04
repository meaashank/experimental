package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgfi implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzgfi(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzgfi zza(zziof zziofVar, zziof zziofVar2) {
        return new zzgfi(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        ExecutorService executorService = (ExecutorService) this.zza.zzb();
        zzgei zzgeiVar = (zzgei) this.zzb.zzb();
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
        androidx.room.F.a(sb2, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
        sb2.append(")");
        return new zzgfn(executorService, sb2.toString(), zzgeiVar.zzn());
    }
}

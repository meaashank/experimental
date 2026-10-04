package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes4.dex */
@ShowFirstParty
public final class zzfys {
    private final Context zza;
    private final Looper zzb;

    public zzfys(@NonNull Context context, @NonNull Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(@NonNull String str) {
        zzfzc zzfzcVarZza = zzfze.zza();
        Context context = this.zza;
        zzfzcVarZza.zza(context.getPackageName());
        zzfzcVarZza.zzc(2);
        zzfza zzfzaVarZza = zzfzb.zza();
        zzfzaVarZza.zza(str);
        zzfzaVarZza.zzb(2);
        zzfzcVarZza.zzb(zzfzaVarZza);
        new zzfyt(context, this.zzb, (zzfze) zzfzcVarZza.zzbu()).zza();
    }
}

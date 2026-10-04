package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfvm {
    public static zzfvm zze(zzfvn zzfvnVar, zzfvo zzfvoVar) {
        zzfxk.zza();
        return new zzfvq(zzfvnVar, zzfvoVar, UUID.randomUUID().toString());
    }

    public abstract void zza();

    public abstract void zzb(@Nullable View view);

    public abstract void zzc();

    public abstract void zzd(View view, zzfvt zzfvtVar, @Nullable String str);
}

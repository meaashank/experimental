package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeet {
    private final Context zza;
    private zzasl zzb;

    public zzeet(Context context) {
        this.zza = context;
    }

    public final void zza() {
        this.zzb = zzask.zza(this.zza);
    }

    public final void zzb(zzaso zzasoVar) {
        this.zzb.zzb(zzasoVar);
    }

    public final void zzc() {
        this.zzb.zzc();
    }

    @Nullable
    public final zzasp zzd() {
        try {
            zzasl zzaslVar = this.zzb;
            if (zzaslVar == null || !zzaslVar.zza()) {
                return null;
            }
            return zzaslVar.zzd();
        } catch (RemoteException unused) {
            return null;
        }
    }
}

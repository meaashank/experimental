package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzme {
    public final long zza;
    public final float zzb;
    public final long zzc;

    public /* synthetic */ zzme(zzmd zzmdVar, byte[] bArr) {
        this.zza = zzmdVar.zze();
        this.zzb = zzmdVar.zzf();
        this.zzc = zzmdVar.zzg();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzme)) {
            return false;
        }
        zzme zzmeVar = (zzme) obj;
        return this.zza == zzmeVar.zza && this.zzb == zzmeVar.zzb && this.zzc == zzmeVar.zzc;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc));
    }

    public final zzmd zza() {
        return new zzmd(this, null);
    }
}

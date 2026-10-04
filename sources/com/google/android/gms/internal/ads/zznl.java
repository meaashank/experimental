package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import e.InterfaceC4348w;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zznl {
    public static final zznl zza = new zznl(new zznk());
    public final zzgxw zzb;

    @Nullable
    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    public final Double zzc = null;

    @Nullable
    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = true;
    public final boolean zzi = true;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zznl(zznk zznkVar) {
        this.zzb = zznkVar.zza();
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof zznl) && this.zzb.equals(((zznl) obj).zzb);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.zzb, null, null, bool, bool, bool, bool, bool);
    }
}

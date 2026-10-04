package com.google.android.gms.internal.ads;

import android.os.Looper;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzna {
    private final zzmz zza;
    private final zzmy zzb;
    private final zzbf zzc;
    private int zzd;

    @Nullable
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;

    public zzna(zzmy zzmyVar, zzmz zzmzVar, zzbf zzbfVar, int i10, zzdp zzdpVar, Looper looper) {
        this.zzb = zzmyVar;
        this.zza = zzmzVar;
        this.zzc = zzbfVar;
        this.zzf = looper;
        this.zzg = i10;
    }

    public final zzmz zza() {
        return this.zza;
    }

    public final zzna zzb(int i10) {
        zzguk.zzi(!this.zzh);
        this.zzd = i10;
        return this;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzna zzd(@Nullable Object obj) {
        zzguk.zzi(!this.zzh);
        this.zze = obj;
        return this;
    }

    @Nullable
    public final Object zze() {
        return this.zze;
    }

    public final Looper zzf() {
        return this.zzf;
    }

    public final zzna zzg() {
        zzguk.zzi(!this.zzh);
        this.zzh = true;
        this.zzb.zzk(this);
        return this;
    }

    public final synchronized boolean zzh() {
        return false;
    }

    public final synchronized void zzi(boolean z10) {
        this.zzi = z10 | this.zzi;
        notifyAll();
    }
}

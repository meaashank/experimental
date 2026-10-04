package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import e.InterfaceC4335i;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzabl {

    @Nullable
    private zzabk zza;

    @Nullable
    private zzabu zzb;

    @InterfaceC4335i
    public void zzb() {
        this.zza = null;
        this.zzb = null;
    }

    public boolean zzd() {
        throw null;
    }

    public void zze(zzd zzdVar) {
        throw null;
    }

    @Nullable
    public zznf zzg() {
        throw null;
    }

    public abstract void zzq(@Nullable Object obj);

    public abstract zzabm zzr(zzng[] zzngVarArr, zzzr zzzrVar, zzxo zzxoVar, zzbf zzbfVar) throws zzjn;

    @InterfaceC4335i
    public final void zzs(zzabk zzabkVar, zzabu zzabuVar) {
        zzguk.zzi(this.zza == null);
        this.zza = zzabkVar;
        this.zzb = zzabuVar;
    }

    public final void zzt() {
        zzabk zzabkVar = this.zza;
        if (zzabkVar != null) {
            zzabkVar.zzq();
        }
    }

    public final zzabu zzu() {
        zzabu zzabuVar = this.zzb;
        zzabuVar.getClass();
        return zzabuVar;
    }
}

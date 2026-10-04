package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzlv {
    public zzmw zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzlv(zzmw zzmwVar) {
        this.zza = zzmwVar;
    }

    public final void zza(int i10) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i10);
        this.zzb += i10;
    }

    public final void zzb(zzmw zzmwVar) {
        this.zze |= this.zza != zzmwVar;
        this.zza = zzmwVar;
    }

    public final void zzc(int i10) {
        if (this.zzc && this.zzd != 5) {
            zzguk.zza(i10 == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i10;
    }

    public final /* synthetic */ boolean zzd() {
        return this.zze;
    }
}

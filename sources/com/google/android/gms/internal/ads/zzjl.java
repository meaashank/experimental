package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzjl implements zzmf {
    private final zznp zza;
    private final zzjk zzb;

    @Nullable
    private zzne zzc;

    @Nullable
    private zzmf zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzjl(zzjk zzjkVar, zzdp zzdpVar) {
        this.zzb = zzjkVar;
        this.zza = new zznp(zzdpVar);
    }

    public final void zza() {
        this.zzf = true;
        this.zza.zza();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zzb();
    }

    public final void zzc(long j10) {
        this.zza.zzc(j10);
    }

    public final void zzd(zzne zzneVar) throws zzjn {
        zzmf zzmfVar;
        zzmf zzmfVarZzd = zzneVar.zzd();
        if (zzmfVarZzd == null || zzmfVarZzd == (zzmfVar = this.zzd)) {
            return;
        }
        if (zzmfVar != null) {
            throw zzjn.zzc(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzmfVarZzd;
        this.zzc = zzneVar;
        zzmfVarZzd.zzi(this.zza.zzj());
    }

    public final void zze(zzne zzneVar) {
        if (zzneVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzf(boolean r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzne r0 = r5.zzc
            if (r0 == 0) goto L69
            boolean r0 = r0.zzac()
            if (r0 != 0) goto L69
            if (r6 == 0) goto L15
            com.google.android.gms.internal.ads.zzne r0 = r5.zzc
            int r0 = r0.zze()
            r1 = 2
            if (r0 != r1) goto L69
        L15:
            com.google.android.gms.internal.ads.zzne r0 = r5.zzc
            boolean r0 = r0.zzab()
            if (r0 != 0) goto L28
            if (r6 != 0) goto L69
            com.google.android.gms.internal.ads.zzne r6 = r5.zzc
            boolean r6 = r6.zzcW()
            if (r6 == 0) goto L28
            goto L69
        L28:
            com.google.android.gms.internal.ads.zzmf r6 = r5.zzd
            r6.getClass()
            long r0 = r6.zzg()
            boolean r2 = r5.zze
            if (r2 == 0) goto L4d
            com.google.android.gms.internal.ads.zznp r2 = r5.zza
            long r3 = r2.zzg()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L43
            r2.zzb()
            goto L75
        L43:
            r3 = 0
            r5.zze = r3
            boolean r3 = r5.zzf
            if (r3 == 0) goto L4d
            r2.zza()
        L4d:
            com.google.android.gms.internal.ads.zznp r2 = r5.zza
            r2.zzc(r0)
            com.google.android.gms.internal.ads.zzav r6 = r6.zzj()
            com.google.android.gms.internal.ads.zzav r0 = r2.zzj()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L75
            r2.zzi(r6)
            com.google.android.gms.internal.ads.zzjk r0 = r5.zzb
            r0.zzc(r6)
            goto L75
        L69:
            r6 = 1
            r5.zze = r6
            boolean r6 = r5.zzf
            if (r6 == 0) goto L75
            com.google.android.gms.internal.ads.zznp r6 = r5.zza
            r6.zza()
        L75:
            long r0 = r5.zzg()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjl.zzf(boolean):long");
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final long zzg() {
        if (this.zze) {
            return this.zza.zzg();
        }
        zzmf zzmfVar = this.zzd;
        zzmfVar.getClass();
        return zzmfVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final boolean zzh() {
        if (this.zze) {
            return false;
        }
        zzmf zzmfVar = this.zzd;
        zzmfVar.getClass();
        return zzmfVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzi(zzav zzavVar) {
        zzmf zzmfVar = this.zzd;
        if (zzmfVar != null) {
            zzmfVar.zzi(zzavVar);
            zzavVar = this.zzd.zzj();
        }
        this.zza.zzi(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final zzav zzj() {
        zzmf zzmfVar = this.zzd;
        return zzmfVar != null ? zzmfVar.zzj() : this.zza.zzj();
    }
}

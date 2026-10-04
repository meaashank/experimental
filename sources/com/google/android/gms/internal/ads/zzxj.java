package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzxj extends zzzt {
    private final boolean zzb;
    private final zzbe zzc;
    private final zzbd zzd;
    private zzxh zze;

    @Nullable
    private zzxg zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzxj(zzxq zzxqVar, boolean z10) {
        boolean z11;
        super(zzxqVar);
        if (z10) {
            zzxqVar.zzJ();
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzb = z11;
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        zzxqVar.zzI();
        this.zze = zzxh.zzp(zzxqVar.zzK());
    }

    private final Object zzL(Object obj) {
        return (this.zze.zzs() == null || !obj.equals(zzxh.zzc)) ? obj : this.zze.zzs();
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final boolean zzM(long j10) {
        zzxg zzxgVar = this.zzf;
        int iZze = this.zze.zze(zzxgVar.zza.zza);
        if (iZze == -1) {
            return false;
        }
        zzxh zzxhVar = this.zze;
        zzbd zzbdVar = this.zzd;
        zzxhVar.zzd(iZze, zzbdVar, false);
        long j11 = zzbdVar.zzd;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        zzxgVar.zzg(j10);
        return true;
    }

    public final zzbf zzA() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwp, com.google.android.gms.internal.ads.zzxq
    public final void zzB(zzak zzakVar) {
        if (this.zzi) {
            zzxh zzxhVar = this.zze;
            this.zze = zzxhVar.zzr(zzzp.zzp(zzxhVar.zzb, zzakVar));
        } else {
            this.zze = zzxh.zzp(zzakVar);
        }
        ((zzzt) this).zza.zzB(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzt
    public final void zzC() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzw(null, ((zzzt) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzzt, com.google.android.gms.internal.ads.zzxq
    /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final zzxg zzH(zzxo zzxoVar, zzabp zzabpVar, long j10) {
        zzxg zzxgVar = new zzxg(zzxoVar, zzabpVar, j10);
        zzxgVar.zzi(((zzzt) this).zza);
        if (this.zzh) {
            zzxgVar.zzj(zzxoVar.zza(zzL(zzxoVar.zza)));
            return zzxgVar;
        }
        this.zzf = zzxgVar;
        if (!this.zzg) {
            this.zzg = true;
            zzw(null, ((zzzt) this).zza);
        }
        return zzxgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzt, com.google.android.gms.internal.ads.zzxq
    public final void zzE(zzxm zzxmVar) {
        ((zzxg) zzxmVar).zzk();
        if (zzxmVar == this.zzf) {
            this.zzf = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzzt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzF(com.google.android.gms.internal.ads.zzbf r12) {
        /*
            r11 = this;
            boolean r0 = r11.zzh
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.zzxh r0 = r11.zze
            com.google.android.gms.internal.ads.zzxh r12 = r0.zzr(r12)
            r11.zze = r12
            com.google.android.gms.internal.ads.zzxg r12 = r11.zzf
            if (r12 == 0) goto L97
            long r2 = r12.zzh()
            r11.zzM(r2)
            goto L97
        L1a:
            boolean r0 = r12.zzg()
            if (r0 == 0) goto L36
            boolean r0 = r11.zzi
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzxh r0 = r11.zze
            com.google.android.gms.internal.ads.zzxh r12 = r0.zzr(r12)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbe.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzxh.zzc
            com.google.android.gms.internal.ads.zzxh r12 = com.google.android.gms.internal.ads.zzxh.zzq(r12, r0, r2)
        L33:
            r11.zze = r12
            goto L97
        L36:
            com.google.android.gms.internal.ads.zzbe r3 = r11.zzc
            r0 = 0
            r4 = 0
            r12.zzb(r0, r3, r4)
            java.lang.Object r8 = r3.zzb
            com.google.android.gms.internal.ads.zzxg r2 = r11.zzf
            if (r2 == 0) goto L5d
            long r6 = r2.zza()
            com.google.android.gms.internal.ads.zzxh r9 = r11.zze
            com.google.android.gms.internal.ads.zzbd r10 = r11.zzd
            com.google.android.gms.internal.ads.zzxo r2 = r2.zza
            java.lang.Object r2 = r2.zza
            r9.zzo(r2, r10)
            com.google.android.gms.internal.ads.zzxh r2 = r11.zze
            r2.zzb(r0, r3, r4)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L5d
            goto L5e
        L5d:
            r6 = r4
        L5e:
            com.google.android.gms.internal.ads.zzbd r4 = r11.zzd
            r5 = 0
            r2 = r12
            android.util.Pair r12 = r2.zzm(r3, r4, r5, r6)
            java.lang.Object r0 = r12.first
            java.lang.Object r12 = r12.second
            java.lang.Long r12 = (java.lang.Long) r12
            long r3 = r12.longValue()
            boolean r12 = r11.zzi
            if (r12 == 0) goto L7b
            com.google.android.gms.internal.ads.zzxh r12 = r11.zze
            com.google.android.gms.internal.ads.zzxh r12 = r12.zzr(r2)
            goto L7f
        L7b:
            com.google.android.gms.internal.ads.zzxh r12 = com.google.android.gms.internal.ads.zzxh.zzq(r2, r8, r0)
        L7f:
            r11.zze = r12
            com.google.android.gms.internal.ads.zzxg r12 = r11.zzf
            if (r12 == 0) goto L97
            boolean r0 = r11.zzM(r3)
            if (r0 == 0) goto L97
            com.google.android.gms.internal.ads.zzxo r12 = r12.zza
            java.lang.Object r0 = r12.zza
            java.lang.Object r0 = r11.zzL(r0)
            com.google.android.gms.internal.ads.zzxo r1 = r12.zza(r0)
        L97:
            r12 = 1
            r11.zzi = r12
            r11.zzh = r12
            com.google.android.gms.internal.ads.zzxh r12 = r11.zze
            r11.zze(r12)
            if (r1 == 0) goto Lab
            com.google.android.gms.internal.ads.zzxg r12 = r11.zzf
            r12.getClass()
            r12.zzj(r1)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxj.zzF(com.google.android.gms.internal.ads.zzbf):void");
    }

    @Override // com.google.android.gms.internal.ads.zzzt
    @Nullable
    public final zzxo zzG(zzxo zzxoVar) {
        Object objZzs = this.zze.zzs();
        Object obj = zzxoVar.zza;
        if (objZzs != null && this.zze.zzs().equals(obj)) {
            obj = zzxh.zzc;
        }
        return zzxoVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzww, com.google.android.gms.internal.ads.zzwp
    public final void zzd() {
        this.zzh = false;
        this.zzg = false;
        super.zzd();
    }
}

package com.google.android.gms.internal.ads;

import androidx.core.view.C2462i0;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgls {
    private final zzgpx zza;
    private final zzgni zzb;
    private final zzgnz zzc;
    private final zzgrh zzd;
    private final zzgfo zze;
    private final boolean zzf;
    private final long zzg;
    private final long zzh;

    public zzgls(zzgpx zzgpxVar, zzgni zzgniVar, zzgnz zzgnzVar, zzgrh zzgrhVar, zzgfo zzgfoVar, boolean z10, long j10, long j11) {
        this.zza = zzgpxVar;
        this.zzb = zzgniVar;
        this.zzc = zzgnzVar;
        this.zzd = zzgrhVar;
        this.zze = zzgfoVar;
        this.zzf = z10;
        this.zzg = j10;
        this.zzh = j11;
    }

    private final ListenableFuture zzh(final int i10) {
        zzhcq zzhcqVar = (zzhcq) zzhcy.zzg((zzhcq) zzhcy.zzg((zzhcq) zzhcy.zzg((zzhcq) zzhcy.zzk((zzhcq) zzhcy.zzj((zzhcq) zzhcy.zzk(zzhcq.zzw(this.zzb.zza()), new zzgub() { // from class: com.google.android.gms.internal.ads.zzglj
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                zzggr zzggrVar = (zzggr) obj;
                this.zza.zzd(zzggrVar);
                return zzggrVar;
            }
        }, zzhdp.zza()), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzglk
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zze((zzggr) obj);
            }
        }, zzhdp.zza()), zzgll.zza, zzhdp.zza()), zzgle.class, zzglm.zza, zzhdp.zza()), zzglf.class, zzgln.zza, zzhdp.zza()), zzgld.class, new zzgub() { // from class: com.google.android.gms.internal.ads.zzglo
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzf(i10, (zzgld) obj);
            }
        }, zzhdp.zza());
        this.zzd.zze(1002, zzhcqVar);
        return zzhcqVar;
    }

    public final void zza(long j10) {
        if (j10 > 0) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzglq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            }, j10);
        } else {
            zzb();
        }
    }

    public final ListenableFuture zzb() {
        zzhcq zzhcqVar = (zzhcq) zzhcy.zzg(zzhcq.zzw(this.zzc.zzb()), Throwable.class, zzglh.zza, zzhdp.zza());
        final zzgpx zzgpxVar = this.zza;
        Objects.requireNonNull(zzgpxVar);
        return (zzhcq) zzhcy.zzj((zzhcq) zzhcy.zzk(zzhcqVar, new zzgub() { // from class: com.google.android.gms.internal.ads.zzglg
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return new Boolean(zzgpxVar.zza((zzggt) obj));
            }
        }, zzhdp.zza()), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgli
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Boolean) obj);
            }
        }, zzhdp.zza());
    }

    public final /* synthetic */ ListenableFuture zzc(Boolean bool) {
        if (bool.booleanValue()) {
            return zzh(0);
        }
        this.zzd.zzb(C2462i0.f111917f);
        return zzhcy.zza(zzglr.RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID);
    }

    public final /* synthetic */ zzggr zzd(zzggr zzggrVar) {
        int iZzj = zzggrVar.zzj() - 1;
        if (iZzj == 1 || iZzj == 2) {
            return zzggrVar;
        }
        if (iZzj == 3) {
            zzgrh zzgrhVar = this.zzd;
            int iZzj2 = zzggrVar.zzj() - 1;
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj2).length());
            sb2.append(iZzj2);
            zzgrhVar.zzc(1004, sb2.toString());
            throw new zzglf(zzggrVar.zzj() - 1);
        }
        if (iZzj != 12) {
            zzgrh zzgrhVar2 = this.zzd;
            int iZzj3 = zzggrVar.zzj() - 1;
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj3).length());
            sb3.append(iZzj3);
            zzgrhVar2.zzc(1005, sb3.toString());
            throw new zzgle(zzggrVar.zzj() - 1);
        }
        zzgrh zzgrhVar3 = this.zzd;
        int iZzj4 = zzggrVar.zzj() - 1;
        StringBuilder sb4 = new StringBuilder(String.valueOf(iZzj4).length());
        sb4.append(iZzj4);
        zzgrhVar3.zzc(1005, sb4.toString());
        throw new zzgld(zzggrVar.zzj() - 1);
    }

    public final /* synthetic */ ListenableFuture zze(zzggr zzggrVar) {
        if (zzggrVar.zzj() == 2) {
            return this.zzc.zzd(zzggrVar.zza(), zzggrVar.zzb().zzA());
        }
        if (zzggrVar.zzj() == 3) {
            return this.zzc.zzc(zzggrVar.zza(), zzggrVar.zzc().zzA(), zzggrVar.zzb().zzA());
        }
        throw new AssertionError("Unreachable");
    }

    public final /* synthetic */ zzglr zzf(final int i10, zzgld zzgldVar) {
        if (this.zzf && i10 < this.zzg) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzglp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(i10);
                }
            }, this.zzh * ((long) Math.pow(2.0d, i10)));
        }
        return zzglr.RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION;
    }

    public final /* synthetic */ void zzg(int i10) {
        zzh(i10 + 1);
    }
}

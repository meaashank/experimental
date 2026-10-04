package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final class zzgof implements zzgoa {
    private final zzgfw zza;
    private final zzgfw zzb;
    private final zzgfw zzc;
    private final zzgfw zzd;
    private final zzinq zze;
    private final zzinq zzf;
    private final File zzg;
    private final ExecutorService zzh;
    private final zzgrh zzi;

    public zzgof(zzgfw zzgfwVar, zzgfw zzgfwVar2, zzinq zzinqVar, zzgfw zzgfwVar3, zzgfw zzgfwVar4, zzinq zzinqVar2, File file, ExecutorService executorService, zzgrh zzgrhVar) {
        this.zza = zzgfwVar;
        this.zzc = zzgfwVar2;
        this.zze = zzinqVar;
        this.zzb = zzgfwVar3;
        this.zzd = zzgfwVar4;
        this.zzf = zzinqVar2;
        this.zzg = file;
        this.zzh = executorService;
        this.zzi = zzgrhVar;
    }

    private final ListenableFuture zzj(byte[] bArr) {
        ListenableFuture listenableFutureZzc = this.zzd.zzc(bArr);
        this.zzi.zze(15305, listenableFutureZzc);
        return listenableFutureZzc;
    }

    private final ListenableFuture zzk(zzggt zzggtVar) {
        ListenableFuture listenableFutureZzc = this.zzb.zzc(zzggtVar);
        this.zzi.zze(15303, listenableFutureZzc);
        return listenableFutureZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zza() {
        return zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgoe
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new Boolean(this.zza.zzf());
            }
        }, this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureZzb = this.zza.zzb();
        this.zzi.zze(15302, listenableFutureZzb);
        return listenableFutureZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zzc(final zzggt zzggtVar, byte[] bArr, byte[] bArr2) {
        ListenableFuture listenableFutureZzc = ((zzgfw) this.zzf.zzb()).zzc(bArr);
        this.zzi.zze(15307, listenableFutureZzc);
        return (zzhcq) zzhcy.zzj(zzhcq.zzw(zzhcy.zzl(listenableFutureZzc, zzj(bArr2))), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgod
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzi(zzggtVar, (List) obj);
            }
        }, zzhdp.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zzd(final zzggt zzggtVar, byte[] bArr) {
        return (zzhcq) zzhcy.zzj(zzhcq.zzw(zzj(bArr)), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgoc
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzh(zzggtVar, (Void) obj);
            }
        }, zzhdp.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgoa
    public final ListenableFuture zze() {
        zzhcq zzhcqVar = (zzhcq) zzhcy.zzk(zzhcq.zzw(this.zza.zzb()), new zzgub() { // from class: com.google.android.gms.internal.ads.zzgob
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzg((zzggt) obj);
            }
        }, zzhdp.zza());
        this.zzi.zze(15314, zzhcqVar);
        return zzhcqVar;
    }

    public final /* synthetic */ boolean zzf() {
        zzgfw zzgfwVar;
        try {
            zzgfw zzgfwVar2 = this.zzb;
            File fileZza = zzgfwVar2.zza();
            if (!fileZza.exists()) {
                zzgfwVar2.zza().delete();
                ((zzgfw) this.zzf.zzb()).zza().delete();
                this.zzd.zza().delete();
                return false;
            }
            File fileZza2 = ((zzgfw) this.zzf.zzb()).zza();
            File fileZza3 = ((zzgfw) this.zze.zzb()).zza();
            try {
                if (fileZza2.exists()) {
                    File parentFile = fileZza3.getParentFile();
                    if (parentFile != null) {
                        zzfzt.zze(parentFile);
                    }
                    zzhat.zzb(fileZza3);
                    zzhat.zzc(fileZza2, fileZza3);
                }
                File fileZza4 = this.zzd.zza();
                File fileZza5 = this.zzc.zza();
                try {
                    if (fileZza4.exists()) {
                        zzhat.zzb(fileZza5);
                        zzhat.zzc(fileZza4, fileZza5);
                    }
                    File fileZza6 = this.zza.zza();
                    try {
                        if (fileZza.exists()) {
                            zzhat.zzb(fileZza6);
                            zzhat.zzc(fileZza, fileZza6);
                        }
                        this.zzb.zza().delete();
                        ((zzgfw) this.zzf.zzb()).zza().delete();
                        this.zzd.zza().delete();
                        return true;
                    } catch (IOException | SecurityException e10) {
                        this.zzi.zzd(15313, e10);
                        zzgfwVar = this.zzb;
                        zzgfwVar.zza().delete();
                        ((zzgfw) this.zzf.zzb()).zza().delete();
                        this.zzd.zza().delete();
                        return false;
                    }
                } catch (IOException | SecurityException e11) {
                    this.zzi.zzd(15312, e11);
                    zzgfwVar = this.zzb;
                }
            } catch (IOException e12) {
                e = e12;
                this.zzi.zzd(15311, e);
                zzgfwVar = this.zzb;
                zzgfwVar.zza().delete();
                ((zzgfw) this.zzf.zzb()).zza().delete();
                this.zzd.zza().delete();
                return false;
            } catch (SecurityException e13) {
                e = e13;
                this.zzi.zzd(15311, e);
                zzgfwVar = this.zzb;
                zzgfwVar.zza().delete();
                ((zzgfw) this.zzf.zzb()).zza().delete();
                this.zzd.zza().delete();
                return false;
            }
        } catch (Throwable th) {
            this.zzb.zza().delete();
            ((zzgfw) this.zzf.zzb()).zza().delete();
            this.zzd.zza().delete();
            throw th;
        }
    }

    public final /* synthetic */ zzfzr zzg(zzggt zzggtVar) {
        if (zzggtVar == null || zzggtVar.equals(zzggt.zzh())) {
            return null;
        }
        zzber zzberVarZza = zzggtVar.zza();
        File fileZza = ((zzgfw) this.zze.zzb()).zza();
        zzgfw zzgfwVar = this.zzc;
        return new zzfzr(zzberVarZza, fileZza, zzgfwVar.zza(), this.zzg);
    }

    public final /* synthetic */ ListenableFuture zzh(zzggt zzggtVar, Void r22) {
        return zzk(zzggtVar);
    }

    public final /* synthetic */ ListenableFuture zzi(zzggt zzggtVar, List list) {
        return zzk(zzggtVar);
    }
}

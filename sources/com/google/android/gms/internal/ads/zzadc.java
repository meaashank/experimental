package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzadc implements zzafd {
    private final zzaed zza;
    private final zzaee zzb;
    private final zzael zzc;
    private final Queue zzd;
    private final zzadf zze;

    @Nullable
    private Surface zzf;
    private zzv zzg;
    private long zzh;
    private zzafa zzi;
    private Executor zzj;
    private zzaea zzk;

    public zzadc(final zzaed zzaedVar, zzaee zzaeeVar, zzdp zzdpVar) {
        this.zza = zzaedVar;
        this.zzb = zzaeeVar;
        zzaedVar.zzh(zzdpVar);
        zzadf zzadfVar = new zzadf(new zzadd() { // from class: com.google.android.gms.internal.ads.zzacx
            @Override // com.google.android.gms.internal.ads.zzadd
            public final /* synthetic */ void zza(float f10) {
                zzaedVar.zzf(f10);
            }
        });
        this.zze = zzadfVar;
        this.zzc = new zzael(new zzadb(this, null), zzaedVar, zzaeeVar, zzadfVar);
        this.zzd = new ArrayDeque();
        this.zzg = new zzt().zzQ();
        this.zzh = -9223372036854775807L;
        this.zzi = zzafa.zzb;
        this.zzj = zzacu.zza;
        this.zzk = zzacv.zza;
    }

    public final /* synthetic */ Surface zzA() {
        return this.zzf;
    }

    public final /* synthetic */ zzafa zzB() {
        return this.zzi;
    }

    public final /* synthetic */ Executor zzC() {
        return this.zzj;
    }

    public final /* synthetic */ zzaea zzD() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zza() {
        this.zzb.zzd();
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzb() {
        this.zzb.zzd();
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzc(zzafa zzafaVar, Executor executor) {
        this.zzi = zzafaVar;
        this.zzj = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zzd(zzv zzvVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzf() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzg(boolean z10) {
        if (z10) {
            this.zza.zzm();
        }
        this.zzb.zzd();
        this.zzc.zza();
        this.zzd.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zzh(boolean z10) {
        return this.zza.zzj(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzi() {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zzj() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final Surface zzk() {
        Surface surface = this.zzf;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzl(zzaea zzaeaVar) {
        this.zzk = zzaeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzm(float f10) {
        this.zza.zzo(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzn(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzo(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzp(Surface surface, zzev zzevVar) {
        this.zzf = surface;
        this.zza.zze(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzq() {
        this.zzf = null;
        this.zza.zze(null);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzr(int i10) {
        this.zza.zzn(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzs(int i10, zzv zzvVar, long j10, int i11, List list) {
        zzguk.zzi(list.isEmpty());
        int i12 = zzvVar.zzw;
        zzv zzvVar2 = this.zzg;
        if (i12 != zzvVar2.zzw || zzvVar.zzx != zzvVar2.zzx) {
            this.zzc.zzc(i12, zzvVar.zzx);
        }
        float f10 = zzvVar.zzA;
        if (f10 != this.zzg.zzA) {
            this.zze.zza(f10);
        }
        this.zzg = zzvVar;
        if (j10 != this.zzh) {
            this.zzc.zzd(i11, j10);
            this.zzh = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzt() {
        this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final boolean zzu(long j10, zzafb zzafbVar) {
        this.zzd.add(zzafbVar);
        this.zzc.zze(j10);
        this.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzy();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzv(long j10, long j11) throws zzafc {
        try {
            this.zzc.zzb(j10, j11);
        } catch (zzjn e10) {
            throw new zzafc(e10, this.zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzw(boolean z10) {
        this.zza.zzk(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzafd
    public final void zzx() {
    }

    public final /* synthetic */ void zzy() {
        this.zzi.zza();
    }

    public final /* synthetic */ Queue zzz() {
        return this.zzd;
    }
}

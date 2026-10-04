package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import e.InterfaceC4326A;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzja implements zzne, zzng {
    private final int zzb;

    @Nullable
    private zznh zzd;
    private int zze;
    private zzqj zzf;
    private zzdp zzg;
    private int zzh;

    @Nullable
    private zzzg zzi;

    @Nullable
    private zzv[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;

    @Nullable
    private zzxo zzq;

    @Nullable
    @InterfaceC4326A("lock")
    private zznf zzs;
    private final Object zza = new Object();
    private final zzma zzc = new zzma();
    private long zzm = Long.MIN_VALUE;
    private zzbf zzp = zzbf.zza;
    private long zzr = -9223372036854775807L;

    public zzja(int i10) {
        this.zzb = i10;
    }

    private final void zzaf(long j10, boolean z10, boolean z11) throws zzjn {
        this.zzn = false;
        this.zzl = j10;
        this.zzm = j10;
        if (!z11) {
            z11 = zzS(j10) != 0;
        }
        zzA(j10, z10, z11);
    }

    private final void zzag() {
        zzxo zzxoVar;
        int iZze;
        if (this.zzp.zzg() || (zzxoVar = this.zzq) == null || (iZze = this.zzp.zze(zzxoVar.zza)) == -1) {
            this.zzr = -9223372036854775807L;
            return;
        }
        zzbd zzbdVarZzd = this.zzp.zzd(iZze, new zzbd(), false);
        this.zzr = zzbdVarZzd.zzd;
        int i10 = zzxoVar.zzb;
        if (i10 != -1) {
            this.zzr = zzbdVarZzd.zzg.zza(i10).zzf[zzxoVar.zzc];
            return;
        }
        int i11 = zzxoVar.zze;
        if (i11 != -1) {
            long j10 = zzbdVarZzd.zzg.zza(i11).zza;
            this.zzr = 0L;
        }
    }

    public void zzA(long j10, boolean z10, boolean z11) throws zzjn {
        throw null;
    }

    public void zzB() throws zzjn {
    }

    public void zzC() {
    }

    public void zzD() {
        throw null;
    }

    public void zzE() {
    }

    public void zzF() {
    }

    public void zzG(zzbf zzbfVar) {
    }

    public final long zzH() {
        return this.zzl;
    }

    public final zzma zzI() {
        zzma zzmaVar = this.zzc;
        zzmaVar.zza = null;
        zzmaVar.zzb = null;
        return zzmaVar;
    }

    public final zzv[] zzJ() {
        zzv[] zzvVarArr = this.zzj;
        zzvVarArr.getClass();
        return zzvVarArr;
    }

    public final zznh zzK() {
        zznh zznhVar = this.zzd;
        zznhVar.getClass();
        return zznhVar;
    }

    public final zzqj zzL() {
        zzqj zzqjVar = this.zzf;
        zzqjVar.getClass();
        return zzqjVar;
    }

    public final zzdp zzM() {
        zzdp zzdpVar = this.zzg;
        zzdpVar.getClass();
        return zzdpVar;
    }

    public final zzbf zzN() {
        return this.zzp;
    }

    @Nullable
    public final zzxo zzO() {
        return this.zzq;
    }

    public final long zzP() {
        return this.zzr;
    }

    public final zzjn zzQ(Throwable th, @Nullable zzv zzvVar, boolean z10, int i10) {
        int iZzae = 4;
        if (zzvVar != null && !this.zzo) {
            this.zzo = true;
            try {
                iZzae = zzae(zzvVar) & 7;
            } catch (zzjn unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzjn.zzb(th, zzV(), this.zze, zzvVar, iZzae, this.zzq, z10, i10);
    }

    public final int zzR(zzma zzmaVar, zziy zziyVar, int i10) {
        zzzg zzzgVar = this.zzi;
        zzzgVar.getClass();
        int iZzc = zzzgVar.zzc(zzmaVar, zziyVar, i10);
        if (iZzc == -4) {
            int i11 = i10 & 1;
            if (zziyVar.zzb()) {
                if (i11 == 0) {
                    this.zzm = Long.MIN_VALUE;
                }
                return this.zzn ? -4 : -3;
            }
            long j10 = zziyVar.zzd + this.zzk;
            zziyVar.zzd = j10;
            if (i11 == 0) {
                this.zzm = Math.max(this.zzm, j10);
                return -4;
            }
        } else if (iZzc == -5) {
            zzv zzvVar = zzmaVar.zzb;
            zzvVar.getClass();
            long j11 = zzvVar.zzu;
            if (j11 != Long.MAX_VALUE) {
                zzt zztVarZza = zzvVar.zza();
                zztVarZza.zzt(j11 + this.zzk);
                zzmaVar.zzb = zztVarZza.zzQ();
                return -5;
            }
        }
        return iZzc;
    }

    public final int zzS(long j10) {
        zzzg zzzgVar = this.zzi;
        zzzgVar.getClass();
        return zzzgVar.zzd(j10 - this.zzk);
    }

    public final boolean zzT() {
        if (zzcW()) {
            return this.zzn;
        }
        zzzg zzzgVar = this.zzi;
        zzzgVar.getClass();
        return zzzgVar.zza();
    }

    public final void zzU() {
        zznf zznfVar;
        synchronized (this.zza) {
            zznfVar = this.zzs;
        }
        if (zznfVar != null) {
            zznfVar.zza(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public /* synthetic */ long zzW(long j10, long j11) {
        return C3351t1.a(this, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public /* synthetic */ boolean zzX(long j10) {
        return C3351t1.b(this, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public /* synthetic */ void zzY(float f10, float f11) throws zzjn {
        C3351t1.c(this, f10, f11);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public /* synthetic */ void zzZ() {
        C3351t1.d(this);
    }

    @Override // com.google.android.gms.internal.ads.zzne, com.google.android.gms.internal.ads.zzng
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final zzng zzb() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzc(int i10, zzqj zzqjVar, zzdp zzdpVar) {
        this.zze = i10;
        this.zzf = zzqjVar;
        this.zzg = zzdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzcT() throws zzjn {
        zzguk.zzi(this.zzh == 1);
        this.zzh = 2;
        zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzcU(zzv[] zzvVarArr, zzzg zzzgVar, long j10, long j11, zzxo zzxoVar) throws zzjn {
        zzguk.zzi(!this.zzn);
        this.zzi = zzzgVar;
        this.zzq = zzxoVar;
        zzag();
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j10;
        }
        this.zzj = zzvVarArr;
        this.zzk = j11;
        zzz(zzvVarArr, j10, j11, zzxoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    @Nullable
    public final zzzg zzcV() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final boolean zzcW() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    @Nullable
    public zzmf zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final int zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzf(zznh zznhVar, zzv[] zzvVarArr, zzzg zzzgVar, long j10, boolean z10, boolean z11, long j11, long j12, zzxo zzxoVar) throws zzjn {
        zzguk.zzi(this.zzh == 0);
        this.zzd = zznhVar;
        this.zzq = zzxoVar;
        this.zzh = 1;
        zzy(z10, z11);
        zzcU(zzvVarArr, zzzgVar, j11, j12, zzxoVar);
        zzaf(j11, z10, true);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final long zzk() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzl() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final boolean zzm() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzn() throws IOException {
        zzzg zzzgVar = this.zzi;
        zzzgVar.getClass();
        zzzgVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzo(zzbf zzbfVar) {
        if (Objects.equals(this.zzp, zzbfVar)) {
            return;
        }
        this.zzp = zzbfVar;
        zzag();
        zzG(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzp(long j10, boolean z10) throws zzjn {
        zzaf(j10, false, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzq() {
        zzguk.zzi(this.zzh == 2);
        this.zzh = 1;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzr() {
        zzguk.zzi(this.zzh == 1);
        zzma zzmaVar = this.zzc;
        zzmaVar.zza = null;
        zzmaVar.zzb = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzD();
        this.zzq = null;
        this.zzr = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzs() {
        zzguk.zzi(this.zzh == 0);
        zzma zzmaVar = this.zzc;
        zzmaVar.zza = null;
        zzmaVar.zzb = null;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzt() {
        zzguk.zzi(this.zzh == 0);
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public int zzu() throws zzjn {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzv(zznf zznfVar) {
        synchronized (this.zza) {
            this.zzs = zznfVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzw() {
        synchronized (this.zza) {
            this.zzs = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public void zzx(int i10, @Nullable Object obj) throws zzjn {
    }

    public void zzy(boolean z10, boolean z11) throws zzjn {
    }

    public void zzz(zzv[] zzvVarArr, long j10, long j11, zzxo zzxoVar) throws zzjn {
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import e.InterfaceC4348w;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcv implements zzcp {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzcl zze;
    private zzcl zzf;
    private zzcl zzg;
    private zzcl zzh;
    private boolean zzi;

    @Nullable
    private zzcu zzj;
    private ByteBuffer zzk;
    private ByteBuffer zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;

    public zzcv() {
        zzcl zzclVar = zzcl.zza;
        this.zze = zzclVar;
        this.zzf = zzclVar;
        this.zzg = zzclVar;
        this.zzh = zzclVar;
        ByteBuffer byteBuffer = zzcp.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long zza(long j10) {
        if (this.zzn < 1024) {
            return (long) (j10 / ((double) this.zzc));
        }
        long j11 = this.zzm;
        zzcu zzcuVar = this.zzj;
        zzcuVar.getClass();
        long jZza = j11 - ((long) zzcuVar.zza());
        int i10 = this.zzh.zzb;
        int i11 = this.zzg.zzb;
        return i10 == i11 ? zzfm.zzw(j10, this.zzn, jZza, RoundingMode.DOWN) : zzfm.zzw(j10, this.zzn * ((long) i11), jZza * ((long) i10), RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzb(zzcl zzclVar) throws zzco {
        int i10 = zzclVar.zzd;
        if (i10 != 2 && i10 != 4) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        int i11 = this.zzb;
        if (i11 == -1) {
            i11 = zzclVar.zzb;
        }
        this.zze = zzclVar;
        zzcl zzclVar2 = new zzcl(i11, zzclVar.zzc, i10);
        this.zzf = zzclVar2;
        this.zzi = true;
        return zzclVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzc() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzd(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzcu zzcuVar = this.zzj;
            zzcuVar.getClass();
            this.zzm += (long) byteBuffer.remaining();
            zzcuVar.zzb(byteBuffer);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zze() {
        zzcu zzcuVar = this.zzj;
        if (zzcuVar != null) {
            zzcuVar.zzd();
        }
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final ByteBuffer zzf() {
        int iZzf;
        zzcu zzcuVar = this.zzj;
        if (zzcuVar != null && (iZzf = zzcuVar.zzf()) > 0) {
            if (this.zzk.capacity() < iZzf) {
                this.zzk = ByteBuffer.allocateDirect(iZzf).order(ByteOrder.nativeOrder());
            } else {
                this.zzk.clear();
            }
            zzcuVar.zzc(this.zzk);
            this.zzk.flip();
            this.zzn += (long) iZzf;
            this.zzl = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzl;
        this.zzl = zzcp.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean zzg() {
        if (!this.zzo) {
            return false;
        }
        zzcu zzcuVar = this.zzj;
        return zzcuVar == null || zzcuVar.zzf() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public /* synthetic */ void zzh() {
        C3354u0.b(this);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzi(zzcn zzcnVar) {
        if (zzc()) {
            zzcl zzclVar = this.zze;
            this.zzg = zzclVar;
            zzcl zzclVar2 = this.zzf;
            this.zzh = zzclVar2;
            if (this.zzi) {
                this.zzj = new zzcu(zzclVar.zzb, zzclVar.zzc, this.zzc, this.zzd, zzclVar2.zzb, zzclVar.zzd == 4);
            } else {
                zzcu zzcuVar = this.zzj;
                if (zzcuVar != null) {
                    zzcuVar.zze();
                }
            }
        }
        this.zzl = zzcp.zza;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzj() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzcl zzclVar = zzcl.zza;
        this.zze = zzclVar;
        this.zzf = zzclVar;
        this.zzg = zzclVar;
        this.zzh = zzclVar;
        ByteBuffer byteBuffer = zzcp.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = false;
    }

    public final void zzk(@InterfaceC4348w(from = 0.0d, fromInclusive = false) float f10) {
        zzguk.zza(f10 > 0.0f);
        if (this.zzc != f10) {
            this.zzc = f10;
            this.zzi = true;
        }
    }

    public final void zzl(@InterfaceC4348w(from = 0.0d, fromInclusive = false) float f10) {
        zzguk.zza(f10 > 0.0f);
        if (this.zzd != f10) {
            this.zzd = f10;
            this.zzi = true;
        }
    }

    public final long zzm(long j10) {
        if (this.zzn < 1024) {
            return (long) (((double) this.zzc) * j10);
        }
        long j11 = this.zzm;
        zzcu zzcuVar = this.zzj;
        zzcuVar.getClass();
        long jZza = j11 - ((long) zzcuVar.zza());
        int i10 = this.zzh.zzb;
        int i11 = this.zzg.zzb;
        return i10 == i11 ? zzfm.zzw(j10, jZza, this.zzn, RoundingMode.DOWN) : zzfm.zzw(j10, jZza * ((long) i10), this.zzn * ((long) i11), RoundingMode.DOWN);
    }
}

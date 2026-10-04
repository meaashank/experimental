package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzwm implements zzvp {
    private final MediaCodec zza;

    @Nullable
    private final zzvl zzb;

    public /* synthetic */ zzwm(MediaCodec mediaCodec, zzvl zzvlVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = zzvlVar;
        if (Build.VERSION.SDK_INT < 35 || zzvlVar == null) {
            return;
        }
        zzvlVar.zzb(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zza(int i10, int i11, int i12, long j10, int i13) {
        this.zza.queueInputBuffer(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzb(int i10, int i11, zziv zzivVar, long j10, int i12) {
        this.zza.queueSecureInputBuffer(i10, 0, zzivVar.zzb(), j10, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzc(int i10, boolean z10) {
        this.zza.releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzd(int i10, long j10) {
        this.zza.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final int zze() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final MediaFormat zzg() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    @Nullable
    public final ByteBuffer zzh(int i10) {
        return this.zza.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public /* synthetic */ void zzi(Runnable runnable) {
        t3.a(this, runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    @Nullable
    public final ByteBuffer zzj(int i10) {
        return this.zza.getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzk() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzl() {
        zzvl zzvlVar;
        zzvl zzvlVar2;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && i10 < 33) {
                this.zza.stop();
            }
            if (i10 >= 35 && (zzvlVar2 = this.zzb) != null) {
                zzvlVar2.zzc(this.zza);
            }
            this.zza.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (zzvlVar = this.zzb) != null) {
                zzvlVar.zzc(this.zza);
            }
            this.zza.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public /* synthetic */ boolean zzm(zzvo zzvoVar) {
        return t3.b(this, zzvoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzn(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    @e.T(35)
    public final void zzo() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final void zzq(int i10) {
        this.zza.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    @e.T(31)
    public final void zzr(List list) {
        this.zza.subscribeToVendorParameters(list);
    }
}

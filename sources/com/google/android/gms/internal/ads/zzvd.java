package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import e.InterfaceC4326A;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class zzvd implements zzvq {

    @InterfaceC4326A("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf = new AtomicReference();
    private final zzdt zzg;
    private boolean zzh;

    @e.f0
    public zzvd(MediaCodec mediaCodec, HandlerThread handlerThread, zzdt zzdtVar, boolean z10) {
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdtVar;
    }

    private static zzvc zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new zzvc();
                }
                return (zzvc) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    private static int[] zzj(@Nullable int[] iArr, @Nullable int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    @Nullable
    private static byte[] zzk(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zza() {
        if (this.zzh) {
            return;
        }
        HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new zzvb(this, handlerThread.getLooper());
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzb(int i10, int i11, int i12, long j10, int i13) {
        zzg();
        zzvc zzvcVarZzi = zzi();
        zzvcVarZzi.zza(i10, 0, i12, j10, i13);
        Handler handler = this.zze;
        String str = zzfm.zza;
        handler.obtainMessage(1, zzvcVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzc(int i10, int i11, zziv zzivVar, long j10, int i12) {
        zzg();
        zzvc zzvcVarZzi = zzi();
        zzvcVarZzi.zza(i10, 0, 0, j10, i12);
        MediaCodec.CryptoInfo cryptoInfo = zzvcVarZzi.zzd;
        cryptoInfo.numSubSamples = zzivVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzivVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzivVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzk = zzk(zzivVar.zzb, cryptoInfo.key);
        bArrZzk.getClass();
        cryptoInfo.key = bArrZzk;
        byte[] bArrZzk2 = zzk(zzivVar.zza, cryptoInfo.iv);
        bArrZzk2.getClass();
        cryptoInfo.iv = bArrZzk2;
        cryptoInfo.mode = zzivVar.zzc;
        if (Build.VERSION.SDK_INT >= 24) {
            o3.a();
            cryptoInfo.setPattern(com.google.android.exoplayer2.decoder.c.a(zzivVar.zzg, zzivVar.zzh));
        }
        Handler handler = this.zze;
        String str = zzfm.zza;
        handler.obtainMessage(2, zzvcVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzd(Bundle bundle) {
        zzg();
        Handler handler = this.zze;
        String str = zzfm.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zze() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                zzdt zzdtVar = this.zzg;
                zzdtVar.zzb();
                Handler handler2 = this.zze;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                zzdtVar.zzc();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzf() {
        if (this.zzh) {
            zze();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zzh(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L68
            r1 = 2
            if (r0 == r1) goto L38
            r1 = 3
            if (r0 == r1) goto L32
            r1 = 4
            if (r0 == r1) goto L20
            java.util.concurrent.atomic.AtomicReference r0 = r10.zzf
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r1.<init>(r11)
            androidx.compose.animation.core.C1598m0.a(r0, r2, r1)
            goto L82
        L20:
            java.lang.Object r11 = r11.obj
            android.os.Bundle r11 = (android.os.Bundle) r11
            android.media.MediaCodec r0 = r10.zzc     // Catch: java.lang.RuntimeException -> L2a
            r0.setParameters(r11)     // Catch: java.lang.RuntimeException -> L2a
            goto L82
        L2a:
            r0 = move-exception
            r11 = r0
            java.util.concurrent.atomic.AtomicReference r0 = r10.zzf
            androidx.compose.animation.core.C1598m0.a(r0, r2, r11)
            goto L82
        L32:
            com.google.android.gms.internal.ads.zzdt r11 = r10.zzg
            r11.zza()
            goto L82
        L38:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.zzvc r11 = (com.google.android.gms.internal.ads.zzvc) r11
            int r4 = r11.zza
            android.media.MediaCodec$CryptoInfo r6 = r11.zzd
            long r7 = r11.zze
            int r9 = r11.zzf
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.RuntimeException -> L51
            r1 = 31
            if (r0 < r1) goto L53
            android.media.MediaCodec r3 = r10.zzc     // Catch: java.lang.RuntimeException -> L51
            r5 = 0
            r3.queueSecureInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.RuntimeException -> L51
            goto L66
        L51:
            r0 = move-exception
            goto L61
        L53:
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzvd.zzb     // Catch: java.lang.RuntimeException -> L51
            monitor-enter(r1)     // Catch: java.lang.RuntimeException -> L51
            android.media.MediaCodec r3 = r10.zzc     // Catch: java.lang.Throwable -> L5e
            r5 = 0
            r3.queueSecureInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5e
            goto L66
        L5e:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5e
            throw r0     // Catch: java.lang.RuntimeException -> L51
        L61:
            java.util.concurrent.atomic.AtomicReference r1 = r10.zzf
            androidx.compose.animation.core.C1598m0.a(r1, r2, r0)
        L66:
            r2 = r11
            goto L82
        L68:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.zzvc r11 = (com.google.android.gms.internal.ads.zzvc) r11
            int r4 = r11.zza
            int r6 = r11.zzc
            long r7 = r11.zze
            int r9 = r11.zzf
            android.media.MediaCodec r3 = r10.zzc     // Catch: java.lang.RuntimeException -> L7b
            r5 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.RuntimeException -> L7b
            goto L66
        L7b:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r1 = r10.zzf
            androidx.compose.animation.core.C1598m0.a(r1, r2, r0)
            goto L66
        L82:
            if (r2 == 0) goto L8f
            java.util.ArrayDeque r11 = com.google.android.gms.internal.ads.zzvd.zza
            monitor-enter(r11)
            r11.add(r2)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L8c
            goto L8f
        L8c:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L8c
            throw r0
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvd.zzh(android.os.Message):void");
    }
}

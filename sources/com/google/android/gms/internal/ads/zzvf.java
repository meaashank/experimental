package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import e.InterfaceC4326A;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
final class zzvf extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;

    @Nullable
    @InterfaceC4326A("lock")
    private MediaFormat zzh;

    @Nullable
    @InterfaceC4326A("lock")
    private MediaFormat zzi;

    @Nullable
    @InterfaceC4326A("lock")
    private MediaCodec.CodecException zzj;

    @Nullable
    @InterfaceC4326A("lock")
    private MediaCodec.CryptoException zzk;

    @InterfaceC4326A("lock")
    private long zzl;

    @InterfaceC4326A("lock")
    private boolean zzm;

    @Nullable
    @InterfaceC4326A("lock")
    private IllegalStateException zzn;

    @Nullable
    @InterfaceC4326A("lock")
    private zzvo zzo;
    private final Object zza = new Object();

    @InterfaceC4326A("lock")
    private final zzdo zzd = new zzdo();

    @InterfaceC4326A("lock")
    private final zzdo zze = new zzdo();

    @InterfaceC4326A("lock")
    private final ArrayDeque zzf = new ArrayDeque();

    @InterfaceC4326A("lock")
    private final ArrayDeque zzg = new ArrayDeque();

    public zzvf(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    @InterfaceC4326A("lock")
    private final void zzj() {
        ArrayDeque arrayDeque = this.zzg;
        if (!arrayDeque.isEmpty()) {
            this.zzi = (MediaFormat) arrayDeque.getLast();
        }
        this.zzd.zzc();
        this.zze.zzc();
        this.zzf.clear();
        arrayDeque.clear();
    }

    @InterfaceC4326A("lock")
    private final boolean zzk() {
        return this.zzl > 0 || this.zzm;
    }

    @InterfaceC4326A("lock")
    private final void zzl(MediaFormat mediaFormat) {
        this.zze.zza(-2);
        this.zzg.add(mediaFormat);
    }

    @InterfaceC4326A("lock")
    private final void zzm() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException != null) {
            this.zzn = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException != null) {
            this.zzj = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.zzk;
        if (cryptoException == null) {
            return;
        }
        this.zzk = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.zza) {
            try {
                this.zzd.zza(i10);
                zzvo zzvoVar = this.zzo;
                if (zzvoVar != null) {
                    zzvz zzvzVar = ((zzvx) zzvoVar).zza;
                    if (zzvzVar.zzbn() != null) {
                        zzvzVar.zzbn().zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                MediaFormat mediaFormat = this.zzi;
                if (mediaFormat != null) {
                    zzl(mediaFormat);
                    this.zzi = null;
                }
                this.zze.zza(i10);
                this.zzf.add(bufferInfo);
                zzvo zzvoVar = this.zzo;
                if (zzvoVar != null) {
                    zzvz zzvzVar = ((zzvx) zzvoVar).zza;
                    if (zzvzVar.zzbn() != null) {
                        zzvzVar.zzbn().zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzl(mediaFormat);
            this.zzi = null;
        }
    }

    public final void zza(MediaCodec mediaCodec) {
        zzguk.zzi(this.zzc == null);
        HandlerThread handlerThread = this.zzb;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzb() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzj();
        }
    }

    public final void zzc(Runnable runnable) {
        synchronized (this.zza) {
            zzm();
            runnable.run();
        }
    }

    public final int zzd() {
        synchronized (this.zza) {
            try {
                zzm();
                int iZzb = -1;
                if (zzk()) {
                    return -1;
                }
                zzdo zzdoVar = this.zzd;
                if (!zzdoVar.zzd()) {
                    iZzb = zzdoVar.zzb();
                }
                return iZzb;
            } finally {
            }
        }
    }

    public final int zze(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                zzm();
                if (zzk()) {
                    return -1;
                }
                zzdo zzdoVar = this.zze;
                if (zzdoVar.zzd()) {
                    return -1;
                }
                int iZzb = zzdoVar.zzb();
                if (iZzb >= 0) {
                    if (this.zzh == null) {
                        throw null;
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iZzb == -2) {
                    this.zzh = (MediaFormat) this.zzg.remove();
                    iZzb = -2;
                }
                return iZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final MediaFormat zzf() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            try {
                mediaFormat = this.zzh;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void zzg() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            String str = zzfm.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzve
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzi();
                }
            });
        }
    }

    public final void zzh(zzvo zzvoVar) {
        synchronized (this.zza) {
            this.zzo = zzvoVar;
        }
    }

    public final /* synthetic */ void zzi() {
        Object obj = this.zza;
        synchronized (obj) {
            try {
                if (this.zzm) {
                    return;
                }
                long j10 = this.zzl - 1;
                this.zzl = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 >= 0) {
                    zzj();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (obj) {
                    this.zzn = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzado extends HandlerThread implements Handler.Callback {
    private zzdw zza;
    private Handler zzb;

    @Nullable
    private Error zzc;

    @Nullable
    private RuntimeException zzd;

    @Nullable
    private zzadp zze;

    public zzado() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        zzdw zzdwVar;
        int i10 = message.what;
        try {
            if (i10 == 1) {
                try {
                    try {
                        int i11 = message.arg1;
                        zzdw zzdwVar2 = this.zza;
                        if (zzdwVar2 == null) {
                            throw null;
                        }
                        zzdwVar2.zza(i11);
                        this.zze = new zzadp(this, this.zza.zzc(), i11 != 0, null);
                        synchronized (this) {
                            notify();
                        }
                    } catch (zzdx e10) {
                        zzeh.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                        this.zzd = new IllegalStateException(e10);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (Error e11) {
                    zzeh.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.zzc = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    zzeh.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.zzd = e12;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i10 == 2) {
                try {
                    zzdwVar = this.zza;
                } finally {
                    try {
                    } finally {
                    }
                }
                if (zzdwVar == null) {
                    throw null;
                }
                zzdwVar.zzb();
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzadp zza(int i10) {
        boolean z10;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzdw(handler, null);
        synchronized (this) {
            z10 = false;
            this.zzb.obtainMessage(1, i10, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzadp zzadpVar = this.zze;
        zzadpVar.getClass();
        return zzadpVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}

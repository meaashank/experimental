package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
final class zzfr {
    private final Context zza;
    private PowerManager.WakeLock zzb;

    public zzfr(Context context) {
        this.zza = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WakelockTimeout"})
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzb(boolean z10, boolean z11) {
        if (z10) {
            if (this.zzb == null) {
                Context context = this.zza;
                if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    zzeh.zzc("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) context.getSystemService(Y7.a.f79330e);
                if (powerManager == null) {
                    zzeh.zzc("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.zzb = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
        }
        PowerManager.WakeLock wakeLock = this.zzb;
        if (wakeLock == null) {
            return;
        }
        if (zzfs.zzh(z10, z11)) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final synchronized void zza(AtomicBoolean atomicBoolean) {
        PowerManager.WakeLock wakeLock;
        if (!atomicBoolean.get() || (wakeLock = this.zzb) == null) {
            return;
        }
        wakeLock.release();
    }
}

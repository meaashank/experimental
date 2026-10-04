package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcha implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzchj zzb;

    public zzcha(zzchj zzchjVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        Objects.requireNonNull(zzchjVar);
        this.zzb = zzchjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzchj zzchjVar = this.zzb;
        zzchjVar.zzs(this.zza);
        if (zzchjVar.zzt() != null) {
            zzchjVar.zzt().zzb();
        }
    }
}

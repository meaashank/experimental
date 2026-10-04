package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcjo implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ zzcjs zzj;

    public zzcjo(zzcjs zzcjsVar, String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = j10;
        this.zzf = j11;
        this.zzg = z10;
        this.zzh = i12;
        this.zzi = i13;
        Objects.requireNonNull(zzcjsVar);
        this.zzj = zzcjsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapA = com.bytedance.sdk.openadsdk.activity.b.a(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        mapA.put("src", this.zza);
        mapA.put("cachedSrc", this.zzb);
        mapA.put("bytesLoaded", Integer.toString(this.zzc));
        mapA.put("totalBytes", Integer.toString(this.zzd));
        mapA.put("bufferedDuration", Long.toString(this.zze));
        mapA.put("totalDuration", Long.toString(this.zzf));
        mapA.put("cacheReady", true != this.zzg ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
        mapA.put("playerCount", Integer.toString(this.zzh));
        mapA.put("playerPreparedCount", Integer.toString(this.zzi));
        this.zzj.zzw("onPrecacheEvent", mapA);
    }
}

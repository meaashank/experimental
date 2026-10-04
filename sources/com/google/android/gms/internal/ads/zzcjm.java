package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcjm implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzcjs zze;

    public zzcjm(zzcjs zzcjsVar, String str, String str2, int i10, int i11, boolean z10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
        Objects.requireNonNull(zzcjsVar);
        this.zze = zzcjsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapA = com.bytedance.sdk.openadsdk.activity.b.a(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        mapA.put("src", this.zza);
        mapA.put("cachedSrc", this.zzb);
        mapA.put("bytesLoaded", Integer.toString(this.zzc));
        mapA.put("totalBytes", Integer.toString(this.zzd));
        mapA.put("cacheReady", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        this.zze.zzw("onPrecacheEvent", mapA);
    }
}

package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Bundle;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzfba implements Callable {
    static final /* synthetic */ zzfba zza = new zzfba();

    private /* synthetic */ zzfba() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        Bundle bundle = new Bundle();
        Runtime runtime = Runtime.getRuntime();
        bundle.putLong("runtime_free", runtime.freeMemory());
        bundle.putLong("runtime_max", runtime.maxMemory());
        bundle.putLong("runtime_total", runtime.totalMemory());
        bundle.putInt("web_view_count", com.google.android.gms.ads.internal.zzt.zzh().zzm());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzqg)).booleanValue()) {
            ActivityManager.MemoryInfo memoryInfoZzx = com.google.android.gms.ads.internal.zzt.zzh().zzx();
            if (memoryInfoZzx != null) {
                if (PlatformVersion.isAtLeastU()) {
                    bundle.putLong("a_ad_mem", memoryInfoZzx.advertisedMem);
                }
                bundle.putLong("a_total", memoryInfoZzx.totalMem);
                bundle.putLong("a_avai", memoryInfoZzx.availMem);
                bundle.putLong("a_threshold", memoryInfoZzx.threshold);
                bundle.putBoolean("a_is_low_mem", memoryInfoZzx.lowMemory);
            }
            bundle.putLong("runtime_avai_processors", runtime.availableProcessors());
        }
        return new zzfbc(bundle);
    }
}

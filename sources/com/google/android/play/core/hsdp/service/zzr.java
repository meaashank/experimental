package com.google.android.play.core.hsdp.service;

import android.os.IBinder;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
interface zzr {
    void zza();

    void zzb(String str);

    void zzc(String str);

    void zzd(List list, HsdpDeepLinkService.HsdpPrewarmListener hsdpPrewarmListener);

    void zze(String str, String str2, IBinder iBinder, int i10, int i11, boolean z10, HsdpDeepLinkService.HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener);

    boolean zzf();

    boolean zzg(String str);
}

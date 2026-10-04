package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import android.util.Log;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzaz implements HsdpDeepLinkService.HsdpDeepLinkServiceListener {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Map zzc;
    final /* synthetic */ HsdpShimActivity zzd;

    public zzaz(HsdpShimActivity hsdpShimActivity, String str, String str2, Map map) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = map;
        Objects.requireNonNull(hsdpShimActivity);
        this.zzd = hsdpShimActivity;
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onAffordanceEnded() {
        throw new UnsupportedOperationException("not supported when to call HSDP service from shim activity");
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onAffordanceStarted() {
        throw new UnsupportedOperationException("not supported when to call HSDP service from shim activity");
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onDeepLinkStarted() {
        throw new UnsupportedOperationException("not supported when to call HSDP service from shim activity");
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onDismissed(Bundle bundle) {
        if (Log.isLoggable("HsdpShimActivity", 4)) {
            Log.i("HsdpShimActivity", "HSDP service based UI dismissed. hasBeenShown=" + this.zzd.zzb);
        }
        boolean z10 = bundle.getBoolean("dldpRedirect", false);
        HsdpShimActivity hsdpShimActivity = this.zzd;
        if (!hsdpShimActivity.zzb && !z10) {
            Log.i("HsdpShimActivity", "Ignore dismiss before shown (likely temporary reuse cleanup)");
            return;
        }
        Log.i("HsdpShimActivity", "Finish the shim activity.");
        hsdpShimActivity.zza = null;
        hsdpShimActivity.finish();
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onError(Bundle bundle) {
        Log.e("HsdpShimActivity", "HSDP service based UI error: " + String.valueOf(bundle) + ". Finish the shim activity.");
        String str = this.zza;
        String str2 = this.zzb;
        Map map = this.zzc;
        HsdpShimActivity hsdpShimActivity = this.zzd;
        hsdpShimActivity.startActivityForResult(zzq.zza(str, str2, map), 0);
        hsdpShimActivity.zza = null;
        hsdpShimActivity.zzb = false;
        hsdpShimActivity.finish();
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onShown(Bundle bundle) {
        Log.i("HsdpShimActivity", "HSDP service based UI shown");
        this.zzd.zzb = true;
    }
}

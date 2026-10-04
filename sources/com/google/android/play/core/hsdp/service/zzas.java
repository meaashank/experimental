package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;

/* JADX INFO: loaded from: classes4.dex */
class zzas implements HsdpDeepLinkService.HsdpDeepLinkServiceListener {
    private final HsdpDeepLinkService.HsdpDeepLinkServiceListener zza;

    public zzas(HsdpDeepLinkService.HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener) {
        this.zza = hsdpDeepLinkServiceListener;
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public void onAffordanceEnded() {
        this.zza.onAffordanceEnded();
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public void onAffordanceStarted() {
        this.zza.onAffordanceStarted();
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public void onDeepLinkStarted() {
        this.zza.onDeepLinkStarted();
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public void onDismissed(Bundle bundle) {
        this.zza.onDismissed(bundle);
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public void onError(Bundle bundle) {
        this.zza.onError(bundle);
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public void onShown(Bundle bundle) {
        this.zza.onShown(bundle);
    }
}

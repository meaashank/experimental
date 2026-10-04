package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzaa extends zzag {
    final /* synthetic */ HsdpDeepLinkService.HsdpPrewarmListener zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaa(zzai zzaiVar, HsdpDeepLinkService.HsdpPrewarmListener hsdpPrewarmListener) {
        super(zzaiVar, null);
        this.zza = hsdpPrewarmListener;
        Objects.requireNonNull(zzaiVar);
    }

    @Override // com.google.android.play.core.hsdp.service.zzag
    public final void zzd() {
        this.zza.onCompleted(new Bundle());
    }

    @Override // com.google.android.play.core.hsdp.service.zzag
    public final void zze(int i10, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("errorCode", i10);
        bundle.putString("errorMessage", str);
        this.zza.onError(bundle);
    }
}

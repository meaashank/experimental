package com.google.android.gms.ads.internal.client.hsdp;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zza implements HsdpDeepLinkService.HsdpPrewarmListener {
    final /* synthetic */ IHsdpPrewarmServiceCallback zza;

    public zza(HsdpDeepLinkServiceWrapper hsdpDeepLinkServiceWrapper, IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback) {
        this.zza = iHsdpPrewarmServiceCallback;
        Objects.requireNonNull(hsdpDeepLinkServiceWrapper);
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpPrewarmListener
    public final void onCompleted(Bundle bundle) {
        IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback = this.zza;
        if (iHsdpPrewarmServiceCallback != null) {
            try {
                iHsdpPrewarmServiceCallback.onPrewarmCompleted(bundle);
            } catch (RemoteException e10) {
                zzo.zzg("RemoteException in HsdpPrewarmListener.onCompleted", e10);
            }
        }
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpPrewarmListener
    public final void onError(Bundle bundle) {
        IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback = this.zza;
        if (iHsdpPrewarmServiceCallback != null) {
            try {
                iHsdpPrewarmServiceCallback.onError(bundle);
            } catch (RemoteException e10) {
                zzo.zzg("RemoteException in HsdpPrewarmListener.onError", e10);
            }
        }
    }
}

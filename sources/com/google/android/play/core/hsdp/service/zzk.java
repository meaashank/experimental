package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzk extends zzn {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ IBinder zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ int zze;
    final /* synthetic */ HsdpDeepLinkService.HsdpDeepLinkServiceListener zzf;
    final /* synthetic */ Map zzg;
    final /* synthetic */ zzp zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzp zzpVar, String str, String str2, IBinder iBinder, int i10, int i11, HsdpDeepLinkService.HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener, Map map) {
        super(null);
        this.zza = str;
        this.zzb = str2;
        this.zzc = iBinder;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = hsdpDeepLinkServiceListener;
        this.zzg = map;
        Objects.requireNonNull(zzpVar);
        this.zzh = zzpVar;
    }

    @Override // com.google.android.play.core.hsdp.service.zzn
    public final void zzc() {
        Log.i("HpoaClientImpl", "HPOA UI attached");
        this.zzf.onAffordanceStarted();
    }

    @Override // com.google.android.play.core.hsdp.service.zzn
    public final void zzd() {
        zzp.zzd(this.zzh, this.zza, this.zzb, this.zzg);
    }

    @Override // com.google.android.play.core.hsdp.service.zzn
    public final void zze() {
        Log.i("HpoaClientImpl", "HPOA UI detached");
        this.zzf.onAffordanceEnded();
    }

    @Override // com.google.android.play.core.hsdp.service.zzn
    public final void zzf(int i10) {
        Log.e("HpoaClientImpl", "HPOA error: " + i10);
        Bundle bundle = new Bundle();
        if (i10 == 9278) {
            bundle.putString("errorMessage", "HPOA internal error");
        } else if (i10 == 9279) {
            bundle.putString("errorMessage", "HPOA authentication error");
        } else if (i10 == 9280) {
            bundle.putString("errorMessage", "HPOA invalid parameter");
        } else {
            bundle.putString("errorMessage", "HPOA unknown error");
        }
        this.zzf.onError(bundle);
        this.zzh.zza();
    }

    @Override // com.google.android.play.core.hsdp.service.zzn
    public final void zzg() {
        Log.i("HpoaClientImpl", "HPOA service requests to be disconnected");
        final zzp zzpVar = this.zzh;
        zzbc zzbcVar = zzpVar.zza;
        if (zzbcVar == null) {
            Log.e("HpoaClientImpl", "HPOA service is not available");
            return;
        }
        String str = this.zzb;
        String str2 = this.zza;
        final Bundle bundle = new Bundle();
        bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, str2);
        bundle.putString("callerId", str);
        zzbcVar.zzd(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzj
            @Override // java.lang.Runnable
            public final void run() {
                zzp zzpVar2 = zzpVar;
                Bundle bundle2 = bundle;
                try {
                    zzbc zzbcVar2 = zzpVar2.zza;
                    if (zzbcVar2 == null) {
                        throw null;
                    }
                    com.google.android.play.core.hsdp.protocol.zzc zzcVar = (com.google.android.play.core.hsdp.protocol.zzc) zzbcVar2.zzb();
                    if (zzcVar == null) {
                        return;
                    }
                    zzcVar.zzc(bundle2);
                } catch (RemoteException e10) {
                    Log.e("HpoaClientImpl", "Failed to call hpoaService.endSession", e10);
                }
            }
        });
    }

    @Override // com.google.android.play.core.hsdp.service.zzn
    public final void zzh() {
        Log.i("HpoaClientImpl", "HPOA session ended");
        this.zzh.zza();
    }

    @Override // com.google.android.play.core.hsdp.service.zzn
    public final void zzi() {
        Log.i("HpoaClientImpl", "HPOA session started");
        final zzp zzpVar = this.zzh;
        zzbc zzbcVar = zzpVar.zza;
        if (zzbcVar == null) {
            Log.e("HpoaClientImpl", "HPOA service is not available");
            return;
        }
        int i10 = this.zze;
        int i11 = this.zzd;
        IBinder iBinder = this.zzc;
        String str = this.zzb;
        String str2 = this.zza;
        final Bundle bundle = new Bundle();
        bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, str2);
        bundle.putString("callerId", str);
        bundle.putBinder("windowToken", iBinder);
        bundle.putInt("clientWindowWidthPx", i11);
        bundle.putInt("clientWindowHeightPx", i10);
        zzbcVar.zzd(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzi
            @Override // java.lang.Runnable
            public final void run() {
                zzp zzpVar2 = zzpVar;
                Bundle bundle2 = bundle;
                try {
                    zzbc zzbcVar2 = zzpVar2.zza;
                    if (zzbcVar2 == null) {
                        throw null;
                    }
                    com.google.android.play.core.hsdp.protocol.zzc zzcVar = (com.google.android.play.core.hsdp.protocol.zzc) zzbcVar2.zzb();
                    if (zzcVar == null) {
                        return;
                    }
                    zzcVar.zze(bundle2);
                } catch (RemoteException e10) {
                    Log.e("HpoaClientImpl", "Failed to call hpoaService.show", e10);
                }
            }
        });
    }

    @Override // com.google.android.play.core.hsdp.service.zzn
    public final void zzj() {
        Log.i("HpoaClientImpl", "HPOA UI to be added");
    }

    @Override // com.google.android.play.core.hsdp.service.zzn
    public final void zzk() {
        Log.i("HpoaClientImpl", "HPOA UI to be removed");
    }
}

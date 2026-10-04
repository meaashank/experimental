package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzp implements zze {
    final zzbc zza;
    private final Activity zzb;

    public zzp(Intent intent, Activity activity) {
        this.zzb = activity;
        if (com.google.android.gms.internal.playcore_hsdp.zzf.zza(activity)) {
            this.zza = new zzbn(activity.getApplicationContext(), "HpoaService", intent, new zzba() { // from class: com.google.android.play.core.hsdp.service.zzg
                @Override // com.google.android.play.core.hsdp.service.zzba
                public final Object zza(IBinder iBinder) {
                    return com.google.android.play.core.hsdp.protocol.zzb.zzb(iBinder);
                }
            });
        } else {
            this.zza = null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzd(zzp zzpVar, String str, String str2, Map map) {
        Activity activity = zzpVar.zzb;
        Intent intentZzb = zzq.zzb(str, str2, activity.getPackageName(), map);
        intentZzb.addFlags(536870912);
        if (activity.getPackageManager().resolveActivity(intentZzb, 65536) != null) {
            activity.startActivityForResult(intentZzb, 0);
        } else {
            activity.startActivity(zzq.zza(str, str2, map));
        }
    }

    @Override // com.google.android.play.core.hsdp.service.zze
    public final void zza() {
        zzbc zzbcVar = this.zza;
        if (zzbcVar != null) {
            zzbcVar.zze();
        }
    }

    @Override // com.google.android.play.core.hsdp.service.zze
    public final void zzb(String str, int i10, int i11, HsdpDeepLinkService.HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener, Map map) {
        Activity activity = this.zzb;
        String packageName = activity.getPackageName();
        IBinder windowToken = activity.getWindow().getDecorView().getWindowToken();
        if (windowToken == null) {
            throw new IllegalStateException("Window token is null, cannot open HPOA service.");
        }
        final zzk zzkVar = new zzk(this, str, packageName, windowToken, i10, i11, hsdpDeepLinkServiceListener, map);
        zzbc zzbcVar = this.zza;
        if (zzbcVar == null) {
            Log.e("HpoaClientImpl", "HPOA service is not available");
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, str);
        bundle.putString("callerId", packageName);
        bundle.putBinder("windowToken", windowToken);
        zzbcVar.zzd(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzh
            @Override // java.lang.Runnable
            public final void run() {
                Bundle bundle2 = bundle;
                zzp zzpVar = this.zza;
                com.google.android.play.core.hsdp.protocol.zzd zzdVar = zzkVar;
                try {
                    zzbc zzbcVar2 = zzpVar.zza;
                    if (zzbcVar2 == null) {
                        throw null;
                    }
                    com.google.android.play.core.hsdp.protocol.zzc zzcVar = (com.google.android.play.core.hsdp.protocol.zzc) zzbcVar2.zzb();
                    if (zzcVar == null) {
                        return;
                    }
                    zzcVar.zzf(bundle2, zzdVar);
                } catch (RemoteException e10) {
                    Log.e("HpoaClientImpl", "Failed to call hpoaService.startSession", e10);
                }
            }
        });
    }

    @Override // com.google.android.play.core.hsdp.service.zze
    public final void zzc(String str, HsdpDeepLinkService.AffordanceListener affordanceListener) {
        String packageName = this.zzb.getPackageName();
        final zzl zzlVar = new zzl(this, affordanceListener);
        zzbc zzbcVar = this.zza;
        if (zzbcVar == null) {
            Log.e("HpoaClientImpl", "HPOA service is not available");
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putString("callerId", packageName);
        bundle.putString(RemoteConfigConstants.RequestFieldKey.APP_ID, str);
        zzbcVar.zzd(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzf
            @Override // java.lang.Runnable
            public final void run() {
                Bundle bundle2 = bundle;
                zzp zzpVar = this.zza;
                com.google.android.play.core.hsdp.protocol.zzd zzdVar = zzlVar;
                try {
                    zzbc zzbcVar2 = zzpVar.zza;
                    if (zzbcVar2 == null) {
                        throw null;
                    }
                    com.google.android.play.core.hsdp.protocol.zzc zzcVar = (com.google.android.play.core.hsdp.protocol.zzc) zzbcVar2.zzb();
                    if (zzcVar == null) {
                        return;
                    }
                    zzcVar.zzd(bundle2, zzdVar);
                } catch (RemoteException e10) {
                    Log.e("HpoaClientImpl", "Failed to call hpoaService.endSessionWithCallback", e10);
                }
            }
        });
    }
}

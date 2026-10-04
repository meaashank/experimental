package com.google.android.play.core.hsdp.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.play.core.hsdp.protocol.PrewarmRequest;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
final class zzai implements zzr, zzbb {
    private final Context zza;
    private final zzbc zzb;
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private zzaf zzd;

    public zzai(Intent intent, Context context) {
        this.zza = context;
        if (!com.google.android.gms.internal.playcore_hsdp.zzf.zza(context)) {
            throw new IllegalStateException("HSDP service is not available.");
        }
        this.zzb = new zzbn(context.getApplicationContext(), "HsdpService", intent, new zzba() { // from class: com.google.android.play.core.hsdp.service.zzv
            @Override // com.google.android.play.core.hsdp.service.zzba
            public final Object zza(IBinder iBinder) {
                return com.google.android.play.core.hsdp.protocol.zzg.zzb(iBinder);
            }
        });
    }

    public static /* synthetic */ void zzi(zzai zzaiVar) {
        Iterator it = zzaiVar.zzc.values().iterator();
        while (it.hasNext()) {
            ((zzay) it.next()).zzd(4);
            it.remove();
        }
        Log.d("HsdpClientImpl", "HSDP overlays: empty");
    }

    public static /* synthetic */ void zzm(zzai zzaiVar, String str, int i10, Runnable runnable) {
        zzay zzayVar = (zzay) zzaiVar.zzc.get(str);
        if (zzayVar == null || !zzayVar.zzd(i10) || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final Handler zzs() {
        return this.zzb.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ void zzt(String str, Bundle bundle) {
        try {
            com.google.android.play.core.hsdp.protocol.zzh zzhVar = (com.google.android.play.core.hsdp.protocol.zzh) this.zzb.zzb();
            if (zzhVar == null) {
                return;
            }
            zzhVar.zzc(this.zza.getPackageName(), str, bundle, this.zzd);
        } catch (DeadObjectException e10) {
            Log.e("HsdpClientImpl", "hsdpService is dead", e10);
        } catch (RemoteException e11) {
            Log.e("HsdpClientImpl", "Failed to call hsdpService.dismiss", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ void zzu(Bundle bundle) {
        try {
            com.google.android.play.core.hsdp.protocol.zzh zzhVar = (com.google.android.play.core.hsdp.protocol.zzh) this.zzb.zzb();
            if (zzhVar == null) {
                return;
            }
            zzhVar.zzd(bundle, this.zzd);
        } catch (DeadObjectException e10) {
            Log.e("HsdpClientImpl", "hsdpService is dead", e10);
        } catch (RemoteException e11) {
            Log.e("HsdpClientImpl", "Failed to call hsdpService.endSession", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ void zzv(List list, HsdpDeepLinkService.HsdpPrewarmListener hsdpPrewarmListener) {
        try {
            com.google.android.play.core.hsdp.protocol.zzh zzhVar = (com.google.android.play.core.hsdp.protocol.zzh) this.zzb.zzb();
            if (zzhVar == null) {
                return;
            }
            String packageName = this.zza.getPackageName();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HsdpPrewarmRequest hsdpPrewarmRequest = (HsdpPrewarmRequest) it.next();
                arrayList.add(new PrewarmRequest(hsdpPrewarmRequest.targetAppPackageName(), zzq.zzc(hsdpPrewarmRequest.targetAppPackageName(), hsdpPrewarmRequest.referrer(), hsdpPrewarmRequest.extraQueryParams()).toString(), hsdpPrewarmRequest.windowToken(), null));
            }
            zzhVar.zze(packageName, arrayList, new zzaa(this, hsdpPrewarmListener));
        } catch (DeadObjectException e10) {
            Log.e("HsdpClientImpl", "hsdpService is dead", e10);
        } catch (RemoteException e11) {
            Log.e("HsdpClientImpl", "Failed to call hsdpService.prewarm", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ void zzw(String str, String str2, Bundle bundle) {
        try {
            com.google.android.play.core.hsdp.protocol.zzh zzhVar = (com.google.android.play.core.hsdp.protocol.zzh) this.zzb.zzb();
            if (zzhVar == null) {
                return;
            }
            zzhVar.zzf(this.zza.getPackageName(), str, str2, bundle, this.zzd);
        } catch (DeadObjectException e10) {
            Log.e("HsdpClientImpl", "hsdpService is dead", e10);
        } catch (RemoteException e11) {
            Log.e("HsdpClientImpl", "Failed to call hsdpService.show", e11);
        }
    }

    @Override // com.google.android.play.core.hsdp.service.zzr
    public final void zza() {
        this.zzb.zze();
    }

    @Override // com.google.android.play.core.hsdp.service.zzr
    public final void zzb(final String str) {
        if (((zzay) this.zzc.get(str)) == null) {
            Log.w("HsdpClientImpl", "No active overlay for target package: " + str + ". Please call show() first.");
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putString(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, HsdpDeepLinkService.SDK_VERSION);
        bundle.putLong("requestTimestampMs", SystemClock.elapsedRealtime());
        this.zzb.zzd(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzt(str, bundle);
            }
        });
    }

    @Override // com.google.android.play.core.hsdp.service.zzr
    public final void zzc(String str) {
        if (((zzay) this.zzc.get(str)) == null) {
            Log.w("HsdpClientImpl", "No active overlay for target package: " + str + ". Please call show() first.");
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putString("callingPackage", this.zza.getPackageName());
        bundle.putString("targetPackage", str);
        bundle.putString(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, HsdpDeepLinkService.SDK_VERSION);
        bundle.putLong("requestTimestampMs", SystemClock.elapsedRealtime());
        this.zzb.zzd(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzu(bundle);
            }
        });
    }

    @Override // com.google.android.play.core.hsdp.service.zzr
    public final void zzd(final List list, final HsdpDeepLinkService.HsdpPrewarmListener hsdpPrewarmListener) {
        this.zzb.zzd(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzy
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzv(list, hsdpPrewarmListener);
            }
        });
    }

    @Override // com.google.android.play.core.hsdp.service.zzr
    public final void zze(final String str, final String str2, IBinder iBinder, int i10, int i11, boolean z10, HsdpDeepLinkService.HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener) {
        zzay zzayVar = (zzay) this.zzc.putIfAbsent(str, new zzay(str, hsdpDeepLinkServiceListener));
        if (zzayVar != null) {
            zzayVar.zzb(hsdpDeepLinkServiceListener);
        }
        final Bundle bundle = new Bundle();
        bundle.putBinder("windowToken", iBinder);
        bundle.putInt("clientWindowWidthPx", i10);
        bundle.putInt("clientWindowHeightPx", i11);
        bundle.putString(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, HsdpDeepLinkService.SDK_VERSION);
        bundle.putLong("requestTimestampMs", SystemClock.elapsedRealtime());
        bundle.putBoolean("autoTrigger", z10);
        this.zzb.zzd(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzw(str, str2, bundle);
            }
        });
    }

    @Override // com.google.android.play.core.hsdp.service.zzr
    public final boolean zzf() {
        com.google.android.play.core.hsdp.protocol.zzh zzhVar = (com.google.android.play.core.hsdp.protocol.zzh) this.zzb.zzb();
        return zzhVar != null && zzhVar.asBinder().isBinderAlive();
    }

    @Override // com.google.android.play.core.hsdp.service.zzr
    public final boolean zzg(String str) {
        zzay zzayVar = (zzay) this.zzc.get(str);
        return zzayVar != null && zzayVar.zzc();
    }

    public final void zzp() {
        this.zzd = new zzae(this);
        this.zzb.zzc(this);
    }

    @Override // com.google.android.play.core.hsdp.service.zzbb
    public final void zzq() {
        Log.i("HsdpClientImpl", "HSDP bound service connected");
    }

    @Override // com.google.android.play.core.hsdp.service.zzbb
    public final void zzr() {
        Log.i("HsdpClientImpl", "HSDP bound service disconnected");
        zzs().post(new Runnable() { // from class: com.google.android.play.core.hsdp.service.zzz
            @Override // java.lang.Runnable
            public final void run() {
                zzai.zzi(this.zza);
            }
        });
    }
}

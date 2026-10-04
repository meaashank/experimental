package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdrw implements View.OnClickListener {

    @Nullable
    @e.f0
    String zza;

    @Nullable
    @e.f0
    Long zzb;

    @Nullable
    @e.f0
    WeakReference zzc;
    private final zzdvv zzd;
    private final Clock zze;

    @Nullable
    private zzboj zzf;

    @Nullable
    private zzbqh zzg;

    public zzdrw(zzdvv zzdvvVar, Clock clock) {
        this.zzd = zzdvvVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap map = new HashMap();
            map.put("id", this.zza);
            map.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.zzd.zzf("sendMessageToNativeJs", map);
        }
        zzd();
    }

    public final void zza(final zzboj zzbojVar) {
        this.zzf = zzbojVar;
        zzbqh zzbqhVar = this.zzg;
        if (zzbqhVar != null) {
            this.zzd.zze("/unconfirmedClick", zzbqhVar);
        }
        zzbqh zzbqhVar2 = new zzbqh() { // from class: com.google.android.gms.internal.ads.zzdrv
            @Override // com.google.android.gms.internal.ads.zzbqh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdrw zzdrwVar = this.zza;
                try {
                    zzdrwVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzboj zzbojVar2 = zzbojVar;
                zzdrwVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbojVar2 == null) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Received unconfirmed click but UnconfirmedClickListener is null.");
                } else {
                    try {
                        zzbojVar2.zze(str);
                    } catch (RemoteException e10) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                    }
                }
            }
        };
        this.zzg = zzbqhVar2;
        this.zzd.zzd("/unconfirmedClick", zzbqhVar2);
    }

    @Nullable
    public final zzboj zzb() {
        return this.zzf;
    }

    public final void zzc() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zzf();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }
}

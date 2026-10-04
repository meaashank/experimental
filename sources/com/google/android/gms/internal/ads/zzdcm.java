package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdcm extends IHsdpPrewarmServiceCallback.Stub {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzdcn zzc;

    public zzdcm(zzdcn zzdcnVar, String str, long j10) {
        this.zza = str;
        this.zzb = j10;
        Objects.requireNonNull(zzdcnVar);
        this.zzc = zzdcnVar;
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback
    public final void onError(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoE)).booleanValue()) {
            this.zzc.zzd(this.zza, this.zzb, MBridgeConstans.ENDCARD_URL_TYPE_PL, bundle);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback
    public final void onPrewarmCompleted(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoE)).booleanValue()) {
            this.zzc.zzd(this.zza, this.zzb, "1", bundle);
        }
    }
}

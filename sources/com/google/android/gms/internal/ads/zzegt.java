package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzegt extends zzeha {
    private final Context zzg;
    private final Executor zzh;

    public zzegt(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzcax(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        this.zzf.zzp().zze(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoM)).booleanValue() ? new zzegz(this.zza, this.zze) : new zzegy(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzehp(1));
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "RemoteAdRequestClientTask.onConnected");
                        this.zza.zzd(new zzehp(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeha, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzehp(1));
    }

    public final ListenableFuture zza(zzcbv zzcbvVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return this.zza;
                }
                this.zzc = true;
                this.zze = zzcbvVar;
                this.zzf.checkAvailabilityAndConnect();
                zzcgo zzcgoVar = this.zza;
                zzcgoVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegs
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb();
                    }
                }, zzcgj.zzh);
                zzeha.zzc(this.zzg, zzcgoVar, this.zzh);
                return zzcgoVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbhz implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbhr zza;
    final /* synthetic */ zzcgo zzb;
    final /* synthetic */ zzbib zzc;

    public zzbhz(zzbib zzbibVar, zzbhr zzbhrVar, zzcgo zzcgoVar) {
        this.zza = zzbhrVar;
        this.zzb = zzcgoVar;
        Objects.requireNonNull(zzbibVar);
        this.zzc = zzbibVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        zzbib zzbibVar = this.zzc;
        synchronized (zzbibVar.zzf()) {
            try {
                if (zzbibVar.zzd()) {
                    return;
                }
                zzbibVar.zze(true);
                final zzbhq zzbhqVarZzc = zzbibVar.zzc();
                if (zzbhqVarZzc == null) {
                    return;
                }
                zzhdi zzhdiVar = zzcgj.zza;
                final zzbhr zzbhrVar = this.zza;
                final zzcgo zzcgoVar = this.zzb;
                final ListenableFuture listenableFutureZza = zzhdiVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhy
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcgo zzcgoVar2 = zzcgoVar;
                        zzbhq zzbhqVar = zzbhqVarZzc;
                        zzbhz zzbhzVar = this.zza;
                        try {
                            zzbht zzbhtVarZzq = zzbhqVar.zzq();
                            boolean zZzp = zzbhqVar.zzp();
                            zzbhr zzbhrVar2 = zzbhrVar;
                            zzbho zzbhoVarZzf = zZzp ? zzbhtVarZzq.zzf(zzbhrVar2) : zzbhtVarZzq.zze(zzbhrVar2);
                            if (!zzbhoVarZzf.zza()) {
                                zzcgoVar2.zzd(new RuntimeException("No entry contents."));
                                zzbhzVar.zzc.zzb();
                                return;
                            }
                            zzbhw zzbhwVar = new zzbhw(zzbhzVar, zzbhoVarZzf.zzb(), 1);
                            int i10 = zzbhwVar.read();
                            if (i10 == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            zzbhwVar.unread(i10);
                            zzcgoVar2.zzc(zzbid.zza(zzbhwVar, zzbhoVarZzf.zzd(), zzbhoVarZzf.zzg(), zzbhoVarZzf.zzf(), zzbhoVarZzf.zze()));
                        } catch (RemoteException e10) {
                            e = e10;
                            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                            zzcgoVar2.zzd(e);
                            zzbhzVar.zzc.zzb();
                        } catch (IOException e11) {
                            e = e11;
                            int i112 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                            zzcgoVar2.zzd(e);
                            zzbhzVar.zzc.zzb();
                        }
                    }
                });
                zzcgoVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhx
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        if (zzcgoVar.isCancelled()) {
                            listenableFutureZza.cancel(true);
                        }
                    }
                }, zzcgj.zzh);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
    }
}

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbij {
    final /* synthetic */ zzbik zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzbij(zzbik zzbikVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzbikVar);
        this.zza = zzbikVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        try {
            zzbik zzbikVar = this.zza;
            if (zzbikVar.zzb) {
                zzbikVar.zza.zzh(this.zzb);
                zzbikVar.zza.zzi(0);
                zzbikVar.zza.zzj(this.zzc);
                zzbikVar.zza.zzg(null);
                zzbikVar.zza.zzf();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Clearcut log failed", e10);
        }
    }

    public final synchronized void zza() {
        this.zza.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbii
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    public final zzbij zzb(int i10) {
        this.zzc = i10;
        return this;
    }
}

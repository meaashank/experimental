package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgad {
    final /* synthetic */ zzgae zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzgad(zzgae zzgaeVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzgaeVar);
        this.zza = zzgaeVar;
        this.zzb = bArr;
    }

    public final synchronized void zza() {
        try {
            zzgae zzgaeVar = this.zza;
            if (zzgaeVar.zzb) {
                zzgah zzgahVar = zzgaeVar.zza;
                zzgahVar.zzg(this.zzb);
                zzgahVar.zzh(this.zzc);
                zzgahVar.zzi(this.zzd);
                zzgahVar.zzf(null);
                zzgahVar.zze();
            }
        } catch (RemoteException e10) {
            Log.d("GASS", "Clearcut log failed", e10);
        }
    }

    public final zzgad zzb(int i10) {
        this.zzc = i10;
        return this;
    }

    public final zzgad zzc(int i10) {
        this.zzd = i10;
        return this;
    }
}

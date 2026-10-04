package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbwy extends zzbvz {
    private final Adapter zza;
    private final zzccs zzb;

    public zzbwy(Adapter adapter, zzccs zzccsVar) {
        this.zza = adapter;
        this.zzb = zzccsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zze() throws RemoteException {
        zzccs zzccsVar = this.zzb;
        if (zzccsVar != null) {
            zzccsVar.zzl(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzf() throws RemoteException {
        zzccs zzccsVar = this.zzb;
        if (zzccsVar != null) {
            zzccsVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzg(int i10) throws RemoteException {
        zzccs zzccsVar = this.zzb;
        if (zzccsVar != null) {
            zzccsVar.zzm(ObjectWrapper.wrap(this.zza), i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzh() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzi() throws RemoteException {
        zzccs zzccsVar = this.zzb;
        if (zzccsVar != null) {
            zzccsVar.zzh(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzj() throws RemoteException {
        zzccs zzccsVar = this.zzb;
        if (zzccsVar != null) {
            zzccsVar.zzg(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzk() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzl(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzm(zzbnm zzbnmVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzo() throws RemoteException {
        zzccs zzccsVar = this.zzb;
        if (zzccsVar != null) {
            zzccsVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzp(@Nullable zzcct zzcctVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzq() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzr(zzccx zzccxVar) throws RemoteException {
        zzccs zzccsVar = this.zzb;
        if (zzccsVar != null) {
            zzccsVar.zzk(ObjectWrapper.wrap(this.zza), new zzcct(zzccxVar.zze(), zzccxVar.zzf()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzs(int i10) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzt() throws RemoteException {
        zzccs zzccsVar = this.zzb;
        if (zzccsVar != null) {
            zzccsVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzu() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzv(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzw(int i10, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzz() throws RemoteException {
        zzccs zzccsVar = this.zzb;
        if (zzccsVar != null) {
            zzccsVar.zzp(ObjectWrapper.wrap(this.zza));
        }
    }
}

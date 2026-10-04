package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeof extends zzbvz implements zzdez {
    private zzbwa zza;
    private zzdey zzb;

    @Override // com.google.android.gms.internal.ads.zzdez
    public final synchronized void zza(zzdey zzdeyVar) {
        this.zzb = zzdeyVar;
    }

    public final synchronized void zzb(zzbwa zzbwaVar) {
        this.zza = zzbwaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zze() throws RemoteException {
        zzbwa zzbwaVar = this.zza;
        if (zzbwaVar != null) {
            zzbwaVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzf() throws RemoteException {
        zzbwa zzbwaVar = this.zza;
        if (zzbwaVar != null) {
            zzbwaVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzg(int i10) throws RemoteException {
        zzdey zzdeyVar = this.zzb;
        if (zzdeyVar != null) {
            zzdeyVar.zzb(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzh() throws RemoteException {
        zzbwa zzbwaVar = this.zza;
        if (zzbwaVar != null) {
            zzbwaVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzi() throws RemoteException {
        zzbwa zzbwaVar = this.zza;
        if (zzbwaVar != null) {
            zzbwaVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzj() throws RemoteException {
        try {
            zzbwa zzbwaVar = this.zza;
            if (zzbwaVar != null) {
                zzbwaVar.zzj();
            }
            zzdey zzdeyVar = this.zzb;
            if (zzdeyVar != null) {
                zzdeyVar.zza();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzk() throws RemoteException {
        zzbwa zzbwaVar = this.zza;
        if (zzbwaVar != null) {
            zzbwaVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzl(String str, String str2) throws RemoteException {
        zzbwa zzbwaVar = this.zza;
        if (zzbwaVar != null) {
            zzbwaVar.zzl(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzm(zzbnm zzbnmVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzn() throws RemoteException {
        zzbwa zzbwaVar = this.zza;
        if (zzbwaVar != null) {
            zzbwaVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzo() throws RemoteException {
        zzbwa zzbwaVar = this.zza;
        if (zzbwaVar != null) {
            zzbwaVar.zzo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzp(zzcct zzcctVar) throws RemoteException {
        zzbwa zzbwaVar = this.zza;
        if (zzbwaVar != null) {
            zzbwaVar.zzp(zzcctVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzq() throws RemoteException {
        zzbwa zzbwaVar = this.zza;
        if (zzbwaVar != null) {
            zzbwaVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzr(zzccx zzccxVar) throws RemoteException {
        zzbwa zzbwaVar = this.zza;
        if (zzbwaVar != null) {
            zzbwaVar.zzr(zzccxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzs(int i10) throws RemoteException {
        zzbwa zzbwaVar = this.zza;
        if (zzbwaVar != null) {
            zzbwaVar.zzs(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzt() throws RemoteException {
        zzbwa zzbwaVar = this.zza;
        if (zzbwaVar != null) {
            zzbwaVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzu() throws RemoteException {
        zzbwa zzbwaVar = this.zza;
        if (zzbwaVar != null) {
            zzbwaVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzv(String str) throws RemoteException {
        zzbwa zzbwaVar = this.zza;
        if (zzbwaVar != null) {
            zzbwaVar.zzv(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzw(int i10, String str) throws RemoteException {
        zzdey zzdeyVar = this.zzb;
        if (zzdeyVar != null) {
            zzdeyVar.zzc(i10, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdey zzdeyVar = this.zzb;
        if (zzdeyVar != null) {
            zzdeyVar.zzd(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzbwa zzbwaVar = this.zza;
        if (zzbwaVar != null) {
            zzbwaVar.zzy(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzz() throws RemoteException {
        zzbwa zzbwaVar = this.zza;
        if (zzbwaVar != null) {
            zzbwaVar.zzz();
        }
    }
}

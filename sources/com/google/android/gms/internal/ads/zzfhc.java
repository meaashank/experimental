package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfhc implements zzdds, zzdfo, zzfir, com.google.android.gms.ads.internal.overlay.zzr, zzdgg, zzdef, zzdlw {
    private final zzfnh zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    @Nullable
    private zzfhc zzi = null;

    public zzfhc(zzfnh zzfnhVar) {
        this.zza = zzfnhVar;
    }

    public static zzfhc zzn(zzfhc zzfhcVar) {
        zzfhc zzfhcVar2 = new zzfhc(zzfhcVar.zza);
        zzfhcVar2.zzi = zzfhcVar;
        return zzfhcVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdJ(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfhc zzfhcVar = this.zzi;
        if (zzfhcVar != null) {
            zzfhcVar.zzdJ(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.zzb;
        zzfij.zza(atomicReference, new zzfii() { // from class: com.google.android.gms.internal.ads.zzfgr
            @Override // com.google.android.gms.internal.ads.zzfii
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbhc) obj).zzc(zzeVar);
            }
        });
        zzfij.zza(atomicReference, new zzfii() { // from class: com.google.android.gms.internal.ads.zzfgs
            @Override // com.google.android.gms.internal.ads.zzfii
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbhc) obj).zzb(zzeVar.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void zzdT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
        zzfhc zzfhcVar = this.zzi;
        if (zzfhcVar != null) {
            zzfhcVar.zzdV();
        } else {
            zzfij.zza(this.zzf, zzfgn.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW(final int i10) {
        zzfhc zzfhcVar = this.zzi;
        if (zzfhcVar != null) {
            zzfhcVar.zzdW(i10);
        } else {
            zzfij.zza(this.zzf, new zzfii() { // from class: com.google.android.gms.internal.ads.zzfgt
                @Override // com.google.android.gms.internal.ads.zzfii
                public final /* synthetic */ void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdW(i10);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void zzdu() {
        zzfhc zzfhcVar = this.zzi;
        if (zzfhcVar != null) {
            zzfhcVar.zzdu();
        } else {
            zzfij.zza(this.zzd, zzfgz.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzfhc zzfhcVar = this.zzi;
        if (zzfhcVar != null) {
            zzfhcVar.zzdv();
        } else {
            zzfij.zza(this.zzf, zzfgo.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzfhc zzfhcVar = this.zzi;
        if (zzfhcVar != null) {
            zzfhcVar.zzh();
            return;
        }
        zzfij.zza(this.zzf, zzfgp.zza);
        AtomicReference atomicReference = this.zzd;
        zzfij.zza(atomicReference, zzfgx.zza);
        zzfij.zza(atomicReference, zzfgy.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfhc zzfhcVar = this.zzi;
        if (zzfhcVar != null) {
            zzfhcVar.zzj(zzeVar);
        } else {
            zzfij.zza(this.zzd, new zzfii() { // from class: com.google.android.gms.internal.ads.zzfgu
                @Override // com.google.android.gms.internal.ads.zzfii
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((zzbhg) obj).zzd(zzeVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfo
    public final void zzl() {
        zzfhc zzfhcVar = this.zzi;
        if (zzfhcVar != null) {
            zzfhcVar.zzl();
        } else {
            zzfij.zza(this.zze, zzfgm.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfhc zzfhcVar = this.zzi;
        if (zzfhcVar != null) {
            zzfhcVar.zzm(zztVar);
        } else {
            zzfij.zza(this.zzg, new zzfii() { // from class: com.google.android.gms.internal.ads.zzfgv
                @Override // com.google.android.gms.internal.ads.zzfii
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(zztVar);
                }
            });
        }
    }

    public final void zzo(zzbhc zzbhcVar) {
        this.zzb.set(zzbhcVar);
    }

    public final void zzp(zzbhg zzbhgVar) {
        this.zzd.set(zzbhgVar);
    }

    public final void zzq(com.google.android.gms.ads.internal.overlay.zzr zzrVar) {
        this.zzf.set(zzrVar);
    }

    public final void zzr(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzg.set(zzdqVar);
    }

    public final void zzs(zzfua zzfuaVar) {
        this.zzh.set(zzfuaVar);
    }

    public final void zzt(final zzbgz zzbgzVar) {
        zzfhc zzfhcVar = this.zzi;
        if (zzfhcVar != null) {
            zzfhcVar.zzt(zzbgzVar);
        } else {
            zzfij.zza(this.zzb, new zzfii() { // from class: com.google.android.gms.internal.ads.zzfgq
                @Override // com.google.android.gms.internal.ads.zzfii
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((zzbhc) obj).zza(zzbgzVar);
                }
            });
        }
    }

    public final void zzu() {
        zzfhc zzfhcVar = this.zzi;
        if (zzfhcVar != null) {
            zzfhcVar.zzu();
            return;
        }
        this.zza.zzb();
        zzfij.zza(this.zzc, zzfgw.zza);
        zzfij.zza(this.zzd, zzfha.zza);
        zzfij.zza(this.zzh, zzfhb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final void zzv(zzfir zzfirVar) {
        this.zzi = (zzfhc) zzfirVar;
    }
}

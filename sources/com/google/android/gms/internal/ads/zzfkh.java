package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfkh implements OnAdMetadataChangedListener, zzdfd, zzdds, zzddp, zzdef, zzdgg, zzfir, zzdlw {
    private final zzfnh zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private final AtomicReference zzi = new AtomicReference();
    private zzfkh zzj = null;

    public zzfkh(zzfnh zzfnhVar) {
        this.zza = zzfnhVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzfkh zzfkhVar = this.zzj;
        if (zzfkhVar != null) {
            zzfkhVar.onAdMetadataChanged();
        } else {
            zzfij.zza(this.zzb, zzfkg.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzd(final zzcch zzcchVar, final String str, final String str2) {
        zzfkh zzfkhVar = this.zzj;
        if (zzfkhVar != null) {
            zzfkhVar.zzd(zzcchVar, str, str2);
            return;
        }
        zzfij.zza(this.zzd, new zzfii() { // from class: com.google.android.gms.internal.ads.zzfjm
            @Override // com.google.android.gms.internal.ads.zzfii
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                zzcch zzcchVar2 = zzcchVar;
                ((zzcdd) obj).zzg(new zzcdr(zzcchVar2.zza(), zzcchVar2.zzb()));
            }
        });
        zzfij.zza(this.zzf, new zzfii() { // from class: com.google.android.gms.internal.ads.zzfjn
            @Override // com.google.android.gms.internal.ads.zzfii
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                zzcch zzcchVar2 = zzcchVar;
                ((zzcdi) obj).zze(new zzcdr(zzcchVar2.zza(), zzcchVar2.zzb()), str, str2);
            }
        });
        zzfij.zza(this.zze, new zzfii() { // from class: com.google.android.gms.internal.ads.zzfjo
            @Override // com.google.android.gms.internal.ads.zzfii
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzccn) obj).zzi(zzcchVar);
            }
        });
        zzfij.zza(this.zzg, new zzfii() { // from class: com.google.android.gms.internal.ads.zzfjp
            @Override // com.google.android.gms.internal.ads.zzfii
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcci) obj).zze(zzcchVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdJ(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfkh zzfkhVar = this.zzj;
        if (zzfkhVar != null) {
            zzfkhVar.zzdJ(zzeVar);
            return;
        }
        final int i10 = zzeVar.zza;
        AtomicReference atomicReference = this.zzc;
        zzfij.zza(atomicReference, new zzfii() { // from class: com.google.android.gms.internal.ads.zzfjt
            @Override // com.google.android.gms.internal.ads.zzfii
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcdh) obj).zzg(zzeVar);
            }
        });
        zzfij.zza(atomicReference, new zzfii() { // from class: com.google.android.gms.internal.ads.zzfjk
            @Override // com.google.android.gms.internal.ads.zzfii
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcdh) obj).zzf(i10);
            }
        });
        zzfij.zza(this.zze, new zzfii() { // from class: com.google.android.gms.internal.ads.zzfjl
            @Override // com.google.android.gms.internal.ads.zzfii
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzccn) obj).zzk(i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzdK() {
        zzfkh zzfkhVar = this.zzj;
        if (zzfkhVar != null) {
            zzfkhVar.zzdK();
        } else {
            zzfij.zza(this.zze, zzfkb.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void zzdT() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzds() {
        zzfkh zzfkhVar = this.zzj;
        if (zzfkhVar != null) {
            zzfkhVar.zzds();
            return;
        }
        this.zza.zzb();
        zzfij.zza(this.zzd, zzfjv.zza);
        zzfij.zza(this.zze, zzfka.zza);
        zzfij.zza(this.zzi, zzfkf.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzdt() {
        zzfkh zzfkhVar = this.zzj;
        if (zzfkhVar != null) {
            zzfkhVar.zzdt();
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzfij.zza(atomicReference, zzfjx.zza);
        zzfij.zza(this.zze, zzfjz.zza);
        zzfij.zza(atomicReference, zzfju.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void zzdu() {
        zzfkh zzfkhVar = this.zzj;
        if (zzfkhVar != null) {
            zzfkhVar.zzdu();
        } else {
            zzfij.zza(this.zzd, zzfjw.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zze() {
        zzfkh zzfkhVar = this.zzj;
        if (zzfkhVar != null) {
            zzfkhVar.zze();
        } else {
            zzfij.zza(this.zze, zzfkc.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzf() {
        zzfkh zzfkhVar = this.zzj;
        if (zzfkhVar != null) {
            zzfkhVar.zzf();
        } else {
            zzfij.zza(this.zze, zzfkd.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        zzfkh zzfkhVar = this.zzj;
        if (zzfkhVar != null) {
            zzfkhVar.zzg();
        } else {
            zzfij.zza(this.zzc, zzfjy.zza);
            zzfij.zza(this.zze, zzfke.zza);
        }
    }

    public final void zzh(zzcdh zzcdhVar) {
        this.zzc.set(zzcdhVar);
    }

    public final void zzi(zzcdd zzcddVar) {
        this.zzd.set(zzcddVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfkh zzfkhVar = this.zzj;
        if (zzfkhVar != null) {
            zzfkhVar.zzj(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzfij.zza(atomicReference, new zzfii() { // from class: com.google.android.gms.internal.ads.zzfjq
            @Override // com.google.android.gms.internal.ads.zzfii
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcdd) obj).zzi(zzeVar);
            }
        });
        zzfij.zza(atomicReference, new zzfii() { // from class: com.google.android.gms.internal.ads.zzfjr
            @Override // com.google.android.gms.internal.ads.zzfii
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcdd) obj).zzh(zzeVar.zza);
            }
        });
    }

    public final void zzk(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzh.set(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void zzm(@NonNull final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfkh zzfkhVar = this.zzj;
        if (zzfkhVar != null) {
            zzfkhVar.zzm(zztVar);
        } else {
            zzfij.zza(this.zzh, new zzfii() { // from class: com.google.android.gms.internal.ads.zzfjs
                @Override // com.google.android.gms.internal.ads.zzfii
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(zztVar);
                }
            });
        }
    }

    @Deprecated
    public final void zzn(zzccn zzccnVar) {
        this.zze.set(zzccnVar);
    }

    public final void zzo(zzfua zzfuaVar) {
        this.zzi.set(zzfuaVar);
    }

    public final void zzp(zzcdi zzcdiVar) {
        this.zzf.set(zzcdiVar);
    }

    @Deprecated
    public final void zzq(zzcci zzcciVar) {
        this.zzg.set(zzcciVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final void zzv(zzfir zzfirVar) {
        this.zzj = (zzfkh) zzfirVar;
    }
}

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeua implements AppEventListener, zzdgv, zzdfd, zzdds, zzdej, com.google.android.gms.ads.internal.client.zza, zzddp, zzdgg, zzdef, zzdlw {

    @Nullable
    final zzeaj zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    private final AtomicReference zzk = new AtomicReference();

    @e.f0
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzks)).intValue());

    public zzeua(@Nullable zzeaj zzeajVar) {
        this.zza = zzeajVar;
    }

    private final void zzs() {
        if (this.zzi.get() && this.zzj.get()) {
            BlockingQueue<Pair> blockingQueue = this.zzb;
            for (final Pair pair : blockingQueue) {
                zzfij.zza(this.zzd, new zzfii() { // from class: com.google.android.gms.internal.ads.zzetk
                    @Override // com.google.android.gms.internal.ads.zzfii
                    public final /* synthetic */ void zza(Object obj) throws RemoteException {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzcl) obj).zza((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            blockingQueue.clear();
            this.zzh.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzms)).booleanValue()) {
            return;
        }
        zzfij.zza(this.zzc, zzetp.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.zzh.get()) {
            zzfij.zza(this.zzd, new zzfii() { // from class: com.google.android.gms.internal.ads.zzeti
                @Override // com.google.android.gms.internal.ads.zzfii
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzcl) obj).zza(str, str2);
                }
            });
            return;
        }
        if (!this.zzb.offer(new Pair(str, str2))) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("The queue for app events is full, dropping the new event.");
            zzeaj zzeajVar = this.zza;
            if (zzeajVar != null) {
                zzeai zzeaiVarZza = zzeajVar.zza();
                zzeaiVarZza.zzc("action", "dae_action");
                zzeaiVarZza.zzc("dae_name", str);
                zzeaiVarZza.zzc("dae_data", str2);
                zzeaiVarZza.zzd();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzd(zzcch zzcchVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdJ(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfii zzfiiVar = new zzfii() { // from class: com.google.android.gms.internal.ads.zzetl
            @Override // com.google.android.gms.internal.ads.zzfii
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzc(zzeVar);
            }
        };
        AtomicReference atomicReference = this.zzc;
        zzfij.zza(atomicReference, zzfiiVar);
        zzfij.zza(atomicReference, new zzfii() { // from class: com.google.android.gms.internal.ads.zzetf
            @Override // com.google.android.gms.internal.ads.zzfii
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzb(zzeVar.zza);
            }
        });
        zzfij.zza(this.zzf, new zzfii() { // from class: com.google.android.gms.internal.ads.zzetg
            @Override // com.google.android.gms.internal.ads.zzfii
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzb(zzeVar);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzdK() {
        zzfij.zza(this.zzc, zzetm.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdP(zzcbv zzcbvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdQ(zzflo zzfloVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void zzdT() {
        zzfij.zza(this.zzc, zzetq.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void zzdr() {
        zzfij.zza(this.zzc, zzets.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzds() {
        zzfij.zza(this.zzc, zzett.zza);
        zzfij.zza(this.zzg, zzety.zza);
        zzfij.zza(this.zzk, zzetz.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzdt() {
        zzfij.zza(this.zzc, zzeto.zza);
        AtomicReference atomicReference = this.zzg;
        zzfij.zza(atomicReference, zzetv.zza);
        zzfij.zza(atomicReference, zzetw.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void zzdu() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzms)).booleanValue()) {
            zzfij.zza(this.zzc, zzetr.zza);
        }
        zzfij.zza(this.zzg, zzetx.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final synchronized void zzg() {
        zzfij.zza(this.zzc, zzetn.zza);
        zzfij.zza(this.zzf, zzetu.zza);
        this.zzj.set(true);
        zzs();
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbh zzi() {
        return (com.google.android.gms.ads.internal.client.zzbh) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfij.zza(this.zzg, new zzfii() { // from class: com.google.android.gms.internal.ads.zzetj
            @Override // com.google.android.gms.internal.ads.zzfii
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).zza(zzeVar);
            }
        });
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzcl zzk() {
        return (com.google.android.gms.ads.internal.client.zzcl) this.zzd.get();
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzc.set(zzbhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void zzm(@NonNull final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfij.zza(this.zze, new zzfii() { // from class: com.google.android.gms.internal.ads.zzeth
            @Override // com.google.android.gms.internal.ads.zzfii
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(zztVar);
            }
        });
    }

    public final void zzn(zzfua zzfuaVar) {
        this.zzk.set(zzfuaVar);
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.zzd.set(zzclVar);
        this.zzi.set(true);
        zzs();
    }

    public final void zzp(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zze.set(zzdqVar);
    }

    public final void zzq(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzf.set(zzbkVar);
    }

    public final void zzr(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzg.set(zzcsVar);
    }
}

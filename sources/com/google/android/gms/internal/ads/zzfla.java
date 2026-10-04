package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfla extends zzccj {
    private final zzfkq zza;
    private final zzfkh zzb;
    private final zzflp zzc;

    @Nullable
    private zzdwk zzd;
    private boolean zze = false;

    public zzfla(zzfkq zzfkqVar, zzfkh zzfkhVar, zzflp zzflpVar) {
        this.zza = zzfkqVar;
        this.zzb = zzfkhVar;
        this.zzc = zzflpVar;
    }

    private final synchronized boolean zzx() {
        zzdwk zzdwkVar = this.zzd;
        if (zzdwkVar != null) {
            if (!zzdwkVar.zze()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzgE)).booleanValue() == false) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzcck
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zza(com.google.android.gms.internal.ads.zzcco r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbix r1 = com.google.android.gms.internal.ads.zzbjg.zzgC     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbje r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L62
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.zzcfv r2 = com.google.android.gms.ads.internal.zzt.zzh()     // Catch: java.lang.Throwable -> L20
            r2.zzh(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.zzx()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.zzbix r0 = com.google.android.gms.internal.ads.zzbjg.zzgE     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbje r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            com.google.android.gms.internal.ads.zzfkj r0 = new com.google.android.gms.internal.ads.zzfkj     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4.zzd = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfkq r1 = r4.zza     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.ads.internal.client.zzm r2 = r5.zza     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfky r3 = new com.google.android.gms.internal.ads.zzfky     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.zza(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L62:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfla.zza(com.google.android.gms.internal.ads.zzcco):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzb() throws RemoteException {
        zzo(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzc(zzccn zzccnVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzn(zzccnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final boolean zzd() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zze() {
        zzh(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzf() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzg() throws RemoteException {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zza(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzk(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzl().zzc(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    @Nullable
    public final synchronized String zzk() throws RemoteException {
        zzdwk zzdwkVar = this.zzd;
        if (zzdwkVar == null || zzdwkVar.zzn() == null) {
            return null;
        }
        return zzdwkVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzl(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzm(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfkz(this, zzbyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final Bundle zzn() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdwk zzdwkVar = this.zzd;
        return zzdwkVar != null ? zzdwkVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzo(@Nullable IObjectWrapper iObjectWrapper) throws RemoteException {
        try {
            Preconditions.checkMainThread("showAd must be called on the main UI thread.");
            if (this.zzd != null) {
                Activity activity = null;
                if (iObjectWrapper != null) {
                    Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
                    if (objUnwrap instanceof Activity) {
                        activity = (Activity) objUnwrap;
                    }
                }
                this.zzd.zza(this.zze, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzq(boolean z10) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final boolean zzr() {
        zzdwk zzdwkVar = this.zzd;
        return zzdwkVar != null && zzdwkVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzs() throws RemoteException {
        zzdwk zzdwkVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhO)).booleanValue() && (zzdwkVar = this.zzd) != null) {
            return zzdwkVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzt(zzcci zzcciVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzq(zzcciVar);
    }

    public final /* synthetic */ zzflp zzu() {
        return this.zzc;
    }

    public final /* synthetic */ zzdwk zzv() {
        return this.zzd;
    }

    public final /* synthetic */ void zzw(zzdwk zzdwkVar) {
        this.zzd = zzdwkVar;
    }
}

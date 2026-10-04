package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.Nullable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbib {

    @Nullable
    private zzbhq zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzbib(Context context) {
        this.zzc = context;
    }

    public final Future zza(zzbhr zzbhrVar) {
        zzbhv zzbhvVar = new zzbhv(this);
        zzbhz zzbhzVar = new zzbhz(this, zzbhrVar, zzbhvVar);
        zzbia zzbiaVar = new zzbia(this, zzbhvVar);
        synchronized (this.zzd) {
            zzbhq zzbhqVar = new zzbhq(this.zzc, com.google.android.gms.ads.internal.zzt.zzs().zza(), zzbhzVar, zzbiaVar);
            this.zza = zzbhqVar;
            zzbhqVar.checkAvailabilityAndConnect();
        }
        return zzbhvVar;
    }

    public final /* synthetic */ void zzb() {
        synchronized (this.zzd) {
            try {
                zzbhq zzbhqVar = this.zza;
                if (zzbhqVar == null) {
                    return;
                }
                zzbhqVar.disconnect();
                this.zza = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ zzbhq zzc() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzd() {
        return this.zzb;
    }

    public final /* synthetic */ void zze(boolean z10) {
        this.zzb = true;
    }

    public final /* synthetic */ Object zzf() {
        return this.zzd;
    }
}

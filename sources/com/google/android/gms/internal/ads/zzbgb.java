package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbgb {
    private final Object zza = new Object();
    private zzbfz zzb = null;
    private boolean zzc = false;

    public final void zza(Context context) {
        synchronized (this.zza) {
            try {
                if (!this.zzc) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not cast Context to Application");
                    } else {
                        if (this.zzb == null) {
                            this.zzb = new zzbfz();
                        }
                        this.zzb.zza(application, context);
                        this.zzc = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(zzbga zzbgaVar) {
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    this.zzb = new zzbfz();
                }
                this.zzb.zzb(zzbgaVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(zzbga zzbgaVar) {
        synchronized (this.zza) {
            try {
                zzbfz zzbfzVar = this.zzb;
                if (zzbfzVar == null) {
                    return;
                }
                zzbfzVar.zzc(zzbgaVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final Activity zzd() {
        synchronized (this.zza) {
            try {
                zzbfz zzbfzVar = this.zzb;
                if (zzbfzVar == null) {
                    return null;
                }
                return zzbfzVar.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final Context zze() {
        synchronized (this.zza) {
            try {
                zzbfz zzbfzVar = this.zzb;
                if (zzbfzVar == null) {
                    return null;
                }
                return zzbfzVar.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzf() {
        synchronized (this.zza) {
            try {
                zzbfz zzbfzVar = this.zzb;
                if (zzbfzVar == null) {
                    return false;
                }
                return zzbfzVar.zzg().get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg(zzdxs zzdxsVar) {
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    this.zzb = new zzbfz();
                }
                this.zzb.zzj(zzdxsVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

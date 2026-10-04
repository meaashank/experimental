package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.compose.animation.core.C1598m0;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import e.InterfaceC4326A;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfms {

    @InterfaceC4326A("LiteSdkInfoRetriever.class")
    private static zzfms zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcv zzc;
    private final AtomicReference zzd = new AtomicReference();

    @e.f0
    public zzfms(Context context, com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
        this.zzb = context;
        this.zzc = zzcvVar;
    }

    public static zzfms zza(Context context) {
        synchronized (zzfms.class) {
            try {
                zzfms zzfmsVar = zza;
                if (zzfmsVar != null) {
                    return zzfmsVar;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) zzbli.zzb.zze()).longValue();
                com.google.android.gms.ads.internal.client.zzcv zzcvVarZzf = null;
                if (jLongValue > 0 && jLongValue <= 262180000) {
                    zzcvVarZzf = zzf(applicationContext);
                }
                zzfms zzfmsVar2 = new zzfms(applicationContext, zzcvVarZzf);
                zza = zzfmsVar2;
                return zzfmsVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @e.f0
    public static com.google.android.gms.ads.internal.client.zzcv zzf(Context context) {
        try {
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            e = e10;
        }
        try {
            return com.google.android.gms.ads.internal.client.zzcu.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassNotFoundException e11) {
            e = e11;
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to retrieve lite SDK info.", e);
            return null;
        } catch (IllegalAccessException e12) {
            e = e12;
            int i102 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to retrieve lite SDK info.", e);
            return null;
        } catch (InstantiationException e13) {
            e = e13;
            int i1022 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to retrieve lite SDK info.", e);
            return null;
        } catch (NoSuchMethodException e14) {
            e = e14;
            int i10222 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to retrieve lite SDK info.", e);
            return null;
        } catch (InvocationTargetException e15) {
            e = e15;
            int i102222 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzez zzg() {
        com.google.android.gms.ads.internal.client.zzcv zzcvVar = this.zzc;
        if (zzcvVar != null) {
            try {
                return zzcvVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final VersionInfoParcel zzb(int i10, boolean z10, int i11) {
        com.google.android.gms.ads.internal.client.zzez zzezVarZzg;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zZzH = com.google.android.gms.ads.internal.util.zzs.zzH(this.zzb);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i11, true, zZzH);
        return (((Boolean) zzbli.zzc.zze()).booleanValue() && (zzezVarZzg = zzg()) != null) ? new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, zzezVarZzg.zza(), true, zZzH) : versionInfoParcel;
    }

    public final void zzc(zzbvu zzbvuVar) {
        zzbvu adapterCreator;
        if (!((Boolean) zzbli.zza.zze()).booleanValue()) {
            C1598m0.a(this.zzd, null, zzbvuVar);
            return;
        }
        com.google.android.gms.ads.internal.client.zzcv zzcvVar = this.zzc;
        if (zzcvVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzcvVar.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        AtomicReference atomicReference = this.zzd;
        if (adapterCreator != null) {
            zzbvuVar = adapterCreator;
        }
        C1598m0.a(atomicReference, null, zzbvuVar);
    }

    public final zzbvu zzd() {
        return (zzbvu) this.zzd.get();
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzez zzezVarZzg = zzg();
        if (zzezVarZzg != null) {
            return zzezVarZzg.zzb();
        }
        return null;
    }
}

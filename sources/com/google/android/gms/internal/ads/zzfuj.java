package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import t7.C5617a;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfuj {
    private final zzfve zzc;
    private final zzfuf zzd;
    private final Context zze;

    @Nullable
    private volatile ConnectivityManager zzf;
    private final Clock zzh;
    private AtomicInteger zzi;
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();

    public zzfuj(zzfve zzfveVar, zzfuf zzfufVar, Context context, Clock clock) {
        this.zzc = zzfveVar;
        this.zzd = zzfufVar;
        this.zze = context;
        this.zzh = clock;
    }

    public static String zzh(String str, @Nullable AdFormat adFormat) {
        String strName = adFormat == null ? "NULL" : adFormat.name();
        return androidx.compose.animation.core.E0.a(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length()), str, "#", strName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzi(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzC)).booleanValue()) {
            zzj(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzj(boolean z10) {
        try {
            if (z10) {
                Iterator it = this.zza.values().iterator();
                while (it.hasNext()) {
                    ((zzfvd) it.next()).zzj();
                }
            } else {
                Iterator it2 = this.zza.values().iterator();
                while (it2.hasNext()) {
                    ((zzfvd) it2.next()).zzi();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x003a, B:13:0x0049, B:14:0x004f, B:16:0x0057, B:18:0x0063, B:19:0x0072, B:20:0x0076, B:21:0x007a, B:22:0x0084, B:24:0x008a, B:26:0x009c, B:27:0x00b1, B:28:0x00bb, B:30:0x00c1, B:32:0x00e2, B:35:0x00f7, B:37:0x00fd, B:34:0x00f4), top: B:43:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized java.util.List zzm(java.util.List r9) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfuj.zzm(java.util.List):java.util.List");
    }

    private final synchronized void zzn(String str, zzfvd zzfvdVar) {
        zzfvdVar.zzd();
        this.zza.put(str, zzfvdVar);
    }

    private final synchronized boolean zzo(String str, AdFormat adFormat) {
        boolean z10;
        try {
            Clock clock = this.zzh;
            long jCurrentTimeMillis = clock.currentTimeMillis();
            zzfvd zzfvdVarZzq = zzq(str, adFormat);
            int iZzt = 0;
            z10 = zzfvdVarZzq != null && zzfvdVarZzq.zzf();
            Long lValueOf = z10 ? Long.valueOf(clock.currentTimeMillis()) : null;
            zzfum zzfumVar = new zzfum(new zzful(str, adFormat), null);
            zzfuf zzfufVar = this.zzd;
            int iZzs = zzfvdVarZzq == null ? 0 : zzfvdVarZzq.zzs();
            if (zzfvdVarZzq != null) {
                iZzt = zzfvdVarZzq.zzt();
            }
            zzfufVar.zzd(iZzs, iZzt, jCurrentTimeMillis, lValueOf, zzfvdVarZzq != null ? zzfvdVarZzq.zzl() : null, zzfumVar, "1");
        } catch (Throwable th) {
            throw th;
        }
        return z10;
    }

    @Nullable
    private final synchronized Object zzp(Class cls, String str, AdFormat adFormat) {
        zzfum zzfumVar = new zzfum(new zzful(str, adFormat), null);
        zzfuf zzfufVar = this.zzd;
        Clock clock = this.zzh;
        zzfufVar.zzf(clock.currentTimeMillis(), zzfumVar, -1, -1, "1");
        zzfvd zzfvdVarZzq = zzq(str, adFormat);
        if (zzfvdVarZzq == null) {
            return null;
        }
        try {
            String strZzl = zzfvdVarZzq.zzl();
            Object objZzg = zzfvdVarZzq.zzg();
            Object objCast = objZzg == null ? null : cls.cast(objZzg);
            if (objCast != null) {
                zzfufVar.zzh(clock.currentTimeMillis(), zzfvdVarZzq.zzs(), zzfvdVarZzq.zzt(), strZzl, zzfumVar, "1");
            }
            return objCast;
        } catch (ClassCastException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "PreloadAdManager.pollAd");
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e10);
            return null;
        }
    }

    @Nullable
    private final synchronized zzfvd zzq(String str, AdFormat adFormat) {
        return (zzfvd) this.zza.get(zzh(str, adFormat));
    }

    public final synchronized void zza(List list, com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        try {
            if (!this.zzg.getAndSet(true)) {
                if (this.zzf == null) {
                    synchronized (this) {
                        if (this.zzf == null) {
                            try {
                                this.zzf = (ConnectivityManager) this.zze.getSystemService(C5617a.f239212e);
                            } catch (ClassCastException e10) {
                                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e10);
                            }
                        }
                    }
                }
                if (!PlatformVersion.isAtLeastO() || this.zzf == null) {
                    this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzL)).intValue());
                } else {
                    try {
                        this.zzf.registerDefaultNetworkCallback(new zzfui(this));
                    } catch (RuntimeException e11) {
                        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e11);
                        this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzL)).intValue());
                    }
                }
                com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfuh(this));
            }
            List<com.google.android.gms.ads.internal.client.zzfp> listZzm = zzm(list);
            EnumMap enumMap = new EnumMap(AdFormat.class);
            for (com.google.android.gms.ads.internal.client.zzfp zzfpVar : listZzm) {
                String str = zzfpVar.zza;
                AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
                zzfvd zzfvdVarZza = this.zzc.zza(zzfpVar, zzcbVar);
                if (adFormat != null && zzfvdVarZza != null) {
                    AtomicInteger atomicInteger = this.zzi;
                    if (atomicInteger != null) {
                        zzfvdVarZza.zzn(atomicInteger.get());
                    }
                    zzfuf zzfufVar = this.zzd;
                    zzfvdVarZza.zzm(zzfufVar);
                    zzn(zzh(str, adFormat), zzfvdVarZza);
                    enumMap.put(adFormat, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat, 0)).intValue() + 1));
                    zzfufVar.zza(zzfpVar.zzd, this.zzh.currentTimeMillis(), new zzfum(new zzful(str, adFormat), null), "1");
                }
            }
            this.zzd.zzb(enumMap, this.zzh.currentTimeMillis(), "1");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzb(String str) {
        return zzo(str, AdFormat.REWARDED);
    }

    @Nullable
    public final synchronized zzcda zzc(String str) {
        return (zzcda) zzp(zzcda.class, str, AdFormat.REWARDED);
    }

    public final synchronized boolean zzd(String str) {
        return zzo(str, AdFormat.APP_OPEN_AD);
    }

    @Nullable
    public final synchronized zzbgz zze(String str) {
        return (zzbgz) zzp(zzbgz.class, str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzf(String str) {
        return zzo(str, AdFormat.INTERSTITIAL);
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzbu zzg(String str) {
        return (com.google.android.gms.ads.internal.client.zzbu) zzp(com.google.android.gms.ads.internal.client.zzbu.class, str, AdFormat.INTERSTITIAL);
    }
}

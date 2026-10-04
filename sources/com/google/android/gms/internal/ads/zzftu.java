package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import t7.C5617a;

/* JADX INFO: loaded from: classes4.dex */
public final class zzftu {
    private final Map zza;
    private final zzfve zzb;
    private final zzfuf zzc;
    private final Context zzd;

    @Nullable
    private volatile ConnectivityManager zze;
    private final AtomicBoolean zzf = new AtomicBoolean(false);
    private final Clock zzg;
    private AtomicInteger zzh;

    @Nullable
    private final zzftp zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;

    public zzftu(zzfve zzfveVar, zzfuf zzfufVar, Context context, Clock clock, @Nullable zzftp zzftpVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        HashMap map = new HashMap();
        this.zza = map;
        map.put(AdFormat.APP_OPEN_AD, new HashMap());
        map.put(AdFormat.INTERSTITIAL, new HashMap());
        map.put(AdFormat.REWARDED, new HashMap());
        this.zzb = zzfveVar;
        this.zzc = zzfufVar;
        this.zzd = context;
        this.zzg = clock;
        this.zzi = zzftpVar;
        this.zzj = zzgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzl(boolean z10) {
        ArrayList arrayList = new ArrayList();
        Map map = this.zza;
        synchronized (map) {
            try {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    arrayList.addAll(((Map) it.next()).values());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzfvd zzfvdVar = (zzfvd) arrayList.get(i10);
            if (z10) {
                zzfvdVar.zzj();
            } else {
                zzfvdVar.zzi();
            }
        }
    }

    @Nullable
    private final Object zzn(Class cls, AdFormat adFormat, String str) {
        zzfuf zzfufVar = this.zzc;
        Clock clock = this.zzg;
        zzfufVar.zze(clock.currentTimeMillis(), "2");
        Map map = this.zza;
        synchronized (map) {
            try {
                if (!map.containsKey(adFormat)) {
                    return null;
                }
                zzfvd zzfvdVar = (zzfvd) ((Map) map.get(adFormat)).get(str);
                if (zzfvdVar != null && adFormat.equals(zzfvdVar.zzq())) {
                    zzful zzfulVar = new zzful(zzfvdVar.zzr(), zzfvdVar.zzq());
                    zzfulVar.zza(str);
                    zzfum zzfumVar = new zzfum(zzfulVar, null);
                    zzfufVar.zzf(clock.currentTimeMillis(), zzfumVar, zzfvdVar.zzs(), zzfvdVar.zzt(), "2");
                    try {
                        String strZzl = zzfvdVar.zzl();
                        Object objZzg = zzfvdVar.zzg();
                        Object objCast = objZzg == null ? null : cls.cast(objZzg);
                        if (objCast == null) {
                            return objCast;
                        }
                        zzfufVar.zzh(clock.currentTimeMillis(), zzfvdVar.zzs(), zzfvdVar.zzt(), strZzl, zzfumVar, "2");
                        return objCast;
                    } catch (ClassCastException e10) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "PreloadAdManager.pollAd");
                        com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e10);
                    }
                }
                return null;
            } finally {
            }
        }
    }

    private final boolean zzo(AdFormat adFormat) {
        Map map = this.zza;
        int size = map.containsKey(adFormat) ? ((Map) map.get(adFormat)).size() : 0;
        int iOrdinal = adFormat.ordinal();
        return size < (iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 5 ? 0 : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfD)).intValue(), 1) : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfC)).intValue(), 1) : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfB)).intValue(), 1));
    }

    public final boolean zza(String str, com.google.android.gms.ads.internal.client.zzfp zzfpVar, @Nullable com.google.android.gms.ads.internal.client.zzce zzceVar) {
        int iZzT;
        if (!this.zzf.getAndSet(true)) {
            if (this.zze == null) {
                synchronized (this) {
                    if (this.zze == null) {
                        try {
                            this.zze = (ConnectivityManager) this.zzd.getSystemService(C5617a.f239212e);
                        } catch (ClassCastException e10) {
                            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e10);
                        }
                    }
                }
            }
            if (!PlatformVersion.isAtLeastO() || this.zze == null) {
                this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzL)).intValue());
            } else {
                try {
                    this.zze.registerDefaultNetworkCallback(new zzfts(this));
                } catch (RuntimeException e11) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e11);
                    this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzL)).intValue());
                }
            }
            com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzftt(this));
        }
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return false;
        }
        Map map = this.zza;
        synchronized (map) {
            try {
                if (map.containsKey(adFormat)) {
                    if (!((Map) map.get(adFormat)).containsKey(str)) {
                        if (zzo(adFormat)) {
                            if (zzfpVar.zze) {
                                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzT)).booleanValue() && (iZzT = this.zzj.zzT()) > 0) {
                                    zzfpVar = zzfpVar.zza(iZzT);
                                }
                            }
                            zzfvd zzfvdVarZzb = this.zzb.zzb(str, zzfpVar, zzceVar);
                            if (zzfvdVarZzb != null) {
                                AtomicInteger atomicInteger = this.zzh;
                                if (atomicInteger != null) {
                                    zzfvdVarZzb.zzn(atomicInteger.get());
                                }
                                zzfuf zzfufVar = this.zzc;
                                zzfvdVarZzb.zzm(zzfufVar);
                                synchronized (map) {
                                    if (!((Map) map.get(adFormat)).containsKey(str) && zzo(adFormat)) {
                                        ((Map) map.get(adFormat)).put(str, zzfvdVarZzb);
                                        zzftp zzftpVar = this.zzi;
                                        if (zzftpVar != null) {
                                            zzftpVar.zze(str, adFormat, zzfvdVarZzb);
                                        } else {
                                            zzfvdVarZzb.zzd();
                                        }
                                        zzful zzfulVar = new zzful(zzfpVar.zza, adFormat);
                                        zzfulVar.zza(str);
                                        zzfufVar.zza(zzfpVar.zzd, this.zzg.currentTimeMillis(), new zzfum(zzfulVar, null), "2");
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            } finally {
            }
        }
        return false;
    }

    public final boolean zzb(AdFormat adFormat, String str) {
        zzfum zzfumVar;
        Clock clock = this.zzg;
        long jCurrentTimeMillis = clock.currentTimeMillis();
        Map map = this.zza;
        synchronized (map) {
            try {
                if (!map.containsKey(adFormat)) {
                    return false;
                }
                zzfvd zzfvdVar = (zzfvd) ((Map) map.get(adFormat)).get(str);
                String strZzl = zzfvdVar == null ? null : zzfvdVar.zzl();
                boolean z10 = strZzl != null && adFormat.equals(zzfvdVar.zzq());
                Long lValueOf = z10 ? Long.valueOf(clock.currentTimeMillis()) : null;
                if (zzfvdVar == null) {
                    zzfumVar = null;
                } else {
                    zzful zzfulVar = new zzful(zzfvdVar.zzr(), adFormat);
                    zzfulVar.zza(str);
                    zzfumVar = new zzfum(zzfulVar, null);
                }
                this.zzc.zzd(zzfvdVar == null ? 0 : zzfvdVar.zzs(), zzfvdVar != null ? zzfvdVar.zzt() : 0, jCurrentTimeMillis, lValueOf, strZzl, zzfumVar, "2");
                return z10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final zzcda zzc(String str) {
        return (zzcda) zzn(zzcda.class, AdFormat.REWARDED, str);
    }

    @Nullable
    public final zzbgz zzd(String str) {
        return (zzbgz) zzn(zzbgz.class, AdFormat.APP_OPEN_AD, str);
    }

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzbu zze(String str) {
        return (com.google.android.gms.ads.internal.client.zzbu) zzn(com.google.android.gms.ads.internal.client.zzbu.class, AdFormat.INTERSTITIAL, str);
    }

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzfp zzf(AdFormat adFormat, String str) {
        Map map = this.zza;
        synchronized (map) {
            try {
                if (map.containsKey(adFormat)) {
                    zzfvd zzfvdVar = (zzfvd) ((Map) map.get(adFormat)).get(str);
                    this.zzc.zzo(this.zzg.currentTimeMillis(), str, zzfvdVar == null ? null : zzfvdVar.zzr(), adFormat, zzfvdVar == null ? -1 : zzfvdVar.zzs(), zzfvdVar != null ? zzfvdVar.zzt() : -1);
                    if (zzfvdVar != null) {
                        return zzfvdVar.zzo();
                    }
                }
            } finally {
            }
        }
        return null;
    }

    public final int zzg(AdFormat adFormat, String str) {
        Map map = this.zza;
        synchronized (map) {
            try {
                if (!map.containsKey(adFormat)) {
                    return 0;
                }
                zzfvd zzfvdVar = (zzfvd) ((Map) map.get(adFormat)).get(str);
                int iZzt = zzfvdVar != null ? zzfvdVar.zzt() : 0;
                this.zzc.zzp(iZzt, this.zzg.currentTimeMillis(), str, zzfvdVar == null ? null : zzfvdVar.zzr(), adFormat, zzfvdVar == null ? -1 : zzfvdVar.zzs());
                return iZzt;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Map zzh(int i10) {
        HashMap map = new HashMap();
        Map map2 = this.zza;
        AdFormat adFormat = AdFormat.getAdFormat(i10);
        synchronized (map2) {
            if (adFormat != null) {
                try {
                    if (map2.containsKey(adFormat)) {
                        for (zzfvd zzfvdVar : ((Map) map2.get(adFormat)).values()) {
                            map.put(zzfvdVar.zzp(), zzfvdVar.zzo());
                        }
                        this.zzc.zzn(adFormat, this.zzg.currentTimeMillis(), map.size());
                        return map;
                    }
                } finally {
                }
            }
            return map;
        }
    }

    public final boolean zzi(AdFormat adFormat, String str) {
        Map map = this.zza;
        synchronized (map) {
            try {
                if (!map.containsKey(adFormat)) {
                    return false;
                }
                zzfvd zzfvdVar = (zzfvd) ((Map) map.get(adFormat)).remove(str);
                if (zzfvdVar == null) {
                    return false;
                }
                zzfvdVar.zzh();
                zzftp zzftpVar = this.zzi;
                if (zzftpVar != null) {
                    zzftpVar.zzf(zzfvdVar);
                }
                int iZzt = zzfvdVar.zzt();
                zzfvdVar.zzv();
                this.zzc.zzm(this.zzg.currentTimeMillis(), str, zzfvdVar.zzr(), adFormat, zzfvdVar.zzs(), iZzt);
                return true;
            } finally {
            }
        }
    }

    public final void zzj(int i10) {
        AdFormat adFormat = AdFormat.getAdFormat(i10);
        if (adFormat == null) {
            return;
        }
        Map map = this.zza;
        synchronized (map) {
            try {
                if (map.containsKey(adFormat)) {
                    Map map2 = (Map) map.get(adFormat);
                    int size = map2.size();
                    if (size == 0) {
                        return;
                    }
                    zzgxm zzgxmVarZzq = zzgxm.zzq(map2.values());
                    map2.clear();
                    int size2 = zzgxmVarZzq.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        zzfvd zzfvdVar = (zzfvd) zzgxmVarZzq.get(i11);
                        if (zzfvdVar != null) {
                            zzfvdVar.zzh();
                            zzftp zzftpVar = this.zzi;
                            if (zzftpVar != null) {
                                zzftpVar.zzf(zzfvdVar);
                            }
                            zzfvdVar.zzv();
                            String strValueOf = String.valueOf(zzfvdVar.zzp());
                            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Destroyed ad preloader for preloadId: ".concat(strValueOf));
                        }
                    }
                    String strConcat = "Destroyed all ad preloaders for ad format: ".concat(adFormat.toString());
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh(strConcat);
                    this.zzc.zzl(this.zzg.currentTimeMillis(), adFormat, size);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzk(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzC)).booleanValue()) {
            zzl(z10);
        }
    }
}

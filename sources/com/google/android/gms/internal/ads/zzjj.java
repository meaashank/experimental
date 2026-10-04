package com.google.android.gms.internal.ads;

import U6.b;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjj implements zzmc {
    public static final zzgxm zza = zzgxm.zzn(b.h.f68653a, "content", "data", "android.resource", "rawresource", "asset");
    private final zzbe zzb;
    private final zzbd zzc;
    private final zzabv zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final long zzk;
    private final long zzl;
    private final long zzm;
    private final zzgxp zzn;
    private final ConcurrentHashMap zzo;
    private long zzp;

    public zzjj() {
        zzabv zzabvVar = new zzabv(true, 65536);
        zzgxp zzgxpVarZza = zzgxp.zza();
        zzq(1000, 0, "bufferForPlaybackMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        zzq(1000, 0, "bufferForPlaybackForLocalPlaybackMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        zzq(2000, 0, "bufferForPlaybackAfterRebufferMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        zzq(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        zzq(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        zzq(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        zzq(50000, 50000, "maxBufferMs", "minBufferMs");
        zzq(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        zzq(0, 0, "backBufferDurationMs", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        this.zzb = new zzbe();
        this.zzc = new zzbd();
        this.zzd = zzabvVar;
        this.zze = zzfm.zzt(50000L);
        this.zzf = zzfm.zzt(1000L);
        this.zzg = zzfm.zzt(50000L);
        this.zzh = zzfm.zzt(50000L);
        this.zzi = zzfm.zzt(1000L);
        this.zzj = zzfm.zzt(1000L);
        this.zzk = zzfm.zzt(2000L);
        this.zzl = zzfm.zzt(1000L);
        this.zzm = zzfm.zzt(0L);
        this.zzo = new ConcurrentHashMap();
        this.zzn = zzgxp.zzc(zzgxpVarZza);
        this.zzp = -1L;
    }

    private final int zzm(zzqj zzqjVar) {
        Integer num = (Integer) this.zzn.get(zzqjVar.zzb);
        if (num == null || num.intValue() == -1) {
            return -1;
        }
        return num.intValue();
    }

    private final void zzn(zzqj zzqjVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzji zzjiVar = (zzji) concurrentHashMap.get(zzqjVar);
        if (zzjiVar != null) {
            int i10 = zzjiVar.zza - 1;
            zzjiVar.zza = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(zzqjVar);
                zzo();
            }
        }
    }

    private final void zzo() {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        if (concurrentHashMap.isEmpty()) {
            this.zzd.zze();
            return;
        }
        zzabv zzabvVar = this.zzd;
        Iterator it = concurrentHashMap.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((zzji) it.next()).zzc;
        }
        zzabvVar.zzf(i10);
    }

    private final boolean zzp(zzmb zzmbVar) {
        zzbf zzbfVar = zzmbVar.zzb;
        zzag zzagVar = zzbfVar.zzb(zzbfVar.zzo(zzmbVar.zzc.zza, this.zzc).zzc, this.zzb, 0L).zzd.zzb;
        if (zzagVar == null) {
            return false;
        }
        String scheme = zzagVar.zza.getScheme();
        return TextUtils.isEmpty(scheme) || zza.contains(scheme);
    }

    private static void zzq(int i10, int i11, String str, String str2) {
        zzguk.zzh(i10 >= i11, "%s cannot be less than %s", str, str2);
    }

    private final int zzr(zzqj zzqjVar) {
        zzji zzjiVar = (zzji) this.zzo.get(zzqjVar);
        zzjiVar.getClass();
        return zzjiVar.zzc() * 65536;
    }

    private final int zzs(zzqj zzqjVar) {
        zzji zzjiVar = (zzji) this.zzo.get(zzqjVar);
        zzjiVar.getClass();
        return zzjiVar.zzc;
    }

    private static final boolean zzt(boolean z10) {
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zza(zzqj zzqjVar) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.zzp;
        zzguk.zzj(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzp = id2;
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzji zzjiVar = (zzji) concurrentHashMap.get(zzqjVar);
        if (zzjiVar == null) {
            concurrentHashMap.put(zzqjVar, new zzji());
        } else {
            zzjiVar.zza++;
        }
        zzji zzjiVar2 = (zzji) concurrentHashMap.get(zzqjVar);
        zzjiVar2.getClass();
        int iZzm = zzm(zzqjVar);
        if (iZzm == -1) {
            iZzm = 13107200;
        }
        zzjiVar2.zzc = iZzm;
        zzjiVar2.zzb = false;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zzb(zzmb zzmbVar, zzzr zzzrVar, zzabe[] zzabeVarArr) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzqj zzqjVar = zzmbVar.zza;
        int iZzm = zzm(zzqjVar);
        zzji zzjiVar = (zzji) concurrentHashMap.get(zzqjVar);
        zzjiVar.getClass();
        if (iZzm == -1) {
            boolean zZzp = zzp(zzmbVar);
            int length = zzabeVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = 13107200;
                if (i10 < length) {
                    zzabe zzabeVar = zzabeVarArr[i10];
                    if (zzabeVar != null) {
                        switch (zzabeVar.zza().zzc) {
                            case -1:
                            case 1:
                                break;
                            case 0:
                                i12 = 144310272;
                                break;
                            case 2:
                                i12 = !zZzp ? 131072000 : 19660800;
                                break;
                            case 3:
                            case 5:
                            default:
                                i12 = 131072;
                                break;
                            case 4:
                                i12 = 26214400;
                                break;
                        }
                        i11 += i12;
                    }
                    i10++;
                } else {
                    String str = zzfm.zza;
                    iZzm = Math.max(13107200, Math.min(i11, 210239488));
                }
            }
        }
        zzjiVar.zzc = iZzm;
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zzc(zzqj zzqjVar) {
        zzn(zzqjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zzd(zzqj zzqjVar) {
        zzn(zzqjVar);
        if (this.zzo.isEmpty()) {
            this.zzp = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final zzabp zze(zzqj zzqjVar) {
        return new zzjh(this, zzqjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final long zzf(zzqj zzqjVar) {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean zzg(zzqj zzqjVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean zzh(zzmb zzmbVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzqj zzqjVar = zzmbVar.zza;
        zzji zzjiVar = (zzji) concurrentHashMap.get(zzqjVar);
        zzjiVar.getClass();
        int iZzr = zzr(zzqjVar);
        int iZzs = zzs(zzqjVar);
        boolean z10 = false;
        if (zzqjVar.equals(zzqj.zza)) {
            return iZzr < iZzs;
        }
        boolean zZzp = zzp(zzmbVar);
        long jMin = zZzp ? this.zzf : this.zze;
        long j10 = zZzp ? this.zzh : this.zzg;
        float f10 = zzmbVar.zzf;
        if (f10 > 1.0f) {
            jMin = Math.min(zzfm.zzy(jMin, f10), j10);
        }
        long j11 = zzmbVar.zze;
        if (j11 < Math.max(jMin, 500000L)) {
            boolean zZzt = zzt(zZzp);
            Runtime runtime = Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            boolean z11 = runtime.totalMemory() < jMaxMemory || runtime.freeMemory() + ((long) this.zzd.zzh()) >= jMaxMemory / 25;
            if (!zZzt ? iZzr < iZzs : !(!z11 && iZzr >= iZzs)) {
                z10 = true;
            }
            zzjiVar.zzb = z10;
            if (!z10 && zZzt && !z11) {
                zzeh.zzb("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!zzjiVar.zzb && j11 < 500000) {
                zzeh.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j10 || iZzr >= iZzs) {
            zzjiVar.zzb = false;
        }
        return zzjiVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean zzi(zzmb zzmbVar) {
        long jMin;
        boolean z10;
        boolean z11 = zzmbVar.zzg;
        long j10 = zzmbVar.zze;
        float f10 = zzmbVar.zzf;
        boolean zZzp = zzp(zzmbVar);
        long jZzz = zzfm.zzz(j10, f10);
        if (z11) {
            if (zZzp) {
                jMin = this.zzl;
                z10 = true;
            } else {
                jMin = this.zzk;
                z10 = false;
            }
        } else if (zZzp) {
            jMin = this.zzj;
            z10 = true;
        } else {
            jMin = this.zzi;
            z10 = false;
        }
        long j11 = zzmbVar.zzh;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(j11 / 2, jMin);
        }
        if (jMin <= 0 || jZzz >= jMin) {
            return true;
        }
        if (!zzt(z10)) {
            zzqj zzqjVar = zzmbVar.zza;
            if (zzr(zzqjVar) >= zzs(zzqjVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean zzj(zzqj zzqjVar, zzbf zzbfVar, zzxo zzxoVar, long j10) {
        Iterator it = this.zzo.values().iterator();
        while (it.hasNext()) {
            if (((zzji) it.next()).zzb) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ zzabv zzk() {
        return this.zzd;
    }

    public final /* synthetic */ ConcurrentHashMap zzl() {
        return this.zzo;
    }
}

package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzax;
import com.google.android.gms.ads.internal.util.zzbq;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.ads.internal.util.zzu;
import com.google.android.gms.ads.internal.util.zzv;
import com.google.android.gms.ads.internal.util.zzx;
import com.google.android.gms.ads.internal.util.zzy;
import com.google.android.gms.ads.internal.util.zzz;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzbgb;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzbjm;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbur;
import com.google.android.gms.internal.ads.zzbvp;
import com.google.android.gms.internal.ads.zzccc;
import com.google.android.gms.internal.ads.zzcer;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzcge;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgw;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzcmc;
import com.google.android.gms.internal.ads.zzemf;
import com.google.android.gms.internal.ads.zzemg;

/* JADX INFO: loaded from: classes3.dex */
public final class zzt {
    private static final zzt zza = new zzt();
    private final zzbic zzA;
    private final zzcer zzB;
    private final zzcg zzC;
    private final zzcjl zzD;
    private final zzcgw zzE;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzn zzc;
    private final com.google.android.gms.ads.internal.util.zzs zzd;
    private final zzcmc zze;
    private final zzcge zzf;
    private final zzz zzg;
    private final zzbgb zzh;
    private final zzcfv zzi;
    private final zzaa zzj;
    private final zzbhn zzk;
    private final Clock zzl;
    private final zzf zzm;
    private final zzbjm zzn;
    private final zzbkf zzo;
    private final zzax zzp;
    private final zzccc zzq;
    private final zzcgp zzr;
    private final zzbur zzs;
    private final com.google.android.gms.ads.internal.overlay.zzz zzt;
    private final zzbq zzu;
    private final zzae zzv;
    private final zzaf zzw;
    private final zzbvp zzx;
    private final zzbr zzy;
    private final zzemg zzz;

    public zzt() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzn zznVar = new com.google.android.gms.ads.internal.overlay.zzn();
        com.google.android.gms.ads.internal.util.zzs zzsVar = new com.google.android.gms.ads.internal.util.zzs();
        zzcmc zzcmcVar = new zzcmc();
        zzcge zzcgeVar = new zzcge();
        int i10 = Build.VERSION.SDK_INT;
        zzz zzyVar = i10 >= 30 ? new zzy() : i10 >= 28 ? new zzx() : i10 >= 26 ? new zzv() : i10 >= 24 ? new zzu() : new com.google.android.gms.ads.internal.util.zzt();
        zzbgb zzbgbVar = new zzbgb();
        zzcfv zzcfvVar = new zzcfv();
        zzaa zzaaVar = new zzaa();
        zzbhn zzbhnVar = new zzbhn();
        Clock defaultClock = DefaultClock.getInstance();
        zzf zzfVar = new zzf();
        zzbjm zzbjmVar = new zzbjm();
        zzbkf zzbkfVar = new zzbkf();
        zzax zzaxVar = new zzax();
        zzccc zzcccVar = new zzccc();
        zzcgp zzcgpVar = new zzcgp();
        zzbur zzburVar = new zzbur();
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = new com.google.android.gms.ads.internal.overlay.zzz();
        zzbq zzbqVar = new zzbq();
        zzae zzaeVar = new zzae();
        zzaf zzafVar = new zzaf();
        zzbvp zzbvpVar = new zzbvp();
        zzbr zzbrVar = new zzbr();
        zzemf zzemfVar = new zzemf();
        zzbic zzbicVar = new zzbic();
        zzcer zzcerVar = new zzcer();
        zzcg zzcgVar = new zzcg();
        zzcjl zzcjlVar = new zzcjl();
        zzcgw zzcgwVar = new zzcgw();
        this.zzb = zzaVar;
        this.zzc = zznVar;
        this.zzd = zzsVar;
        this.zze = zzcmcVar;
        this.zzf = zzcgeVar;
        this.zzg = zzyVar;
        this.zzh = zzbgbVar;
        this.zzi = zzcfvVar;
        this.zzj = zzaaVar;
        this.zzk = zzbhnVar;
        this.zzl = defaultClock;
        this.zzm = zzfVar;
        this.zzn = zzbjmVar;
        this.zzo = zzbkfVar;
        this.zzp = zzaxVar;
        this.zzq = zzcccVar;
        this.zzr = zzcgpVar;
        this.zzs = zzburVar;
        this.zzu = zzbqVar;
        this.zzt = zzzVar;
        this.zzv = zzaeVar;
        this.zzw = zzafVar;
        this.zzx = zzbvpVar;
        this.zzy = zzbrVar;
        this.zzz = zzemfVar;
        this.zzA = zzbicVar;
        this.zzB = zzcerVar;
        this.zzC = zzcgVar;
        this.zzD = zzcjlVar;
        this.zzE = zzcgwVar;
    }

    public static zzcg zzA() {
        return zza.zzC;
    }

    public static zzcjl zzB() {
        return zza.zzD;
    }

    public static zzcgw zzC() {
        return zza.zzE;
    }

    public static zzcer zzD() {
        return zza.zzB;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zza() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzn zzb() {
        return zza.zzc;
    }

    public static com.google.android.gms.ads.internal.util.zzs zzc() {
        return zza.zzd;
    }

    public static zzcmc zzd() {
        return zza.zze;
    }

    public static zzcge zze() {
        return zza.zzf;
    }

    public static zzz zzf() {
        return zza.zzg;
    }

    public static zzbgb zzg() {
        return zza.zzh;
    }

    public static zzcfv zzh() {
        return zza.zzi;
    }

    public static zzaa zzi() {
        return zza.zzj;
    }

    public static zzbhn zzj() {
        return zza.zzk;
    }

    public static Clock zzk() {
        return zza.zzl;
    }

    public static zzf zzl() {
        return zza.zzm;
    }

    public static zzbjm zzm() {
        return zza.zzn;
    }

    public static zzbkf zzn() {
        return zza.zzo;
    }

    public static zzax zzo() {
        return zza.zzp;
    }

    public static zzccc zzp() {
        return zza.zzq;
    }

    public static zzcgp zzq() {
        return zza.zzr;
    }

    public static zzbur zzr() {
        return zza.zzs;
    }

    public static zzbq zzs() {
        return zza.zzu;
    }

    public static com.google.android.gms.ads.internal.overlay.zzz zzt() {
        return zza.zzt;
    }

    public static zzemg zzu() {
        return zza.zzz;
    }

    public static zzae zzv() {
        return zza.zzv;
    }

    public static zzaf zzw() {
        return zza.zzw;
    }

    public static zzbvp zzx() {
        return zza.zzx;
    }

    public static zzbr zzy() {
        return zza.zzy;
    }

    public static zzbic zzz() {
        return zza.zzA;
    }
}

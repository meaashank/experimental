package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final class zzgne implements zzgmf {
    private final zzggv zza;
    private final zzgpx zzb;
    private final zzgpi zzc;
    private final ExecutorService zzd;
    private final zzgqc zze;
    private final zzgrh zzf;
    private final Object zzg = new Object();
    private final String zzh;
    private final long zzi;
    private final long zzj;
    private final boolean zzk;
    private final boolean zzl;
    private zzgnd zzm;

    public zzgne(zzggv zzggvVar, zziol zziolVar, zzgpx zzgpxVar, zzgpi zzgpiVar, zzgqc zzgqcVar, zzgrh zzgrhVar, zzgei zzgeiVar, ExecutorService executorService) {
        this.zza = zzggvVar;
        this.zzb = zzgpxVar;
        this.zzc = zzgpiVar;
        this.zzd = executorService;
        this.zze = zzgqcVar;
        this.zzf = zzgrhVar;
        this.zzh = zzgeiVar.zzd();
        this.zzi = zzgeiVar.zzm();
        this.zzj = zzgeiVar.zzl();
        this.zzk = zzgeiVar.zzb();
        this.zzl = zzgeiVar.zzc();
    }

    private final ListenableFuture zzs() {
        return zzhcy.zzk(this.zzc.zzf(), new zzgub() { // from class: com.google.android.gms.internal.ads.zzgmy
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzo((byte[]) obj);
                return null;
            }
        }, zzhdp.zza());
    }

    private final void zzt(zzavl zzavlVar, byte[] bArr, boolean z10) {
        zzgrf zzgrfVarZza = this.zzf.zza(20102);
        try {
            try {
                zzgrfVarZza.zza();
                synchronized (this.zzg) {
                    this.zzm = zzgnd.zza(zzavlVar, bArr, z10);
                }
                zzgrfVarZza.zzc();
            } catch (zzavj e10) {
                e = e10;
                zzgrfVarZza.zzb(e);
                throw new zzgmg(2, e);
            } catch (zzavn e11) {
                e = e11;
                zzgrfVarZza.zzb(e);
                throw new zzgmg(2, e);
            } catch (Throwable th) {
                zzgrfVarZza.zzb(th);
                throw th;
            }
        } catch (Throwable th2) {
            zzgrfVarZza.zzc();
            throw th2;
        }
    }

    private final String zzu(Map map) throws zzavj, zzavn {
        String strZzb;
        zzgrh zzgrhVar = this.zzf;
        try {
            zzgrhVar.zza(20110).zza();
            synchronized (this.zzg) {
                try {
                    zzgnd zzgndVar = this.zzm;
                    if (zzgndVar == null) {
                        zzgrhVar.zzb(20109);
                        strZzb = "";
                    } else {
                        strZzb = zzgndVar.zzb(map);
                    }
                } finally {
                }
            }
            return strZzb;
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final String zza() {
        synchronized (this.zzg) {
            try {
                zzgnd zzgndVar = this.zzm;
                if (zzgndVar == null) {
                    return "3.904631200.-1";
                }
                return zzgndVar.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final ListenableFuture zzb() {
        if (this.zzl) {
            return zzs();
        }
        zzhcq zzhcqVarZzw = zzhcq.zzw(this.zzc.zzb());
        ExecutorService executorService = this.zzd;
        return (zzhcq) zzhcy.zzh((zzhcq) zzhcy.zzj((zzhcq) zzhcy.zzg(zzhcqVarZzw, Throwable.class, zzgnc.zza, executorService), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgms
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzi((zzggt) obj);
            }
        }, executorService), Throwable.class, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgmt
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzj((Throwable) obj);
            }
        }, zzhdp.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final ListenableFuture zzc(final Context context) {
        return zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzk(context);
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final ListenableFuture zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzhcy.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgmv
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final ListenableFuture zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzhcy.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgmw
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzm(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final void zzf(InputEvent inputEvent) {
        try {
            synchronized (this.zzg) {
                try {
                    zzgnd zzgndVar = this.zzm;
                    if (zzgndVar != null) {
                        HashMap map = new HashMap();
                        map.put("evt", inputEvent);
                        zzgndVar.zzc(map);
                    } else {
                        this.zzf.zzb(20105);
                    }
                } finally {
                }
            }
        } catch (zzavj | zzavn e10) {
            this.zzf.zzd(20104, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final int zzg() {
        return 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.util.Map r12) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgne.zzh(java.util.Map):void");
    }

    public final /* synthetic */ ListenableFuture zzi(zzggt zzggtVar) {
        if (zzggtVar != null) {
            this.zza.zzd(zzggtVar.zzd());
        }
        if (this.zzb.zzb(zzggtVar)) {
            return zzhcy.zzk(this.zzc.zze(), new zzgub() { // from class: com.google.android.gms.internal.ads.zzgmx
                @Override // com.google.android.gms.internal.ads.zzgub
                public final /* synthetic */ Object apply(Object obj) {
                    this.zza.zzn((byte[]) obj);
                    return null;
                }
            }, zzhdp.zza());
        }
        this.zzf.zzb(20103);
        throw new zzgmg(1);
    }

    public final /* synthetic */ ListenableFuture zzj(Throwable th) {
        return this.zzk ? zzs() : zzhcy.zzc(th);
    }

    public final /* synthetic */ String zzk(final Context context) throws zzavj, zzavn {
        final HashMap map = new HashMap();
        this.zzf.zzf(20106, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgmz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzp(map, context);
            }
        });
        String strZzu = zzu(map);
        map.clear();
        return strZzu;
    }

    public final /* synthetic */ String zzl(final Context context, String str, final View view, final Activity activity) throws zzavj, zzavn {
        final HashMap map = new HashMap();
        final String str2 = null;
        this.zzf.zzf(20106, new Runnable(map, context, view, activity, str2) { // from class: com.google.android.gms.internal.ads.zzgna
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ Activity zze;

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzq(this.zzb, this.zzc, this.zzd, this.zze, null);
            }
        });
        String strZzu = zzu(map);
        map.clear();
        return strZzu;
    }

    public final /* synthetic */ String zzm(final Context context, final String str, final View view, Activity activity) throws zzavj, zzavn {
        final HashMap map = new HashMap();
        final Activity activity2 = null;
        this.zzf.zzf(20106, new Runnable(map, context, view, activity2, str) { // from class: com.google.android.gms.internal.ads.zzgnb
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ String zze;

            {
                this.zze = str;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr(this.zzb, this.zzc, this.zzd, null, this.zze);
            }
        });
        String strZzu = zzu(map);
        map.clear();
        return strZzu;
    }

    public final /* synthetic */ Void zzn(byte[] bArr) {
        zzt(zzgnh.zzc(), bArr, false);
        return null;
    }

    public final /* synthetic */ Void zzo(byte[] bArr) {
        zzt(zzgnh.zzc(), bArr, true);
        return null;
    }

    public final /* synthetic */ void zzp(Map map, Context context) {
        map.putAll(this.zze.zzb());
        zzh(map);
        map.put("f", CampaignEx.JSON_KEY_AD_Q);
        map.put("ctx", context);
    }

    public final /* synthetic */ void zzq(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zze.zzc(context, view));
        zzh(map);
        map.put("f", "v");
        map.put("ctx", context);
        map.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
        map.put("act", activity);
        map.put("bds", null);
    }

    public final /* synthetic */ void zzr(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zze.zzd());
        zzh(map);
        map.put("f", a7.c.f84756a);
        map.put("ctx", context);
        map.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
        map.put("act", null);
        map.put("bds", str);
    }
}

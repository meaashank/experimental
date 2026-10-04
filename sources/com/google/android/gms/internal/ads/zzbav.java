package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbav implements zzbay {

    @Nullable
    private static zzbav zzb;
    private final Context zzc;
    private final zzfzs zzd;
    private final zzfzz zze;
    private final zzgab zzf;
    private final zzbca zzg;
    private final zzfyi zzh;
    private final Executor zzi;
    private final zzbei zzj;
    private final zzfzy zzk;
    private final zzbcp zzm;

    @Nullable
    private final zzbch zzn;

    @Nullable
    private final zzbby zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;

    @e.f0
    volatile long zza = 0;
    private final Object zzp = new Object();
    private final CountDownLatch zzl = new CountDownLatch(1);

    @e.f0
    public zzbav(@NonNull Context context, @NonNull zzfyi zzfyiVar, @NonNull zzfzs zzfzsVar, @NonNull zzfzz zzfzzVar, @NonNull zzgab zzgabVar, @NonNull zzbca zzbcaVar, @NonNull Executor executor, @NonNull zzfyd zzfydVar, zzbei zzbeiVar, @Nullable zzbcp zzbcpVar, @Nullable zzbch zzbchVar, @Nullable zzbby zzbbyVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfyiVar;
        this.zzd = zzfzsVar;
        this.zze = zzfzzVar;
        this.zzf = zzgabVar;
        this.zzg = zzbcaVar;
        this.zzi = executor;
        this.zzj = zzbeiVar;
        this.zzm = zzbcpVar;
        this.zzn = zzbchVar;
        this.zzo = zzbbyVar;
        this.zzr = false;
        this.zzk = new zzbat(this, zzfydVar);
    }

    public static synchronized zzbav zza(@NonNull Context context, @NonNull zzaxc zzaxcVar, boolean z10) {
        zzfyj zzfyjVarZzh;
        zzfyjVarZzh = zzfyk.zzh();
        zzfyjVarZzh.zza(zzaxcVar.zza());
        zzfyjVarZzh.zzb(zzaxcVar.zzb());
        return zzs(context, Executors.newCachedThreadPool(), zzfyjVarZzh.zzh(), z10);
    }

    private static synchronized zzbav zzs(@NonNull Context context, @NonNull Executor executor, zzfyk zzfykVar, boolean z10) {
        try {
            if (zzb == null) {
                zzfyi zzfyiVarZza = zzfyi.zza(context, executor, z10);
                zzbbj zzbbjVarZza = zzbbj.zza(context);
                zzbcp zzbcpVarZza = zzbcp.zza(context, executor);
                zzbch zzbchVar = new zzbch();
                zzbby zzbbyVar = new zzbby();
                zzfyy zzfyyVarZza = zzfyy.zza(context, executor, zzfyiVarZza, zzfykVar);
                zzbbz zzbbzVar = new zzbbz(context);
                zzbca zzbcaVar = new zzbca(zzfykVar, zzfyyVarZza, new zzbcn(context, zzbbzVar), zzbbzVar, zzbbjVarZza, zzbcpVarZza, zzbchVar, zzbbyVar);
                zzbei zzbeiVarZzb = zzfzf.zzb(context, zzfyiVarZza);
                zzfyd zzfydVar = new zzfyd();
                zzbav zzbavVar = new zzbav(context, zzfyiVarZza, new zzfzs(context, zzbeiVarZzb), new zzfzz(context, zzbeiVarZzb, new zzbas(zzfyiVarZza), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdq)).booleanValue()), new zzgab(context, zzbcaVar, zzfyiVarZza, zzfydVar, false), zzbcaVar, executor, zzfydVar, zzbeiVarZzb, zzbcpVarZza, zzbchVar, zzbbyVar);
                zzb = zzbavVar;
                zzbavVar.zzc();
                zzb.zzm();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzb;
    }

    private final zzfzr zzt(int i10) {
        if (zzfzf.zza(this.zzj)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdo)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzb(1);
        }
        return null;
    }

    public final synchronized boolean zzb() {
        return this.zzr;
    }

    public final synchronized void zzc() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfzr zzfzrVarZzt = zzt(1);
        if (zzfzrVarZzt == null) {
            this.zzh.zzb(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zza(zzfzrVarZzt)) {
            this.zzr = true;
            this.zzl.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzd(@Nullable MotionEvent motionEvent) {
        zzfyl zzfylVarZzb = this.zzf.zzb();
        if (zzfylVarZzb != null) {
            try {
                zzfylVarZzb.zzd(null, motionEvent);
            } catch (zzgaa e10) {
                this.zzh.zzc(e10.zza(), -1L, e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zze(int i10, int i11, int i12) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznG)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f10 = i10;
        float f11 = displayMetrics.density;
        float f12 = i11;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f10 * f11, f12 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain);
        motionEventObtain.recycle();
        float f13 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f10 * f13, f12 * f13, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain2);
        motionEventObtain2.recycle();
        float f14 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i12, 1, f10 * f14, f12 * f14, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzf(Context context, String str, @Nullable View view, @Nullable Activity activity) {
        this.zzm.zzb();
        this.zzn.zzc();
        zzm();
        zzfyl zzfylVarZzb = this.zzf.zzb();
        if (zzfylVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfylVarZzb.zzc(context, null, str, view, activity);
        this.zzh.zzd(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzg(Context context, @Nullable String str, @Nullable View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzh(@Nullable View view) {
        this.zzg.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.zzo.zza(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzj(Context context, @Nullable View view, @Nullable Activity activity) {
        this.zzm.zzb();
        this.zzn.zzb(context, view);
        zzm();
        zzfyl zzfylVarZzb = this.zzf.zzb();
        if (zzfylVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfylVarZzb.zzb(context, null, view, activity);
        this.zzh.zzd(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzl(Context context) {
        this.zzm.zzb();
        this.zzn.zza();
        zzm();
        zzfyl zzfylVarZzb = this.zzf.zzb();
        if (zzfylVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfylVarZzb.zza(context, null);
        this.zzh.zzd(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    public final void zzm() {
        if (this.zzq) {
            return;
        }
        synchronized (this.zzp) {
            try {
                if (!this.zzq) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < com.prism.gaia.server.content.e.f167098H) {
                        return;
                    }
                    zzfzr zzfzrVarZzc = this.zzf.zzc();
                    if ((zzfzrVarZzc == null || zzfzrVarZzc.zze(com.prism.gaia.server.content.e.f167098H)) && zzfzf.zza(this.zzj)) {
                        this.zzi.execute(new zzbau(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzn() {
        String str;
        String strZzb;
        int length;
        zzfzr zzfzrVarZzt;
        zzber zzberVarZza;
        boolean zZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfzr zzfzrVarZzt2 = zzt(1);
        if (zzfzrVarZzt2 != null) {
            String strZza = zzfzrVarZzt2.zza().zza();
            strZzb = zzfzrVarZzt2.zza().zzb();
            str = strZza;
        } else {
            str = null;
            strZzb = null;
        }
        try {
            try {
                Context context = this.zzc;
                zzbei zzbeiVar = this.zzj;
                zzfyi zzfyiVar = this.zzh;
                zzfzw zzfzwVarZza = zzfyr.zza(context, 1, zzbeiVar, str, strZzb, "1", zzfyiVar);
                byte[] bArr = zzfzwVarZza.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzfyiVar.zzb(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        zzbek zzbekVarZzd = zzbek.zzd(zziei.zzt(bArr, 0, length), zziew.zzb());
                        if (zzbekVarZzd.zza().zza().isEmpty() || zzbekVarZzd.zza().zzb().isEmpty() || zzbekVarZzd.zzc().zzA().length == 0 || ((zzfzrVarZzt = zzt(1)) != null && (zzberVarZza = zzfzrVarZzt.zza()) != null && zzbekVarZzd.zza().zza().equals(zzberVarZza.zza()) && zzbekVarZzd.zza().zzb().equals(zzberVarZza.zzb()))) {
                            this.zzh.zzb(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            zzfzy zzfzyVar = this.zzk;
                            int i10 = zzfzwVarZza.zzc;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdo)).booleanValue()) {
                                zZza = this.zzd.zza(zzbekVarZzd, zzfzyVar);
                            } else if (i10 == 3) {
                                zZza = this.zze.zzb(zzbekVarZzd);
                            } else {
                                if (i10 == 4) {
                                    zZza = this.zze.zza(zzbekVarZzd, zzfzyVar);
                                }
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zZza) {
                                zzfzr zzfzrVarZzt3 = zzt(1);
                                if (zzfzrVarZzt3 != null) {
                                    if (this.zzf.zza(zzfzrVarZzt3)) {
                                        this.zzr = true;
                                    }
                                    this.zza = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        this.zzh.zzb(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (zzige e10) {
                this.zzh.zzc(4002, System.currentTimeMillis() - jCurrentTimeMillis, e10);
            }
            this.zzl.countDown();
        } catch (Throwable th) {
            this.zzl.countDown();
            throw th;
        }
    }

    public final /* synthetic */ zzfyi zzo() {
        return this.zzh;
    }

    public final /* synthetic */ Object zzp() {
        return this.zzp;
    }

    public final /* synthetic */ boolean zzq() {
        return this.zzq;
    }

    public final /* synthetic */ void zzr(boolean z10) {
        this.zzq = z10;
    }
}

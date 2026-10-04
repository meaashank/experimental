package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfvd {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzfms zzd;
    protected AtomicReference zze;

    @Nullable
    protected final zzftp zzf;
    protected AtomicBoolean zzg;

    @Nullable
    protected com.google.android.gms.ads.internal.client.zzce zzh;
    protected final ScheduledExecutorService zzi;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzcb zzj;
    private final Queue zzk;
    private final zzfty zzl;
    private final String zzm;
    private AtomicBoolean zzn;
    private final zzfpm zzo;
    private AtomicBoolean zzp;
    private zzfuf zzq;
    private final Clock zzr;
    private final zzfum zzs;

    public zzfvd(ClientApi clientApi, Context context, int i10, zzfms zzfmsVar, @NonNull com.google.android.gms.ads.internal.client.zzfp zzfpVar, @Nullable com.google.android.gms.ads.internal.client.zzcb zzcbVar, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull zzfpm zzfpmVar, zzfty zzftyVar, Clock clock) {
        this("none", clientApi, context, i10, zzfmsVar, zzfpVar, scheduledExecutorService, zzfpmVar, zzftyVar, clock, null);
        this.zzj = zzcbVar;
    }

    private final void zzR(boolean z10) {
        zzftp zzftpVar = this.zzf;
        if (zzftpVar != null) {
            if (z10) {
                this.zzl.zzc();
            }
            zzftpVar.zza(this);
        } else {
            zzfty zzftyVar = this.zzl;
            if (zzftyVar.zze()) {
                return;
            }
            if (z10) {
                zzftyVar.zzc();
            }
            this.zzi.schedule(new zzfur(this), zzftyVar.zzb(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzF() {
        boolean z10;
        int i10;
        int i11;
        Queue queue = this.zzk;
        synchronized (queue) {
            try {
                Iterator it = queue.iterator();
                z10 = false;
                i10 = 0;
                while (it.hasNext()) {
                    if (((zzfuo) it.next()).zzb()) {
                        it.remove();
                        i10++;
                    }
                }
                if (i10 > 0 && queue.isEmpty()) {
                    z10 = true;
                }
                i11 = (i10 <= 0 || !queue.isEmpty()) ? i10 : i10 - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        zzftp zzftpVar = this.zzf;
        if (zzftpVar != null && i10 > 0) {
            zzftpVar.zzd(this, i11);
        }
        if (z10) {
            zzT();
        }
    }

    private final void zzT() {
        if (this.zzp.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfuv(this));
        }
        this.zzi.execute(new zzfuw(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
    public final String zzM() {
        return true != "none".equals(this.zzm) ? "2" : "1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static final String zzV(@Nullable com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        if (zzdxVar instanceof zzddi) {
            return ((zzddi) zzdxVar).zzd();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzA(final int r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            if (r11 <= 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2)
            java.util.concurrent.atomic.AtomicReference r2 = r10.zze
            com.google.android.gms.internal.ads.zzfuy r3 = new com.google.android.gms.internal.ads.zzfuy
            r3.<init>()
            java.lang.Object r2 = com.google.android.gms.internal.ads.S0.a(r2, r3)
            com.google.android.gms.ads.internal.client.zzfp r2 = (com.google.android.gms.ads.internal.client.zzfp) r2
            int r3 = r2.zzb
            com.google.android.gms.ads.AdFormat r3 = com.google.android.gms.ads.AdFormat.getAdFormat(r3)
            int r5 = r2.zzd
            java.util.Queue r2 = r10.zzk
            monitor-enter(r2)
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L51
            int r6 = r2.size()     // Catch: java.lang.Throwable -> L51
            if (r6 <= r11) goto L62
            com.google.android.gms.internal.ads.zzbix r6 = com.google.android.gms.internal.ads.zzbjg.zzB     // Catch: java.lang.Throwable -> L51
            com.google.android.gms.internal.ads.zzbje r7 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L51
            java.lang.Object r6 = r7.zzd(r6)     // Catch: java.lang.Throwable -> L51
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L51
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto L62
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L51
            r6.<init>()     // Catch: java.lang.Throwable -> L51
        L43:
            if (r1 >= r11) goto L57
            java.lang.Object r7 = r2.poll()     // Catch: java.lang.Throwable -> L51
            com.google.android.gms.internal.ads.zzfuo r7 = (com.google.android.gms.internal.ads.zzfuo) r7     // Catch: java.lang.Throwable -> L51
            if (r7 == 0) goto L54
            r6.add(r7)     // Catch: java.lang.Throwable -> L51
            goto L54
        L51:
            r0 = move-exception
            r11 = r0
            goto L9a
        L54:
            int r1 = r1 + 1
            goto L43
        L57:
            r2.clear()     // Catch: java.lang.Throwable -> L51
            r2.addAll(r6)     // Catch: java.lang.Throwable -> L51
            int r1 = r6.size()     // Catch: java.lang.Throwable -> L51
            goto L63
        L62:
            r0 = r1
        L63:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L74
            if (r4 <= r1) goto L74
            com.google.android.gms.internal.ads.zzftp r0 = r10.zzf
            if (r0 == 0) goto L74
            int r4 = r4 - r1
            if (r1 != 0) goto L71
            int r4 = r4 + (-1)
        L71:
            r0.zzd(r10, r4)
        L74:
            com.google.android.gms.internal.ads.zzfuf r4 = r10.zzq
            if (r4 == 0) goto L99
            if (r3 == 0) goto L99
            com.google.android.gms.common.util.Clock r0 = r10.zzr
            long r7 = r0.currentTimeMillis()
            com.google.android.gms.internal.ads.zzful r0 = new com.google.android.gms.internal.ads.zzful
            java.util.concurrent.atomic.AtomicReference r1 = r10.zze
            java.lang.Object r1 = r1.get()
            com.google.android.gms.ads.internal.client.zzfp r1 = (com.google.android.gms.ads.internal.client.zzfp) r1
            java.lang.String r1 = r1.zza
            r0.<init>(r1, r3)
            com.google.android.gms.internal.ads.zzfum r9 = new com.google.android.gms.internal.ads.zzfum
            r1 = 0
            r9.<init>(r0, r1)
            r6 = r11
            r4.zzc(r5, r6, r7, r9)
        L99:
            return
        L9a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L51
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfvd.zzA(int):void");
    }

    public final void zzB(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzG)).booleanValue()) {
            Bundle bundle = zzmVar.zzC;
            bundle.putInt("plcs", zzt());
            bundle.putInt("plbs", zzs());
            bundle.putString("plid", this.zzm);
        }
    }

    public final long zzC() {
        long jZzb = zzb();
        if (jZzb >= 0) {
            return jZzb;
        }
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzU)).longValue();
    }

    public final /* synthetic */ void zzD(int i10, zzfuo zzfuoVar, zzfuo zzfuoVar2, long j10, int i11, int i12, boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzQ)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzP)).booleanValue() || i10 == 1) {
                this.zzl.zza();
            }
        }
        if (zzfuoVar != null && zzfuoVar2 != null) {
            AdFormat adFormat = AdFormat.getAdFormat(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb);
            String strZzV = zzV(zzc(zzfuoVar.zza()));
            if (adFormat != null && strZzV != null && zzfuoVar2.zzd() < zzfuoVar.zzd()) {
                this.zzq.zzg(j10, i11, i12, strZzV, this.zzs, zzM());
            }
        }
        zzftp zzftpVar = this.zzf;
        if (zzftpVar != null) {
            zzftpVar.zzb(this);
        } else {
            long jZzC = zzC();
            if (jZzC > 0) {
                this.zzi.schedule(new zzfur(this), jZzC, TimeUnit.MILLISECONDS);
            } else {
                zzy();
            }
        }
        if (z10) {
            zzT();
        }
    }

    public final /* synthetic */ void zzG(Object obj) {
        Object obj2;
        if (obj != null) {
            this.zzl.zza();
            com.google.android.gms.ads.internal.client.zzdx zzdxVarZzc = zzc(obj);
            double dZzk = !(zzdxVarZzc instanceof zzddi) ? 0.0d : ((zzddi) zzdxVarZzc).zzk();
            com.google.android.gms.ads.internal.client.zzdx zzdxVarZzc2 = zzc(obj);
            obj2 = obj;
            zzfuo zzfuoVar = new zzfuo(obj2, this.zzr, dZzk, zzdxVarZzc2 instanceof zzddi ? ((zzddi) zzdxVarZzc2).zzl() : 2);
            Queue queue = this.zzk;
            synchronized (queue) {
                queue.add(zzfuoVar);
            }
            com.google.android.gms.ads.internal.client.zzdx zzdxVarZzc3 = zzc(obj2);
            long jCurrentTimeMillis = this.zzr.currentTimeMillis();
            if (this.zzp.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfus(this, zzdxVarZzc3));
            }
            ScheduledExecutorService scheduledExecutorService = this.zzi;
            scheduledExecutorService.execute(new zzfut(this, jCurrentTimeMillis, zzdxVarZzc3));
            if (this.zzf != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzI)).booleanValue()) {
                    this.zzo.zzb(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvb
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzF();
                        }
                    }, zzfuoVar.zzc(), TimeUnit.MILLISECONDS);
                } else {
                    scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfva
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzE();
                        }
                    }, zzfuoVar.zzc(), TimeUnit.MILLISECONDS);
                }
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzI)).booleanValue()) {
                    this.zzo.zzb(new zzfur(this), zzfuoVar.zzc(), TimeUnit.MILLISECONDS);
                } else {
                    scheduledExecutorService.schedule(new zzfur(this), zzfuoVar.zzc(), TimeUnit.MILLISECONDS);
                }
            }
        } else {
            obj2 = obj;
        }
        this.zzn.set(false);
        if (obj2 == null || this.zzf == null) {
            zzR(obj2 == null);
        }
    }

    public final /* synthetic */ void zzH(Throwable th) {
        this.zzn.set(false);
        if ((th instanceof zzftq) && ((zzftq) th).zza() == 0) {
            throw null;
        }
        zzR(true);
    }

    public final /* synthetic */ void zzI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zzp.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfuu(this, zzeVar));
        }
        this.zzn.set(false);
        int i10 = zzeVar.zza;
        if (i10 != 1 && i10 != 8 && i10 != 10 && i10 != 11) {
            zzR(true);
            return;
        }
        int i11 = ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb;
        String str = ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza;
        int length = String.valueOf(i11).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + length + 26 + 61);
        sb2.append("Preloading ");
        sb2.append(i11);
        sb2.append(", for adUnitId:");
        sb2.append(str);
        sb2.append(", Ad load failed. Stop preloading due to non-retriable error:");
        String string = sb2.toString();
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(string);
        this.zzg.set(false);
        zzftp zzftpVar = this.zzf;
        if (zzftpVar != null) {
            zzftpVar.zza(this);
        }
        zzful zzfulVar = new zzful(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza, zzq());
        zzfulVar.zza(this.zzm);
        this.zzq.zzk(this.zzr.currentTimeMillis(), new zzfum(zzfulVar, null), zzeVar, zzs(), zzt(), zzM());
    }

    public final /* synthetic */ void zzJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zzg(this.zzm, zzeVar);
            } catch (RemoteException unused) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdFailedToPreload");
            }
        }
    }

    public final /* synthetic */ void zzK(com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = this.zzj;
        if (zzcbVar != null) {
            try {
                zzcbVar.zze((com.google.android.gms.ads.internal.client.zzfp) this.zze.get());
            } catch (RemoteException unused) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsAvailable");
            }
        }
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zze(this.zzm, zzdxVar);
            } catch (RemoteException unused2) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdPreloaded");
            }
        }
    }

    public final /* synthetic */ void zzL() {
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = this.zzj;
        if (zzcbVar != null) {
            try {
                zzcbVar.zzf((com.google.android.gms.ads.internal.client.zzfp) this.zze.get());
            } catch (RemoteException unused) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
        }
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zzf(this.zzm);
            } catch (RemoteException unused2) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
        }
    }

    public final /* synthetic */ zzfuf zzN() {
        return this.zzq;
    }

    public final /* synthetic */ Clock zzO() {
        return this.zzr;
    }

    public final /* synthetic */ zzfum zzP() {
        return this.zzs;
    }

    public abstract ListenableFuture zza(Context context);

    public long zzb() {
        throw null;
    }

    @Nullable
    public abstract com.google.android.gms.ads.internal.client.zzdx zzc(Object obj);

    public final zzfvd zzd() {
        this.zzi.submit(new zzfur(this));
        return this;
    }

    public final void zze() {
        if (this.zzn.compareAndSet(false, true)) {
            if (!this.zzg.get() || zzt() >= ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzd) {
                this.zzn.set(false);
            } else {
                this.zzi.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzz();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        boolean zIsEmpty;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzO)).booleanValue()) {
            this.zzl.zza();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzH)).booleanValue() && this.zzf == null) {
            zzy();
        } else {
            zzF();
        }
        Queue queue = this.zzk;
        synchronized (queue) {
            zIsEmpty = queue.isEmpty();
        }
        return !zIsEmpty;
    }

    @Nullable
    public final Object zzg() {
        final zzfuo zzfuoVar;
        final boolean z10;
        final zzfuo zzfuoVar2;
        Queue queue = this.zzk;
        final int iZzt = zzt();
        synchronized (queue) {
            try {
                zzfuoVar = (zzfuo) queue.poll();
                boolean z11 = false;
                if (zzfuoVar != null && queue.isEmpty()) {
                    z11 = true;
                }
                z10 = z11;
                zzfuoVar2 = (zzfuoVar == null || queue.isEmpty()) ? null : (zzfuo) queue.peek();
            } catch (Throwable th) {
                throw th;
            }
        }
        final long jCurrentTimeMillis = this.zzr.currentTimeMillis();
        final int iZzs = zzs();
        final int iZzt2 = zzt();
        this.zzi.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfux
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzD(iZzt, zzfuoVar, zzfuoVar2, jCurrentTimeMillis, iZzs, iZzt2, z10);
            }
        });
        if (zzfuoVar == null) {
            return null;
        }
        return zzfuoVar.zza();
    }

    public final void zzh() {
        this.zzg.set(false);
        this.zzp.set(false);
    }

    public final void zzi() {
        this.zzg.set(false);
    }

    public final void zzj() {
        this.zzg.set(true);
        this.zzp.set(true);
        zzftp zzftpVar = this.zzf;
        if (zzftpVar == null) {
            this.zzi.submit(new zzfur(this));
        } else {
            zzftpVar.zzd(this, 0);
        }
    }

    public final boolean zzk(com.google.android.gms.ads.internal.client.zzfp zzfpVar) {
        return ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).equals(zzfpVar);
    }

    @Nullable
    public final String zzl() {
        zzfuo zzfuoVar;
        Queue queue = this.zzk;
        synchronized (queue) {
            zzfuoVar = (zzfuo) queue.peek();
        }
        Object objZza = zzfuoVar == null ? null : zzfuoVar.zza();
        return zzV(objZza != null ? zzc(objZza) : null);
    }

    public final void zzm(zzfuf zzfufVar) {
        this.zzq = zzfufVar;
    }

    public final void zzn(int i10) {
        Preconditions.checkArgument(i10 >= 5);
        this.zzl.zzf(i10);
    }

    public final com.google.android.gms.ads.internal.client.zzfp zzo() {
        return (com.google.android.gms.ads.internal.client.zzfp) this.zze.get();
    }

    public final String zzp() {
        return this.zzm;
    }

    @Nullable
    public final AdFormat zzq() {
        return AdFormat.getAdFormat(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb);
    }

    public final String zzr() {
        return ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza;
    }

    public final int zzs() {
        return ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzd;
    }

    public final int zzt() {
        int size;
        Queue queue = this.zzk;
        synchronized (queue) {
            size = queue.size();
        }
        return size;
    }

    public final boolean zzu() {
        if (!this.zzg.get() || this.zzn.get() || zzt() >= zzs()) {
            return false;
        }
        zzfty zzftyVar = this.zzl;
        return (zzftyVar.zzd() || zzftyVar.zze()) ? false : true;
    }

    public final void zzv() {
        Queue queue = this.zzk;
        synchronized (queue) {
            queue.clear();
        }
    }

    public final boolean zzw() {
        return this.zzn.get();
    }

    public final int zzx() {
        int iZzt = zzt();
        int i10 = iZzt - 1;
        if (!this.zzn.get()) {
            iZzt = i10;
        }
        return Math.max(iZzt, 0);
    }

    public final void zzy() {
        zzF();
        if (this.zzn.compareAndSet(false, true)) {
            if (!this.zzg.get() || zzt() >= ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzd) {
                this.zzn.set(false);
            } else {
                zzz();
            }
        }
    }

    public final void zzz() {
        ListenableFuture listenableFutureZza;
        Activity activityZzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
        if (activityZzd == null) {
            String strValueOf = String.valueOf(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza);
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Empty activity context at preloading: ".concat(strValueOf));
            listenableFutureZza = zza(this.zzb);
        } else {
            listenableFutureZza = zza(activityZzd);
        }
        zzhcy.zzr(listenableFutureZza, new zzfup(this), this.zzi);
    }

    public zzfvd(String str, ClientApi clientApi, Context context, int i10, zzfms zzfmsVar, @NonNull com.google.android.gms.ads.internal.client.zzfp zzfpVar, @Nullable com.google.android.gms.ads.internal.client.zzce zzceVar, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull zzfpm zzfpmVar, zzfty zzftyVar, Clock clock, @Nullable zzftp zzftpVar) {
        this(str, clientApi, context, i10, zzfmsVar, zzfpVar, scheduledExecutorService, zzfpmVar, zzftyVar, clock, zzftpVar);
        this.zzh = zzceVar;
    }

    private zzfvd(String str, ClientApi clientApi, Context context, int i10, zzfms zzfmsVar, @NonNull com.google.android.gms.ads.internal.client.zzfp zzfpVar, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull zzfpm zzfpmVar, zzfty zzftyVar, Clock clock, @Nullable zzftp zzftpVar) {
        Queue priorityQueue;
        this.zzm = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i10;
        this.zzd = zzfmsVar;
        this.zze = new AtomicReference(zzfpVar);
        int iMax = Math.max(1, zzfpVar.zzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzag)).booleanValue()) {
            priorityQueue = new zzfvg();
        } else {
            priorityQueue = new PriorityQueue(iMax, zzfuz.zza);
        }
        this.zzk = priorityQueue;
        this.zzg = new AtomicBoolean(true);
        this.zzn = new AtomicBoolean(false);
        this.zzi = scheduledExecutorService;
        this.zzo = zzfpmVar;
        this.zzl = zzftyVar;
        this.zzp = new AtomicBoolean(true);
        this.zzr = clock;
        zzful zzfulVar = new zzful(zzfpVar.zza, AdFormat.getAdFormat(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb));
        zzfulVar.zza(str);
        this.zzs = new zzfum(zzfulVar, null);
        this.zzf = zzftpVar;
    }
}

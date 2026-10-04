package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfoh {
    private final zzfnl zza;
    private final zzfoe zzb;
    private final zzfnh zzc;
    private zzfon zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfoh(zzfnl zzfnlVar, zzfnh zzfnhVar, zzfoe zzfoeVar) {
        this.zza = zzfnlVar;
        this.zzc = zzfnhVar;
        this.zzb = zzfoeVar;
        zzfnhVar.zza(new zzfng() { // from class: com.google.android.gms.internal.ads.zzfog
            @Override // com.google.android.gms.internal.ads.zzfng
            public final /* synthetic */ void zza() {
                this.zza.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        r3 = new com.google.android.gms.internal.ads.zzfon(r4.zza, r4.zzb, r0);
        r4.zze = r3;
        r3.zza(new com.google.android.gms.internal.ads.zzfoc(r4, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzd() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzbix r0 = com.google.android.gms.internal.ads.zzbjg.zzhq     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzbje r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2e
            com.google.android.gms.internal.ads.zzcfv r0 = com.google.android.gms.ads.internal.zzt.zzh()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzp()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzcfq r0 = r0.zzi()     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.zzi()     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L2e
            java.util.ArrayDeque r0 = r4.zzd     // Catch: java.lang.Throwable -> L2c
            r0.clear()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r4)
            return
        L2c:
            r0 = move-exception
            goto L6d
        L2e:
            boolean r0 = r4.zzi()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L6b
        L34:
            java.util.ArrayDeque r0 = r4.zzd     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L6b
            java.lang.Object r0 = r0.pollFirst()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzfof r0 = (com.google.android.gms.internal.ads.zzfof) r0     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L56
            com.google.android.gms.internal.ads.zzfnv r1 = r0.zzb()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L34
            com.google.android.gms.internal.ads.zzfnl r1 = r4.zza     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzfnv r2 = r0.zzb()     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r1.zzc(r2)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L34
        L56:
            com.google.android.gms.internal.ads.zzfnl r1 = r4.zza     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzfoe r2 = r4.zzb     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzfon r3 = new com.google.android.gms.internal.ads.zzfon     // Catch: java.lang.Throwable -> L2c
            r3.<init>(r1, r2, r0)     // Catch: java.lang.Throwable -> L2c
            r4.zze = r3     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzfoc r1 = new com.google.android.gms.internal.ads.zzfoc     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L2c
            r3.zza(r1)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r4)
            return
        L6b:
            monitor-exit(r4)
            return
        L6d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfoh.zzd():void");
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized void zza(zzfof zzfofVar) {
        this.zzd.add(zzfofVar);
    }

    @Nullable
    public final synchronized ListenableFuture zzb(zzfof zzfofVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzb(zzfofVar);
    }

    public final /* synthetic */ void zzc() {
        synchronized (this) {
            this.zzf = 1;
            zzd();
        }
    }

    public final /* synthetic */ ArrayDeque zze() {
        return this.zzd;
    }

    public final /* synthetic */ void zzf(zzfon zzfonVar) {
        this.zze = null;
    }

    public final /* synthetic */ int zzg() {
        return this.zzf;
    }
}

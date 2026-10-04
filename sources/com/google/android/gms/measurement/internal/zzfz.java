package com.google.android.gms.measurement.internal;

import e.InterfaceC4326A;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfz<V> {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzfx<V> zzc;
    private final V zzd;
    private final Object zze;

    @InterfaceC4326A("overrideLock")
    private volatile V zzf;

    @InterfaceC4326A("cachingLock")
    private volatile V zzg;

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V zza(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zze
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L7
            return r4
        L7:
            com.google.android.gms.measurement.internal.zzab r4 = com.google.android.gms.measurement.internal.zzga.zza
            if (r4 != 0) goto Le
            V r4 = r3.zzd
            return r4
        Le:
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzfz.zza
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.zzab.zza()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L24
            V r0 = r3.zzg     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L20
            V r0 = r3.zzd     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r0 = move-exception
            goto L6c
        L20:
            V r0 = r3.zzg     // Catch: java.lang.Throwable -> L1e
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            return r0
        L24:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            java.util.List r4 = com.google.android.gms.measurement.internal.zzbh.zzdl()     // Catch: java.lang.SecurityException -> L5a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L5a
        L2d:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L5a
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L5a
            com.google.android.gms.measurement.internal.zzfz r0 = (com.google.android.gms.measurement.internal.zzfz) r0     // Catch: java.lang.SecurityException -> L5a
            boolean r1 = com.google.android.gms.measurement.internal.zzab.zza()     // Catch: java.lang.SecurityException -> L5a
            if (r1 != 0) goto L52
            r1 = 0
            com.google.android.gms.measurement.internal.zzfx<V> r2 = r0.zzc     // Catch: java.lang.IllegalStateException -> L48 java.lang.SecurityException -> L5a
            if (r2 == 0) goto L48
            java.lang.Object r1 = r2.zza()     // Catch: java.lang.IllegalStateException -> L48 java.lang.SecurityException -> L5a
        L48:
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzfz.zza     // Catch: java.lang.SecurityException -> L5a
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L5a
            r0.zzg = r1     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            goto L2d
        L4f:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            throw r4     // Catch: java.lang.SecurityException -> L5a
        L52:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L5a
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L5a
            throw r4     // Catch: java.lang.SecurityException -> L5a
        L5a:
            com.google.android.gms.measurement.internal.zzfx<V> r4 = r3.zzc
            if (r4 != 0) goto L61
            V r4 = r3.zzd
            return r4
        L61:
            java.lang.Object r4 = r4.zza()     // Catch: java.lang.IllegalStateException -> L66 java.lang.SecurityException -> L69
            return r4
        L66:
            V r4 = r3.zzd
            return r4
        L69:
            V r4 = r3.zzd
            return r4
        L6c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            throw r0
        L6e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfz.zza(java.lang.Object):java.lang.Object");
    }

    private zzfz(String str, V v10, V v11, zzfx<V> zzfxVar) {
        this.zze = new Object();
        this.zzf = null;
        this.zzg = null;
        this.zzb = str;
        this.zzd = v10;
        this.zzc = zzfxVar;
    }

    public final String zza() {
        return this.zzb;
    }
}

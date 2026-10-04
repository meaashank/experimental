package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import e.I;
import e.f0;

/* JADX INFO: loaded from: classes4.dex */
@I
@f0
final class zzkz implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zzjq zza;

    public zzkz(zzjq zzjqVar) {
        this.zza = zzjqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2 A[Catch: RuntimeException -> 0x002a, TryCatch #0 {RuntimeException -> 0x002a, blocks: (B:3:0x000d, B:5:0x001a, B:11:0x002e, B:40:0x00a7, B:42:0x00b3, B:48:0x00cc, B:50:0x00d2, B:53:0x00df, B:55:0x00e5, B:56:0x00f8, B:57:0x0104, B:60:0x010c, B:64:0x012f, B:66:0x014b, B:65:0x013c, B:68:0x0152, B:70:0x0158, B:72:0x015e, B:74:0x0164, B:76:0x016a, B:78:0x0172, B:80:0x017a, B:82:0x0180, B:84:0x0186, B:15:0x0042, B:18:0x004a, B:20:0x0052, B:22:0x0058, B:24:0x005e, B:26:0x0064, B:28:0x006c, B:30:0x0074, B:32:0x007c, B:34:0x0084, B:35:0x0090, B:37:0x009e), top: B:88:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zza(com.google.android.gms.measurement.internal.zzkz r17, boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkz.zza(com.google.android.gms.measurement.internal.zzkz, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityCreated(android.app.Activity r9, android.os.Bundle r10) throws java.lang.Throwable {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.zzjq r0 = r8.zza     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            com.google.android.gms.measurement.internal.zzgo r0 = r0.zzj()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            com.google.android.gms.measurement.internal.zzgq r0 = r0.zzp()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            java.lang.String r1 = "onActivityCreated"
            r0.zza(r1)     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            android.content.Intent r0 = r9.getIntent()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            if (r0 != 0) goto L1f
            com.google.android.gms.measurement.internal.zzjq r0 = r8.zza
            com.google.android.gms.measurement.internal.zzlj r0 = r0.zzn()
            r0.zza(r9, r10)
            return
        L1f:
            android.net.Uri r1 = r0.getData()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            if (r1 == 0) goto L35
            boolean r2 = r1.isHierarchical()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            if (r2 == 0) goto L35
        L2b:
            r5 = r1
            goto L4e
        L2d:
            r0 = move-exception
            r3 = r8
            goto Lb7
        L31:
            r0 = move-exception
            r3 = r8
            goto L9e
        L35:
            android.os.Bundle r1 = r0.getExtras()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            if (r1 == 0) goto L4c
            java.lang.String r2 = "com.android.vending.referral_url"
            java.lang.String r1 = r1.getString(r2)     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            if (r2 != 0) goto L4c
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            goto L2b
        L4c:
            r1 = 0
            goto L2b
        L4e:
            if (r5 == 0) goto L56
            boolean r1 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            if (r1 != 0) goto L58
        L56:
            r3 = r8
            goto L94
        L58:
            com.google.android.gms.measurement.internal.zzjq r1 = r8.zza     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            r1.zzq()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            boolean r0 = com.google.android.gms.measurement.internal.zzos.zza(r0)     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            if (r0 == 0) goto L67
            java.lang.String r0 = "gs"
        L65:
            r6 = r0
            goto L6a
        L67:
            java.lang.String r0 = "auto"
            goto L65
        L6a:
            java.lang.String r0 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            if (r10 != 0) goto L75
            r0 = 1
        L73:
            r4 = r0
            goto L77
        L75:
            r0 = 0
            goto L73
        L77:
            com.google.android.gms.measurement.internal.zzjq r0 = r8.zza     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            com.google.android.gms.measurement.internal.zzhv r0 = r0.zzl()     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            com.google.android.gms.measurement.internal.zzlc r2 = new com.google.android.gms.measurement.internal.zzlc     // Catch: java.lang.Throwable -> L2d java.lang.RuntimeException -> L31
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L90 java.lang.RuntimeException -> L92
            r0.zzb(r2)     // Catch: java.lang.Throwable -> L90 java.lang.RuntimeException -> L92
            com.google.android.gms.measurement.internal.zzjq r0 = r3.zza
            com.google.android.gms.measurement.internal.zzlj r0 = r0.zzn()
            r0.zza(r9, r10)
            return
        L90:
            r0 = move-exception
            goto Lb7
        L92:
            r0 = move-exception
            goto L9e
        L94:
            com.google.android.gms.measurement.internal.zzjq r0 = r3.zza
            com.google.android.gms.measurement.internal.zzlj r0 = r0.zzn()
            r0.zza(r9, r10)
            return
        L9e:
            com.google.android.gms.measurement.internal.zzjq r1 = r3.zza     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.zzgo r1 = r1.zzj()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.zzgq r1 = r1.zzg()     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = "Throwable caught in onActivityCreated"
            r1.zza(r2, r0)     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.zzjq r0 = r3.zza
            com.google.android.gms.measurement.internal.zzlj r0 = r0.zzn()
            r0.zza(r9, r10)
            return
        Lb7:
            com.google.android.gms.measurement.internal.zzjq r1 = r3.zza
            com.google.android.gms.measurement.internal.zzlj r1 = r1.zzn()
            r1.zza(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkz.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzn().zza(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @I
    public final void onActivityPaused(Activity activity) {
        this.zza.zzn().zzb(activity);
        zznb zznbVarZzp = this.zza.zzp();
        zznbVarZzp.zzl().zzb(new zznd(zznbVarZzp, zznbVarZzp.zzb().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @I
    public final void onActivityResumed(Activity activity) {
        zznb zznbVarZzp = this.zza.zzp();
        zznbVarZzp.zzl().zzb(new zzne(zznbVarZzp, zznbVarZzp.zzb().elapsedRealtime()));
        this.zza.zzn().zzc(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzn().zzb(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class zzfdt implements zzfdi {
    private final zzhdi zza;
    private final Context zzb;
    private final zzeez zzc;

    @Nullable
    private final String zzd;

    public zzfdt(zzhdi zzhdiVar, Context context, zzeez zzeezVar, @Nullable String str) {
        this.zza = zzhdiVar;
        this.zzb = context;
        this.zzc = zzeezVar;
        this.zzd = str;
    }

    @Nullable
    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfds
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 38;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0137 A[PHI: r1
      0x0137: PHI (r1v17 java.lang.String) = (r1v7 java.lang.String), (r1v7 java.lang.String), (r1v7 java.lang.String), (r1v8 java.lang.String) binds: [B:36:0x0135, B:39:0x0153, B:40:0x0155, B:79:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzfdr zzc() {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfdt.zzc():com.google.android.gms.internal.ads.zzfdr");
    }
}

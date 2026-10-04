package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import t7.C5617a;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfdx implements zzfdi {
    private final zzhdi zza;
    private final Context zzb;

    public zzfdx(zzhdi zzhdiVar, Context context) {
        this.zza = zzhdiVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfdw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 39;
    }

    public final /* synthetic */ zzfdv zzc() {
        boolean zIsActiveNetworkMetered;
        int i10;
        Context context = this.zzb;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzt.zzc();
        int i11 = -1;
        if (com.google.android.gms.ads.internal.util.zzs.zzD(context, s3.e.f238487b)) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(C5617a.f239212e);
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                i10 = type;
                i11 = iOrdinal;
            } else {
                i10 = -1;
            }
            zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        } else {
            zIsActiveNetworkMetered = false;
            i10 = -2;
        }
        return new zzfdv(networkOperator, i10, com.google.android.gms.ads.internal.zzt.zzf().zzk(context), phoneType, zIsActiveNetworkMetered, i11);
    }
}

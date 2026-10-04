package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfcs implements zzfdi {
    private final zzcer zza;
    private final zzhdi zzb;
    private final Context zzc;

    public zzfcs(zzcer zzcerVar, zzhdi zzhdiVar, Context context) {
        this.zza = zzcerVar;
        this.zzb = zzhdiVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 34;
    }

    public final /* synthetic */ zzfct zzc() {
        zzcer zzcerVar = this.zza;
        Context context = this.zzc;
        if (!zzcerVar.zzb(context)) {
            return new zzfct(null, null, null, null, null);
        }
        String strZzi = zzcerVar.zzi(context);
        String str = strZzi == null ? "" : strZzi;
        String strZzj = zzcerVar.zzj(context);
        String str2 = strZzj == null ? "" : strZzj;
        String strZzk = zzcerVar.zzk(context);
        String str3 = strZzk == null ? "" : strZzk;
        String str4 = true != zzcerVar.zzb(context) ? null : "fa";
        return new zzfct(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzba) : null);
    }
}

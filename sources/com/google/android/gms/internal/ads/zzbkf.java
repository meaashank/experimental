package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbkf extends v.f {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    @Nullable
    private Context zzc;

    @Nullable
    private zzeaj zzd;

    @Nullable
    private androidx.browser.customtabs.b zze;

    @Nullable
    private androidx.browser.customtabs.a zzf;

    private final void zzf(@Nullable Context context) {
        String strI;
        if (this.zzf != null || context == null || (strI = androidx.browser.customtabs.a.i(context, null, false)) == null || strI.equals(context.getPackageName())) {
            return;
        }
        androidx.browser.customtabs.a.b(context, strI, this);
    }

    @Override // v.f
    public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull androidx.browser.customtabs.a aVar) {
        this.zzf = aVar;
        aVar.n(0L);
        this.zze = aVar.k(new zzbkc(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final void zza(Context context, zzeaj zzeajVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzeajVar;
        zzf(context);
    }

    @Nullable
    public final androidx.browser.customtabs.b zzb() {
        if (this.zze == null) {
            zzcgj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbke
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
        }
        return this.zze;
    }

    @e.f0
    public final void zzc(final int i10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfH)).booleanValue() || this.zzd == null) {
            return;
        }
        zzcgj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbkd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(i10);
            }
        });
    }

    public final /* synthetic */ void zzd() {
        zzf(this.zzc);
    }

    public final /* synthetic */ void zze(int i10) {
        zzeaj zzeajVar = this.zzd;
        if (zzeajVar != null) {
            zzeai zzeaiVarZza = zzeajVar.zza();
            zzeaiVarZza.zzc("action", "cct_nav");
            zzeaiVarZza.zzc("cct_navs", String.valueOf(i10));
            zzeaiVarZza.zzd();
        }
    }
}

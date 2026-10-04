package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzbop;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcdm;
import com.google.android.gms.internal.ads.zzcfe;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaw {
    private final zzk zza;
    private final zzi zzb;
    private final zzfc zzc;
    private final zzboo zzd;
    private final zzbzq zze;
    private zzcas zzf;
    private final zzl zzg;

    public zzaw(zzk zzkVar, zzi zziVar, zzfc zzfcVar, zzboo zzbooVar, zzcdm zzcdmVar, zzbzq zzbzqVar, zzbop zzbopVar, zzl zzlVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzfcVar;
        this.zzd = zzbooVar;
        this.zze = zzbzqVar;
        this.zzg = zzlVar;
    }

    public static /* synthetic */ void zzl(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zza().zzi(context, zzay.zzg().afmaVersion, "gmob-apps", bundle, true);
    }

    public final zzbu zza(Context context, zzr zzrVar, String str, zzbvu zzbvuVar) {
        return (zzbu) new zzam(this, context, zzrVar, str, zzbvuVar).zzd(context, false);
    }

    public final zzbu zzb(Context context, zzr zzrVar, String str, zzbvu zzbvuVar) {
        return (zzbu) new zzan(this, context, zzrVar, str, zzbvuVar).zzd(context, false);
    }

    public final zzbq zzc(Context context, String str, zzbvu zzbvuVar) {
        return (zzbq) new zzap(this, context, str, zzbvuVar).zzd(context, false);
    }

    public final zzch zzd(Context context, zzbvu zzbvuVar) {
        return (zzch) new zzar(this, context, zzbvuVar).zzd(context, false);
    }

    public final zzbmz zze(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbmz) new zzav(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzcda zzf(Context context, String str, zzbvu zzbvuVar) {
        return (zzcda) new zzaa(this, context, str, zzbvuVar).zzd(context, false);
    }

    @Nullable
    public final zzbzt zzg(Activity activity) {
        zzac zzacVar = new zzac(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("useClientJar flag not found in activity intent extras.");
        }
        return (zzbzt) zzacVar.zzd(activity, booleanExtra);
    }

    @Nullable
    public final zzdt zzh(Context context, zzbvu zzbvuVar) {
        return (zzdt) new zzae(this, context, zzbvuVar).zzd(context, false);
    }

    @Nullable
    public final zzcfe zzi(Context context, zzbvu zzbvuVar) {
        return (zzcfe) new zzag(this, context, zzbvuVar).zzd(context, false);
    }

    @Nullable
    public final zzbzm zzj(Context context, zzbvu zzbvuVar) {
        return (zzbzm) new zzai(this, context, zzbvuVar).zzd(context, false);
    }

    public final zzbrl zzk(Context context, zzbvu zzbvuVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbrl) new zzak(this, context, zzbvuVar, onH5AdsEventListener).zzd(context, false);
    }

    public final /* synthetic */ zzk zzm() {
        return this.zza;
    }

    public final /* synthetic */ zzi zzn() {
        return this.zzb;
    }

    public final /* synthetic */ zzfc zzo() {
        return this.zzc;
    }

    public final /* synthetic */ zzboo zzp() {
        return this.zzd;
    }

    public final /* synthetic */ zzbzq zzq() {
        return this.zze;
    }

    public final /* synthetic */ zzcas zzr() {
        return this.zzf;
    }

    public final /* synthetic */ void zzs(zzcas zzcasVar) {
        this.zzf = zzcasVar;
    }

    public final /* synthetic */ zzl zzt() {
        return this.zzg;
    }
}

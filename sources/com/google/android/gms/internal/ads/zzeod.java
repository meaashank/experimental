package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeod implements zzemq {
    private final Context zza;
    private final zzdoe zzb;
    private final Executor zzc;
    private final zzflc zzd;
    private final zzeaj zze;

    public zzeod(Context context, Executor executor, zzdoe zzdoeVar, zzflc zzflcVar, zzeaj zzeajVar) {
        this.zza = context;
        this.zzb = zzdoeVar;
        this.zzc = executor;
        this.zzd = zzflcVar;
        this.zze = zzeajVar;
    }

    @Nullable
    private static String zze(zzfld zzfldVar) {
        try {
            return zzfldVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean zza(zzflo zzfloVar, zzfld zzfldVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbkh.zza(context) && !TextUtils.isEmpty(zze(zzfldVar));
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ListenableFuture zzb(final zzflo zzfloVar, final zzfld zzfldVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoT)).booleanValue()) {
            zzeai zzeaiVarZza = this.zze.zza();
            zzeaiVarZza.zzc("action", "cstm_tbs_rndr");
            zzeaiVarZza.zzd();
        }
        String strZze = zze(zzfldVar);
        final Uri uri = strZze != null ? Uri.parse(strZze) : null;
        final zzflg zzflgVar = zzfloVar.zzb.zzb;
        return zzhcy.zzj(zzhcy.zza(null), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzeoc
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(uri, zzfloVar, zzfldVar, zzflgVar, obj);
            }
        }, this.zzc);
    }

    public final /* synthetic */ ListenableFuture zzc(Uri uri, zzflo zzfloVar, zzfld zzfldVar, zzflg zzflgVar, Object obj) {
        try {
            CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
            customTabsIntentBuild.f86571a.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(customTabsIntentBuild.f86571a, null);
            zzcgo zzcgoVar = new zzcgo();
            zzdmy zzdmyVarZzd = this.zzb.zzd(new zzczb(zzfloVar, zzfldVar, null), new zzdnb(new zzeob(this, zzcgoVar, zzfldVar), null));
            zzcgoVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zzdmyVarZzd.zzi(), null, new VersionInfoParcel(0, 0, false), null, null, zzflgVar.zzb));
            this.zzd.zzd();
            return zzhcy.zza(zzdmyVarZzd.zzh());
        } catch (Throwable th) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    public final /* synthetic */ zzeaj zzd() {
        return this.zze;
    }
}

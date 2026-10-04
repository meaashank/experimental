package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class zzevg implements zzfdg {
    final zzflw zza;
    private final long zzb;
    private final long zzc;

    public zzevg(zzflw zzflwVar, long j10, long j11) {
        this.zza = zzflwVar;
        this.zzb = j10;
        this.zzc = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzflw zzflwVar = this.zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflwVar.zzd;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", zzflwVar.zzg);
        int i10 = zzflwVar.zzp.zza;
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i11 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        long j10 = this.zzb;
        bundle.putLong("start_signals_timestamp", j10);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpo)).booleanValue()) {
            bundle.putLong("tsi", j10 - this.zzc);
        }
        zzfml.zzd(bundle, "is_sdk_preload", true, zzmVar.zzc());
        zzfml.zzb(bundle, "prefetch_type", "zenith_v2", zzmVar.zzd());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j11 = zzmVar.zzb;
        zzfml.zzb(bundle, "cust_age", simpleDateFormat.format(new Date(j11)), j11 != -1);
        zzfml.zzf(bundle, "extras", zzmVar.zzc);
        int i12 = zzmVar.zzd;
        zzfml.zzc(bundle, "cust_gender", i12, i12 != -1);
        zzfml.zzg(bundle, "kw", zzmVar.zze);
        int i13 = zzmVar.zzg;
        zzfml.zzc(bundle, "tag_for_child_directed_treatment", i13, i13 != -1);
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.zzy);
        int i14 = zzmVar.zza;
        zzfml.zzc(bundle, "d_imp_hdr", 1, i14 >= 2 && zzmVar.zzh);
        String str = zzmVar.zzi;
        zzfml.zzb(bundle, "ppid", str, i14 >= 2 && !TextUtils.isEmpty(str));
        Location location = zzmVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong("lat", (long) latitude);
            bundle2.putLong("long", (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        zzfml.zze(bundle, "url", zzmVar.zzl);
        zzfml.zzg(bundle, "neighboring_content_urls", zzmVar.zzv);
        zzfml.zzf(bundle, "custom_targeting", zzmVar.zzn);
        zzfml.zzg(bundle, "category_exclusions", zzmVar.zzo);
        zzfml.zze(bundle, "request_agent", zzmVar.zzp);
        zzfml.zze(bundle, "request_pkg", zzmVar.zzq);
        zzfml.zzd(bundle, "is_designed_for_families", zzmVar.zzr, i14 >= 7);
        if (i14 >= 8) {
            int i15 = zzmVar.zzt;
            zzfml.zzc(bundle, "tag_for_under_age_of_consent", i15, i15 != -1);
            zzfml.zze(bundle, "max_ad_content_rating", zzmVar.zzu);
        }
        int i16 = zzmVar.zzB;
        zzfml.zzc(bundle, "tfat", i16, i16 != -1);
        Bundle bundle3 = zzflwVar.zze;
        zzfml.zzh(bundle, "plcs", Integer.valueOf(bundle3.getInt("plcs")));
        zzfml.zzh(bundle, "plbs", Integer.valueOf(bundle3.getInt("plbs")));
        zzfml.zze(bundle, "plid", bundle3.getString("plid"));
        zzfml.zzc(bundle, "s2s_rr", 1, zzflwVar.zzv && !(zzmVar.zzs == null && zzmVar.zzx == null));
    }
}

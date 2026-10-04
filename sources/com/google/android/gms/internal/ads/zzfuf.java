package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.android.gms.ads.AdFormat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfuf {
    private final zzeaj zza;

    public zzfuf(zzeaj zzeajVar, Context context) {
        this.zza = zzeajVar;
    }

    private final void zzv(String str, long j10, @Nullable String str2, @Nullable String str3, AdFormat adFormat, int i10, int i11, int i12, String str4) {
        zzeai zzeaiVarZza = this.zza.zza();
        zzeaiVarZza.zzc("action", str);
        zzeaiVarZza.zzc("pat", Long.toString(j10));
        zzeaiVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, adFormat.name().toLowerCase(Locale.ENGLISH));
        zzeaiVarZza.zzc("max_ads", Integer.toString(i10));
        zzeaiVarZza.zzc("cache_size", Integer.toString(i11));
        zzeaiVarZza.zzc("pas", Integer.toString(i12));
        zzeaiVarZza.zzc("pv", "2");
        zzeaiVarZza.zzc(MintegralConstants.AD_UNIT_ID, str3);
        zzeaiVarZza.zzc("pid", str2);
        zzeaiVarZza.zzd();
    }

    private final void zzw(@Nullable String str, String str2, long j10, int i10, int i11, @Nullable String str3, @Nullable zzfum zzfumVar, String str4) {
        zzeai zzeaiVarZza = this.zza.zza();
        zzeaiVarZza.zzc(str2, Long.toString(j10));
        if (zzfumVar != null) {
            zzeaiVarZza.zzc(MintegralConstants.AD_UNIT_ID, zzfumVar.zza());
            zzeaiVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfumVar.zzb());
            zzeaiVarZza.zzc("pid", zzfumVar.zzc());
        }
        zzeaiVarZza.zzc("action", str);
        if (str3 != null) {
            zzeaiVarZza.zzc("gqi", str3);
        }
        if (i10 >= 0) {
            zzeaiVarZza.zzc("max_ads", Integer.toString(i10));
        }
        if (i11 >= 0) {
            zzeaiVarZza.zzc("cache_size", Integer.toString(i11));
        }
        zzeaiVarZza.zzc("pv", str4);
        zzeaiVarZza.zzd();
    }

    private final void zzx(String str, long j10, String str2, String str3, @Nullable AdFormat adFormat, int i10, int i11, int i12, int i13, int i14) {
        zzeai zzeaiVarZza = this.zza.zza();
        zzeaiVarZza.zzc("action", str);
        zzeaiVarZza.zzc("pat", Long.toString(j10));
        zzeaiVarZza.zzc("pid", str2);
        zzeaiVarZza.zzc(MintegralConstants.AD_UNIT_ID, str3);
        zzeaiVarZza.zzc("max_ads", Integer.toString(i10));
        zzeaiVarZza.zzc("cache_size", Integer.toString(i11));
        zzeaiVarZza.zzc("tpcnt", Integer.toString(i13));
        zzeaiVarZza.zzc("mpl", Integer.toString(i14));
        if (adFormat != null) {
            zzeaiVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        if (i12 > 0) {
            zzeaiVarZza.zzc("nptr", Integer.toString(i12));
        }
        zzeaiVarZza.zzd();
    }

    public final void zza(int i10, long j10, zzfum zzfumVar, String str) {
        zzeai zzeaiVarZza = this.zza.zza();
        zzeaiVarZza.zzc("action", "start_preload");
        zzeaiVarZza.zzc("sp_ts", Long.toString(j10));
        zzeaiVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfumVar.zzb());
        zzeaiVarZza.zzc(MintegralConstants.AD_UNIT_ID, zzfumVar.zza());
        zzeaiVarZza.zzc("pid", zzfumVar.zzc());
        zzeaiVarZza.zzc("max_ads", Integer.toString(i10));
        zzeaiVarZza.zzc("pv", str);
        zzeaiVarZza.zzd();
    }

    public final void zzb(Map map, long j10, String str) {
        zzeai zzeaiVarZza = this.zza.zza();
        zzeaiVarZza.zzc("action", "start_preload");
        zzeaiVarZza.zzc("sp_ts", Long.toString(j10));
        zzeaiVarZza.zzc("pv", "1");
        for (AdFormat adFormat : map.keySet()) {
            String strValueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            zzeaiVarZza.zzc(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zzeaiVarZza.zzd();
    }

    public final void zzc(int i10, int i11, long j10, zzfum zzfumVar) {
        zzeai zzeaiVarZza = this.zza.zza();
        zzeaiVarZza.zzc("action", "cache_resize");
        zzeaiVarZza.zzc("cs_ts", Long.toString(j10));
        zzeaiVarZza.zzc("orig_ma", Integer.toString(i10));
        zzeaiVarZza.zzc("max_ads", Integer.toString(i11));
        zzeaiVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfumVar.zzb());
        zzeaiVarZza.zzc(MintegralConstants.AD_UNIT_ID, zzfumVar.zza());
        zzeaiVarZza.zzc("pid", zzfumVar.zzc());
        zzeaiVarZza.zzc("pv", "1");
        zzeaiVarZza.zzd();
    }

    public final void zzd(int i10, int i11, long j10, @Nullable Long l10, @Nullable String str, @Nullable zzfum zzfumVar, String str2) {
        zzeai zzeaiVarZza = this.zza.zza();
        zzeaiVarZza.zzc("plaac_ts", Long.toString(j10));
        zzeaiVarZza.zzc("max_ads", Integer.toString(i10));
        zzeaiVarZza.zzc("cache_size", Integer.toString(i11));
        zzeaiVarZza.zzc("action", "is_ad_available");
        if (zzfumVar != null) {
            zzeaiVarZza.zzc(MintegralConstants.AD_UNIT_ID, zzfumVar.zza());
            zzeaiVarZza.zzc("pid", zzfumVar.zzc());
            zzeaiVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfumVar.zzb());
        }
        if (l10 != null) {
            zzeaiVarZza.zzc("plaay_ts", Long.toString(l10.longValue()));
        }
        if (str != null) {
            zzeaiVarZza.zzc("gqi", str);
        }
        zzeaiVarZza.zzc("pv", str2);
        zzeaiVarZza.zzd();
    }

    public final void zze(long j10, String str) {
        zzw("poll_ad", "ppacwe_ts", j10, -1, -1, null, null, "2");
    }

    public final void zzf(long j10, zzfum zzfumVar, int i10, int i11, String str) {
        zzw("poll_ad", "ppac_ts", j10, i10, i11, null, zzfumVar, str);
    }

    public final void zzg(long j10, int i10, int i11, String str, zzfum zzfumVar, String str2) {
        zzw("poll_ad", "psvroc_ts", j10, i10, i11, str, zzfumVar, str2);
    }

    public final void zzh(long j10, int i10, int i11, @Nullable String str, zzfum zzfumVar, String str2) {
        zzeai zzeaiVarZza = this.zza.zza();
        zzeaiVarZza.zzc("ppla_ts", Long.toString(j10));
        zzeaiVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfumVar.zzb());
        zzeaiVarZza.zzc(MintegralConstants.AD_UNIT_ID, zzfumVar.zza());
        zzeaiVarZza.zzc("pid", zzfumVar.zzc());
        zzeaiVarZza.zzc("max_ads", Integer.toString(i10));
        zzeaiVarZza.zzc("cache_size", Integer.toString(i11));
        zzeaiVarZza.zzc("action", "poll_ad");
        if (str != null) {
            zzeaiVarZza.zzc("gqi", str);
        }
        zzeaiVarZza.zzc("pv", str2);
        zzeaiVarZza.zzd();
    }

    public final void zzi(long j10, @Nullable String str, zzfum zzfumVar, int i10, int i11, String str2) {
        zzw("paa", "pano_ts", j10, i10, i11, str, zzfumVar, str2);
    }

    public final void zzj(long j10, zzfum zzfumVar, int i10, String str) {
        zzw("pae", "paeo_ts", j10, i10, 0, null, zzfumVar, str);
    }

    public final void zzk(long j10, zzfum zzfumVar, com.google.android.gms.ads.internal.client.zze zzeVar, int i10, int i11, String str) {
        zzeai zzeaiVarZza = this.zza.zza();
        zzeaiVarZza.zzc("action", "pftla");
        zzeaiVarZza.zzc("pftlat_ts", Long.toString(j10));
        zzeaiVarZza.zzc("pftlaec", Integer.toString(zzeVar.zza));
        zzeaiVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, zzfumVar.zzb());
        zzeaiVarZza.zzc("max_ads", Integer.toString(i10));
        zzeaiVarZza.zzc("cache_size", Integer.toString(i11));
        zzeaiVarZza.zzc(MintegralConstants.AD_UNIT_ID, zzfumVar.zza());
        zzeaiVarZza.zzc("pid", zzfumVar.zzc());
        zzeaiVarZza.zzc("pv", str);
        zzeaiVarZza.zzd();
    }

    public final void zzl(long j10, AdFormat adFormat, int i10) {
        zzv("pda", j10, null, null, adFormat, -1, -1, i10, "2");
    }

    public final void zzm(long j10, String str, String str2, AdFormat adFormat, int i10, int i11) {
        zzv("pd", j10, str, str2, adFormat, i10, i11, 1, "2");
    }

    public final void zzn(AdFormat adFormat, long j10, int i10) {
        zzv("pgcs", j10, null, null, adFormat, -1, -1, i10, "2");
    }

    public final void zzo(long j10, String str, @Nullable String str2, AdFormat adFormat, int i10, int i11) {
        zzv("pgc", j10, str, str2, adFormat, i10, i11, 1, "2");
    }

    public final void zzp(int i10, long j10, String str, @Nullable String str2, AdFormat adFormat, int i11) {
        zzv("pnav", j10, str, str2, adFormat, i11, i10, 1, "2");
    }

    public final void zzq(long j10, String str, String str2, @Nullable AdFormat adFormat, int i10, int i11, int i12, int i13) {
        zzx("acmpa", j10, str, str2, adFormat, i10, i11, 0, i12, i13);
    }

    public final void zzr(long j10, String str, String str2, @Nullable AdFormat adFormat, int i10, int i11, int i12, int i13, int i14) {
        zzx("acmpr", j10, str, str2, adFormat, i10, i11, i12, i13, i14);
    }

    public final void zzs(long j10, int i10, int i11) {
        zzeai zzeaiVarZza = this.zza.zza();
        zzeaiVarZza.zzc("action", "acmlr");
        zzeaiVarZza.zzc("pat", Long.toString(j10));
        zzeaiVarZza.zzc("mpl", Integer.toString(i10));
        zzeaiVarZza.zzc("pas", Integer.toString(i11));
        zzeaiVarZza.zzd();
    }

    public final void zzt(long j10, long j11, long j12, long j13, long j14) {
        zzeai zzeaiVarZza = this.zza.zza();
        zzeaiVarZza.zzc("action", "iic");
        zzeaiVarZza.zzc("pat", Long.toString(j10));
        zzeaiVarZza.zzc("bot", Long.toString(j11));
        zzeaiVarZza.zzc("cim", Long.toString(j12));
        zzeaiVarZza.zzc("mbot", Long.toString(j13));
        zzeaiVarZza.zzc("mim", Long.toString(j14));
        zzeaiVarZza.zzd();
    }

    public final void zzu(long j10, @Nullable AdFormat adFormat, String str, String str2, boolean z10) {
        zzeai zzeaiVarZza = this.zza.zza();
        zzeaiVarZza.zzc("poaca_ts", Long.toString(j10));
        zzeaiVarZza.zzc("action", true != z10 ? "poac" : "poact");
        zzeaiVarZza.zzc(MintegralConstants.AD_UNIT_ID, str2);
        zzeaiVarZza.zzc("pid", str);
        if (adFormat != null) {
            zzeaiVarZza.zzc(FirebaseAnalytics.Param.AD_FORMAT, adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        zzeaiVarZza.zzd();
    }
}

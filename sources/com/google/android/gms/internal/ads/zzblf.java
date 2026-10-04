package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzblf {
    public static final zzbkq zza = zzbkq.zza("gads:init:init_on_bg_thread", true);
    public static final zzbkq zzb = zzbkq.zza("gads:init:init_on_single_bg_thread", false);
    public static final zzbkq zzc = zzbkq.zza("gads:adloader_load_bg_thread", true);
    public static final zzbkq zzd = zzbkq.zza("gads:appopen_load_on_bg_thread", true);
    public static final zzbkq zze = zzbkq.zza("gads:banner_destroy_bg_thread", false);
    public static final zzbkq zzf = zzbkq.zza("gads:banner_load_bg_thread", true);
    public static final zzbkq zzg = zzbkq.zza("gads:banner_pause_bg_thread", false);
    public static final zzbkq zzh = zzbkq.zza("gads:banner_resume_bg_thread", false);
    public static final zzbkq zzi = zzbkq.zza("gads:interstitial_load_on_bg_thread", true);
    public static final zzbkq zzj;
    public static final zzbkq zzk;

    static {
        zzbkq.zza("gads:persist_flags_on_bg_thread", true);
        zzj = zzbkq.zza("gads:query_info_bg_thread", true);
        zzk = zzbkq.zza("gads:rewarded_load_bg_thread", true);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzblq {
    public static final zzbkq zza = zzbkq.zzb("gads:dynamite_load:fail:sample_rate", 10000);
    public static final zzbkq zzb = zzbkq.zza("gads:report_dynamite_crash_in_background_thread", false);
    public static final zzbkq zzc = new zzbkq("gads:public_beta:traffic_multiplier", "1.0", 4);
    public static final zzbkq zzd = new zzbkq("gads:sdk_crash_report_class_prefix", "com.google.", 4);
    public static final zzbkq zze;
    public static final zzbkq zzf;

    static {
        zzbkq.zza("gads:sdk_crash_report_enabled", false);
        zze = zzbkq.zza("gads:sdk_crash_report_full_stacktrace", false);
        zzf = zzbkq.zzc("gads:trapped_exception_sample_rate", 0.01d);
    }
}

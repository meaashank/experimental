package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzblw {
    public static final zzbkq zza = zzbkq.zza("gads:trustless_token_for_decagon:enabled", true);
    public static final zzbkq zzb;

    static {
        zzbkq.zza("gads:invalidate_token_at_refresh_start", true);
        zzbkq.zza("gms:expose_token_for_gma:enabled", true);
        zzbkq.zza("gads:referesh_rate_limit", false);
        zzb = zzbkq.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        zzbkq.zza("gads:token_anonymization:enabled", true);
        zzbkq.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}

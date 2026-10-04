package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzblg {
    public static final zzbkq zza = new zzbkq("gads:gma_attestation:click:macro_string", "@click_attok@", 4);
    public static final zzbkq zzb = new zzbkq("gads:gma_attestation:click:query_param", "attok", 4);
    public static final zzbkq zzc = zzbkq.zzb("gads:gma_attestation:click:timeout", 2000);
    public static final zzbkq zzd = zzbkq.zza("gads:gma_attestation:click:enable", false);
    public static final zzbkq zze = zzbkq.zzb("gads:gma_attestation:click:enable_dynamite_version", Long.MAX_VALUE);
    public static final zzbkq zzf = zzbkq.zza("gads:gma_attestation:click:qualification:enable", true);
    public static final zzbkq zzg = zzbkq.zza("gads:gma_attestation:image_hash", false);
    public static final zzbkq zzh = zzbkq.zza("gads:gma_attestation:impression:enable", false);
    public static final zzbkq zzi;

    static {
        zzbkq.zza("gads:gma_attestation:request:enable_javascript", false);
        zzbkq.zza("gads:gma_attestation:request:enable", true);
        zzi = zzbkq.zza("gads:gma_attestation:click:report_error", true);
    }
}

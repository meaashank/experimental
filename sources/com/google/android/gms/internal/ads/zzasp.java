package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zzasp {
    private final Bundle zza;

    public zzasp(Bundle bundle) {
        this.zza = bundle;
    }

    public final String zza() {
        return this.zza.getString("install_referrer");
    }

    public final long zzb() {
        return this.zza.getLong("referrer_click_timestamp_seconds");
    }

    public final long zzc() {
        return this.zza.getLong("install_begin_timestamp_seconds");
    }

    public final boolean zzd() {
        return this.zza.getBoolean("google_play_instant");
    }

    public final long zze() {
        return this.zza.getLong("referrer_click_timestamp_server_seconds");
    }

    public final long zzf() {
        return this.zza.getLong("install_begin_timestamp_server_seconds");
    }

    public final String zzg() {
        return this.zza.getString("install_version");
    }
}

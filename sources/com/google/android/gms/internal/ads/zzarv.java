package com.google.android.gms.internal.ads;

import com.google.firebase.sessions.settings.RemoteSettings;

/* JADX INFO: loaded from: classes4.dex */
public final class zzarv {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzarv(int i10, int i11, int i12) {
        this.zza = i10 != Integer.MIN_VALUE ? android.support.v4.media.d.a(new StringBuilder(String.valueOf(i10).length() + 1), i10, RemoteSettings.FORWARD_SLASH_STRING) : "";
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = Integer.MIN_VALUE;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final void zza() {
        int i10 = this.zzd;
        int i11 = i10 == Integer.MIN_VALUE ? this.zzb : i10 + this.zzc;
        this.zzd = i11;
        String str = this.zza;
        this.zze = androidx.multidex.d.a(new StringBuilder(str.length() + String.valueOf(i11).length()), str, i11);
    }

    public final int zzb() {
        zzd();
        return this.zzd;
    }

    public final String zzc() {
        zzd();
        return this.zze;
    }
}

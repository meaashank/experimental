package com.google.android.play.core.hsdp.service;

import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class HsdpReportRequest {
    private final String zza;
    private final int zzb;
    private final int zzc;

    public HsdpReportRequest(@NonNull String str, int i10, int i11) {
        Objects.requireNonNull(str, "targetPackage cannot be null");
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
    }

    public int operation() {
        return this.zzb;
    }

    public int reportCode() {
        return this.zzc;
    }

    @NonNull
    public String targetPackage() {
        return this.zza;
    }
}

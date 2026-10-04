package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzrb {
    private final zzv zza;

    @Nullable
    private AudioDeviceInfo zzc;
    private zzd zzb = zzd.zza;
    private int zzd = 0;
    private int zze = -1;
    private int zzf = -1;

    public zzrb(zzv zzvVar) {
        this.zza = zzvVar;
    }

    public final zzrb zza(zzd zzdVar) {
        this.zzb = zzdVar;
        return this;
    }

    public final zzrb zzb(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.zzc = audioDeviceInfo;
        return this;
    }

    public final zzrb zzc(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzrb zzd(int i10) {
        this.zze = i10;
        return this;
    }

    public final zzrb zze(int i10) {
        this.zzf = -1;
        return this;
    }

    public final /* synthetic */ zzv zzf() {
        return this.zza;
    }

    public final /* synthetic */ zzd zzg() {
        return this.zzb;
    }

    public final /* synthetic */ AudioDeviceInfo zzh() {
        return this.zzc;
    }

    public final /* synthetic */ int zzi() {
        return this.zzd;
    }

    public final /* synthetic */ int zzj() {
        return this.zze;
    }

    public final /* synthetic */ int zzk() {
        return this.zzf;
    }
}

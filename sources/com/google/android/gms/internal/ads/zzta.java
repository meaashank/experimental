package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzta extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zztc zza;

    public zzta(zztc zztcVar) {
        Objects.requireNonNull(zztcVar);
        this.zza = zztcVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        zzeg zzegVarZzu = this.zza.zza.zzu();
        zzegVarZzu.zze(-1, zzsz.zza);
        zzegVarZzu.zzf();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzeg zzegVarZzu = this.zza.zza.zzu();
        zzegVarZzu.zze(-1, zzsx.zza);
        zzegVarZzu.zzf();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzeg zzegVarZzu = this.zza.zza.zzu();
        zzegVarZzu.zze(-1, zzsy.zza);
        zzegVarZzu.zzf();
    }
}

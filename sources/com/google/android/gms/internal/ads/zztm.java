package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zztm {

    @Nullable
    private final Context zza;
    private Boolean zzb;

    public zztm() {
        this(null);
    }

    public final zzqw zza(zzv zzvVar, zzd zzdVar) {
        int i10;
        boolean zBooleanValue;
        zzvVar.getClass();
        zzdVar.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29 || (i10 = zzvVar.zzK) == -1) {
            return zzqw.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = zzcj.zza(context).getParameters("offloadVariableRateSupported");
                this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.zzb = Boolean.FALSE;
            }
            zBooleanValue = this.zzb.booleanValue();
        }
        String str = zzvVar.zzp;
        str.getClass();
        int iZzg = zzas.zzg(str, zzvVar.zzk);
        if (iZzg == 0 || i11 < zzfm.zzH(iZzg)) {
            return zzqw.zza;
        }
        int iZzF = zzfm.zzF(zzvVar);
        if (iZzF == 0) {
            return zzqw.zza;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i10).setChannelMask(iZzF).setEncoding(iZzg).build();
            if (i11 >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(audioFormatBuild, zzdVar.zza());
                if ((directPlaybackSupport & 1) == 0) {
                    return zzqw.zza;
                }
                z = (directPlaybackSupport & 3) == 3;
                zzqv zzqvVar = new zzqv();
                zzqvVar.zza(true);
                zzqvVar.zzb(z);
                zzqvVar.zzc(zBooleanValue);
                return zzqvVar.zzd();
            }
            if (i11 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, zzdVar.zza())) {
                    return zzqw.zza;
                }
                zzqv zzqvVar2 = new zzqv();
                zzqvVar2.zza(true);
                zzqvVar2.zzc(zBooleanValue);
                return zzqvVar2.zzd();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, zzdVar.zza());
            if (playbackOffloadSupport == 0) {
                return zzqw.zza;
            }
            zzqv zzqvVar3 = new zzqv();
            if (i11 > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            zzqvVar3.zza(true);
            zzqvVar3.zzb(z);
            zzqvVar3.zzc(zBooleanValue);
            return zzqvVar3.zzd();
        } catch (IllegalArgumentException unused) {
            return zzqw.zza;
        }
    }

    public zztm(@Nullable Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }
}

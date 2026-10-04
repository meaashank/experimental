package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzvm {
    public final zzvs zza;
    public final MediaFormat zzb;
    public final zzv zzc;

    @Nullable
    public final Surface zzd;

    @Nullable
    public final MediaCrypto zze = null;

    @Nullable
    public final zzvl zzf;

    private zzvm(zzvs zzvsVar, MediaFormat mediaFormat, zzv zzvVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, @Nullable zzvl zzvlVar) {
        this.zza = zzvsVar;
        this.zzb = mediaFormat;
        this.zzc = zzvVar;
        this.zzd = surface;
        this.zzf = zzvlVar;
    }

    public static zzvm zza(zzvs zzvsVar, MediaFormat mediaFormat, zzv zzvVar, @Nullable MediaCrypto mediaCrypto, @Nullable zzvl zzvlVar) {
        return new zzvm(zzvsVar, mediaFormat, zzvVar, null, null, zzvlVar);
    }

    public static zzvm zzb(zzvs zzvsVar, MediaFormat mediaFormat, zzv zzvVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
        return new zzvm(zzvsVar, mediaFormat, zzvVar, surface, null, null);
    }
}

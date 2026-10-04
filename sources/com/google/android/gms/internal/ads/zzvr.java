package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class zzvr extends zziw {
    public final int zza;

    public zzvr(Throwable th, @Nullable zzvs zzvsVar) {
        super("Decoder failed: ".concat(String.valueOf(zzvsVar == null ? null : zzvsVar.zza)), th);
        boolean z10 = th instanceof MediaCodec.CodecException;
        if (z10) {
            ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zza = z10 ? ((MediaCodec.CodecException) th).getErrorCode() : 0;
    }
}

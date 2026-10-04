package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.fragment.app.C2564b;

/* JADX INFO: loaded from: classes4.dex */
public final class zzvv extends Exception {

    @Nullable
    public final String zza;
    public final boolean zzb;

    @Nullable
    public final zzvs zzc;

    @Nullable
    public final String zzd;

    public zzvv(zzv zzvVar, @Nullable Throwable th, boolean z10, int i10) {
        String string = zzvVar.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 25 + string.length());
        sb2.append("Decoder init failed: [");
        sb2.append(i10);
        sb2.append("], ");
        sb2.append(string);
        String string2 = sb2.toString();
        String str = zzvVar.zzp;
        int iAbs = Math.abs(i10);
        this(string2, th, str, false, null, androidx.multidex.d.a(new StringBuilder(String.valueOf(iAbs).length() + 60), "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", iAbs), null);
    }

    public final /* synthetic */ zzvv zza(zzvv zzvvVar) {
        return new zzvv(getMessage(), getCause(), this.zza, false, this.zzc, this.zzd, zzvvVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzvv(zzv zzvVar, @Nullable Throwable th, boolean z10, zzvs zzvsVar) {
        String str = zzvsVar.zza;
        int length = str.length();
        String string = zzvVar.toString();
        this(C2564b.a(new StringBuilder(length + 23 + string.length()), "Decoder init failed: ", str, U6.j.f68738d, string), th, zzvVar.zzp, false, zzvsVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private zzvv(@Nullable String str, @Nullable Throwable th, @Nullable String str2, boolean z10, @Nullable zzvs zzvsVar, @Nullable String str3, @Nullable zzvv zzvvVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzvsVar;
        this.zzd = str3;
    }
}

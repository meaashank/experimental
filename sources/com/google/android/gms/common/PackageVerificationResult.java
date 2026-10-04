package com.google.android.gms.common;

import androidx.annotation.NonNull;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class PackageVerificationResult {
    private final String zza;
    private final boolean zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final Throwable zzd;

    private PackageVerificationResult(String str, int i10, boolean z10, @Nullable String str2, @Nullable Throwable th, @Nullable com.google.android.gms.common.signatureverification.zza zzaVar) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = str2;
        this.zzd = th;
    }

    public static PackageVerificationResult zza(String str, @NonNull String str2, @Nullable Throwable th, @Nullable com.google.android.gms.common.signatureverification.zza zzaVar) {
        return new PackageVerificationResult(str, 1, false, str2, th, null);
    }

    public static PackageVerificationResult zzd(String str, int i10, @Nullable com.google.android.gms.common.signatureverification.zza zzaVar) {
        return new PackageVerificationResult(str, i10, true, null, null, null);
    }

    public final boolean zzb() {
        return this.zzb;
    }

    public final void zzc() {
        if (this.zzb) {
            return;
        }
        String str = this.zzc;
        Throwable th = this.zzd;
        String strConcat = "PackageVerificationRslt: ".concat(String.valueOf(str));
        if (th == null) {
            throw new SecurityException(strConcat);
        }
        throw new SecurityException(strConcat, th);
    }
}

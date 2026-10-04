package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjn extends zzau {
    public final int zzc;

    @Nullable
    public final String zzd;
    public final int zze;

    @Nullable
    public final zzv zzf;
    public final int zzg;

    @Nullable
    public final zzxo zzh;
    final boolean zzi;

    private zzjn(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, null, false);
    }

    public static zzjn zza(IOException iOException, int i10) {
        return new zzjn(0, iOException, i10);
    }

    public static zzjn zzb(Throwable th, String str, int i10, @Nullable zzv zzvVar, int i11, @Nullable zzxo zzxoVar, boolean z10, int i12) {
        if (zzvVar == null) {
            i11 = 4;
        }
        return new zzjn(1, th, null, i12, str, i10, zzvVar, i11, zzxoVar, z10);
    }

    public static zzjn zzc(RuntimeException runtimeException, int i10) {
        return new zzjn(2, runtimeException, i10);
    }

    @CheckResult
    public final zzjn zzd(@Nullable zzxo zzxoVar) {
        String message = getMessage();
        String str = zzfm.zza;
        return new zzjn(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzxoVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zzjn(int i10, @Nullable Throwable th, @Nullable String str, int i11, @Nullable String str2, int i12, @Nullable zzv zzvVar, int i13, @Nullable zzxo zzxoVar, boolean z10) {
        String str3;
        int i14;
        String strA;
        String str4;
        if (i10 == 0) {
            str3 = str2;
            i14 = i12;
            strA = "Source error";
        } else if (i10 != 1) {
            strA = "Unexpected runtime error";
            str3 = str2;
            i14 = i12;
        } else {
            String strValueOf = String.valueOf(zzvVar);
            String str5 = zzfm.zza;
            if (i13 == 0) {
                str4 = "NO";
            } else if (i13 == 1) {
                str4 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i13 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i13 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb2 = new StringBuilder(str4.length() + strValueOf.length() + com.bytedance.sdk.component.utils.a.a(String.valueOf(i12), String.valueOf(str2).length() + 14, 9) + 19);
            str3 = str2;
            sb2.append(str3);
            sb2.append(" error, index=");
            i14 = i12;
            sb2.append(i14);
            sb2.append(", format=");
            strA = androidx.compose.animation.core.E0.a(sb2, strValueOf, ", format_supported=", str4);
        }
        this(TextUtils.isEmpty(null) ? strA : strA.concat(": null"), th, i11, i10, str3, i14, zzvVar, i13, zzxoVar, SystemClock.elapsedRealtime(), z10);
    }

    private zzjn(String str, @Nullable Throwable th, int i10, int i11, @Nullable String str2, int i12, @Nullable zzv zzvVar, int i13, @Nullable zzxo zzxoVar, long j10, boolean z10) {
        boolean z11;
        super(str, th, i10, Bundle.EMPTY, j10);
        if (!z10) {
            z11 = true;
        } else if (i11 == 1) {
            i11 = 1;
            z11 = true;
        } else {
            z11 = false;
        }
        zzguk.zza(z11);
        zzguk.zza(th != null);
        this.zzc = i11;
        this.zzd = str2;
        this.zze = i12;
        this.zzf = zzvVar;
        this.zzg = i13;
        this.zzh = zzxoVar;
        this.zzi = z10;
    }
}

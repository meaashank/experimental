package com.google.android.gms.internal.ads;

import android.graphics.Color;
import androidx.annotation.Nullable;
import e.InterfaceC4337k;
import okio.internal.ZipKt;

/* JADX INFO: loaded from: classes4.dex */
final class zzaos {
    public final String zza;
    public final int zzb;

    @Nullable
    @InterfaceC4337k
    public final Integer zzc;

    @Nullable
    @InterfaceC4337k
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzaos(String str, int i10, @Nullable @InterfaceC4337k Integer num, @Nullable @InterfaceC4337k Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f10;
        this.zzf = z10;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
        this.zzj = i11;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @androidx.annotation.Nullable
    public static com.google.android.gms.internal.ads.zzaos zza(java.lang.String r21, com.google.android.gms.internal.ads.zzaoq r22) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaos.zza(java.lang.String, com.google.android.gms.internal.ads.zzaoq):com.google.android.gms.internal.ads.zzaos");
    }

    @Nullable
    @InterfaceC4337k
    public static Integer zzb(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzguk.zza(j10 <= ZipKt.f225990j);
            return Integer.valueOf(Color.argb(zzhbj.zza(((j10 >> 24) & 255) ^ 255), zzhbj.zza(j10 & 255), zzhbj.zza((j10 >> 8) & 255), zzhbj.zza((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            zzeh.zzd("SsaStyle", androidx.compose.animation.core.E0.a(new StringBuilder(String.valueOf(str).length() + 36), "Failed to parse color expression: '", str, "'"), e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        int i10;
        try {
            i10 = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return i10;
            default:
                D.a(str, "Ignoring unknown alignment: ", "SsaStyle");
                return -1;
        }
    }

    private static boolean zze(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            zzeh.zzd("SsaStyle", androidx.compose.animation.core.E0.a(new StringBuilder(String.valueOf(str).length() + 33), "Failed to parse boolean value: '", str, "'"), e10);
            return false;
        }
    }
}

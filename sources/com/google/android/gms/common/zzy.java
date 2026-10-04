package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ShowFirstParty;
import e.f0;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
public class zzy {
    private static final zzy zze = new zzy(true, 3, 1, null, null, -1);
    final boolean zza;

    @Nullable
    final String zzb;

    @Nullable
    final Throwable zzc;
    final int zzd;

    private zzy(boolean z10, int i10, int i11, @Nullable String str, @Nullable Throwable th, long j10) {
        this.zza = z10;
        this.zzd = i10;
        this.zzb = str;
        this.zzc = th;
    }

    @Deprecated
    public static zzy zzb() {
        return zze;
    }

    public static zzy zzc(@NonNull String str) {
        return new zzy(false, 1, 5, str, null, -1L);
    }

    public static zzy zzd(@NonNull String str, @NonNull Throwable th) {
        return new zzy(false, 1, 5, str, th, -1L);
    }

    @f0(otherwise = 3)
    public static zzy zzf(int i10, long j10) {
        return new zzy(true, i10, 1, null, null, j10);
    }

    public static zzy zzg(int i10, int i11, @NonNull String str, @Nullable Throwable th) {
        return new zzy(false, i10, i11, str, th, -1L);
    }

    @Nullable
    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.zzc;
        if (th != null) {
            Log.d("GoogleCertificatesRslt", zza(), th);
        } else {
            Log.d("GoogleCertificatesRslt", zza());
        }
    }

    public /* synthetic */ zzy(boolean z10, int i10, int i11, String str, Throwable th, long j10, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}

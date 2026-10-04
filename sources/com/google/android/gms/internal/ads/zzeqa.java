package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.android.launcher3.IconCache;

/* JADX INFO: loaded from: classes4.dex */
final class zzeqa {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;

    @Nullable
    final Integer zze;

    public zzeqa(String str, String str2, int i10, long j10, @Nullable Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = j10;
        this.zze = num;
    }

    public final String toString() {
        Integer num;
        String str = this.zza;
        int i10 = this.zzc;
        long j10 = this.zzd;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(i10).length() + 1 + String.valueOf(j10).length());
        sb2.append(str);
        sb2.append(IconCache.EMPTY_CLASS_NAME);
        sb2.append(i10);
        sb2.append(IconCache.EMPTY_CLASS_NAME);
        sb2.append(j10);
        String string = sb2.toString();
        String str2 = this.zzb;
        if (!TextUtils.isEmpty(str2)) {
            string = androidx.compose.animation.core.E0.a(new StringBuilder(string.length() + 1 + String.valueOf(str2).length()), string, IconCache.EMPTY_CLASS_NAME, str2);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcs)).booleanValue() || (num = this.zze) == null || TextUtils.isEmpty(str2)) {
            return string;
        }
        StringBuilder sb3 = new StringBuilder(string.length() + 1 + num.toString().length());
        sb3.append(string);
        sb3.append(IconCache.EMPTY_CLASS_NAME);
        sb3.append(num);
        return sb3.toString();
    }
}

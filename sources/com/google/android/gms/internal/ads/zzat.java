package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class zzat extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzat(@Nullable String str, @Nullable Throwable th, boolean z10, int i10) {
        super(str, th);
        this.zza = z10;
        this.zzb = i10;
    }

    public static zzat zza(@Nullable String str, @Nullable Throwable th) {
        return new zzat(str, th, true, 0);
    }

    public static zzat zzb(@Nullable String str, @Nullable Throwable th) {
        return new zzat(str, th, true, 1);
    }

    public static zzat zzc(@Nullable String str) {
        return new zzat(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(C4.q.f17581a) : "";
        boolean z10 = this.zza;
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + String.valueOf(z10).length() + strConcat.length() + 20 + 11 + 1);
        sb2.append(strConcat);
        sb2.append("{contentIsMalformed=");
        sb2.append(z10);
        sb2.append(", dataType=");
        return android.support.v4.media.d.a(sb2, i10, "}");
    }
}

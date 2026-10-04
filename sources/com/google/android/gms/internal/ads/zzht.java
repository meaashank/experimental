package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class zzht extends IOException {
    public final int zza;

    public zzht(int i10) {
        this.zza = i10;
    }

    public zzht(@Nullable String str, int i10) {
        super(str);
        this.zza = i10;
    }

    public zzht(@Nullable String str, @Nullable Throwable th, int i10) {
        super(str, th);
        this.zza = i10;
    }

    public zzht(@Nullable Throwable th, int i10) {
        super(th);
        this.zza = i10;
    }
}

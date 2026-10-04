package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdh {
    @EnsuresNonNull({"#1"})
    @Deprecated
    @Pure
    public static String zza(@Nullable String str) {
        zzguk.zza(!TextUtils.isEmpty(str));
        return str;
    }
}

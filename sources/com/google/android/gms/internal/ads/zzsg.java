package com.google.android.gms.internal.ads;

import androidx.compose.foundation.layout.C1713x0;

/* JADX INFO: loaded from: classes4.dex */
public final class zzsg extends Exception {
    public zzsg(long j10, long j11) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 63 + String.valueOf(j10).length());
        C1713x0.a(sb2, "Unexpected audio track timestamp discontinuity: expected ", j11, ", got ");
        sb2.append(j10);
        super(sb2.toString());
    }
}

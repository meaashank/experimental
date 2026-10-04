package com.google.android.gms.internal.ads;

import androidx.compose.foundation.layout.C1711w0;

/* JADX INFO: loaded from: classes4.dex */
public final class zzix extends IllegalStateException {
    public zzix(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21 + String.valueOf(i11).length() + 1);
        C1711w0.a(sb2, "Buffer too small (", i10, " < ", i11);
        sb2.append(")");
        super(sb2.toString());
    }
}

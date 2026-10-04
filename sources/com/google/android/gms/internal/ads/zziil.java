package com.google.android.gms.internal.ads;

import androidx.compose.foundation.layout.C1709v0;

/* JADX INFO: loaded from: classes4.dex */
final class zziil extends Exception {
    public zziil(int i10, int i11) {
        super(C1709v0.a(new StringBuilder(String.valueOf(i10).length() + 32 + String.valueOf(i11).length()), "Unpaired surrogate at index ", i10, " of ", i11));
    }
}

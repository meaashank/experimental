package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.compose.foundation.layout.C1711w0;

/* JADX INFO: loaded from: classes4.dex */
public final class zzse extends Exception {
    public final boolean zza;

    public zzse(int i10, int i11, int i12, int i13, int i14, zzv zzvVar, boolean z10, @Nullable Exception exc) {
        String strValueOf = String.valueOf(zzvVar);
        int length = String.valueOf(i11).length();
        int length2 = String.valueOf(i12).length();
        int length3 = String.valueOf(i13).length();
        StringBuilder sb2 = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i14).length() + 2 + strValueOf.length());
        C1711w0.a(sb2, "AudioTrack init failed 0 Config(", i11, U6.j.f68738d, i12);
        C1711w0.a(sb2, U6.j.f68738d, i13, U6.j.f68738d, i14);
        super(androidx.compose.animation.core.E0.a(sb2, ") ", strValueOf, ""), exc);
        this.zza = false;
    }
}

package com.google.android.gms.internal.consent_sdk;

import android.support.v4.media.i;
import kotlin.text.C5017i;

/* JADX INFO: loaded from: classes4.dex */
final class zzde extends zzdd {
    public zzde(char c10) {
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i10 = 44;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = C5017i.f218346b.charAt(i10 & 15);
            i10 >>= 4;
        }
        return i.a("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }
}

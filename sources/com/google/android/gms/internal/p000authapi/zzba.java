package com.google.android.gms.internal.p000authapi;

import android.util.Base64;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class zzba {
    private static final Random zzdl = new Random();

    public static String zzw() {
        byte[] bArr = new byte[16];
        zzdl.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}

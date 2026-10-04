package com.bytedance.sdk.openadsdk.utils;

import com.google.common.base.Ascii;
import java.security.SecureRandom;
import java.util.UUID;
import okio.h0;

/* JADX INFO: loaded from: classes3.dex */
public class xY {
    private static final ThreadLocal<SecureRandom> ZRu = new ThreadLocal<>();

    public static String ZRu() {
        byte[] bArr = new byte[16];
        ThreadLocal<SecureRandom> threadLocal = ZRu;
        SecureRandom secureRandom = threadLocal.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            threadLocal.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        byte b10 = (byte) (bArr[6] & Ascii.SI);
        bArr[6] = b10;
        bArr[6] = (byte) (b10 | 64);
        byte b11 = (byte) (bArr[8] & h0.f225962a);
        bArr[8] = b11;
        bArr[8] = (byte) (b11 | 128);
        long j10 = 0;
        long j11 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j11 = (j11 << 8) | ((long) (bArr[i10] & 255));
        }
        for (int i11 = 8; i11 < 16; i11++) {
            j10 = (j10 << 8) | ((long) (bArr[i11] & 255));
        }
        return new UUID(j11, j10).toString();
    }
}

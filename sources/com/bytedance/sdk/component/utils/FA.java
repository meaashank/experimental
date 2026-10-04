package com.bytedance.sdk.component.utils;

import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collections;
import org.apache.http.protocol.HTTP;
import t1.b;

/* JADX INFO: loaded from: classes2.dex */
public class FA {
    private static final byte[] Ht;
    private static final int Mm;
    private static final byte[] NOt;
    private static final byte[] TFq;
    private static final byte[] ZRu;
    private static final byte[] mZ;
    private static final byte[] uR;

    static {
        byte[] bArr = {-1, b.f239002n7, -1};
        ZRu = bArr;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, Ascii.SUB, 10};
        NOt = bArr2;
        byte[] bArr3 = {0, 0, 1, 0};
        mZ = bArr3;
        byte[] bArrZRu = ZRu("BM");
        uR = bArrZRu;
        TFq = ZRu("GIF87a");
        Ht = ZRu("GIF89a");
        Mm = ((Integer) Collections.max(Arrays.asList(Integer.valueOf(bArr.length), Integer.valueOf(bArr2.length), Integer.valueOf(bArr3.length), Integer.valueOf(bArrZRu.length), 6))).intValue();
    }

    private static boolean Ht(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = mZ;
        return length >= bArr2.length && ZRu(bArr, bArr2);
    }

    private static boolean NOt(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = ZRu;
        return length >= bArr2.length && ZRu(bArr, bArr2);
    }

    private static boolean TFq(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = uR;
        return length >= bArr2.length && ZRu(bArr, bArr2);
    }

    public static int ZRu() {
        return Mm;
    }

    private static boolean mZ(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = NOt;
        return length >= bArr2.length && ZRu(bArr, bArr2);
    }

    private static boolean uR(byte[] bArr) {
        return (bArr.length >= 6 && ZRu(bArr, TFq)) || ZRu(bArr, Ht);
    }

    public static final String ZRu(byte[] bArr) {
        return NOt(bArr) ? "jpeg" : mZ(bArr) ? "png" : uR(bArr) ? "gif" : TFq(bArr) ? "bmp" : Ht(bArr) ? "ico" : "other";
    }

    private static boolean ZRu(byte[] bArr, byte[] bArr2) {
        return ZRu(bArr, bArr2, 0);
    }

    private static boolean ZRu(byte[] bArr, byte[] bArr2, int i10) {
        if (bArr2.length + i10 > bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static byte[] ZRu(String str) {
        try {
            return str.getBytes(HTTP.ASCII);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }
}

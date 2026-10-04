package com.bytedance.sdk.component.adexpress.uR;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes2.dex */
public class Ht {
    private static final byte[] ZRu = ZRu("VP8X");

    public static void NOt(ImageView imageView, byte[] bArr, int i10, int i11) {
        if (TextUtils.equals("png", com.bytedance.sdk.component.utils.FA.ZRu(Arrays.copyOfRange(bArr, 0, com.bytedance.sdk.component.utils.FA.ZRu())))) {
            mZ(imageView, bArr, i10, i11);
        } else {
            ZRu(imageView, bArr, i10, i11);
        }
    }

    private static byte[] ZRu(String str) {
        try {
            return str.getBytes(HTTP.ASCII);
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    private static void mZ(ImageView imageView, byte[] bArr, int i10, int i11) {
        uR(imageView, bArr, i10, i11);
    }

    private static void uR(ImageView imageView, byte[] bArr, int i10, int i11) {
        Bitmap bitmapZRu = new com.bytedance.sdk.component.TFq.mZ.NOt.ZRu(i10, i11, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i10, i11).ZRu(bArr);
        if (bitmapZRu != null) {
            imageView.setImageBitmap(bitmapZRu);
        }
    }

    public static void ZRu(ImageView imageView, byte[] bArr, int i10, int i11) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                imageView.setImageDrawable(ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap)));
            } catch (IOException unused) {
            }
        } else {
            uR(imageView, bArr, i10, i11);
        }
    }

    public static boolean ZRu(byte[] bArr, int i10) {
        try {
            boolean zZRu = ZRu(bArr, i10 + 12, ZRu);
            int i11 = i10 + 20;
            if (bArr.length <= i11) {
                return false;
            }
            boolean z10 = (bArr[i11] & 2) == 2;
            if (zZRu && z10) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean ZRu(byte[] bArr, int i10, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i10 > bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11 + i10] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }
}

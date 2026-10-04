package com.android.launcher3.graphics;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public class ColorExtractor {
    public static int findDominantColorByHue(Bitmap bitmap) {
        return findDominantColorByHue(bitmap, 20);
    }

    public static int findDominantColorByHue(Bitmap bitmap, int i10) {
        int i11;
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int iSqrt = (int) Math.sqrt((height * width) / i10);
        char c10 = 1;
        if (iSqrt < 1) {
            iSqrt = 1;
        }
        float[] fArr = new float[3];
        float[] fArr2 = new float[360];
        int[] iArr = new int[i10];
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        float f10 = -1.0f;
        while (true) {
            i11 = -16777216;
            if (i13 >= height) {
                break;
            }
            char c11 = c10;
            for (int i15 = 0; i15 < width; i15 += iSqrt) {
                int pixel = bitmap.getPixel(i15, i13);
                if (((pixel >> 24) & 255) >= 128) {
                    int i16 = pixel | (-16777216);
                    Color.colorToHSV(i16, fArr);
                    int i17 = (int) fArr[0];
                    if (i17 >= 0 && i17 < 360) {
                        if (i14 < i10) {
                            iArr[i14] = i16;
                            i14++;
                        }
                        float f11 = fArr2[i17] + (fArr[c11] * fArr[2]);
                        fArr2[i17] = f11;
                        if (f11 > f10) {
                            i12 = i17;
                            f10 = f11;
                        }
                    }
                }
            }
            i13 += iSqrt;
            c10 = c11;
        }
        char c12 = c10;
        SparseArray sparseArray = new SparseArray();
        float f12 = -1.0f;
        for (int i18 = 0; i18 < i14; i18++) {
            int i19 = iArr[i18];
            Color.colorToHSV(i19, fArr);
            if (((int) fArr[0]) == i12) {
                float f13 = fArr[c12];
                float f14 = fArr[2];
                int i20 = ((int) (100.0f * f13)) + ((int) (10000.0f * f14));
                float fFloatValue = f13 * f14;
                Float f15 = (Float) sparseArray.get(i20);
                if (f15 != null) {
                    fFloatValue += f15.floatValue();
                }
                sparseArray.put(i20, Float.valueOf(fFloatValue));
                if (fFloatValue > f12) {
                    i11 = i19;
                    f12 = fFloatValue;
                }
            }
        }
        return i11;
    }
}

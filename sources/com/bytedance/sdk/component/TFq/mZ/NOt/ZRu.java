package com.bytedance.sdk.component.TFq.mZ.NOt;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import androidx.core.view.C2500w;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    private final ImageView.ScaleType FA;
    private final int Ht;
    private final int Mm;
    private int TFq;
    private final int Vor = C2500w.f111959a;
    private final int aT = 104857600;
    private final Bitmap.Config mZ;
    private int uR;
    public static final ImageView.ScaleType ZRu = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config NOt = Bitmap.Config.ARGB_4444;

    public ZRu(int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, int i12, int i13) {
        this.mZ = config;
        this.uR = i10;
        this.TFq = i11;
        this.FA = scaleType;
        this.Ht = i12;
        this.Mm = i13;
        ZRu(i10, i11);
    }

    public static int ZRu(int i10, int i11, int i12, int i13, int i14, int i15) {
        double dMin = Math.min(((double) i10) / ((double) i12), ((double) i11) / ((double) i13));
        if (i14 > 0 && i15 > 0) {
            dMin = Math.max(dMin, Math.min(((double) Math.max(i10, i11)) / ((double) Math.max(i14, i15)), ((double) Math.min(i10, i11)) / ((double) Math.min(i14, i15))));
        }
        float f10 = 1.0f;
        while (true) {
            float f11 = 2.0f * f10;
            if (f11 > dMin) {
                return (int) f10;
            }
            f10 = f11;
        }
    }

    private static int ZRu(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 != 0 || i11 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i10 == 0) {
                    return (int) (((double) i12) * (((double) i11) / ((double) i13)));
                }
                if (i11 == 0) {
                    return i10;
                }
                double d10 = ((double) i13) / ((double) i12);
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d11 = i11;
                    return ((double) i10) * d10 < d11 ? (int) (d11 / d10) : i10;
                }
                double d12 = i11;
                return ((double) i10) * d10 > d12 ? (int) (d12 / d10) : i10;
            }
            if (i10 != 0) {
                return i10;
            }
        }
        return i12;
    }

    public Bitmap ZRu(byte[] bArr) {
        Bitmap bitmapDecodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.uR == 0 && this.TFq == 0) {
            options.inPreferredConfig = this.mZ;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int iZRu = ZRu(this.uR, this.TFq, i10, i11, this.FA);
            int iZRu2 = ZRu(this.TFq, this.uR, i11, i10, this.FA);
            options.inJustDecodeBounds = false;
            options.inSampleSize = ZRu(i10, i11, iZRu, iZRu2, this.Ht, this.Mm);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iZRu || bitmapDecodeByteArray.getHeight() > iZRu2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iZRu, iZRu2, true);
                if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        if (bitmapDecodeByteArray != null && bitmapDecodeByteArray.getByteCount() > 104857600) {
            int width = bitmapDecodeByteArray.getWidth() / 2;
            int height = bitmapDecodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDecodeByteArray, width, height, true);
                if (bitmapCreateScaledBitmap2 != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                return bitmapCreateScaledBitmap2;
            }
        }
        return bitmapDecodeByteArray;
    }

    private void ZRu(int i10, int i11) {
        if (i10 > 3840 && i11 > 3840) {
            if (i10 > i11) {
                this.uR = C2500w.f111959a;
                this.TFq = (i11 * C2500w.f111959a) / i10;
                return;
            } else {
                this.uR = (i10 * C2500w.f111959a) / i11;
                this.TFq = C2500w.f111959a;
                return;
            }
        }
        if (i10 > 3840) {
            this.uR = C2500w.f111959a;
            this.TFq = (i11 * C2500w.f111959a) / i10;
        } else if (i11 > 3840) {
            this.uR = (i10 * C2500w.f111959a) / i11;
            this.TFq = C2500w.f111959a;
        }
    }
}

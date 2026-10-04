package com.inmobi.media;

import android.graphics.Bitmap;
import android.util.Log;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes5.dex */
public abstract class H1 implements InterfaceC3478b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdConfig.AdQualityConfig f152011a;

    public H1(AdConfig.AdQualityConfig adQualityConfig) {
        kotlin.jvm.internal.G.p(adQualityConfig, "adQualityConfig");
        this.f152011a = adQualityConfig;
    }

    public final Bitmap a(Bitmap bitmap) {
        kotlin.jvm.internal.G.p(bitmap, "bitmap");
        double resizedPercentage = (((double) this.f152011a.getResizedPercentage()) / 100.0d) * ((double) bitmap.getWidth());
        double resizedPercentage2 = (((double) this.f152011a.getResizedPercentage()) / 100.0d) * ((double) bitmap.getHeight());
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) resizedPercentage, (int) resizedPercentage2, true);
        kotlin.jvm.internal.G.o(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        int length = byteArrayOutputStream.toByteArray().length;
        if (length <= this.f152011a.getMaxImageSize()) {
            return bitmapCreateScaledBitmap;
        }
        StringBuilder sb2 = new StringBuilder("resize - original - ");
        sb2.append(resizedPercentage);
        String str = "  - ";
        sb2.append("  - ");
        sb2.append(resizedPercentage2);
        sb2.append(" - size - ");
        sb2.append(length);
        String message = sb2.toString();
        kotlin.jvm.internal.G.p(message, "message");
        Log.i("BaseScreenShotProcess", message);
        while (length > this.f152011a.getMaxImageSize()) {
            String str2 = str;
            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            double dSqrt = Math.sqrt(((double) this.f152011a.getMaxImageSize()) / ((double) length));
            resizedPercentage *= dSqrt;
            resizedPercentage2 *= dSqrt;
            if (Math.floor(resizedPercentage) <= 0.0d && Math.floor(resizedPercentage2) <= 0.0d) {
                return bitmapCreateScaledBitmap;
            }
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, (int) Math.floor(resizedPercentage), (int) Math.floor(resizedPercentage2), true);
            kotlin.jvm.internal.G.o(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
            byteArrayOutputStream2.reset();
            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream2);
            length = byteArrayOutputStream2.toByteArray().length;
            str = str2;
            byteArrayOutputStream = byteArrayOutputStream2;
        }
        String message2 = "resize - " + resizedPercentage + str + resizedPercentage2 + " - " + byteArrayOutputStream.size();
        kotlin.jvm.internal.G.p(message2, "message");
        Log.i("BaseScreenShotProcess", message2);
        return bitmapCreateScaledBitmap;
    }
}

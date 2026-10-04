package com.android.launcher3.graphics;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import com.android.launcher3.Utilities;

/* JADX INFO: loaded from: classes2.dex */
public class BitmapRenderer {
    public static final boolean USE_HARDWARE_BITMAP = Utilities.ATLEAST_P;

    public interface Renderer {
        void draw(Canvas canvas);
    }

    @TargetApi(28)
    public static Bitmap createHardwareBitmap(int i10, int i11, Renderer renderer) {
        if (!USE_HARDWARE_BITMAP) {
            return createSoftwareBitmap(i10, i11, renderer);
        }
        Picture picture = new Picture();
        renderer.draw(picture.beginRecording(i10, i11));
        picture.endRecording();
        return Bitmap.createBitmap(picture);
    }

    public static Bitmap createSoftwareBitmap(int i10, int i11, Renderer renderer) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        renderer.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }
}

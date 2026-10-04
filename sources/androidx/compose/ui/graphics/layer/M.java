package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.compose.ui.graphics.M0;

/* JADX INFO: loaded from: classes.dex */
public final class M {
    public static final Bitmap b(Image image) {
        Image.Plane[] planes = image.getPlanes();
        kotlin.jvm.internal.G.m(planes);
        Image.Plane plane = planes[0];
        int height = image.getHeight() * image.getWidth();
        int[] iArr = new int[height];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i10 = 0; i10 < height; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = M0.t(M0.c(i11 & 255, (i11 >> 8) & 255, (i11 >> 16) & 255, (i11 >> 24) & 255));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }
}

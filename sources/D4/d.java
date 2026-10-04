package d4;

import C4.u;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nBitmapExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapExtensions.kt\ncom/cookiegames/smartcookie/extensions/BitmapExtensionsKt\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,39:1\n90#2,6:40\n*S KotlinDebug\n*F\n+ 1 BitmapExtensions.kt\ncom/cookiegames/smartcookie/extensions/BitmapExtensionsKt\n*L\n36#1:40,6\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Paint f194724a;

    static {
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.5f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        f194724a = paint;
    }

    @NotNull
    public static final Bitmap a(@NotNull Bitmap bitmap) {
        G.p(bitmap, "<this>");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, f194724a);
        return bitmapCreateBitmap;
    }

    @NotNull
    public static final Bitmap b(@NotNull Bitmap bitmap) {
        G.p(bitmap, "<this>");
        int iL = u.l(4.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth() + iL, bitmap.getHeight() + iL, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        float f10 = iL / 2;
        canvas.drawBitmap(bitmap, f10, f10, new Paint(2));
        G.o(bitmapCreateBitmap, "let(...)");
        return bitmapCreateBitmap;
    }
}

package K4;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Paint f58415a;

        public b a(boolean z10) {
            this.f58415a.setAntiAlias(z10);
            return this;
        }

        public Paint b() {
            return this.f58415a;
        }

        public b c(int i10) {
            this.f58415a.setColor(i10);
            return this;
        }

        public b d(PorterDuff.Mode mode) {
            this.f58415a.setXfermode(new PorterDuffXfermode(mode));
            return this;
        }

        public b e(Shader shader) {
            this.f58415a.setShader(shader);
            return this;
        }

        public b f(float f10) {
            this.f58415a.setStrokeWidth(f10);
            return this;
        }

        public b g(Paint.Style style) {
            this.f58415a.setStyle(style);
            return this;
        }

        public b h(PorterDuff.Mode mode) {
            this.f58415a.setXfermode(new PorterDuffXfermode(mode));
            return this;
        }

        public b() {
            this.f58415a = new Paint(1);
        }
    }

    public static Bitmap a(int i10) {
        Paint paint = new b().f58415a;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int iRound = Math.round(i10 / 2.0f);
        for (int i11 = 0; i11 < 2; i11++) {
            for (int i12 = 0; i12 < 2; i12++) {
                if ((i11 + i12) % 2 == 0) {
                    paint.setColor(-1);
                } else {
                    paint.setColor(-3092272);
                }
                canvas.drawRect(i11 * iRound, i12 * iRound, (i11 + 1) * iRound, r10 * iRound, paint);
            }
        }
        return bitmapCreateBitmap;
    }

    public static Shader b(int i10) {
        Bitmap bitmapA = a(Math.max(8, (i10 / 2) * 2));
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        return new BitmapShader(bitmapA, tileMode, tileMode);
    }

    public static b c() {
        return new b();
    }
}

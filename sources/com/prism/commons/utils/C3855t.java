package com.prism.commons.utils;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.prism.commons.utils.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3855t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162149a = "t";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f162150b = 262144;

    public static Bitmap a(Bitmap bitmap, int i10) {
        if (bitmap == null) {
            return null;
        }
        int byteCount = bitmap.getByteCount();
        if (byteCount <= i10) {
            return bitmap;
        }
        int iCeil = (int) Math.ceil(Math.log((((double) byteCount) * 1.0d) / ((double) i10)) / Math.log(4.0d));
        if (iCeil < 1) {
            iCeil = 1;
        }
        int i11 = 1 << iCeil;
        return Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / i11, bitmap.getHeight() / i11, true);
    }

    public static Bitmap b(Resources resources, int i10) {
        InputStream inputStreamOpenRawResource = resources.openRawResource(i10);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return BitmapFactory.decodeStream(inputStreamOpenRawResource, null, options);
    }

    public static Drawable c(Resources resources, int i10) {
        InputStream inputStreamOpenRawResource = resources.openRawResource(i10);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return new BitmapDrawable(resources, inputStreamOpenRawResource);
    }

    public static Bitmap d(Bitmap bitmap, String str, float f10) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCopy = bitmap.copy(config, true);
        Canvas canvas = new Canvas(bitmapCopy);
        Paint paint = new Paint(1);
        paint.setColor(-65536);
        paint.setTextSize(5.0f * f10);
        paint.setShadowLayer(1.0f, 0.0f, 1.0f, -1);
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        int width = (bitmapCopy.getWidth() - rect.width()) / 2;
        int iHeight = (rect.height() + bitmapCopy.getHeight()) / 2;
        Log.d(f162149a, "scale=" + f10 + ";x=" + width + "; y=" + iHeight);
        canvas.drawText(str, ((float) width) * f10, ((float) iHeight) * f10, paint);
        canvas.save();
        canvas.restore();
        return bitmapCopy;
    }

    public static Bitmap e(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static Bitmap f(Context context, Bitmap bitmap, float f10, Bitmap bitmap2, Bitmap bitmap3) {
        context.getResources().getDisplayMetrics();
        int width = bitmap.getWidth();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setFilterBitmap(true);
        canvas.drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), new Rect(0, 0, width, width), paint);
        int i10 = (int) (((double) ((1.0f - f10) * width)) / 2.0d);
        int i11 = width - i10;
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(i10, i10, i11, i11), paint);
        canvas.drawBitmap(bitmap3, new Rect(0, 0, bitmap3.getWidth(), bitmap3.getHeight()), new Rect(0, 0, width, width), paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap g(Resources resources, Bitmap bitmap, String str) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float f10 = displayMetrics.density / 1.5f;
        String str2 = f162149a;
        Log.d(str2, "density:" + displayMetrics.density);
        Log.d(str2, "dpi:" + displayMetrics.densityDpi);
        Log.d(str2, "factor:" + f10);
        int dimension = (int) resources.getDimension(R.dimen.app_icon_size);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimension, dimension, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setFilterBitmap(true);
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, dimension, dimension), paint);
        Paint paint2 = new Paint(257);
        paint2.setColor(-65536);
        paint2.setTextSize(20.0f * f10);
        paint2.setTypeface(Typeface.DEFAULT_BOLD);
        Log.d(str2, "text width:" + ((int) paint2.measureText(str, 0, str.length())));
        Paint paint3 = new Paint(1);
        paint3.setColor(-65536);
        float f11 = 15.0f * f10;
        canvas.drawCircle(dimension - f11, f11, f11, paint3);
        canvas.drawText(str, (dimension - (r6 / 2)) - f11, f10 * 22.0f, paint2);
        return bitmapCreateBitmap;
    }

    public static Bitmap h(String str) {
        return BitmapFactory.decodeFile(str);
    }

    public static boolean i(File file, Bitmap bitmap) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                C3858w.L(file);
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException e10) {
            e = e10;
        } catch (IOException e11) {
            e = e11;
        }
        try {
            boolean zCompress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            return zCompress;
        } catch (FileNotFoundException e12) {
            e = e12;
            fileOutputStream2 = fileOutputStream;
            Log.e(f162149a, "DrawableUtils.saveBitmap(): File not found: " + e.getMessage(), e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            return false;
        } catch (IOException e13) {
            e = e13;
            fileOutputStream2 = fileOutputStream;
            Log.e(f162149a, "DrawableUtils.saveBitmap(): Error accessing file: " + e.getMessage(), e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public static boolean j(String str, Bitmap bitmap) {
        return i(new File(str), bitmap);
    }
}

package com.prism.gaia.helper.utils;

import B0.C0920d;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import e.InterfaceC4337k;
import e.InterfaceC4346u;
import e.InterfaceC4348w;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f165211a = 1024;
    }

    public q() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static Bitmap A(Bitmap bitmap, float f10, float f11) {
        return x0(bitmap, f10, f11, false);
    }

    public static Bitmap A0(Bitmap bitmap, float f10, float f11) {
        return C0(bitmap, f10, f11, 0.0f, 0.0f, false);
    }

    public static Bitmap B(Bitmap bitmap, float f10, float f11, boolean z10) {
        return x0(bitmap, f10, f11, z10);
    }

    public static Bitmap B0(Bitmap bitmap, float f10, float f11, float f12, float f13) {
        return C0(bitmap, f10, f11, f12, f13, false);
    }

    public static Bitmap C(Bitmap bitmap, int i10, int i11) {
        return z0(bitmap, i10, i11, false);
    }

    public static Bitmap C0(Bitmap bitmap, float f10, float f11, float f12, float f13, boolean z10) {
        if (h0(bitmap)) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setSkew(f10, f11, f12, f13);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap D(Bitmap bitmap, int i10, int i11, boolean z10) {
        return z0(bitmap, i10, i11, z10);
    }

    public static Bitmap D0(Bitmap bitmap, float f10, float f11, boolean z10) {
        return C0(bitmap, f10, f11, 0.0f, 0.0f, z10);
    }

    public static boolean E(File file) {
        if (file == null) {
            return false;
        }
        if ((file.exists() && !file.delete()) || !F(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static Bitmap E0(Bitmap bitmap, int i10) {
        return F0(bitmap, i10, false);
    }

    public static boolean F(File file) {
        if (file != null) {
            return file.exists() ? file.isDirectory() : file.mkdirs();
        }
        return false;
    }

    public static Bitmap F0(Bitmap bitmap, int i10, boolean z10) {
        int i11;
        Bitmap bitmapCopy = z10 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        int i12 = i10;
        if (i12 < 1) {
            i12 = 1;
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i13 = width * height;
        int[] iArr = new int[i13];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i14 = width - 1;
        int i15 = height - 1;
        int i16 = i12 + i12;
        int i17 = i16 + 1;
        int[] iArr2 = new int[i13];
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[Math.max(width, height)];
        int i18 = (i16 + 2) >> 1;
        int i19 = i18 * i18;
        int i20 = i19 * 256;
        int[] iArr6 = new int[i20];
        int i21 = 0;
        for (int i22 = 0; i22 < i20; i22++) {
            iArr6[i22] = i22 / i19;
        }
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i17, 3);
        int i23 = i12 + 1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i24 < height) {
            int[] iArr8 = iArr6;
            int i27 = -i12;
            int i28 = i21;
            int i29 = i28;
            int i30 = i29;
            int i31 = i30;
            int i32 = i31;
            int i33 = i32;
            int i34 = i33;
            int i35 = i34;
            int i36 = i35;
            while (i27 <= i12) {
                Bitmap bitmap2 = bitmapCopy;
                int[] iArr9 = iArr;
                int i37 = i21;
                int i38 = iArr9[Math.min(i14, Math.max(i27, i37)) + i25];
                int[] iArr10 = iArr7[i27 + i12];
                iArr10[i37] = (i38 & androidx.recyclerview.widget.m.f116809W) >> 16;
                iArr10[1] = (i38 & 65280) >> 8;
                iArr10[2] = i38 & 255;
                int iAbs = i23 - Math.abs(i27);
                int i39 = iArr10[i37];
                i36 = (i39 * iAbs) + i36;
                int i40 = iArr10[1];
                i28 = (i40 * iAbs) + i28;
                int i41 = iArr10[2];
                i29 = (iAbs * i41) + i29;
                if (i27 > 0) {
                    i33 += i39;
                    i34 += i40;
                    i35 += i41;
                } else {
                    i30 += i39;
                    i31 += i40;
                    i32 += i41;
                }
                i27++;
                bitmapCopy = bitmap2;
                iArr = iArr9;
                i21 = 0;
            }
            Bitmap bitmap3 = bitmapCopy;
            int[] iArr11 = iArr;
            int i42 = i12;
            int i43 = 0;
            while (i43 < width) {
                iArr2[i25] = iArr8[i36];
                iArr3[i25] = iArr8[i28];
                iArr4[i25] = iArr8[i29];
                int i44 = i36 - i30;
                int i45 = i28 - i31;
                int i46 = i29 - i32;
                int[] iArr12 = iArr7[((i42 - i12) + i17) % i17];
                int i47 = i30 - iArr12[0];
                int i48 = i31 - iArr12[1];
                int i49 = i32 - iArr12[2];
                if (i24 == 0) {
                    i11 = i43;
                    iArr5[i11] = Math.min(i43 + i12 + 1, i14);
                } else {
                    i11 = i43;
                }
                int i50 = iArr11[i26 + iArr5[i11]];
                int i51 = (i50 & androidx.recyclerview.widget.m.f116809W) >> 16;
                iArr12[0] = i51;
                int i52 = (i50 & 65280) >> 8;
                iArr12[1] = i52;
                int i53 = i50 & 255;
                iArr12[2] = i53;
                int i54 = i33 + i51;
                int i55 = i34 + i52;
                int i56 = i35 + i53;
                i36 = i44 + i54;
                i28 = i45 + i55;
                i29 = i46 + i56;
                i42 = (i42 + 1) % i17;
                int[] iArr13 = iArr7[i42 % i17];
                int i57 = iArr13[0];
                i30 = i47 + i57;
                int i58 = iArr13[1];
                i31 = i48 + i58;
                int i59 = iArr13[2];
                i32 = i49 + i59;
                i33 = i54 - i57;
                i34 = i55 - i58;
                i35 = i56 - i59;
                i25++;
                i43 = i11 + 1;
            }
            i26 += width;
            i24++;
            iArr6 = iArr8;
            bitmapCopy = bitmap3;
            iArr = iArr11;
            i21 = 0;
        }
        int[] iArr14 = iArr6;
        Bitmap bitmap4 = bitmapCopy;
        int[] iArr15 = iArr;
        int i60 = 0;
        while (i60 < width) {
            int i61 = -i12;
            int i62 = i60;
            int i63 = i61 * width;
            int i64 = 0;
            int i65 = 0;
            int i66 = 0;
            int i67 = 0;
            int i68 = 0;
            int i69 = 0;
            int i70 = 0;
            int i71 = 0;
            int i72 = 0;
            while (i61 <= i12) {
                int i73 = i12;
                int iMax = Math.max(0, i63) + i62;
                int[] iArr16 = iArr7[i61 + i73];
                iArr16[0] = iArr2[iMax];
                iArr16[1] = iArr3[iMax];
                iArr16[2] = iArr4[iMax];
                int iAbs2 = i23 - Math.abs(i61);
                i72 = (iArr2[iMax] * iAbs2) + i72;
                i64 = (iArr3[iMax] * iAbs2) + i64;
                i65 = (iArr4[iMax] * iAbs2) + i65;
                if (i61 > 0) {
                    i69 += iArr16[0];
                    i70 += iArr16[1];
                    i71 += iArr16[2];
                } else {
                    i66 += iArr16[0];
                    i67 += iArr16[1];
                    i68 += iArr16[2];
                }
                if (i61 < i15) {
                    i63 += width;
                }
                i61++;
                i12 = i73;
            }
            int i74 = i12;
            int i75 = i72;
            int i76 = i62;
            int i77 = i74;
            for (int i78 = 0; i78 < height; i78++) {
                iArr15[i76] = (iArr15[i76] & (-16777216)) | (iArr14[i75] << 16) | (iArr14[i64] << 8) | iArr14[i65];
                int i79 = i75 - i66;
                int i80 = i64 - i67;
                int i81 = i65 - i68;
                int[] iArr17 = iArr7[((i77 - i74) + i17) % i17];
                int i82 = i66 - iArr17[0];
                int i83 = i67 - iArr17[1];
                int i84 = i68 - iArr17[2];
                if (i62 == 0) {
                    iArr5[i78] = Math.min(i78 + i23, i15) * width;
                }
                int i85 = i62 + iArr5[i78];
                int i86 = iArr2[i85];
                iArr17[0] = i86;
                int i87 = iArr3[i85];
                iArr17[1] = i87;
                int i88 = iArr4[i85];
                iArr17[2] = i88;
                int i89 = i69 + i86;
                int i90 = i70 + i87;
                int i91 = i71 + i88;
                i75 = i79 + i89;
                i64 = i80 + i90;
                i65 = i81 + i91;
                i77 = (i77 + 1) % i17;
                int[] iArr18 = iArr7[i77];
                int i92 = iArr18[0];
                i66 = i82 + i92;
                int i93 = iArr18[1];
                i67 = i83 + i93;
                int i94 = iArr18[2];
                i68 = i84 + i94;
                i69 = i89 - i92;
                i70 = i90 - i93;
                i71 = i91 - i94;
                i76 += width;
            }
            i60 = i62 + 1;
            i12 = i74;
        }
        bitmap4.setPixels(iArr15, 0, width, 0, 0, width, height);
        return bitmap4;
    }

    public static Bitmap G(Context context, Bitmap bitmap, String str, Paint paint, Rect rect, int i10, int i11) {
        Bitmap.Config config = bitmap.getConfig();
        paint.setDither(true);
        paint.setFilterBitmap(true);
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCopy = bitmap.copy(config, true);
        new Canvas(bitmapCopy).drawText(str, i10, i11, paint);
        return bitmapCopy;
    }

    public static Bitmap G0(Bitmap bitmap) {
        return H0(bitmap, Boolean.FALSE);
    }

    public static Bitmap H(Context context, Bitmap bitmap, String str, int i10, int i11, int i12, int i13) {
        Paint paint = new Paint(1);
        paint.setColor(i11);
        paint.setTextSize(com.prism.commons.utils.r.a(context, i10));
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return G(context, bitmap, str, paint, rect, com.prism.commons.utils.r.a(context, i12), bitmap.getHeight() - com.prism.commons.utils.r.a(context, i13));
    }

    public static Bitmap H0(Bitmap bitmap, Boolean bool) {
        if (h0(bitmap)) {
            return null;
        }
        Bitmap bitmapExtractAlpha = bitmap.extractAlpha();
        if (bool.booleanValue() && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapExtractAlpha;
    }

    public static Bitmap I(Context context, Bitmap bitmap, String str, int i10, int i11, int i12, int i13) {
        Paint paint = new Paint(1);
        paint.setColor(i11);
        paint.setTextSize(com.prism.commons.utils.r.a(context, i10));
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return G(context, bitmap, str, paint, rect, com.prism.commons.utils.r.a(context, i12), com.prism.commons.utils.r.a(context, i13) + rect.height());
    }

    public static Bitmap I0(Bitmap bitmap) {
        return J0(bitmap, false);
    }

    public static Bitmap J(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static Bitmap J0(Bitmap bitmap, boolean z10) {
        if (h0(bitmap)) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static byte[] K(Drawable drawable, Bitmap.CompressFormat compressFormat) {
        if (drawable == null) {
            return null;
        }
        return l(J(drawable), compressFormat);
    }

    public static Bitmap K0(Bitmap bitmap) {
        return M0(bitmap, 0, 0, false);
    }

    public static Bitmap L(Context context, Bitmap bitmap, @InterfaceC4348w(from = 0.0d, fromInclusive = false, to = 1.0d) float f10, @InterfaceC4348w(from = 0.0d, fromInclusive = false, to = 25.0d) float f11) {
        return M(context, bitmap, f10, f11, false);
    }

    public static Bitmap L0(Bitmap bitmap, @e.D(from = 0) int i10, @InterfaceC4337k int i11) {
        return M0(bitmap, i10, i11, false);
    }

    public static Bitmap M(Context context, Bitmap bitmap, @InterfaceC4348w(from = 0.0d, fromInclusive = false, to = 1.0d) float f10, @InterfaceC4348w(from = 0.0d, fromInclusive = false, to = 25.0d) float f11, boolean z10) throws Throwable {
        if (h0(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale(f10, f10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Paint paint = new Paint(3);
        Canvas canvas = new Canvas();
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        canvas.scale(f10, f10);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
        Bitmap bitmapP0 = p0(context, bitmapCreateBitmap, f11, z10);
        if (f10 == 1.0f) {
            if (z10 && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            return bitmapP0;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapP0, width, height, true);
        if (!bitmapP0.isRecycled()) {
            bitmapP0.recycle();
        }
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateScaledBitmap;
    }

    public static Bitmap M0(Bitmap bitmap, @e.D(from = 0) int i10, @InterfaceC4337k int i11, boolean z10) {
        if (h0(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMin = Math.min(width, height);
        Paint paint = new Paint(1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        float f10 = iMin;
        float f11 = f10 / 2.0f;
        float f12 = width;
        float f13 = height;
        RectF rectF = new RectF(0.0f, 0.0f, f12, f13);
        rectF.inset((width - iMin) / 2.0f, (height - iMin) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.setTranslate(rectF.left, rectF.top);
        matrix.preScale(f10 / f12, f10 / f13);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawRoundRect(rectF, f11, f11, paint);
        if (i10 > 0) {
            paint.setShader(null);
            paint.setColor(i11);
            paint.setStyle(Paint.Style.STROKE);
            float f14 = i10;
            paint.setStrokeWidth(f14);
            canvas.drawCircle(f12 / 2.0f, f13 / 2.0f, f11 - (f14 / 2.0f), paint);
        }
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap N(Context context, @InterfaceC4346u int i10) {
        Drawable drawable = C0920d.getDrawable(context, i10);
        Canvas canvas = new Canvas();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        canvas.setBitmap(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static Bitmap N0(Bitmap bitmap, boolean z10) {
        return M0(bitmap, 0, 0, z10);
    }

    public static Bitmap O(Context context, @InterfaceC4346u int i10, int i11, int i12) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        Resources resources = context.getResources();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i10, options);
        options.inSampleSize = p(options, i11, i12);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(resources, i10, options);
    }

    public static Bitmap O0(Bitmap bitmap, float f10) {
        return Q0(bitmap, f10, 0, 0, false);
    }

    public static Bitmap P(File file) {
        if (file == null) {
            return null;
        }
        return BitmapFactory.decodeFile(file.getAbsolutePath());
    }

    public static Bitmap P0(Bitmap bitmap, float f10, @e.D(from = 0) int i10, @InterfaceC4337k int i11) {
        return Q0(bitmap, f10, i10, i11, false);
    }

    public static Bitmap Q(File file, int i10, int i11) {
        if (file == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        options.inSampleSize = p(options, i10, i11);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
    }

    public static Bitmap Q0(Bitmap bitmap, float f10, @e.D(from = 0) int i10, @InterfaceC4337k int i11, boolean z10) {
        if (h0(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Paint paint = new Paint(1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        float f11 = i10;
        float f12 = f11 / 2.0f;
        rectF.inset(f12, f12);
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (i10 > 0) {
            paint.setShader(null);
            paint.setColor(i11);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(f11);
            paint.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap R(FileDescriptor fileDescriptor) {
        if (fileDescriptor == null) {
            return null;
        }
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    public static Bitmap R0(Bitmap bitmap, float f10, boolean z10) {
        return Q0(bitmap, f10, 0, 0, z10);
    }

    public static Bitmap S(FileDescriptor fileDescriptor, int i10, int i11) {
        if (fileDescriptor == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        options.inSampleSize = p(options, i10, i11);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }

    public static Bitmap S0(View view) {
        if (view == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static Bitmap T(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        return BitmapFactory.decodeStream(inputStream);
    }

    public static Bitmap U(InputStream inputStream, int i10, int i11) {
        if (inputStream == null) {
            return null;
        }
        return Y(f0(inputStream), 0, i10, i11);
    }

    public static Bitmap V(String str) {
        if (n0(str)) {
            return null;
        }
        return BitmapFactory.decodeFile(str);
    }

    public static Bitmap W(String str, int i10, int i11) {
        if (n0(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = p(options, i10, i11);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap X(byte[] bArr, int i10) {
        if (bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, i10, bArr.length);
    }

    public static Bitmap Y(byte[] bArr, int i10, int i11, int i12) {
        if (bArr.length == 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, i10, bArr.length, options);
        options.inSampleSize = p(options, i11, i12);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(bArr, i10, bArr.length, options);
    }

    public static File Z(String str) {
        if (n0(str)) {
            return null;
        }
        return new File(str);
    }

    public static Bitmap a(Bitmap bitmap, @e.D(from = 1) int i10, @InterfaceC4337k int i11, boolean z10, float f10, boolean z11) {
        if (h0(bitmap)) {
            return null;
        }
        if (!z11) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(1);
        paint.setColor(i11);
        paint.setStyle(Paint.Style.STROKE);
        float f11 = i10;
        paint.setStrokeWidth(f11);
        if (z10) {
            canvas.drawCircle(width / 2.0f, height / 2.0f, (Math.min(width, height) / 2.0f) - (f11 / 2.0f), paint);
            return bitmap;
        }
        float f12 = i10 >> 1;
        canvas.drawRoundRect(new RectF(f12, f12, width - r5, height - r5), f10, f10, paint);
        return bitmap;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0012: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:19), block:B:10:0x0012 */
    public static String a0(File file) throws Throwable {
        InputStream inputStream;
        FileInputStream fileInputStream;
        InputStream inputStream2 = null;
        try {
            if (file == null) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    String strB0 = b0(fileInputStream);
                    try {
                        fileInputStream.close();
                    } catch (Exception unused) {
                    }
                    return strB0;
                } catch (IOException e10) {
                    e = e10;
                    e.printStackTrace();
                    try {
                        fileInputStream.close();
                    } catch (Exception unused2) {
                    }
                    return null;
                }
            } catch (IOException e11) {
                e = e11;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                try {
                    inputStream2.close();
                } catch (Exception unused3) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
        }
    }

    public static Bitmap b(Bitmap bitmap, @e.D(from = 1) int i10, @InterfaceC4337k int i11) {
        return a(bitmap, i10, i11, true, 0.0f, false);
    }

    public static String b0(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[8];
            if (inputStream.read(bArr, 0, 8) != -1) {
                return d0(bArr);
            }
            return null;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Bitmap c(Bitmap bitmap, @e.D(from = 1) int i10, @InterfaceC4337k int i11, boolean z10) {
        return a(bitmap, i10, i11, true, 0.0f, z10);
    }

    public static String c0(String str) {
        return a0(Z(str));
    }

    public static Bitmap d(Bitmap bitmap, @e.D(from = 1) int i10, @InterfaceC4337k int i11, @InterfaceC4348w(from = 0.0d) float f10) {
        return a(bitmap, i10, i11, false, f10, false);
    }

    public static String d0(byte[] bArr) {
        if (l0(bArr)) {
            return "JPEG";
        }
        if (i0(bArr)) {
            return "GIF";
        }
        if (m0(bArr)) {
            return "PNG";
        }
        if (g0(bArr)) {
            return "BMP";
        }
        return null;
    }

    public static Bitmap e(Bitmap bitmap, @e.D(from = 1) int i10, @InterfaceC4337k int i11, @InterfaceC4348w(from = 0.0d) float f10, boolean z10) {
        return a(bitmap, i10, i11, false, f10, z10);
    }

    public static int e0(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(t1.b.f238676C, 1);
            return attributeInt != 3 ? attributeInt != 8 ? 90 : 270 : Opcodes.GETFIELD;
        } catch (IOException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static Bitmap f(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12) {
        return g(bitmap, bitmap2, i10, i11, i12, false);
    }

    public static byte[] f0(InputStream inputStream) {
        try {
            if (inputStream == null) {
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr, 0, 1024);
                    if (i10 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
                return byteArray;
            } catch (IOException e10) {
                e10.printStackTrace();
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public static Bitmap g(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        if (h0(bitmap)) {
            return null;
        }
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), true);
        if (!h0(bitmap2)) {
            Paint paint = new Paint(1);
            Canvas canvas = new Canvas(bitmapCopy);
            paint.setAlpha(i12);
            canvas.drawBitmap(bitmap2, i10, i11, paint);
        }
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCopy;
    }

    public static boolean g0(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 66 && bArr[1] == 77;
    }

    public static Bitmap h(Bitmap bitmap, int i10) {
        return i(bitmap, i10, false);
    }

    public static boolean h0(Bitmap bitmap) {
        return bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0;
    }

    public static Bitmap i(Bitmap bitmap, int i10, boolean z10) {
        if (h0(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, height - i10, width, i10, matrix, false);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width, height + i10, bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        float f10 = height;
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, f10, (Paint) null);
        Paint paint = new Paint(1);
        paint.setShader(new LinearGradient(0.0f, height, 0.0f, bitmapCreateBitmap2.getHeight(), 1895825407, 16777215, Shader.TileMode.MIRROR));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawRect(0.0f, f10, width, bitmapCreateBitmap2.getHeight(), paint);
        if (!bitmapCreateBitmap.isRecycled()) {
            bitmapCreateBitmap.recycle();
        }
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap2;
    }

    public static boolean i0(byte[] bArr) {
        byte b10;
        return bArr.length >= 6 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 56 && ((b10 = bArr[4]) == 55 || b10 == 57) && bArr[5] == 97;
    }

    public static Bitmap j(Bitmap bitmap, String str, float f10, @InterfaceC4337k int i10, float f11, float f12, boolean z10) {
        if (h0(bitmap) || str == null) {
            return null;
        }
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), true);
        Paint paint = new Paint(1);
        Canvas canvas = new Canvas(bitmapCopy);
        paint.setColor(i10);
        paint.setTextSize(f10);
        paint.getTextBounds(str, 0, str.length(), new Rect());
        canvas.drawText(str, f11, f12 + f10, paint);
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCopy;
    }

    public static boolean j0(File file) {
        return file != null && k0(file.getPath());
    }

    public static Bitmap k(Bitmap bitmap, String str, int i10, @InterfaceC4337k int i11, float f10, float f11) {
        return j(bitmap, str, i10, i11, f10, f11, false);
    }

    public static boolean k0(String str) {
        String upperCase = str.toUpperCase();
        return upperCase.endsWith(".PNG") || upperCase.endsWith(".JPG") || upperCase.endsWith(".JPEG") || upperCase.endsWith(".BMP") || upperCase.endsWith(".GIF") || upperCase.endsWith(".WEBP");
    }

    public static byte[] l(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean l0(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == -1 && bArr[1] == -40;
    }

    public static Drawable m(Context context, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public static boolean m0(byte[] bArr) {
        return bArr.length >= 8 && bArr[0] == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10;
    }

    public static Bitmap n(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public static boolean n0(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isWhitespace(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static Drawable o(Context context, byte[] bArr) {
        return m(context, n(bArr));
    }

    @TargetApi(17)
    public static Bitmap o0(Context context, Bitmap bitmap, @InterfaceC4348w(from = 0.0d, fromInclusive = false, to = 25.0d) float f10) {
        return p0(context, bitmap, f10, false);
    }

    public static int p(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        while (true) {
            i13 >>= 1;
            if (i13 < i10 || (i12 = i12 >> 1) < i11) {
                break;
            }
            i14 <<= 1;
        }
        return i14;
    }

    @TargetApi(17)
    public static Bitmap p0(Context context, Bitmap bitmap, @InterfaceC4348w(from = 0.0d, fromInclusive = false, to = 25.0d) float f10, boolean z10) throws Throwable {
        RenderScript renderScriptCreate;
        if (!z10) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        try {
            renderScriptCreate = RenderScript.create(context);
        } catch (Throwable th) {
            th = th;
            renderScriptCreate = null;
        }
        try {
            renderScriptCreate.setMessageHandler(new RenderScript.RSMessageHandler());
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.setRadius(f10);
            scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
            allocationCreateTyped.copyTo(bitmap);
            renderScriptCreate.destroy();
            return bitmap;
        } catch (Throwable th2) {
            th = th2;
            if (renderScriptCreate != null) {
                renderScriptCreate.destroy();
            }
            throw th;
        }
    }

    public static Bitmap q(Bitmap bitmap, int i10, int i11, int i12, int i13) {
        return r(bitmap, i10, i11, i12, i13, false);
    }

    public static Bitmap q0(Bitmap bitmap, int i10, float f10, float f11) {
        return r0(bitmap, i10, f10, f11, false);
    }

    public static Bitmap r(Bitmap bitmap, int i10, int i11, int i12, int i13, boolean z10) {
        if (h0(bitmap)) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i10, i11, i12, i13);
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap r0(Bitmap bitmap, int i10, float f10, float f11, boolean z10) {
        if (h0(bitmap)) {
            return null;
        }
        if (i10 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i10, f10, f11);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap s(Bitmap bitmap, @e.D(from = 0, to = 100) int i10) {
        return t(bitmap, i10, false);
    }

    public static boolean s0(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat) {
        return t0(bitmap, file, compressFormat, false);
    }

    public static Bitmap t(Bitmap bitmap, @e.D(from = 0, to = 100) int i10, boolean z10) {
        if (h0(bitmap)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }

    public static boolean t0(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, boolean z10) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        boolean zCompress = false;
        if (h0(bitmap) || !E(file)) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                } catch (Exception unused) {
                }
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            zCompress = bitmap.compress(compressFormat, 100, bufferedOutputStream);
            if (z10 && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            bufferedOutputStream.close();
        } catch (IOException e11) {
            e = e11;
            bufferedOutputStream2 = bufferedOutputStream;
            e.printStackTrace();
            bufferedOutputStream2.close();
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            try {
                bufferedOutputStream2.close();
            } catch (Exception unused2) {
            }
            throw th;
        }
        return zCompress;
    }

    public static Bitmap u(Bitmap bitmap, long j10) {
        return v(bitmap, j10, false);
    }

    public static boolean u0(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        return t0(bitmap, Z(str), compressFormat, false);
    }

    public static Bitmap v(Bitmap bitmap, long j10, boolean z10) {
        byte[] byteArray;
        if (h0(bitmap) || j10 <= 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        int i10 = 100;
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        if (byteArrayOutputStream.size() <= j10) {
            byteArray = byteArrayOutputStream.toByteArray();
        } else {
            byteArrayOutputStream.reset();
            bitmap.compress(compressFormat, 0, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= j10) {
                byteArray = byteArrayOutputStream.toByteArray();
            } else {
                int i11 = 0;
                int i12 = 0;
                while (i11 < i10) {
                    i12 = (i11 + i10) / 2;
                    byteArrayOutputStream.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i12, byteArrayOutputStream);
                    long size = byteArrayOutputStream.size();
                    if (size == j10) {
                        break;
                    }
                    if (size > j10) {
                        i10 = i12 - 1;
                    } else {
                        i11 = i12 + 1;
                    }
                }
                if (i10 == i12 - 1) {
                    byteArrayOutputStream.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i11, byteArrayOutputStream);
                }
                byteArray = byteArrayOutputStream.toByteArray();
            }
        }
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }

    public static boolean v0(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, boolean z10) {
        return t0(bitmap, Z(str), compressFormat, z10);
    }

    public static Bitmap w(Bitmap bitmap, int i10) {
        return z(bitmap, i10, false);
    }

    public static Bitmap w0(Bitmap bitmap, float f10, float f11) {
        return x0(bitmap, f10, f11, false);
    }

    public static Bitmap x(Bitmap bitmap, int i10, int i11) {
        return y(bitmap, i10, i11, false);
    }

    public static Bitmap x0(Bitmap bitmap, float f10, float f11, boolean z10) {
        if (h0(bitmap)) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f10, f11);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap y(Bitmap bitmap, int i10, int i11, boolean z10) {
        if (h0(bitmap)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        options.inSampleSize = p(options, i10, i11);
        options.inJustDecodeBounds = false;
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    public static Bitmap y0(Bitmap bitmap, int i10, int i11) {
        return z0(bitmap, i10, i11, false);
    }

    public static Bitmap z(Bitmap bitmap, int i10, boolean z10) {
        if (h0(bitmap)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    public static Bitmap z0(Bitmap bitmap, int i10, int i11, boolean z10) {
        if (h0(bitmap)) {
            return null;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateScaledBitmap;
    }
}

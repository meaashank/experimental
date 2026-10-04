package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.compose.ui.graphics.C2082m2;
import e.f0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes2.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f139898a = "TransformationUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f139899b = 6;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f139901d = 7;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Paint f139903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set<String> f139904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lock f139905h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Paint f139900c = new Paint(6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Paint f139902e = new Paint(7);

    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f139906a;

        public a(int i10) {
            this.f139906a = i10;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.K.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            int i10 = this.f139906a;
            canvas.drawRoundRect(rectF, i10, i10, paint);
        }
    }

    public class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f139907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f139908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f139909c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f139910d;

        public b(float f10, float f11, float f12, float f13) {
            this.f139907a = f10;
            this.f139908b = f11;
            this.f139909c = f12;
            this.f139910d = f13;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.K.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f10 = this.f139907a;
            float f11 = this.f139908b;
            float f12 = this.f139909c;
            float f13 = this.f139910d;
            path.addRoundRect(rectF, new float[]{f10, f10, f11, f11, f12, f12, f13, f13}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    public interface c {
        void a(Canvas canvas, Paint paint, RectF rectF);
    }

    public static final class d implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        @NonNull
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j10, @NonNull TimeUnit timeUnit) throws InterruptedException {
            return true;
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f139904g = hashSet;
        f139905h = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new d();
        Paint paint = new Paint(7);
        f139903f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
        Lock lock = f139905h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f139900c);
            canvas.setBitmap(null);
            lock.unlock();
        } catch (Throwable th) {
            f139905h.unlock();
            throw th;
        }
    }

    public static Bitmap b(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        float width;
        float fA;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float fA2 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            width = i11 / bitmap.getHeight();
            fA2 = C2082m2.a(bitmap.getWidth(), width, i10, 0.5f);
            fA = 0.0f;
        } else {
            width = i10 / bitmap.getWidth();
            fA = C2082m2.a(bitmap.getHeight(), width, i11, 0.5f);
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (fA2 + 0.5f), (int) (fA + 0.5f));
        Bitmap bitmapF = eVar.f(i10, i11, k(bitmap));
        bitmapF.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, bitmapF, matrix);
        return bitmapF;
    }

    public static Bitmap c(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            if (Log.isLoggable(f139898a, 2)) {
                Log.v(f139898a, "requested target size too big for input, fit centering instead");
            }
            return f(eVar, bitmap, i10, i11);
        }
        if (Log.isLoggable(f139898a, 2)) {
            Log.v(f139898a, "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    public static Bitmap d(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        int iMin = Math.min(i10, i11);
        float f10 = iMin;
        float f11 = f10 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f10 / width, f10 / height);
        float f12 = width * fMax;
        float f13 = fMax * height;
        float f14 = (f10 - f12) / 2.0f;
        float f15 = (f10 - f13) / 2.0f;
        RectF rectF = new RectF(f14, f15, f12 + f14, f13 + f15);
        Bitmap bitmapG = g(eVar, bitmap);
        Bitmap bitmapF = eVar.f(iMin, iMin, h(bitmap));
        bitmapF.setHasAlpha(true);
        Lock lock = f139905h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapF);
            canvas.drawCircle(f11, f11, f11, f139902e);
            canvas.drawBitmap(bitmapG, (Rect) null, rectF, f139903f);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapG.equals(bitmap)) {
                eVar.d(bitmapG);
            }
            return bitmapF;
        } catch (Throwable th) {
            f139905h.unlock();
            throw th;
        }
    }

    public static void e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap f(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() != i10 || bitmap.getHeight() != i11) {
            float fMin = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
            int iRound = Math.round(bitmap.getWidth() * fMin);
            int iRound2 = Math.round(bitmap.getHeight() * fMin);
            if (bitmap.getWidth() != iRound || bitmap.getHeight() != iRound2) {
                Bitmap bitmapF = eVar.f((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), k(bitmap));
                bitmapF.setHasAlpha(bitmap.hasAlpha());
                if (Log.isLoggable(f139898a, 2)) {
                    Log.v(f139898a, "request: " + i10 + "x" + i11);
                    Log.v(f139898a, "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    Log.v(f139898a, "toReuse: " + bitmapF.getWidth() + "x" + bitmapF.getHeight());
                    StringBuilder sb2 = new StringBuilder("minPct:   ");
                    sb2.append(fMin);
                    Log.v(f139898a, sb2.toString());
                }
                Matrix matrix = new Matrix();
                matrix.setScale(fMin, fMin);
                a(bitmap, bitmapF, matrix);
                return bitmapF;
            }
            if (Log.isLoggable(f139898a, 2)) {
                Log.v(f139898a, "adjusted target size matches input, returning input");
            }
        } else if (Log.isLoggable(f139898a, 2)) {
            Log.v(f139898a, "requested target size matches input, returning input");
            return bitmap;
        }
        return bitmap;
    }

    public static Bitmap g(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap) {
        Bitmap.Config configH = h(bitmap);
        if (configH.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapF = eVar.f(bitmap.getWidth(), bitmap.getHeight(), configH);
        new Canvas(bitmapF).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapF;
    }

    @NonNull
    public static Bitmap.Config h(@NonNull Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    public static Lock i() {
        return f139905h;
    }

    public static int j(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return Opcodes.GETFIELD;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    @NonNull
    public static Bitmap.Config k(@NonNull Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    @f0
    public static void l(int i10, Matrix matrix) {
        switch (i10) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    public static boolean m(int i10) {
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap n(@NonNull Bitmap bitmap, int i10) {
        Bitmap bitmap2;
        Matrix matrix;
        if (i10 == 0) {
            return bitmap;
        }
        try {
            matrix = new Matrix();
            matrix.setRotate(i10);
            bitmap2 = bitmap;
        } catch (Exception e10) {
            e = e10;
            bitmap2 = bitmap;
        }
        try {
            return Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception e11) {
            e = e11;
            Exception exc = e;
            if (!Log.isLoggable(f139898a, 6)) {
                return bitmap2;
            }
            Log.e(f139898a, "Exception when trying to orient image", exc);
            return bitmap2;
        }
    }

    public static Bitmap o(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10) {
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                Matrix matrix = new Matrix();
                l(i10, matrix);
                RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                matrix.mapRect(rectF);
                Bitmap bitmapF = eVar.f(Math.round(rectF.width()), Math.round(rectF.height()), k(bitmap));
                matrix.postTranslate(-rectF.left, -rectF.top);
                bitmapF.setHasAlpha(bitmap.hasAlpha());
                a(bitmap, bitmapF, matrix);
                return bitmapF;
            default:
                return bitmap;
        }
    }

    public static Bitmap p(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, float f10, float f11, float f12, float f13) {
        return s(eVar, bitmap, new b(f10, f11, f12, f13));
    }

    public static Bitmap q(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10) {
        y3.m.b(i10 > 0, "roundingRadius must be greater than 0.");
        return s(eVar, bitmap, new a(i10));
    }

    @Deprecated
    public static Bitmap r(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, int i10, int i11, int i12) {
        return q(eVar, bitmap, i12);
    }

    public static Bitmap s(@NonNull com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @NonNull Bitmap bitmap, c cVar) {
        Bitmap.Config configH = h(bitmap);
        Bitmap bitmapG = g(eVar, bitmap);
        Bitmap bitmapF = eVar.f(bitmapG.getWidth(), bitmapG.getHeight(), configH);
        bitmapF.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapG, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapF.getWidth(), bitmapF.getHeight());
        Lock lock = f139905h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapF);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            cVar.a(canvas, paint, rectF);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapG.equals(bitmap)) {
                eVar.d(bitmapG);
            }
            return bitmapF;
        } catch (Throwable th) {
            f139905h.unlock();
            throw th;
        }
    }

    public static void t(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}

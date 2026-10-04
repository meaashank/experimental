package com.android.launcher3;

import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.os.TransactionTooLargeException;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TtsSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import i.C4541d;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class Utilities {
    public static final boolean ATLEAST_LOLLIPOP_MR1;
    public static final boolean ATLEAST_MARSHMALLOW;
    public static final boolean ATLEAST_NOUGAT;
    public static final boolean ATLEAST_NOUGAT_MR1;
    public static final boolean ATLEAST_OREO;
    public static final boolean ATLEAST_OREO_MR1;
    public static final boolean ATLEAST_P;
    public static final int COLOR_EXTRACTION_JOB_ID = 1;
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    public static final String EXTRA_WALLPAPER_OFFSET = "com.android.launcher3.WALLPAPER_OFFSET";
    public static final boolean IS_DEBUG_DEVICE;
    private static final int KEEP_ALIVE = 1;
    private static final int MAXIMUM_POOL_SIZE;
    public static final int SINGLE_FRAME_MS = 16;
    private static final String TAG = "Launcher.HiderUtilities";
    public static final Executor THREAD_POOL_EXECUTOR;
    public static final int WALLPAPER_COMPAT_JOB_ID = 2;
    private static final Pattern sTrimPattern = Pattern.compile("^[\\s|\\p{javaSpaceChar}]*(.*)[\\s|\\p{javaSpaceChar}]*$");
    private static final int[] sLoc0 = new int[2];
    private static final int[] sLoc1 = new int[2];
    private static final float[] sPoint = new float[2];
    private static final Matrix sMatrix = new Matrix();
    private static final Matrix sInverseMatrix = new Matrix();

    static {
        int i10 = Build.VERSION.SDK_INT;
        ATLEAST_P = i10 >= 28;
        ATLEAST_OREO_MR1 = i10 >= 27;
        ATLEAST_OREO = i10 >= 26;
        ATLEAST_NOUGAT_MR1 = i10 >= 25;
        ATLEAST_NOUGAT = i10 >= 24;
        ATLEAST_MARSHMALLOW = true;
        ATLEAST_LOLLIPOP_MR1 = true;
        String str = Build.TYPE;
        IS_DEBUG_DEVICE = str.toLowerCase().contains("debug") || str.toLowerCase().equals("eng");
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        int i11 = iAvailableProcessors + 1;
        CORE_POOL_SIZE = i11;
        int i12 = (iAvailableProcessors * 2) + 1;
        MAXIMUM_POOL_SIZE = i12;
        THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(i11, i12, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public static int boundToRange(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static int calculateTextHeight(float f10) {
        Paint paint = new Paint();
        paint.setTextSize(f10);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return (int) Math.ceil(fontMetrics.bottom - fontMetrics.top);
    }

    public static void closeSilently(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                Log.d(TAG, "Error closing", e10);
            }
        }
    }

    public static boolean containsAll(Bundle bundle, Bundle bundle2) {
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            Object obj2 = bundle.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public static String createDbSelectionQuery(String str, Iterable<?> iterable) {
        return String.format(Locale.ENGLISH, "%s IN (%s)", str, TextUtils.join(U6.j.f68738d, iterable));
    }

    public static float dpiFromPx(int i10, DisplayMetrics displayMetrics) {
        return i10 / (displayMetrics.densityDpi / 160.0f);
    }

    public static Pair<String, Resources> findSystemApk(String str, PackageManager packageManager) {
        Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(new Intent(str), 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (activityInfo.applicationInfo.flags & 1) != 0) {
                String str2 = activityInfo.packageName;
                try {
                    return Pair.create(str2, packageManager.getResourcesForApplication(str2));
                } catch (PackageManager.NameNotFoundException unused) {
                    androidx.constraintlayout.motion.widget.r.a("Failed to find resources for ", str2, TAG);
                }
            }
        }
        return null;
    }

    public static byte[] flattenBitmap(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmap.getHeight() * bitmap.getWidth() * 4);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            Log.w(TAG, "Could not write bitmap");
            return null;
        }
    }

    public static int[] getCenterDeltaInScreenSpace(View view, View view2) {
        int[] iArr = sLoc0;
        view.getLocationInWindow(iArr);
        int[] iArr2 = sLoc1;
        view2.getLocationInWindow(iArr2);
        iArr[0] = (int) (((view.getScaleX() * view.getMeasuredWidth()) / 2.0f) + iArr[0]);
        iArr[1] = (int) (((view.getScaleY() * view.getMeasuredHeight()) / 2.0f) + iArr[1]);
        iArr2[0] = (int) (((view2.getScaleX() * view2.getMeasuredWidth()) / 2.0f) + iArr2[0]);
        int scaleY = (int) (((view2.getScaleY() * view2.getMeasuredHeight()) / 2.0f) + iArr2[1]);
        iArr2[1] = scaleY;
        return new int[]{iArr2[0] - iArr[0], scaleY - iArr[1]};
    }

    public static float getDescendantCoordRelativeToAncestor(View view, View view2, int[] iArr, boolean z10) {
        float[] fArr = sPoint;
        fArr[0] = iArr[0];
        fArr[1] = iArr[1];
        float scaleX = 1.0f;
        for (View view3 = view; view3 != view2 && view3 != null; view3 = (View) view3.getParent()) {
            if (view3 != view || z10) {
                float[] fArr2 = sPoint;
                fArr2[0] = fArr2[0] - view3.getScrollX();
                fArr2[1] = fArr2[1] - view3.getScrollY();
            }
            Matrix matrix = view3.getMatrix();
            float[] fArr3 = sPoint;
            matrix.mapPoints(fArr3);
            fArr3[0] = fArr3[0] + view3.getLeft();
            fArr3[1] = fArr3[1] + view3.getTop();
            scaleX *= view3.getScaleX();
        }
        float[] fArr4 = sPoint;
        iArr[0] = Math.round(fArr4[0]);
        iArr[1] = Math.round(fArr4[1]);
        return scaleX;
    }

    public static SharedPreferences getDevicePrefs(Context context) {
        return context.getSharedPreferences(LauncherFiles.DEVICE_PREFERENCES_KEY, 0);
    }

    public static <T> T getOverrideObject(Class<T> cls, Context context, int i10) {
        String string = context.getString(i10);
        if (!TextUtils.isEmpty(string)) {
            try {
                return (T) Class.forName(string).getDeclaredConstructor(Context.class).newInstance(context);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
                Log.e(TAG, "Bad overriden class", e10);
            }
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static SharedPreferences getPrefs(Context context) {
        return context.getSharedPreferences(LauncherFiles.SHARED_PREFERENCES_KEY, 0);
    }

    public static String getSystemProperty(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getDeclaredMethod(w7.i.f240158w, String.class).invoke(null, str);
            return !TextUtils.isEmpty(str3) ? str3 : str2;
        } catch (Exception unused) {
            Log.d(TAG, "Unable to read system properties");
            return str2;
        }
    }

    public static void insetRect(Rect rect, Rect rect2) {
        rect.left = Math.min(rect.right, rect.left + rect2.left);
        rect.top = Math.min(rect.bottom, rect.top + rect2.top);
        rect.right = Math.max(rect.left, rect.right - rect2.right);
        rect.bottom = Math.max(rect.top, rect.bottom - rect2.bottom);
    }

    public static boolean isBinderSizeError(Exception exc) {
        return (exc.getCause() instanceof TransactionTooLargeException) || (exc.getCause() instanceof DeadObjectException);
    }

    public static boolean isBootCompleted() {
        return "1".equals(getSystemProperty("sys.boot_completed", "1"));
    }

    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isLauncherAppTarget(Intent intent) {
        if (intent == null || !"android.intent.action.MAIN".equals(intent.getAction()) || intent.getComponent() == null || intent.getCategories() == null || intent.getCategories().size() != 1 || !intent.hasCategory("android.intent.category.LAUNCHER") || !TextUtils.isEmpty(intent.getDataString())) {
            return false;
        }
        Bundle extras = intent.getExtras();
        return extras == null || extras.keySet().isEmpty();
    }

    public static boolean isPowerSaverPreventingAnimation(Context context) {
        if (ATLEAST_P) {
            return false;
        }
        return ((PowerManager) context.getSystemService(Y7.a.f79330e)).isPowerSaveMode();
    }

    public static boolean isPropertyEnabled(String str) {
        return Log.isLoggable(str, 2);
    }

    public static boolean isRtl(Resources resources) {
        return resources.getConfiguration().getLayoutDirection() == 1;
    }

    public static boolean isSystemApp(Context context, Intent intent) {
        String packageName;
        ApplicationInfo applicationInfo;
        ActivityInfo activityInfo;
        PackageManager packageManager = context.getPackageManager();
        ComponentName component = intent.getComponent();
        if (component == null) {
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            packageName = (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) ? null : activityInfo.packageName;
        } else {
            packageName = component.getPackageName();
        }
        if (packageName != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                    if ((applicationInfo.flags & 1) != 0) {
                        return true;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static boolean isWallpaperAllowed(Context context) {
        if (!ATLEAST_NOUGAT) {
            return true;
        }
        try {
            WallpaperManager wallpaperManager = (WallpaperManager) context.getSystemService(WallpaperManager.class);
            return ((Boolean) wallpaperManager.getClass().getDeclaredMethod("isSetWallpaperAllowed", null).invoke(wallpaperManager, null)).booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }

    public static int longCompare(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static void mapCoordInSelfToDescendant(View view, View view2, int[] iArr) {
        sMatrix.reset();
        while (view != view2) {
            Matrix matrix = sMatrix;
            matrix.postTranslate(-view.getScrollX(), -view.getScrollY());
            matrix.postConcat(view.getMatrix());
            matrix.postTranslate(view.getLeft(), view.getTop());
            view = (View) view.getParent();
        }
        Matrix matrix2 = sMatrix;
        matrix2.postTranslate(-view.getScrollX(), -view.getScrollY());
        Matrix matrix3 = sInverseMatrix;
        matrix2.invert(matrix3);
        float[] fArr = sPoint;
        fArr[0] = iArr[0];
        fArr[1] = iArr[1];
        matrix3.mapPoints(fArr);
        iArr[0] = Math.round(fArr[0]);
        iArr[1] = Math.round(fArr[1]);
    }

    public static float mapRange(float f10, float f11, float f12) {
        return C4541d.a(f12, f11, f10, f11);
    }

    public static boolean pointInView(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) view.getWidth()) + f12 && f11 < ((float) view.getHeight()) + f12;
    }

    public static void postAsyncCallback(Handler handler, Runnable runnable) {
        Message messageObtain = Message.obtain(handler, runnable);
        messageObtain.setAsynchronous(true);
        handler.sendMessage(messageObtain);
    }

    public static void println(String str, Object... objArr) {
        StringBuilder sbA = android.support.v4.media.f.a(str, ": ");
        boolean z10 = true;
        for (Object obj : objArr) {
            if (z10) {
                z10 = false;
            } else {
                sbA.append(U6.j.f68738d);
            }
            sbA.append(obj);
        }
        System.out.println(sbA.toString());
    }

    public static int pxFromDp(float f10, DisplayMetrics displayMetrics) {
        return Math.round(TypedValue.applyDimension(1, f10, displayMetrics));
    }

    public static int pxFromSp(float f10, DisplayMetrics displayMetrics) {
        return Math.round(TypedValue.applyDimension(2, f10, displayMetrics));
    }

    public static void scaleRect(Rect rect, float f10) {
        if (f10 != 1.0f) {
            rect.left = (int) ((rect.left * f10) + 0.5f);
            rect.top = (int) ((rect.top * f10) + 0.5f);
            rect.right = (int) ((rect.right * f10) + 0.5f);
            rect.bottom = (int) ((rect.bottom * f10) + 0.5f);
        }
    }

    public static void scaleRectAboutCenter(Rect rect, float f10) {
        if (f10 != 1.0f) {
            int iCenterX = rect.centerX();
            int iCenterY = rect.centerY();
            rect.offset(-iCenterX, -iCenterY);
            scaleRect(rect, f10);
            rect.offset(iCenterX, iCenterY);
        }
    }

    public static void scaleRectFAboutCenter(RectF rectF, float f10) {
        if (f10 != 1.0f) {
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            rectF.offset(-fCenterX, -fCenterY);
            rectF.left *= f10;
            rectF.top *= f10;
            rectF.right *= f10;
            rectF.bottom *= f10;
            rectF.offset(fCenterX, fCenterY);
        }
    }

    public static float shrinkRect(Rect rect, float f10, float f11) {
        float fMin = Math.min(Math.min(f10, f11), 1.0f);
        if (fMin < 1.0f) {
            int iWidth = (int) ((f10 - fMin) * rect.width() * 0.5f);
            rect.left += iWidth;
            rect.right -= iWidth;
            int iHeight = (int) ((f11 - fMin) * rect.height() * 0.5f);
            rect.top += iHeight;
            rect.bottom -= iHeight;
        }
        return fMin;
    }

    public static <T> HashSet<T> singletonHashSet(T t10) {
        HashSet<T> hashSet = new HashSet<>(1);
        hashSet.add(t10);
        return hashSet;
    }

    public static String trim(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return sTrimPattern.matcher(charSequence).replaceAll("$1");
    }

    public static CharSequence wrapForTts(CharSequence charSequence, String str) {
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TtsSpan.TextBuilder(str).build(), 0, spannableString.length(), 18);
        return spannableString;
    }

    public static float boundToRange(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }
}

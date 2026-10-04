package com.bytedance.sdk.openadsdk.utils;

import X5.h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.text.BidiFormatter;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import q8.C5443b;
import s0.x;

/* JADX INFO: loaded from: classes3.dex */
public class Cox {
    private static Boolean FA = null;
    private static WindowManager Ht = null;
    private static float Mm = -1.0f;
    private static int NOt = -1;
    private static int TFq = -1;
    private static final Object Vor = new Object();
    private static float ZRu = -1.0f;
    private static float mZ = -1.0f;
    private static int uR = -1;

    public static Pair<Integer, Integer> FA(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.WMI.ZRu();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService(C5443b.f226850e)).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static float Ht(Context context) {
        ZRu(context);
        return mZ;
    }

    public static int Mm(Context context) {
        ZRu(context);
        return NOt;
    }

    public static float TFq(Context context) {
        ZRu(context, true);
        return ZRu;
    }

    public static int Vor(Context context) {
        return ((Integer) FA(context).second).intValue();
    }

    public static boolean ZH(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    private static boolean ZRu(int i10) {
        return i10 == 0 || i10 == 8 || i10 == 4;
    }

    public static int aT(Context context) {
        return ((Integer) FA(context).first).intValue();
    }

    public static boolean edo(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", x.b.f238264e, "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            if (string != null) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean lp(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static int mZ(Context context, float f10) {
        return Float.valueOf(ZRu(context, f10, true)).intValue();
    }

    public static boolean oK(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static boolean sAl(Context context) {
        String str = Build.MODEL;
        return str.equals("IN2010") || str.equals("IN2020") || str.equals("KB2000") || str.startsWith("ONEPLUS");
    }

    public static int uR(Context context, float f10) {
        ZRu(context, true);
        float fTFq = TFq(context);
        if (fTFq <= 0.0f) {
            fTFq = 1.0f;
        }
        return (int) ((f10 / fTFq) + 0.5f);
    }

    private static boolean NOt() {
        return ZRu < 0.0f || NOt < 0 || mZ < 0.0f || uR < 0 || TFq < 0;
    }

    public static void ZRu(Context context) {
        ZRu(context, false);
    }

    public static int mZ(Context context) {
        ZRu(context);
        return uR;
    }

    public static void Ht(View view) {
        if (view == null) {
            return;
        }
        ZRu(view, 0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.Cox.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                onAnimationEnd(animator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    public static void Mm(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static int NOt(Context context, float f10) {
        ZRu(context);
        float fHt = Ht(context);
        if (fHt <= 0.0f) {
            fHt = 1.0f;
        }
        return (int) ((f10 / fHt) + 0.5f);
    }

    public static void TFq(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.Cox.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    Cox.ZRu(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.start();
    }

    public static void ZRu(Context context, boolean z10) {
        Context contextZRu = context == null ? com.bytedance.sdk.openadsdk.core.WMI.ZRu() : context;
        if (contextZRu == null) {
            return;
        }
        Ht = (WindowManager) contextZRu.getSystemService(C5443b.f226850e);
        if (NOt() || z10) {
            DisplayMetrics displayMetrics = contextZRu.getResources().getDisplayMetrics();
            ZRu = displayMetrics.density;
            NOt = displayMetrics.densityDpi;
            mZ = displayMetrics.scaledDensity;
            uR = displayMetrics.widthPixels;
            TFq = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            int i10 = uR;
            int i11 = TFq;
            if (i10 > i11) {
                uR = i11;
                TFq = i10;
                return;
            }
            return;
        }
        int i12 = uR;
        int i13 = TFq;
        if (i12 < i13) {
            uR = i13;
            TFq = i12;
        }
    }

    public static int uR(Context context) {
        ZRu(context);
        return TFq;
    }

    @Nullable
    public static int[] mZ(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static int[] NOt(Context context) {
        if (context == null) {
            return null;
        }
        if (Ht == null) {
            Ht = (WindowManager) com.bytedance.sdk.openadsdk.core.WMI.ZRu().getSystemService(C5443b.f226850e);
        }
        int[] iArr = new int[2];
        WindowManager windowManager = Ht;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                i10 = point.x;
                i11 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = i10;
            iArr[1] = i11;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    public static boolean uR(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static boolean uR(Activity activity) {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            return (rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null) != null;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("UIUtils", e10.getMessage());
            return false;
        }
    }

    public static boolean mZ(Activity activity) {
        if (FA == null) {
            synchronized (Vor) {
                try {
                    if (FA == null) {
                        boolean z10 = true;
                        if (!uR(activity) && ZRu("ro.miui.notch", activity) != 1 && !ZH(activity) && !oK(activity) && !lp(activity) && !sAl(activity) && !edo(activity)) {
                            z10 = false;
                        }
                        FA = Boolean.valueOf(z10);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return FA.booleanValue();
    }

    public static float ZRu(Context context, float f10) {
        ZRu(context);
        return Ht(context) * f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZ(final com.bytedance.sdk.openadsdk.core.model.qF qFVar, String str, String str2, final Bitmap bitmap, final String str3, final long j10) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    com.bytedance.sdk.openadsdk.uR.mZ.ZRu(System.currentTimeMillis(), qFVar, str, str2, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.utils.Cox.4
                        @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
                        public JSONObject ZRu() {
                            try {
                                int iZRu = Cox.ZRu(bitmap);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("url", str3);
                                long j11 = j10;
                                if (j11 != -1) {
                                    jSONObject.put(h.f76800b, j11);
                                }
                                jSONObject.put("render_type", "h5");
                                jSONObject.put("render_type_2", 0);
                                jSONObject.put("is_blank", iZRu == 100 ? 1 : 0);
                                jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.model.xY.NOt(qFVar) ? 1 : 0);
                                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.sAl.mZ.ZRu.ZRu().ZRu(qFVar) ? 1 : 0);
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                                    return jSONObject2;
                                } catch (JSONException unused) {
                                    return jSONObject2;
                                }
                            } catch (JSONException unused2) {
                                return null;
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lp.ZRu("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th)));
            }
        }
    }

    public static float ZRu(Context context, float f10, boolean z10) {
        ZRu(context);
        return (TFq(context) * f10) + (z10 ? 0.5f : 0.0f);
    }

    public static int[] NOt(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    @Nullable
    public static int[] ZRu(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static void NOt(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(BidiFormatter.a.f111332f);
            activity.getWindow().clearFlags(BidiFormatter.a.f111332f);
        } catch (Exception unused) {
        }
    }

    public static void ZRu(View view, int i10) {
        if (view == null || view.getVisibility() == i10 || !ZRu(i10)) {
            return;
        }
        view.setVisibility(i10);
    }

    private static Bitmap NOt(com.bytedance.sdk.component.Vor.uR uRVar) {
        if (uRVar == null) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(uRVar.getWidth(), uRVar.getHeight(), Bitmap.Config.RGB_565);
            uRVar.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void ZRu(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    public static void ZRu(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ZRu(view, (ViewGroup.MarginLayoutParams) layoutParams, i10, i11, i12, i13);
    }

    private static ArrayList<Integer> NOt(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = width * height;
            int[] iArr = new int[i10];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = iArr[i11];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i12) >> 16, (65280 & i12) >> 8, i12 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void ZRu(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i10 && marginLayoutParams.topMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.bottomMargin == i13) {
            return;
        }
        if (i10 != -3) {
            marginLayoutParams.leftMargin = i10;
        }
        if (i11 != -3) {
            marginLayoutParams.topMargin = i11;
        }
        if (i12 != -3) {
            marginLayoutParams.rightMargin = i12;
        }
        if (i13 != -3) {
            marginLayoutParams.bottomMargin = i13;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    private static Bitmap ZRu(WebView webView) {
        Bitmap bitmapCreateBitmap = null;
        try {
            Picture pictureCapturePicture = webView.capturePicture();
            bitmapCreateBitmap = Bitmap.createBitmap(pictureCapturePicture.getWidth(), pictureCapturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            pictureCapturePicture.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("UIUtils", th.getMessage());
            return bitmapCreateBitmap;
        }
    }

    public static void NOt(View view, final float f10) {
        if (view != null && f10 > 0.0f) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.Cox.5
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f10);
                }
            });
            view.setClipToOutline(true);
        }
    }

    public static float ZRu() {
        float f10 = Mm;
        if (f10 > 0.0f) {
            return f10;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.WMI.ZRu().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0.0f;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        Mm = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static void ZRu(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(BidiFormatter.a.f111332f);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("UIUtils", e10.getMessage());
        }
    }

    public static int ZRu(String str, Activity activity) {
        if (ru.TFq()) {
            try {
                Class<?> clsLoadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
                return ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String(str), 0)).intValue();
            } catch (ClassNotFoundException e10) {
                com.bytedance.sdk.component.utils.lp.ZRu("UIUtils", e10.getMessage());
            } catch (IllegalAccessException e11) {
                com.bytedance.sdk.component.utils.lp.ZRu("UIUtils", e11.getMessage());
            } catch (IllegalArgumentException e12) {
                com.bytedance.sdk.component.utils.lp.ZRu("UIUtils", e12.getMessage());
            } catch (NoSuchMethodException e13) {
                com.bytedance.sdk.component.utils.lp.ZRu("UIUtils", e13.getMessage());
            } catch (InvocationTargetException e14) {
                com.bytedance.sdk.component.utils.lp.ZRu("UIUtils", e14.getMessage());
            }
        }
        return 0;
    }

    public static void ZRu(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.lp.ZRu("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public static void ZRu(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.lp.ZRu("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public static void ZRu(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
    }

    public static void ZRu(TextView textView, com.bytedance.sdk.openadsdk.core.widget.yBV ybv, com.bytedance.sdk.openadsdk.core.model.qF qFVar) {
        ZRu(textView, ybv, qFVar, 14);
    }

    public static void ZRu(TextView textView, com.bytedance.sdk.openadsdk.core.widget.yBV ybv, com.bytedance.sdk.openadsdk.core.model.qF qFVar, int i10) {
        ZRu(textView, ybv, (qFVar == null || qFVar.gaw() == null) ? -1.0d : qFVar.gaw().uR(), i10);
    }

    public static void ZRu(TextView textView, com.bytedance.sdk.openadsdk.core.widget.yBV ybv, double d10, int i10) {
        if (d10 == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            ybv.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d10)));
            }
            ZRu(ybv, d10, i10);
        }
    }

    public static void ZRu(com.bytedance.sdk.openadsdk.core.widget.yBV ybv, double d10, int i10) {
        if (d10 < 0.0d) {
            ybv.setVisibility(8);
        } else {
            ybv.setVisibility(0);
            ybv.ZRu(d10, i10);
        }
    }

    public static Bitmap ZRu(com.bytedance.sdk.component.Vor.uR uRVar) {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        WebView webView = uRVar.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap bitmapNOt = NOt(uRVar);
        if (bitmapNOt == null) {
            bitmapNOt = ZRu(webView);
        }
        webView.setLayerType(layerType, null);
        if (bitmapNOt == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.uR.ZRu(bitmapNOt, bitmapNOt.getWidth() / 6, bitmapNOt.getHeight() / 6);
    }

    public static void ZRu(final com.bytedance.sdk.openadsdk.core.model.qF qFVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j10) {
        WD.NOt(new com.bytedance.sdk.component.FA.FA("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.Cox.3
            @Override // java.lang.Runnable
            public void run() {
                Cox.mZ(qFVar, str, str2, bitmap, str3, j10);
            }
        }, 10);
    }

    public static int ZRu(Bitmap bitmap) {
        try {
            ArrayList<Integer> arrayListNOt = NOt(bitmap);
            if (arrayListNOt == null) {
                return -1;
            }
            HashMap map = new HashMap();
            int size = arrayListNOt.size();
            int iIntValue = 0;
            int i10 = 0;
            while (i10 < size) {
                Integer num = arrayListNOt.get(i10);
                i10++;
                Integer num2 = num;
                if (map.containsKey(num2)) {
                    Integer numValueOf = Integer.valueOf(((Integer) map.get(num2)).intValue() + 1);
                    map.remove(num2);
                    map.put(num2, numValueOf);
                } else {
                    map.put(num2, 1);
                }
            }
            int i11 = 0;
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (i11 < iIntValue2) {
                    iIntValue = ((Integer) entry.getKey()).intValue();
                    i11 = iIntValue2;
                }
            }
            if (iIntValue == 0) {
                return -1;
            }
            return (int) ((i11 / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }
}

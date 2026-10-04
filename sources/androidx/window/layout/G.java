package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import e.T;
import e.f0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class G implements WindowMetricsCalculator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final G f120088b = new G();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f120089c = "G";

    @Override // androidx.window.layout.WindowMetricsCalculator
    @NotNull
    public C a(@NotNull Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        int i10 = Build.VERSION.SDK_INT;
        return new C(i10 >= 30 ? C2719f.f120140a.a(activity) : i10 >= 29 ? f(activity) : i10 >= 28 ? e(activity) : i10 >= 24 ? d(activity) : c(activity));
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    @NotNull
    public C b(@NotNull Activity activity) {
        Rect rect;
        kotlin.jvm.internal.G.p(activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = C2719f.f120140a.b(activity);
        } else {
            Display display = activity.getWindowManager().getDefaultDisplay();
            kotlin.jvm.internal.G.o(display, "display");
            Point pointI = i(display);
            rect = new Rect(0, 0, pointI.x, pointI.y);
        }
        return new C(rect);
    }

    @T(14)
    @NotNull
    public final Rect c(@NotNull Activity activity) {
        int i10;
        kotlin.jvm.internal.G.p(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        kotlin.jvm.internal.G.o(defaultDisplay, "defaultDisplay");
        Point pointI = i(defaultDisplay);
        Rect rect = new Rect();
        int i11 = pointI.x;
        if (i11 == 0 || (i10 = pointI.y) == 0) {
            defaultDisplay.getRectSize(rect);
            return rect;
        }
        rect.right = i11;
        rect.bottom = i10;
        return rect;
    }

    @T(24)
    @NotNull
    public final Rect d(@NotNull Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        C2715b.f120139a.getClass();
        if (!activity.isInMultiWindowMode()) {
            Point pointI = i(defaultDisplay);
            int iH = h(activity);
            int i10 = rect.bottom;
            if (i10 + iH == pointI.y) {
                rect.bottom = i10 + iH;
                return rect;
            }
            int i11 = rect.right;
            if (i11 + iH == pointI.x) {
                rect.right = i11 + iH;
            }
        }
        return rect;
    }

    @T(28)
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @NotNull
    public final Rect e(@NotNull Activity activity) {
        DisplayCutout displayCutoutG;
        kotlin.jvm.internal.G.p(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (C2715b.f120139a.a(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e10) {
            Log.w(f120089c, e10);
            j(activity, rect);
        } catch (NoSuchFieldException e11) {
            Log.w(f120089c, e11);
            j(activity, rect);
        } catch (NoSuchMethodException e12) {
            Log.w(f120089c, e12);
            j(activity, rect);
        } catch (InvocationTargetException e13) {
            Log.w(f120089c, e13);
            j(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        C2720g c2720g = C2720g.f120141a;
        kotlin.jvm.internal.G.o(currentDisplay, "currentDisplay");
        c2720g.a(currentDisplay, point);
        C2715b c2715b = C2715b.f120139a;
        c2715b.getClass();
        if (!activity.isInMultiWindowMode()) {
            int iH = h(activity);
            int i10 = rect.bottom;
            if (i10 + iH == point.y) {
                rect.bottom = i10 + iH;
            } else {
                int i11 = rect.right;
                if (i11 + iH == point.x) {
                    rect.right = i11 + iH;
                } else if (rect.left == iH) {
                    rect.left = 0;
                }
            }
        }
        if (rect.width() < point.x || rect.height() < point.y) {
            c2715b.getClass();
            if (!activity.isInMultiWindowMode() && (displayCutoutG = g(currentDisplay)) != null) {
                int i12 = rect.left;
                l lVar = l.f120142a;
                lVar.getClass();
                if (i12 == displayCutoutG.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                int i13 = point.x - rect.right;
                lVar.getClass();
                if (i13 == displayCutoutG.getSafeInsetRight()) {
                    int i14 = rect.right;
                    lVar.getClass();
                    rect.right = displayCutoutG.getSafeInsetRight() + i14;
                }
                int i15 = rect.top;
                lVar.getClass();
                if (i15 == displayCutoutG.getSafeInsetTop()) {
                    rect.top = 0;
                }
                int i16 = point.y - rect.bottom;
                lVar.getClass();
                if (i16 == displayCutoutG.getSafeInsetBottom()) {
                    int i17 = rect.bottom;
                    lVar.getClass();
                    rect.bottom = displayCutoutG.getSafeInsetBottom() + i17;
                }
            }
        }
        return rect;
    }

    @T(29)
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @NotNull
    public final Rect f(@NotNull Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            if (objInvoke != null) {
                return new Rect((Rect) objInvoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException e10) {
            Log.w(f120089c, e10);
            return e(activity);
        } catch (NoSuchFieldException e11) {
            Log.w(f120089c, e11);
            return e(activity);
        } catch (NoSuchMethodException e12) {
            Log.w(f120089c, e12);
            return e(activity);
        } catch (InvocationTargetException e13) {
            Log.w(f120089c, e13);
            return e(activity);
        }
    }

    @T(28)
    @SuppressLint({"BanUncheckedReflection"})
    public final DisplayCutout g(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (E.a(obj)) {
                return F.a(obj);
            }
        } catch (ClassNotFoundException e10) {
            Log.w(f120089c, e10);
        } catch (IllegalAccessException e11) {
            Log.w(f120089c, e11);
        } catch (InstantiationException e12) {
            Log.w(f120089c, e12);
        } catch (NoSuchFieldException e13) {
            Log.w(f120089c, e13);
        } catch (NoSuchMethodException e14) {
            Log.w(f120089c, e14);
        } catch (InvocationTargetException e15) {
            Log.w(f120089c, e15);
        }
        return null;
    }

    public final int h(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @T(14)
    @f0
    @NotNull
    public final Point i(@NotNull Display display) {
        kotlin.jvm.internal.G.p(display, "display");
        Point point = new Point();
        C2720g.f120141a.a(display, point);
        return point;
    }

    public final void j(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}

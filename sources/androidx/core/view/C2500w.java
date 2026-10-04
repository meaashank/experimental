package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: androidx.core.view.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2500w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f111959a = 3840;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f111960b = 2160;

    /* JADX INFO: renamed from: androidx.core.view.w$a */
    @e.T(23)
    public static class a {
        @NonNull
        public static b a(@NonNull Context context, @NonNull Display display) {
            Display.Mode mode = display.getMode();
            Point pointA = C2500w.a(context, display);
            return (pointA == null || d(mode, pointA)) ? new b(mode, true) : new b(mode, pointA);
        }

        @NonNull
        @SuppressLint({"ArrayReturn"})
        public static b[] b(@NonNull Context context, @NonNull Display display) {
            Display.Mode[] supportedModes = display.getSupportedModes();
            b[] bVarArr = new b[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point pointA = C2500w.a(context, display);
            if (pointA == null || d(mode, pointA)) {
                for (int i10 = 0; i10 < supportedModes.length; i10++) {
                    bVarArr[i10] = new b(supportedModes[i10], e(supportedModes[i10], mode));
                }
            } else {
                for (int i11 = 0; i11 < supportedModes.length; i11++) {
                    bVarArr[i11] = e(supportedModes[i11], mode) ? new b(supportedModes[i11], pointA) : new b(supportedModes[i11], false);
                }
            }
            return bVarArr;
        }

        public static boolean c(@NonNull Display display) {
            Display.Mode mode = display.getMode();
            for (Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        public static boolean d(Display.Mode mode, Point point) {
            if (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) {
                return true;
            }
            return mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x;
        }

        public static boolean e(Display.Mode mode, Display.Mode mode2) {
            return mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight();
        }
    }

    public static Point a(@NonNull Context context, @NonNull Display display) {
        Point pointJ = Build.VERSION.SDK_INT < 28 ? j("sys.display-size", display) : j("vendor.display-size", display);
        if (pointJ != null) {
            return pointJ;
        }
        if (g(context) && a.c(display)) {
            return new Point(f111959a, f111960b);
        }
        return null;
    }

    @NonNull
    public static Point b(@NonNull Context context, @NonNull Display display) {
        Point pointA = a(context, display);
        if (pointA != null) {
            return pointA;
        }
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    @NonNull
    public static b c(@NonNull Context context, @NonNull Display display) {
        return a.a(context, display);
    }

    @NonNull
    @SuppressLint({"ArrayReturn"})
    public static b[] d(@NonNull Context context, @NonNull Display display) {
        return a.b(context, display);
    }

    @Nullable
    public static String e(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod(w7.i.f240158w, String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean f(@NonNull Display display) {
        return a.c(display);
    }

    public static boolean g(@NonNull Context context) {
        return h(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    public static boolean h(@NonNull Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static Point i(@NonNull String str) throws NumberFormatException {
        String[] strArrSplit = str.trim().split("x", -1);
        if (strArrSplit.length == 2) {
            int i10 = Integer.parseInt(strArrSplit[0]);
            int i11 = Integer.parseInt(strArrSplit[1]);
            if (i10 > 0 && i11 > 0) {
                return new Point(i10, i11);
            }
        }
        throw new NumberFormatException();
    }

    @Nullable
    public static Point j(@NonNull String str, @NonNull Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String strE = e(str);
        if (!TextUtils.isEmpty(strE) && strE != null) {
            try {
                return i(strE);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: androidx.core.view.w$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Display.Mode f111961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Point f111962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f111963c;

        /* JADX INFO: renamed from: androidx.core.view.w$b$a */
        @e.T(23)
        public static class a {
            public static int a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            public static int b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        public b(@NonNull Point point) {
            androidx.core.util.t.m(point, "physicalSize == null");
            this.f111962b = point;
            this.f111961a = null;
            this.f111963c = true;
        }

        public int a() {
            return this.f111962b.y;
        }

        public int b() {
            return this.f111962b.x;
        }

        @Deprecated
        public boolean c() {
            return this.f111963c;
        }

        @Nullable
        @e.T(23)
        public Display.Mode d() {
            return this.f111961a;
        }

        @e.T(23)
        public b(@NonNull Display.Mode mode, boolean z10) {
            androidx.core.util.t.m(mode, "mode == null, can't wrap a null reference");
            this.f111962b = new Point(mode.getPhysicalWidth(), mode.getPhysicalHeight());
            this.f111961a = mode;
            this.f111963c = z10;
        }

        @e.T(23)
        public b(@NonNull Display.Mode mode, @NonNull Point point) {
            androidx.core.util.t.m(mode, "mode == null, can't wrap a null reference");
            androidx.core.util.t.m(point, "physicalSize == null");
            this.f111962b = point;
            this.f111961a = mode;
            this.f111963c = true;
        }
    }
}

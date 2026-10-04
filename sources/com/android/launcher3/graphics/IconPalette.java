package com.android.launcher3.graphics;

import G0.C1162y;
import android.R;
import android.content.Context;
import android.graphics.Color;
import com.android.launcher3.util.Themes;

/* JADX INFO: loaded from: classes2.dex */
public class IconPalette {
    private static final boolean DEBUG = false;
    private static final float MIN_PRELOAD_COLOR_LIGHTNESS = 0.6f;
    private static final float MIN_PRELOAD_COLOR_SATURATION = 0.2f;
    private static final String TAG = "IconPalette";

    private static String contrastChange(int i10, int i11, int i12) {
        return String.format("from %.2f:1 to %.2f:1", Double.valueOf(C1162y.m(i10, i12)), Double.valueOf(C1162y.m(i11, i12)));
    }

    private static int ensureTextContrast(int i10, int i11) {
        return findContrastColor(i10, i11, 4.5d);
    }

    private static int findContrastColor(int i10, int i11, double d10) {
        if (C1162y.m(i10, i11) >= d10) {
            return i10;
        }
        double[] dArr = new double[3];
        C1162y.r(i11, dArr);
        double d11 = dArr[0];
        C1162y.r(i10, dArr);
        double d12 = dArr[0];
        boolean z10 = d11 < 50.0d;
        double d13 = z10 ? d12 : 0.0d;
        if (z10) {
            d12 = 100.0d;
        }
        double d14 = dArr[1];
        double d15 = dArr[2];
        for (int i12 = 0; i12 < 15 && d12 - d13 > 1.0E-5d; i12++) {
            double d16 = (d13 + d12) / 2.0d;
            if (C1162y.m(C1162y.b(d16, d14, d15), i11) <= d10 ? !z10 : z10) {
                d12 = d16;
            } else {
                d13 = d16;
            }
        }
        return C1162y.b(d13, d14, d15);
    }

    public static int getMutedColor(int i10, float f10) {
        return C1162y.v(C1162y.D(-1, (int) (f10 * 255.0f)), i10);
    }

    public static int getPreloadProgressColor(Context context, int i10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        if (fArr[1] < 0.2f) {
            return Themes.getAttrColor(context, R.attr.colorAccent);
        }
        fArr[2] = Math.max(0.6f, fArr[2]);
        return Color.HSVToColor(fArr);
    }

    private static int resolveColor(Context context, int i10) {
        return i10 == 0 ? context.getColor(com.app.hider.master.promax.R.color.notification_icon_default_color) : i10;
    }

    public static int resolveContrastColor(Context context, int i10, int i11) {
        return findContrastColor(resolveColor(context, i10), i11, 4.5d);
    }
}

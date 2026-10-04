package J4;

import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
public class f {
    public static int a(float f10, int i10) {
        return (b(f10) << 24) | (i10 & 16777215);
    }

    public static int b(float f10) {
        return Math.round(f10 * 255.0f);
    }

    public static int c(int i10, float f10) {
        float[] fArr = {0.0f, 0.0f, f10};
        Color.colorToHSV(i10, fArr);
        return Color.HSVToColor(fArr);
    }

    public static float d(int i10) {
        return Color.alpha(i10) / 255.0f;
    }

    public static String e(int i10, boolean z10) {
        return String.format(z10 ? "#%08X" : "#%06X", Integer.valueOf(i10 & (z10 ? -1 : 16777215))).toUpperCase();
    }

    public static float f(int i10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        return fArr[2];
    }
}

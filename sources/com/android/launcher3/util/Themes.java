package com.android.launcher3.util;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public class Themes {
    public static int getAlpha(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        float f10 = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        return (int) ((f10 * 255.0f) + 0.5f);
    }

    public static boolean getAttrBoolean(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    public static int getAttrColor(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public static Drawable getAttrDrawable(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    public static int getAttrInteger(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        int integer = typedArrayObtainStyledAttributes.getInteger(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return integer;
    }

    public static int getColorAccent(Context context) {
        return getAttrColor(context, R.attr.colorAccent);
    }

    public static void setColorChangeOnMatrix(int i10, int i11, ColorMatrix colorMatrix) {
        colorMatrix.reset();
        colorMatrix.getArray()[4] = Color.red(i11) - Color.red(i10);
        colorMatrix.getArray()[9] = Color.green(i11) - Color.green(i10);
        colorMatrix.getArray()[14] = Color.blue(i11) - Color.blue(i10);
        colorMatrix.getArray()[19] = Color.alpha(i11) - Color.alpha(i10);
    }

    public static void setColorScaleOnMatrix(int i10, ColorMatrix colorMatrix) {
        colorMatrix.setScale(Color.red(i10) / 255.0f, Color.green(i10) / 255.0f, Color.blue(i10) / 255.0f, Color.alpha(i10) / 255.0f);
    }
}

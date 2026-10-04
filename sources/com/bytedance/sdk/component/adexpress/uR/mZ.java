package com.bytedance.sdk.component.adexpress.uR;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes2.dex */
public class mZ {
    public static Drawable ZRu(Context context, com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm) {
        if (context == null || mm == null) {
            return null;
        }
        return ZRu(context, (int) FA.ZRu(context, mm.WMI()), mm.yBV(), mm.Nb());
    }

    public static Drawable ZRu(Context context, int i10, int i11, int i12) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i10, i11);
        }
        gradientDrawable.setColor(i12);
        return gradientDrawable;
    }
}

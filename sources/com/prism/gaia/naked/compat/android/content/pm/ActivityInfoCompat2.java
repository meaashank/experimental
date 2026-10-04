package com.prism.gaia.naked.compat.android.content.pm;

import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.prism.gaia.naked.metadata.com.android.internal.ResCAG;
import v8.C5714x;

/* JADX INFO: loaded from: classes6.dex */
public class ActivityInfoCompat2 {
    private static final String TAG = "asdf-".concat("ActivityInfoCompat2");

    public static boolean isDialogStyle(ActivityInfo activityInfo) {
        boolean z10;
        boolean z11;
        boolean z12;
        TypedArray typedArrayObtainStyledAttributes;
        if (activityInfo == null) {
            return false;
        }
        try {
            int[] iArr = ResCAG.f165977G.styleable.Window().get();
            int i10 = ResCAG.f165977G.styleable.Window_windowIsFloating().get();
            int i11 = ResCAG.f165977G.styleable.Window_windowIsTranslucent().get();
            int i12 = ResCAG.f165977G.styleable.Window_windowShowWallpaper().get();
            Resources resourcesN = C5714x.j().N(activityInfo.packageName);
            if (resourcesN == null || (typedArrayObtainStyledAttributes = resourcesN.newTheme().obtainStyledAttributes(activityInfo.theme, iArr)) == null) {
                z10 = false;
                z11 = false;
                z12 = false;
            } else {
                z11 = typedArrayObtainStyledAttributes.getBoolean(i10, false);
                z12 = typedArrayObtainStyledAttributes.getBoolean(i11, false);
                z10 = typedArrayObtainStyledAttributes.getBoolean(i12, false);
            }
            return z11 || z12 || z10;
        } catch (Throwable unused) {
            return false;
        }
    }
}

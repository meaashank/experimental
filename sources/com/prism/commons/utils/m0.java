package com.prism.commons.utils;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import e.InterfaceC4332f;
import e.InterfaceC4337k;

/* JADX INFO: loaded from: classes5.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TypedValue f162115a = new TypedValue();

    @InterfaceC4337k
    public static int a(@NonNull Context context, @InterfaceC4332f int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f162115a.data, new int[]{i10});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @e.a0
    public static int b(@NonNull Context context, @InterfaceC4332f int i10) {
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i10, typedValue, true)) {
            return typedValue.data;
        }
        throw new IllegalStateException(android.support.v4.media.c.a("style not found ", i10));
    }

    @TargetApi(21)
    @InterfaceC4337k
    public static int c(@NonNull Context context) {
        return a(context, R.attr.statusBarColor);
    }
}

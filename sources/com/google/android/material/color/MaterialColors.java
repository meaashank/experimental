package com.google.android.material.color;

import B0.C0920d;
import G0.C1162y;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.S0;
import com.google.android.material.R;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;
import e.D;
import e.InterfaceC4332f;
import e.InterfaceC4337k;
import e.InterfaceC4348w;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    private static final int CHROMA_NEUTRAL = 6;
    private static final int TONE_ACCENT_CONTAINER_DARK = 30;
    private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    private static final int TONE_ACCENT_DARK = 80;
    private static final int TONE_ACCENT_LIGHT = 40;
    private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    private static final int TONE_ON_ACCENT_DARK = 20;
    private static final int TONE_ON_ACCENT_LIGHT = 100;
    private static final int TONE_SURFACE_CONTAINER_DARK = 12;
    private static final int TONE_SURFACE_CONTAINER_HIGH_DARK = 17;
    private static final int TONE_SURFACE_CONTAINER_HIGH_LIGHT = 92;
    private static final int TONE_SURFACE_CONTAINER_LIGHT = 94;

    private MaterialColors() {
    }

    @InterfaceC4337k
    public static int compositeARGBWithAlpha(@InterfaceC4337k int i10, @D(from = 0, to = S0.f86828d) int i11) {
        return C1162y.D(i10, (Color.alpha(i10) * i11) / 255);
    }

    @InterfaceC4337k
    public static int getColor(@NonNull View view, @InterfaceC4332f int i10) {
        return resolveColor(view.getContext(), MaterialAttributes.resolveTypedValueOrThrow(view, i10));
    }

    @Nullable
    @InterfaceC4337k
    public static Integer getColorOrNull(@NonNull Context context, @InterfaceC4332f int i10) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i10);
        if (typedValueResolve != null) {
            return Integer.valueOf(resolveColor(context, typedValueResolve));
        }
        return null;
    }

    @InterfaceC4337k
    private static int getColorRole(@InterfaceC4337k int i10, @D(from = 0, to = 100) int i11) {
        Hct hctFromInt = Hct.fromInt(i10);
        hctFromInt.setTone(i11);
        return hctFromInt.toInt();
    }

    @NonNull
    public static ColorRoles getColorRoles(@NonNull Context context, @InterfaceC4337k int i10) {
        return getColorRoles(i10, isLightTheme(context));
    }

    @NonNull
    public static ColorStateList getColorStateList(@NonNull Context context, @InterfaceC4332f int i10, @NonNull ColorStateList colorStateList) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i10);
        ColorStateList colorStateListResolveColorStateList = typedValueResolve != null ? resolveColorStateList(context, typedValueResolve) : null;
        return colorStateListResolveColorStateList == null ? colorStateList : colorStateListResolveColorStateList;
    }

    @Nullable
    public static ColorStateList getColorStateListOrNull(@NonNull Context context, @InterfaceC4332f int i10) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i10);
        if (typedValueResolve == null) {
            return null;
        }
        int i11 = typedValueResolve.resourceId;
        if (i11 != 0) {
            return C0920d.getColorStateList(context, i11);
        }
        int i12 = typedValueResolve.data;
        if (i12 != 0) {
            return ColorStateList.valueOf(i12);
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InterfaceC4337k
    public static int getSurfaceContainerFromSeed(@NonNull Context context, @InterfaceC4337k int i10) {
        return getColorRole(i10, isLightTheme(context) ? 94 : 12, 6);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InterfaceC4337k
    public static int getSurfaceContainerHighFromSeed(@NonNull Context context, @InterfaceC4337k int i10) {
        return getColorRole(i10, isLightTheme(context) ? 92 : 17, 6);
    }

    @InterfaceC4337k
    public static int harmonize(@InterfaceC4337k int i10, @InterfaceC4337k int i11) {
        return Blend.harmonize(i10, i11);
    }

    @InterfaceC4337k
    public static int harmonizeWithPrimary(@NonNull Context context, @InterfaceC4337k int i10) {
        return harmonize(i10, getColor(context, R.attr.colorPrimary, MaterialColors.class.getCanonicalName()));
    }

    public static boolean isColorLight(@InterfaceC4337k int i10) {
        return i10 != 0 && C1162y.n(i10) > 0.5d;
    }

    public static boolean isLightTheme(@NonNull Context context) {
        return MaterialAttributes.resolveBoolean(context, R.attr.isLightTheme, true);
    }

    @InterfaceC4337k
    public static int layer(@NonNull View view, @InterfaceC4332f int i10, @InterfaceC4332f int i11) {
        return layer(view, i10, i11, 1.0f);
    }

    private static int resolveColor(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i10 = typedValue.resourceId;
        return i10 != 0 ? C0920d.getColor(context, i10) : typedValue.data;
    }

    private static ColorStateList resolveColorStateList(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i10 = typedValue.resourceId;
        return i10 != 0 ? C0920d.getColorStateList(context, i10) : ColorStateList.valueOf(typedValue.data);
    }

    @NonNull
    public static ColorRoles getColorRoles(@InterfaceC4337k int i10, boolean z10) {
        return z10 ? new ColorRoles(getColorRole(i10, 40), getColorRole(i10, 100), getColorRole(i10, 90), getColorRole(i10, 10)) : new ColorRoles(getColorRole(i10, 80), getColorRole(i10, 20), getColorRole(i10, 30), getColorRole(i10, 90));
    }

    @InterfaceC4337k
    public static int layer(@NonNull View view, @InterfaceC4332f int i10, @InterfaceC4332f int i11, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10) {
        return layer(getColor(view, i10), getColor(view, i11), f10);
    }

    @InterfaceC4337k
    public static int getColor(Context context, @InterfaceC4332f int i10, String str) {
        return resolveColor(context, MaterialAttributes.resolveTypedValueOrThrow(context, i10, str));
    }

    @InterfaceC4337k
    private static int getColorRole(@InterfaceC4337k int i10, @D(from = 0, to = 100) int i11, int i12) {
        Hct hctFromInt = Hct.fromInt(getColorRole(i10, i11));
        hctFromInt.setChroma(i12);
        return hctFromInt.toInt();
    }

    @InterfaceC4337k
    public static int layer(@InterfaceC4337k int i10, @InterfaceC4337k int i11, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10) {
        return layer(i10, C1162y.D(i11, Math.round(Color.alpha(i11) * f10)));
    }

    @InterfaceC4337k
    public static int getColor(@NonNull View view, @InterfaceC4332f int i10, @InterfaceC4337k int i11) {
        return getColor(view.getContext(), i10, i11);
    }

    @InterfaceC4337k
    public static int getColor(@NonNull Context context, @InterfaceC4332f int i10, @InterfaceC4337k int i11) {
        Integer colorOrNull = getColorOrNull(context, i10);
        return colorOrNull != null ? colorOrNull.intValue() : i11;
    }

    @InterfaceC4337k
    public static int layer(@InterfaceC4337k int i10, @InterfaceC4337k int i11) {
        return C1162y.v(i11, i10);
    }
}

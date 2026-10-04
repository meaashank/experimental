package androidx.core.view;

import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class K {
    @Deprecated
    public static int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        int layoutDirection = marginLayoutParams.getLayoutDirection();
        if (layoutDirection == 0 || layoutDirection == 1) {
            return layoutDirection;
        }
        return 0;
    }

    @e.S(expression = "lp.getMarginEnd()")
    @Deprecated
    public static int b(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    @e.S(expression = "lp.getMarginStart()")
    @Deprecated
    public static int c(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    @e.S(expression = "lp.isMarginRelative()")
    @Deprecated
    public static boolean d(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    @e.S(expression = "lp.resolveLayoutDirection(layoutDirection)")
    @Deprecated
    public static void e(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.resolveLayoutDirection(i10);
    }

    @e.S(expression = "lp.setLayoutDirection(layoutDirection)")
    @Deprecated
    public static void f(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.setLayoutDirection(i10);
    }

    @e.S(expression = "lp.setMarginEnd(marginEnd)")
    @Deprecated
    public static void g(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.setMarginEnd(i10);
    }

    @e.S(expression = "lp.setMarginStart(marginStart)")
    @Deprecated
    public static void h(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.setMarginStart(i10);
    }
}

package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.T;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f112142a = "CompoundButtonCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f112143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f112144c;

    @T(21)
    public static class a {
        public static ColorStateList a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        public static PorterDuff.Mode b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        public static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        public static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    @T(23)
    public static class b {
        public static Drawable a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    @Nullable
    public static Drawable a(@NonNull CompoundButton compoundButton) {
        return compoundButton.getButtonDrawable();
    }

    @Nullable
    public static ColorStateList b(@NonNull CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    @Nullable
    public static PorterDuff.Mode c(@NonNull CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    public static void d(@NonNull CompoundButton compoundButton, @Nullable ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    public static void e(@NonNull CompoundButton compoundButton, @Nullable PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}

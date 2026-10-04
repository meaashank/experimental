package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.S;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    @T(21)
    public static class a {
        @Nullable
        public static ColorStateList a(@NonNull CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        @Nullable
        public static PorterDuff.Mode b(@NonNull CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        public static void c(@NonNull CheckedTextView checkedTextView, @Nullable ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        public static void d(@NonNull CheckedTextView checkedTextView, @Nullable PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    @Nullable
    @S(expression = "textView.getCheckMarkDrawable()")
    @Deprecated
    public static Drawable a(@NonNull CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    @Nullable
    public static ColorStateList b(@NonNull CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkTintList();
    }

    @Nullable
    public static PorterDuff.Mode c(@NonNull CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkTintMode();
    }

    public static void d(@NonNull CheckedTextView checkedTextView, @Nullable ColorStateList colorStateList) {
        checkedTextView.setCheckMarkTintList(colorStateList);
    }

    public static void e(@NonNull CheckedTextView checkedTextView, @Nullable PorterDuff.Mode mode) {
        checkedTextView.setCheckMarkTintMode(mode);
    }
}

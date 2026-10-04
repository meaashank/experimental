package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    @T(21)
    public static class a {
        public static ColorStateList a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        public static PorterDuff.Mode b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        public static void c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        public static void d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    @Nullable
    public static ColorStateList a(@NonNull ImageView imageView) {
        return imageView.getImageTintList();
    }

    @Nullable
    public static PorterDuff.Mode b(@NonNull ImageView imageView) {
        return imageView.getImageTintMode();
    }

    public static void c(@NonNull ImageView imageView, @Nullable ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    public static void d(@NonNull ImageView imageView, @Nullable PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}

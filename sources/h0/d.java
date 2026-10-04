package H0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.InterfaceC4337k;
import e.S;
import e.T;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f45418a = "DrawableCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f45419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f45420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f45421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f45422e;

    @T(21)
    public static class a {
        public static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        public static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        public static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        public static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        public static void e(Drawable drawable, float f10, float f11) {
            drawable.setHotspot(f10, f11);
        }

        public static void f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        public static void g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        public static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        public static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    @T(23)
    public static class b {
        public static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        public static boolean b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    public static void a(@NonNull Drawable drawable, @NonNull Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static boolean b(@NonNull Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static void c(@NonNull Drawable drawable) {
        drawable.clearColorFilter();
    }

    @S(expression = "drawable.getAlpha()")
    @Deprecated
    public static int d(@NonNull Drawable drawable) {
        return drawable.getAlpha();
    }

    @Nullable
    public static ColorFilter e(@NonNull Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static int f(@NonNull Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static void g(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    @S(expression = "drawable.isAutoMirrored()")
    @Deprecated
    public static boolean h(@NonNull Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @S(expression = "drawable.jumpToCurrentState()")
    @Deprecated
    public static void i(@NonNull Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    @S(expression = "drawable.setAutoMirrored(mirrored)")
    @Deprecated
    public static void j(@NonNull Drawable drawable, boolean z10) {
        drawable.setAutoMirrored(z10);
    }

    public static void k(@NonNull Drawable drawable, float f10, float f11) {
        drawable.setHotspot(f10, f11);
    }

    public static void l(@NonNull Drawable drawable, int i10, int i11, int i12, int i13) {
        drawable.setHotspotBounds(i10, i11, i12, i13);
    }

    public static boolean m(@NonNull Drawable drawable, int i10) {
        return drawable.setLayoutDirection(i10);
    }

    public static void n(@NonNull Drawable drawable, @InterfaceC4337k int i10) {
        drawable.setTint(i10);
    }

    public static void o(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void p(@NonNull Drawable drawable, @Nullable PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T q(@NonNull Drawable drawable) {
        return drawable instanceof l ? (T) ((l) drawable).b() : drawable;
    }

    @NonNull
    public static Drawable r(@NonNull Drawable drawable) {
        return drawable;
    }
}

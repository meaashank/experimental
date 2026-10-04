package U0;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.T;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: renamed from: U0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1281d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f68400a = "ICUCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f68401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f68402c;

    /* JADX INFO: renamed from: U0.d$a */
    @T(21)
    public static class a {
        public static String a(Locale locale) {
            return locale.getScript();
        }
    }

    /* JADX INFO: renamed from: U0.d$b */
    @T(24)
    public static class b {
        public static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        public static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        public static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f68402c = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static String a(Locale locale) {
        String string = locale.toString();
        try {
            Method method = f68402c;
            if (method != null) {
                return (String) method.invoke(null, string);
            }
        } catch (IllegalAccessException e10) {
            Log.w(f68400a, e10);
        } catch (InvocationTargetException e11) {
            Log.w(f68400a, e11);
        }
        return string;
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static String b(String str) {
        try {
            Method method = f68401b;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e10) {
            Log.w(f68400a, e10);
        } catch (InvocationTargetException e11) {
            Log.w(f68400a, e11);
        }
        return null;
    }

    @Nullable
    public static String c(@NonNull Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return b.c(b.a(b.b(locale)));
        }
        try {
            return ((Locale) f68402c.invoke(null, locale)).getScript();
        } catch (IllegalAccessException e10) {
            Log.w(f68400a, e10);
            return locale.getScript();
        } catch (InvocationTargetException e11) {
            Log.w(f68400a, e11);
            return locale.getScript();
        }
    }
}

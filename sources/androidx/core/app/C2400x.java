package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.core.os.C2417p;
import e.InterfaceC4330d;
import e.f0;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.core.app.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2400x {

    /* JADX INFO: renamed from: androidx.core.app.x$a */
    @e.T(21)
    public static class a {
        public static String a(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.x$b */
    @e.T(24)
    public static class b {
        public static C2417p a(Configuration configuration) {
            return C2417p.c(configuration.getLocales().toLanguageTags());
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.x$c */
    @e.T(33)
    public static class c {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static LocaleList b(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    @NonNull
    @InterfaceC4330d
    public static C2417p a(@NonNull Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return C2417p.c(C2387j.b(context));
        }
        Object systemService = context.getSystemService(N7.a.f64751e);
        return systemService != null ? C2417p.o(c.a(systemService)) : C2417p.g();
    }

    @f0
    public static C2417p b(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? b.a(configuration) : C2417p.c(configuration.locale.toLanguageTag());
    }

    @e.T(33)
    public static Object c(Context context) {
        return context.getSystemService(N7.a.f64751e);
    }

    @NonNull
    @InterfaceC4330d
    public static C2417p d(@NonNull Context context) {
        C2417p c2417pG = C2417p.g();
        if (Build.VERSION.SDK_INT < 33) {
            return b(Resources.getSystem().getConfiguration());
        }
        Object systemService = context.getSystemService(N7.a.f64751e);
        return systemService != null ? C2417p.o(c.b(systemService)) : c2417pG;
    }
}

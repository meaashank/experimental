package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.core.os.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2408g {

    /* JADX INFO: renamed from: androidx.core.os.g$a */
    @e.T(24)
    public static class a {
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        public static void b(@NonNull Configuration configuration, @NonNull C2417p c2417p) {
            configuration.setLocales((LocaleList) c2417p.f111302a.b());
        }
    }

    @NonNull
    public static C2417p a(@NonNull Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? C2417p.o(a.a(configuration)) : C2417p.a(configuration.locale);
    }

    public static void b(@NonNull Configuration configuration, @NonNull C2417p c2417p) {
        if (Build.VERSION.SDK_INT >= 24) {
            a.b(configuration, c2417p);
        } else {
            if (c2417p.f111302a.isEmpty()) {
                return;
            }
            configuration.setLocale(c2417p.f111302a.get(0));
        }
    }
}

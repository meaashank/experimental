package androidx.core.os;

import U0.C1281d;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.Y;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.core.os.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2417p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2417p f111301b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f111302a;

    /* JADX INFO: renamed from: androidx.core.os.p$a */
    @e.T(21)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Locale[] f111303a = {new Locale(z4.e.f241233j, "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale) {
            for (Locale locale2 : f111303a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        public static boolean c(@NonNull Locale locale, @NonNull Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String strC = C1281d.c(locale);
            if (!strC.isEmpty()) {
                return strC.equals(C1281d.c(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    /* JADX INFO: renamed from: androidx.core.os.p$b */
    @e.T(24)
    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public C2417p(r rVar) {
        this.f111302a = rVar;
    }

    @NonNull
    public static C2417p a(@NonNull Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? o(b.a(localeArr)) : new C2417p(new C2418q(localeArr));
    }

    public static Locale b(String str) {
        if (str.contains(com.prism.gaia.download.a.f164606q)) {
            String[] strArrSplit = str.split(com.prism.gaia.download.a.f164606q, -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split("_", -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException(android.support.v4.media.i.a("Can not parse language tag: [", str, "]"));
    }

    @NonNull
    public static C2417p c(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return f111301b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(strArrSplit[i10]);
        }
        return a(localeArr);
    }

    @NonNull
    @Y(min = 1)
    public static C2417p e() {
        return Build.VERSION.SDK_INT >= 24 ? o(b.b()) : a(Locale.getDefault());
    }

    @NonNull
    @Y(min = 1)
    public static C2417p f() {
        return Build.VERSION.SDK_INT >= 24 ? o(b.c()) : a(Locale.getDefault());
    }

    @NonNull
    public static C2417p g() {
        return f111301b;
    }

    @e.T(21)
    public static boolean k(@NonNull Locale locale, @NonNull Locale locale2) {
        return Build.VERSION.SDK_INT >= 33 ? LocaleList.matchesLanguageAndScript(locale, locale2) : a.c(locale, locale2);
    }

    @NonNull
    @e.T(24)
    public static C2417p o(@NonNull LocaleList localeList) {
        return new C2417p(new C2423w(localeList));
    }

    @e.T(24)
    @Deprecated
    public static C2417p p(Object obj) {
        return o(C2416o.a(obj));
    }

    @Nullable
    public Locale d(int i10) {
        return this.f111302a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2417p) && this.f111302a.equals(((C2417p) obj).f111302a);
    }

    @Nullable
    public Locale h(@NonNull String[] strArr) {
        return this.f111302a.c(strArr);
    }

    public int hashCode() {
        return this.f111302a.hashCode();
    }

    @e.D(from = -1)
    public int i(@Nullable Locale locale) {
        return this.f111302a.d(locale);
    }

    public boolean j() {
        return this.f111302a.isEmpty();
    }

    @e.D(from = 0)
    public int l() {
        return this.f111302a.size();
    }

    @NonNull
    public String m() {
        return this.f111302a.a();
    }

    @Nullable
    public Object n() {
        return this.f111302a.b();
    }

    @NonNull
    public String toString() {
        return this.f111302a.toString();
    }
}

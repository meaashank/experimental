package W0;

import android.icu.number.NumberFormatter;
import android.icu.number.UnlocalizedNumberFormatter;
import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.Calendar;
import android.icu.util.MeasureUnit;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import e.T;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
@T(21)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f76474a = "j";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f76475b = {"BS", "BZ", "KY", "PR", "PW", "US"};

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76476a;

        static {
            int[] iArr = new int[DateFormat.HourCycle.values().length];
            f76476a = iArr;
            try {
                iArr[DateFormat.HourCycle.HOUR_CYCLE_11.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f76476a[DateFormat.HourCycle.HOUR_CYCLE_12.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f76476a[DateFormat.HourCycle.HOUR_CYCLE_23.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f76476a[DateFormat.HourCycle.HOUR_CYCLE_24.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @T(24)
    public static class b {
        public static String a(@NonNull Locale locale) {
            return Calendar.getInstance(locale).getType();
        }

        public static Locale b() {
            return Locale.getDefault(Locale.Category.FORMAT);
        }
    }

    @T(33)
    public static class c {
        public static String a(@NonNull Locale locale) {
            return b(DateTimePatternGenerator.getInstance(locale).getDefaultHourCycle());
        }

        public static String b(DateFormat.HourCycle hourCycle) {
            int i10 = a.f76476a[hourCycle.ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "" : f.f76503e : f.f76502d : f.f76501c : f.f76500b;
        }

        public static String c(@NonNull Locale locale) {
            String identifier = ((UnlocalizedNumberFormatter) ((UnlocalizedNumberFormatter) NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(locale).format(1L).getOutputUnit().getIdentifier();
            return identifier.startsWith(g.f76507c) ? g.f76507c : identifier;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f76477a = "ca";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f76478b = "chinese";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f76479c = "dangi";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f76480d = "gregorian";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f76481e = "hebrew";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f76482f = "indian";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f76483g = "islamic";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f76484h = "islamic-civil";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f76485i = "islamic-rgsa";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f76486j = "islamic-tbla";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f76487k = "islamic-umalqura";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f76488l = "persian";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f76489m = "";

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface a {
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f76490a = "fw";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f76491b = "sun";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f76492c = "mon";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f76493d = "tue";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f76494e = "wed";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f76495f = "thu";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f76496g = "fri";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f76497h = "sat";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f76498i = "";

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface a {
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f76499a = "hc";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f76500b = "h11";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f76501c = "h12";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f76502d = "h23";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f76503e = "h24";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f76504f = "";

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface a {
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f76505a = "mu";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f76506b = "celsius";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f76507c = "fahrenhe";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f76508d = "kelvin";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f76509e = "";

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface a {
        }
    }

    public static String a(@NonNull Locale locale) {
        return p(java.util.Calendar.getInstance(locale).getFirstDayOfWeek());
    }

    public static String b(@NonNull Locale locale) {
        return android.text.format.DateFormat.getBestDateTimePattern(locale, "jm").contains("H") ? f.f76502d : f.f76501c;
    }

    @NonNull
    public static String c() {
        return f(true);
    }

    @NonNull
    public static String d(@NonNull Locale locale) {
        return e(locale, true);
    }

    @NonNull
    public static String e(@NonNull Locale locale, boolean z10) {
        String strV = v("ca", "", locale, z10);
        return strV != null ? strV : Build.VERSION.SDK_INT >= 24 ? b.a(locale) : z10 ? d.f76480d : "";
    }

    @NonNull
    public static String f(boolean z10) {
        return e(Build.VERSION.SDK_INT >= 24 ? b.b() : Locale.getDefault(), z10);
    }

    public static Locale g() {
        return Locale.getDefault();
    }

    @NonNull
    public static String h() {
        return k(true);
    }

    @NonNull
    public static String i(@NonNull Locale locale) {
        return j(locale, true);
    }

    @NonNull
    public static String j(@NonNull Locale locale, boolean z10) {
        String strV = v(e.f76490a, "", locale, z10);
        return strV != null ? strV : a(locale);
    }

    @NonNull
    public static String k(boolean z10) {
        return j(Build.VERSION.SDK_INT >= 24 ? b.b() : Locale.getDefault(), z10);
    }

    @NonNull
    public static String l() {
        return o(true);
    }

    @NonNull
    public static String m(@NonNull Locale locale) {
        return n(locale, true);
    }

    @NonNull
    public static String n(@NonNull Locale locale, boolean z10) {
        String strV = v(f.f76499a, "", locale, z10);
        return strV != null ? strV : Build.VERSION.SDK_INT >= 33 ? c.a(locale) : b(locale);
    }

    @NonNull
    public static String o(boolean z10) {
        return n(Build.VERSION.SDK_INT >= 24 ? b.b() : Locale.getDefault(), z10);
    }

    public static String p(int i10) {
        return (i10 < 1 || i10 > 7) ? "" : new String[]{e.f76491b, e.f76492c, e.f76493d, e.f76494e, e.f76495f, e.f76496g, e.f76497h}[i10 - 1];
    }

    public static String q(Locale locale) {
        return Arrays.binarySearch(f76475b, locale.getCountry()) >= 0 ? g.f76507c : g.f76506b;
    }

    @NonNull
    public static String r() {
        return u(true);
    }

    @NonNull
    public static String s(@NonNull Locale locale) {
        return t(locale, true);
    }

    @NonNull
    public static String t(@NonNull Locale locale, boolean z10) {
        String strV = v(g.f76505a, "", locale, z10);
        return strV != null ? strV : Build.VERSION.SDK_INT >= 33 ? c.c(locale) : q(locale);
    }

    @NonNull
    public static String u(boolean z10) {
        return t(Build.VERSION.SDK_INT >= 24 ? b.b() : Locale.getDefault(), z10);
    }

    public static String v(String str, String str2, Locale locale, boolean z10) {
        String unicodeLocaleType = locale.getUnicodeLocaleType(str);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (z10) {
            return null;
        }
        return str2;
    }
}

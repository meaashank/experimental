package q6;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Locale;
import z4.e;

/* JADX INFO: renamed from: q6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC5437a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f226819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f226820b;

    /* JADX INFO: renamed from: q6.a$a, reason: collision with other inner class name */
    public static class C0864a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AbstractC5437a f226821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AbstractC5437a f226822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AbstractC5437a f226823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final AbstractC5437a f226824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final AbstractC5437a f226825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final AbstractC5437a f226826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final AbstractC5437a f226827g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final AbstractC5437a f226828h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final AbstractC5437a f226829i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final AbstractC5437a f226830j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final AbstractC5437a f226831k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final AbstractC5437a f226832l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final AbstractC5437a f226833m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final AbstractC5437a f226834n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final AbstractC5437a f226835o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final AbstractC5437a f226836p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final AbstractC5437a f226837q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final AbstractC5437a f226838r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final AbstractC5437a f226839s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final AbstractC5437a f226840t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final AbstractC5437a f226841u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final AbstractC5437a f226842v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final AbstractC5437a f226843w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final AbstractC5437a f226844x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final AbstractC5437a f226845y;

        static {
            if (Build.VERSION.SDK_INT >= 24) {
                f226821a = new C5438b("_system", "", Resources.getSystem().getConfiguration().getLocales());
            } else {
                f226821a = new C5439c("_system", "", Resources.getSystem().getConfiguration().locale);
            }
            f226822b = new C5439c("ar", "العربية ", new Locale("ar"));
            f226823c = new C5439c("bn", "বাংলা", new Locale("bn"));
            f226824d = new C5439c(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "Deutsch", new Locale(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR));
            f226825e = new C5439c(e.f241233j, "English", new Locale(e.f241233j));
            f226826f = new C5439c("es", "Español", new Locale("es"));
            f226827g = new C5439c("fa", "فارسی", new Locale("fa"));
            f226828h = new C5439c("fr", "français", new Locale("fr"));
            f226829i = new C5439c("hi", "हिन्दी, हिंदी", new Locale("hi"));
            f226830j = new C5439c("id", "Bahasa Indonesia", new Locale("id"));
            f226831k = new C5439c("it", "Italiano", new Locale("it"));
            f226832l = new C5439c("ja", "日本語", new Locale("ja"));
            f226833m = new C5439c("km", "ខ្មែរ, ខេមរភាសា, ភាសាខ្មែរ", new Locale("km"));
            f226834n = new C5439c("ko", "조선말", new Locale("ko"));
            f226835o = new C5439c("lo", "ພາສາລາວ", new Locale("lo"));
            f226836p = new C5439c("ms", "بهاس ملايو", new Locale("ms"));
            f226837q = new C5439c("my", "ဗမာစာ", new Locale("my"));
            f226838r = new C5439c("pt", "Português", new Locale("pt"));
            f226839s = new C5439c("ru", "русский", new Locale("ru"));
            f226840t = new C5439c("th", "ไทย", new Locale("th"));
            f226841u = new C5439c("tl", "Wikang Tagalog", new Locale("tl"));
            f226842v = new C5439c("ur", "اردو", new Locale("ur"));
            f226843w = new C5439c("vi", "Việt Nam", new Locale("vi"));
            f226844x = new C5439c("zh-CN", "中文简体", new Locale("zh", "CN"));
            f226845y = new C5439c("zh-TW", "繁體中文", new Locale("zh", "TW"));
        }
    }

    public AbstractC5437a(String str, String str2) {
        this.f226819a = str;
        this.f226820b = str2;
    }

    public abstract String a();

    public String b() {
        return this.f226819a;
    }

    public String c(Context context) {
        return this.f226820b;
    }

    public abstract boolean d(@NonNull Locale locale);

    public abstract void e(Configuration configuration);
}

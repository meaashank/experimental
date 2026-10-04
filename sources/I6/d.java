package i6;

import android.os.Environment;
import com.prism.commons.utils.C3841e;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f202858a = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static String f202859a = "Android";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static String f202860b = "Music";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static String f202861c = "Podcasts";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static String f202862d = "Ringtones";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static String f202863e = "Alarms";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static String f202864f = "Notifications";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static String f202865g = "Pictures";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static String f202866h = "Movies";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static String f202867i = "Download";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static String f202868j = "DCIM";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static String f202869k = "Documents";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static String f202870l = "Screenshots";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static String f202871m = "Audiobooks";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static String f202872n = "Recordings";

        public static void b() {
            f202860b = Environment.DIRECTORY_MUSIC;
            f202861c = Environment.DIRECTORY_PODCASTS;
            f202862d = Environment.DIRECTORY_RINGTONES;
            f202863e = Environment.DIRECTORY_ALARMS;
            f202864f = Environment.DIRECTORY_NOTIFICATIONS;
            f202865g = Environment.DIRECTORY_PICTURES;
            f202866h = Environment.DIRECTORY_MOVIES;
            f202867i = Environment.DIRECTORY_DOWNLOADS;
            f202868j = Environment.DIRECTORY_DCIM;
            f202869k = Environment.DIRECTORY_DOCUMENTS;
            if (C3841e.w()) {
                f202870l = Environment.DIRECTORY_SCREENSHOTS;
                f202871m = Environment.DIRECTORY_AUDIOBOOKS;
            }
            if (C3841e.z()) {
                f202872n = Environment.DIRECTORY_RECORDINGS;
            }
        }
    }

    public static synchronized void a() {
        if (f202858a) {
            return;
        }
        a.b();
        f202858a = true;
    }
}

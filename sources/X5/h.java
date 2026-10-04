package X5;

import android.app.Activity;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class h implements V5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f76800b = "page_id";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f76801c = "duration_ms";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, Long> f76802a = new ConcurrentHashMap();

    @Override // V5.f
    public void a(Activity activity, String str) {
        this.f76802a.put(str, Long.valueOf(System.currentTimeMillis()));
        FirebaseAnalytics.getInstance(activity).setCurrentScreen(activity, str, null);
    }

    @Override // V5.f
    public void b(Activity activity, String str) {
        Long l10 = this.f76802a.get(str);
        if (l10 != null) {
            this.f76802a.remove(str);
            long jCurrentTimeMillis = System.currentTimeMillis() - l10.longValue();
            Bundle bundle = new Bundle();
            bundle.putString(f76800b, str);
            bundle.putLong(f76801c, jCurrentTimeMillis);
            FirebaseAnalytics.getInstance(activity).logEvent("event_page_view", bundle);
        }
    }
}

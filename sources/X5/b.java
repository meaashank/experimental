package X5;

import V5.c;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import bc.InterfaceC2857g;
import bc.InterfaceC2858h;
import com.google.firebase.analytics.FirebaseAnalytics;
import javax.inject.Singleton;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC2857g
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f76791a = "FirebaseAnalyticsApi";

    public class a implements V5.d {
        @Override // V5.d
        public void a(Context context, Bundle bundle) {
            Log.d(b.f76791a, "firebase initialize");
        }
    }

    /* JADX INFO: renamed from: X5.b$b, reason: collision with other inner class name */
    public class C0139b implements c.a {
        @Override // V5.c.a
        public V5.c a(Context context, String str) {
            FirebaseAnalytics firebaseAnalytics;
            try {
                firebaseAnalytics = FirebaseAnalytics.getInstance(context);
            } catch (Throwable th) {
                Log.e(b.f76791a, "FirebaseAnalytics getInstancce Error ", th);
                firebaseAnalytics = null;
            }
            return new g(firebaseAnalytics, str);
        }
    }

    @cc.e
    @Singleton
    @InterfaceC2858h
    public static V5.d a() {
        return new a();
    }

    @cc.e
    @Singleton
    @InterfaceC2858h
    public static V5.e b() {
        return new W5.b();
    }

    @cc.e
    @Singleton
    @InterfaceC2858h
    public static c.a c() {
        return new C0139b();
    }

    @cc.e
    @Singleton
    @InterfaceC2858h
    public static V5.f d() {
        return new h();
    }
}

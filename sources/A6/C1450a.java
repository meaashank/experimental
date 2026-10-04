package a6;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.prism.bugreport.commons.Bug;

/* JADX INFO: renamed from: a6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C1450a implements Z5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f84746a = "a";

    @Override // Z5.a
    public void a(Context context, Bug bug) {
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        firebaseCrashlytics.setUserId(bug.f161961f);
        firebaseCrashlytics.setCustomKey("PKG", bug.f161956a);
        firebaseCrashlytics.setCustomKey("type", bug.f161957b);
        firebaseCrashlytics.setCustomKey("PROCESS_NAME", bug.f161958c);
        Bundle bundle = bug.f161960e;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                firebaseCrashlytics.setCustomKey(str, "" + bug.f161960e.get(str));
            }
        }
        firebaseCrashlytics.recordException(bug.f161959d.getException());
        Log.d("crashlytics", "report bug on crashlytics");
    }

    @Override // Z5.a
    public void b(Context context) {
        FirebaseApp.initializeApp(context);
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);
    }

    @Override // Z5.a
    public void c(Context context, String str) {
        if (str != null) {
            try {
                FirebaseCrashlytics.getInstance().log(str);
                Log.d(f84746a, "report log: ".concat(str));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // Z5.a
    public void release() {
    }
}

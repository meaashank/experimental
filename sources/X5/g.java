package X5;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes5.dex */
public class g implements V5.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f76796d = "g";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f76797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FirebaseAnalytics f76798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f76799c = new Bundle();

    public g(FirebaseAnalytics firebaseAnalytics, String str) {
        this.f76797a = str;
        this.f76798b = firebaseAnalytics;
    }

    @Override // V5.c
    public V5.c a(int i10) {
        this.f76799c.putInt("value", i10);
        return this;
    }

    @Override // V5.c
    public void b() {
        FirebaseAnalytics firebaseAnalytics = this.f76798b;
        if (firebaseAnalytics == null) {
            Log.e(f76796d, "log failed FirebaseAnalytics is null");
            return;
        }
        try {
            firebaseAnalytics.logEvent(this.f76797a, this.f76799c);
        } catch (Exception e10) {
            Log.e(f76796d, "log failed", e10);
        }
    }

    @Override // V5.c
    public V5.c c(String str, String str2) {
        this.f76799c.putString(str, str2);
        return this;
    }

    @Override // V5.c
    public V5.c d(String str, boolean z10) {
        this.f76799c.putBoolean(str, z10);
        return this;
    }

    @Override // V5.c
    public V5.c e(String str, int i10) {
        this.f76799c.putInt(str, i10);
        return this;
    }
}

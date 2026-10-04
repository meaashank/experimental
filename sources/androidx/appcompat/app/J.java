package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.NonNull;
import e.W;
import e.f0;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public class J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f85373d = "TwilightManager";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f85374e = 6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f85375f = 22;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static J f85376g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f85377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f85378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f85379c = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f85380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f85381b;
    }

    @f0
    public J(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.f85377a = context;
        this.f85378b = locationManager;
    }

    public static J a(@NonNull Context context) {
        if (f85376g == null) {
            Context applicationContext = context.getApplicationContext();
            f85376g = new J(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f85376g;
    }

    @f0
    public static void f(J j10) {
        f85376g = j10;
    }

    @SuppressLint({"MissingPermission"})
    public final Location b() {
        Location locationC = B0.G.d(this.f85377a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = B0.G.d(this.f85377a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    @W(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final Location c(String str) {
        try {
            if (this.f85378b.isProviderEnabled(str)) {
                return this.f85378b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d(f85373d, "Failed to get last known location", e10);
            return null;
        }
    }

    public boolean d() {
        a aVar = this.f85379c;
        if (e()) {
            return aVar.f85380a;
        }
        Location locationB = b();
        if (locationB != null) {
            g(locationB);
            return aVar.f85380a;
        }
        Log.i(f85373d, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }

    public final boolean e() {
        return this.f85379c.f85381b > System.currentTimeMillis();
    }

    public final void g(@NonNull Location location) {
        long j10;
        a aVar = this.f85379c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        I iB = I.b();
        iB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        iB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = iB.f85372c == 1;
        long j11 = iB.f85371b;
        long j12 = iB.f85370a;
        iB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = iB.f85371b;
        if (j11 == -1 || j12 == -1) {
            j10 = jCurrentTimeMillis + com.prism.gaia.server.accounts.i.f166487l0;
        } else {
            if (jCurrentTimeMillis > j12) {
                j11 = j13;
            } else if (jCurrentTimeMillis > j11) {
                j11 = j12;
            }
            j10 = j11 + 60000;
        }
        aVar.f85380a = z10;
        aVar.f85381b = j10;
    }
}
